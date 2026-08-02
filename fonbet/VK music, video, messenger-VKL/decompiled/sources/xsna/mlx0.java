package xsna;

import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: WhiteboardEvent.kt */
/* loaded from: classes7.dex */
public interface mlx0 {

    /* compiled from: WhiteboardEvent.kt */
    public static final class a implements mlx0 {
        public static final a a = new a();
    }

    /* compiled from: WhiteboardEvent.kt */
    public static final class b implements mlx0 {
        public final MediaOptionState a;
        public final MediaOptionState b;
        public final boolean c;
        public final boolean d;

        public b() {
            this(null, null, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            MediaOptionState mediaOptionState = this.a;
            int hashCode = (mediaOptionState == null ? 0 : mediaOptionState.hashCode()) * 31;
            MediaOptionState mediaOptionState2 = this.b;
            return Boolean.hashCode(this.d) + qoy.b((hashCode + (mediaOptionState2 != null ? mediaOptionState2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MutedHint(newAudioState=");
            sb.append(this.a);
            sb.append(", newVideoState=");
            sb.append(this.b);
            sb.append(", wasAudioEnabled=");
            sb.append(this.c);
            sb.append(", wasVideoEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public b(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, boolean z, boolean z2) {
            this.a = mediaOptionState;
            this.b = mediaOptionState2;
            this.c = z;
            this.d = z2;
        }
    }
}
