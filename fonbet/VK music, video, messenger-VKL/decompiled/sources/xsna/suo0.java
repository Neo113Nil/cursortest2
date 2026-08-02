package xsna;

/* compiled from: TimePicker.kt */
@vby
/* loaded from: classes11.dex */
public final class suo0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof suo0) {
            return this.a == ((suo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Hour" : i == 1 ? "Minute" : "";
    }
}
