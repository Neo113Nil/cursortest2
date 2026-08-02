package xsna;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.log.L;

/* compiled from: RxExt.kt */
/* loaded from: classes17.dex */
public final class b2e0 {
    public final Handler a;
    public final gzs<s3q0> b;
    public ProgressDialog c;

    public b2e0(final Activity activity, Handler handler, final int i, final boolean z, final boolean z2, gzs<s3q0> gzsVar) {
        this.a = handler;
        this.b = gzsVar;
        handler.post(new Runnable() { // from class: xsna.y1e0
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2 = activity;
                ProgressDialog progressDialog = new ProgressDialog(activity2);
                progressDialog.setMessage(activity2.getResources().getString(i));
                progressDialog.setCancelable(z);
                progressDialog.setCanceledOnTouchOutside(z2);
                b2e0.this.c = progressDialog;
            }
        });
    }

    public final void a() {
        Handler handler = this.a;
        try {
            handler.removeCallbacksAndMessages(null);
            handler.post(new bv9(this, 11));
        } catch (Throwable unused) {
        }
    }

    public final void b(io.reactivex.rxjava3.disposables.c cVar) {
        ProgressDialog progressDialog;
        if (!epx.f(Looper.myLooper(), Looper.getMainLooper()) || (progressDialog = this.c) == null) {
            this.a.post(new x6q(6, this, cVar));
        } else if (progressDialog != null) {
            progressDialog.setOnCancelListener(new z1e0(this, cVar));
        }
    }

    public final void c() {
        Context context;
        ProgressDialog progressDialog = this.c;
        if (progressDialog == null) {
            return;
        }
        Activity h = (progressDialog == null || (context = progressDialog.getContext()) == null) ? null : e3m.h(context);
        if (h == null || h.isFinishing() || h.isDestroyed()) {
            return;
        }
        try {
            ProgressDialog progressDialog2 = this.c;
            if (progressDialog2 != null) {
                progressDialog2.show();
            }
        } catch (RuntimeException e) {
            L.i(e);
        }
    }

    public final void d(long j) {
        Handler handler = this.a;
        try {
            if (j > 0) {
                handler.postDelayed(new xqc(this, 8), j);
            } else {
                handler.post(new hv1(this, 14));
            }
        } catch (Throwable unused) {
        }
    }
}
