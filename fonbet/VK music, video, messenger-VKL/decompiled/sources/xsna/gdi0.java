package xsna;

import android.view.MotionEvent;
import java.util.List;
import xsna.zbi0;

/* compiled from: SelectionGestures.android.kt */
/* loaded from: classes11.dex */
public final class gdi0 {
    public static final wbi0 a = zbi0.a.b;

    public static final boolean a(plb0 plb0Var) {
        MotionEvent a2;
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (list.get(i).i == 2) {
                i++;
            } else {
                MotionEvent a3 = plb0Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = plb0Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
