package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SemanticsUtils.android.kt */
/* loaded from: classes11.dex */
public final class ygi0 {
    public static final xfh0 a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((xfh0) arrayList.get(i2)).b == i) {
                return (xfh0) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final ljo0 b(xfi0 xfi0Var) {
        izs izsVar;
        ArrayList arrayList = new ArrayList();
        ck ckVar = (ck) zfi0.a(xfi0Var, wfi0.a);
        if (ckVar == null || (izsVar = (izs) ckVar.b) == null || !((Boolean) izsVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (ljo0) arrayList.get(0);
    }

    public static final xd2 c(be2 be2Var, int i) {
        Object obj;
        Iterator<T> it = be2Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).c == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (xd2) entry.getValue();
        }
        return null;
    }

    public static final String d(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
