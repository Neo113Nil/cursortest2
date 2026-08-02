package xsna;

import android.view.MotionEvent;
import androidx.compose.runtime.a;
import kotlin.jvm.internal.Lambda;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes11.dex */
public final class hmb0 extends Lambda implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
    final /* synthetic */ izs<MotionEvent, Boolean> $onTouchEvent;
    final /* synthetic */ o7g0 $requestDisallowInterceptTouchEvent = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb0(izs izsVar) {
        super(3);
        this.$onTouchEvent = izsVar;
    }

    @Override // xsna.yzs
    public final q630 invoke(q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        aVar2.K(374375707);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(374375707, intValue, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new emb0();
            aVar2.R(x);
        }
        emb0 emb0Var = (emb0) x;
        emb0Var.a = this.$onTouchEvent;
        o7g0 o7g0Var = this.$requestDisallowInterceptTouchEvent;
        o7g0 o7g0Var2 = emb0Var.b;
        if (o7g0Var2 != null) {
            o7g0Var2.b = null;
        }
        emb0Var.b = o7g0Var;
        if (o7g0Var != null) {
            o7g0Var.b = emb0Var;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return emb0Var;
    }
}
