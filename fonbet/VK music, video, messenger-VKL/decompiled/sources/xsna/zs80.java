package xsna;

import xsna.ts80;
import xsna.ub9;

/* compiled from: Operation.kt */
/* loaded from: classes.dex */
public final class zs80 {
    public static final ws80 a(final p7i p7iVar, final String str, final dmi0 dmi0Var, final gzs gzsVar) {
        final ug50 ug50Var = new ug50(ts80.b);
        return new ws80(ug50Var, ub9.a(new ub9.c() { // from class: xsna.xs80
            @Override // xsna.ub9.c
            public final Object attachCompleter(final ub9.a aVar) {
                final p7i p7iVar2 = p7iVar;
                final String str2 = str;
                final gzs gzsVar2 = gzsVar;
                final ug50 ug50Var2 = ug50Var;
                dmi0Var.execute(new Runnable() { // from class: xsna.ys80
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str2;
                        gzs gzsVar3 = gzsVar2;
                        ug50 ug50Var3 = ug50Var2;
                        ub9.a aVar2 = aVar;
                        p7i p7iVar3 = p7i.this;
                        p7iVar3.getClass();
                        boolean e = ndp0.e();
                        if (e) {
                            try {
                                p7iVar3.b(str3);
                            } finally {
                                if (e) {
                                    p7iVar3.d();
                                }
                            }
                        }
                        try {
                            gzsVar3.invoke();
                            ts80.a.c cVar = ts80.a;
                            ug50Var3.i(cVar);
                            aVar2.b(cVar);
                        } catch (Throwable th) {
                            ug50Var3.i(new ts80.a.C3764a(th));
                            aVar2.d(th);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                });
                return s3q0.a;
            }
        }));
    }
}
