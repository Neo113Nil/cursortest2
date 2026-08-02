package xsna;

import ru.ok.android.webrtc.media_options.MediaOption;

/* compiled from: MediaSettingDialogOpen.kt */
/* loaded from: classes7.dex */
public abstract class jy10 {

    /* compiled from: MediaSettingDialogOpen.kt */
    public static final class a extends jy10 {
        public final MediaOption a;

        public a(MediaOption mediaOption) {
            this.a = mediaOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Call(mediaOption=" + this.a + ')';
        }
    }

    /* compiled from: MediaSettingDialogOpen.kt */
    public static final class b extends jy10 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Participant(mediaOption=");
            sb.append((Object) null);
            sb.append(", id=null, nameGen=");
            return ho8.a(sb, null, ')');
        }
    }
}
