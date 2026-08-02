package xsna;

import android.graphics.Rect;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;

/* compiled from: ClipsVideoAttachmentEvent.kt */
/* loaded from: classes16.dex */
public interface hmf {

    /* compiled from: ClipsVideoAttachmentEvent.kt */
    public static final class a implements hmf {
        public final ClipsVideoAttachmentData a;

        public a(ClipsVideoAttachmentData clipsVideoAttachmentData) {
            this.a = clipsVideoAttachmentData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            ClipsVideoAttachmentData clipsVideoAttachmentData = this.a;
            if (clipsVideoAttachmentData == null) {
                return 0;
            }
            return clipsVideoAttachmentData.hashCode();
        }

        public final String toString() {
            return "Done(data=" + this.a + ')';
        }
    }

    /* compiled from: ClipsVideoAttachmentEvent.kt */
    public static final class b implements hmf {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnBackPressed(hasChanges="), this.a, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentEvent.kt */
    public static final class c implements hmf {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnUnavailableVideoClicked(clipsPerVideoLimit="), this.a, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentEvent.kt */
    public static final class d implements hmf {
        public static final d a = new d();
    }

    /* compiled from: ClipsVideoAttachmentEvent.kt */
    public static final class e implements hmf {
        public final int a;
        public final Rect b;

        public e(int i, Rect rect) {
            this.a = i;
            this.b = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowAlbumSelector(albumId=");
            sb.append(this.a);
            sb.append(", anchorRect=");
            return yq.c(sb, this.b, ')');
        }
    }
}
