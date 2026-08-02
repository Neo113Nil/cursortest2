package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public abstract class dfs0 {
    public final ViewGroup a;
    public final wls d;
    public final wpy0 b = new wpy0(27, this);
    public final ArrayList c = new ArrayList();
    public List e = EmptyList.a;

    public dfs0(ViewGroup viewGroup, wls wlsVar) {
        this.a = viewGroup;
        this.d = wlsVar;
    }

    public abstract kr31 a(ViewGroup viewGroup, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(List list) {
        List list2 = this.e;
        this.e = list;
        kp50.f(new og20(list2, list, new pw7(19, this.d)), true).a(this.b);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kr31 kr31Var = (kr31) arrayList.get(i);
            kr31Var.c = i;
            if (kr31Var.b) {
                ((xv5) kr31Var).c(this.e.get(i));
            }
            kr31Var.b = false;
        }
    }
}
