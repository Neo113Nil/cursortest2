package xsna;

import com.vk.log.L;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ii00;

/* compiled from: ManagedGroupsEventsProviderImpl.kt */
/* loaded from: classes3.dex */
public final class li00 implements ji00 {
    public final vre0 b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.f<ii00> d = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: ManagedGroupsEventsProviderImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            li00 li00Var = (li00) this.receiver;
            li00Var.getClass();
            L.j(th, "Managed groups queue error, will retry eventually");
            li00Var.d.onNext(ii00.e.a);
            return s3q0.a;
        }
    }

    public li00(vre0 vre0Var, la0 la0Var) {
        this.b = vre0Var;
    }

    @Override // xsna.ji00
    public final io.reactivex.rxjava3.core.q<ii00> b() {
        return this.d;
    }

    @Override // xsna.ji00
    public final void c() {
        h();
        qcy<Object>[] qcyVarArr = ManagedGroupsInnerComponent.c;
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(7, new io.reactivex.rxjava3.internal.operators.observable.o0(vre0.a(this.b, new ui00(com.vk.dto.common.a.b(i2w.a().q())), new k6k(this, 27), 10), new ox0(new j9k(this, 26), 24)).F(new y00(new a(1, this, li00.class, "onQueueError", "onQueueError(Ljava/lang/Throwable;)V", 0), 28)).h0(Long.MAX_VALUE).r0(asu0.a.c()), null, null, null);
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.b(f);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, i2w.a().l.a(), null, null, new hxl(this, 16)));
    }

    @Override // xsna.ji00
    public final void h() {
        this.c.e();
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.d.onComplete();
        this.c.dispose();
    }
}
