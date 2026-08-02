package xsna;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.core.view.components.cell.VkCell;
import java.util.LinkedList;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ItemViewHolder.java */
@Deprecated
/* loaded from: classes3.dex */
public final class lvx<Item> extends UsableRecyclerView.x implements View.OnClickListener, View.OnLongClickListener {
    public final a<Item> l;
    public final SparseArray<c<Item>> m;
    public Item n;
    public final j0u0 o;

    /* compiled from: ItemViewHolder.java */
    public interface a<Item> {
        void a(@NonNull j0u0 j0u0Var, @NonNull Item item, int i);
    }

    /* compiled from: ItemViewHolder.java */
    public static final class b<Item> {
        public int a;
        public la40 b;
        public SparseArray<c<Item>> c;
    }

    /* compiled from: ItemViewHolder.java */
    public interface c<Item> {
        void a(@NonNull Object obj);
    }

    public lvx(View view, la40 la40Var, SparseArray sparseArray) {
        super(view);
        this.n = null;
        this.l = la40Var;
        this.m = sparseArray;
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                View findViewById = keyAt == -1 ? view : view.findViewById(keyAt);
                if (findViewById != null) {
                    findViewById.setOnClickListener(this);
                }
            }
        }
        la40Var.getClass();
        j0u0 j0u0Var = new j0u0(0);
        VkCell vkCell = (VkCell) view;
        if (((LinkedList) j0u0Var.b) == null) {
            LinkedList linkedList = new LinkedList();
            j0u0Var.b = linkedList;
            j0u0Var.c = linkedList.iterator();
        }
        ((LinkedList) j0u0Var.b).add(vkCell);
        this.o = j0u0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SparseArray<c<Item>> sparseArray = this.m;
        if (sparseArray == null || this.n == null) {
            return;
        }
        sparseArray.get(view.getId()).a(this.n);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }
}
