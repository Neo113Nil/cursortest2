package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.explorer.impl.ui.map.animation.a;

/* loaded from: classes12.dex */
public final class dvo implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ValueAnimator b;
    public final /* synthetic */ a c;

    public /* synthetic */ dvo(ValueAnimator valueAnimator, a aVar, int i) {
        this.a = i;
        this.b = valueAnimator;
        this.c = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        ValueAnimator valueAnimator = this.b;
        switch (i) {
            case 0:
                valueAnimator.cancel();
                aVar.a.remove(valueAnimator);
                break;
            default:
                valueAnimator.cancel();
                aVar.a.remove(valueAnimator);
                break;
        }
        return zy11Var;
    }
}
