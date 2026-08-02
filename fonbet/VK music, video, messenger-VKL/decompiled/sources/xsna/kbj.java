package xsna;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: ContactsItemDecoration.kt */
/* loaded from: classes2.dex */
public final class kbj extends wd {
    @Override // xsna.m2i0, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i = gridLayoutManager.s;
        if (i <= 1) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int c = gridLayoutManager.x.c(childAdapterPosition);
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager2 = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
        if (gridLayoutManager2 != null) {
            GridLayoutManager.c cVar = gridLayoutManager2.x;
            int i2 = gridLayoutManager2.s;
            int a = cVar.a(childAdapterPosition, i2);
            int i3 = childAdapterPosition;
            while (true) {
                if (i3 < 0 || cVar.a(i3, i2) != a) {
                    break;
                }
                if (zik0.a(this.h, i3)) {
                    int textSize = (int) this.j.getTextSize();
                    Rect rect2 = this.g;
                    rect.top = textSize + rect2.top + rect2.bottom;
                    break;
                }
                i3--;
            }
        }
        if (c <= 1 || !(this.n.get(childAdapterPosition) instanceof t8j)) {
            return;
        }
        rect.right = (recyclerView.getWidth() / i) * (c - 1);
    }

    @Override // xsna.m2i0
    public final boolean n(RecyclerView recyclerView, int i) {
        if (j5g.b0(i, this.n) instanceof f8g0) {
            return false;
        }
        if (!super.n(recyclerView, i)) {
            Object b0 = j5g.b0(i + 1, this.n);
            cq8 cq8Var = b0 instanceof cq8 ? (cq8) b0 : null;
            if (cq8Var == null || !cq8Var.g) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029c  */
    @Override // xsna.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SparseArray<CharSequence> o() {
        char charValue;
        char charValue2;
        Character y0;
        if (this.n.isEmpty()) {
            return zik0.a;
        }
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        Iterator<? extends hfz> it = this.n.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (p(it.next(), 1)) {
                break;
            }
            i++;
        }
        Iterator<? extends hfz> it2 = this.n.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (p(it2.next(), 0)) {
                break;
            }
            i2++;
        }
        Iterator<? extends hfz> it3 = this.n.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            }
            if (p(it3.next(), 2)) {
                break;
            }
            i3++;
        }
        Iterator<? extends hfz> it4 = this.n.iterator();
        int i4 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i4 = -1;
                break;
            }
            if (p(it4.next(), 3)) {
                break;
            }
            i4++;
        }
        Iterator<? extends hfz> it5 = this.n.iterator();
        int i5 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i5 = -1;
                break;
            }
            if (p(it5.next(), 5)) {
                break;
            }
            i5++;
        }
        Iterator<? extends hfz> it6 = this.n.iterator();
        int i6 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i6 = -1;
                break;
            }
            if (p(it6.next(), 4)) {
                break;
            }
            i6++;
        }
        Iterator<? extends hfz> it7 = this.n.iterator();
        int i7 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i7 = -1;
                break;
            }
            if (p(it7.next(), 6)) {
                break;
            }
            i7++;
        }
        Iterator<? extends hfz> it8 = this.n.iterator();
        int i8 = 0;
        while (true) {
            if (!it8.hasNext()) {
                i8 = -1;
                break;
            }
            if (p(it8.next(), 8)) {
                break;
            }
            i8++;
        }
        Iterator<? extends hfz> it9 = this.n.iterator();
        int i9 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i9 = -1;
                break;
            }
            if (p(it9.next(), 10)) {
                break;
            }
            i9++;
        }
        if (i3 >= 0) {
            sparseArray.put(i3, this.m.a(2, new String[0]));
        }
        if (i7 >= 0) {
            sparseArray.put(i7, this.m.a(6, new String[0]));
        }
        if (i6 >= 0) {
            sparseArray.put(i6, this.m.a(4, new String[0]));
        }
        if (i >= 0) {
            sparseArray.put(i, this.m.a(1, new String[0]));
        }
        if (i8 >= 0) {
            String str = this.p;
            sparseArray.put(i8, str != null ? this.m.a(8, str) : this.b.getString(R.string.members));
        }
        if (i9 >= 0) {
            sparseArray.put(i9, this.m.a(10, new String[0]));
        }
        int size = this.n.size();
        for (int i10 = 0; i10 < size; i10++) {
            hfz hfzVar = this.n.get(i10);
            if (hfzVar instanceof eux0) {
                sparseArray.put(i10, ((eux0) hfzVar).a());
            }
        }
        SortOrder sortOrder = this.o;
        if (sortOrder == SortOrder.BY_NAME || sortOrder == SortOrder.BY_CONTACT_NAME) {
            int min = (i2 < 0 || i4 < 0) ? i2 >= 0 ? i2 : i4 >= 0 ? i4 : -1 : Math.min(i2, i4);
            if (min >= 0) {
                hfz hfzVar2 = this.n.get(min);
                b8j b8jVar = hfzVar2 instanceof b8j ? (b8j) hfzVar2 : null;
                if (b8jVar != null && (y0 = erm0.y0(b8jVar.getName())) != null && y0.charValue() != ' ') {
                    sparseArray.put(min, String.valueOf(Character.toUpperCase(y0.charValue())));
                }
                int size2 = this.n.size() - 1;
                while (min < size2) {
                    hfz hfzVar3 = this.n.get(min);
                    b8j b8jVar2 = hfzVar3 instanceof b8j ? (b8j) hfzVar3 : null;
                    if (b8jVar2 != null) {
                        int i11 = min + 1;
                        hfz hfzVar4 = this.n.get(i11);
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
                                    sparseArray.put(i11, String.valueOf(Character.toUpperCase(charValue2)));
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
                                sparseArray.put(i11, String.valueOf(Character.toUpperCase(charValue2)));
                            }
                            min++;
                        }
                    }
                    min++;
                }
            }
        } else {
            if (i2 > 0) {
                sparseArray.put(i2, this.m.a(i9 > 0 ? 9 : 0, new String[0]));
            }
            if (i4 > 0) {
                sparseArray.put(i4, this.m.a(3, new String[0]));
            }
            if (i5 > 0) {
                sparseArray.put(i5, this.m.a(5, new String[0]));
                return sparseArray;
            }
        }
        return sparseArray;
    }
}
