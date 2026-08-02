package xsna;

import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipVideoAttachmentSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipEditSdkMviEvent.kt */
/* loaded from: classes17.dex */
public interface ysc extends pk50 {

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class a implements ysc {
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class b implements ysc {
        public final List<ClipCoauthorSdkItem> a;
        public final UserId b;
        public final int c;

        public b(UserId userId, int i, List list) {
            this.a = list;
            this.b = userId;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeCoauthorsRequested(currentCoauthors=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", videoId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class c implements ysc {
        public static final c a = new c();
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class d implements ysc {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChangeDescriptionRequested(currentDescription="), this.a, ')');
        }
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class e implements ysc {
        public final SdkClipOrdData a;

        public e(SdkClipOrdData sdkClipOrdData) {
            this.a = sdkClipOrdData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            SdkClipOrdData sdkClipOrdData = this.a;
            if (sdkClipOrdData == null) {
                return 0;
            }
            return sdkClipOrdData.hashCode();
        }

        public final String toString() {
            return "ChangeOrdRequested(currentOrd=" + this.a + ')';
        }
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class f implements ysc {
        public final ClipVideoAttachmentSdkItem a;

        public f(ClipVideoAttachmentSdkItem clipVideoAttachmentSdkItem) {
            this.a = clipVideoAttachmentSdkItem;
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
            return "ChangeVideoAttachRequested(videoData=" + this.a + ')';
        }
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class g implements ysc {
        public static final g a = new g();
    }

    /* compiled from: ClipEditSdkMviEvent.kt */
    public static final class h implements ysc {
        public final ImmutableClipState a;

        public h(ImmutableClipState immutableClipState) {
            this.a = immutableClipState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CloseWithUpdate(result=" + this.a + ')';
        }
    }
}
