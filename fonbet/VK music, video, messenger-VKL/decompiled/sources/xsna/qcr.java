package xsna;

import com.vk.search.params.api.City;
import java.util.List;

/* compiled from: FilterFieldsDelegate.kt */
/* loaded from: classes18.dex */
public interface qcr<Field> {
    void a(vcr vcrVar);

    io.reactivex.rxjava3.core.k<List<vcr<?>>> b(City city);

    io.reactivex.rxjava3.core.k<List<vcr<?>>> c();

    io.reactivex.rxjava3.core.q<List<Field>> d();

    void e();

    void f();

    boolean g();

    /* compiled from: FilterFieldsDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final qcr<vcr<?>> STUB = new C3556a();

        public final qcr<vcr<?>> getSTUB() {
            return STUB;
        }

        /* compiled from: FilterFieldsDelegate.kt */
        /* renamed from: xsna.qcr$a$a, reason: collision with other inner class name */
        public static final class C3556a implements qcr<vcr<?>> {
            @Override // xsna.qcr
            public final io.reactivex.rxjava3.core.k<List<vcr<?>>> b(City city) {
                return io.reactivex.rxjava3.internal.operators.maybe.i.b;
            }

            @Override // xsna.qcr
            public final io.reactivex.rxjava3.core.k<List<vcr<?>>> c() {
                return io.reactivex.rxjava3.internal.operators.maybe.i.b;
            }

            @Override // xsna.qcr
            public final io.reactivex.rxjava3.core.q<List<vcr<?>>> d() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.qcr
            public final boolean g() {
                return false;
            }

            @Override // xsna.qcr
            public final void e() {
            }

            @Override // xsna.qcr
            public final void f() {
            }

            @Override // xsna.qcr
            public final /* bridge */ /* synthetic */ void a(vcr vcrVar) {
            }
        }
    }
}
