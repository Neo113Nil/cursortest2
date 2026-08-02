package defpackage;

/* loaded from: classes11.dex */
public final class myo {
    public final Object a;
    public final int b;

    public myo(int i, wt10 wt10Var) {
        this.a = wt10Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof myo)) {
            return false;
        }
        myo myoVar = (myo) obj;
        return this.a == myoVar.a && this.b == myoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
