package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdDescriptionView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdHideReasonsView;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MyTargetInternalNativeAdCarouselSinglePartViewHolder.kt */
/* loaded from: classes4.dex */
public final class vq50 extends pq50<tq50, MyTargetNativeAdEntry> {
    public final wvn M;
    public boolean N;
    public final MyTargetAdDescriptionView O;
    public final rq50 P;
    public final b Q;
    public final t2m R;
    public final LinearLayout S;
    public final MyTargetAdHideReasonsView T;
    public final Object U;

    /* compiled from: MyTargetInternalNativeAdCarouselSinglePartViewHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            vq50 vq50Var = vq50.this;
            cjx cjxVar = vq50Var.E;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.q(vq50Var.Q);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            vq50 vq50Var = vq50.this;
            cjx cjxVar = vq50Var.E;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.f(vq50Var.Q);
        }
    }

    /* compiled from: MyTargetInternalNativeAdCarouselSinglePartViewHolder.kt */
    public static final class b implements vix {
        public final ViewGroup b;

        public b(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return this.b;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    public vq50(ViewGroup viewGroup, wvn wvnVar, h170 h170Var) {
        super(R.layout.news_internal_native_ad_carousel_single_part_view_holder, viewGroup);
        this.M = wvnVar;
        this.N = false;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.rootView);
        VkFeedPostHeaderView vkFeedPostHeaderView = (VkFeedPostHeaderView) this.itemView.findViewById(R.id.header_view);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.cards_rv);
        MyTargetAdDescriptionView myTargetAdDescriptionView = (MyTargetAdDescriptionView) this.itemView.findViewById(R.id.description_view);
        this.O = myTargetAdDescriptionView;
        rq50 rq50Var = new rq50();
        this.P = rq50Var;
        this.Q = new b(frameLayout);
        this.R = new t2m(myTargetAdDescriptionView);
        this.S = (LinearLayout) this.itemView.findViewById(R.id.ad_container);
        this.T = (MyTargetAdHideReasonsView) this.itemView.findViewById(R.id.hide_reasons_view);
        this.U = msy.a(LazyThreadSafetyMode.NONE, new uq50(viewGroup, 0));
        this.K = new fwu(vkFeedPostHeaderView, (r3c0) this.J.getValue());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(rq50Var);
        int b2 = cn70.b(12);
        int b3 = cn70.b(8);
        recyclerView.addItemDecoration(new v98(b2, b3, b3, true));
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.itemView;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(ol60 ol60Var) {
        Text text;
        tq50 tq50Var = (tq50) ol60Var;
        fkz0 b2 = ((yix) this.G.getValue()).b(tq50Var.h);
        this.E = b2;
        b2.m(new vpn(this, tq50Var));
        f7(tq50Var);
        e7(tq50Var);
        ArrayList arrayList = tq50Var.p;
        qw6 qw6Var = new qw6(this, 10);
        z77 z77Var = new z77(this, 9);
        int intValue = ((Number) this.U.getValue()).intValue();
        cjx cjxVar = this.E;
        String str = null;
        this.P.x0(arrayList, qw6Var, z77Var, intValue, cjxVar != null ? cjxVar : null);
        u1c0 J0 = J0();
        if (J0 != null) {
            MyTargetNativeAdEntry myTargetNativeAdEntry = tq50Var.i;
            PostInteract postInteract = this.w;
            String str2 = this.u;
            t2m t2mVar = this.R;
            t2mVar.a(J0, myTargetNativeAdEntry, postInteract, str2);
            Description description = tq50Var.n;
            if (description != null && (text = description.b) != null) {
                str = text.b;
            }
            t2mVar.c(str);
            t2mVar.k = new ut30(this, 5);
            this.O.setOnClickListener(new ne3(this, 8));
        }
        d7(tq50Var);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.N = true;
    }

    @Override // xsna.pq50
    public final LinearLayout b7() {
        return this.S;
    }

    @Override // xsna.pq50
    public final MyTargetAdHideReasonsView c7() {
        return this.T;
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.N;
    }

    @Override // xsna.pq50, xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
    }
}
