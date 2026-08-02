package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.a;

/* loaded from: classes9.dex */
public final class njd {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public njd(ArrayList arrayList) {
        this.b = a.a(new fyi(arrayList, 1));
    }

    public final xh2 a(tg2 tg2Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    xh2 a = ((njd) it.next()).a(tg2Var);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            default:
                return (xh2) ((Map) ((i3y) obj).getValue()).get(qoi0.a(tg2Var.getClass()));
        }
    }

    public njd(List list) {
        this.b = list;
    }
}
