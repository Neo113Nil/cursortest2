package xsna;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: DrawableSourceExt.kt */
/* loaded from: classes17.dex */
public final class fko {
    public static final lg90 a(dko dkoVar, androidx.compose.runtime.a aVar) {
        lg90 p;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(576686883, 0, -1, "com.vk.core.view.model.toPainter (DrawableSourceExt.kt:15)");
        }
        if (dkoVar instanceof gj2) {
            aVar.K(209903323);
            gj2 gj2Var = (gj2) dkoVar;
            p = xx1.C(im2.a(gj2Var.a, 6, aVar), ((Boolean) ((zak0) gj2Var.b).getValue()).booleanValue(), aVar, 0);
            aVar.j();
        } else if (dkoVar instanceof eko) {
            aVar.K(145324612);
            p = w65.p(((eko) dkoVar).a, aVar, 0);
            aVar.j();
        } else if (dkoVar instanceof gko) {
            aVar.K(145326588);
            p = pg90.a(((gko) dkoVar).a, 0, aVar);
            aVar.j();
        } else if (dkoVar instanceof hko) {
            aVar.K(145328589);
            hko hkoVar = (hko) dkoVar;
            int i = hkoVar.a;
            int i2 = hkoVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1101579115, 0, -1, "com.vk.core.tool.compose.core.painterResourceThemable (painterResourceThemable.kt:12)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            p = ylu0Var.s() ? or.b(aVar, 701829708, i, aVar, 0) : or.b(aVar, 701868365, i2, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            aVar.K(145330364);
            p = w65.p(dkoVar.a((Context) aVar.r(AndroidCompositionLocals_androidKt.b)), aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return p;
    }
}
