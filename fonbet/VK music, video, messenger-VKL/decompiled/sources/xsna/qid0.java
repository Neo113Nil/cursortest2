package xsna;

/* compiled from: ClipCarouselAttachesItem.kt */
/* loaded from: classes18.dex */
public final class qid0 extends qmc {
    public final vnd0 c;

    public qid0(vnd0 vnd0Var) {
        super(0);
        this.c = vnd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qid0) && epx.f(this.c, ((qid0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "ProductAttachesItem(productClipAttachUiDto=" + this.c + ')';
    }
}
