package xsna;

import android.os.Parcelable;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import java.nio.channels.ClosedByInterruptException;
import xsna.u6x;

/* compiled from: BaseUploadTask.kt */
/* loaded from: classes11.dex */
public abstract class sp6<S extends Parcelable> extends ye6 {
    public zcq0 c;
    public int d;
    public boolean e;
    public final int f = 1;

    @Override // xsna.ye6
    public void J(u6x.a aVar) {
        X();
    }

    public laq N() {
        return null;
    }

    public int O() {
        return this.f;
    }

    public abstract io.reactivex.rxjava3.internal.operators.observable.j1 P() throws Exception;

    public boolean Q() {
        return this instanceof oba0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0028, Exception -> 0x003e, RuntimeException -> 0x0040, ClosedByInterruptException -> 0x0042, InterruptedException -> 0x0044, TRY_ENTER, TryCatch #5 {ClosedByInterruptException -> 0x0042, blocks: (B:3:0x0001, B:4:0x0005, B:18:0x005b, B:20:0x0061, B:21:0x0064, B:25:0x006b, B:26:0x006e, B:36:0x0039, B:38:0x0049, B:29:0x006f), top: B:2:0x0001, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:29:0x006f BREAK  A[LOOP:0: B:4:0x0005->B:23:0x006a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X() throws Exception {
        zcq0 zcq0Var;
        String str;
        try {
            try {
                try {
                    try {
                        M();
                        int i = 0;
                        while (i < O()) {
                            i++;
                            Exception e = null;
                            try {
                                zcq0Var = (zcq0) P().a();
                                try {
                                    this.c = zcq0Var;
                                    str = zcq0Var.c();
                                    try {
                                        laq N = N();
                                        if (N != null) {
                                            N.e();
                                        }
                                        Z(str);
                                    } catch (Exception e2) {
                                        e = e2;
                                        String a = zcq0Var != null ? zcq0Var.a() : null;
                                        if (a == null || a.equals(str)) {
                                            e = e;
                                        } else {
                                            try {
                                                V();
                                                Z(a);
                                            } catch (Exception e3) {
                                                e = e3;
                                            }
                                        }
                                        if (e != null) {
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = null;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                zcq0Var = null;
                                str = null;
                            }
                            if (e != null) {
                                break;
                            }
                            laq N2 = N();
                            if (N2 != null) {
                                N2.b();
                            }
                            if (i >= O()) {
                                W(e);
                                throw e;
                            }
                        }
                        S Y = Y();
                        L(Y);
                        R(Y);
                        T();
                    } catch (Throwable th) {
                        T();
                        throw th;
                    }
                } catch (ClosedByInterruptException e6) {
                    L.E(e6, new Object[0]);
                    U(e6);
                    throw new InterruptedException(e6.getMessage());
                }
            } catch (RuntimeException e7) {
                if (!(e7.getCause() instanceof InterruptedException)) {
                    S(e7);
                    throw e7;
                }
                L.E(e7, new Object[0]);
                U(e7);
                throw new InterruptedException(e7.getMessage());
            }
        } catch (InterruptedException e8) {
            L.E(e8, new Object[0]);
            U(e8);
            throw e8;
        } catch (Exception e9) {
            S(e9);
            throw e9;
        }
    }

    public S Y() throws Exception {
        return null;
    }

    public abstract void Z(String str) throws Exception;

    public final int getId() {
        return this.d;
    }

    @Override // com.vk.instantjobs.InstantJob
    public InstantJob.NotificationShowCondition p() {
        return Q() ? InstantJob.NotificationShowCondition.WHEN_STARTED : InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE;
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public void u(Object obj) {
        L.e("canceled " + this.d);
        this.e = true;
    }

    public void M() throws Exception {
    }

    public void T() {
    }

    public void V() {
    }

    public void L(S s) throws Exception {
    }

    public void R(Parcelable parcelable) {
    }

    public void S(Exception exc) {
    }

    public void U(Exception exc) {
    }

    public void W(Exception exc) {
    }
}
