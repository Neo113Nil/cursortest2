package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FormFieldScreenContent.kt */
/* loaded from: classes18.dex */
public final class m8s implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-173817053);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-173817053, i, -1, "com.vk.design.demo.presentation.screens.FormFieldScreenContent.Content (FormFieldScreenContent.kt:68)");
        }
        q630.a aVar2 = q630.a.a;
        q630 f = txj0.f(aVar2, 1.0f);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, m);
        cri.h7.getClass();
        LayoutNode.a aVar3 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar3);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
        }
        lg90 b = or.b(aVar, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        muv0.e("FormField", null, null, b, null, gzsVar, false, null, false, null, aVar, 4102 | ((i << 15) & 458752), 0, 2006);
        djn0.a(true, true, aVar, 438, 0);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = qq.h(0, aVar);
        }
        wh50 wh50Var = (wh50) x;
        ziv0.d(((Number) wh50Var.getValue()).intValue(), kai.c(-460862516, new t0r(wh50Var, 1), aVar), txj0.f(aVar2, 1.0f), 0L, false, null, aVar, Tensorflow.FRAME_WIDTH, 56);
        t8s.g(((Number) wh50Var.getValue()).intValue(), 0, aVar, q9g.a(aVar2, 1.0f));
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
