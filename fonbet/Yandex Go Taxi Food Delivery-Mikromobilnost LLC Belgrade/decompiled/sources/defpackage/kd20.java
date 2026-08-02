package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class kd20 implements jms {
    public final /* synthetic */ wls a;

    public kd20(wls wlsVar) {
        this.a = wlsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kd20)) {
            return false;
        }
        return this.a.equals(((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
