package xsna;

/* compiled from: MoneySendTransfer.kt */
/* loaded from: classes15.dex */
public final class lmf0 extends s730 {
    public final String a;

    public lmf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmf0) && epx.f(this.a, ((lmf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("RedirectResponse(url="), this.a, ')');
    }
}
