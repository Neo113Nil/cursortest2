package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vsg0 implements izs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ sx5 c;
    public final /* synthetic */ wzs d;
    public final /* synthetic */ io.reactivex.rxjava3.core.w e;
    public final /* synthetic */ izs f;

    public /* synthetic */ vsg0(izs izsVar, sx5 sx5Var, wzs wzsVar, io.reactivex.rxjava3.core.w wVar, izs izsVar2) {
        this.b = izsVar;
        this.c = sx5Var;
        this.d = wzsVar;
        this.e = wVar;
        this.f = izsVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long a;
        Throwable th = (Throwable) obj;
        if (!((Boolean) this.b.invoke(th)).booleanValue()) {
            return io.reactivex.rxjava3.core.q.H(th);
        }
        sx5 sx5Var = this.c;
        int i = sx5Var.c + 1;
        sx5Var.c = i;
        if (i <= sx5Var.b) {
            a = sx5Var.a.a(i);
            if (a != 0) {
                if (a < 0) {
                    throw new IllegalStateException("Interval is invalid. Must be greater than 0.");
                }
                long j = sx5Var.d + a;
                sx5Var.d = j;
                boolean z = j > Long.MAX_VALUE;
                if (!z) {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (a == 0) {
                        this.d.invoke(th, Integer.valueOf(sx5Var.c));
                        return io.reactivex.rxjava3.core.q.C0(a, TimeUnit.MILLISECONDS, this.e);
                    }
                    this.f.invoke(th);
                    return io.reactivex.rxjava3.core.q.H(th);
                }
            }
        }
        a = 0;
        if (a == 0) {
        }
    }
}
