package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public final class duu0 implements uf90 {
    public final svb1 a;
    public final String b;
    public final buu0 c = new buu0(0);

    public duu0(Collection collection, svb1 svb1Var, String str) {
        int i;
        this.a = svb1Var;
        this.b = str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() <= 0) {
                w511.f("Found an empty string in ".concat(this.b));
                throw null;
            }
            buu0 buu0Var = this.c;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str2.charAt(i2);
                List list = buu0Var.a;
                String valueOf = String.valueOf(charAt);
                int size = list.size();
                scc.k(list.size(), size);
                int i3 = size - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i = -(i4 + 1);
                        break;
                    }
                    i = (i4 + i3) >>> 1;
                    int b = uvc.b((String) ((Pair) list.get(i)).c(), valueOf);
                    if (b < 0) {
                        i4 = i + 1;
                    } else if (b <= 0) {
                        break;
                    } else {
                        i3 = i - 1;
                    }
                }
                if (i < 0) {
                    buu0 buu0Var2 = new buu0(0);
                    list.add((-i) - 1, new Pair(String.valueOf(charAt), buu0Var2));
                    buu0Var = buu0Var2;
                } else {
                    buu0Var = (buu0) ((Pair) list.get(i)).f();
                }
            }
            if (buu0Var.b) {
                w511.f(oyr.p("The string '", str2, "' was passed several times"));
                throw null;
            }
            buu0Var.b = true;
        }
        b(this.c);
    }

    public static final void b(buu0 buu0Var) {
        List<Pair> list = buu0Var.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((buu0) ((Pair) it.next()).getSecond());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            String str = (String) pair.getFirst();
            buu0 buu0Var2 = (buu0) pair.getSecond();
            boolean z = buu0Var2.b;
            List list2 = buu0Var2.a;
            if (z || list2.size() != 1) {
                arrayList.add(new Pair(str, buu0Var2));
            } else {
                Pair pair2 = (Pair) a.s0(list2);
                String str2 = (String) pair2.getFirst();
                arrayList.add(new Pair(b64.j(str, str2), (buu0) pair2.getSecond()));
            }
        }
        list.clear();
        list.addAll(a.x0(arrayList, new cuu0()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r4.element = r7.length() + r4.element;
        r0 = r2;
        r13 = r5;
     */
    @Override // defpackage.uf90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fpe fpeVar, CharSequence charSequence, int i) {
        CharSequence charSequence2;
        boolean P;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        buu0 buu0Var = this.c;
        Integer num = null;
        loop0: while (ref$IntRef.element <= charSequence.length()) {
            if (buu0Var.b) {
                num = Integer.valueOf(ref$IntRef.element);
            }
            for (Pair pair : buu0Var.a) {
                String str = (String) pair.getFirst();
                buu0 buu0Var2 = (buu0) pair.getSecond();
                int i2 = ref$IntRef.element;
                if (charSequence instanceof String) {
                    P = ((String) charSequence).startsWith(str, i2);
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = charSequence;
                    P = evu0.P(charSequence2, i2, str, 0, str.length(), false);
                }
                if (P) {
                    break;
                }
                charSequence = charSequence2;
            }
        }
        CharSequence charSequence3 = charSequence;
        if (num == null) {
            return new ff90(i, new fn60(this, charSequence3, i, ref$IntRef, 1));
        }
        String obj = charSequence3.subSequence(i, num.intValue()).toString();
        svb1 svb1Var = this.a;
        Object a = svb1Var.a(fpeVar, obj);
        return a == null ? num : new ff90(i, new in2(13, a, obj, svb1Var));
    }
}
