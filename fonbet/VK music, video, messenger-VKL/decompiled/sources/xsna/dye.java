package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.zxe;

/* compiled from: ClipsProfileToolbarPatch.kt */
/* loaded from: classes17.dex */
public interface dye extends xl50 {

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class a implements dye {
        public final boolean b;
        public final UserId c;

        public a(UserId userId, boolean z) {
            this.b = z;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(isOwnerGrid=");
            sb.append(this.b);
            sb.append(", initialAuthorId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class b implements dye {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(isOwner="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class c implements dye {
        public final zxe.d b;

        public c(zxe.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OtherUserSubscribeButtonsUpdated(newState=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class d implements dye {
        public final int b;
        public final List<BaseImageDto> c;

        public d(int i, List<BaseImageDto> list) {
            this.b = i;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceholderImageLoaded(addProfilePageIndex=");
            sb.append(this.b);
            sb.append(", images=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class e implements dye {
        public final List<hud0> b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends hud0> list, int i) {
            this.b = list;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilesUpdated(profiles=");
            sb.append(this.b);
            sb.append(", initialIndex=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarPatch.kt */
    public static final class f implements dye {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1236462170;
        }

        public final String toString() {
            return "Reset";
        }
    }
}
