package xsna;

import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: VideoMusicMixInteractor.kt */
/* loaded from: classes6.dex */
public interface nxs0 {

    /* compiled from: VideoMusicMixInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final nxs0 STUB = new C3424a();

        /* compiled from: VideoMusicMixInteractor.kt */
        /* renamed from: xsna.nxs0$a$a, reason: collision with other inner class name */
        public static final class C3424a implements nxs0 {
            @Override // xsna.nxs0
            public final Object a(String str, spj<? super Result<mxs0>> spjVar) {
                return new mxs0(EmptyList.b);
            }
        }

        public final nxs0 getSTUB() {
            return STUB;
        }
    }

    Object a(String str, spj<? super Result<mxs0>> spjVar);
}
