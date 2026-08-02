package xsna;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: Clickable.android.kt */
/* loaded from: classes11.dex */
public final class xkc {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final boolean a(zc zcVar) {
        ViewParent parent = jtl.a(zcVar).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
