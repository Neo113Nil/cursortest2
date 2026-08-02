package xsna;

import androidx.recyclerview.widget.m;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.t53;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jhn0 implements izs {
    public final /* synthetic */ ihn0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.vk.lists.c d;

    public /* synthetic */ jhn0(ihn0 ihn0Var, boolean z, com.vk.lists.c cVar) {
        this.b = ihn0Var;
        this.c = z;
        this.d = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        t53 t53Var;
        of3 of3Var = (of3) obj;
        ArrayList arrayList = of3Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new q53((WebApiApplication) it.next()));
        }
        wo6 wo6Var = this.b.d;
        if (wo6Var != null) {
            hhn0 hhn0Var = (hhn0) wo6Var;
            if (this.c) {
                t53 t53Var2 = hhn0Var.n;
                t53Var = t53Var2 != null ? t53Var2 : null;
                ArrayList arrayList3 = t53Var.e;
                m.d a = androidx.recyclerview.widget.m.a(new t53.h(arrayList3, arrayList2), true);
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                a.b(t53Var);
            } else {
                t53 t53Var3 = hhn0Var.n;
                t53Var = t53Var3 != null ? t53Var3 : null;
                ArrayList arrayList4 = t53Var.e;
                int size = arrayList4.size();
                arrayList4.addAll(arrayList2);
                t53Var.notifyItemRangeInserted(size, arrayList2.size());
            }
        }
        this.d.l(of3Var.c);
        return s3q0.a;
    }
}
