package xsna;

import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r5x0;
import xsna.va9;

/* compiled from: CallVmojiDelegate.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class wa9 extends FunctionReferenceImpl implements izs<va9.f, s3q0> {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r9.e == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(va9.f fVar) {
        boolean z;
        va9.f fVar2 = fVar;
        va9 va9Var = (va9) this.receiver;
        r5x0.b bVar = va9Var.c;
        w5w0 w5w0Var = fVar2.a;
        boolean z2 = !epx.f(w5w0Var, va9.r) && (fVar2.c || va9Var.f()) && fVar2.d;
        L.e("CallVmojiDelegate", "state: " + fVar2);
        if (va9Var.q != z2) {
            va9Var.q = z2;
            if (z2) {
                if (fVar2.b) {
                    bVar.a.q1();
                }
                z = true;
                va9Var.m = z;
                String str = va9Var.n;
                va9Var.a.c(va9Var.m, str == null && !str.equals(w5w0Var.b()));
                va9Var.n = w5w0Var.b();
                if (va9Var.q) {
                    bVar.b.a();
                    va9.k(new il1(va9Var, 7));
                }
            }
            z = false;
            va9Var.m = z;
            String str2 = va9Var.n;
            va9Var.a.c(va9Var.m, str2 == null && !str2.equals(w5w0Var.b()));
            va9Var.n = w5w0Var.b();
            if (va9Var.q) {
            }
        }
        return s3q0.a;
    }
}
