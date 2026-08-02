package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.naw0;

/* compiled from: VmojiRecommendationsView.kt */
/* loaded from: classes7.dex */
public final class yaw0 extends vn50<abw0, naw0> {
    public static final int k = cn70.b(112);
    public static final int l = cn70.b(8);
    public static final int m = cn70.b(4);
    public final f5z e;
    public final View f;
    public final RecyclerView g;
    public final CustomSwipeRefreshLayout h;
    public final TextView i;
    public final a j;

    /* compiled from: VmojiRecommendationsView.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public yaw0(Context context, VmojiRecommendationsFragment.b bVar, f5z f5zVar) {
        super(R.layout.vmoji_character_catalog_fragment, context, bVar);
        this.e = f5zVar;
        View findViewById = this.d.findViewById(R.id.back);
        this.f = findViewById;
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(R.id.list);
        this.g = recyclerView;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d.findViewById(R.id.vmoji_recycler_swipe_container);
        this.h = customSwipeRefreshLayout;
        b bVar2 = new b(bVar);
        this.i = (TextView) this.d.findViewById(R.id.title);
        jjc.g(findViewById, new qjl0(bVar, 19));
        xaw0 xaw0Var = new xaw0(bVar);
        jds0 jds0Var = new jds0(bVar, 8);
        a aVar = new a();
        aVar.x0(o6w0.class, new ftu0(xaw0Var, 3));
        aVar.x0(u990.class, new xep0(7));
        aVar.x0(n990.class, new c3k0(jds0Var, 18));
        this.j = aVar;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new a7w0(l, m));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = recyclerView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = recyclerView.getMeasuredHeight();
        f4m.a(recyclerView, new zaw0(recyclerView, ref$IntRef, ref$IntRef2, gridLayoutManager, this));
        recyclerView.addOnScrollListener(new ef90(bVar2));
        customSwipeRefreshLayout.setOnRefreshListener(new u730(bVar, 22));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }

    /* compiled from: VmojiRecommendationsView.kt */
    public static final class b implements df90 {
        public final VmojiRecommendationsFragment.b b;

        public b(VmojiRecommendationsFragment.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            if (i - 6 > i3 || i3 > i) {
                return;
            }
            this.b.invoke(naw0.c.b.b);
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
