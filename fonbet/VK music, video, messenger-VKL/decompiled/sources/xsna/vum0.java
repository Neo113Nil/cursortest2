package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vum0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vum0(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.d = obj;
        this.c = str;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                zge0.a.c((Context) this.d, "fcm", this.c, (String) this.e);
                break;
            case 1:
                nku0 nku0Var = (nku0) this.d;
                List list = (List) this.e;
                ArrayList arrayList = nku0Var.f;
                ArrayList arrayList2 = nku0Var.e;
                if (nku0Var.j) {
                    list.add(0, nku0Var.k);
                }
                if (this.c == null) {
                    arrayList2.addAll(list);
                    nku0Var.g = arrayList2;
                } else {
                    arrayList.addAll(list);
                    nku0Var.g = arrayList;
                }
                nku0Var.notifyDataSetChanged();
                break;
            default:
                com.ironsource.mediationsdk.c.b((AdapterBaseInterface) this.d, this.c, (List) this.e);
                break;
        }
    }

    public /* synthetic */ vum0(nku0 nku0Var, List list, String str) {
        this.b = 1;
        this.d = nku0Var;
        this.e = list;
        this.c = str;
    }
}
