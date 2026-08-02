package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ListeningTimeCacheRepository.kt */
/* loaded from: classes3.dex */
public interface khz {

    /* compiled from: ListeningTimeCacheRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final khz STUB = new C3182a();

        /* compiled from: ListeningTimeCacheRepository.kt */
        /* renamed from: xsna.khz$a$a, reason: collision with other inner class name */
        public static final class C3182a implements khz {
            @Override // xsna.khz
            public final int g() {
                return 0;
            }

            @Override // xsna.khz
            public final List m(int i, long j) {
                return EmptyList.b;
            }

            @Override // xsna.khz
            public final boolean n(lhz lhzVar) {
                return false;
            }

            @Override // xsna.khz
            public final lhz o() {
                return null;
            }

            @Override // xsna.khz
            public final List q(int i, long j) {
                return EmptyList.b;
            }
        }

        public final khz getSTUB() {
            return STUB;
        }
    }

    int g();

    List m(int i, long j);

    boolean n(lhz lhzVar);

    lhz o();

    List q(int i, long j);
}
