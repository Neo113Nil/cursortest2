package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fd9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fd9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hd9 hd9Var = (hd9) this.c;
                od9 od9Var = (od9) obj;
                L.e("CallsQueueUserIdDelegate", "auth state: " + od9Var);
                if (od9Var.a) {
                    io.reactivex.rxjava3.disposables.c cVar = hd9Var.d;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    hd9Var.d = null;
                    List<UserId> g = hd9Var.a.a.g();
                    ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                    Iterator<T> it = g.iterator();
                    while (it.hasNext()) {
                        arrayList.add(hd9Var.b.d((UserId) it.next()));
                    }
                    hd9Var.d = io.reactivex.rxjava3.core.q.O(arrayList).L(io.reactivex.rxjava3.internal.functions.a.a, false).subscribe(new com.vk.im.ui.components.dialogs_list.b(new g60(hd9Var, 14), 9));
                } else {
                    io.reactivex.rxjava3.disposables.c cVar2 = hd9Var.d;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    hd9Var.d = null;
                }
                break;
            default:
                oal oalVar = (oal) this.c;
                ((Boolean) obj).booleanValue();
                oalVar.e();
                break;
        }
        return s3q0.a;
    }
}
