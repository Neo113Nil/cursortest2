package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class a73 implements mvo {
    public final ArrayList a;

    public a73(List list) {
        this.a = new ArrayList(list);
    }

    public static void e(a73 a73Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = a73Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((glg0) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public boolean a(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((glg0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public glg0 b(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            glg0 glg0Var = (glg0) it.next();
            if (glg0Var.getClass() == cls) {
                return glg0Var;
            }
        }
        return null;
    }

    public ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            glg0 glg0Var = (glg0) it.next();
            if (cls.isAssignableFrom(glg0Var.getClass())) {
                arrayList.add(glg0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        return new u63(this.a);
    }

    public a73(ArrayList arrayList) {
        this.a = arrayList;
    }
}
