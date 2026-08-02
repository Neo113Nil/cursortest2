package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import defpackage.fu31;
import defpackage.np31;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class e extends fu31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fu31, defpackage.eu31
    public final void onAnimationEnd(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AppCompatDelegateImpl appCompatDelegateImpl = ((f) obj).a;
                appCompatDelegateImpl.mActionModeView.setAlpha(1.0f);
                appCompatDelegateImpl.mFadeAnim.d(null);
                appCompatDelegateImpl.mFadeAnim = null;
                break;
            case 1:
                AppCompatDelegateImpl appCompatDelegateImpl2 = (AppCompatDelegateImpl) obj;
                appCompatDelegateImpl2.mActionModeView.setAlpha(1.0f);
                appCompatDelegateImpl2.mFadeAnim.d(null);
                appCompatDelegateImpl2.mFadeAnim = null;
                break;
            default:
                AppCompatDelegateImpl appCompatDelegateImpl3 = ((h) obj).b;
                appCompatDelegateImpl3.mActionModeView.setVisibility(8);
                PopupWindow popupWindow = appCompatDelegateImpl3.mActionModePopup;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl3.mActionModeView.getParent() instanceof View) {
                    View view2 = (View) appCompatDelegateImpl3.mActionModeView.getParent();
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    np31.c(view2);
                }
                appCompatDelegateImpl3.mActionModeView.killMode();
                appCompatDelegateImpl3.mFadeAnim.d(null);
                appCompatDelegateImpl3.mFadeAnim = null;
                ViewGroup viewGroup = appCompatDelegateImpl3.mSubDecor;
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                np31.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.fu31, defpackage.eu31
    public void onAnimationStart(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((f) obj).a.mActionModeView.setVisibility(0);
                break;
            case 1:
                AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) obj;
                appCompatDelegateImpl.mActionModeView.setVisibility(0);
                if (appCompatDelegateImpl.mActionModeView.getParent() instanceof View) {
                    View view2 = (View) appCompatDelegateImpl.mActionModeView.getParent();
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    np31.c(view2);
                    break;
                }
                break;
            default:
                super.onAnimationStart(view);
                break;
        }
    }
}
