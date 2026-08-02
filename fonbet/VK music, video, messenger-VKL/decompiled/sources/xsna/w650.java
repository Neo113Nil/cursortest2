package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: MusicSnippetsPatch.kt */
/* loaded from: classes3.dex */
public interface w650 extends xl50 {

    /* compiled from: MusicSnippetsPatch.kt */
    public static final class a implements w650 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: MusicSnippetsPatch.kt */
    public static final class b implements w650 {
        public static final b b = new b();
    }

    /* compiled from: MusicSnippetsPatch.kt */
    public static final class c implements w650 {
        public final List<nck0> b;

        public c(List<nck0> list) {
            this.b = list;
        }
    }

    /* compiled from: MusicSnippetsPatch.kt */
    public static final class d implements w650 {
        public final MusicTrack b;
        public final MusicTrack c;

        public d(MusicTrack musicTrack, MusicTrack musicTrack2) {
            this.b = musicTrack;
            this.c = musicTrack2;
        }
    }

    /* compiled from: MusicSnippetsPatch.kt */
    public static final class e implements w650 {
    }
}
