package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityWallBus.kt */
/* loaded from: classes5.dex */
public abstract class c5i {

    /* compiled from: CommunityWallBus.kt */
    public static final class a extends c5i {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -640650411;
        }

        public final String toString() {
            return "EndProfileTabOnboarding";
        }
    }

    /* compiled from: CommunityWallBus.kt */
    public static final class b extends c5i {
        public final UserId a;
        public final String b;

        public b(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PrepareTooltip(communityId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityWallBus.kt */
    public static final class c extends c5i {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ProfileDataChanged(communityId="), this.a, ')');
        }
    }
}
