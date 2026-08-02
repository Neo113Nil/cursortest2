package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsFavoritesSnackbarConfig.kt */
/* loaded from: classes16.dex */
public interface t5e {

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class a implements t5e {
        public static final a a = new a();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class b implements t5e {
        public final UserId a;
        public final VideoFile b;

        public b(VideoFile videoFile, UserId userId) {
            this.a = userId;
            this.b = videoFile;
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
            StringBuilder sb = new StringBuilder("ClipAddedToAllClipsSuccess(ownerId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            return lq.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class c implements t5e {
        public static final c a = new c();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class d implements t5e {
        public static final d a = new d();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class e implements t5e {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClipRemovedFromFolderError(clipsCount="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class f implements t5e {
        public final String a;
        public final int b;

        public f(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipRemovedFromFolderSuccess(folderName=");
            sb.append(this.a);
            sb.append(", clipsCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class g implements t5e {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClipsAddedToFolderError(clipsCount="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class h implements t5e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;
        public final int d;
        public final boolean e;

        public h(UserId userId, FavoriteFolderId favoriteFolderId, String str, int i, boolean z) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
            this.d = i;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + shy.a(this.d, urd0.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsAddedToFolderSuccess(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            sb.append(this.c);
            sb.append(", clipsCount=");
            sb.append(this.d);
            sb.append(", withNavigation=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class i implements t5e {
        public final int a;

        public i(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClipsMovedToFolderError(clipsCount="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class j implements t5e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;
        public final int d;

        public j(UserId userId, FavoriteFolderId favoriteFolderId, String str, int i) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && this.d == jVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + urd0.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsMovedToFolderSuccess(ownerId=");
            sb.append(this.a);
            sb.append(", targetFolderId=");
            sb.append(this.b);
            sb.append(", targetFolderName=");
            sb.append(this.c);
            sb.append(", clipsCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class k implements t5e {
        public static final k a = new k();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class l implements t5e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;
        public final gzs<s3q0> d;

        public l(UserId userId, FavoriteFolderId favoriteFolderId, String str, gzs<s3q0> gzsVar) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
            this.d = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c) && epx.f(this.d, lVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FolderCreatedSuccess(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            sb.append(this.c);
            sb.append(", onOpenFolderClicked=");
            return uf3.d(sb, this.d, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class m implements t5e {
        public static final m a = new m();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class n implements t5e {
        public final String a;

        public n(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("FolderDeletedSuccess(folderName="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class o implements t5e {
        public static final o a = new o();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class p implements t5e {
        public static final p a = new p();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class q implements t5e {
        public static final q a = new q();
    }

    /* compiled from: ClipsFavoritesSnackbarConfig.kt */
    public static final class r implements t5e {
        public static final r a = new r();
    }
}
