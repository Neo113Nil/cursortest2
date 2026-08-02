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
public final class f3k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Div2View c;

    public /* synthetic */ f3k(a aVar, Div2View div2View, int i) {
        this.a = i;
        this.b = aVar;
        this.c = div2View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        final bw5 a;
        List list;
        int i = this.a;
        mmk mmkVar = null;
        Div2View div2View = this.c;
        final a aVar = this.b;
        switch (i) {
            case 0:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList = aVar.e;
                        omk omkVar = div2View.get_divData();
                        if (omkVar != null && (list = omkVar.c) != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (((mmk) next).b == div2View.getStateId()) {
                                        mmkVar = next;
                                    }
                                }
                            }
                            mmkVar = mmkVar;
                        }
                        if (mmkVar != null) {
                            div2View.discardStateVisibility(mmkVar);
                        }
                        div2View.discardChildrenVisibility();
                        zy11 zy11Var = zy11.a;
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(zy11Var, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list2 = (List) pair.getSecond();
                        if (list2.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$discardVisibilityTracking$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            ((sls) it2.next()).invoke();
                                        }
                                        tls tlsVar = this.$onComplete;
                                        if (tlsVar != null) {
                                            tlsVar.invoke(first);
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
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                }
            default:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList2 = aVar.e;
                        Boolean valueOf = Boolean.valueOf(div2View.divDataChangedObservers.remove((Object) null));
                        List J02 = kotlin.collections.a.J0(arrayList2);
                        arrayList2.clear();
                        Pair pair2 = new Pair(valueOf, J02);
                        aVar.d = false;
                        final Object first2 = pair2.getFirst();
                        final List list3 = (List) pair2.getSecond();
                        if (list3.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$removeDivDataChangeObserver$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            ((sls) it2.next()).invoke();
                                        }
                                        tls tlsVar = this.$onComplete;
                                        if (tlsVar != null) {
                                            tlsVar.invoke(first2);
                                        }
                                        cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a);
                                        return zy11.a;
                                    } catch (Throwable th2) {
                                        cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a);
                                        throw th2;
                                    }
                                }
                            });
                            return;
                        }
                    } finally {
                        aVar.d = false;
                    }
                } finally {
                }
        }
    }
}
