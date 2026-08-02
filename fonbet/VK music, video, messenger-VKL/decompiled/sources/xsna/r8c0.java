package xsna;

/* compiled from: PostUploadDeps.kt */
/* loaded from: classes4.dex */
public final class r8c0 {
    public final nbq0 a;
    public final com.vk.newsfeed.posting.impl.domain.model.upload.a b;
    public final gfc0 c;

    public r8c0(nbq0 nbq0Var, com.vk.newsfeed.posting.impl.domain.model.upload.a aVar, gfc0 gfc0Var) {
        this.a = nbq0Var;
        this.b = aVar;
        this.c = gfc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8c0)) {
            return false;
        }
        r8c0 r8c0Var = (r8c0) obj;
        return epx.f(this.a, r8c0Var.a) && epx.f(this.b, r8c0Var.b) && epx.f(this.c, r8c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PostUploadDeps(uploadInteractor=" + this.a + ", uploadFilter=" + this.b + ", filesCopier=" + this.c + ')';
    }
}
