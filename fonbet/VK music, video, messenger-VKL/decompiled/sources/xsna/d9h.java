package xsna;

/* compiled from: CommunityLiveHeaderItemModel.kt */
/* loaded from: classes5.dex */
public final class d9h extends s4h {
    public final l3h b;
    public final gpg c;

    public d9h(l3h l3hVar, gpg gpgVar) {
        this.b = l3hVar;
        this.c = gpgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9h)) {
            return false;
        }
        d9h d9hVar = (d9h) obj;
        return epx.f(this.b, d9hVar.b) && epx.f(this.c, d9hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityLiveHeaderItemModel(common=" + this.b + ", buttonsModel=" + this.c + ')';
    }
}
