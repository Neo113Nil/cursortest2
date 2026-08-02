package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface h3e {

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class a implements h3e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final tlo0.f c;
        public final FavoriteFolderId d;
        public final tlo0.h e;

        public a(UserId userId, FavoriteFolderId favoriteFolderId, tlo0.f fVar, FavoriteFolderId favoriteFolderId2, tlo0.h hVar) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = fVar;
            this.d = favoriteFolderId2;
            this.e = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && epx.f(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.a.hashCode() + ((this.d.hashCode() + shy.a(this.c.a, (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddClipsPicker(ownerId=");
            sb.append(this.a);
            sb.append(", sourceFolderId=");
            sb.append(this.b);
            sb.append(", sourceFolderName=");
            sb.append(this.c);
            sb.append(", targetFolderId=");
            sb.append(this.d);
            sb.append(", targetFolderName=");
            return jq.c(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class b implements h3e {
        public static final b a = new b();
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class c implements h3e {
        public final List<ClipFeedTab> a;
        public final kwc b;
        public final String c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends ClipFeedTab> list, kwc kwcVar, String str) {
            this.a = list;
            this.b = kwcVar;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip(tabs=");
            sb.append(this.a);
            sb.append(", initialData=");
            sb.append(this.b);
            sb.append(", videoFileUniqueKey=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class d implements h3e {
        public static final d a = new d();
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class e implements h3e {
        public final tlo0.f a;

        public e(tlo0.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a);
        }

        public final String toString() {
            return pr.b(new StringBuilder("DeleteContentConfirmationDialog(description="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class f implements h3e {
        public final tlo0 a;

        public f(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bt.a(new StringBuilder("DeleteFolderConfirmationDialog(description="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class g implements h3e {
        public final UserId a;
        public final FavoriteFolderId.Id b;
        public final String c;

        public g(UserId userId, FavoriteFolderId.Id id, String str) {
            this.a = userId;
            this.b = id;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RenameFolderDialog(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListNavigationEvent.kt */
    public static final class h implements h3e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final List<VideoFile> c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(UserId userId, FavoriteFolderId favoriteFolderId, List<? extends VideoFile> list) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TargetFolderPicker(ownerId=");
            sb.append(this.a);
            sb.append(", sourceFolderId=");
            sb.append(this.b);
            sb.append(", videos=");
            return ms9.a(')', sb, this.c);
        }
    }
}
