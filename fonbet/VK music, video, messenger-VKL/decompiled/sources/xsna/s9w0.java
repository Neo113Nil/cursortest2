package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VmojiProductsHolder.kt */
/* loaded from: classes7.dex */
public final class s9w0 extends u6w0<t9w0> {
    public final b8w0 l;
    public final View m;
    public final a n;

    /* compiled from: VmojiProductsHolder.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public s9w0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_paid_elements_item, viewGroup);
        this.l = b8w0Var;
        this.m = this.itemView.findViewById(R.id.show_all);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.paginated_view);
        a aVar = new a();
        aVar.x0(l9w0.class, new vgs0(b8w0Var, 9));
        this.n = aVar;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
        dVar.f = 0;
        dVar.a();
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(aVar);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerView.setClipToPadding(false);
        f4m.l(cn70.b(10), cn70.b(10), recyclerView);
        recyclerPaginatedView.f0();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        t9w0 t9w0Var = (t9w0) hfzVar;
        List<l9w0> list = t9w0Var.c;
        if (list != null) {
            this.n.setItems(list);
        }
        bwt0.i0(this.m, new lfa(29, this, t9w0Var));
    }
}
