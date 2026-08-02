package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public final class gn60 implements uf90 {
    public final List a;
    public final int b;
    public final boolean c;

    public gn60(List list) {
        boolean z;
        this.a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer b = ((rm60) it.next()).b();
            if (b != null) {
                i3 = b.intValue();
            }
            i2 += i3;
        }
        this.b = i2;
        List list2 = this.a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((rm60) it2.next()).b() == null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.c = z;
        List list3 = this.a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer b2 = ((rm60) it3.next()).b();
                if ((b2 != null ? b2.intValue() : Integer.MAX_VALUE) <= 0) {
                    ny61.g("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((rm60) it4.next()).b() == null && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((rm60) obj).b() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((rm60) it5.next()).b);
        }
        w511.f(g8e.q("At most one variable-length numeric field in a row is allowed, but got several: ", ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", arrayList2));
        throw null;
    }

    @Override // defpackage.uf90
    public final Object a(fpe fpeVar, CharSequence charSequence, int i) {
        int i2 = this.b;
        if (i + i2 > charSequence.length()) {
            return new ff90(i, new csz(20, this));
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        while (ref$IntRef.element + i < charSequence.length() && d6z.K(charSequence.charAt(ref$IntRef.element + i))) {
            ref$IntRef.element++;
        }
        if (ref$IntRef.element < i2) {
            return new ff90(i, new l2z(7, ref$IntRef, this));
        }
        List list = this.a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            Integer b = ((rm60) list.get(i3)).b();
            int intValue = (b != null ? b.intValue() : (ref$IntRef.element - i2) + 1) + i;
            sm60 a = ((rm60) list.get(i3)).a(fpeVar, charSequence, i, intValue);
            if (a != null) {
                return new ff90(i, new fn60(charSequence.subSequence(i, intValue).toString(), this, i3, a, 0));
            }
            i3++;
            i = intValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<rm60> list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (rm60 rm60Var : list) {
            StringBuilder sb = new StringBuilder();
            Integer b = rm60Var.b();
            sb.append(b == null ? "at least one digit" : b + " digits");
            sb.append(" for ");
            sb.append(rm60Var.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
