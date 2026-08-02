package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r3n0;

/* compiled from: RecommendedChannelsHolder.kt */
/* loaded from: classes4.dex */
public final class tcf0 extends rp6<ucf0, ChannelsRecommendations> implements View.OnAttachStateChangeListener, f5z {
    public static final String K = i5s.a(new StringBuilder("https://"), a0a.d, "/im/channels");
    public final mbs E;
    public final RecyclerPaginatedView F;
    public final io.reactivex.rxjava3.disposables.b G;
    public final aib H;
    public final androidx.lifecycle.m I;
    public final d J;

    /* compiled from: RecommendedChannelsHolder.kt */
    public static final /* synthetic */ class a implements r3n0.b, g0t {
        public a() {
        }

        @Override // xsna.r3n0.b
        public final boolean a(int i) {
            tcf0.this.getClass();
            return (i == 0 || i == 1 || i == 2) ? false : true;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof r3n0.b) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, tcf0.this, tcf0.class, "isViewTypeNeedsDecoration", "isViewTypeNeedsDecoration(I)Z", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: RecommendedChannelsHolder.kt */
    public static final /* synthetic */ class b implements r3n0.a, g0t {
        public b() {
        }

        @Override // xsna.r3n0.a
        public final float a(int i) {
            tcf0.this.getClass();
            return cn70.c(8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof r3n0.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, tcf0.this, tcf0.class, "getDecorationCornerRadius", "getDecorationCornerRadius(I)F", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: RecommendedChannelsHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ChannelsRecommendations channelsRecommendations;
            LinkButton linkButton;
            tcf0 tcf0Var = (tcf0) this.receiver;
            String str = tcf0.K;
            ucf0 ucf0Var = (ucf0) tcf0Var.C;
            if (ucf0Var == null || (channelsRecommendations = ucf0Var.h) == null) {
                channelsRecommendations = (ChannelsRecommendations) tcf0Var.q6();
            }
            Action action = (channelsRecommendations == null || (linkButton = channelsRecommendations.k) == null) ? null : linkButton.c;
            if (action != null) {
                hd60.a().v(action, tcf0Var.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
            } else {
                gd60.Q0(hd60.a(), tcf0Var.itemView.getContext(), tcf0.K, null, null, null, 24);
            }
            return s3q0.a;
        }
    }

    public tcf0(ViewGroup viewGroup, h170 h170Var, mbs mbsVar) {
        super(R.layout.news_channels_recommendations, viewGroup);
        this.E = mbsVar;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.recom_channels_list);
        this.F = recyclerPaginatedView;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.G = bVar;
        aib aibVar = new aib(bVar, new c(0, this, tcf0.class, "onShowAllClicked", "onShowAllClicked()V", 0), h170Var);
        this.H = aibVar;
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this, true);
        this.I = mVar;
        this.J = new d();
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new jxq(new nbf0()));
        getContext();
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new ehk0(cn70.b(12)));
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new r3n0(new a(), new b()));
        int a2 = gbg0.a(this.itemView.getResources(), 16.0f);
        recyclerPaginatedView.getRecyclerView().setPadding(a2, 0, a2, 0);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setFooterLoadingViewProvider(null);
        recyclerPaginatedView.setFooterErrorViewProvider(null);
        recyclerPaginatedView.setAdapter(aibVar);
        this.itemView.addOnAttachStateChangeListener(this);
        f4m.v(cn70.b(3), this.itemView);
        mVar.c(Lifecycle.Event.ON_CREATE);
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FEED;
        getLifecycle().addObserver(new wyv(recyclerView2, new vyv(mobileOfficialAppsCoreNavStat$EventScreen), null, new uyv(com.vk.metrics.eventtracking.b.a), new q5u0(0.5f, 1), 12));
    }

    @Override // xsna.rp6
    public final void R6(ucf0 ucf0Var) {
        ucf0 ucf0Var2 = ucf0Var;
        boolean z = ucf0Var2.i;
        aib aibVar = this.H;
        if (aibVar.h != z) {
            aibVar.h = z;
            aibVar.notifyDataSetChanged();
        }
        bwy bwyVar = ucf0Var2.j;
        if (!epx.f(aibVar.i, bwyVar)) {
            aibVar.i = bwyVar;
            aibVar.notifyDataSetChanged();
        }
        RecyclerPaginatedView recyclerPaginatedView = this.F;
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new com.vk.movika.sdk.base.flow.binding.l(18, this, ucf0Var2));
        recyclerPaginatedView.f0();
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.I;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.I.c(Lifecycle.Event.ON_START);
        mbs mbsVar = this.E;
        if (mbsVar != null) {
            mbsVar.a(this.J);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.I.c(Lifecycle.Event.ON_STOP);
        mbs mbsVar = this.E;
        if (mbsVar != null) {
            mbsVar.d(this.J);
        }
        this.G.e();
    }

    /* compiled from: RecommendedChannelsHolder.kt */
    public static final class d implements obs {
        public d() {
        }

        @Override // xsna.obs
        public final void onPause() {
            tcf0.this.I.c(Lifecycle.Event.ON_STOP);
        }

        @Override // xsna.obs
        public final void onResume() {
            tcf0.this.I.c(Lifecycle.Event.ON_START);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroy() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
