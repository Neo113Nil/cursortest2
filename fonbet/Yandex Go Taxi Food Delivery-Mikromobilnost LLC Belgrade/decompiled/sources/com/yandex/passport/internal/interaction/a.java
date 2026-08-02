package com.yandex.passport.internal.interaction;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.accounts.p;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.network.m;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.push.NotificationDismissedReceiver;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncingReceiver;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.DomikResultImpl;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment;
import com.yandex.passport.internal.ui.social.gimap.ExtAuthFailedException;
import com.yandex.passport.internal.ui.social.gimap.GimapError;
import com.yandex.passport.internal.ui.social.gimap.GimapIdentifierFragment;
import com.yandex.passport.internal.ui.social.gimap.GimapTrack;
import com.yandex.passport.internal.ui.social.gimap.MailProvider;
import com.yandex.passport.internal.ui.social.gimap.g;
import com.yandex.passport.internal.ui.social.gimap.o;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.usecase.ui.f0;
import defpackage.sa90;
import defpackage.uc20;
import defpackage.wls;
import java.io.IOException;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GimapError gimapError;
        MailProvider c;
        p pVar;
        AnalyticsFromValue analyticsFromValue;
        int i = 0;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                AuthTrack authTrack = (AuthTrack) this.c;
                try {
                    DomikResultImpl a = ((com.yandex.passport.internal.helper.f) bVar.e).a(authTrack.requireTrackId(), authTrack.requireEnvironment());
                    bVar.c.m(Boolean.FALSE);
                    ((wls) bVar.f).invoke(authTrack, a);
                    return;
                } catch (Throwable th) {
                    bVar.c.m(Boolean.FALSE);
                    ((a0) bVar.g).invoke(bVar.d.a(th));
                    return;
                }
            case 1:
                d dVar = (d) this.b;
                GimapTrack gimapTrack = (GimapTrack) this.c;
                dVar.getClass();
                try {
                    c = MailProvider.c(gimapTrack.getEmailDomain());
                    pVar = dVar.d;
                } catch (ExtAuthFailedException e) {
                    if (e.suggestedProvider != null) {
                        p pVar2 = dVar.d;
                        String email = gimapTrack.getEmail();
                        email.getClass();
                        ((o) pVar2.a).D.m(new sa90(email, e.suggestedProvider));
                        return;
                    }
                    com.yandex.passport.internal.ui.social.gimap.b bVar2 = e.serversHint;
                    if (bVar2 != null) {
                        o oVar = (o) dVar.d.a;
                        synchronized (oVar) {
                            oVar.E = oVar.E.applyHint(bVar2);
                        }
                    }
                    String message = e.getMessage();
                    GimapError[] values = GimapError.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            gimapError = values[i];
                            if (!gimapError.errorMessage.equals(message)) {
                                i++;
                            }
                        } else {
                            gimapError = null;
                        }
                    }
                    if (gimapError != GimapError.SMTP_INCOMPLETE_PARAMS) {
                        p pVar3 = dVar.d;
                        if (gimapError != null) {
                            ((com.yandex.passport.internal.ui.social.gimap.a) pVar3.b).b0(gimapError);
                        } else {
                            ((com.yandex.passport.internal.ui.social.gimap.a) pVar3.b).B.g(e);
                        }
                    }
                    dVar.b.m(new EventError(e.getMessage(), e));
                } catch (IOException e2) {
                    ((com.yandex.passport.internal.ui.social.gimap.a) dVar.d.b).B.g(e2);
                    dVar.b.m(new EventError("network error", e2));
                } catch (Throwable th2) {
                    ((com.yandex.passport.internal.ui.social.gimap.a) dVar.d.b).B.g(th2);
                    dVar.b.m(new EventError(GimapError.UNKNOWN_ERROR.errorMessage, th2));
                }
                if (c != null) {
                    String email2 = gimapTrack.getEmail();
                    email2.getClass();
                    ((o) pVar.a).D.m(new sa90(email2, c));
                    return;
                } else {
                    dVar.d.f(((com.yandex.passport.internal.ui.social.gimap.a) pVar.b).a0(gimapTrack), gimapTrack);
                    dVar.c.m(Boolean.FALSE);
                    return;
                }
            case 2:
                e eVar = (e) this.b;
                RegTrack regTrack = (RegTrack) this.c;
                try {
                    com.yandex.passport.internal.helper.f fVar = eVar.d;
                    Environment requireEnvironment = regTrack.requireEnvironment();
                    String requireTrackId = regTrack.requireTrackId();
                    String requirePhoneNumber = regTrack.requirePhoneNumber();
                    ClientCredentials r = fVar.b.r(requireEnvironment);
                    if (r == null) {
                        throw new PassportCredentialsNotFoundException(com.yandex.passport.internal.util.p.y(requireEnvironment));
                    }
                    com.yandex.passport.internal.network.response.e eVar2 = (com.yandex.passport.internal.network.response.e) m.a(fVar.d, new f0(requireEnvironment, requireTrackId, r.getDecryptedId()));
                    AnalyticsFromValue.Companion.getClass();
                    analyticsFromValue = AnalyticsFromValue.PHONISH;
                    ModernAccount h = fVar.c.h(requireEnvironment, eVar2, requirePhoneNumber, analyticsFromValue);
                    com.yandex.passport.internal.ui.domik.o oVar2 = DomikResult.Companion;
                    ClientToken clientToken = eVar2.c;
                    PassportLoginAction fromAction = analyticsFromValue.getFromAction();
                    EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
                    oVar2.getClass();
                    eVar.f.invoke(regTrack, new DomikResultImpl(h, clientToken, fromAction, null, noneOf, 8, null));
                    return;
                } catch (Throwable th3) {
                    eVar.b.m(eVar.e.a(th3));
                    eVar.c.m(Boolean.FALSE);
                    return;
                }
            case 3:
                NotificationDismissedReceiver.onReceive$lambda$3((Intent) this.b, (BroadcastReceiver.PendingResult) this.c);
                return;
            case 4:
                SsoAnnouncingReceiver.onReceive$lambda$7((String) this.b, (BroadcastReceiver.PendingResult) this.c);
                return;
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.b;
                LinearLayoutBuilder linearLayoutBuilder = (LinearLayoutBuilder) this.c;
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                int i2 = rect.top;
                int i3 = (int) (14.0f * uc20.a.density);
                rect.top = i2 - i3;
                rect.bottom += i3;
                linearLayoutBuilder.setTouchDelegate(new TouchDelegate(rect, viewGroup));
                return;
            case 6:
                LinearLayout linearLayout = (LinearLayout) this.b;
                com.yandex.passport.internal.ui.common.d dVar2 = (com.yandex.passport.internal.ui.common.d) this.c;
                linearLayout.setVisibility(0);
                u.j(dVar2.E.w);
                return;
            case 7:
                BaseUsernameInputFragment.showFieldError$lambda$5((BaseUsernameInputFragment) this.b, (TextView) this.c);
                return;
            default:
                g gVar = (g) this.b;
                String str = (String) this.c;
                l lVar = gVar.b;
                c0 c0Var = gVar.B;
                o oVar3 = gVar.A;
                try {
                    MailProvider c2 = MailProvider.c(GimapTrack.extractEmailDomain(str));
                    if (c2 == null) {
                        c2 = gVar.E.f(str, oVar3.A);
                    }
                    if (c2 != MailProvider.OTHER) {
                        oVar3.D.m(new sa90(str, c2));
                    } else {
                        gVar.D.m(GimapIdentifierFragment.State.LOGIN);
                    }
                } catch (IOException e3) {
                    c0Var.g(e3);
                    lVar.m(new EventError("network error", e3));
                } catch (Throwable th4) {
                    c0Var.g(th4);
                    lVar.m(new EventError(GimapError.UNKNOWN_ERROR.errorMessage, th4));
                }
                gVar.c.m(Boolean.FALSE);
                return;
        }
    }
}
