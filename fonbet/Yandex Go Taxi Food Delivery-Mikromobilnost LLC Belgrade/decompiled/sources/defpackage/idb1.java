package defpackage;

import androidx.compose.ui.platform.j;
import com.ybsdk.widgets.common.rangedatepicker.DayState;
import com.ybsdk.widgets.common.rangedatepicker.MonthHeaderState;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes4.dex */
public abstract class idb1 {
    public static final float a(float f, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1973545785);
        float w0 = ((fwi) btsVar.m(j.h)).w0(f);
        btsVar.t(false);
        return w0;
    }

    public static final int b(int i, q5y q5yVar, Object obj) {
        int b;
        return (obj == null || q5yVar.getItemCount() == 0 || (i < q5yVar.getItemCount() && obj.equals(q5yVar.c(i))) || (b = q5yVar.b(obj)) == -1) ? i : b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList c(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        Calendar calendar4;
        Calendar calendar5;
        Calendar calendar6;
        int i;
        c6w c6wVar;
        Object obj;
        Object obj2;
        DayState dayState;
        Calendar e = kdb1.e();
        Calendar calendar7 = (Calendar) calendar.clone();
        calendar7.set(11, 0);
        calendar7.set(12, 0);
        calendar7.set(13, 0);
        calendar7.set(14, 0);
        int i2 = 1;
        int i3 = 2;
        int i4 = ((e.get(1) - calendar7.get(1)) * 12) + (e.get(2) - calendar7.get(2));
        Calendar calendar8 = (Calendar) calendar7.clone();
        int i5 = 5;
        calendar8.set(5, 1);
        d6w d6wVar = new d6w(0, i4, 1);
        ArrayList arrayList = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            Calendar calendar9 = (Calendar) calendar8.clone();
            calendar9.add(i3, nextInt);
            kb61 kb61Var = new kb61(calendar9.get(i2), calendar9.get(i3));
            ArrayList arrayList2 = new ArrayList();
            Calendar a = kb61Var.a(i2);
            Calendar b = kb61Var.b();
            b.set(i5, b.getActualMaximum(i5));
            int i6 = a.get(7);
            int i7 = i6 == i2 ? 6 : i6 - 2;
            if (i7 > 0) {
                ArrayList arrayList3 = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    arrayList3.add(gf7.a);
                }
                arrayList2.addAll(arrayList3);
            } else {
                i7 = 0;
            }
            int i9 = b.get(i5);
            if (i2 <= i9) {
                int i10 = i2;
                while (true) {
                    Calendar a2 = kb61Var.a(i10);
                    boolean z = (((!kdb1.i(a2, calendar7) || kdb1.j(a2, calendar7)) ? 0 : i2) != 0 || kdb1.h(a2, e)) ? i2 : 0;
                    if (z != 0) {
                        dayState = DayState.DEFAULT;
                        calendar5 = calendar7;
                    } else {
                        int i11 = (calendar2 == null || kdb1.j(calendar2, a2) != i2) ? 0 : i2;
                        int i12 = (calendar3 == null || kdb1.j(calendar3, a2) != i2) ? 0 : i2;
                        if (calendar2 == null || calendar3 == null) {
                            calendar5 = calendar7;
                        } else {
                            calendar5 = calendar7;
                            if (kdb1.j(calendar3, calendar2) == i2 && i11 != 0) {
                                dayState = DayState.SINGLE_SELECTION;
                            }
                        }
                        dayState = (i11 == 0 || calendar3 != null) ? (i12 == 0 || calendar2 != null) ? (i11 == 0 || calendar3 == null) ? i12 != 0 ? DayState.RANGE_END : (calendar2 == null || calendar3 == null || !kdb1.h(a2, calendar2) || !kdb1.i(a2, calendar3)) ? kdb1.j(a2, e) ? DayState.TODAY : DayState.DEFAULT : DayState.IN_RANGE : DayState.RANGE_START : DayState.SINGLE_SELECTION : DayState.SINGLE_SELECTION;
                    }
                    DayState dayState2 = dayState;
                    int i13 = i7 % 7;
                    int i14 = i13 == 0 ? i2 : 0;
                    calendar4 = e;
                    calendar6 = calendar8;
                    i = 5;
                    c6wVar = it;
                    arrayList2.add(new hf7(new ze7(a2, dayState2, new lsg(i14, i13 == 6, a2.get(5) == 1, a2.get(5) == a2.getActualMaximum(5)), z, null, null)));
                    i7++;
                    if (i10 == i9) {
                        break;
                    }
                    i10++;
                    e = calendar4;
                    calendar7 = calendar5;
                    calendar8 = calendar6;
                    it = c6wVar;
                    i2 = 1;
                }
            } else {
                calendar4 = e;
                calendar5 = calendar7;
                calendar6 = calendar8;
                i = i5;
                c6wVar = it;
            }
            List J0 = a.J0(arrayList2);
            List list = J0;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof hf7) {
                    arrayList4.add(obj3);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (!((hf7) obj).a.d) {
                    break;
                }
            }
            hf7 hf7Var = (hf7) obj;
            Calendar calendar10 = hf7Var != null ? hf7Var.a.a : null;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof hf7) {
                    arrayList5.add(obj4);
                }
            }
            ListIterator listIterator = arrayList5.listIterator(arrayList5.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (!((hf7) obj2).a.d) {
                    break;
                }
            }
            hf7 hf7Var2 = (hf7) obj2;
            Calendar calendar11 = hf7Var2 != null ? hf7Var2.a.a : null;
            arrayList.add(new pf7(kb61Var, ((kdb1.k(calendar10, calendar2) && kdb1.k(calendar11, calendar3)) || ((calendar10 != null && calendar2 != null) && (calendar11 != null && calendar3 != null) && ((kdb1.h(calendar10, calendar2) && kdb1.i(calendar11, calendar3)) || ((kdb1.j(calendar10, calendar2) && kdb1.i(calendar11, calendar3)) || (kdb1.k(calendar11, calendar3) && kdb1.i(calendar2, calendar10)))))) ? MonthHeaderState.SELECTED : MonthHeaderState.DEFAULT, J0, calendar10, calendar11));
            i5 = i;
            e = calendar4;
            calendar7 = calendar5;
            calendar8 = calendar6;
            it = c6wVar;
            i2 = 1;
            i3 = 2;
        }
        return arrayList;
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pf7 pf7Var = (pf7) it.next();
            ListBuilder a = rcc.a();
            a.add(new jf7(new pf7(pf7Var.a, pf7Var.b, EmptyList.a, pf7Var.d, pf7Var.e)));
            a.addAll(pf7Var.c);
            ycc.r(a.j(), arrayList2);
        }
        return arrayList2;
    }

    public static final float e(float f, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(293544835);
        float I = ((fwi) btsVar.m(j.h)).I(f);
        btsVar.t(false);
        return I;
    }
}
