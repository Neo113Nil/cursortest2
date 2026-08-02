package defpackage;

import android.view.KeyEvent;
import android.view.View;
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
public final class e3k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Div2View c;

    public /* synthetic */ e3k(a aVar, Div2View div2View, int i) {
        this.a = i;
        this.b = aVar;
        this.c = div2View;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        final bw5 a;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final a aVar = this.b;
        Div2View div2View = this.c;
        switch (i) {
            case 0:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList = aVar.e;
                        div2View.cleanup(true);
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(zy11Var, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$cleanup$$inlined$runWithinBindingContext$1$1
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
                    cw5.b(a);
                }
            case 1:
                final bw5 a2 = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList2 = aVar.e;
                        div2View.mediaWasReleased = true;
                        div2View.cancelImageLoads();
                        int i2 = 0;
                        while (true) {
                            if (!(i2 < div2View.getChildCount())) {
                                List J02 = kotlin.collections.a.J0(arrayList2);
                                arrayList2.clear();
                                Pair pair2 = new Pair(zy11Var, J02);
                                aVar.d = false;
                                final Object first2 = pair2.getFirst();
                                final List list2 = (List) pair2.getSecond();
                                if (list2.isEmpty()) {
                                    cw5.b(a2);
                                    return;
                                } else {
                                    ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$releaseMedia$$inlined$runWithinBindingContext$1$1
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
                                                cw5.b(a2);
                                                return zy11.a;
                                            } catch (Throwable th) {
                                                cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                                cw5.b(a2);
                                                throw th;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            int i3 = i2 + 1;
                            View childAt = div2View.getChildAt(i2);
                            if (childAt == null) {
                                throw new IndexOutOfBoundsException();
                            }
                            wwg.Y(div2View.getMediaReleaseViewVisitor$div_release(), childAt);
                            i2 = i3;
                        }
                    } finally {
                    }
                } finally {
                    cw5.b(a2);
                }
            default:
                a = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList3 = aVar.e;
                        if (div2View.getChildCount() > 0) {
                            KeyEvent.Callback childAt2 = div2View.getChildAt(0);
                            zdk zdkVar = childAt2 instanceof zdk ? (zdk) childAt2 : null;
                            if (zdkVar != null) {
                                zdkVar.stopDivAnimation();
                            }
                        }
                        List J03 = kotlin.collections.a.J0(arrayList3);
                        arrayList3.clear();
                        Pair pair3 = new Pair(zy11Var, J03);
                        aVar.d = false;
                        final Object first3 = pair3.getFirst();
                        final List list3 = (List) pair3.getSecond();
                        if (list3.isEmpty()) {
                            cw5.b(a);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$stopDivAnimation$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it = list3.iterator();
                                        while (it.hasNext()) {
                                            ((sls) it.next()).invoke();
                                        }
                                        tls tlsVar = this.$onComplete;
                                        if (tlsVar != null) {
                                            tlsVar.invoke(first3);
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
        }
    }
}
