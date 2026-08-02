package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: RxExtCore.kt */
/* loaded from: classes.dex */
public final class itg0 {
    public static final l7x a = new l7x(1);
    public static final a b = new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
    public static final ag7 c = new ag7(6);

    /* compiled from: RxExtCore.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public static final void a(Activity activity, io.reactivex.rxjava3.disposables.c cVar) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            cVar.dispose();
            return;
        }
        ftg0 ftg0Var = new ftg0(cVar);
        if (p90.e(activity)) {
            ftg0Var.a();
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(new n90(activity, ftg0Var));
        }
    }

    public static final void b(View view, io.reactivex.rxjava3.disposables.c cVar) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new htg0(cVar));
        } else {
            cVar.dispose();
        }
    }

    public static final void c(io.reactivex.rxjava3.disposables.c cVar, Fragment fragment) {
        if (fragment.isRemoving() || fragment.isDetached()) {
            cVar.dispose();
        } else {
            fragment.requireFragmentManager().c0(new gtg0(cVar), false);
        }
    }

    public static final <T> T d(io.reactivex.rxjava3.core.q<T> qVar, long j) {
        return qVar.y0(j, TimeUnit.MILLISECONDS).F(new jtg0(j)).a();
    }

    public static Object e(io.reactivex.rxjava3.core.q qVar) {
        try {
            return d(qVar, 3000L);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> T f(io.reactivex.rxjava3.core.x<T> xVar, long j) {
        return xVar.r(j, TimeUnit.MILLISECONDS).h(new jtg0(j)).c();
    }

    @SuppressLint({"CheckResult"})
    public static final void g(io.reactivex.rxjava3.core.a aVar, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        aVar.subscribe(new ahe(gzsVar, 4), new fs00(izsVar, 18));
    }

    @SuppressLint({"CheckResult"})
    public static final <T> void h(io.reactivex.rxjava3.core.x<T> xVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        xVar.subscribe(new b8v(izsVar, 25), new ca10(izsVar2, 17));
    }

    public static void i(int i, io.reactivex.rxjava3.core.q qVar, gzs gzsVar, izs izsVar, izs izsVar2) {
        if ((i & 1) != 0) {
            izsVar = a;
        }
        if ((i & 2) != 0) {
            izsVar2 = b;
        }
        if ((i & 4) != 0) {
            gzsVar = c;
        }
        qVar.subscribe(new mx50(izsVar, 1), new gd9(izsVar2, 3), new etg0(gzsVar));
    }

    public static /* synthetic */ void j(io.reactivex.rxjava3.core.a aVar, izs izsVar, int i) {
        if ((i & 2) != 0) {
            izsVar = b;
        }
        g(aVar, c, izsVar);
    }

    public static /* synthetic */ void k(io.reactivex.rxjava3.core.x xVar, izs izsVar, izs izsVar2, int i) {
        if ((i & 1) != 0) {
            izsVar = a;
        }
        if ((i & 2) != 0) {
            izsVar2 = b;
        }
        h(xVar, izsVar, izsVar2);
    }

    public static final io.reactivex.rxjava3.disposables.c l(io.reactivex.rxjava3.core.a aVar) {
        int i = kwg0.a;
        return aVar.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0());
    }

    public static final <T> io.reactivex.rxjava3.disposables.c m(io.reactivex.rxjava3.core.q<T> qVar) {
        int i = kwg0.a;
        return qVar.subscribe(new iwg0(), new hwg0());
    }

    public static final <T> io.reactivex.rxjava3.disposables.c n(io.reactivex.rxjava3.core.x<T> xVar) {
        int i = kwg0.a;
        return xVar.subscribe(new iwg0(), new hwg0());
    }
}
