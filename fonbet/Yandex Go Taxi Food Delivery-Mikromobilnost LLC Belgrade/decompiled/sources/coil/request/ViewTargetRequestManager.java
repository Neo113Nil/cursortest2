package coil.request;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import defpackage.hjt;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.m;
import defpackage.nev;
import defpackage.noh;
import defpackage.nv31;
import defpackage.o400;
import defpackage.oey;
import defpackage.pv31;
import defpackage.rv31;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lpv31;", "disposable", "", "isDisposed", "(Lpv31;)Z", "Lnoh;", "Lnev;", "job", "getDisposable", "(Lnoh;)Lpv31;", "Lzy11;", "dispose", "()V", "getResult", "()Lnev;", "Lrv31;", "request", "setRequest", "(Lrv31;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "currentDisposable", "Lpv31;", "Ll8x;", "pendingClear", "Ll8x;", "currentRequest", "Lrv31;", "isRestart", "Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    private pv31 currentDisposable;
    private rv31 currentRequest;
    private boolean isRestart;
    private l8x pendingClear;
    private final View view;

    public ViewTargetRequestManager(View view) {
        this.view = view;
    }

    public final synchronized void dispose() {
        try {
            l8x l8xVar = this.pendingClear;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            hjt hjtVar = hjt.a;
            sjh sjhVar = uyj.a;
            this.pendingClear = tje.N(hjtVar, o400.a.x, null, new ViewTargetRequestManager$dispose$1(this, null), 2);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized pv31 getDisposable(noh job) {
        pv31 pv31Var = this.currentDisposable;
        if (pv31Var != null) {
            Bitmap.Config[] configArr = m.a;
            if (jl40.l(Looper.myLooper(), Looper.getMainLooper()) && this.isRestart) {
                this.isRestart = false;
                pv31Var.b = job;
                return pv31Var;
            }
        }
        l8x l8xVar = this.pendingClear;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.pendingClear = null;
        pv31 pv31Var2 = new pv31(this.view, job);
        this.currentDisposable = pv31Var2;
        return pv31Var2;
    }

    public final synchronized nev getResult() {
        nev nevVar;
        noh nohVar;
        pv31 pv31Var = this.currentDisposable;
        nevVar = null;
        Object obj = null;
        nevVar = null;
        if (pv31Var != null && (nohVar = pv31Var.b) != null) {
            Bitmap.Config[] configArr = m.a;
            try {
                obj = nohVar.c();
            } catch (Throwable unused) {
            }
            nevVar = (nev) obj;
        }
        return nevVar;
    }

    public final synchronized boolean isDisposed(pv31 disposable) {
        return disposable != this.currentDisposable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        rv31 rv31Var = this.currentRequest;
        if (rv31Var == null) {
            return;
        }
        this.isRestart = true;
        rv31Var.a.b(rv31Var.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        rv31 rv31Var = this.currentRequest;
        if (rv31Var != null) {
            Lifecycle lifecycle = rv31Var.w;
            rv31Var.x.a(null);
            nv31 nv31Var = rv31Var.c;
            if (nv31Var instanceof oey) {
                lifecycle.d((oey) nv31Var);
            }
            lifecycle.d(rv31Var);
        }
    }

    public final void setRequest(rv31 request) {
        rv31 rv31Var = this.currentRequest;
        if (rv31Var != null) {
            Lifecycle lifecycle = rv31Var.w;
            rv31Var.x.a(null);
            nv31 nv31Var = rv31Var.c;
            if (nv31Var instanceof oey) {
                lifecycle.d((oey) nv31Var);
            }
            lifecycle.d(rv31Var);
        }
        this.currentRequest = request;
    }
}
