package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.vk.superapp.catalog.api.v2.adapter.BlockType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.kyu;

/* compiled from: VKAppsCatalogAdapter.kt */
/* loaded from: classes6.dex */
public final class d8r0 extends b8r0 {
    public final u8r0 c;
    public final ArrayList d = new ArrayList();

    /* compiled from: VKAppsCatalogAdapter.kt */
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

    public d8r0(u8r0 u8r0Var) {
        this.c = u8r0Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((x7a) this.d.get(i)).a;
    }

    @Override // xsna.b8r0
    public final void h0(List<? extends x7a> list) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = size - 1;
        arrayList.addAll(list);
        notifyItemRangeInserted(size, list.size());
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        if (i >= this.d.size() || i < 0) {
            return 0;
        }
        if (i == 0) {
            return 6;
        }
        int i2 = a.$EnumSwitchMapping$0[((x7a) this.d.get(i)).c.ordinal()];
        if (i2 == 1) {
            return 5;
        }
        if (i2 == 2 || i2 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(e9r0<x7a> e9r0Var, int i) {
        int a2;
        int i2;
        int itemViewType;
        e9r0<x7a> e9r0Var2 = e9r0Var;
        ArrayList arrayList = this.d;
        e9r0Var2.V5(arrayList.get(i));
        BlockType blockType = ((x7a) arrayList.get(i)).c;
        BlockType blockType2 = BlockType.TOP;
        boolean z = false;
        boolean z2 = blockType == blockType2;
        boolean z3 = i == arrayList.size() - 1 || ((x7a) arrayList.get(i + 1)).c == blockType2 || blockType == BlockType.BOTTOM;
        int a3 = z2 ? iah0.a(4) : 0;
        int itemViewType2 = e9r0Var2.getItemViewType();
        if (itemViewType2 != 4) {
            if (itemViewType2 == 5) {
                if (z3) {
                    a2 = iah0.a(22);
                }
                i2 = 0;
            } else if (itemViewType2 != 7) {
                if (z3) {
                    a2 = iah0.a(6);
                }
                i2 = 0;
            } else {
                a2 = iah0.a(z3 ? 14 : 8);
            }
            itemViewType = e9r0Var2.getItemViewType();
            if (itemViewType != 6) {
                if (itemViewType != 999) {
                    awt0.x(e9r0Var2.itemView, 0, a3, 0, i2, 5);
                } else {
                    xgx0.a.getClass();
                    xgx0.b("Stub holder must be absent for backgrounds with rounded corners");
                }
            }
            View view = e9r0Var2.itemView;
            float f = fzp0.a;
            Context context = view.getContext();
            if (i > 0 && z2) {
                z = true;
            }
            view.setBackground(fzp0.a(context, z, z3));
        }
        a2 = iah0.a(z3 ? 14 : 8);
        i2 = a2;
        itemViewType = e9r0Var2.getItemViewType();
        if (itemViewType != 6) {
        }
        View view2 = e9r0Var2.itemView;
        float f2 = fzp0.a;
        Context context2 = view2.getContext();
        if (i > 0) {
            z = true;
        }
        view2.setBackground(fzp0.a(context2, z, z3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final e9r0<x7a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        u8r0 u8r0Var = this.c;
        if (i == 0) {
            return new kyu.b(viewGroup, u8r0Var);
        }
        if (i == 1) {
            return new kyu.c(viewGroup, u8r0Var);
        }
        if (i == 3) {
            return new rd90(viewGroup, u8r0Var);
        }
        if (i == 4) {
            return new lla(viewGroup, u8r0Var);
        }
        if (i == 5) {
            return new lcv(viewGroup, u8r0Var);
        }
        if (i == 6) {
            return new w13(viewGroup, u8r0Var);
        }
        if (i == 7) {
            return new zcv(viewGroup, u8r0Var);
        }
        if (i == 10) {
            return new a7s(viewGroup);
        }
        if (i == 999) {
            return new asm0(viewGroup);
        }
        throw new IllegalStateException(("Unknown catalog section type: " + i).toString());
    }

    @Override // xsna.b8r0
    public final void setItems(List<? extends x7a> list) {
        ArrayList arrayList = this.d;
        m.d a2 = androidx.recyclerview.widget.m.a(new m4a(arrayList, list), true);
        arrayList.clear();
        arrayList.addAll(list);
        a2.b(this);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
