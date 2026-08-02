package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
/* loaded from: classes16.dex */
public interface nue extends kj50 {

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class a implements nue {
        public final UserId b;

        public a(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("FullReload(ownerId="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class b implements nue {
        public final ShortVideoGetPlaylistsResponseDto b;
        public final boolean c;
        public final UserId d;

        public b(ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto, boolean z, UserId userId) {
            this.b = shortVideoGetPlaylistsResponseDto;
            this.c = z;
            this.d = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d.b) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemsLoaded(response=");
            sb.append(this.b);
            sb.append(", isOwner=");
            sb.append(this.c);
            sb.append(", ownerId=");
            return gp.b(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class c implements nue {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class d implements nue {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnItemClick(id="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class e implements nue {
        public static final e b = new e();
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class f implements nue {
        public final ClipsPlaylistsSmallFoldersLaunchParams b;

        public f(ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams) {
            this.b = clipsPlaylistsSmallFoldersLaunchParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Open(inputParams=" + this.b + ')';
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class g implements nue {
        public final UserId b;
        public final boolean c;

        public g(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
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
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResetForUser(userId=");
            sb.append(this.b);
            sb.append(", isOwner=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersAction.kt */
    public static final class h implements nue {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateTopPadding(hasPadding="), this.b, ')');
        }
    }
}
