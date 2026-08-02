package xsna;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class zic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final String b;

    public zic0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zic0) && epx.f(this.b, ((zic0) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("UpdateDonutTeaserText(donutTeaserText="), this.b, ')');
    }
}
