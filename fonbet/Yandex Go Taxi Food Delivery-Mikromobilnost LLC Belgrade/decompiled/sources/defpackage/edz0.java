package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.view.EmojiDrawable;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.domain.statuses.StatusIconType;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.domain.user.DeletedShownStatus;
import com.yandex.messaging.domain.user.a;
import com.yandex.messaging.ui.timeline.g;
import java.util.Arrays;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class edz0 implements yp11 {
    public static final /* synthetic */ kgx[] a0 = {new MutablePropertyReference1Impl("typingDisposable", 0, "getTypingDisposable()Lcom/yandex/alicekit/core/Disposable;", edz0.class), oyr.B(qoi0.a, edz0.class, "participantsCountDisposable", "getParticipantsCountDisposable()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final nat A;
    public final set B;
    public final zx6 C;
    public final e D;
    public final a E;
    public final h3y F;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public j3b M;
    public boolean R;
    public int T;
    public final ike U;
    public final ike V;
    public final i3y W;
    public final i3y Z;
    public final Activity a;
    public final ChatRequest b;
    public final g c;
    public final p9t w;
    public final y6t x;
    public final zp11 y;
    public final wg90 z;
    public String G = "";
    public final qp3 N = new qp3();
    public final qp3 O = new qp3();
    public String P = "";
    public String Q = "";
    public CharSequence S = "";

    public edz0(Activity activity, ChatRequest chatRequest, g gVar, p9t p9tVar, y6t y6tVar, zp11 zp11Var, wg90 wg90Var, vse vseVar, nat natVar, set setVar, zx6 zx6Var, e eVar, a aVar, h3y h3yVar) {
        this.a = activity;
        this.b = chatRequest;
        this.c = gVar;
        this.w = p9tVar;
        this.x = y6tVar;
        this.y = zp11Var;
        this.z = wg90Var;
        this.A = natVar;
        this.B = setVar;
        this.C = zx6Var;
        this.D = eVar;
        this.E = aVar;
        this.F = h3yVar;
        final int i = 0;
        this.U = asb1.d(vseVar.c(false));
        final int i2 = 1;
        this.V = asb1.d(vseVar.c(true));
        this.W = kotlin.a.a(new sls(this) { // from class: ddz0
            public final /* synthetic */ edz0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                edz0 edz0Var = this.b;
                switch (i3) {
                    case 0:
                        return AnimatedVectorDrawableCompat.create(edz0Var.a, wwg0.msg_anim_connection_progress_chat);
                    default:
                        return AnimatedVectorDrawableCompat.create(edz0Var.a, wwg0.msg_anim_typing);
                }
            }
        });
        this.Z = kotlin.a.a(new sls(this) { // from class: ddz0
            public final /* synthetic */ edz0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                edz0 edz0Var = this.b;
                switch (i3) {
                    case 0:
                        return AnimatedVectorDrawableCompat.create(edz0Var.a, wwg0.msg_anim_connection_progress_chat);
                    default:
                        return AnimatedVectorDrawableCompat.create(edz0Var.a, wwg0.msg_anim_typing);
                }
            }
        });
    }

    public static final void a(edz0 edz0Var, r0k r0kVar, DeletedShownStatus deletedShownStatus) {
        g gVar = edz0Var.c;
        e370 e370Var = r0kVar.b;
        gVar.M = deletedShownStatus;
        gu21 gu21Var = r0kVar.a;
        du21 du21Var = gu21Var instanceof du21 ? (du21) gu21Var : null;
        String str = du21Var != null ? du21Var.d : null;
        StatusIconType statusIconType = du21Var != null ? du21Var.f : null;
        w6t w6tVar = gVar.A;
        w6tVar.getClass();
        Activity activity = w6tVar.a;
        Integer k = v891.k(deletedShownStatus);
        String string = k != null ? activity.getResources().getString(k.intValue()) : null;
        if (string == null) {
            if (deletedShownStatus == DeletedShownStatus.EmptyStatus) {
                string = null;
            } else {
                Integer k2 = v891.k(deletedShownStatus);
                string = k2 != null ? activity.getResources().getString(k2.intValue()) : null;
                if (string == null) {
                    string = gu21Var != null ? gu21Var.b(activity.getResources()) : null;
                }
                String a = w6tVar.b.a(activity, e370Var.b);
                boolean z = e370Var.a;
                if (z && !(gu21Var instanceof du21)) {
                    if ((gu21Var != null ? gu21Var.a : null) == StatusAvailability.Default && deletedShownStatus == DeletedShownStatus.NormalStatus) {
                        a = null;
                    }
                }
                if (z && string != null) {
                    a = null;
                }
                if (string != null && a != null) {
                    string = g8e.p(string, " · ", a);
                } else if (string == null) {
                    string = a;
                }
            }
        }
        gVar.H = string;
        gVar.I = str != null ? new EmojiDrawable(str, gVar.D.getTextSize() - kjs0.b(2)) : null;
        gVar.J = statusIconType;
        gVar.r(gVar.H);
        gVar.s(gVar.I, gVar.J);
        gVar.F.updateDisplayUserStatus(r0kVar);
        edz0Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0072, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Long l) {
        String str;
        String string;
        if (l != null) {
            long longValue = l.longValue();
            Resources resources = this.a.getResources();
            String string2 = resources.getString(oyh0.chat_status_response_time);
            int i = (int) longValue;
            if (i < 60) {
                string = resources.getString(oyh0.chat_status_response_time_seconds, Integer.valueOf(i));
            } else {
                int i2 = i / 60;
                if (i2 < 60) {
                    string = resources.getString(oyh0.chat_status_response_time_minutes, Integer.valueOf(i2));
                } else {
                    int i3 = i2 / 60;
                    if (i3 < 24) {
                        string = resources.getString(oyh0.chat_status_response_time_hours, Integer.valueOf(i3));
                    } else {
                        int i4 = i3 / 24;
                        string = i4 < 7 ? resources.getString(oyh0.chat_status_response_time_days, Integer.valueOf(i4)) : null;
                    }
                }
            }
            str = string != null ? String.format("%s %s", Arrays.copyOf(new Object[]{string2, string}, 2)) : null;
        }
        str = "";
        this.P = str;
        c();
    }

    public final void c() {
        boolean J = evu0.J(this.Q);
        Activity activity = this.a;
        g gVar = this.c;
        if (!J) {
            if (!this.R) {
                gVar.r(this.Q);
                return;
            }
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) this.W.getValue();
            if (animatedVectorDrawableCompat == null) {
                return;
            }
            String str = this.Q;
            int i = fxa1.c(jng0.messagingToolbarStatusTextColor, activity).data;
            gVar.r(str);
            TextView textView = gVar.E;
            textView.setTextColor(i);
            textView.setCompoundDrawablesWithIntrinsicBounds(animatedVectorDrawableCompat, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(kjs0.b(4));
            animatedVectorDrawableCompat.start();
            return;
        }
        if (!evu0.J(this.G)) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = (AnimatedVectorDrawableCompat) this.Z.getValue();
            if (animatedVectorDrawableCompat2 == null) {
                return;
            }
            String str2 = this.G;
            int i2 = fxa1.c(jng0.messagingCommonTextSecondaryColor, activity).data;
            gVar.r(str2);
            TextView textView2 = gVar.E;
            textView2.setTextColor(i2);
            textView2.setCompoundDrawablesWithIntrinsicBounds(animatedVectorDrawableCompat2, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(kjs0.b(2));
            animatedVectorDrawableCompat2.start();
            return;
        }
        j3b j3bVar = this.M;
        if (j3bVar != null && j3bVar.J) {
            gVar.r(this.S);
            return;
        }
        if (!evu0.J(this.P)) {
            gVar.r(this.P);
            return;
        }
        if (this.J || this.I || this.H == 0) {
            gVar.r(gVar.H);
            gVar.s(gVar.I, gVar.J);
            return;
        }
        int i3 = this.K ? ewh0.channel_subscribers_plural : ewh0.chat_members_plural;
        Resources resources = gVar.C.getResources();
        int i4 = this.H;
        String quantityString = resources.getQuantityString(i3, i4, Integer.valueOf(i4));
        Resources resources2 = gVar.C.getResources();
        int i5 = ewh0.toolbar_num_organizations;
        int i6 = this.T;
        String quantityString2 = resources2.getQuantityString(i5, i6, Integer.valueOf(i6));
        if (this.T > 1) {
            quantityString = g8e.p(quantityString, " · ", quantityString2);
        }
        gVar.r(quantityString);
    }

    @Override // defpackage.yp11
    public final void f(String str) {
        this.G = str;
        c();
    }
}
