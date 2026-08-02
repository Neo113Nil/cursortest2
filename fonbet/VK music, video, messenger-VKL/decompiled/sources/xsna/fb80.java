package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;

/* compiled from: OnScreenTimeChecker.kt */
/* loaded from: classes17.dex */
public abstract class fb80<K> {
    public final RecyclerView b;
    public final b<K> c;

    /* compiled from: OnScreenTimeChecker.kt */
    public interface a {
        MobileOfficialAppsCoreNavStat$EventScreen provide();
    }

    /* compiled from: OnScreenTimeChecker.kt */
    public interface b<K> {
        void d(NewsEntry newsEntry, c cVar);

        void n(K k, long j, long j2);
    }

    /* compiled from: OnScreenTimeChecker.kt */
    public static final class c {
        public final long a;
        public final SchemeStat$TypeFeedItem.StateAsync b;
        public final long c;
        public final long d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;
        public final MobileOfficialAppsCoreNavStat$EventScreen i;
        public final SchemeStat$TypeFeedItem.NetworkQuality j;

        public c(long j, SchemeStat$TypeFeedItem.StateAsync stateAsync, long j2, long j3, int i, int i2, int i3, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeFeedItem.NetworkQuality networkQuality) {
            this.a = j;
            this.b = stateAsync;
            this.c = j2;
            this.d = j3;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z;
            this.i = mobileOfficialAppsCoreNavStat$EventScreen;
            this.j = networkQuality;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j;
        }

        public final int hashCode() {
            return this.j.hashCode() + ((this.i.hashCode() + qoy.b(shy.a(this.g, shy.a(this.f, shy.a(this.e, bh10.a(bh10.a((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31), 31), 31), 31, this.h)) * 31);
        }

        public final String toString() {
            return "TimeEvent(timeMs=" + this.a + ", stateAsync=" + this.b + ", startTimeMs=" + this.c + ", endTimeMs=" + this.d + ", position=" + this.e + ", width=" + this.f + ", height=" + this.g + ", isImportant=" + this.h + ", screenName=" + this.i + ", networkQuality=" + this.j + ')';
        }
    }

    public fb80(RecyclerView recyclerView, b<K> bVar) {
        this.b = recyclerView;
        this.c = bVar;
    }
}
