package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: IconsContent.kt */
/* loaded from: classes18.dex */
public final class qrv implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1457296723);
        int i2 = (i & 6) == 0 ? (M.y(gzsVar) ? 4 : 2) | i : i;
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8195) != 8194)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1457296723, i2, -1, "com.vk.design.demo.presentation.screens.IconsContent.Content (IconsContent.kt:34)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.e("Icons", null, null, b, null, gzsVar, false, null, false, null, M, 4102 | ((i2 << 15) & 458752), 0, 2006);
            M = M;
            Method[] declaredMethods = qzu0.class.getDeclaredMethods();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                method.setAccessible(true);
                Object invoke = method.invoke(qzu0.a, M, 0);
                lg90 lg90Var = invoke instanceof lg90 ? (lg90) invoke : null;
                Pair pair = lg90Var == null ? null : new Pair(method.getName(), lg90Var);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(0);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            vpu0.c(((Number) wh50Var.getValue()).intValue(), kai.c(-2120378724, new nrv(wh50Var, 0), M), txj0.f(aVar2, 1.0f), 0L, false, null, M, Tensorflow.FRAME_WIDTH, 120);
            urv.a(0, M, arrayList, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new orv(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
