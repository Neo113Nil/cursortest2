package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
/* loaded from: classes11.dex */
public final class k2x extends Lambda implements izs<ym70, s3q0> {
    final /* synthetic */ l2x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2x(l2x l2xVar) {
        super(1);
        this.this$0 = l2xVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(ym70 ym70Var) {
        ym70 ym70Var2 = ym70Var;
        ym70Var2.a();
        ci50<ndx0<ym70>> ci50Var = this.this$0.d;
        ndx0<ym70>[] ndx0VarArr = ci50Var.b;
        int i = ci50Var.d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (epx.f(ndx0VarArr[i2], ym70Var2)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            this.this$0.d.k(i2);
        }
        l2x l2xVar = this.this$0;
        if (l2xVar.d.d == 0) {
            l2xVar.b.invoke();
        }
        return s3q0.a;
    }
}
