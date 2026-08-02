package xsna;

import androidx.recyclerview.widget.m;
import java.util.Iterator;
import java.util.List;

/* compiled from: SimilarVideosHorizontalAdapter.kt */
/* loaded from: classes7.dex */
public final class qoj0 extends wx3 implements vic {

    /* compiled from: SimilarVideosHorizontalAdapter.kt */
    public static final class a extends m.e<hfz> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return hfzVar.equals(hfzVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
        }
    }

    public qoj0(List<? extends p1u0<?>> list) {
        super(new a());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            y0((p1u0) it.next());
        }
    }

    @Override // xsna.wx3, xsna.qul
    public final List<hfz> getItems() {
        return this.h.f;
    }

    @Override // xsna.wx3, xsna.qul
    public final void setItems(List<? extends hfz> list) {
        if (list.isEmpty()) {
            this.h.b(null, null);
        } else {
            super.setItems(list);
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
