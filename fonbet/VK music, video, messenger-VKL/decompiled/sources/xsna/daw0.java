package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.vmoji.character.product.VmojiProductsFragment;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: VmojiProductsView.kt */
/* loaded from: classes7.dex */
public final class daw0 extends vn50<gaw0, o9w0> {
    public static final int l = cn70.b(112);
    public static final int m = cn70.b(8);
    public static final int n = cn70.b(4);
    public final f5z e;
    public final View f;
    public final RecyclerView g;
    public final CustomSwipeRefreshLayout h;
    public final ViewGroup i;
    public final f6w0 j;
    public final a k;

    /* compiled from: VmojiProductsView.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public daw0(Context context, VmojiProductsFragment.b bVar, f5z f5zVar) {
        super(R.layout.vmoji_character_paid_elements_fragment, context, bVar);
        this.e = f5zVar;
        View findViewById = this.d.findViewById(R.id.back);
        this.f = findViewById;
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(R.id.list);
        this.g = recyclerView;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d.findViewById(R.id.vmoji_products_recycler_swipe_container);
        this.h = customSwipeRefreshLayout;
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.buy_container);
        this.i = viewGroup;
        this.j = new f6w0(viewGroup, new eaw0(bVar));
        bwt0.i0(findViewById, new mdm0(bVar, 25));
        caw0 caw0Var = new caw0(bVar);
        a aVar = new a();
        aVar.x0(l9w0.class, new lxh0(caw0Var, 18));
        this.k = aVar;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new a7w0(m, n));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = recyclerView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = recyclerView.getMeasuredHeight();
        f4m.a(recyclerView, new faw0(recyclerView, ref$IntRef, ref$IntRef2, gridLayoutManager, this));
        customSwipeRefreshLayout.setOnRefreshListener(new u9c0(bVar, 9));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }
}
