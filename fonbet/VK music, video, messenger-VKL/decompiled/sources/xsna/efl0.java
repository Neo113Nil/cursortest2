package xsna;

import android.content.IntentFilter;
import android.os.SystemClock;
import com.vkontakte.android.VKApplication;
import receivers.TimeChangedReceiver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class efl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ efl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.qy90$c] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                hfl0 hfl0Var = (hfl0) this.c;
                ?? r2 = hfl0Var.c;
                if (r2 != 0) {
                    r2.setHideable(true);
                }
                ?? r22 = hfl0Var.c;
                if (r22 != 0) {
                    r22.hide();
                }
                ?? r0 = hfl0Var.c;
                if (r0 != 0) {
                    r0.setVisible(false);
                    break;
                }
                break;
            default:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                gsv0 gsv0Var = new gsv0();
                s63 s63Var = new s63(11);
                com.vk.core.utils.newtork.b.a.getClass();
                io.reactivex.rxjava3.internal.operators.observable.j1 U = com.vk.core.utils.newtork.b.d.U(new quq(new db3(2)));
                ro roVar = new ro();
                dr6 dr6Var = new dr6(15);
                s7r0 s7r0Var = new s7r0(i);
                pni0 pni0Var = qni0.b;
                qni0.a.getClass();
                qni0.i = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                qni0.g = gsv0Var;
                qni0.l = dr6Var;
                qni0.q = s7r0Var;
                qni0.h = qni0.c().getLong("ServerTimeProvider_KEY_TIME_DIFF", 0L);
                qni0.r = roVar;
                qni0.n = pni0Var;
                qni0.o = s63Var;
                qni0.p = U;
                TimeChangedReceiver timeChangedReceiver = new TimeChangedReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.intent.action.DATE_CHANGED");
                s3q0 s3q0Var = s3q0.a;
                vKApplication.registerReceiver(timeChangedReceiver, intentFilter);
                if (qni0.s) {
                    qni0.d(vKApplication);
                    break;
                }
                break;
        }
    }
}
