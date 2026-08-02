package xsna;

/* compiled from: GoodPreviewButtonsItemRefactored.kt */
/* loaded from: classes18.dex */
public final class a1i0 {
    public final String a;

    public a1i0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1i0) && epx.f(this.a, ((a1i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SecondaryPreviewState(title="), this.a, ')');
    }
}
