package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;

/* compiled from: MarketLinkedContentAction.kt */
/* loaded from: classes18.dex */
public interface q610 extends lj50 {

    /* compiled from: MarketLinkedContentAction.kt */
    public static final class a implements q610 {
        public final UserId b;
        public final long c;
        public final int d;
        public final boolean e;
        public final boolean f;

        public a(UserId userId, long j, int i, boolean z, boolean z2, int i2) {
            i = (i2 & 4) != 0 ? 0 : i;
            z2 = (i2 & 16) != 0 ? false : z2;
            this.b = userId;
            this.c = j;
            this.d = i;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadData(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            sb.append(this.c);
            sb.append(", offset=");
            sb.append(this.d);
            sb.append(", isForce=");
            sb.append(this.e);
            sb.append(", isRefresh=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: MarketLinkedContentAction.kt */
    public static final class b implements q610 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1673069714;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: MarketLinkedContentAction.kt */
    public static final class c implements q610 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1952701818;
        }

        public final String toString() {
            return "OnResume";
        }
    }

    /* compiled from: MarketLinkedContentAction.kt */
    public static final class d implements q610 {
        public final Context b;
        public final MediaContentItem c;

        public d(Context context, MediaContentItem mediaContentItem) {
            this.b = context;
            this.c = mediaContentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OpenMedia(context=" + this.b + ", item=" + this.c + ')';
        }
    }

    /* compiled from: MarketLinkedContentAction.kt */
    public static final class e implements q610 {
        public final MediaContentItem b;

        public e(MediaContentItem mediaContentItem) {
            this.b = mediaContentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TrackItemDisplayed(item=" + this.b + ')';
        }
    }
}
