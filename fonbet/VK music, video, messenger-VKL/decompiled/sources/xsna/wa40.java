package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: MusicAutoDownloadEvictor.kt */
/* loaded from: classes.dex */
public interface wa40 {
    io.reactivex.rxjava3.core.a a(MusicTrack musicTrack, List<String> list);

    io.reactivex.rxjava3.core.a b(List<String> list);

    void c();

    io.reactivex.rxjava3.core.a d(List<String> list, boolean z);

    /* compiled from: MusicAutoDownloadEvictor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final wa40 STUB = new C3920a();

        public final wa40 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicAutoDownloadEvictor.kt */
        /* renamed from: xsna.wa40$a$a, reason: collision with other inner class name */
        public static final class C3920a implements wa40 {
            @Override // xsna.wa40
            public final io.reactivex.rxjava3.core.a a(MusicTrack musicTrack, List<String> list) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.wa40
            public final io.reactivex.rxjava3.core.a b(List<String> list) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.wa40
            public final io.reactivex.rxjava3.core.a d(List<String> list, boolean z) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.wa40
            public final void c() {
            }
        }
    }
}
