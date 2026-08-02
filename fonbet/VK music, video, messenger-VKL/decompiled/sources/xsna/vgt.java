package xsna;

/* compiled from: GapComposer.kt */
/* loaded from: classes11.dex */
public final class vgt implements evi {
    public final bvi b;

    public vgt(bvi bviVar) {
        this.b = bviVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vgt) {
            return epx.f(this.b, ((vgt) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
