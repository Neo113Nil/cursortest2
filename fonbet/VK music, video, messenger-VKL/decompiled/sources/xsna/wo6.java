package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.superapp.catalog.api.v2.SuperappCatalogCallbackProvider;
import com.vkontakte.android.R;

/* compiled from: BaseSuperappMiniAppsFragment.kt */
/* loaded from: classes6.dex */
public abstract class wo6 extends uhv0 implements fhn0 {
    public final int h = R.layout.vk_mini_apps_fragment;
    public gpu0 i;
    public ehn0 j;
    public RecyclerPaginatedView k;
    public t53 l;
    public Context m;

    /* compiled from: BaseSuperappMiniAppsFragment.kt */
    public static abstract class a {
        public final Bundle a = new Bundle();
    }

    public final void g0() {
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        Toast.makeText(context, R.string.vk_apps_common_network_error, 1).show();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        Context context = this.m;
        if (context == null) {
            return null;
        }
        return context;
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.m = hnj.a(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        lgn0 lgn0Var;
        super.onCreate(bundle);
        yh3 un = un();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("sectionId") : null;
        Bundle arguments2 = getArguments();
        SuperappCatalogCallbackProvider superappCatalogCallbackProvider = (SuperappCatalogCallbackProvider) (arguments2 != null ? arguments2.getSerializable("callback_provider") : null);
        if (superappCatalogCallbackProvider != null) {
            requireContext();
            lgn0Var = superappCatalogCallbackProvider.provide();
        } else {
            lgn0Var = null;
        }
        un.getClass();
        this.j = new ihn0(string, lgn0Var);
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("sectionId") : null;
        boolean z = !(string2 == null || drm0.N(string2));
        ehn0 ehn0Var = this.j;
        this.l = new t53(z, ehn0Var != null ? ehn0Var : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        return LayoutInflater.from(context).inflate(this.h, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ehn0 ehn0Var = this.j;
        if (ehn0Var == null) {
            ehn0Var = null;
        }
        ehn0Var.c();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        gpu0 gpu0Var = new gpu0(view.getContext());
        t53 t53Var = this.l;
        if (t53Var == null) {
            t53Var = null;
        }
        gpu0Var.j = t53Var;
        this.i = gpu0Var;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.miniapps_list);
        t53 t53Var2 = this.l;
        if (t53Var2 == null) {
            t53Var2 = null;
        }
        recyclerPaginatedView.setAdapter(t53Var2);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        gpu0 gpu0Var2 = this.i;
        if (gpu0Var2 == null) {
            gpu0Var2 = null;
        }
        recyclerView.addItemDecoration(gpu0Var2);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(new xo6(this));
        this.k = recyclerPaginatedView;
        ehn0 ehn0Var = this.j;
        if (ehn0Var == null) {
            ehn0Var = null;
        }
        ehn0Var.a(this);
        ehn0 ehn0Var2 = this.j;
        (ehn0Var2 != null ? ehn0Var2 : null).g();
        BaseVkSearchView tn = tn();
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) view).findViewById(R.id.app_bar_layout);
        krv0.n(R.attr.vk_ui_header_background, viewGroup);
        viewGroup.addView(tn, new AppBarLayout.d(iah0.a(56)));
    }

    public abstract BaseVkSearchView tn();

    public abstract yh3 un();

    public void B5() {
    }

    public void Bk() {
    }

    public void vn() {
    }
}
