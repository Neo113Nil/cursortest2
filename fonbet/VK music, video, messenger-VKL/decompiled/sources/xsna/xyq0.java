package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: UserRecomThemesInteractor.kt */
/* loaded from: classes4.dex */
public interface xyq0 {
    io.reactivex.rxjava3.core.x<String> a();

    void b(String str);

    io.reactivex.rxjava3.core.x c();

    io.reactivex.rxjava3.core.x<RecomSettingsGetAvailableRecomThemesResponseDto> d();

    Set<Integer> e();

    void f(Set<String> set);

    io.reactivex.rxjava3.core.x<Boolean> g(String str);

    void h();

    void i();

    void j();

    /* compiled from: UserRecomThemesInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xyq0 STUB = new C4058a();

        public final xyq0 getSTUB() {
            return STUB;
        }

        /* compiled from: UserRecomThemesInteractor.kt */
        /* renamed from: xsna.xyq0$a$a, reason: collision with other inner class name */
        public static final class C4058a implements xyq0 {
            @Override // xsna.xyq0
            public final io.reactivex.rxjava3.core.x<String> a() {
                io.reactivex.rxjava3.core.x.k(null);
                throw null;
            }

            @Override // xsna.xyq0
            public final io.reactivex.rxjava3.core.x c() {
                return io.reactivex.rxjava3.core.x.k(EmptySet.b);
            }

            @Override // xsna.xyq0
            public final io.reactivex.rxjava3.core.x<RecomSettingsGetAvailableRecomThemesResponseDto> d() {
                return io.reactivex.rxjava3.core.x.k(new RecomSettingsGetAvailableRecomThemesResponseDto(EmptyList.b));
            }

            @Override // xsna.xyq0
            public final Set<Integer> e() {
                return EmptySet.b;
            }

            @Override // xsna.xyq0
            public final io.reactivex.rxjava3.core.x<Boolean> g(String str) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }

            @Override // xsna.xyq0
            public final void h() {
            }

            @Override // xsna.xyq0
            public final void i() {
            }

            @Override // xsna.xyq0
            public final void j() {
            }

            @Override // xsna.xyq0
            public final void b(String str) {
            }

            @Override // xsna.xyq0
            public final void f(Set<String> set) {
            }
        }
    }
}
