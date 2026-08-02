package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class hzv implements t25 {
    public final ArrayList a;
    public String b = "";
    public int c;

    public hzv(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.t25
    public final boolean a(String str) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((t25) it.next()).a(str)) {
                return false;
            }
        }
        return true;
    }
}
