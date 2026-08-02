package defpackage;

import android.view.ViewPropertyAnimator;

/* loaded from: classes4.dex */
public final /* synthetic */ class i0t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPropertyAnimator b;

    public /* synthetic */ i0t0(ViewPropertyAnimator viewPropertyAnimator, int i) {
        this.a = i;
        this.b = viewPropertyAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        switch (i) {
            case 0:
                viewPropertyAnimator.start();
                break;
            case 1:
                viewPropertyAnimator.start();
                break;
            case 2:
                viewPropertyAnimator.start();
                break;
            case 3:
                viewPropertyAnimator.start();
                break;
            default:
                viewPropertyAnimator.start();
                break;
        }
    }
}
