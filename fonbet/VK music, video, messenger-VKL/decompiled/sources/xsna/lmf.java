package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;

/* compiled from: ClipsVideoAttachmentPatch.kt */
/* loaded from: classes16.dex */
public interface lmf extends xl50 {

    /* compiled from: ClipsVideoAttachmentPatch.kt */
    public static final class a implements lmf {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChooseVideoState(chosenVideoId="), this.b, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentPatch.kt */
    public static final class b implements lmf {
        public final VKList<VideoFile> b;

        public b(VKList<VideoFile> vKList) {
            this.b = vKList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NewVideosState(items=" + this.b + ')';
        }
    }

    /* compiled from: ClipsVideoAttachmentPatch.kt */
    public static final class c implements lmf {
        public final int b;
        public final String c;

        public c(int i, String str) {
            this.b = i;
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
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetAlbum(id=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentPatch.kt */
    public static final class d implements lmf {
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
            return vu5.b(new StringBuilder("SetClipsPerVideoLimit(clipsPerVideoLimit="), this.b, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentPatch.kt */
    public static final class e implements lmf {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SetInitialVideo(initialVideo=null)";
        }
    }
}
