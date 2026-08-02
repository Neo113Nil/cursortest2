package xsna;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ogl implements u080 {
    public final /* synthetic */ pgl b;
    public final /* synthetic */ FunctionReferenceImpl c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ogl(pgl pglVar, izs izsVar) {
        this.b = pglVar;
        this.c = (FunctionReferenceImpl) izsVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        pgl pglVar = this.b;
        pglVar.getClass();
        h4x i = bqx0Var.a.i(647);
        if (!epx.f(i, pglVar.a)) {
            this.c.invoke(new Rect(i.a, i.b, i.c, i.d));
            pglVar.a = i;
        }
        return bqx0Var;
    }
}
