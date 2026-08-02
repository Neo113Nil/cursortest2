package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g150 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g150(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj5;
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(496860682, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.catalogBannerItems.<anonymous> (MusicPlaylistListContent.kt:137)");
                    }
                    ((epi) aVar.r(fpi.a)).a(list.get(intValue), aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                pww pwwVar = (pww) obj5;
                MusicPlayerInformerViewState.a aVar2 = (MusicPlayerInformerViewState.a) obj2;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1862497243, intValue3, -1, "com.vk.music.informer.MusicPlayerInformerContent.<anonymous>.<anonymous> (VkAppInformerContainer.kt:133)");
                }
                q630 f = txj0.f(txj0.h(q630.a.a, 30), 1.0f);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                hr80.z().getClass();
                op8.h();
                float f2 = kqu0.s;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f2, dt1.a.o), dt1.a.l, aVar3, 48);
                int hashCode = Long.hashCode(n34.n(aVar3));
                sy90 D = aVar3.D();
                q630 c = qri.c(aVar3, f);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (aVar3.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar3.H();
                if (aVar3.L()) {
                    aVar3.I(aVar4);
                } else {
                    aVar3.f();
                }
                k9q0.w(aVar3, a, cri.a.f);
                k9q0.w(aVar3, D, cri.a.e);
                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar3, cri.a.h);
                k9q0.w(aVar3, c, cri.a.d);
                lg90 a2 = com.vk.music.informer.mvi.c.a(aVar2.c, aVar3);
                aVar3.K(344202207);
                float f3 = 16;
                cp8.b.a.a(a2, null, new uco(byc0.b(f3, f3)), null, null, aVar3, 197048, 24).a(pwwVar, aVar3, 390);
                aVar3.j();
                aVar3.K(344206893);
                cp8.d.a.a(aVar2.a, null, aVar3, 3072, 6).a(pwwVar, aVar3, 390);
                aVar3.j();
                aVar3.K(344211055);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_16, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                float f4 = 12;
                cp8.b.a.a(a3, null, new uco(byc0.b(f4, f4)), null, null, aVar3, 197048, 24).a(pwwVar, aVar3, 390);
                aVar3.j();
                aVar3.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
