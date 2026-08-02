package xsna;

/* compiled from: VoipApiConfig.kt */
/* loaded from: classes7.dex */
public final class ydw0 {
    public final int a;

    public ydw0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydw0) && this.a == ((ydw0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("VoipApiConfig(apiAppId="), this.a, ')');
    }
}
