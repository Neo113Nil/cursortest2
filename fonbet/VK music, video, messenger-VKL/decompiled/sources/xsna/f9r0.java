package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.catalog.api.v2.adapter.BlockType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.x7a;

/* compiled from: VKAppsCatalogSkeletonAdapter.kt */
/* loaded from: classes6.dex */
public final class f9r0 extends c8r0<qtz> {
    public static final List<x7a.c> d = e43.l(new x7a.c(true, 3, true, false), new x7a.c(true, 1, false, false), new x7a.c(true, 3, false, false));
    public List<x7a.c> c;

    /* compiled from: VKAppsCatalogSkeletonAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        if (i >= this.c.size() || i < 0) {
            return 0;
        }
        if (i == 0) {
            return 6;
        }
        int i2 = a.$EnumSwitchMapping$0[this.c.get(i).c.ordinal()];
        if (i2 == 1) {
            return 5;
        }
        if (i2 == 2 || i2 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        qtz qtzVar = (qtz) e0Var;
        qtzVar.V5(this.c.get(i));
        View view = qtzVar.itemView;
        float f = fzp0.a;
        view.setBackground(fzp0.a(view.getContext(), i > 0, i < this.c.size() - 1));
        awt0.x(qtzVar.itemView, 0, iah0.a(4), 0, iah0.a(6), 5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new qtz(viewGroup);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }

    @Override // xsna.c8r0
    public final void x0() {
        List<x7a.c> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x7a.c.c((x7a.c) it.next(), true));
        }
        this.c = arrayList;
        notifyDataSetChanged();
    }

    @Override // xsna.c8r0
    public final void y0() {
        List<x7a.c> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x7a.c.c((x7a.c) it.next(), false));
        }
        this.c = arrayList;
        notifyDataSetChanged();
    }
}
