package xsna;

/* compiled from: VkAuthGetContinuationForServiceResponse.kt */
/* loaded from: classes6.dex */
public final class fcu0 {
    public final String a;

    public fcu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcu0) && epx.f(this.a, ((fcu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkAuthGetContinuationForServiceResponse(superappToken="), this.a, ')');
    }
}
