package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsAdVideoExt.kt */
/* loaded from: classes17.dex */
public abstract class xzc {

    /* compiled from: ClipsAdVideoExt.kt */
    public static final class a extends xzc {
        public final int a;
        public final UserId b;

        public a(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FakeVideoFakeOwner(videoId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsAdVideoExt.kt */
    public static final class b extends xzc {
        public final int a;
        public final UserId b;
        public final UserId c;

        public b(int i, UserId userId, UserId userId2) {
            this.a = i;
            this.b = userId;
            this.c = userId2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FakeVideoFakeOwnerButRealOwnerInAdsInfo(videoId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", adsInfoOwnerId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsAdVideoExt.kt */
    public static final class c extends xzc {
        public final int a;
        public final UserId b;

        public c(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RealVideoRealOwner(videoId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }
    }
}
