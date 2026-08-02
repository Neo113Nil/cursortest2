package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsFeedEngineImpl.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class l6e extends FunctionReferenceImpl implements gzs<Integer> {
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.recyclerview.widget.o0, xsna.e4o0] */
    @Override // xsna.gzs
    public final Integer invoke() {
        z3o0 z3o0Var = (z3o0) this.receiver;
        int i = z3o0Var.d;
        if (i == -1) {
            View findSnapView = z3o0Var.a.b().findSnapView(z3o0Var.c);
            i = findSnapView == null ? 0 : z3o0Var.b.getChildLayoutPosition(findSnapView);
        }
        return Integer.valueOf(i);
    }
}
