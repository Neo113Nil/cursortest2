package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ProgressDrawableFactoryCreator.kt */
/* loaded from: classes4.dex */
public final class e2e0 {

    /* compiled from: ProgressDrawableFactoryCreator.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public final io.reactivex.rxjava3.disposables.c a(izs<? super d2e0, s3q0> izsVar) {
        return io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new r5r(this, 2))).m(asu0.m()).subscribe(new lkz(izsVar, 15), new zk30(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 16));
    }
}
