package xsna;

import java.util.Date;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class uic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final Date b;

    public uic0(Date date) {
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uic0) && epx.f(this.b, ((uic0) obj).b);
    }

    public final int hashCode() {
        Date date = this.b;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final String toString() {
        return "SetPostponePublish(date=" + this.b + ')';
    }
}
