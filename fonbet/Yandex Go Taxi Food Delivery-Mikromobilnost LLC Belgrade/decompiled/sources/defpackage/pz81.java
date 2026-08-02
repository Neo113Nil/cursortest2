package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class pz81 extends py81 {
    public final zsx0 b;
    public final atx0 c;
    public final o8u0 d;

    public pz81(int i, zsx0 zsx0Var, atx0 atx0Var, o8u0 o8u0Var) {
        super(i);
        this.c = atx0Var;
        this.b = zsx0Var;
        this.d = o8u0Var;
        if (i == 2 && zsx0Var.b) {
            ny61.g("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.vz81
    public final void a(Status status) {
        ((rn2) this.d).getClass();
        this.c.b(sn2.a(status));
    }

    @Override // defpackage.vz81
    public final void b(Exception exc) {
        this.c.b(exc);
    }

    @Override // defpackage.vz81
    public final void c(jy81 jy81Var) {
        atx0 atx0Var = this.c;
        try {
            this.b.b(jy81Var.b, atx0Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(vz81.e(e2));
        } catch (RuntimeException e3) {
            atx0Var.b(e3);
        }
    }

    @Override // defpackage.vz81
    public final void d(rx81 rx81Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = rx81Var.b;
        atx0 atx0Var = this.c;
        map.put(atx0Var, valueOf);
        atx0Var.a.b(new gr81(rx81Var, atx0Var));
    }

    @Override // defpackage.py81
    public final boolean f(jy81 jy81Var) {
        return this.b.b;
    }

    @Override // defpackage.py81
    public final Feature[] g(jy81 jy81Var) {
        return this.b.a;
    }
}
