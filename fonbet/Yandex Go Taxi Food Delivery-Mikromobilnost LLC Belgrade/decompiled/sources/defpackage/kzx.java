package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;

/* loaded from: classes11.dex */
public interface kzx extends jp31 {
    void addToParent(View view);

    void attachTo(ViewManager viewManager);

    ViewGroup.LayoutParams generateLayoutParams(int i, int i2);

    View invoke(View view, tls tlsVar);
}
