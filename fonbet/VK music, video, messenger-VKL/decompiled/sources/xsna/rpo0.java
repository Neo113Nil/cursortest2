package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: ThemedAbstractComposeView.kt */
/* loaded from: classes17.dex */
public abstract class rpo0 extends td {
    public static final /* synthetic */ int l = 0;

    public rpo0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public abstract void A(int i, androidx.compose.runtime.a aVar);

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1258153805);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1258153805, i2, -1, "com.vk.core.tool.view.ThemedAbstractComposeView.Content (ThemedAbstractComposeView.kt:60)");
            }
            z(((i2 << 3) & 112) | 70, M, kai.c(1300336235, new com.vk.movika.tools.controls.seekbar.l(this, 15), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.m(this, i, 13);
        }
    }

    public void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        aVar.K(940085004);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(940085004, i, -1, "com.vk.core.tool.view.ThemedAbstractComposeView.Theme (ThemedAbstractComposeView.kt:23)");
        }
        aVar.r(AndroidCompositionLocals_androidKt.c);
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        if (gpo0.b(context) != null) {
            aVar.K(-1408487305);
            TypedValue typedValue = krv0.a;
            rrv0.e(epx.f(krv0.i(context), Boolean.TRUE), null, null, null, null, null, jaiVar, aVar, (i << 18) & 3670016, 62);
            aVar.j();
        } else {
            aVar.K(-1408173988);
            rrv0.d(null, null, null, null, jaiVar, aVar, (i << 12) & 57344, 15);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public rpo0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
