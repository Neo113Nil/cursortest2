package xsna;

import android.content.Context;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vk.log.L;
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.h5j0;

/* compiled from: TimestampedLinearAcceleration.kt */
/* loaded from: classes17.dex */
public final class jyo0 implements h5j0 {
    public final bpn0 b = new bpn0(new pm60(12));

    public final io.reactivex.rxjava3.core.g<s3q0> a(Context context, h5j0.b bVar) {
        io.reactivex.rxjava3.core.g gVar;
        bVar.getClass();
        int i = 24;
        byte b = 0;
        if (uvg0.a(10, context)) {
            L.e("The device has a linear acceleration sensor");
            gVar = uvg0.b(context, 10, 100, new tcu(i));
        } else if (uvg0.a(1, context) && uvg0.a(9, context)) {
            L.e("The device has an accelerometer and a gravity sensor");
            int i2 = 14;
            gVar = io.reactivex.rxjava3.core.g.a(uvg0.b(context, 1, 100, new ap30(qvg0.b, i2)), uvg0.b(context, 9, 100, new ap30(tvg0.b, i2)), new ie40(new kxa(b, 8), 17));
        } else if (uvg0.a(1, context)) {
            L.e("The device only has an accelerometer. Need to apply the high-pass filter on it");
            gVar = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.i0(uvg0.b(context, 1, 100, new tcu(i))).j((io.reactivex.rxjava3.core.w) this.b.getValue()), new je40(new gyo0(new float[3], b), 11));
        } else {
            L.e("The device does not have the required sensors.");
            int i3 = io.reactivex.rxjava3.core.g.b;
            gVar = io.reactivex.rxjava3.internal.operators.flowable.p.c;
        }
        io.reactivex.rxjava3.core.g f = io.reactivex.rxjava3.core.g.h(b(gVar, bVar, new viu(27)), b(gVar, bVar, new d220(23)), b(gVar, bVar, new yml0(4))).f(io.reactivex.rxjava3.internal.functions.a.a, 3, io.reactivex.rxjava3.core.g.b);
        long j = bVar.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f.getClass();
        io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.schedulers.a.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.a1(f, j, a);
    }

    public final io.reactivex.rxjava3.internal.operators.flowable.c0 b(io.reactivex.rxjava3.core.g gVar, h5j0.b bVar, izs izsVar) {
        io.reactivex.rxjava3.internal.operators.flowable.r rVar = new io.reactivex.rxjava3.internal.operators.flowable.r(gVar.k(100L, new hyo0(), BackpressureOverflowStrategy.DROP_OLDEST).j((io.reactivex.rxjava3.core.w) this.b.getValue()), new xw70(new com.vk.movika.sdk.base.logic.interactor.i(29, izsVar, bVar), 7));
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        io.reactivex.rxjava3.internal.functions.b.a(2, "count");
        io.reactivex.rxjava3.internal.functions.b.a(1, FreeSpaceBox.TYPE);
        Objects.requireNonNull(arrayListSupplier, "bufferSupplier is null");
        int i = 3;
        io.reactivex.rxjava3.internal.operators.flowable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.c(rVar, 2, arrayListSupplier), new vtg0(new ehm0(izsVar, i), i)), new wii0(new kpr(27), 7));
        bVar.getClass();
        io.reactivex.rxjava3.internal.functions.b.a(3, "count");
        io.reactivex.rxjava3.internal.functions.b.a(1, FreeSpaceBox.TYPE);
        Objects.requireNonNull(arrayListSupplier, "bufferSupplier is null");
        return new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.a1(new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.c(c0Var, 3, arrayListSupplier), new mh40(new kvm0(bVar, 3), 15)), bVar.b, fb20.b(TimeUnit.MILLISECONDS, "unit is null", "scheduler is null")), new iyo0(new fyo0(0), 0));
    }
}
