package defpackage;

/* loaded from: classes.dex */
public abstract class a3t0 extends h5u0 implements iy40, b3t0 {
    public static final int $stable = 0;
    private z2t0 next;

    public a3t0(long j) {
        i2t0 j2 = q2t0.j();
        z2t0 z2t0Var = new z2t0(j2.g(), j);
        if (!(j2 instanceof akt)) {
            z2t0Var.b = new z2t0(1L, j);
        }
        this.next = z2t0Var;
    }

    @Override // defpackage.oz40
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    @Override // defpackage.oz40
    public tls component2() {
        return new quq0(28, this);
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.next;
    }

    @Override // defpackage.iy40
    public long getLongValue() {
        return ((z2t0) q2t0.t(this.next, this)).c;
    }

    @Override // defpackage.b3t0
    public e3t0 getPolicy() {
        return ngd0.F;
    }

    @Override // defpackage.g5u0
    public j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        if (((z2t0) j5u0Var2).c == ((z2t0) j5u0Var3).c) {
            return j5u0Var2;
        }
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 j5u0Var) {
        this.next = (z2t0) j5u0Var;
    }

    @Override // defpackage.iy40
    public void setLongValue(long j) {
        i2t0 j2;
        z2t0 z2t0Var = (z2t0) q2t0.h(this.next);
        if (z2t0Var.c != j) {
            z2t0 z2t0Var2 = this.next;
            synchronized (q2t0.c) {
                j2 = q2t0.j();
                ((z2t0) q2t0.o(z2t0Var2, this, j2, z2t0Var)).c = j;
            }
            q2t0.n(j2, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((z2t0) q2t0.h(this.next)).c + ")@" + hashCode();
    }
}
