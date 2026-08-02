package xsna;

import android.content.Context;
import com.vk.dto.status.StatusImagePopupAnimation;
import com.vk.metrics.performance.thermal.DeviceThermalStatusChecker;
import com.vk.stickers.views.animation.VKAnimationView;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.SoftReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class tfc implements zmi0, a780 {
    public final Object b;
    public final Object c;

    public /* synthetic */ tfc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.zmi0
    public KSerializer b(dcy dcyVar) {
        Object obj;
        obj = ((vfc) this.c).get(((pfc) dcyVar).a());
        vh50 vh50Var = (vh50) obj;
        Object obj2 = vh50Var.a.get();
        if (obj2 == null) {
            synchronized (vh50Var) {
                obj2 = vh50Var.a.get();
                if (obj2 == null) {
                    obj2 = new mw8((KSerializer) ((izs) this.b).invoke(dcyVar));
                    vh50Var.a = new SoftReference<>(obj2);
                }
            }
        }
        return ((mw8) obj2).a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void c() {
        ((c550) this.c.getValue()).b(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void d() {
        ((c550) this.c.getValue()).b(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void e() {
        ((c550) this.c.getValue()).b(true);
    }

    public io.reactivex.rxjava3.internal.operators.completable.w f() {
        DeviceThermalStatusChecker deviceThermalStatusChecker = new DeviceThermalStatusChecker((Context) this.b);
        long j = ((zch0) this.c).a;
        long e = zno.e(j);
        int l = (int) zno.l(j, DurationUnit.SECONDS);
        io.reactivex.rxjava3.internal.operators.mixed.l lVar = new io.reactivex.rxjava3.internal.operators.mixed.l(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.q(new sf3(23)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new nm3(new adh0(this, e, deviceThermalStatusChecker, l), 29));
        m1r m1rVar = new m1r(new pod0(deviceThermalStatusChecker, 3), 23);
        a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(lVar, m1rVar, lVar2, kVar, kVar, kVar, kVar).h(new g50(deviceThermalStatusChecker, 3));
    }

    @Override // xsna.a780
    public void onSuccess() {
        VKAnimationView vKAnimationView = (VKAnimationView) this.c;
        StatusImagePopupAnimation statusImagePopupAnimation = (StatusImagePopupAnimation) this.b;
        i0q0.d(statusImagePopupAnimation.f, new qyc(6, vKAnimationView, statusImagePopupAnimation));
    }

    public tfc(l7m l7mVar) {
        this.b = l7mVar;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new n1i(this, 28));
    }

    public tfc(izs izsVar) {
        this.b = izsVar;
        this.c = new vfc();
    }

    @Override // xsna.a780
    public void a() {
    }
}
