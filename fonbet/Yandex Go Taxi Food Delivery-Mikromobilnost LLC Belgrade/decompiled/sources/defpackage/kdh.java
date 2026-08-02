package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kdh {
    public int a;
    public ArrayList b;

    public kdh(ArrayList arrayList, int i) {
        this.b = arrayList;
        this.a = i;
    }

    public Long a() {
        ArrayList arrayList = this.b;
        boolean isEmpty = arrayList.isEmpty();
        int i = this.a;
        return isEmpty ? i > 0 ? 1L : null : (Long) arrayList.get(Math.min(i / 50, arrayList.size() - 1));
    }

    public tpr b(to2 to2Var) {
        int i = this.a;
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            return ((so2) arrayList.get(i)).a(to2Var, new kdh(arrayList, i + 1));
        }
        ny61.r("Check failed.");
        return null;
    }
}
