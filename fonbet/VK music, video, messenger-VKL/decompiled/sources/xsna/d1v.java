package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.toggle.internal.a;
import com.vkontakte.android.VKApplication;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import xsna.c63;

/* compiled from: HealthUtilsImpl.kt */
/* loaded from: classes11.dex */
public final class d1v implements v0v {
    public final ayu0 a;
    public final f2w0 b;
    public final t2w0 c;
    public final hmv0 d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: HealthUtilsImpl.kt */
    public static final class a extends c63.b {
        public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> b;
        public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> c;
        public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> d;

        public a(io.reactivex.rxjava3.subjects.d<Boolean> dVar, io.reactivex.rxjava3.subjects.d<Boolean> dVar2, io.reactivex.rxjava3.subjects.d<Boolean> dVar3) {
            this.b = dVar;
            this.c = dVar2;
            this.d = dVar3;
        }

        @Override // xsna.c63.b
        public final void A() {
            c63 c63Var = c63.a;
            c63.c(this);
            Boolean bool = Boolean.TRUE;
            this.b.onNext(bool);
            if (com.vk.toggle.b.A.b()) {
                this.d.onNext(bool);
            }
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            Boolean bool = Boolean.TRUE;
            this.c.onNext(bool);
            if (com.vk.toggle.b.A.b()) {
                this.d.onNext(bool);
            }
        }
    }

    /* compiled from: HealthUtilsImpl.kt */
    public static final class b implements zxu0 {
        public b() {
        }

        @Override // xsna.zxu0
        public final RequestedMiniApp a() {
            return RequestedMiniApp.VK_WORKOUT;
        }

        @Override // xsna.zxu0
        public final void b(Context context) {
            d1v.this.a.j(context, RequestedMiniApp.VK_WORKOUT, null, new tcu(3));
        }

        @Override // xsna.zxu0
        public final void c(Context context, iyu0 iyu0Var) {
            t2w0 t2w0Var = d1v.this.c;
            if (jyu0.e(iyu0Var) || jyu0.f(iyu0Var)) {
                t2w0Var.e(context);
            } else {
                t2w0Var.d(context);
            }
        }
    }

    public d1v(ayu0 ayu0Var, f2w0 f2w0Var, t2w0 t2w0Var, hmv0 hmv0Var) {
        this.a = ayu0Var;
        this.b = f2w0Var;
        this.c = t2w0Var;
        this.d = hmv0Var;
        b bVar = new b();
        xgx0.a.getClass();
        xgx0.a("HealthUtilsImpl.setupHealthPermissionsListener()");
        ayu0Var.d(bVar);
    }

    @Override // xsna.v0v
    public final void a(VKApplication vKApplication) {
        asu0.a.getClass();
        asu0.o().schedule(new h12(5, this, vKApplication), 10L, TimeUnit.SECONDS);
    }

    @Override // xsna.v0v
    public final void b(final Context context) {
        xgx0.a.getClass();
        xgx0.a("HealthUtilsImpl initGoogleFitRecordingClient");
        io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.subjects.d N02 = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.subjects.d N03 = io.reactivex.rxjava3.subjects.d.N0();
        c63 c63Var = c63.a;
        c63.a(new a(N0, N02, N03));
        int i = 0;
        io.reactivex.rxjava3.disposables.c subscribe = com.vk.toggle.b.A.k().a.b0(a.c.class).K().m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new y0v(new x0v(N03, i), i), new a1v(new z0v(0), 0));
        new b1v(0);
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.observable.i0(N03, new m5k()).K());
        new iej(2);
        this.e.d(subscribe, io.reactivex.rxjava3.core.a.n((io.reactivex.rxjava3.core.e[]) Arrays.copyOf(new io.reactivex.rxjava3.core.a[]{pVar, new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.observable.i0(N02, new p5j()).K())}, 2)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.c1v
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                d1v d1vVar = d1v.this;
                hmv0 hmv0Var = d1vVar.d;
                Context context2 = context;
                hmv0Var.b(context2, new td0(18, d1vVar, context2));
                d1vVar.b.b(context2, new defpackage.o(20, d1vVar, context2));
            }
        }, new mm(new lm(1), 1)));
    }
}
