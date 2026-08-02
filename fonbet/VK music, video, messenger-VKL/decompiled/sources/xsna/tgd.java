package xsna;

import com.vk.dto.clips.music.ClipsEditorMusicInfo;

/* compiled from: ClipsAudioEvent.kt */
/* loaded from: classes16.dex */
public interface tgd {

    /* compiled from: ClipsAudioEvent.kt */
    public static final class a implements tgd {
        public static final a a = new a();
    }

    /* compiled from: ClipsAudioEvent.kt */
    public static final class b implements tgd {
        public static final b a = new b();
    }

    /* compiled from: ClipsAudioEvent.kt */
    public static final class c implements tgd {
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
            return vu5.b(new StringBuilder("OnCreated(usedHeight="), this.a, ')');
        }
    }

    /* compiled from: ClipsAudioEvent.kt */
    public static final class d implements tgd {
        public final ClipsEditorMusicInfo a;

        public d(ClipsEditorMusicInfo clipsEditorMusicInfo) {
            this.a = clipsEditorMusicInfo;
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
            return "OnReady(musicInfo=" + this.a + ')';
        }
    }

    /* compiled from: ClipsAudioEvent.kt */
    public static final class e implements tgd {
        public static final e a = new e();
    }

    /* compiled from: ClipsAudioEvent.kt */
    public static final class f implements tgd {
        public static final f a = new f();
    }
}
