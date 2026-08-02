package xsna;

import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class qjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final WallOwner b;
    public final Publisher c;
    public final Signer d;
    public final PostEditableData e;

    public qjc0(WallOwner wallOwner, Publisher publisher, Signer signer, PostEditableData postEditableData) {
        this.b = wallOwner;
        this.c = publisher;
        this.d = signer;
        this.e = postEditableData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc0)) {
            return false;
        }
        qjc0 qjc0Var = (qjc0) obj;
        return epx.f(this.b, qjc0Var.b) && epx.f(this.c, qjc0Var.c) && epx.f(this.d, qjc0Var.d) && epx.f(this.e, qjc0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Publisher publisher = this.c;
        int hashCode2 = (hashCode + (publisher == null ? 0 : publisher.hashCode())) * 31;
        Signer signer = this.d;
        return this.e.hashCode() + ((hashCode2 + (signer != null ? signer.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EditPostLoaded(owner=" + this.b + ", publisher=" + this.c + ", signer=" + this.d + ", editableData=" + this.e + ')';
    }
}
