package xsna;

/* compiled from: AudioBookBoolResponse.kt */
/* loaded from: classes18.dex */
public final class nd4 {
    public final boolean a;

    public nd4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd4) && this.a == ((nd4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("AudioBookBoolResponse(isSuccess="), this.a, ')');
    }
}
