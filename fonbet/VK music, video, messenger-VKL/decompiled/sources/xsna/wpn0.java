package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.kn1;

/* compiled from: SystemBlockViewHolder.kt */
/* loaded from: classes4.dex */
public final class wpn0 extends nn1 {
    public final opn0 n;
    public final TextView o;

    /* compiled from: SystemBlockViewHolder.kt */
    public static final class a extends RecyclerView.t {
        public final bpn0 b;
        public final bpn0 c;
        public final bpn0 d = new bpn0(new vpn0(this, 0));

        public a(Activity activity) {
            this.b = new bpn0(new wt30(activity, 26));
            this.c = new bpn0(new ajd0(activity, 12));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b.getValue();
                AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) this.c.getValue();
                CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d.getValue();
                if (coordinatorLayout == null || albumsRecyclerPaginatedView == null || customSwipeRefreshLayout == null) {
                    return;
                }
                coordinatorLayout.onStartNestedScroll(albumsRecyclerPaginatedView, customSwipeRefreshLayout, 2);
            }
        }
    }

    public wpn0(View view, ze1 ze1Var, kdg0 kdg0Var, el1 el1Var) {
        super(view);
        opn0 opn0Var = new opn0(ze1Var, kdg0Var, el1Var);
        this.n = opn0Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_system_albums);
        TextView textView = (TextView) view.findViewById(R.id.tv_user_albums);
        this.o = textView;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(opn0Var);
        dhk0 dhk0Var = new dhk0(cn70.b(0), 0, cn70.b(8), cn70.b(0));
        dhk0Var.i = false;
        recyclerView.addItemDecoration(dhk0Var);
        Context context = recyclerView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            recyclerView.addOnScrollListener(new a(activity));
        }
        Context context2 = this.itemView.getContext();
        HashSet hashSet = iah0.a;
        int b = cn70.b(fnj.d(context2) ? 0 : 16);
        f4m.l(b, b, recyclerView);
        f4m.x(b, textView);
    }

    @Override // xsna.vif0
    public final void i6(kn1 kn1Var) {
        kn1.c cVar = (kn1.c) kn1Var;
        this.n.submitList(cVar.a);
        this.o.setText(cVar.b.a(this.itemView.getContext()));
    }
}
