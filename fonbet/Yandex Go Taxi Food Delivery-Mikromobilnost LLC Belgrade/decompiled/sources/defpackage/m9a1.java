package defpackage;

import com.google.android.gms.internal.play_billing.m;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzhr;

/* loaded from: classes.dex */
public class m9a1 {
    public volatile m a;
    public volatile zzgk b;

    public final zzgk a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzgk.a;
                } else {
                    this.b = this.a.c();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(p pVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = pVar;
                this.b = zzgk.a;
            } catch (zzhr unused) {
                this.a = pVar;
                this.b = zzgk.a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9a1)) {
            return false;
        }
        m9a1 m9a1Var = (m9a1) obj;
        m mVar = this.a;
        m mVar2 = m9a1Var.a;
        if (mVar == null && mVar2 == null) {
            return a().equals(m9a1Var.a());
        }
        if (mVar != null && mVar2 != null) {
            return mVar.equals(mVar2);
        }
        if (mVar != null) {
            m9a1Var.b((p) ((p) mVar).g(6));
            return mVar.equals(m9a1Var.a);
        }
        p pVar = (p) mVar2;
        b((p) pVar.g(6));
        return this.a.equals(pVar);
    }

    public final int hashCode() {
        return 1;
    }
}
