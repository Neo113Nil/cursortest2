package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.vhv;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class yhv extends c5o0 {
    public final /* synthetic */ vhv.d e;
    public final /* synthetic */ e0j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhv(String str, vhv.d dVar, e0j0 e0j0Var) {
        super(str, true);
        this.e = dVar;
        this.f = e0j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, xsna.e0j0] */
    @Override // xsna.c5o0
    public final long a() {
        int i;
        long a;
        fiv[] fivVarArr;
        vhv.d dVar = this.e;
        e0j0 e0j0Var = this.f;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        vhv vhvVar = vhv.this;
        synchronized (vhvVar.y) {
            synchronized (vhvVar) {
                try {
                    e0j0 e0j0Var2 = vhvVar.s;
                    ?? e0j0Var3 = new e0j0();
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (((1 << i2) & e0j0Var2.a) != 0) {
                            e0j0Var3.c(i2, e0j0Var2.b[i2]);
                        }
                    }
                    for (int i3 = 0; i3 < 10; i3++) {
                        if (((1 << i3) & e0j0Var.a) != 0) {
                            e0j0Var3.c(i3, e0j0Var.b[i3]);
                        }
                    }
                    ref$ObjectRef.element = e0j0Var3;
                    a = e0j0Var3.a() - e0j0Var2.a();
                    if (a != 0 && !vhvVar.c.isEmpty()) {
                        fivVarArr = (fiv[]) vhvVar.c.values().toArray(new fiv[0]);
                        vhvVar.s = (e0j0) ref$ObjectRef.element;
                        vhvVar.k.c(new whv(vhvVar.d + " onSettings", vhvVar, ref$ObjectRef), 0L);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    fivVarArr = null;
                    vhvVar.s = (e0j0) ref$ObjectRef.element;
                    vhvVar.k.c(new whv(vhvVar.d + " onSettings", vhvVar, ref$ObjectRef), 0L);
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                vhvVar.y.b((e0j0) ref$ObjectRef.element);
            } catch (IOException e) {
                vhvVar.c(e);
            }
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (fivVarArr == null) {
            return -1L;
        }
        for (fiv fivVar : fivVarArr) {
            synchronized (fivVar) {
                fivVar.f += a;
                if (a > 0) {
                    fivVar.notifyAll();
                }
                s3q0 s3q0Var4 = s3q0.a;
            }
        }
        return -1L;
    }
}
