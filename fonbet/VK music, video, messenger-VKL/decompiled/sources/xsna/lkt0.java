package xsna;

import android.content.Context;
import java.io.File;
import kotlin.collections.EmptyList;

/* compiled from: VideoToClipsProvider.kt */
/* loaded from: classes14.dex */
public interface lkt0 {
    void a(Context context);

    io.reactivex.rxjava3.core.x b(File file, ikt0 ikt0Var);

    /* compiled from: VideoToClipsProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final lkt0 STUB = new C3272a();

        public final lkt0 getSTUB() {
            return STUB;
        }

        /* compiled from: VideoToClipsProvider.kt */
        /* renamed from: xsna.lkt0$a$a, reason: collision with other inner class name */
        public static final class C3272a implements lkt0 {
            @Override // xsna.lkt0
            public final io.reactivex.rxjava3.core.x b(File file, ikt0 ikt0Var) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.lkt0
            public final void a(Context context) {
            }
        }
    }
}
