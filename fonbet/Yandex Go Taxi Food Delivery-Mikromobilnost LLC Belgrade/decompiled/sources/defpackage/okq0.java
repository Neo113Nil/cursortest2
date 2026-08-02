package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class okq0 {
    public static final dkq0 a = wfz.R;

    public static final boolean a(tvd0 tvd0Var) {
        MotionEvent c;
        List list = tvd0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((zvd0) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent c2 = tvd0Var.c();
                if ((c2 == null || !c2.isFromSource(8194)) && ((c = tvd0Var.c()) == null || !c.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
