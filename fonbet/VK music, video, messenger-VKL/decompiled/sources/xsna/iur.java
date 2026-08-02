package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;

/* compiled from: FlowerAnimationController.kt */
/* loaded from: classes18.dex */
public final class iur {
    public final View a;
    public final boolean b;
    public final ViewGroup c;
    public final lur d;

    public iur(View view, boolean z) {
        Object obj;
        this.a = view;
        this.b = z;
        Iterator it = dli0.e(view.getParent(), eyt0.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ViewParent viewParent = (ViewParent) obj;
            if ((viewParent instanceof ViewGroup) && ((ViewGroup) viewParent).getId() == 16908290) {
                break;
            }
        }
        this.c = (ViewGroup) obj;
        this.d = new lur(this.a.getContext());
    }
}
