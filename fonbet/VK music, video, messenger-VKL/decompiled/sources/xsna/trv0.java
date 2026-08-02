package xsna;

/* compiled from: ClipCarouselAttachesItem.kt */
/* loaded from: classes18.dex */
public final class trv0 extends qmc {
    public final urv0 c;

    public trv0(urv0 urv0Var) {
        super(0);
        this.c = urv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trv0) && epx.f(this.c, ((trv0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "VkTicketAttachesItem(vkTicketClipAttachUiDto=" + this.c + ')';
    }
}
