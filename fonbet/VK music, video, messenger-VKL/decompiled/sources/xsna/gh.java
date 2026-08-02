package xsna;

import java.util.HashMap;

/* compiled from: AbstractProducerToDataSourceAdapter.kt */
/* loaded from: classes12.dex */
public abstract class gh<T> extends ae<T> {
    public final ozi0 h;
    public final clx i;

    public gh(thd0 thd0Var, ozi0 ozi0Var, clx clxVar) {
        HashMap hashMap = ozi0Var.g;
        this.h = ozi0Var;
        this.i = clxVar;
        if (!lhs.d()) {
            this.a = hashMap;
            if (lhs.d()) {
                lhs.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    clxVar.a(ozi0Var);
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                }
            } else {
                clxVar.a(ozi0Var);
            }
            if (!lhs.d()) {
                thd0Var.b(new fh(this), ozi0Var);
                return;
            }
            lhs.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                thd0Var.b(new fh(this), ozi0Var);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            } finally {
            }
        }
        lhs.a("AbstractProducerToDataSourceAdapter()");
        try {
            this.a = hashMap;
            if (lhs.d()) {
                lhs.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    clxVar.a(ozi0Var);
                    s3q0 s3q0Var3 = s3q0.a;
                    lhs.b();
                } finally {
                }
            } else {
                clxVar.a(ozi0Var);
            }
            if (lhs.d()) {
                lhs.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    thd0Var.b(new fh(this), ozi0Var);
                    s3q0 s3q0Var4 = s3q0.a;
                    lhs.b();
                } finally {
                }
            } else {
                thd0Var.b(new fh(this), ozi0Var);
            }
            s3q0 s3q0Var5 = s3q0.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ae, xsna.zuk
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (c()) {
            return true;
        }
        clx clxVar = this.i;
        ozi0 ozi0Var = this.h;
        clxVar.h(ozi0Var);
        ozi0Var.f();
        return true;
    }

    public void l(T t, int i, uhd0 uhd0Var) {
        boolean d = ac6.d(i);
        if (j(t, d, uhd0Var.getExtras()) && d) {
            this.i.d(this.h);
        }
    }
}
