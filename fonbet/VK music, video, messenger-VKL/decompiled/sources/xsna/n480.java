package xsna;

/* compiled from: OnDialogThemeStorageChangeEvent.kt */
/* loaded from: classes2.dex */
public final class n480 extends sxp {
    public final Object b;

    public n480(Object obj) {
        this.b = obj;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n480) && epx.f(this.b, ((n480) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("OnDialogThemeStorageChangeEvent(changerTag="), this.b, ')');
    }
}
