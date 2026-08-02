package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import xsna.chd;

/* compiled from: ClipsAuthorItemData.kt */
/* loaded from: classes14.dex */
public interface dhd {

    /* compiled from: ClipsAuthorItemData.kt */
    public static final class a implements dhd {
        public final chd.b a;
        public final Group b;
        public final UserId c;
        public final String d;

        public a(chd.b bVar, Group group) {
            this.a = bVar;
            this.b = group;
            this.c = bVar.a;
            this.d = group.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        @Override // xsna.dhd
        public final UserId getId() {
            return this.c;
        }

        @Override // xsna.dhd
        public final String getName() {
            return this.d;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "GroupItemData(groupItem=" + this.a + ", group=" + this.b + ')';
        }
    }

    /* compiled from: ClipsAuthorItemData.kt */
    public static final class b implements dhd {
        public static final b a = new b();

        @Override // xsna.dhd
        public final UserId getId() {
            return null;
        }

        @Override // xsna.dhd
        public final String getName() {
            return "";
        }
    }

    /* compiled from: ClipsAuthorItemData.kt */
    public static final class c implements dhd {
        public final chd.d a;
        public final UserId b;
        public final String c;

        public c(chd.d dVar) {
            this.a = dVar;
            this.b = dVar.c;
            this.c = dVar.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        @Override // xsna.dhd
        public final UserId getId() {
            return this.b;
        }

        @Override // xsna.dhd
        public final String getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "UserItemData(userItem=" + this.a + ')';
        }
    }

    UserId getId();

    String getName();
}
