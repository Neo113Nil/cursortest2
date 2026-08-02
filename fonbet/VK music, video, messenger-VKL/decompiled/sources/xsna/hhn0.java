package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import xsna.gzw;
import xsna.wo6;

/* compiled from: SuperappMiniAppsFragment.kt */
/* loaded from: classes6.dex */
public final class hhn0 extends wo6 {
    public t53 n;
    public BaseVkSearchView o;
    public final yh3 p = new yh3(11);

    /* compiled from: SuperappMiniAppsFragment.kt */
    public static final class a extends wo6.a {
        public final vo50 b = new vo50(17);
    }

    @Override // xsna.wo6, xsna.fhn0
    public final void B5() {
        t53 t53Var = this.n;
        if (t53Var == null) {
            t53Var = null;
        }
        t53Var.clear();
        RecyclerPaginatedView recyclerPaginatedView = this.k;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        t53 t53Var2 = this.l;
        if (t53Var2 == null) {
            t53Var2 = null;
        }
        recyclerPaginatedView.setAdapter(t53Var2);
        RecyclerPaginatedView recyclerPaginatedView2 = this.k;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        gpu0 gpu0Var = this.i;
        recyclerView.addItemDecoration(gpu0Var != null ? gpu0Var : null);
    }

    @Override // xsna.wo6, xsna.fhn0
    public final void Bk() {
        RecyclerPaginatedView recyclerPaginatedView = this.k;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        t53 t53Var = this.n;
        if (t53Var == null) {
            t53Var = null;
        }
        recyclerPaginatedView.setAdapter(t53Var);
        RecyclerPaginatedView recyclerPaginatedView2 = this.k;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        gpu0 gpu0Var = this.i;
        recyclerView.removeItemDecoration(gpu0Var != null ? gpu0Var : null);
    }

    @Override // xsna.wo6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ehn0 ehn0Var = this.j;
        if (ehn0Var == null) {
            ehn0Var = null;
        }
        this.n = new t53(true, ehn0Var);
    }

    @Override // xsna.wo6
    @SuppressLint({"CheckResult"})
    public final BaseVkSearchView tn() {
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        BaseVkSearchView baseVkSearchView = new BaseVkSearchView(context, null, 6, 0);
        baseVkSearchView.setHint(R.string.vk_search_vk_mini_apps);
        baseVkSearchView.setOnBackClickListener(new ghn0(this, 0));
        Context context2 = baseVkSearchView.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context2)) {
            baseVkSearchView.X4(false);
        }
        krv0.n(R.attr.vk_ui_header_background, baseVkSearchView);
        new gzw.a(new qno0(baseVkSearchView.getEditView())).z(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).U(new he40(new uuz(27), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cl30(new arb0(this, 25), 14));
        this.o = baseVkSearchView;
        return baseVkSearchView;
    }

    @Override // xsna.wo6
    public final yh3 un() {
        return this.p;
    }

    @Override // xsna.wo6
    public final void vn() {
        BaseVkSearchView baseVkSearchView = this.o;
        if (baseVkSearchView != null) {
            if (baseVkSearchView == null) {
                baseVkSearchView = null;
            }
            baseVkSearchView.d0();
        }
    }
}
