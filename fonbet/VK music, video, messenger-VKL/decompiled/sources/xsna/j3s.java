package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: FollowersListPatch.kt */
/* loaded from: classes15.dex */
public abstract class j3s {

    /* compiled from: FollowersListPatch.kt */
    public static final class a extends j3s {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            Integer.hashCode(0);
            throw null;
        }

        public final String toString() {
            return "NewFollowers(newFollowersCount=0, items=null)";
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static final class b extends j3s {
        public final int a;
        public final List<RequestUserProfile> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, List<? extends RequestUserProfile> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OtherFollowers(otherFollowersCount=");
            sb.append(this.a);
            sb.append(", items=");
            return ms9.a(')', sb, this.b);
        }
    }
}
