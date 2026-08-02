package xsna;

import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;

/* compiled from: ClipsPaginator.kt */
/* loaded from: classes17.dex */
public interface kpe {

    /* compiled from: ClipsPaginator.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final kpe STUB = new C3194a();

        /* compiled from: ClipsPaginator.kt */
        /* renamed from: xsna.kpe$a$a, reason: collision with other inner class name */
        public static final class C3194a implements kpe {
            @Override // xsna.kpe
            public final io.reactivex.rxjava3.core.x<apd> a(ClipsDecorationPaginationKey clipsDecorationPaginationKey, int i, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final kpe getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x<apd> a(ClipsDecorationPaginationKey clipsDecorationPaginationKey, int i, boolean z);
}
