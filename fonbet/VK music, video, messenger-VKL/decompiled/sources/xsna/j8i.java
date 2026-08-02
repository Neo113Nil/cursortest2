package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.log.L;
import xsna.pvj;

/* compiled from: Component.kt */
/* loaded from: classes2.dex */
public abstract class j8i {
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public boolean d;
    public boolean e;
    public boolean f;
    public View g;
    public final hpj h;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a extends kotlin.coroutines.a implements pvj {
        public a() {
            super(pvj.a.b);
        }

        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            L.f(qjg.a(j8i.this), "Unhandled exception", th);
        }
    }

    public j8i() {
        a aVar = new a();
        bdn bdnVar = bdn.a;
        this.h = zvj.a(ie00.a.plus(whn0.a()).plus(aVar));
    }

    public final View C0(Context context, ViewGroup viewGroup, Bundle bundle) {
        return D0(context, viewGroup, null, bundle);
    }

    public final View D0(Context context, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        return E0(LayoutInflater.from(context), viewGroup, viewStub, bundle);
    }

    public final View E0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        View L0 = L0(layoutInflater, viewGroup, viewStub, bundle);
        this.g = L0;
        this.d = true;
        S0(L0);
        return L0;
    }

    public final View F0(ViewGroup viewGroup, Bundle bundle) {
        return C0(viewGroup.getContext(), viewGroup, bundle);
    }

    public final void G0() {
        if (this.f) {
            return;
        }
        if (this.d) {
            N0();
        }
        M0();
        this.f = true;
    }

    public final void H0() {
        if (this.d) {
            this.g = null;
            this.b.e();
            zvj.c(this.h, null);
            N0();
            this.d = false;
        }
    }

    public final void I0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b.b(cVar);
    }

    public final boolean J0() {
        return this.d;
    }

    public View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        return null;
    }

    public final void T0(Bundle bundle) {
        O0(bundle);
    }

    public final void U0(Bundle bundle) {
        P0(bundle);
    }

    public final void V0() {
        if (this.e) {
            return;
        }
        Q0();
        this.e = true;
    }

    public final void W0() {
        if (this.e) {
            this.c.e();
            R0();
            this.e = false;
        }
    }

    public void M0() {
    }

    public void N0() {
    }

    public void Q0() {
    }

    public void R0() {
    }

    public void K0(Configuration configuration) {
    }

    public void O0(Bundle bundle) {
    }

    public void P0(Bundle bundle) {
    }

    public void S0(View view) {
    }
}
