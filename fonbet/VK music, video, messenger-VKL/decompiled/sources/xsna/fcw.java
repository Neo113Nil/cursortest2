package xsna;

import com.vk.im.engine.models.search.SearchEntrypoint;

/* compiled from: ImSearchRepository.kt */
/* loaded from: classes2.dex */
public interface fcw {

    /* compiled from: ImSearchRepository.kt */
    public static final class a {
        public final String a;
        public final Long b;
        public final String c;
        public final SearchEntrypoint d;

        public a(String str, Long l, String str2, SearchEntrypoint searchEntrypoint) {
            this.a = str;
            this.b = l;
            this.c = str2;
            this.d = searchEntrypoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Long l = this.b;
            return this.d.hashCode() + urd0.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "SearchRequest(query=" + this.a + ", peerId=" + this.b + ", searchQuid=" + this.c + ", service=" + this.d + ')';
        }
    }

    io.reactivex.rxjava3.core.x<gcw> a(a aVar, Object obj);
}
