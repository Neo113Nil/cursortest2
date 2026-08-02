package xsna;

/* compiled from: OnDialogsCountSettingsUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class s480 extends sxp {
    public final Object b;

    public s480(Object obj) {
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
        return (obj instanceof s480) && epx.f(this.b, ((s480) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("OnDialogsCountSettingsUpdateEvent(changerTag="), this.b, ')');
    }
}
