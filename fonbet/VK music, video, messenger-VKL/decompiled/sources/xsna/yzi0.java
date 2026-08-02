package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.tlo0;

/* compiled from: SettingSwitch.kt */
/* loaded from: classes7.dex */
public final class yzi0 {
    public static final void a(zzi0 zzi0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        tlo0.f fVar = zzi0Var.b;
        androidx.compose.runtime.a M = aVar.M(-2145525260);
        int i2 = i | (M.J(zzi0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2145525260, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.common.compose.settingswitch.SettingSwitch (SettingSwitch.kt:25)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 f = txj0.f(q630Var, 1.0f);
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(tlo0.b.a(zzi0Var.a, context).toString(), null, null, 1, null, null, M, 12610560, 102);
            M.K(360817318);
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(tlo0.b.a(fVar, context).toString(), 2, null, null, null, M, 12583344, 120);
            M.j();
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, b, null, null, M, 196608, 28);
            boolean z = zzi0Var.c;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new el30(zzi0Var, 29);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.t0 a3 = com.vk.core.compose.component.cell.content.n.a(z, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 24576, 6);
            boolean z3 = ((i2 & 112) == 32) | (i3 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new wx0(21, izsVar, zzi0Var);
                M.R(x2);
            }
            wiu0.b(f, false, null, a2, a3, (gzs) x2, null, M, 0, 70);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new an7(i, 8, (Object) zzi0Var, izsVar, q630Var);
        }
    }
}
