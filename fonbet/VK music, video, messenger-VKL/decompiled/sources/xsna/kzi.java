package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.e0j;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kzi implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kzi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-714976152, intValue, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.ConfigureItemListComposeView.ThemedContent.<anonymous>.<anonymous> (ConfigureItemListComposeView.kt:59)");
                }
                if (fm50Var instanceof e0j.a) {
                    aVar.K(-1111598808);
                    rzi.a((e0j.a) fm50Var, izsVar, null, aVar, 0);
                    aVar.j();
                } else if (fm50Var instanceof e0j.b) {
                    aVar.K(-1111328612);
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new h74(izsVar, 2);
                        aVar.R(x);
                    }
                    szi.a(0, aVar, (gzs) x, null);
                    aVar.j();
                } else {
                    aVar.K(fm50Var instanceof e0j.c ? 102707820 : -1113861126);
                    aVar.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                izs izsVar2 = (izs) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(818678633, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseButton.<anonymous> (MusicStandaloneBottomPlayer.kt:476)");
                    }
                    q630.a aVar3 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar2.K(-1864064773);
                        q630 E = ahn.E(aVar3, "pauseBtn");
                        float f = 36;
                        qzu0.a.getClass();
                        lg90 V0 = qzu0.V0(aVar2);
                        String N = d370.N(R.string.music_talkback_player_pause, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().j;
                        boolean J2 = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new o87(izsVar2, 6);
                            aVar2.R(x2);
                        }
                        nzu0.c((gzs) x2, V0, N, E, f, j, false, null, false, null, null, aVar2, 27712, 1984);
                        aVar2.j();
                    } else {
                        aVar2.K(-1863552994);
                        q630 E2 = ahn.E(aVar3, "playBtn");
                        float f2 = 36;
                        qzu0.a.getClass();
                        lg90 d1 = qzu0.d1(aVar2);
                        String N2 = d370.N(R.string.music_talkback_player_play, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().j;
                        boolean J3 = aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new mse(izsVar2, 5);
                            aVar2.R(x3);
                        }
                        nzu0.c((gzs) x3, d1, N2, E2, f2, j2, false, null, false, null, null, aVar2, 27712, 1984);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(219861862, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:95)");
                    }
                    tyqVar.h(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}
