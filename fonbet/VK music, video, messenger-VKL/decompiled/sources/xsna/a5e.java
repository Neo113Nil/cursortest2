package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;

/* compiled from: ClipsFavoritesFoldersPickerSnackbarEvent.kt */
/* loaded from: classes16.dex */
public interface a5e {

    /* compiled from: ClipsFavoritesFoldersPickerSnackbarEvent.kt */
    public static final class a implements a5e {
        public final FavoriteFolderId a;
        public final String b;

        public a(FavoriteFolderId favoriteFolderId, String str) {
            this.a = favoriteFolderId;
            this.b = str;
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

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FolderCreated(folderId=");
            sb.append(this.a);
            sb.append(", folderName=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
