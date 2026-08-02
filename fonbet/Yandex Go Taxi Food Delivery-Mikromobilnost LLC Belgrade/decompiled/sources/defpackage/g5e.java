package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.b;
import androidx.viewpager.widget.ViewPager;
import com.yandex.go.connection_prewarm.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g5e implements al7, bx60 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public g5e(ViewPager viewPager) {
        this.a = 2;
        this.c = viewPager;
        this.b = new Rect();
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        ViewPager viewPager = (ViewPager) this.c;
        n751 k = b.k(view, n751Var);
        if (k.a.o()) {
            return k;
        }
        Rect rect = (Rect) this.b;
        rect.left = k.b();
        rect.top = k.d();
        rect.right = k.c();
        rect.bottom = k.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            n751 d = b.d(viewPager.getChildAt(i), k);
            rect.left = Math.min(d.b(), rect.left);
            rect.top = Math.min(d.d(), rect.top);
            rect.right = Math.min(d.c(), rect.right);
            rect.bottom = Math.min(d.a(), rect.bottom);
        }
        return k.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        switch (this.a) {
            case 0:
                jst.e.getClass();
                break;
            default:
                try {
                    ((yk7) this.b).k((yv60) this.c, iOException);
                    break;
                } catch (Throwable th) {
                    udq0.R(th);
                    return;
                }
        }
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kvj0Var.close();
                jst.e.getClass();
                if (((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    t61 t61Var = ((a) obj).d;
                    t61Var.getClass();
                    t61Var.a.a("ConnectionPrewarmer.Prewarm", new HashMap(), 1, new HashMap());
                    break;
                }
                break;
            default:
                yk7 yk7Var = (yk7) obj2;
                yv60 yv60Var = (yv60) obj;
                try {
                    try {
                        yk7Var.o(yv60Var, yv60Var.c(kvj0Var));
                        break;
                    } catch (Throwable th) {
                        udq0.R(th);
                        return;
                    }
                } catch (Throwable th2) {
                    udq0.R(th2);
                    try {
                        yk7Var.k(yv60Var, th2);
                        return;
                    } catch (Throwable th3) {
                        udq0.R(th3);
                    }
                }
        }
    }

    public g5e(yv60 yv60Var, yk7 yk7Var) {
        this.a = 1;
        this.c = yv60Var;
        this.b = yk7Var;
    }

    public g5e(int i, AtomicBoolean atomicBoolean, a aVar) {
        this.a = 0;
        this.b = atomicBoolean;
        this.c = aVar;
    }
}
