package xsna;

import com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReviewFriendsPatch.kt */
/* loaded from: classes18.dex */
public interface phg0 extends xl50 {

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class a implements phg0 {
        public final List<ReviewFriendsModel> b;

        public a(List<ReviewFriendsModel> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ErrorLoadingNextPageDataPatch(friends="), this.b);
        }
    }

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class b implements phg0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ErrorPatch(error="), this.b, ')');
        }
    }

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class c implements phg0 {
        public final ArrayList b;
        public final int c;
        public final boolean d;
        public final int e;

        public c(int i, int i2, ArrayList arrayList, boolean z) {
            this.b = arrayList;
            this.c = i;
            this.d = z;
            this.e = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FirstPageDataPatch(data=");
            sb.append(this.b);
            sb.append(", total=");
            sb.append(this.c);
            sb.append(", hasNext=");
            sb.append(this.d);
            sb.append(", nextOffset=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class d implements phg0 {
        public static final d b = new d();
    }

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class e implements phg0 {
        public static final e b = new e();
    }

    /* compiled from: ReviewFriendsPatch.kt */
    public static final class f implements phg0 {
        public final List<ReviewFriendsModel> b;
        public final int c;
        public final boolean d;
        public final int e;

        public f(List<ReviewFriendsModel> list, int i, boolean z, int i2) {
            this.b = list;
            this.c = i;
            this.d = z;
            this.e = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextPageDataPatch(data=");
            sb.append(this.b);
            sb.append(", total=");
            sb.append(this.c);
            sb.append(", hasNext=");
            sb.append(this.d);
            sb.append(", nextOffset=");
            return vu5.b(sb, this.e, ')');
        }
    }
}
