package xsna;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: AbstractContactsGroupHeaderItemDecoration.kt */
/* loaded from: classes2.dex */
public abstract class vd extends kku implements vaj {
    public vej h;
    public List<? extends hfz> i;
    public SortOrder j;
    public String k;

    @Override // xsna.vaj
    public final void e(vej vejVar) {
        this.h = vejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b0  */
    @Override // xsna.vaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(List<? extends hfz> list, SortOrder sortOrder) {
        char charValue;
        char charValue2;
        Character y0;
        SparseArray<CharSequence> sparseArray;
        this.i = list;
        this.j = sortOrder;
        bbj bbjVar = (bbj) this;
        if (bbjVar.i.isEmpty()) {
            sparseArray = zik0.a;
        } else {
            SparseArray<CharSequence> sparseArray2 = new SparseArray<>();
            Iterator<? extends hfz> it = bbjVar.i.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (bbjVar.m(it.next(), 1)) {
                    break;
                } else {
                    i++;
                }
            }
            Iterator<? extends hfz> it2 = bbjVar.i.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (bbjVar.m(it2.next(), 0)) {
                    break;
                } else {
                    i2++;
                }
            }
            Iterator<? extends hfz> it3 = bbjVar.i.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i3 = -1;
                    break;
                } else if (bbjVar.m(it3.next(), 2)) {
                    break;
                } else {
                    i3++;
                }
            }
            Iterator<? extends hfz> it4 = bbjVar.i.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i4 = -1;
                    break;
                } else if (bbjVar.m(it4.next(), 3)) {
                    break;
                } else {
                    i4++;
                }
            }
            Iterator<? extends hfz> it5 = bbjVar.i.iterator();
            int i5 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i5 = -1;
                    break;
                } else if (bbjVar.m(it5.next(), 5)) {
                    break;
                } else {
                    i5++;
                }
            }
            Iterator<? extends hfz> it6 = bbjVar.i.iterator();
            int i6 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i6 = -1;
                    break;
                } else if (bbjVar.m(it6.next(), 4)) {
                    break;
                } else {
                    i6++;
                }
            }
            Iterator<? extends hfz> it7 = bbjVar.i.iterator();
            int i7 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i7 = -1;
                    break;
                } else if (bbjVar.m(it7.next(), 6)) {
                    break;
                } else {
                    i7++;
                }
            }
            Iterator<? extends hfz> it8 = bbjVar.i.iterator();
            int i8 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i8 = -1;
                    break;
                } else if (bbjVar.m(it8.next(), 8)) {
                    break;
                } else {
                    i8++;
                }
            }
            Iterator<? extends hfz> it9 = bbjVar.i.iterator();
            int i9 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i9 = -1;
                    break;
                } else if (bbjVar.m(it9.next(), 10)) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i3 >= 0) {
                sparseArray2.put(i3, bbjVar.h.a(2, new String[0]));
            }
            if (i7 >= 0) {
                sparseArray2.put(i7, bbjVar.h.a(6, new String[0]));
            }
            if (i6 >= 0) {
                sparseArray2.put(i6, bbjVar.h.a(4, new String[0]));
            }
            if (i >= 0) {
                sparseArray2.put(i, bbjVar.h.a(1, new String[0]));
            }
            if (i8 >= 0) {
                String str = bbjVar.k;
                sparseArray2.put(i8, str != null ? bbjVar.h.a(8, str) : bbjVar.b.getString(R.string.members));
            }
            if (i9 >= 0) {
                sparseArray2.put(i9, bbjVar.h.a(10, new String[0]));
            }
            int size = bbjVar.i.size();
            for (int i10 = 0; i10 < size; i10++) {
                hfz hfzVar = bbjVar.i.get(i10);
                if (hfzVar instanceof eux0) {
                    sparseArray2.put(i10, ((eux0) hfzVar).a());
                }
            }
            SortOrder sortOrder2 = bbjVar.j;
            if (sortOrder2 == SortOrder.BY_NAME || sortOrder2 == SortOrder.BY_CONTACT_NAME) {
                int min = (i2 < 0 || i4 < 0) ? i2 >= 0 ? i2 : i4 >= 0 ? i4 : -1 : Math.min(i2, i4);
                if (min >= 0) {
                    hfz hfzVar2 = bbjVar.i.get(min);
                    b8j b8jVar = hfzVar2 instanceof b8j ? (b8j) hfzVar2 : null;
                    if (b8jVar != null && (y0 = erm0.y0(b8jVar.getName())) != null && y0.charValue() != ' ') {
                        sparseArray2.put(min, String.valueOf(Character.toUpperCase(y0.charValue())));
                    }
                    int size2 = bbjVar.i.size() - 1;
                    while (min < size2) {
                        hfz hfzVar3 = bbjVar.i.get(min);
                        b8j b8jVar2 = hfzVar3 instanceof b8j ? (b8j) hfzVar3 : null;
                        if (b8jVar2 != null) {
                            int i11 = min + 1;
                            hfz hfzVar4 = bbjVar.i.get(i11);
                            b8j b8jVar3 = hfzVar4 instanceof b8j ? (b8j) hfzVar4 : null;
                            if (b8jVar3 != null) {
                                if (b8jVar3.getType() != 0 && b8jVar3.getType() != 3) {
                                    if (b8jVar3.getType() != 6) {
                                        min++;
                                    }
                                    Character y02 = erm0.y0(b8jVar2.getName());
                                    charValue = y02 == null ? y02.charValue() : ' ';
                                    Character y03 = erm0.y0(b8jVar3.getName());
                                    charValue2 = y03 == null ? y03.charValue() : ' ';
                                    if (!ro.g(charValue, charValue2, true) && charValue2 != ' ') {
                                        sparseArray2.put(i11, String.valueOf(Character.toUpperCase(charValue2)));
                                    }
                                    min++;
                                }
                                Character y022 = erm0.y0(b8jVar2.getName());
                                if (y022 == null) {
                                }
                                Character y032 = erm0.y0(b8jVar3.getName());
                                if (y032 == null) {
                                }
                                if (!ro.g(charValue, charValue2, true)) {
                                    sparseArray2.put(i11, String.valueOf(Character.toUpperCase(charValue2)));
                                }
                                min++;
                            }
                        }
                        min++;
                    }
                }
            } else {
                if (i2 > 0) {
                    sparseArray2.put(i2, bbjVar.h.a(i9 > 0 ? 9 : 0, new String[0]));
                }
                if (i4 > 0) {
                    sparseArray2.put(i4, bbjVar.h.a(3, new String[0]));
                }
                if (i5 > 0) {
                    sparseArray2.put(i5, bbjVar.h.a(5, new String[0]));
                }
            }
            sparseArray = sparseArray2;
        }
        this.e = sparseArray;
    }

    public final boolean m(hfz hfzVar, int i) {
        etx0 etx0Var = hfzVar instanceof etx0 ? (etx0) hfzVar : null;
        return etx0Var != null && etx0Var.getType() == i;
    }

    @Override // xsna.vaj
    public final RecyclerView.n a() {
        return this;
    }
}
