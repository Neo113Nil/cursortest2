package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsFavoriteFoldersListNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface a4e {

    /* compiled from: ClipsFavoriteFoldersListNavigationEvent.kt */
    public static final class a implements a4e {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CreateFolder(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ClipsFavoriteFoldersListNavigationEvent.kt */
    public static final class b implements a4e {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;

        public b(UserId userId, FavoriteFolderId favoriteFolderId, String str) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Folder(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
