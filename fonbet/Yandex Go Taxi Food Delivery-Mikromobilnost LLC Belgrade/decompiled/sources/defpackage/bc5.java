package defpackage;

import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import com.google.android.material.snackbar.b;

/* loaded from: classes11.dex */
public final class bc5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ bc5(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = bVar.i;
                if (baseTransientBottomBar$SnackbarBaseLayout != null) {
                    int height = cn91.e(bVar.h).height();
                    int[] iArr = new int[2];
                    baseTransientBottomBar$SnackbarBaseLayout.getLocationInWindow(iArr);
                    int height2 = (height - (baseTransientBottomBar$SnackbarBaseLayout.getHeight() + iArr[1])) + ((int) baseTransientBottomBar$SnackbarBaseLayout.getTranslationY());
                    int i2 = bVar.o;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            FastOutSlowInInterpolator fastOutSlowInInterpolator = b.t;
                            break;
                        } else {
                            int i3 = bVar.o;
                            bVar.p = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            baseTransientBottomBar$SnackbarBaseLayout.requestLayout();
                            break;
                        }
                    } else {
                        bVar.p = i2;
                        break;
                    }
                }
                break;
            default:
                bVar.b();
                break;
        }
    }
}
