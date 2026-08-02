package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class a6j {
    public static final void a(ftk0 ftk0Var, List<? extends zo10> list) {
        ArrayList<String> arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zo10 zo10Var = list.get(i);
            Object o = vua0.o(zo10Var);
            if (o == null && (o = s490.e(zo10Var)) == null) {
                o = new r490();
            }
            androidx.constraintlayout.core.state.a b = ftk0Var.b(o.toString());
            if (b != null) {
                b.g0 = zo10Var;
                ConstraintWidget constraintWidget = b.h0;
                if (constraintWidget != null) {
                    constraintWidget.i0 = zo10Var;
                }
            }
            Object c = zo10Var.c();
            e6j e6jVar = c instanceof e6j ? (e6j) c : null;
            String a = e6jVar != null ? e6jVar.a() : null;
            if (a != null && (o instanceof String)) {
                String str = (String) o;
                HashMap<String, ArrayList<String>> hashMap = ftk0Var.e;
                if (ftk0Var.b(str) != null) {
                    if (hashMap.containsKey(a)) {
                        arrayList = hashMap.get(a);
                    } else {
                        arrayList = new ArrayList<>();
                        hashMap.put(a, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
