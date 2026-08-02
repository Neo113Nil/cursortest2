package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zy20 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zy20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                az20 az20Var = (az20) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-406192209, intValue, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.ComposeModals.<anonymous> (ModalCardScreenContent.kt:165)");
                    }
                    qy20 h = az20Var.h(aVar);
                    xy20 g = az20Var.g(aVar);
                    jai e = az20Var.e(aVar);
                    ty20 f = az20Var.f(aVar);
                    boolean i = az20Var.i();
                    boolean J = aVar.J(az20Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new fm20(az20Var, 2);
                        aVar.R(x);
                    }
                    e5v0.a((gzs) x, null, h, g, e, f, i, true, null, aVar, 12582912, 258);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                izs izsVar = (izs) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1024637806, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseRadioButton.<anonymous> (VkAppBottomPlayer.kt:271)");
                    }
                    q630.a aVar3 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar2.K(-652243748);
                        q630 E = ahn.E(aVar3, "pauseBtn");
                        qzu0.a.getClass();
                        lg90 V0 = qzu0.V0(aVar2);
                        String N = d370.N(R.string.music_talkback_player_radio_pause, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J2 = aVar2.J(izsVar);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new zje(izsVar, 8);
                            aVar2.R(x2);
                        }
                        nzu0.c((gzs) x2, V0, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar2, 3136, 2000);
                        aVar2.j();
                    } else {
                        aVar2.K(-651773633);
                        q630 E2 = ahn.E(aVar3, "playBtn");
                        qzu0.a.getClass();
                        lg90 d1 = qzu0.d1(aVar2);
                        String N2 = d370.N(R.string.music_talkback_player_radio_play, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().a;
                        boolean J3 = aVar2.J(izsVar);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new q0(izsVar, 7);
                            aVar2.R(x3);
                        }
                        nzu0.c((gzs) x3, d1, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar2, 3136, 2000);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
