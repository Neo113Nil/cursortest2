package xsna;

/* compiled from: ClipCarouselAttachesItem.kt */
/* loaded from: classes18.dex */
public final class sbk0 extends qmc {
    public final k20 c;

    public sbk0(k20 k20Var) {
        super(0);
        this.c = k20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbk0) && epx.f(this.c, ((sbk0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "SnippetAttachesItem(snippetClipAttachUiDto=" + this.c + ')';
    }
}
