package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;

/* compiled from: ClipsAuthorsPickerInteractor.kt */
/* loaded from: classes14.dex */
public interface rhd {
    void a();

    void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    void c(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    io.reactivex.rxjava3.core.q<dhd> d();

    View e(Context context);

    chd f();

    io.reactivex.rxjava3.core.x<Optional<Pair<dhd, List<Group>>>> g();

    void h(chd chdVar, boolean z);

    void i();

    View w1(Context context);

    /* compiled from: ClipsAuthorsPickerInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final rhd STUB = new C3609a();

        public final rhd getSTUB() {
            return STUB;
        }

        /* compiled from: ClipsAuthorsPickerInteractor.kt */
        /* renamed from: xsna.rhd$a$a, reason: collision with other inner class name */
        public static final class C3609a implements rhd {
            @Override // xsna.rhd
            public final io.reactivex.rxjava3.core.q<dhd> d() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.rhd
            public final View e(Context context) {
                return null;
            }

            @Override // xsna.rhd
            public final chd f() {
                return null;
            }

            @Override // xsna.rhd
            public final io.reactivex.rxjava3.core.x<Optional<Pair<dhd, List<Group>>>> g() {
                return io.reactivex.rxjava3.core.x.k(Optional.empty());
            }

            @Override // xsna.rhd
            public final View w1(Context context) {
                return null;
            }

            @Override // xsna.rhd
            public final void a() {
            }

            @Override // xsna.rhd
            public final void i() {
            }

            @Override // xsna.rhd
            public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            }

            @Override // xsna.rhd
            public final void c(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            }

            @Override // xsna.rhd
            public final void h(chd chdVar, boolean z) {
            }
        }
    }
}
