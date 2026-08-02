package defpackage;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.a;

/* loaded from: classes10.dex */
public abstract class c2c {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final boolean a(a aVar) {
        ViewParent parent = tje.V(aVar).getParent();
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
