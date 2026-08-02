package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKImageView;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.voip.ui.watchmovie.selectsource.dialog.ui.VoipActiveVideoView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.lrv0;
import xsna.mk50;
import xsna.pzw0;

/* compiled from: BaseVoipSelectMovieDialogFragment.kt */
/* loaded from: classes7.dex */
public abstract class us6 extends tl50<hzw0, pzw0, tmw0> implements t6x0 {
    public static final /* synthetic */ int p1 = 0;
    public final m40 i1 = new m40(this, 3);
    public final rs6 j1 = new lrv0.a() { // from class: xsna.rs6
        @Override // xsna.lrv0.a
        public final void xb() {
            int i = us6.p1;
            us6.this.tn();
        }
    };
    public io.reactivex.rxjava3.disposables.c k1;
    public io.reactivex.rxjava3.disposables.c l1;
    public final f4z<c0x0> m1;
    public final o40 n1;
    public final wet0 o1;

    /* compiled from: BaseVoipSelectMovieDialogFragment.kt */
    public static abstract class a extends dw20.b {
        public final UserId e;

        public a(FragmentActivity fragmentActivity, UserId userId) {
            super(fragmentActivity, null);
            this.e = userId;
            c(new ts90(1.0f, 2));
            I(true);
            v0(R.string.voip_select_video_watch);
            K0(32);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ab9 ab9Var = new ab9();
            UserId userId = this.e;
            if (userId != null) {
                ab9Var.setArguments(yfb.b(new Pair("user_id", userId)));
            }
            return ab9Var;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.rs6] */
    public us6() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.k1 = emptyDisposable;
        this.l1 = emptyDisposable;
        this.m1 = new f4z<>();
        this.n1 = new o40(this, 2);
        this.o1 = new wet0(new p40(this, 12), null, null, null, null, false, 254);
    }

    @Override // xsna.t6x0
    public final void Ab(p3x0 p3x0Var) {
        bo().l(p3x0Var);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_watch_movie_select);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        pzw0 pzw0Var = (pzw0) ao50Var;
        final ModernSearchView modernSearchView = (ModernSearchView) view.findViewById(R.id.voip_search_movie);
        modernSearchView.setHint(R.string.voip_select_video_search_hint);
        modernSearchView.setBackArrowAllowedInEditMode(false);
        modernSearchView.e(null, new defpackage.a0(modernSearchView, this, new acw0(new bv1(2, this, modernSearchView)), 1));
        modernSearchView.setParamsClickListener(new uh3(3, this, modernSearchView));
        this.k1 = new io.reactivex.rxjava3.internal.operators.observable.y(new qno0(modernSearchView.j).y(600L, TimeUnit.MILLISECONDS), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new qs6(new xr0(1), 0)).subscribe(new cw(new vs6(1, this, us6.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0), 5));
        final SearchParametersBottomView searchParametersBottomView = (SearchParametersBottomView) view.findViewById(R.id.voip_search_video_filter_params);
        searchParametersBottomView.setOnCloseClickListener(new mo3(this, 1));
        jjc.g(searchParametersBottomView, new com.vk.movika.sdk.base.data.a(this, 11));
        final VoipActiveVideoView voipActiveVideoView = (VoipActiveVideoView) view.findViewById(R.id.voip_watch_movie_active_video);
        voipActiveVideoView.setEventSupplier(this.n1);
        VKTabLayout vKTabLayout = (VKTabLayout) view.findViewById(R.id.voip_select_movie_tabs);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.voip_movie_pager);
        Bundle arguments = getArguments();
        viewPager2.setAdapter(new jzw0(getChildFragmentManager(), getLifecycle(), arguments != null ? (UserId) arguments.getParcelable("user_id") : null));
        new com.google.android.material.tabs.c(vKTabLayout, viewPager2, new com.vk.movika.sdk.base.ui.j(this, 5)).a();
        final ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.voip_select_movie_flipper);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper.setOutAnimation(alphaAnimation2);
        viewFlipper.setDisplayedChild(0);
        final uzw0 uzw0Var = new uzw0(this.i1);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_select_movie_search_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(uzw0Var);
        recyclerView.setHasFixedSize(true);
        gm50.a.b(this, pzw0Var.a, new izs() { // from class: xsna.ss6
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i = us6.p1;
                yzt0<pzw0.b> yzt0Var = ((pzw0.a) obj).a;
                final us6 us6Var = us6.this;
                final ViewFlipper viewFlipper2 = viewFlipper;
                final ModernSearchView modernSearchView2 = modernSearchView;
                final SearchParametersBottomView searchParametersBottomView2 = searchParametersBottomView;
                final RecyclerView recyclerView2 = recyclerView;
                final VoipActiveVideoView voipActiveVideoView2 = voipActiveVideoView;
                final uzw0 uzw0Var2 = uzw0Var;
                gm50.a.a(us6Var, yzt0Var, new izs() { // from class: xsna.ts6
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        int i2;
                        pzw0.b bVar = (pzw0.b) obj2;
                        int i3 = us6.p1;
                        boolean z = bVar instanceof pzw0.b.a;
                        ViewFlipper viewFlipper3 = viewFlipper2;
                        ModernSearchView modernSearchView3 = modernSearchView2;
                        SearchParametersBottomView searchParametersBottomView3 = searchParametersBottomView2;
                        RecyclerView recyclerView3 = recyclerView2;
                        if (z) {
                            if (viewFlipper3.getDisplayedChild() != 0) {
                                viewFlipper3.setDisplayedChild(0);
                            }
                            modernSearchView3.j(false, false);
                            searchParametersBottomView3.setParameters(null);
                            searchParametersBottomView3.setVisibility(8);
                            f4m.v(0, recyclerView3);
                            pzw0.b.a aVar = (pzw0.b.a) bVar;
                            p3x0 p3x0Var = aVar.a;
                            boolean z2 = aVar.b;
                            VoipActiveVideoView voipActiveVideoView3 = voipActiveVideoView2;
                            if (p3x0Var != null) {
                                String str = p3x0Var.c;
                                VKImageView vKImageView = voipActiveVideoView3.u;
                                voipActiveVideoView3.v.setText(str);
                                voipActiveVideoView3.w.setText(p3x0Var.d);
                                voipActiveVideoView3.x.setText(p3x0Var.f);
                                long j = p3x0Var.g;
                                TextView textView = voipActiveVideoView3.y;
                                textView.setBackgroundResource(j < 0 ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old);
                                textView.setText(his0.h(j, textView.getContext()));
                                vKImageView.s0(p3x0Var.i);
                                vKImageView.setContentDescription(str);
                                voipActiveVideoView3.setVisibility(0);
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            voipActiveVideoView3.setVisibility(i2);
                            voipActiveVideoView3.t.setVisibility(z2 ? 0 : 8);
                        } else {
                            if (!(bVar instanceof pzw0.b.C3539b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (1 != viewFlipper3.getDisplayedChild()) {
                                viewFlipper3.setDisplayedChild(1);
                            }
                            pzw0.b.C3539b c3539b = (pzw0.b.C3539b) bVar;
                            boolean z3 = c3539b.b;
                            uzw0Var2.setItems(c3539b.a);
                            boolean I = c3539b.c.I();
                            modernSearchView3.j(z3, !I);
                            searchParametersBottomView3.setParameters(us6.this.o1.f(modernSearchView3.getContext()));
                            boolean z4 = z3 && !I;
                            searchParametersBottomView3.setVisibility(z4 ? 0 : 8);
                            f4m.v(z4 ? searchParametersBottomView3.getPanelHeight() : 0, recyclerView3);
                        }
                        return s3q0.a;
                    }
                });
                return s3q0.a;
            }
        });
    }

    public abstract icx0 bo();

    public abstract com.vk.voip.b co();

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = krv0.a;
        krv0.a(this.j1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TypedValue typedValue = krv0.a;
        krv0.k(this.j1);
        this.k1.dispose();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.l1.dispose();
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Context applicationContext = requireContext().getApplicationContext();
        return new hzw0(new mzw0(new ozw0(applicationContext), bo(), this.o1.g), new u98(new uft0(), new iid(applicationContext.getResources())), bo(), a201.b().b(), this.m1, co());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        this.m1.a(new j9(this, 9), this);
        getChildFragmentManager().l0("SELECTED", this, new d22(this, 4));
        return super.yn(bundle);
    }
}
