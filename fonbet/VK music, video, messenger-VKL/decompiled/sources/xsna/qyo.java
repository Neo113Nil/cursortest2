package xsna;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;
import xsna.oqx0;

/* compiled from: EdgeToEdge.kt */
/* loaded from: classes11.dex */
public final class qyo extends pyo {
    @Override // xsna.oyo, xsna.myo
    public void b(spn0 spn0Var, spn0 spn0Var2, Window window, View view, boolean z, boolean z2) {
        ppx0.b(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        spn0Var.getClass();
        spn0Var2.getClass();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof q7g)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof q7g ? (q7g) obj : null) != null) {
                                ((q7g) obj).getClass();
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        oek0 oek0Var = new oek0(view);
        int i3 = Build.VERSION.SDK_INT;
        oqx0.g fVar = i3 >= 35 ? new oqx0.f(window, oek0Var) : i3 >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.f(!z);
        fVar.e(!z2);
    }
}
