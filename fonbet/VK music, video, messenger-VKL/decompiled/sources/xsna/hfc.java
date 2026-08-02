package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.uwk;

/* compiled from: CityQueryFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class hfc implements fuq<xec, bfc> {
    public final fr9 a;
    public final io.reactivex.rxjava3.subjects.f<a> b = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: CityQueryFeatureDelegate.kt */
    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* compiled from: CityQueryFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a, io.reactivex.rxjava3.core.x<xec>> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.x<xec> invoke(a aVar) {
            a aVar2 = aVar;
            fr9 fr9Var = ((hfc) this.receiver).a;
            String str = aVar2.a;
            dz2 x = yfb.x(uwk.a.b(((kec) fr9Var.b).a, null, str.length() > 0 ? str : null, null, null, 154));
            ahn.D(x);
            io.reactivex.rxjava3.internal.operators.single.d0 d0Var = new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.w0(x).l(new e05(new f57(fr9Var, 5), 8)).l(new ft0(ifc.b, 15)), new as(12), null);
            long j = aVar2.b;
            if (j <= 0) {
                return d0Var;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return d0Var.g(j);
        }
    }

    public hfc(fr9 fr9Var) {
        this.a = fr9Var;
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends xec> d() {
        xl0 xl0Var = new xl0(new b(1, this, hfc.class, "internalRequestCities", "internalRequestCities(Lcom/vk/search/params/impl/presentation/modal/city/mvi/delegate/CityQueryFeatureDelegate$Query;)Lio/reactivex/rxjava3/core/Single;", 0), 12);
        io.reactivex.rxjava3.subjects.f<a> fVar = this.b;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.mixed.o(fVar, xl0Var);
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends bfc> e() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
