package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;

/* loaded from: classes15.dex */
public final class b020 {
    public final StackTraceElement[] a = Thread.currentThread().getStackTrace();
    public final i3y b;
    public final i3y c;

    public b020() {
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: a020
            public final /* synthetic */ b020 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b020 b020Var = this.b;
                switch (i2) {
                    case 0:
                        StackTraceElement[] stackTraceElementArr = b020Var.a;
                        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
                        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                            arrayList.add(stackTraceElement.toString());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (evu0.y((String) next, "com.yandex.messaging", false)) {
                                arrayList2.add(next);
                            }
                        }
                        return kotlin.collections.a.X(arrayList2, "\n", null, null, null, 62);
                    default:
                        StackTraceElement[] stackTraceElementArr2 = b020Var.a;
                        ArrayList arrayList3 = new ArrayList(stackTraceElementArr2.length);
                        for (StackTraceElement stackTraceElement2 : stackTraceElementArr2) {
                            arrayList3.add(stackTraceElement2.toString());
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            int L = evu0.L("at ", str, 6);
                            int K = evu0.K(str, ')', 0, 6);
                            if (L > 0 && K > 0 && K > L + 1) {
                                str = str.substring(L + 3, K);
                            }
                            arrayList4.add(str);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (!evu0.y((String) next2, "Unknown Source", false)) {
                                arrayList5.add(next2);
                            }
                        }
                        return kotlin.collections.a.X(new u1l(2, arrayList5), " -> ", null, null, null, 62);
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: a020
            public final /* synthetic */ b020 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b020 b020Var = this.b;
                switch (i22) {
                    case 0:
                        StackTraceElement[] stackTraceElementArr = b020Var.a;
                        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
                        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                            arrayList.add(stackTraceElement.toString());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (evu0.y((String) next, "com.yandex.messaging", false)) {
                                arrayList2.add(next);
                            }
                        }
                        return kotlin.collections.a.X(arrayList2, "\n", null, null, null, 62);
                    default:
                        StackTraceElement[] stackTraceElementArr2 = b020Var.a;
                        ArrayList arrayList3 = new ArrayList(stackTraceElementArr2.length);
                        for (StackTraceElement stackTraceElement2 : stackTraceElementArr2) {
                            arrayList3.add(stackTraceElement2.toString());
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            int L = evu0.L("at ", str, 6);
                            int K = evu0.K(str, ')', 0, 6);
                            if (L > 0 && K > 0 && K > L + 1) {
                                str = str.substring(L + 3, K);
                            }
                            arrayList4.add(str);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (!evu0.y((String) next2, "Unknown Source", false)) {
                                arrayList5.add(next2);
                            }
                        }
                        return kotlin.collections.a.X(new u1l(2, arrayList5), " -> ", null, null, null, 62);
                }
            }
        });
    }
}
