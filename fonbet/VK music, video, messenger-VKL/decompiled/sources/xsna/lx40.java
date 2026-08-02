package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx40 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lx40(Object obj, izs izsVar, int i, Object obj2) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MusicPlayerInformerViewState.a aVar;
        switch (this.b) {
            case 0:
                MusicPlayerInformerViewState.b bVar = (MusicPlayerInformerViewState.b) this.d;
                com.vk.music.informer.mvi.a aVar2 = (com.vk.music.informer.mvi.a) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1305379179, intValue, -1, "com.vk.music.informer.mvi.MusicPlayerInformerContentView.ThemedContent.<anonymous>.<anonymous> (MusicPlayerInformerContentView.kt:78)");
                }
                Object x = aVar3.x();
                wh50 wh50Var = null;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(null);
                    aVar3.R(x);
                }
                wh50 wh50Var2 = (wh50) x;
                if (bVar != null) {
                    wh50Var2.setValue(bVar);
                }
                MusicPlayerInformerViewState.b bVar2 = (MusicPlayerInformerViewState.b) wh50Var2.getValue();
                yzt0<MusicPlayerInformerViewState.a> yzt0Var = bVar2 != null ? bVar2.a : null;
                if (yzt0Var == null) {
                    aVar3.K(1917572077);
                } else {
                    aVar3.K(338951828);
                    wh50Var = jk50.c(yzt0Var, aVar3);
                }
                aVar3.j();
                if (wh50Var == null || (aVar = (MusicPlayerInformerViewState.a) wh50Var.getValue()) == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
                BottomPlayerAppearance bottomPlayerAppearance = aVar2.f;
                izs izsVar = this.c;
                boolean J = aVar3.J(izsVar);
                Object x2 = aVar3.x();
                if (J || x2 == c0012a) {
                    x2 = new pse(izsVar, 2);
                    aVar3.R(x2);
                }
                com.vk.music.informer.mvi.b.a((izs) x2, bottomPlayerAppearance, aVar, null, aVar3, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                q630 q630Var = (q630) this.d;
                jai jaiVar = (jai) this.e;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar4.l(booleanValue) ? 4 : 2;
                }
                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-634045515, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.Header.<anonymous> (TopHeader.kt:87)");
                    }
                    if (booleanValue) {
                        aVar4.K(416295080);
                        q630 d = txj0.d(q630Var, 1.0f);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar4, 48);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, d);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a, cri.a.f);
                        k9q0.w(aVar4, D, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c, cri.a.d);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(80869148, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDownOutline28> (VkSdkIcons.kt:430)");
                        }
                        lg90 b = or.b(aVar4, -303682241, R.drawable.vk_icon_chevron_down_outline_28, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = l5g.d;
                        String N = d370.N(R.string.music_talkback_player_collapse_player, 0, aVar4);
                        float f = 28;
                        izs izsVar2 = this.c;
                        boolean J2 = aVar4.J(izsVar2);
                        Object x3 = aVar4.x();
                        if (J2 || x3 == a.C0011a.a) {
                            x3 = new cc1(izsVar2, 9);
                            aVar4.R(x3);
                        }
                        nzu0.c((gzs) x3, b, N, null, f, j, false, null, false, null, null, aVar4, 221248, 1992);
                        aVar4.G();
                        aVar4.j();
                    } else {
                        aVar4.K(416891768);
                        jaiVar.invoke(q630Var, aVar4, 0);
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
