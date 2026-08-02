package defpackage;

import android.graphics.drawable.Animatable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* loaded from: classes10.dex */
public final class bg2 extends cg2 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ bg2(Animatable animatable, int i) {
        this.a = i;
        this.b = animatable;
    }

    @Override // defpackage.cg2
    public final void c() {
        int i = this.a;
        Animatable animatable = this.b;
        switch (i) {
            case 0:
                animatable.start();
                break;
            default:
                ((AnimatedVectorDrawableCompat) animatable).start();
                break;
        }
    }

    @Override // defpackage.cg2
    public final void d() {
        int i = this.a;
        Animatable animatable = this.b;
        switch (i) {
            case 0:
                animatable.stop();
                break;
            default:
                ((AnimatedVectorDrawableCompat) animatable).stop();
                break;
        }
    }
}
