package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.google.android.material.R$id;
import java.lang.ref.WeakReference;

/* compiled from: ClipsScreenSpinnerDialog.kt */
/* loaded from: classes17.dex */
public final class l2f extends b33 {
    public o2f h;

    public final void n() {
        Activity h = e3m.h(getContext());
        if (h == null || !(h.isFinishing() || h.isDestroyed())) {
            dismiss();
        }
    }

    public final void o(boolean z) {
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(40);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(40);
        }
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        View decorView = getWindow().getDecorView();
        decorView.setTag(R$id.view_tree_saved_state_registry_owner, this);
        decorView.setTag(R$id.view_tree_view_model_store_owner, this);
        decorView.setTag(R$id.view_tree_lifecycle_owner, this);
        o2f o2fVar = this.h;
        if (o2fVar != null) {
            lyd.h(o2fVar, lyd.f(getWindow().getDecorView()));
        }
    }

    /* compiled from: ClipsScreenSpinnerDialog.kt */
    public static final class a {
        public final long a;
        public final String b;
        public final String c;
        public final boolean d;
        public final WeakReference<Activity> e;
        public l2f f;
        public final Handler g;
        public final k2f h;
        public boolean i;

        public a(Context context, long j, String str, String str2, boolean z) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = new WeakReference<>(e3m.h(context));
            Handler handler = new Handler(Looper.getMainLooper());
            this.g = handler;
            this.h = new k2f(this);
            handler.post(new oh(this, 1));
        }

        public static void c(a aVar) {
            aVar.g.postDelayed(new g0(aVar, 7), 300L);
        }

        public final void a(Boolean bool) {
            if (this.i || this.f == null) {
                return;
            }
            boolean f = epx.f(bool, Boolean.TRUE);
            long j = this.a;
            Handler handler = this.g;
            if (f) {
                this.i = true;
                handler.post(new j0(this, 4));
                handler.postDelayed(new p31(this, 7), j);
            } else if (!epx.f(bool, Boolean.FALSE)) {
                this.i = true;
                handler.post(new js6(this, 1));
            } else {
                this.i = true;
                handler.post(new mf3(this, 3));
                handler.postDelayed(new vb(this, 6), j);
            }
        }

        public final void b(io.reactivex.rxjava3.disposables.c cVar) {
            l2f l2fVar;
            if (!epx.f(Looper.myLooper(), Looper.getMainLooper()) || (l2fVar = this.f) == null) {
                this.g.post(new i0(2, this, cVar));
            } else if (l2fVar != null) {
                l2fVar.setOnCancelListener(new j2f(cVar, 0));
            }
        }

        public /* synthetic */ a(Context context, String str, int i, String str2) {
            this(context, (i & 2) != 0 ? 1000L : 2000L, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, true);
        }
    }
}
