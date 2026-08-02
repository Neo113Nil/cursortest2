package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.Speed;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.List;
import xsna.rr4;

/* compiled from: AudioMsgPlayerComponent.kt */
/* loaded from: classes2.dex */
public final class jr4 extends j8i {
    public final a1w i;
    public final ir4 j;
    public final lza0 k;
    public a l;
    public final kkm m;
    public final mr4 n;
    public final b o;
    public final io.reactivex.rxjava3.disposables.b p;
    public io.reactivex.rxjava3.disposables.c q;
    public boolean r;
    public rr4 s;

    /* compiled from: AudioMsgPlayerComponent.kt */
    public final class b extends o56 {
        public b() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            jr4.this.n.a(false);
        }

        @Override // xsna.o56, xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            jr4.this.n.b.onNext(new it80<>(ur4Var));
        }

        @Override // xsna.o56, xsna.kr4
        public final void d(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            jr4.this.n.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.o56, xsna.kr4
        public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            jr4 jr4Var = jr4.this;
            jr4Var.n.a(true);
            jr4Var.l.c();
        }

        @Override // xsna.o56, xsna.kr4
        public final void f(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            jr4.this.n.b(-1.0f);
        }

        @Override // xsna.o56, xsna.kr4
        public final void h(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            jr4.this.n.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.o56, xsna.kr4
        public final void i(ir4 ir4Var, ur4 ur4Var) {
            jr4.this.n.a(false);
        }

        @Override // xsna.o56, xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            jr4.this.n.a(false);
        }

        @Override // xsna.o56, xsna.kr4
        public final void n(ir4 ir4Var, bgk0 bgk0Var) {
            ir4Var.E(bgk0Var);
            jr4.this.l.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void p(ir4 ir4Var, bgk0 bgk0Var, List<ur4> list) {
            jr4 jr4Var = jr4.this;
            mr4 mr4Var = jr4Var.n;
            mr4Var.a.onNext(list);
            if (list.isEmpty()) {
                mr4Var.b.onNext(new it80<>(null));
                mr4Var.a(false);
                mr4Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            jr4Var.l.a();
        }

        @Override // xsna.o56, xsna.kr4
        public final void q(ir4 ir4Var, bgk0 bgk0Var, Speed speed) {
            jr4.this.n.f.onNext(speed);
        }

        @Override // xsna.o56, xsna.kr4
        public final void r(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var, float f) {
            jr4.this.n.b(f);
        }

        @Override // xsna.o56, xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            jr4.this.n.a(false);
        }
    }

    /* compiled from: AudioMsgPlayerComponent.kt */
    public final class c implements rr4.a {
        public c() {
        }
    }

    public jr4(a1w a1wVar, ir4 ir4Var, a aVar) {
        this(a1wVar, ir4Var, jw5.f, aVar, new kkm(0));
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.s = new rr4(layoutInflater, viewGroup, viewStub, this.m, new c());
        Z0();
        return this.s.d;
    }

    @Override // xsna.j8i
    public final void M0() {
        boolean z = this.r;
        io.reactivex.rxjava3.disposables.b bVar = this.p;
        if (z) {
            this.r = false;
            bVar.e();
            this.j.y(this.o);
        }
        bVar.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        this.s = null;
    }

    public final void X0(a aVar) {
        this.l = aVar;
    }

    public final void Y0() {
        if (this.r) {
            return;
        }
        this.r = true;
        b bVar = this.o;
        ir4 ir4Var = this.j;
        ir4Var.v(bVar);
        List<ur4> n = ir4Var.n();
        mr4 mr4Var = this.n;
        io.reactivex.rxjava3.subjects.d<List<ur4>> dVar = mr4Var.a;
        io.reactivex.rxjava3.subjects.d<Speed> dVar2 = mr4Var.f;
        io.reactivex.rxjava3.subjects.d<it80<ur4>> dVar3 = mr4Var.b;
        dVar.onNext(n);
        dVar3.onNext(new it80<>(ir4Var.b()));
        mr4Var.a(ir4Var.isPlaying());
        mr4Var.b(ir4Var.u() ? -1.0f : ir4Var.o());
        mr4Var.e.onNext(Boolean.valueOf(ir4Var.s()));
        dVar2.onNext(ir4Var.z());
        Z0();
        dVar3.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        int i = 6;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.y(dVar3, qVar, aVar).subscribe(new sv(new ec(this, 5), i));
        io.reactivex.rxjava3.disposables.b bVar2 = this.p;
        bVar2.b(subscribe);
        io.reactivex.rxjava3.subjects.d<Boolean> dVar4 = mr4Var.c;
        dVar4.getClass();
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar4, qVar, aVar).subscribe(new k5(new j5(this, i), 2)));
        io.reactivex.rxjava3.subjects.d<Float> dVar5 = mr4Var.d;
        dVar5.getClass();
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar5, qVar, aVar).subscribe(new m5(new l5(this, 5), 2)));
        dVar2.getClass();
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar2, qVar, aVar).subscribe(new defpackage.x(new ix2(this, 3), 3)));
    }

    public final void Z0() {
        rr4 rr4Var = this.s;
        if (rr4Var == null) {
            return;
        }
        mr4 mr4Var = this.n;
        ur4 ur4Var = mr4Var.b.P0().a;
        rr4Var.e(ur4Var != null ? ur4Var.f : null);
        rr4Var.b(mr4Var.c.P0().booleanValue());
        float floatValue = mr4Var.d.P0().floatValue();
        ur4 ur4Var2 = mr4Var.b.P0().a;
        rr4Var.f(floatValue, ur4Var2 != null ? Integer.valueOf(ur4Var2.g) : null);
        ProgressBar progressBar = rr4Var.g;
        kkm kkmVar = rr4Var.a;
        kkmVar.getClass();
        kkmVar.a(progressBar, "progressTint", new zl9(kkmVar, R.attr.vk_legacy_im_text_name));
        if (mr4Var.e.P0().booleanValue()) {
            rr4Var.d(mr4Var.f.P0());
        } else {
            rr4Var.d(null);
        }
    }

    public jr4(a1w a1wVar, ir4 ir4Var, lza0 lza0Var, a aVar, kkm kkmVar) {
        this.i = a1wVar;
        this.j = ir4Var;
        this.k = lza0Var;
        this.l = aVar;
        this.m = kkmVar;
        this.n = new mr4();
        this.o = new b();
        this.p = new io.reactivex.rxjava3.disposables.b();
    }

    /* compiled from: AudioMsgPlayerComponent.kt */
    public interface a {
        public static final C3141a a = C3141a.a;

        /* compiled from: AudioMsgPlayerComponent.kt */
        /* renamed from: xsna.jr4$a$a, reason: collision with other inner class name */
        public static final class C3141a {
            public static final /* synthetic */ C3141a a = new C3141a();
            public static final C3142a b = new C3142a();

            public static C3142a a() {
                return b;
            }

            /* compiled from: AudioMsgPlayerComponent.kt */
            /* renamed from: xsna.jr4$a$a$a, reason: collision with other inner class name */
            public static final class C3142a implements a {
                @Override // xsna.jr4.a
                public final void a() {
                }

                @Override // xsna.jr4.a
                public final void c() {
                }

                @Override // xsna.jr4.a
                public final void d() {
                }

                @Override // xsna.jr4.a
                public final void b(i34 i34Var) {
                }
            }
        }

        default void a() {
        }

        default void c() {
        }

        default void d() {
        }

        default void b(i34 i34Var) {
        }
    }
}
