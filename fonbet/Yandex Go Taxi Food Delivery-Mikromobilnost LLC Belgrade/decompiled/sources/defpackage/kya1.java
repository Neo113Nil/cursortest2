package defpackage;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzoh;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class kya1 extends eqa1 {
    public final a1 a;
    public a1 b;

    public kya1(a1 a1Var) {
        this.a = a1Var;
        if (a1Var.g()) {
            ny61.g("Default instance must be immutable.");
            throw null;
        }
        this.b = (a1) a1Var.q(4);
    }

    @Override // defpackage.eqa1
    public final a1 c() {
        boolean g = this.b.g();
        a1 a1Var = this.b;
        if (!g) {
            return a1Var;
        }
        a1Var.i();
        return this.b;
    }

    public final void d() {
        if (this.b.g()) {
            return;
        }
        a1 a1Var = (a1) this.a.q(4);
        a7b1.c.a(a1Var.getClass()).e(a1Var, this.b);
        this.b = a1Var;
    }

    @Override // defpackage.eqa1
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final kya1 clone() {
        kya1 kya1Var = (kya1) this.a.q(5);
        boolean g = this.b.g();
        a1 a1Var = this.b;
        if (g) {
            a1Var.i();
            a1Var = this.b;
        }
        kya1Var.b = a1Var;
        return kya1Var;
    }

    public final a1 f() {
        boolean g = this.b.g();
        a1 a1Var = this.b;
        if (g) {
            a1Var.i();
            a1Var = this.b;
        }
        a1Var.getClass();
        boolean z = true;
        byte byteValue = ((Byte) a1Var.q(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = a7b1.c.a(a1Var.getClass()).a(a1Var);
                a1Var.q(2);
            }
        }
        if (z) {
            return a1Var;
        }
        throw new zzoh();
    }

    public final void g(a1 a1Var) {
        a1 a1Var2 = this.a;
        if (a1Var2.equals(a1Var)) {
            return;
        }
        if (!this.b.g()) {
            a1 a1Var3 = (a1) a1Var2.q(4);
            a7b1.c.a(a1Var3.getClass()).e(a1Var3, this.b);
            this.b = a1Var3;
        }
        a1 a1Var4 = this.b;
        a7b1.c.a(a1Var4.getClass()).e(a1Var4, a1Var);
    }

    public final void h(byte[] bArr, int i, awa1 awa1Var) {
        if (!this.b.g()) {
            a1 a1Var = (a1) this.a.q(4);
            a7b1.c.a(a1Var.getClass()).e(a1Var, this.b);
            this.b = a1Var;
        }
        try {
            a7b1.c.a(this.b.getClass()).g(this.b, bArr, 0, i, new v43(awa1Var));
        } catch (zzmr e) {
            throw e;
        } catch (IOException e2) {
            ny61.n("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            ny61.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
