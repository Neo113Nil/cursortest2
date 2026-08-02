package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.search.ModernSearchView;
import com.vk.registration.funnels.TrackingElement;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.gm50;
import xsna.gzw;
import xsna.kdk0;
import xsna.mk50;
import xsna.xn50;

/* compiled from: SocialGraphFriendsFragment.kt */
/* loaded from: classes5.dex */
public final class odk0 extends yk50<ldk0, ydk0, kdk0> implements arf0, com.vk.registration.funnels.c {
    public RecyclerView k;
    public Toolbar l;
    public VkSimpleButton m;
    public View n;
    public View o;
    public View p;
    public ModernSearchView q;
    public ProgressBar r;
    public TextView s;
    public final io.reactivex.rxjava3.disposables.b i = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 j = new bpn0(new hp30(this, 22));
    public final bpn0 t = new bpn0(new jw30(this, 27));

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.new_social_graph_friends);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((ydk0) ao50Var).a, new ape0(this, 8));
    }

    @Override // xsna.yk50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ldk0) vk50Var).i.a(new kpd(1, this, odk0.class, "handleSideEffect", "handleSideEffect(Lcom/vk/socialgraph/list/feature/SocialGraphFriendsSideEffect;)V", 0, 10), this);
    }

    @Override // com.vk.registration.funnels.c
    public final List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        Pair pair = new Pair(TrackingElement.Registration.FRIEND_ASK, new vqe0(3));
        if (!getFeature().f) {
            pair = null;
        }
        return e43.m(pair);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.i.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ListBuilder listBuilder = com.vk.socialgraph.b.a;
        boolean b = com.vk.socialgraph.b.b(getView());
        View view = getView();
        if (gz80.a(23) && view != null) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(b ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        com.vk.socialgraph.b.c(getView(), b);
        Window window = kn().getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            View view2 = getView();
            Drawable background = view2 != null ? view2.getBackground() : null;
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                dhr0.t0(kn().getWindow(), colorDrawable.getColor());
            }
        }
    }

    @Override // xsna.yk50, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.k = (RecyclerView) requireView().findViewById(R.id.rpb_list);
        this.l = (Toolbar) requireView().findViewById(R.id.toolbar);
        this.m = (VkSimpleButton) requireView().findViewById(R.id.continue_btn);
        this.n = requireView().findViewById(R.id.empty_layout);
        this.o = requireView().findViewById(R.id.error_layout);
        this.p = requireView().findViewById(R.id.divider);
        this.q = (ModernSearchView) requireView().findViewById(R.id.search_view);
        this.r = (ProgressBar) requireView().findViewById(R.id.progress);
        this.s = (TextView) requireView().findViewById(R.id.empty_search_result);
        Toolbar toolbar = this.l;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new mo3(this, 16));
        toolbar.t(R.style.FriendsList_ToolbarTitleTextAppearance, requireContext());
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            sjo.b(navigationIcon, dhr0.t.c(R.attr.vk_ui_icon_accent_themed), PorterDuff.Mode.SRC_IN);
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(tn());
        VkSimpleButton vkSimpleButton = this.m;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        bwt0.i0(vkSimpleButton, new bnc0(this, 10));
        View view2 = this.o;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2.findViewById(R.id.try_again), new r820(this, 25));
        View view3 = this.o;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.i0(view3.findViewById(R.id.skip), new mdk0(this, 0));
        ModernSearchView modernSearchView = this.q;
        if (modernSearchView == null) {
            modernSearchView = null;
        }
        modernSearchView.e(null, new com.vk.movika.sdk.base.ui.r(17, modernSearchView, this));
        modernSearchView.setBackArrowAllowedInEditMode(false);
        modernSearchView.setSearchBoxBackground(null);
        ViewGroup viewGroup = modernSearchView.n;
        if (viewGroup != null) {
            bwt0.p0(viewGroup, true);
        }
        modernSearchView.h();
        this.i.b(new gzw.a(new qno0(modernSearchView.j)).U(new xq70(new m4k0(1), 14)).y(400L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new s440(new kb40(this, 25), 13)));
        xn50.a.c(this, kdk0.d.b);
    }

    public final xjs tn() {
        return (xjs) this.j.getValue();
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        ListBuilder listBuilder = com.vk.socialgraph.b.a;
        return com.vk.socialgraph.b.a(SocialGraphStrategy.Screen.CONTACTS, true);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ldk0(new vdk0(new xdk0(0)));
    }
}
