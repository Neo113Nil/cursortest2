package xsna;

/* compiled from: GoodPreviewButtonsItemRefactored.kt */
/* loaded from: classes18.dex */
public final class qx9 {
    public final boolean a;

    public qx9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx9) && this.a == ((qx9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CartPreviewState(isInCart="), this.a, ')');
    }
}
