package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsCoauthorsUiProvider.kt */
/* loaded from: classes16.dex */
public interface jnd {

    /* compiled from: ClipsCoauthorsUiProvider.kt */
    public interface a {

        /* compiled from: ClipsCoauthorsUiProvider.kt */
        /* renamed from: xsna.jnd$a$a, reason: collision with other inner class name */
        public static final class C3128a implements a {
            public static final C3128a a = new C3128a();
        }

        /* compiled from: ClipsCoauthorsUiProvider.kt */
        public static final class b implements a {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }
        }
    }

    io.reactivex.rxjava3.core.q a(Integer num, List list);

    void b(a aVar, uh3 uh3Var);

    void c();
}
