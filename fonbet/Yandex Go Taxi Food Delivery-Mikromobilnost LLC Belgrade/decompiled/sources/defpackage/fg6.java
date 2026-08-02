package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.bricks.c;
import com.yandex.messaging.views.bottomsheet.NavConfiguration;
import com.yandex.messaging.views.bottomsheet.a;
import com.yandex.messaging.views.bottomsheet.b;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes15.dex */
public final /* synthetic */ class fg6 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fg6(euu euuVar, int i, yp6 yp6Var, int i2, boolean z) {
        this.w = euuVar;
        this.b = i;
        this.x = yp6Var;
        this.c = i2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = (a) this.w;
                b bVar = (b) this.x;
                int i = this.b;
                int i2 = this.c;
                BottomSheetBehavior bottomSheetBehavior = aVar.e;
                c cVar = aVar.a;
                boolean z = (bottomSheetBehavior.k0 != 4 || bVar.k().b == NavConfiguration.OpenMode.PreviousScreen || i == cVar.a.getHeight() - i2) ? false : true;
                lu5 lu5Var = new lu5(10, aVar, bVar);
                ViewPropertyAnimator viewPropertyAnimator = aVar.j;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator alpha = cVar.a.animate().alpha(1.0f);
                alpha.setDuration(150L);
                alpha.withEndAction(new js4(19, lu5Var));
                aVar.j = alpha;
                alpha.start();
                ValueAnimator valueAnimator = aVar.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(bottomSheetBehavior.G(), cVar.a.getHeight());
                    ofInt.setDuration(150L);
                    ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofInt.addUpdateListener(new yi(5, aVar));
                    aVar.h = ofInt;
                    ofInt.start();
                }
                return zy11.a;
            default:
                euu euuVar = (euu) this.w;
                int i3 = this.b;
                yp6 yp6Var = (yp6) this.x;
                int i4 = this.c;
                try {
                    euuVar.D.getClass();
                    yp6Var.skip(i4);
                    euuVar.P.o(i3, ErrorCode.CANCEL);
                    synchronized (euuVar) {
                        euuVar.R.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused) {
                }
                return zy11.a;
        }
    }

    public /* synthetic */ fg6(a aVar, b bVar, int i, int i2) {
        this.w = aVar;
        this.x = bVar;
        this.b = i;
        this.c = i2;
    }
}
