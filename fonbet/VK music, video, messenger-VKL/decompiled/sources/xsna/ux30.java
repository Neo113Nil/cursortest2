package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.im.engine.models.SearchMode;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: MsgSearchPagerAdapter.kt */
/* loaded from: classes2.dex */
public abstract class ux30 extends PagerAdapter {
    public final List<rwh0> b;
    public final mkr0 c;
    public final LayoutInflater d;
    public final LinkedHashMap e = new LinkedHashMap();

    /* compiled from: MsgSearchPagerAdapter.kt */
    public static final class a extends RecyclerView.t {
        public boolean b;

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.b || i != 0) {
                return;
            }
            this.b = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (!this.b || i2 <= 0) {
                return;
            }
            mhy.b(recyclerView.getContext());
            this.b = false;
        }
    }

    /* compiled from: MsgSearchPagerAdapter.kt */
    public static final class b extends vc80 {
        public final SearchMode f;
        public final mkr0 g;
        public final gzs<Boolean> h;

        public b(SearchMode searchMode, mkr0 mkr0Var, gzs<Boolean> gzsVar) {
            this.f = searchMode;
            this.g = mkr0Var;
            this.h = gzsVar;
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            SearchMode searchMode = SearchMode.CHANNELS;
            SearchMode searchMode2 = this.f;
            int i4 = searchMode2 == searchMode ? 10 : 5;
            if (!this.h.invoke().booleanValue() || i3 - i2 >= i4) {
                return;
            }
            this.g.C(this, searchMode2, i3);
        }
    }

    public ux30(List<rwh0> list, mkr0 mkr0Var, LayoutInflater layoutInflater) {
        this.b = list;
        this.c = mkr0Var;
        this.d = layoutInflater;
    }

    public final b0i0 b(int i) {
        return (b0i0) this.e.get(Integer.valueOf(i));
    }

    public abstract void c(hy30 hy30Var);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeViewAt(i);
        this.e.remove(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.b.get(i).a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.d.inflate(R.layout.vkim_msg_search_listview, viewGroup, false);
        b0i0 b0i0Var = new b0i0(inflate, new tx30(this, i, 0));
        rwh0 rwh0Var = this.b.get(i);
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = b0i0Var.d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(rwh0Var.f);
        recyclerView.addOnScrollListener(new b(rwh0Var.c, this.c, rwh0Var.b));
        a aVar = new a();
        aVar.b = true;
        recyclerView.addOnScrollListener(aVar);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new ujq(iah0.a(8), iah0.a(12), 5));
        this.e.put(Integer.valueOf(i), b0i0Var);
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
