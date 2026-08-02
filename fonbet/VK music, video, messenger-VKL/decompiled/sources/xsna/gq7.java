package xsna;

/* compiled from: BookingEditScreenRender.kt */
/* loaded from: classes18.dex */
public final class gq7 {
    public final Exception a;
    public final com.vk.ecomm.onlinebooking.impl.edit.a b;

    public gq7(Exception exc, com.vk.ecomm.onlinebooking.impl.edit.a aVar) {
        this.a = exc;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq7)) {
            return false;
        }
        gq7 gq7Var = (gq7) obj;
        return epx.f(this.a, gq7Var.a) && epx.f(this.b, gq7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(error=" + this.a + ", action=" + this.b + ')';
    }
}
