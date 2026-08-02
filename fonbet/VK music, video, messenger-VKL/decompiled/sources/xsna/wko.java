package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes13.dex */
public final class wko extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wko(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationEnd(animator);
                xko xkoVar = (xko) this.c;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = xkoVar.g;
                if (arrayList != null && !xkoVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((lf2) it.next()).a(xkoVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.b) {
            case 1:
                super.onAnimationRepeat(animator);
                a8z a8zVar = (a8z) this.c;
                a8zVar.f = (a8zVar.f + 1) % a8zVar.e.c.length;
                a8zVar.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
