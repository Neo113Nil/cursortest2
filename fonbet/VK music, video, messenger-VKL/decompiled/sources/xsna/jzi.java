package xsna;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import androidx.compose.runtime.a;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jzi implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jzi(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1131915147, intValue, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.ConfigureItemListComposeView.ThemedContent.<anonymous> (ConfigureItemListComposeView.kt:54)");
                    }
                    ijk.a((fm50) mtk0Var.getValue(), txj0.d(q630.a.a, 1.0f), null, "StateChange", kai.c(-714976152, new kzi(izsVar, 0), aVar), aVar, 27696, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                mdu mduVar = (mdu) this.c;
                RenderEffect renderEffect = (RenderEffect) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-475985578);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-475985578, intValue2, -1, "com.vk.core.tool.compose.blur.control.renderLayer.<anonymous> (ModifierFlow.kt:70)");
                }
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = b90.c();
                    aVar2.R(x);
                }
                RenderNode c = a90.c(x);
                Object x2 = aVar2.x();
                if (x2 == c0012a) {
                    x2 = new ir9();
                    aVar2.R(x2);
                }
                ir9 ir9Var = (ir9) x2;
                boolean y = aVar2.y(mduVar) | aVar2.y(c) | aVar2.y(renderEffect) | aVar2.y(ir9Var);
                Object x3 = aVar2.x();
                if (y || x3 == c0012a) {
                    x3 = new brf(mduVar, c, renderEffect, ir9Var, 3);
                    aVar2.R(x3);
                }
                q630 c2 = bu00.c(q630Var, (izs) x3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return c2;
            default:
                MusicPlayerInformerViewState.a aVar3 = (MusicPlayerInformerViewState.a) this.c;
                pww pwwVar = (pww) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(437884354, intValue3, -1, "com.vk.music.informer.MusicPlayerInformerContent.<anonymous> (VkAppInformerContainer.kt:103)");
                    }
                    Object x4 = aVar4.x();
                    if (x4 == a.C0011a.a) {
                        x4 = new fyo0(7);
                        aVar4.R(x4);
                    }
                    xh2.a(aVar3, null, (izs) x4, null, null, null, kai.c(-1862497243, new g150(pwwVar, 1), aVar4), aVar4, 1573248, 58);
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
