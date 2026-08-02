package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;

/* compiled from: CommunityRepliesPatch.kt */
/* loaded from: classes18.dex */
public interface pwh extends xl50 {

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class a implements pwh {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeHasEditorRole(isEditor="), this.b, ')');
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class b implements pwh {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -430173339;
        }

        public final String toString() {
            return "DataOnScreenChanged";
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class c implements pwh {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1625824274;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class d implements pwh {
        public final int b;
        public final txh c;
        public final LinkedHashMap d;
        public final int e;
        public final MapBuilder f;

        public d(int i, txh txhVar, LinkedHashMap linkedHashMap, int i2, MapBuilder mapBuilder) {
            this.b = i;
            this.c = txhVar;
            this.d = linkedHashMap;
            this.e = i2;
            this.f = mapBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c.equals(dVar.c) && this.d.equals(dVar.d) && this.e == dVar.e && this.f.equals(dVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, uf3.b(this.d, (this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31), 31);
        }

        public final String toString() {
            return "InitResult(repliesCount=" + this.b + ", review=" + this.c + ", replies=" + this.d + ", offset=" + this.e + ", usersAndGroups=" + this.f + ')';
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class e implements pwh {
        public final int b;
        public final LinkedHashMap c;
        public final int d;
        public final LinkedHashMap e;

        public e(int i, LinkedHashMap linkedHashMap, int i2, LinkedHashMap linkedHashMap2) {
            this.b = i;
            this.c = linkedHashMap;
            this.d = i2;
            this.e = linkedHashMap2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c.equals(eVar.c) && this.d == eVar.d && this.e.equals(eVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, uf3.b(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        }

        public final String toString() {
            return "LoadPageResult(repliesCount=" + this.b + ", replies=" + this.c + ", offset=" + this.d + ", usersAndGroups=" + this.e + ')';
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class f implements pwh {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1528360542;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class g implements pwh {
        public final Throwable b;

        public g(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("PaginationError(throwable="), this.b, ')');
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class h implements pwh {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1170505471;
        }

        public final String toString() {
            return "Refreshing";
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class i implements pwh {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetScreenSpinnerVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class j implements pwh {
        public final UserId b;
        public final UserId c;
        public final int d;

        public j(int i, UserId userId, UserId userId2) {
            this.b = userId;
            this.c = userId2;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && this.d == jVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetupInitialData(communityId=");
            sb.append(this.b);
            sb.append(", currentUserId=");
            sb.append(this.c);
            sb.append(", reviewId=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class k implements pwh {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -859755779;
        }

        public final String toString() {
            return "StartLoadPage";
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class l implements pwh {
        public final LinkedHashMap b;

        public l(LinkedHashMap linkedHashMap) {
            this.b = linkedHashMap;
        }
    }

    /* compiled from: CommunityRepliesPatch.kt */
    public static final class m implements pwh {
        public final txh b;

        public m(txh txhVar) {
            this.b = txhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateReviewItem(review=" + this.b + ')';
        }
    }
}
