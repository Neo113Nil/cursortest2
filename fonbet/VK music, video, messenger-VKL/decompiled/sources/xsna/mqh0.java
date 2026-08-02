package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.integration.api.SearchDelegate;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SearchDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class mqh0 implements SearchDelegate, w8i, nhl {
    public final FragmentImpl b;
    public final f0i0 c;
    public final Object d;
    public final SearchFeatureCatalogRootVh e;
    public AppBarLayout f;
    public FrameLayout g;
    public final View h;
    public final VkSearchView i;

    /* compiled from: SearchDelegateImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            mqh0 mqh0Var = (mqh0) this.receiver;
            bwt0.p0(mqh0Var.h, mqh0Var.c.f != SearchDelegate.SearchState.COLLAPSED);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public mqh0(iqh0 iqh0Var, mo8 mo8Var, hyh0 hyh0Var) {
        FragmentImpl a2 = iqh0Var.a();
        this.b = a2;
        f0i0 f0i0Var = new f0i0(false, new a(0, this, mqh0.class, "notifyStateChanged", "notifyStateChanged()V", 0));
        this.c = f0i0Var;
        Lazy a3 = msy.a(LazyThreadSafetyMode.NONE, new ume0(2, this, iqh0Var));
        this.d = a3;
        SearchFeatureCatalogRootVh a4 = hyh0.a(iqh0Var, (zqh0) a3.getValue(), null);
        this.e = a4;
        View X = a4.X(a2.getLayoutInflater(), null, null);
        dhr0.a.e0(R.attr.vk_ui_background_content, X);
        this.h = X;
        zqh0 zqh0Var = (zqh0) a3.getValue();
        Context requireContext = a2.requireContext();
        VkSearchView vkSearchView = new VkSearchView(requireContext, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(requireContext, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        emg emgVar = new emg(vkSearchView);
        emgVar.b.setVoiceInputEnabled(true);
        emgVar.e(false);
        zqh0Var.f(new ayh0(emgVar, f0i0Var), a2.getViewLifecycleOwner());
        SearchDelegate.SearchState searchState = f0i0Var.f;
        f0i0Var.d = true;
        SearchDelegate.SearchState a5 = f0i0Var.a();
        f0i0Var.f = a5;
        if (searchState != a5) {
            f0i0Var.a.invoke();
        }
        vkSearchView.setOnBackClickListener(new rka0(a2, 14));
        String str = (String) mo8Var.b;
        if (str != null) {
            vkSearchView.setHint(str);
        }
        this.i = vkSearchView;
        a2.getLifecycle().addObserver(this);
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final void d() {
        dhr0 dhr0Var = dhr0.a;
        VkSearchView vkSearchView = this.i;
        dhr0Var.e0(R.attr.vk_ui_header_background, vkSearchView);
        AppBarLayout.d dVar = new AppBarLayout.d(iah0.a(56));
        dVar.a = 21;
        AppBarLayout appBarLayout = this.f;
        if (appBarLayout != null) {
            krv0.n(R.attr.vk_ui_header_background, appBarLayout);
            appBarLayout.addView(vkSearchView, dVar);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.addView(this.h);
        }
        bwt0.p0(this.h, this.c.f != SearchDelegate.SearchState.COLLAPSED);
        vkSearchView.b5(200L);
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final View e(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.search_layout, viewGroup, false);
        this.f = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        this.g = (FrameLayout) inflate.findViewById(R.id.search_result_container);
        return inflate;
    }

    @Override // com.vk.search.integration.api.SearchDelegate
    public final void onConfigurationChanged(Configuration configuration) {
        this.e.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.b.getLifecycle().removeObserver(this);
        f0i0 f0i0Var = this.c;
        SearchDelegate.SearchState searchState = f0i0Var.f;
        f0i0Var.c = true;
        f0i0Var.d = false;
        f0i0Var.e = false;
        SearchDelegate.SearchState a2 = f0i0Var.a();
        f0i0Var.f = a2;
        if (searchState != a2) {
            f0i0Var.a.invoke();
        }
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        this.e.K();
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        this.e.M();
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
