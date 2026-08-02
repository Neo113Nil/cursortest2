package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.qgh0;
import xsna.szr;
import xsna.uzr;

/* compiled from: FolderPeersSelectViewController.kt */
/* loaded from: classes18.dex */
public final class tzr extends fi6<vzr, szr> {
    public Toolbar f;
    public VkButton g;
    public RecyclerView h;
    public mzr i;
    public final io.reactivex.rxjava3.disposables.b j;

    /* compiled from: FolderPeersSelectViewController.kt */
    public static final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            tzr.this.R();
        }
    }

    public tzr() {
        super(R.layout.vkim_folder_peers_select_fragment, null);
        this.j = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f = (Toolbar) view.findViewById(R.id.toolbar);
        this.g = (VkButton) view.findViewById(R.id.vkim_confirm_btn);
        this.h = (RecyclerView) view.findViewById(R.id.vkim_recycler_view);
        this.i = new mzr(new a());
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        ((androidx.recyclerview.widget.n0) recyclerView2.getItemAnimator()).g = false;
        mzr mzrVar = this.i;
        if (mzrVar == null) {
            mzrVar = null;
        }
        mzrVar.setHasStableIds(true);
        mzr mzrVar2 = this.i;
        if (mzrVar2 == null) {
            mzrVar2 = null;
        }
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        qj0.a(mzrVar2, recyclerView3, new qgh0.a());
        RecyclerView recyclerView4 = this.h;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        mzr mzrVar3 = this.i;
        if (mzrVar3 == null) {
            mzrVar3 = null;
        }
        recyclerView4.setAdapter(mzrVar3);
        RecyclerView recyclerView5 = this.h;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.addOnScrollListener(new b());
        Toolbar toolbar = this.f;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setTitle(viewGroup.getContext().getString(R.string.vkim_folder_peers_select_title));
        Toolbar toolbar2 = this.f;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        int a2 = iah0.a(16);
        if (toolbar2.u == null) {
            toolbar2.u = new ypg0();
        }
        toolbar2.u.g(a2, 0);
        Toolbar toolbar3 = this.f;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setNavigationIcon(e3m.e(R.attr.im_ic_back_toolbar, viewGroup.getContext()));
        Toolbar toolbar4 = this.f;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        toolbar4.setNavigationOnClickListener(new q01(this, 5));
        VkButton vkButton = this.g;
        bwt0.i0(vkButton != null ? vkButton : null, new ifg(this, 18));
        this.j.b(d02.y(new o3p0(view).b, 200L, 2).a0(asu0.a.d()).subscribe(new xz(new lwh(this, 9), 22)));
    }

    public final void R() {
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int x = ((LinearLayoutManager) recyclerView.getLayoutManager()).x();
        if (x == -1) {
            O(new szr.e(0));
        } else {
            O(new szr.e(x));
        }
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        if (!(((uzr) yn50Var) instanceof uzr.a)) {
            throw new NoWhenBranchMatchedException();
        }
        R();
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        vzr vzrVar = (vzr) ao50Var;
        VkButton vkButton = this.g;
        if (vkButton == null) {
            vkButton = null;
        }
        vzrVar.getClass();
        vkButton.setEnabled(true);
        if (vzrVar.f) {
            mzr mzrVar = this.i;
            (mzrVar != null ? mzrVar : null).setItems(vzrVar.d);
            return;
        }
        mzr mzrVar2 = this.i;
        List<hfz> list = (mzrVar2 == null ? null : mzrVar2).h.f;
        List<hfz> list2 = vzrVar.b;
        if (list == list2) {
            return;
        }
        (mzrVar2 != null ? mzrVar2 : null).setItems(list2);
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        super.onDestroyView();
        this.j.e();
    }

    /* compiled from: FolderPeersSelectViewController.kt */
    public static final class a implements xt90 {
        public a() {
        }

        @Override // xsna.xt90
        public final void c(wt90 wt90Var) {
            tzr.this.O(new szr.d(wt90Var));
        }

        @Override // xsna.xt90
        public final void b(wt90 wt90Var) {
        }
    }
}
