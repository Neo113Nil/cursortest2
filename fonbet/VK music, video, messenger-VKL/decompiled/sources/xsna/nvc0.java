package xsna;

import java.util.Arrays;
import kotlin.Result;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nvc0 implements io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qn60 c;
    public final /* synthetic */ qn60.b[] d;

    public /* synthetic */ nvc0(qn60 qn60Var, qn60.b[] bVarArr, int i) {
        this.b = i;
        this.c = qn60Var;
        this.d = bVarArr;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
        switch (this.b) {
            case 0:
                qn60.b[] bVarArr = this.d;
                Object f = this.c.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
                if (!(f instanceof Result.Failure)) {
                    yVar.onSuccess((qn60.c) f);
                }
                Throwable a = Result.a(f);
                if (a != null) {
                    yVar.onError(a);
                    break;
                }
                break;
            default:
                qn60.b[] bVarArr2 = this.d;
                Object f2 = this.c.f((qn60.b[]) Arrays.copyOf(bVarArr2, bVarArr2.length));
                if (!(f2 instanceof Result.Failure)) {
                    yVar.onSuccess((qn60.c) f2);
                }
                Throwable a2 = Result.a(f2);
                if (a2 != null) {
                    yVar.onError(a2);
                    break;
                }
                break;
        }
    }
}
