package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DefaultItemDecorations.kt */
/* loaded from: classes4.dex */
public final class fhl implements z0r {
    public final RecyclerView a;
    public final RecyclerPaginatedView b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public /* synthetic */ fhl(RecyclerView recyclerView, RecyclerPaginatedView recyclerPaginatedView) {
        this(recyclerView, recyclerPaginatedView, R.attr.vk_ui_background);
    }

    public static RecyclerView.Adapter k(RecyclerView recyclerView, int i) {
        if (recyclerView.getAdapter() instanceof ho60) {
            return recyclerView.getAdapter();
        }
        FeedRecyclerView feedRecyclerView = recyclerView instanceof FeedRecyclerView ? (FeedRecyclerView) recyclerView : null;
        RecyclerView.Adapter adapter = feedRecyclerView != null ? feedRecyclerView.getAdapter() : null;
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        a920 a920Var = obj instanceof a920 ? (a920) obj : null;
        if (a920Var == null) {
            return null;
        }
        return a920Var.L0(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final g7o a() {
        return (g7o) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final czm b() {
        return (czm) this.e.getValue();
    }

    @Override // xsna.z0r
    public final b2r c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final RecyclerView.n d() {
        return (RecyclerView.n) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final vxq e() {
        return (vxq) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final l2c0 f() {
        return (l2c0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final j2c0 g() {
        return (j2c0) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final ren h() {
        return (ren) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z0r
    public final oog0 i() {
        return (oog0) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean j() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public fhl(RecyclerView recyclerView, RecyclerPaginatedView recyclerPaginatedView, int i) {
        this.a = recyclerView;
        this.b = recyclerPaginatedView;
        this.c = i;
        jrh jrhVar = new jrh(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, jrhVar);
        this.e = msy.a(lazyThreadSafetyMode, new uw3(13));
        this.f = msy.a(lazyThreadSafetyMode, new dnh(this, 10));
        this.g = msy.a(lazyThreadSafetyMode, new p5h(this, 8));
        this.h = msy.a(lazyThreadSafetyMode, new q5f(this, 11));
        this.i = msy.a(lazyThreadSafetyMode, new enh(this, 5));
        this.j = msy.a(lazyThreadSafetyMode, new t2l(this, 1));
        this.k = msy.a(lazyThreadSafetyMode, new te0(15));
        this.l = msy.a(lazyThreadSafetyMode, new x0(9));
        this.m = msy.a(lazyThreadSafetyMode, new uz(11));
        this.n = msy.a(lazyThreadSafetyMode, new pff(this, 13));
        this.o = msy.a(lazyThreadSafetyMode, new qo0(12));
    }
}
