package xsna;

import com.vk.media.MediaFilteringStrategy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FilteringUtils.kt */
/* loaded from: classes6.dex */
public interface ifr {

    /* compiled from: FilteringUtils.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ifr STUB = new C3053a();

        /* compiled from: FilteringUtils.kt */
        /* renamed from: xsna.ifr$a$a, reason: collision with other inner class name */
        public static final class C3053a implements ifr {
            @Override // xsna.ifr
            public final vil0 a(List list, MediaFilteringStrategy mediaFilteringStrategy) {
                return new vil0();
            }

            @Override // xsna.ifr
            public final ArrayList b(List list, MediaFilteringStrategy mediaFilteringStrategy) {
                return new ArrayList();
            }
        }

        public final ifr getSTUB() {
            return STUB;
        }
    }

    vil0 a(List list, MediaFilteringStrategy mediaFilteringStrategy);

    ArrayList b(List list, MediaFilteringStrategy mediaFilteringStrategy);
}
