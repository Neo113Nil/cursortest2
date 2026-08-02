package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a3p0;

/* compiled from: ClipsProfileToolbarAction.kt */
/* loaded from: classes17.dex */
public interface ixe extends kj50 {

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class a implements x {
        public final ClipGridParams.Data.Profile b;

        public a(ClipGridParams.Data.Profile profile) {
            this.b = profile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "ActiveProfileChanged(user=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class b implements x {
        public static final b b = new b();
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class c implements x {
        public final ClipsAuthor b;

        public c(ClipsAuthor clipsAuthor) {
            this.b = clipsAuthor;
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
            return "AvatarClicked(user=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public interface d extends ixe {
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class e implements x {
        public final yxe b;

        public e(yxe yxeVar) {
            this.b = yxeVar;
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
            return "ButtonClicked(button=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class f implements w {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public f(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonsStateUpdated(isBlacklisted=");
            sb.append(this.b);
            sb.append(", isSubscribed=");
            sb.append(this.c);
            sb.append(", canSendMessages=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class g implements x {
        public final ClipsAuthor b;
        public final CounterType c;

        public g(ClipsAuthor clipsAuthor, CounterType counterType) {
            this.b = clipsAuthor;
            this.c = counterType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "CounterClick(user=" + this.b + ", type=" + this.c + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class h implements w {
        public final List<ClipGridParams.Data.Profile> b;
        public final List<UserId> c;
        public final FunctionReferenceImpl d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<ClipGridParams.Data.Profile> list, List<UserId> list2, wzs<? super String, ? super Boolean, s8u0> wzsVar) {
            this.b = list;
            this.c = list2;
            this.d = (FunctionReferenceImpl) wzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d.equals(hVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "CurrentUserProfilesUpdated(profiles=" + this.b + ", selectedIds=" + this.c + ", descriptionProvider=" + this.d + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class i implements x {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DescriptionLinkClicked(string="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class j implements d {
        public final boolean b;
        public final UserId c;

        public j(UserId userId, boolean z) {
            this.b = z;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(isOwnerGrid=");
            sb.append(this.b);
            sb.append(", selectedProfileId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public interface k extends ixe {
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class l implements w {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LoadingStarted(isOwner="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class m implements x {
        public final a3p0.c b;

        public m(a3p0.c cVar) {
            this.b = cVar;
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
            return "OpenAnonProfile(data=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class n implements w {
        public final UserId b;

        public n(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenDescriptionRequested(id="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class o implements x {
        public final ClipsAuthor b;

        public o(ClipsAuthor clipsAuthor) {
            this.b = clipsAuthor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenMainProfileRequested(user=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class p implements w {
        public final ClipGridParams.Data.Profile b;
        public final FunctionReferenceImpl c;

        /* JADX WARN: Multi-variable type inference failed */
        public p(ClipGridParams.Data.Profile profile, wzs<? super String, ? super Boolean, s8u0> wzsVar) {
            this.b = profile;
            this.c = (FunctionReferenceImpl) wzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.b, pVar.b) && this.c.equals(pVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.b.hashCode() * 31);
        }

        public final String toString() {
            return "OtherUserProfileUpdated(data=" + this.b + ", descriptionProvider=" + this.c + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class q implements k {
        public final List<BaseImageDto> b;

        public q(List<BaseImageDto> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("PlaceholderImageLoaded(sizes="), this.b);
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class r implements w {
        public final ClipsAuthor b;

        public r(ClipsAuthor clipsAuthor) {
            this.b = clipsAuthor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ProfileStatusClicked(user=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class s implements d {
        public static final s b = new s();
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class t implements w {
        public final UserId b;

        public t(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.b, ((t) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ShareRequested(id="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class u implements x {
        public final ClipsAuthor b;
        public final String c;
        public final boolean d;

        public u(ClipsAuthor clipsAuthor, String str, boolean z) {
            this.b = clipsAuthor;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.b, uVar.b) && epx.f(this.c, uVar.c) && this.d == uVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowFullDescriptionClicked(user=");
            sb.append(this.b);
            sb.append(", currentFormattedDescription=");
            sb.append(this.c);
            sb.append(", isEditable=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public static final class v implements w {
        public final boolean b;

        public v(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.b == ((v) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SubscribeButtonAvailabilityChanged(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public interface w extends ixe {
    }

    /* compiled from: ClipsProfileToolbarAction.kt */
    public interface x extends ixe {
    }
}
