package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DiffUtilDelegationAdapter.kt */
/* loaded from: classes17.dex */
public class sxm extends qul {
    public List<? extends hfz> h;

    /* compiled from: DiffUtilDelegationAdapter.kt */
    public static final class a extends m.b {
        public final List<hfz> b;
        public final List<hfz> c;
        public final Object d = new Object();

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends hfz> list, List<? extends hfz> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return epx.f(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            hfz hfzVar = this.b.get(i);
            hfz hfzVar2 = this.c.get(i2);
            return hfzVar.getClass().equals(hfzVar2.getClass()) && epx.f(hfzVar.getItemId(), hfzVar2.getItemId());
        }

        @Override // androidx.recyclerview.widget.m.b
        public final Object getChangePayload(int i, int i2) {
            return this.d;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    public sxm() {
        super(false);
        this.h = EmptyList.b;
    }

    @Override // xsna.qul
    public List<hfz> getItems() {
        return this.h;
    }

    @Override // xsna.qul
    public void setItems(List<? extends hfz> list) {
        List<? extends hfz> list2 = this.h;
        this.h = list;
        androidx.recyclerview.widget.m.a(new a(list2, list), true).b(this);
    }
}
