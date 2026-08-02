package defpackage;

/* loaded from: classes.dex */
public abstract class d3t0 extends h5u0 implements b3t0 {
    public static final int $stable = 0;
    private c3t0 next;
    private final e3t0 policy;

    public d3t0(Object obj, e3t0 e3t0Var) {
        this.policy = e3t0Var;
        i2t0 j = q2t0.j();
        c3t0 c3t0Var = new c3t0(j.g(), obj);
        if (!(j instanceof akt)) {
            c3t0Var.b = new c3t0(1L, obj);
        }
        this.next = c3t0Var;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // defpackage.oz40
    public Object component1() {
        return getValue();
    }

    @Override // defpackage.oz40
    public tls component2() {
        return new quq0(29, this);
    }

    public final Object getDebuggerDisplayValue() {
        return ((c3t0) q2t0.h(this.next)).c;
    }

    @Override // defpackage.g5u0
    public j5u0 getFirstStateRecord() {
        return this.next;
    }

    @Override // defpackage.b3t0
    public e3t0 getPolicy() {
        return this.policy;
    }

    @Override // defpackage.m3u0
    public Object getValue() {
        return ((c3t0) q2t0.t(this.next, this)).c;
    }

    @Override // defpackage.g5u0
    public j5u0 mergeRecords(j5u0 j5u0Var, j5u0 j5u0Var2, j5u0 j5u0Var3) {
        if (getPolicy().f(((c3t0) j5u0Var2).c, ((c3t0) j5u0Var3).c)) {
            return j5u0Var2;
        }
        getPolicy().getClass();
        return null;
    }

    @Override // defpackage.g5u0
    public void prependStateRecord(j5u0 j5u0Var) {
        this.next = (c3t0) j5u0Var;
    }

    @Override // defpackage.oz40
    public void setValue(Object obj) {
        i2t0 j;
        c3t0 c3t0Var = (c3t0) q2t0.h(this.next);
        if (getPolicy().f(c3t0Var.c, obj)) {
            return;
        }
        c3t0 c3t0Var2 = this.next;
        synchronized (q2t0.c) {
            j = q2t0.j();
            ((c3t0) q2t0.o(c3t0Var2, this, j, c3t0Var)).c = obj;
        }
        q2t0.n(j, this);
    }

    public String toString() {
        return "MutableState(value=" + ((c3t0) q2t0.h(this.next)).c + ")@" + hashCode();
    }
}
