package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.b;

/* loaded from: classes10.dex */
public final class pa30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MotionLayout b;

    public /* synthetic */ pa30(MotionLayout motionLayout, int i) {
        this.a = i;
        this.b = motionLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        b bVar2;
        int i = this.a;
        MotionLayout motionLayout = this.b;
        switch (i) {
            case 0:
                bVar = motionLayout.mStateCache;
                bVar.a();
                break;
            case 1:
                motionLayout.mInRotation = false;
                break;
            default:
                bVar2 = motionLayout.mStateCache;
                bVar2.a();
                break;
        }
    }
}
