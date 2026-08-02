package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: ApiCallbackDisposable.kt */
/* loaded from: classes15.dex */
public final class jx2<T> extends g03 {
    public final rsg0<T> e;
    public final hx2<T> f;
    public Context g;
    public long h;

    /* JADX WARN: Multi-variable type inference failed */
    public jx2(rsg0<T> rsg0Var, hx2<? super T> hx2Var) {
        this.e = rsg0Var;
        this.f = hx2Var;
    }

    public final io.reactivex.rxjava3.disposables.c a() {
        io.reactivex.rxjava3.core.q y0 = rsg0.y0(this.e, this, null, 2);
        Context context = this.g;
        if (context != null) {
            y0 = hg1.m(y0, context, this.h, false, 60);
        }
        return y0.subscribe(new m5(new l5(this, 2), 1), new defpackage.x(new ix2(this, 0), 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        hx2<T> hx2Var = this.f;
        try {
            io.reactivex.rxjava3.core.q v0 = this.e.v0(this, null);
            Context context = this.g;
            if (context != null) {
                v0 = hg1.m(v0, context, this.h, false, 60);
            }
            Object a = v0.a();
            if (hx2Var == 0) {
                return true;
            }
            hx2Var.b(a);
            return true;
        } catch (Exception e) {
            e = e;
            if (e instanceof RuntimeException) {
                e = e.getCause();
            }
            if ((e instanceof VKApiExecutionException) && hx2Var != 0) {
                hx2Var.e((VKApiExecutionException) e);
                return false;
            }
            if (hx2Var == 0) {
                return false;
            }
            hx2Var.e(new VKApiExecutionException(1, "", false, "", null, null, null, null, 0, null, null, null, 4080));
            return false;
        }
    }

    public final void c(Context context) {
        this.g = context;
    }
}
