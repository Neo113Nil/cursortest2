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
public final class d3k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ s1b0 w;

    public /* synthetic */ d3k(a aVar, Div2View div2View, s1b0 s1b0Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = div2View;
        this.w = s1b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final bw5 a;
        int i = this.a;
        s1b0 s1b0Var = this.w;
        Div2View div2View = this.c;
        final a aVar = this.b;
        switch (i) {
            case 0:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList = aVar.e;
                        Boolean valueOf = Boolean.valueOf(div2View.persistentDivDataObservers.a(s1b0Var));
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(valueOf, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$addPersistentDivDataObserver$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

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
                    } finally {
                    }
                } finally {
                }
            default:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList2 = aVar.e;
                        Boolean valueOf2 = Boolean.valueOf(div2View.persistentDivDataObservers.b(s1b0Var));
                        List J02 = kotlin.collections.a.J0(arrayList2);
                        arrayList2.clear();
                        Pair pair2 = new Pair(valueOf2, J02);
                        aVar.d = false;
                        final Object first2 = pair2.getFirst();
                        final List list2 = (List) pair2.getSecond();
                        if (list2.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$removePersistentDivDataObserver$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            ((sls) it.next()).invoke();
                                        }
                                        tls tlsVar = this.$onComplete;
                                        if (tlsVar != null) {
                                            tlsVar.invoke(first2);
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
                    } finally {
                    }
                } finally {
                }
        }
    }
}
