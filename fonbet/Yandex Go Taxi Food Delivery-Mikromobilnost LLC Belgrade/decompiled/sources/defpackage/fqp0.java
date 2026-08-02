package defpackage;

/* loaded from: classes2.dex */
public final class fqp0 extends crp0 {
    public final String c;

    public fqp0(String str) {
        super("AdjustEventMapping");
        this.c = str;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqp0) && this.c.equals(((fqp0) obj).c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() * 31) - 406163900) * 31;
    }

    public final String toString() {
        return oyr.p("AdjustEventMapping(eventName=", this.c, ", message=failed to map event name to adjust token, payload=null)");
    }
}
