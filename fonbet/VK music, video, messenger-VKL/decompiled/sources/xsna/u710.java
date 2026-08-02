package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.List;

/* compiled from: MarketLinkedContentViewState.kt */
/* loaded from: classes18.dex */
public final class u710 implements lm50 {
    public final a b;
    public final long c;
    public final UserId d;
    public final boolean e;

    /* compiled from: MarketLinkedContentViewState.kt */
    public interface a extends lm50 {

        /* compiled from: MarketLinkedContentViewState.kt */
        /* renamed from: xsna.u710$a$a, reason: collision with other inner class name */
        public static final class C3787a implements a {
            public final boolean b;
            public final boolean c;
            public final List<MediaContentItem> d;
            public final int e;

            public C3787a() {
                throw null;
            }

            public C3787a(int i, boolean z, List list, boolean z2) {
                this.b = z;
                this.c = z2;
                this.d = list;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3787a)) {
                    return false;
                }
                C3787a c3787a = (C3787a) obj;
                return this.b == c3787a.b && this.c == c3787a.c && epx.f(this.d, c3787a.d) && this.e == c3787a.e;
            }

            public final int hashCode() {
                int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
                List<MediaContentItem> list = this.d;
                return Integer.hashCode(this.e) + ((b + (list == null ? 0 : list.hashCode())) * 961);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(isLoading=");
                sb.append(this.b);
                sb.append(", isRefreshing=");
                sb.append(this.c);
                sb.append(", items=");
                sb.append(this.d);
                sb.append(", trackedItems=null, totalCount=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: MarketLinkedContentViewState.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1264592788;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: MarketLinkedContentViewState.kt */
        public static final class c implements a {
            public final Throwable b;

            public c(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.b, ')');
            }
        }

        /* compiled from: MarketLinkedContentViewState.kt */
        public static final class d implements a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1758399939;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public u710(a aVar, long j, UserId userId, boolean z) {
        this.b = aVar;
        this.c = j;
        this.d = userId;
        this.e = z;
    }
}
