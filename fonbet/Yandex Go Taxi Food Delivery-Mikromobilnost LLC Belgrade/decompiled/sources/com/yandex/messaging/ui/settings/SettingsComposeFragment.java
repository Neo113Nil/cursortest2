package com.yandex.messaging.ui.settings;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.r;
import com.yandex.auth.LegacyAccountType;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.SavedMessages;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import com.yandex.messaging.ui.onboarding.OnboardingShowingType;
import com.yandex.messaging.ui.settings.theme.ThemeVariant;
import defpackage.acg;
import defpackage.afr0;
import defpackage.aii0;
import defpackage.b00;
import defpackage.b0x;
import defpackage.bbj;
import defpackage.bfr0;
import defpackage.bts;
import defpackage.bvu0;
import defpackage.ccg;
import defpackage.cfr0;
import defpackage.clb1;
import defpackage.dfr0;
import defpackage.did;
import defpackage.dq80;
import defpackage.efr0;
import defpackage.eq80;
import defpackage.f2b;
import defpackage.f530;
import defpackage.faj;
import defpackage.fat0;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gj60;
import defpackage.gm51;
import defpackage.gtq0;
import defpackage.h4f0;
import defpackage.hs31;
import defpackage.i7r0;
import defpackage.j47;
import defpackage.j7r0;
import defpackage.jjo;
import defpackage.jww;
import defpackage.jwy0;
import defpackage.jxr;
import defpackage.k020;
import defpackage.k170;
import defpackage.k1w;
import defpackage.k620;
import defpackage.kt11;
import defpackage.kwy0;
import defpackage.lnr0;
import defpackage.lwy0;
import defpackage.mwy0;
import defpackage.n520;
import defpackage.noh;
import defpackage.ny61;
import defpackage.nyh0;
import defpackage.nz;
import defpackage.o430;
import defpackage.oo31;
import defpackage.ooc;
import defpackage.ovg;
import defpackage.pdr0;
import defpackage.ph70;
import defpackage.pkz;
import defpackage.q1z;
import defpackage.q6b;
import defpackage.q6v;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qx4;
import defpackage.r5b0;
import defpackage.r720;
import defpackage.rcy0;
import defpackage.rde;
import defpackage.rk80;
import defpackage.rs31;
import defpackage.sb1;
import defpackage.sfl0;
import defpackage.sk7;
import defpackage.so4;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u3a1;
import defpackage.u4;
import defpackage.v7p;
import defpackage.vfc;
import defpackage.vi3;
import defpackage.vl7;
import defpackage.vng;
import defpackage.vqb1;
import defpackage.w4;
import defpackage.w511;
import defpackage.w6r0;
import defpackage.w8f;
import defpackage.wer0;
import defpackage.wrr;
import defpackage.x22;
import defpackage.x4b0;
import defpackage.xat;
import defpackage.xer0;
import defpackage.xg0;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.yer0;
import defpackage.yh3;
import defpackage.yr31;
import defpackage.yz10;
import defpackage.zbg;
import defpackage.zer0;
import defpackage.zwv;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.startup.StartupRequest;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b)\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+¨\u0006."}, d2 = {"Lcom/yandex/messaging/ui/settings/SettingsComposeFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lw6r0;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lcom/yandex/messaging/ui/settings/f;", "settingsViewModel", "Ljwy0;", "themeViewModel", "Lcom/yandex/messaging/ui/settings/e;", "organizationsViewModel", "Lzy11;", "SettingsScreenRoot", "(Lf530;Lcom/yandex/messaging/ui/settings/f;Ljwy0;Lcom/yandex/messaging/ui/settings/e;Lfid;II)V", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "Companion", "i7r0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SettingsComposeFragment extends ComposeMessengerFragment<w6r0> {
    public static final int $stable = 8;
    private static final String ANDROID_MESSENGER_PROFILE_PAGE = "android_messenger_profile_page";
    public static final i7r0 Companion = new i7r0();
    private static final int REQUEST_CODE_LOGIN = 2571;
    private final noh profileComponentAsync;

    public SettingsComposeFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    private final void SettingsScreenRoot(f530 f530Var, f fVar, jwy0 jwy0Var, e eVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1115860070);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && btsVar.e(fVar)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && btsVar.e(jwy0Var)) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= ((i2 & 8) == 0 && btsVar.e(eVar)) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(this) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new xg0(this, f530Var, fVar, jwy0Var, eVar, i, i2, 14);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) == 0 || btsVar.C()) {
            int i4 = i2 & 2;
            o430 o430Var = did.a;
            if (i4 != 0) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e || Q == o430Var) {
                    Q = new w4(a, 23);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(f.class), b, null, vfc.h(f.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
            }
            if ((i2 & 4) != 0) {
                btsVar.e0(-897180073);
                rs31 b2 = jjo.b(btsVar);
                hs31 a2 = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e2 = btsVar.e(a2);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new w4(a2, 24);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                yr31 G2 = ooc.G(qoi0.a(jwy0.class), b2, null, vfc.h(jwy0.class, new zwv(), (tls) Q2), b2 instanceof q7u ? ((q7u) b2).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
            }
            if ((i2 & 8) != 0) {
                btsVar.e0(-897180073);
                rs31 b3 = jjo.b(btsVar);
                hs31 a3 = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e3 = btsVar.e(a3);
                Object Q3 = btsVar.Q();
                if (e3 || Q3 == o430Var) {
                    Q3 = new w4(a3, 25);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                yr31 G3 = ooc.G(qoi0.a(e.class), b3, null, vfc.h(e.class, new zwv(), (tls) Q3), b3 instanceof q7u ? ((q7u) b3).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    private static final zy11 SettingsScreenRoot$lambda$1$lambda$0(tse tseVar, sfl0 sfl0Var, yh3 yh3Var, pkz pkzVar, efr0 efr0Var) {
        if (efr0Var.equals(dfr0.a)) {
            tje.N(tseVar, null, null, new SettingsComposeFragment$SettingsScreenRoot$1$1$1(2, null), 3);
        } else if (efr0Var instanceof yer0) {
            ((b0x) sfl0Var).b(((yer0) efr0Var).a);
        } else if (efr0Var instanceof cfr0) {
            sfl0.a(sfl0Var, ((cfr0) efr0Var).a, 6);
        } else if (efr0Var instanceof wer0) {
            yh3.a(yh3Var, REQUEST_CODE_LOGIN, ANDROID_MESSENGER_PROFILE_PAGE);
        } else if (efr0Var instanceof afr0) {
            sfl0Var.getClass();
        } else if (efr0Var.equals(zer0.a)) {
            sfl0Var.getClass();
        } else if (efr0Var.equals(bfr0.a)) {
            sfl0Var.getClass();
        } else {
            if (!(efr0Var instanceof xer0)) {
                w511.b();
                return null;
            }
            sfl0Var.getClass();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final zy11 SettingsScreenRoot$lambda$15$lambda$14$lambda$13(e eVar, jwy0 jwy0Var, f fVar, sfl0 sfl0Var, String str, j47 j47Var) {
        Map map;
        Object value;
        ThemeVariant themeVariant;
        boolean z;
        Object value2;
        SettingsButtonId.Companion.getClass();
        map = SettingsButtonId.map;
        SettingsButtonId settingsButtonId = (SettingsButtonId) map.get(str);
        int i = 2;
        final int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i3 = 1;
        switch (settingsButtonId == null ? -1 : j7r0.a[settingsButtonId.ordinal()]) {
            case -1:
                Long m = bvu0.m(10, str);
                if (m == null) {
                    eVar.getClass();
                    break;
                } else {
                    List list = ((r5b0) eVar.D.a.getValue()).a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((rk80) it.next()).a == m.longValue()) {
                                b00 b00Var = eVar.z;
                                ((Handler) b00Var.a.get()).post(new nz(b00Var, m.longValue(), OrganizationChangeSource.Profile, 0));
                                yz10 yz10Var = eVar.A;
                                Parcelable.Creator<OnboardingShowingType> creator = OnboardingShowingType.CREATOR;
                                if (yz10Var.c.getValue() != null) {
                                    ny61.u();
                                    return null;
                                }
                            }
                        }
                    }
                }
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                r0 r0Var = jwy0Var.b;
                do {
                    value = r0Var.getValue();
                    kwy0 kwy0Var = (kwy0) value;
                    kwy0Var.getClass();
                    themeVariant = (3 & 2) != 0 ? kwy0Var.a : null;
                    z = (3 & 4) != 0 ? kwy0Var.b : true;
                    kwy0Var.getClass();
                } while (!r0Var.k(value, new kwy0(themeVariant, z)));
            case 2:
                r0 r0Var2 = fVar.G;
                boolean z2 = !((pdr0) r0Var2.getValue()).a;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, pdr0.a((pdr0) value2, z2, false, false, false, null, null, null, false, false, 524286)));
                oo31.n(fVar.b, "compact_chat_list_mode_on", z2);
                break;
            case 3:
                if (!fVar.E.w) {
                    boolean d = clb1.d(fVar.c);
                    wrr wrrVar = fVar.x;
                    if (!d) {
                        String str2 = !((k020) wrrVar.x).v() ? "4de3dd08-46fb-9d1b-6e6a-87ee9f390e3f" : null;
                        if (str2 != null) {
                            fVar.X(new cfr0(new q6b(n520.d, new PrivateChat(str2, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, null, null, 2097148)));
                            break;
                        }
                    } else {
                        String str3 = (String) wrrVar.A;
                        q6v q6vVar = (q6v) wrrVar.w;
                        bbj bbjVar = (bbj) wrrVar.c;
                        Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                        k020 k020Var = (k020) wrrVar.x;
                        if (k020Var.b.T()) {
                            x4b0 A = k020Var.A();
                            if ((A != null ? A.e : null) != null) {
                                buildUpon.appendQueryParameter(LegacyAccountType.STRING_LOGIN, A.e);
                            }
                        }
                        bbjVar.getClass();
                        buildUpon.appendQueryParameter("os", "android " + String.valueOf(Build.VERSION.SDK_INT));
                        gm51 gm51Var = (gm51) q6vVar;
                        buildUpon.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, AppMetricaYandex.getDeviceId(gm51Var.a));
                        buildUpon.appendQueryParameter("u-uid", AppMetricaYandex.getUuid(gm51Var.a));
                        buildUpon.appendQueryParameter(StartupRequest.PARAM_APP_VERSION, vqb1.d(bbjVar.a));
                        buildUpon.appendQueryParameter("device", Build.MANUFACTURER + " " + Build.MODEL);
                        fVar.X(new yer0(buildUpon.build().toString()));
                        break;
                    }
                } else {
                    fVar.X(bfr0.a);
                    break;
                }
                break;
            case 4:
                wrr wrrVar2 = fVar.x;
                Context context = (Context) wrrVar2.b;
                fVar.X(new yer0(((rcy0) wrrVar2.z).w ? context.getResources().getString(nyh0.tm_help_url_template, context.getResources().getString(nyh0.tm_language)) : clb1.d((MessengerEnvironment) wrrVar2.y) ? context.getResources().getString(nyh0.messenger_profile_support_info_team_url) : context.getResources().getString(nyh0.messenger_profile_support_info_url)));
                break;
            case 5:
                final sk7 sk7Var = fVar.F;
                sk7Var.getClass();
                if (((String) sk7Var.j(new tls() { // from class: i3c
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        boolean z3 = false;
                        sk7 sk7Var2 = sk7Var;
                        f3c f3cVar = (f3c) obj;
                        switch (i4) {
                            case 0:
                                f3c f3cVar2 = (f3c) sk7Var2.c;
                                f3cVar2.getClass();
                                try {
                                    f3cVar2.b().clearPrimaryClip();
                                    z3 = true;
                                } catch (RemoteException unused) {
                                }
                                return Boolean.valueOf(z3);
                            default:
                                ClipData primaryClip = f3cVar.b().getPrimaryClip();
                                if (primaryClip == null) {
                                    return null;
                                }
                                String string = ((r4t) sk7Var2.w).a.getString("last_join_clipboard_link", null);
                                int itemCount = primaryClip.getItemCount();
                                for (int i5 = 0; i5 < itemCount; i5++) {
                                    String obj2 = primaryClip.getItemAt(i5).coerceToText((Context) sk7Var2.b).toString();
                                    if (!jl40.l(string, obj2) && cqy.c(obj2)) {
                                        return obj2;
                                    }
                                }
                                return null;
                        }
                    }
                })) != null) {
                    sk7Var.j(new tls() { // from class: i3c
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i4 = i2;
                            boolean z3 = false;
                            sk7 sk7Var2 = sk7Var;
                            f3c f3cVar = (f3c) obj;
                            switch (i4) {
                                case 0:
                                    f3c f3cVar2 = (f3c) sk7Var2.c;
                                    f3cVar2.getClass();
                                    try {
                                        f3cVar2.b().clearPrimaryClip();
                                        z3 = true;
                                    } catch (RemoteException unused) {
                                    }
                                    return Boolean.valueOf(z3);
                                default:
                                    ClipData primaryClip = f3cVar.b().getPrimaryClip();
                                    if (primaryClip == null) {
                                        return null;
                                    }
                                    String string = ((r4t) sk7Var2.w).a.getString("last_join_clipboard_link", null);
                                    int itemCount = primaryClip.getItemCount();
                                    for (int i5 = 0; i5 < itemCount; i5++) {
                                        String obj2 = primaryClip.getItemAt(i5).coerceToText((Context) sk7Var2.b).toString();
                                        if (!jl40.l(string, obj2) && cqy.c(obj2)) {
                                            return obj2;
                                        }
                                    }
                                    return null;
                            }
                        }
                    });
                }
                fVar.X(dfr0.a);
                break;
            case 6:
                new gj60(k620.d);
                sfl0Var.getClass();
                break;
            case 7:
                new ovg(k620.d);
                sfl0Var.getClass();
                break;
            case 8:
                sfl0.a(sfl0Var, new q6b(k620.d, SavedMessages.INSTANCE, null, null, null, 2097148), 6);
                break;
            case 9:
                new jxr(k620.d);
                sfl0Var.getClass();
                break;
            case 10:
                new u4(k620.d);
                sfl0Var.getClass();
                break;
            case 11:
                new h4f0(k620.d, false);
                sfl0Var.getClass();
                break;
            case 12:
                new rde(k620.d);
                sfl0Var.getClass();
                break;
            case 13:
                fVar.X(wer0.a);
                break;
            case 14:
                fVar.X(new yer0(fVar.c.b()));
                break;
            case 15:
                if (((pdr0) fVar.H.a.getValue()).l == null && !fVar.y.c()) {
                    fVar.X(new xer0(new vi3(k620.d, MessagingAction.OpenSettings.a, true)));
                    break;
                } else {
                    fVar.X(new yer0("https://id.yandex.ru/security/phones"));
                    break;
                }
                break;
            case 16:
                ((x22) fVar.D.b).reportEvent("open_invite_link_click");
                fVar.X(new afr0(new jww(k620.d)));
                break;
            case 17:
                new vl7(k620.d);
                sfl0Var.getClass();
                break;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 SettingsScreenRoot$lambda$18(SettingsComposeFragment settingsComposeFragment, f530 f530Var, f fVar, jwy0 jwy0Var, e eVar, int i, int i2, fid fidVar, int i3) {
        settingsComposeFragment.SettingsScreenRoot(f530Var, fVar, jwy0Var, eVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private static final zy11 SettingsScreenRoot$lambda$3$lambda$2(SettingsComposeFragment settingsComposeFragment, mwy0 mwy0Var) {
        if (mwy0Var.equals(lwy0.a)) {
            settingsComposeFragment.getActivity().recreate();
            return zy11.a;
        }
        w511.b();
        return null;
    }

    private static final zy11 SettingsScreenRoot$lambda$5$lambda$4(sfl0 sfl0Var, eq80 eq80Var) {
        if (!eq80Var.equals(dq80.a)) {
            w511.b();
            return null;
        }
        new k170(k620.d, MessagingAction.Profile.a, OnboardingShowingType.OrganizationSwitch);
        sfl0Var.getClass();
        return zy11.a;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1279723352);
        SettingsScreenRoot(u3a1.d(f530Var, "messenger_settings_screen"), null, null, null, btsVar, (i << 9) & HProv.ALG_CLASS_ALL, 14);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        SettingsComposeFragment$getViewModelFactory$1 settingsComposeFragment$getViewModelFactory$1;
        int i;
        SettingsComposeFragment settingsComposeFragment = this;
        if (continuation instanceof SettingsComposeFragment$getViewModelFactory$1) {
            settingsComposeFragment$getViewModelFactory$1 = (SettingsComposeFragment$getViewModelFactory$1) continuation;
            int i2 = settingsComposeFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsComposeFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsComposeFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsComposeFragment$getViewModelFactory$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = settingsComposeFragment.profileComponentAsync;
                    settingsComposeFragment$getViewModelFactory$1.L$0 = settingsComposeFragment;
                    settingsComposeFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(settingsComposeFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    settingsComposeFragment = (SettingsComposeFragment) settingsComposeFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((w6r0) settingsComposeFragment.getArguments()).getClass();
                ybg ybgVar = ccgVar.L;
                faj fajVar = new faj(ybgVar, i3);
                zbg zbgVar = ccgVar.k0;
                zbg zbgVar2 = ccgVar.F;
                acg acgVar = ccgVar.X;
                acg acgVar2 = ccgVar.s;
                ph70 ph70Var = new ph70((xvf0) ybgVar, (v7p) fajVar, (xvf0) zbgVar, (xvf0) zbgVar2, (xvf0) acgVar, (xvf0) acgVar2, 5);
                xat xatVar = new xat(ybgVar, i3);
                ybg ybgVar2 = ccgVar.m;
                k1w k1wVar = new k1w(ybgVar2, 9);
                f2b f2bVar = new f2b(ybgVar, ccgVar.S, new k1w(ccgVar.r0, 19), 6);
                acg acgVar3 = ccgVar.o;
                zbg zbgVar3 = ccgVar.f;
                ybg ybgVar3 = ccgVar.h;
                acg acgVar4 = ccgVar.c0;
                ybg ybgVar4 = ccgVar.g;
                zbg zbgVar4 = ccgVar.e0;
                ybg ybgVar5 = ccgVar.y;
                zbg zbgVar5 = ccgVar.t;
                qx4 qx4Var = new qx4(acgVar3, acgVar, zbgVar3, ybgVar3, acgVar4, ph70Var, ybgVar4, zbgVar4, ybgVar5, zbgVar5, xatVar, ybgVar2, k1wVar, acgVar2, f2bVar);
                sb1 sb1Var = new sb1(acgVar3, ccgVar.h0, ccgVar.t0, ccgVar.r, zbgVar5, ccgVar.u0, ccgVar.s0, 24);
                fat0 fat0Var = new fat0(zbgVar3, ccgVar.v0, 26);
                so4 so4Var = new so4(zbgVar4, ybgVar5, ccgVar.i, ybgVar3, ccgVar.C, ccgVar.k, ybgVar3, ccgVar.w0, ccgVar.l, 13);
                LinkedHashMap A = gtq0.A(7);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(f.class, qx4Var);
                A.put(b.class, sb1Var);
                A.put(jwy0.class, fat0Var);
                A.put(e.class, so4Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        settingsComposeFragment$getViewModelFactory$1 = new SettingsComposeFragment$getViewModelFactory$1(settingsComposeFragment, continuation);
        Object obj2 = settingsComposeFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsComposeFragment$getViewModelFactory$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((w6r0) settingsComposeFragment.getArguments()).getClass();
        ybg ybgVar6 = ccgVar2.L;
        faj fajVar2 = new faj(ybgVar6, i32);
        zbg zbgVar6 = ccgVar2.k0;
        zbg zbgVar22 = ccgVar2.F;
        acg acgVar5 = ccgVar2.X;
        acg acgVar22 = ccgVar2.s;
        ph70 ph70Var2 = new ph70((xvf0) ybgVar6, (v7p) fajVar2, (xvf0) zbgVar6, (xvf0) zbgVar22, (xvf0) acgVar5, (xvf0) acgVar22, 5);
        xat xatVar2 = new xat(ybgVar6, i32);
        ybg ybgVar22 = ccgVar2.m;
        k1w k1wVar2 = new k1w(ybgVar22, 9);
        f2b f2bVar2 = new f2b(ybgVar6, ccgVar2.S, new k1w(ccgVar2.r0, 19), 6);
        acg acgVar32 = ccgVar2.o;
        zbg zbgVar32 = ccgVar2.f;
        ybg ybgVar32 = ccgVar2.h;
        acg acgVar42 = ccgVar2.c0;
        ybg ybgVar42 = ccgVar2.g;
        zbg zbgVar42 = ccgVar2.e0;
        ybg ybgVar52 = ccgVar2.y;
        zbg zbgVar52 = ccgVar2.t;
        qx4 qx4Var2 = new qx4(acgVar32, acgVar5, zbgVar32, ybgVar32, acgVar42, ph70Var2, ybgVar42, zbgVar42, ybgVar52, zbgVar52, xatVar2, ybgVar22, k1wVar2, acgVar22, f2bVar2);
        sb1 sb1Var2 = new sb1(acgVar32, ccgVar2.h0, ccgVar2.t0, ccgVar2.r, zbgVar52, ccgVar2.u0, ccgVar2.s0, 24);
        fat0 fat0Var2 = new fat0(zbgVar32, ccgVar2.v0, 26);
        so4 so4Var2 = new so4(zbgVar42, ybgVar52, ccgVar2.i, ybgVar32, ccgVar2.C, ccgVar2.k, ybgVar32, ccgVar2.w0, ccgVar2.l, 13);
        LinkedHashMap A2 = gtq0.A(7);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(f.class, qx4Var2);
        A2.put(b.class, sb1Var2);
        A2.put(jwy0.class, fat0Var2);
        A2.put(e.class, so4Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        return insets;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment, androidx.fragment.app.Fragment
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tje.N(r.a(getLifecycle()), null, null, new SettingsComposeFragment$onCreateView$1(this, null), 3);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
