package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ad20;
import xsna.bd20;
import xsna.hd20;
import xsna.lc20;

/* compiled from: MessageViewsViewController.kt */
/* loaded from: classes2.dex */
public final class cd20 extends fi6<hd20, bd20> implements ad20.b {
    public ShimmerFrameLayout f;
    public ViewGroup g;
    public ViewGroup h;
    public TextView i;
    public RecyclerView j;
    public LinearLayoutManager k;
    public lc20 l;

    /* compiled from: MessageViewsViewController.kt */
    public final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            cd20 cd20Var = cd20.this;
            lc20 lc20Var = cd20Var.l;
            if (lc20Var == null) {
                lc20Var = null;
            }
            if (lc20Var.h.f.isEmpty()) {
                return;
            }
            LinearLayoutManager linearLayoutManager = cd20Var.k;
            if (linearLayoutManager == null) {
                linearLayoutManager = null;
            }
            int v = linearLayoutManager.v();
            LinearLayoutManager linearLayoutManager2 = cd20Var.k;
            int x = (linearLayoutManager2 != null ? linearLayoutManager2 : null).x();
            if (v == -1 || x == -1) {
                return;
            }
            cd20Var.O(new bd20.b(x));
        }
    }

    @Override // xsna.ad20.b
    public final void A(qtd0 qtd0Var) {
        O(new bd20.c(qtd0Var));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.f = (ShimmerFrameLayout) view.findViewById(R.id.shimmer);
        this.g = (ViewGroup) view.findViewById(R.id.im_main_container);
        this.h = (ViewGroup) view.findViewById(R.id.im_users_list_error_container);
        this.i = (TextView) view.findViewById(R.id.im_views_total_count);
        ImageView imageView = (ImageView) view.findViewById(R.id.im_close_btn);
        jjc.g(imageView, new lwh(this, 27));
        imageView.setImageDrawable(krv0.f(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed, imageView.getContext()));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.im_users_list);
        this.j = recyclerView;
        lc20 lc20Var = new lc20(new kc20(2, lc20.j, lc20.a.class, "areItemsTheSame", "areItemsTheSame(Lcom/vk/core/ui/adapter_delegate/ListItem;Lcom/vk/core/ui/adapter_delegate/ListItem;)Z", 0));
        lc20Var.y0(new ad20(this));
        this.l = lc20Var;
        recyclerView.getContext();
        this.k = new LinearLayoutManager();
        lc20 lc20Var2 = this.l;
        if (lc20Var2 == null) {
            lc20Var2 = null;
        }
        recyclerView.setAdapter(lc20Var2);
        LinearLayoutManager linearLayoutManager = this.k;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(new a());
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.n0 n0Var = itemAnimator instanceof androidx.recyclerview.widget.n0 ? (androidx.recyclerview.widget.n0) itemAnimator : null;
        if (n0Var != null) {
            n0Var.g = false;
        }
        jjc.g(view.findViewById(R.id.im_retry_button), new bq00(this, 6));
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        hd20 hd20Var = (hd20) ao50Var;
        if (hd20Var instanceof hd20.b) {
            ShimmerFrameLayout shimmerFrameLayout = this.f;
            if (shimmerFrameLayout == null) {
                shimmerFrameLayout = null;
            }
            shimmerFrameLayout.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout2 = this.f;
            if (shimmerFrameLayout2 == null) {
                shimmerFrameLayout2 = null;
            }
            shimmerFrameLayout2.d();
            ViewGroup viewGroup = this.g;
            if (viewGroup == null) {
                viewGroup = null;
            }
            viewGroup.setVisibility(8);
            ViewGroup viewGroup2 = this.h;
            (viewGroup2 != null ? viewGroup2 : null).setVisibility(8);
            return;
        }
        if (!(hd20Var instanceof hd20.c)) {
            if (!(hd20Var instanceof hd20.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ShimmerFrameLayout shimmerFrameLayout3 = this.f;
            if (shimmerFrameLayout3 == null) {
                shimmerFrameLayout3 = null;
            }
            shimmerFrameLayout3.setVisibility(4);
            ViewGroup viewGroup3 = this.g;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            viewGroup3.setVisibility(0);
            RecyclerView recyclerView = this.j;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
            ViewGroup viewGroup4 = this.h;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setVisibility(0);
            TextView textView = this.i;
            (textView == null ? null : textView).setText((textView != null ? textView : null).getResources().getString(R.string.im_message_views));
            return;
        }
        hd20.c cVar = (hd20.c) hd20Var;
        int i = cVar.a;
        List<qtd0> list = cVar.b;
        ShimmerFrameLayout shimmerFrameLayout4 = this.f;
        if (shimmerFrameLayout4 == null) {
            shimmerFrameLayout4 = null;
        }
        shimmerFrameLayout4.setVisibility(4);
        ViewGroup viewGroup5 = this.g;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        viewGroup5.setVisibility(0);
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(i == 0 ? textView2.getResources().getString(R.string.im_message_views_no_views) : textView2.getResources().getQuantityString(R.plurals.im_message_views_count, i, Integer.valueOf(i)));
        lc20 lc20Var = this.l;
        qul qulVar = lc20Var != null ? lc20Var : null;
        List<qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new yc20((qtd0) it.next()));
        }
        qulVar.setItems(arrayList);
    }
}
