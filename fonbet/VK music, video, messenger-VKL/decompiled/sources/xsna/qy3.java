package xsna;

import android.content.Context;
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncPosterRotationSensorListener.kt */
/* loaded from: classes4.dex */
public final class qy3 {
    public final hac0 a;
    public final jz3 b = new jz3();
    public io.reactivex.rxjava3.disposables.g c;
    public int d;
    public boolean e;
    public float f;
    public float g;

    /* compiled from: AsyncPosterRotationSensorListener.kt */
    public static abstract class a {

        /* compiled from: AsyncPosterRotationSensorListener.kt */
        /* renamed from: xsna.qy3$a$a, reason: collision with other inner class name */
        public static final class C3581a extends a {
            public final float a;
            public final float b;

            public C3581a(float f, float f2) {
                this.a = f;
                this.b = f2;
            }
        }

        /* compiled from: AsyncPosterRotationSensorListener.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public qy3(ArrayList arrayList) {
        this.a = new hac0(arrayList);
    }

    public final void a(Context context) {
        io.reactivex.rxjava3.core.g gVar;
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.f.set(false);
        int i = 8;
        if (uvg0.a(15, context)) {
            gVar = uvg0.b(context, 15, 2, new ev60(i));
        } else {
            int i2 = io.reactivex.rxjava3.core.g.b;
            gVar = io.reactivex.rxjava3.internal.operators.flowable.p.c;
        }
        io.reactivex.rxjava3.internal.operators.flowable.b1 o = gVar.k(1L, null, BackpressureOverflowStrategy.DROP_OLDEST).o(16L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.flowable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.c0(o.j(asu0.k()), new s7(new ya(1, this, context), 2)), new a.j(a.C3581a.class)), new a.i(a.C3581a.class));
        tm0 tm0Var = new tm0(this, i);
        int i3 = 3;
        int i4 = 5;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.r(c0Var, new bl(tm0Var, i3)), new w7(new jy(this, i4), i3)).j(asu0Var.d()).subscribe(new wf1(new x7(this, i4), i3));
        io.reactivex.rxjava3.disposables.g gVar2 = this.c;
        if (gVar2 == null) {
            gVar2 = new io.reactivex.rxjava3.disposables.g();
            this.c = gVar2;
        }
        gVar2.b(subscribe);
    }
}
