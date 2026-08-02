package xsna;

/* compiled from: MoneySendTransfer.kt */
/* loaded from: classes15.dex */
public final class ijp0 extends s730 {
    public final String a;

    public ijp0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijp0) && epx.f(this.a, ((ijp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TransferIdResponse(id="), this.a, ')');
    }
}
