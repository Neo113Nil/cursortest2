package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import java.util.concurrent.Future;
import ru.yandex.taxi.statebar.controller.c;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes14.dex */
public final /* synthetic */ class bwi implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bwi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((cwi) obj).a();
                break;
            case 1:
                z4j0 z4j0Var = (z4j0) obj;
                e1 e1Var = z4j0Var.a;
                if (e1Var != null) {
                    try {
                        Future future = e1Var.a;
                        if (future != null) {
                            future.cancel(true);
                        }
                    } catch (Throwable unused) {
                    }
                }
                z4j0Var.a = null;
                break;
            case 2:
                ((c) obj).e = null;
                break;
            case 3:
                TextBlockView.runRotationAnimation$lambda$1((ValueAnimator) obj);
                break;
            default:
                ((Handler) qyy0.a.getValue()).removeCallbacks((Runnable) obj);
                break;
        }
    }
}
