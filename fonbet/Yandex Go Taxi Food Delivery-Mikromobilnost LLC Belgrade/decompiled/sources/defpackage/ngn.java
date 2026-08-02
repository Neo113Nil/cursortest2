package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import com.ybsdk.widgets.common.OperationProgressView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.eatskit.widget.placeholder.eats.EatsSplashView;

/* loaded from: classes5.dex */
public final class ngn {
    public final Context a;
    public EatsSplashView b;
    public jkz c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Handler f = new Handler(Looper.getMainLooper());

    public ngn(Context context) {
        this.a = context;
    }

    public final void a() {
        b();
        EatsSplashView eatsSplashView = this.b;
        if (eatsSplashView == null) {
            return;
        }
        float width = eatsSplashView.getWidth();
        float height = eatsSplashView.getHeight();
        Context context = this.a;
        ap4 ap4Var = new ap4(context, width, height);
        List g = scc.g(ap4Var.b(25.0f, 25.0f, 127.5f, 203.0f, nzh0.balloon_text_fast), ap4Var.b(22.0f, 22.0f, 24.5f, 167.0f, nzh0.balloon_text_delivery), ap4Var.b(32.0f, 20.0f, 70.5f, 131.0f, nzh0.balloon_text_eat), ap4Var.b(34.0f, 34.0f, 122.5f, 89.0f, nzh0.balloon_text_favorite), ap4Var.b(26.0f, 26.0f, 59.5f, 44.0f, nzh0.balloon_text_restaurant));
        ArrayList arrayList = this.d;
        arrayList.addAll(g);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList2 = this.e;
            if (!hasNext) {
                long size = arrayList.size() * 400;
                EatsSplashView eatsSplashView2 = this.b;
                if (eatsSplashView2 != null) {
                    ikz ikzVar = new ikz(context, eatsSplashView2.getWidth(), eatsSplashView2.getHeight());
                    ValueAnimator valueAnimator = new ValueAnimator();
                    arrayList2.add(valueAnimator);
                    valueAnimator.setDuration(600L);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    float width2 = eatsSplashView2.getWidth();
                    kce0 kce0Var = ikzVar.k;
                    valueAnimator.setFloatValues(width2, kce0Var.a);
                    valueAnimator.setStartDelay(size);
                    valueAnimator.addUpdateListener(new o8m(2, this, ikzVar, kce0Var));
                    valueAnimator.start();
                }
                this.f.postDelayed(new uhm(11, this), size + OperationProgressView.ROTATION_ANIMATION_DURATION);
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            uo4 uo4Var = (uo4) next;
            if (this.b != null) {
                long j = i * 400;
                boolean z = i % 2 == 0;
                ValueAnimator valueAnimator2 = new ValueAnimator();
                arrayList2.add(valueAnimator2);
                valueAnimator2.setDuration(600L);
                valueAnimator2.setFloatValues(z ? -uo4Var.c.width() : r15.getWidth(), uo4Var.f.a);
                valueAnimator2.setStartDelay(j);
                valueAnimator2.addUpdateListener(new vf2(5, this, uo4Var));
                valueAnimator2.start();
            }
            i = i2;
        }
    }

    public final void b() {
        this.c = null;
        this.d.clear();
        ArrayList<ValueAnimator> arrayList = this.e;
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        arrayList.clear();
        this.f.removeCallbacksAndMessages(null);
        EatsSplashView eatsSplashView = this.b;
        if (eatsSplashView != null) {
            eatsSplashView.hideProgressBar();
        }
    }
}
