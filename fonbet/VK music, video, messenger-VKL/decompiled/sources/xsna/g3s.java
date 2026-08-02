package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: FollowersListContent.kt */
/* loaded from: classes15.dex */
public abstract class g3s {

    /* compiled from: FollowersListContent.kt */
    public static final class a extends g3s {
        public final int a;
        public final int b;
        public final List<RequestUserProfile> c;
        public final List<RequestUserProfile> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, List<? extends RequestUserProfile> list, List<? extends RequestUserProfile> list2) {
            this.a = i;
            this.b = i2;
            this.c = list;
            this.d = list2;
        }

        public static a a(a aVar, int i, int i2, List list, List list2, int i3) {
            if ((i3 & 1) != 0) {
                i = aVar.a;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.b;
            }
            if ((i3 & 4) != 0) {
                list = aVar.c;
            }
            if ((i3 & 8) != 0) {
                list2 = aVar.d;
            }
            aVar.getClass();
            return new a(i, i2, list, list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + fw3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AllFollowers(newFollowersCount=");
            sb.append(this.a);
            sb.append(", otherFollowersCount=");
            sb.append(this.b);
            sb.append(", newFollowers=");
            sb.append(this.c);
            sb.append(", otherFollowers=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: FollowersListContent.kt */
    public static final class b extends g3s {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NewFollowers(newFollowers=null, recommended=null)";
        }
    }
}
