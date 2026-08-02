package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e6w0;

/* compiled from: VmojiCharacterView.kt */
/* loaded from: classes7.dex */
public final class e8w0 extends vn50<i8w0, e6w0> {
    public static final int v = cn70.b(112);
    public static final int w = cn70.b(8);
    public static final int x = cn70.b(4);
    public final f5z e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final ViewGroup j;
    public final TextView k;
    public final TextView l;
    public final RecyclerView m;
    public final CustomSwipeRefreshLayout n;
    public final View o;
    public final TextView p;
    public final View q;
    public final ef90 r;
    public final ViewGroup s;
    public final f6w0 t;
    public final a u;

    /* compiled from: VmojiCharacterView.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public e8w0(Context context, VmojiCharacterFragment.c cVar, f5z f5zVar) {
        super(R.layout.vmoji_character_fragment, context, cVar);
        this.e = f5zVar;
        this.f = this.d.findViewById(R.id.toolbar);
        View findViewById = this.d.findViewById(R.id.back);
        this.g = findViewById;
        View findViewById2 = this.d.findViewById(R.id.share);
        this.h = findViewById2;
        View findViewById3 = this.d.findViewById(R.id.more);
        this.i = findViewById3;
        this.j = (ViewGroup) this.d.findViewById(R.id.title_container);
        this.k = (TextView) this.d.findViewById(R.id.title);
        this.l = (TextView) this.d.findViewById(R.id.deactivated_subtitle);
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(R.id.list);
        this.m = recyclerView;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d.findViewById(R.id.vmoji_recycler_swipe_container);
        this.n = customSwipeRefreshLayout;
        this.o = this.d.findViewById(R.id.vmoji_error_state_container);
        this.p = (TextView) this.d.findViewById(R.id.vmoji_error_state_title);
        View findViewById4 = this.d.findViewById(R.id.vmoji_error_state_retry_button);
        this.q = findViewById4;
        this.r = new ef90(new b(cVar));
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.buy_container);
        this.s = viewGroup;
        this.t = new f6w0(viewGroup, new f8w0(cVar));
        b8w0 b8w0Var = new b8w0(cVar);
        a aVar = new a();
        aVar.x0(r6w0.class, new q9i0(b8w0Var, 13));
        aVar.x0(t9w0.class, new pst0(b8w0Var, 3));
        aVar.x0(h6w0.class, new m4k0(13));
        aVar.x0(g7w0.class, new vhs0(b8w0Var, 9));
        aVar.x0(e7w0.class, new mmm0(b8w0Var, 21));
        aVar.x0(dbf0.class, new dnh0(18, b8w0Var, cVar));
        aVar.x0(o6w0.class, new yyl0(b8w0Var, 23));
        aVar.x0(u990.class, new l140(29));
        aVar.x0(n990.class, new lxh0(cVar, 17));
        aVar.x0(t6w0.class, new quz(29));
        aVar.x0(u9w0.class, new d8w0(0));
        aVar.x0(j6w0.class, new cd10(28));
        aVar.x0(i7w0.class, new zzs0(3));
        aVar.x0(p6w0.class, new wss0(6));
        aVar.x0(xfp.class, new l4k0(14));
        this.u = aVar;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        gridLayoutManager.x = new g8w0(this, gridLayoutManager);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.addOnScrollListener(new c8w0(gridLayoutManager, this, dhr0.t.c(R.attr.vk_ui_background_content)));
        recyclerView.addItemDecoration(new a7w0(w, x));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = recyclerView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = recyclerView.getMeasuredHeight();
        f4m.a(recyclerView, new h8w0(recyclerView, ref$IntRef, ref$IntRef2, gridLayoutManager, this));
        bwt0.i0(findViewById, new cbt0(cVar, 9));
        bwt0.i0(findViewById2, new n9t0(cVar, 2));
        bwt0.i0(findViewById4, new rzl0(cVar, 27));
        customSwipeRefreshLayout.setOnRefreshListener(new qu50(cVar, 20));
        f4m.j(findViewById3);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }

    /* compiled from: VmojiCharacterView.kt */
    public static final class b implements df90 {
        public final VmojiCharacterFragment.c b;

        public b(VmojiCharacterFragment.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            if (i - 4 > i3 || i3 > i) {
                return;
            }
            this.b.invoke(e6w0.h.b.b);
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
