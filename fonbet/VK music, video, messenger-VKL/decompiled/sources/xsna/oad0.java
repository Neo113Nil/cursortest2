package xsna;

/* compiled from: GoodPreviewButtonsItemRefactored.kt */
/* loaded from: classes18.dex */
public final class oad0 {
    public final String a;

    public oad0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oad0) && epx.f(this.a, ((oad0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PrimaryPreviewState(title="), this.a, ')');
    }
}
