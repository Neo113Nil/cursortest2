package xsna;

import com.vk.dto.music.MusicTrack;
import kotlin.NotImplementedError;

/* compiled from: AudioSnippetInteractor.kt */
/* loaded from: classes3.dex */
public interface lx4 {

    /* compiled from: AudioSnippetInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final lx4 STUB = new C3309a();

        /* compiled from: AudioSnippetInteractor.kt */
        /* renamed from: xsna.lx4$a$a, reason: collision with other inner class name */
        public static final class C3309a implements lx4 {
            @Override // xsna.lx4
            public final io.reactivex.rxjava3.core.x a() {
                return io.reactivex.rxjava3.core.x.i(new NotImplementedError());
            }

            @Override // xsna.lx4
            public final io.reactivex.rxjava3.core.x<i600> b(MusicTrack musicTrack) {
                return io.reactivex.rxjava3.core.x.i(new NotImplementedError());
            }
        }

        public final lx4 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x a();

    io.reactivex.rxjava3.core.x<i600> b(MusicTrack musicTrack);
}
