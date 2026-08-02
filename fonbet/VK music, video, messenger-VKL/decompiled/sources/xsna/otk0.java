package xsna;

import android.animation.AnimatorSet;
import android.view.View;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;
import java.util.ArrayList;

/* compiled from: StateAnimator.kt */
/* loaded from: classes4.dex */
public final class otk0<Type> {
    public final v95 a;
    public ZoomRootLayout.a b = ZoomRootLayout.a.c.a;
    public AnimatorSet c;

    public otk0(v95 v95Var) {
        this.a = v95Var;
    }

    public final void a(ZoomRootLayout.a aVar, View... viewArr) {
        if (aVar.equals(this.b)) {
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b = aVar;
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList(viewArr.length);
        for (View view : viewArr) {
            arrayList.add(ZoomRootLayout.d((ZoomRootLayout) this.a.c, view, aVar));
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new ntk0(this));
        animatorSet2.start();
        this.c = animatorSet2;
    }
}
