package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final class jg0 implements z910 {
    public final /* synthetic */ int a;

    public /* synthetic */ jg0(int i) {
        this.a = i;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Integer valueOf;
        long j2;
        long j3;
        aa10 w;
        char c;
        long j4 = j;
        int i = 1;
        char c2 = 2;
        switch (this.a) {
            case 0:
                int b = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b, j4, list)) ? o57.b(kVar, list, j4, b) : o57.c(kVar, list, j4, b);
            case 1:
                int b2 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b2, j4, list)) ? o57.b(kVar, list, j4, b2) : o57.c(kVar, list, j4, b2);
            case 2:
                int b3 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b3, j4, list)) ? o57.b(kVar, list, j4, b3) : o57.c(kVar, list, j4, b3);
            case 3:
                int b4 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b4, j4, list)) ? o57.b(kVar, list, j4, b4) : o57.c(kVar, list, j4, b4);
            case 4:
                int b5 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b5, j4, list)) ? o57.b(kVar, list, j4, b5) : o57.c(kVar, list, j4, b5);
            case 5:
                int b6 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b6, j4, list)) ? o57.b(kVar, list, j4, b6) : o57.c(kVar, list, j4, b6);
            case 6:
                int b7 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b7, j4, list)) ? o57.b(kVar, list, j4, b7) : o57.c(kVar, list, j4, b7);
            case 7:
                int b8 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b8, j4, list)) ? o57.b(kVar, list, j4, b8) : o57.c(kVar, list, j4, b8);
            case 8:
                int b9 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b9, j4, list)) ? o57.b(kVar, list, j4, b9) : o57.c(kVar, list, j4, b9);
            case 9:
                int b10 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b10, j4, list)) ? o57.b(kVar, list, j4, b10) : o57.c(kVar, list, j4, b10);
            case 10:
                int b11 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b11, j4, list)) ? o57.b(kVar, list, j4, b11) : o57.c(kVar, list, j4, b11);
            case 11:
                int b12 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b12, j4, list)) ? o57.b(kVar, list, j4, b12) : o57.c(kVar, list, j4, b12);
            case 12:
                int b13 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b13, j4, list)) ? o57.b(kVar, list, j4, b13) : o57.c(kVar, list, j4, b13);
            case 13:
                ArrayList arrayList = new ArrayList(list.size());
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = -1;
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    x910 x910Var = (x910) list.get(i2);
                    if (jl40.l(pj91.g(x910Var), "center")) {
                        ref$IntRef.element = i2;
                        c = c2;
                    } else {
                        c = c2;
                        arrayList.add(x910Var.l0(n8e.b(0, j4, 0, 0, 0, 11)));
                    }
                    i2++;
                    c2 = c;
                    j4 = j;
                }
                Integer num = null;
                if (arrayList.isEmpty()) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((o) arrayList.get(0)).a);
                    int f = scc.f(arrayList);
                    if (1 <= f) {
                        int i3 = 1;
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(((o) arrayList.get(i3)).a);
                            if (valueOf2.compareTo(valueOf) > 0) {
                                valueOf = valueOf2;
                            }
                            if (i3 != f) {
                                i3++;
                            }
                        }
                    }
                }
                int intValue = (valueOf != null ? valueOf.intValue() : 0) * 2;
                x910 x910Var2 = (x910) list.get(ref$IntRef.element);
                if (n8e.e(j)) {
                    j2 = j;
                    j3 = n8e.b(0, j2, n8e.i(j) - intValue, 0, 0, 9);
                } else {
                    j2 = j;
                    j3 = j2;
                }
                o l0 = x910Var2.l0(j3);
                int i4 = intValue + l0.a;
                if (!arrayList.isEmpty()) {
                    Integer valueOf3 = Integer.valueOf(((o) arrayList.get(0)).b);
                    int f2 = scc.f(arrayList);
                    if (1 <= f2) {
                        while (true) {
                            Integer valueOf4 = Integer.valueOf(((o) arrayList.get(i)).b);
                            if (valueOf4.compareTo(valueOf3) > 0) {
                                valueOf3 = valueOf4;
                            }
                            if (i != f2) {
                                i++;
                            }
                        }
                    }
                    num = valueOf3;
                }
                int max = Math.max(num != null ? num.intValue() : 0, l0.b);
                if (n8e.e(j2)) {
                    i4 = Math.max(i4, n8e.i(j2));
                }
                if (n8e.d(j2)) {
                    max = Math.max(max, n8e.h(j2));
                }
                int i5 = max;
                int i6 = i4;
                w = kVar.w(i6, i5, b.f(), new cic(i6, ref$IntRef, arrayList, i5, l0));
                return w;
            case 14:
                int b14 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b14, j4, list)) ? o57.b(kVar, list, j4, b14) : o57.c(kVar, list, j4, b14);
            case 15:
                int b15 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b15, j4, list)) ? o57.b(kVar, list, j4, b15) : o57.c(kVar, list, j4, b15);
            case 16:
                int b16 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b16, j4, list)) ? o57.b(kVar, list, j4, b16) : o57.c(kVar, list, j4, b16);
            case 17:
                int b17 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b17, j4, list)) ? o57.b(kVar, list, j4, b17) : o57.c(kVar, list, j4, b17);
            case 18:
                int b18 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b18, j4, list)) ? o57.b(kVar, list, j4, b18) : o57.c(kVar, list, j4, b18);
            case 19:
                int b19 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b19, j4, list)) ? o57.b(kVar, list, j4, b19) : o57.c(kVar, list, j4, b19);
            case 20:
                int b20 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b20, j4, list)) ? o57.b(kVar, list, j4, b20) : o57.c(kVar, list, j4, b20);
            case 21:
                int b21 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b21, j4, list)) ? o57.b(kVar, list, j4, b21) : o57.c(kVar, list, j4, b21);
            case 22:
                int b22 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b22, j4, list)) ? o57.b(kVar, list, j4, b22) : o57.c(kVar, list, j4, b22);
            case 23:
                int b23 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b23, j4, list)) ? o57.b(kVar, list, j4, b23) : o57.c(kVar, list, j4, b23);
            case 24:
                int b24 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b24, j4, list)) ? o57.b(kVar, list, j4, b24) : o57.c(kVar, list, j4, b24);
            case 25:
                int b25 = m810.b(kVar.w0(4.0f));
                return (list.size() > 2 || !o57.a(b25, j4, list)) ? o57.b(kVar, list, j4, b25) : o57.c(kVar, list, j4, b25);
            case 26:
                int b26 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b26, j4, list)) ? o57.b(kVar, list, j4, b26) : o57.c(kVar, list, j4, b26);
            case 27:
                int b27 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b27, j4, list)) ? o57.b(kVar, list, j4, b27) : o57.c(kVar, list, j4, b27);
            case 28:
                int b28 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b28, j4, list)) ? o57.b(kVar, list, j4, b28) : o57.c(kVar, list, j4, b28);
            default:
                int b29 = m810.b(kVar.w0(4.0f));
                return (list.size() > 1 || !o57.a(b29, j4, list)) ? o57.b(kVar, list, j4, b29) : o57.c(kVar, list, j4, b29);
        }
    }
}
