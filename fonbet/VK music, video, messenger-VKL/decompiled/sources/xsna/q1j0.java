package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.OrdData;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsResult;
import java.util.List;

/* compiled from: SettingsEvent.kt */
/* loaded from: classes7.dex */
public interface q1j0 extends pk50 {

    /* compiled from: SettingsEvent.kt */
    public static final class a implements q1j0 {
        public final SettingsResult a;

        public a(SettingsResult settingsResult) {
            this.a = settingsResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Close(result=" + this.a + ')';
        }
    }

    /* compiled from: SettingsEvent.kt */
    public static final class b implements q1j0 {
        public final VideoFile a;

        public b(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("OpenClipPreview(clip="), this.a, ')');
        }
    }

    /* compiled from: SettingsEvent.kt */
    public static final class c implements q1j0 {
        public final List<VideoFile> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends VideoFile> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OpenClipsSelector(attachedClips="), this.a);
        }
    }

    /* compiled from: SettingsEvent.kt */
    public static final class d implements q1j0 {
        public final OrdData a;

        public d(OrdData ordData) {
            this.a = ordData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            OrdData ordData = this.a;
            if (ordData == null) {
                return 0;
            }
            return ordData.hashCode();
        }

        public final String toString() {
            return "OpenOrd(ordData=" + this.a + ')';
        }
    }

    /* compiled from: SettingsEvent.kt */
    public static final class e implements q1j0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1126435562;
        }

        public final String toString() {
            return "OpenSmartCrop";
        }
    }
}
