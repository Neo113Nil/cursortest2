package defpackage;

import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class i3k implements Runnable {
    public final /* synthetic */ a a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ omk w;
    public final /* synthetic */ zmk x;
    public final /* synthetic */ List y;
    public final /* synthetic */ boolean z;

    public i3k(a aVar, tls tlsVar, Div2View div2View, omk omkVar, zmk zmkVar, List list, boolean z) {
        this.a = aVar;
        this.b = tlsVar;
        this.c = div2View;
        this.w = omkVar;
        this.x = zmkVar;
        this.y = list;
        this.z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean dataWithStatesInternal;
        final a aVar = this.a;
        final bw5 a = aVar.b.a();
        try {
            try {
                aVar.d = true;
                ArrayList arrayList = aVar.e;
                dataWithStatesInternal = this.c.setDataWithStatesInternal(this.w, this.x, this.y, this.z);
                Boolean valueOf = Boolean.valueOf(dataWithStatesInternal);
                List J0 = kotlin.collections.a.J0(arrayList);
                arrayList.clear();
                Pair pair = new Pair(valueOf, J0);
                aVar.d = false;
                final Object first = pair.getFirst();
                final List list = (List) pair.getSecond();
                if (list.isEmpty() && this.b == null) {
                    cw5.b(a);
                    return;
                }
                ngd0 ngd0Var = ngd0.G;
                final tls tlsVar = this.b;
                ngd0Var.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$setDataWithStatesAsync$$inlined$runOnBindingThread$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        com.yandex.div.core.util.binding.a.this.b.d();
                        try {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((sls) it.next()).invoke();
                            }
                            tls tlsVar2 = tlsVar;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(first);
                            }
                            cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                            cw5.b(a);
                            return zy11.a;
                        } catch (Throwable th) {
                            cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                            cw5.b(a);
                            throw th;
                        }
                    }
                });
            } catch (Throwable th) {
                aVar.d = false;
                throw th;
            }
        } catch (Throwable th2) {
            cw5.b(a);
            throw th2;
        }
    }
}
