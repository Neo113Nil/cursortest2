package xsna;

import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsPlaylistsFoldersAction.kt */
/* loaded from: classes16.dex */
public interface jte extends kj50 {

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public interface a extends jte {
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class b implements jte {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class c implements jte {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class d implements jte {
        public static final d b = new d();
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class e implements jte {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnItemClick(id="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class f implements jte {
        public final int b;
        public final int c;

        public f(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnMove(fromPosition=");
            sb.append(this.b);
            sb.append(", toPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -843620852;
        }

        public final String toString() {
            return "OnNetworkRestored";
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class h implements jte {
        public static final h b = new h();
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class i implements a {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1168710588;
        }

        public final String toString() {
            return "OnScrolledToEnd";
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class j implements jte {
        public final UserId b;

        public j(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnTargetSelected(id="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class k implements jte {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1484433796;
        }

        public final String toString() {
            return "OnTargetSelectionClicked";
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class l implements jte {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1559201082;
        }

        public final String toString() {
            return "OnTargetSelectionDismissed";
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAction.kt */
    public static final class m implements jte {
        public final ClipsPlaylistsFolderLaunchParams.FoldersLaunchType b;
        public final List<UserId> c;

        public m(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType, List<UserId> list) {
            this.b = foldersLaunchType;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Open(launchType=");
            sb.append(this.b);
            sb.append(", availableOwnerIds=");
            return ms9.a(')', sb, this.c);
        }
    }
}
