package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.concurrent.TimeUnit;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import one.video.calls.sdk.internal.api.request.UploadType;
import ru.ok.android.annotation.CallInternalApi;

/* compiled from: BitrateDumpFileSendTrigger.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class od7 implements far {
    public final ExperimentsInterface.a a;

    /* compiled from: BitrateDumpFileSendTrigger.kt */
    public static final class a<T, R> implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ File b;

        public a(File file) {
            this.b = file;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            return this.b;
        }
    }

    /* compiled from: BitrateDumpFileSendTrigger.kt */
    public static final class b<T> implements io.reactivex.rxjava3.functions.m {
        public static final b<T> b = new b<>();

        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            File file = (File) obj;
            return file.exists() && file.canRead();
        }
    }

    /* compiled from: BitrateDumpFileSendTrigger.kt */
    public static final class c<T, R> implements io.reactivex.rxjava3.functions.l {
        public static final c<T, R> b = new c<>();

        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            return new ear((File) obj, UploadType.STATS);
        }
    }

    public od7(ExperimentsInterface.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.far
    public final io.reactivex.rxjava3.core.k<ear> shouldSend() {
        ExperimentsInterface.a aVar = this.a;
        if (!(aVar instanceof ExperimentsInterface.a.b)) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        File file = new File(((ExperimentsInterface.a.b) aVar).b);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.rxjava3.internal.operators.observable.e0 e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.p2(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.P(0L, 1L, timeUnit).r0(io.reactivex.rxjava3.schedulers.a.b()).U(new a(file)), b.b), io.reactivex.rxjava3.core.q.B0(5L, timeUnit)).U(c.b));
        k66 k66Var = new k66(file, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return new io.reactivex.rxjava3.internal.operators.maybe.b0(e0Var, lVar, lVar, lVar, k66Var, io.reactivex.rxjava3.internal.functions.a.c);
    }
}
