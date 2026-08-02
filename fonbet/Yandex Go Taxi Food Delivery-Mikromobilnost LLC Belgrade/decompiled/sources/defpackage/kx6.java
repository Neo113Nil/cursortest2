package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import androidx.metrics.performance.DelegatingOnPreDrawListener;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.crashlytics.internal.common.a;
import com.yandex.go.payments.shared.business.onboarding.b;
import com.yandex.passport.common.ui.view.CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1;
import com.yandex.passport.common.ui.view.CommonSpinner;
import yads.gn0;
import yads.vt1;
import yads.wt1;

/* loaded from: classes15.dex */
public final /* synthetic */ class kx6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ kx6(v2f v2fVar, long j, String str) {
        this.a = 2;
        this.c = v2fVar;
        this.b = j;
        this.w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((tls) obj2).invoke(fx6.a);
                ((b) obj).g.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT_ONBOARDING", null, new IllegalArgumentException(), qv10.j(j, "user canceled loaded by press back timeoutInMillis: "), 2);
                break;
            case 1:
                r9b r9bVar = (r9b) obj2;
                r9bVar.w = -1L;
                r9bVar.a(j, (abz0) obj);
                break;
            case 2:
                String str = (String) obj;
                a aVar = ((v2f) obj2).h;
                j3f j3fVar = aVar.n;
                if (j3fVar == null || !j3fVar.e.get()) {
                    ((j0r) aVar.i.c).e(j, str);
                    break;
                }
                break;
            case 3:
                DelegatingOnPreDrawListener.onPreDraw$lambda$4$lambda$3$lambda$1((View) obj2, (DelegatingOnPreDrawListener) obj, j);
                break;
            case 4:
                ((SharedPreferences) ((wjm) obj2).b).edit().putLong((String) obj, j).apply();
                break;
            case 5:
                co31 co31Var = (co31) ((a201) obj2).c;
                int i2 = tw21.a;
                co31Var.onRenderedFirstFrame(obj, j);
                break;
            case 6:
                vt1 vt1Var = (vt1) obj2;
                wt1 wt1Var = (wt1) obj;
                if (SystemClock.elapsedRealtime() - j > 5000) {
                    wt1Var.invoke();
                    break;
                } else {
                    vt1Var.invoke();
                    break;
                }
            case 7:
                CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1.onAnimationRepeat$lambda$0(j, (CommonSpinner) obj2, (LottieAnimationView) obj);
                break;
            default:
                gn0 gn0Var = (gn0) ((a441) obj2).c;
                int i3 = rf71.a;
                gn0Var.a(obj, j);
                break;
        }
    }

    public /* synthetic */ kx6(long j, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.w = obj2;
    }

    public /* synthetic */ kx6(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = j;
    }
}
