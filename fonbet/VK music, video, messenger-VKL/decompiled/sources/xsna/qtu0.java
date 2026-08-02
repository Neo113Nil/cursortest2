package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bzp0;
import xsna.dw20;
import xsna.iut0;

/* compiled from: VkFastLoginCustomApiErrorViewDelegate.kt */
/* loaded from: classes15.dex */
public final class qtu0 extends wcl {
    public final srq0 d;
    public final Handler e;
    public final long f;
    public final long g;

    public qtu0(Context context, srq0 srq0Var) {
        super(context, new ucl());
        this.d = srq0Var;
        this.e = new Handler(Looper.getMainLooper());
        this.f = 300L;
        this.g = 2000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r2.a.u(8) == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final long j, final qtu0 qtu0Var, final bzp0.b bVar) {
        boolean z;
        Window window;
        View decorView;
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (!mhy.a.hasMessages(25)) {
            Context context = qtu0Var.a;
            while (true) {
                z = context instanceof FragmentActivity;
                if (z || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
            if (fragmentActivity != null && (window = fragmentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a = iut0.e.a(decorView);
                if (a != null) {
                }
            }
            qtu0Var.d(bVar);
            return;
        }
        if (currentTimeMillis >= qtu0Var.g) {
            qtu0Var.d(bVar);
        } else {
            qtu0Var.e.postDelayed(new Runnable() { // from class: xsna.ptu0
                @Override // java.lang.Runnable
                public final void run() {
                    qtu0.e(j, qtu0Var, bVar);
                }
            }, qtu0Var.f);
        }
    }

    @Override // xsna.wcl, xsna.ehg
    public final void c(bzp0.b bVar) {
        this.d.invoke();
        this.e.postDelayed(new te9(7, this, bVar), this.f);
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [T, xsna.dw20] */
    public final void d(bzp0.b bVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        iv70 iv70Var = new iv70(ref$ObjectRef, 1);
        Context context = this.a;
        zxs zxsVar = new zxs(context, bVar, iv70Var);
        dw20.b bVar2 = new dw20.b(context, null);
        cbq.a(bVar2);
        dw20.b p = ((dw20.b) bVar2.J()).Z(this.b).p(false);
        if (fnj.d(context)) {
            p.c(new cpo(false, 0, 7)).D0(zxsVar, false);
        } else {
            p.I(true).D0(zxsVar, true).c(new a470());
        }
        ref$ObjectRef.element = p.I0("FullscreenErrorView");
    }
}
