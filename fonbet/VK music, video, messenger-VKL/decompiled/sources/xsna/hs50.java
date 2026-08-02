package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.bp50;
import xsna.zu50;

/* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
/* loaded from: classes4.dex */
public final class hs50 extends rp6<MyTargetNativeAdSinglePartUiDto, MyTargetNativeAdEntry> implements t0n, a1n {
    public static final /* synthetic */ int h0 = 0;
    public final wvn E;
    public final h170 F;
    public final MediaAdView G;
    public final FixedSizeVKEnhancedImageView H;
    public final IconAdView I;
    public final ImageView J;
    public final LinearLayout K;
    public final TextView L;
    public final PostHeaderSubtitleTextView M;
    public final ImageView N;
    public final LinearLayout O;
    public final LottieAnimationView P;
    public final LinearLayout Q;
    public final c R;
    public final s2m S;
    public final Object T;
    public final Object U;
    public final e V;
    public final f W;
    public final a X;
    public final b Y;
    public boolean Z;
    public zmk a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public cjx e0;
    public final Object f0;
    public ii6 g0;

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class a implements bp50.a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.bp50.a
        public final void a(Context context, ArrayList arrayList) {
            final hs50 hs50Var = hs50.this;
            final MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) hs50Var.C;
            if (myTargetNativeAdSinglePartUiDto == null) {
                return;
            }
            final bp50 bp50Var = myTargetNativeAdSinglePartUiDto.r;
            final MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
            if (myTargetNativeAdEntry == null) {
                return;
            }
            com.vk.newsfeed.common.util.b bVar = new com.vk.newsfeed.common.util.b(myTargetNativeAdEntry, null);
            bVar.i = bp50Var != null ? bp50Var.c : null;
            bVar.b = new z960() { // from class: xsna.gs50
                /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.z960
                public final void g(VkContextMenu vkContextMenu, int i) {
                    ArrayList<b520> arrayList2;
                    int h = PostActions.ACTION_SHOW_AD_DEBUG_INFO.h();
                    bp50 bp50Var2 = bp50.this;
                    if (i == h) {
                        if (bp50Var2 != null) {
                            bp50Var2.c("debug");
                        }
                    } else if (i == PostActions.ACTION_COPY_ADS_URL.h()) {
                        if (bp50Var2 != null) {
                            bp50Var2.c("ads_copy_url");
                        }
                    } else if (i == PostActions.ACTION_SHOW_ADVERTISER_INFO.h()) {
                        if (bp50Var2 != null) {
                            bp50Var2.c("show_advertiser_info");
                        }
                    } else if (i == PostActions.ACTION_OPEN_RECOMMENDATION_URL.h()) {
                        if (bp50Var2 != null) {
                            bp50Var2.c("ads_recommendations_info");
                        }
                    } else if (i != PostActions.ACTION_COPY_AD_MARKER.h()) {
                        int h2 = PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h();
                        hs50 hs50Var2 = hs50Var;
                        if (i == h2) {
                            if (vkContextMenu != null) {
                                vkContextMenu.e(null);
                            }
                            AdVkFeedItemState adVkFeedItemState = AdVkFeedItemState.HIDE_REASONS_SHOWING;
                            MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto2 = myTargetNativeAdSinglePartUiDto;
                            myTargetNativeAdSinglePartUiDto2.u = adVkFeedItemState;
                            int i2 = hs50.h0;
                            hs50Var2.h7(myTargetNativeAdSinglePartUiDto2);
                        } else if (i == PostActions.ACTION_REPORT.h()) {
                            if (vkContextMenu != null) {
                                vkContextMenu.e(null);
                            }
                            if (bp50Var2 != null && (arrayList2 = bp50Var2.c) != null) {
                                int i3 = hs50.h0;
                                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) hs50Var2.c0.getValue();
                                Context context2 = hs50Var2.itemView.getContext();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<b520> it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    b520 next = it.next();
                                    if (epx.f(next.b, "complain")) {
                                        arrayList3.add(next);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((b520) it2.next()).a);
                                }
                                newsfeedRouter.U(context2, myTargetNativeAdEntry, (String[]) arrayList4.toArray(new String[0]));
                            }
                        }
                    } else if (bp50Var2 != null) {
                        bp50Var2.c("ad_marker_template");
                    }
                    if (vkContextMenu != null) {
                        vkContextMenu.b();
                    }
                }
            };
            VkContextMenu a = bVar.a(context, new a.AbstractC1374a.b(hs50Var.N));
            a.e(new odm(bp50Var, 28));
            a.g();
        }
    }

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class b implements zu50.d {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zu50.d
        public final void a() {
            hs50 hs50Var = hs50.this;
            MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
            Drawable drawable = hs50Var.G.getImageView().getDrawable();
            if (myTargetNativeAdEntry == null || drawable == null) {
                return;
            }
            hs50Var.f7(drawable);
        }
    }

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class c implements aeq {
        public c() {
        }

        @Override // xsna.aeq
        public final void a(String str, String str2, String str3, boolean z) {
            gd60 a = hd60.a();
            hs50 hs50Var = hs50.this;
            a.v1(hs50Var.itemView.getContext(), str, str2, str3, z, hs50Var.getAbsoluteAdapterPosition());
        }
    }

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class d implements View.OnAttachStateChangeListener {
        public d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            hs50 hs50Var = hs50.this;
            cjx cjxVar = hs50Var.e0;
            if (cjxVar != null) {
                cjxVar.q(hs50Var.W);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            hs50 hs50Var = hs50.this;
            hs50Var.H.setPostprocessor(null);
            cjx cjxVar = hs50Var.e0;
            if (cjxVar != null) {
                cjxVar.f(hs50Var.W);
            }
        }
    }

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class f implements lv50, vix {
        public final FrameLayout b;
        public final View c;

        public f(FrameLayout frameLayout) {
            this.b = frameLayout;
            this.c = new View(hs50.this.itemView.getContext());
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return this.b;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }

        @Override // xsna.lv50
        public final View c() {
            return hs50.this.M;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return hs50.this.K;
        }

        @Override // xsna.lv50
        public final View e() {
            return null;
        }

        @Override // xsna.lv50
        public final View f() {
            return hs50.this.M;
        }

        @Override // xsna.lv50
        public final View g() {
            hs50 hs50Var = hs50.this;
            return hs50Var.F.c() ? hs50Var.b7().itemView : hs50Var.c7().itemView;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return hs50.this.S.d;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return hs50.this.I;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            return hs50.this.L;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.c;
        }

        @Override // xsna.lv50
        public final View i() {
            return hs50.this.L;
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            ii6 ii6Var = hs50.this.g0;
            if (ii6Var != null) {
                return ii6Var.j0();
            }
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return hs50.this.G;
        }
    }

    public hs50(ViewGroup viewGroup, p20 p20Var, wvn wvnVar, h170 h170Var) {
        super(R.layout.news_native_ad_view, viewGroup);
        this.E = wvnVar;
        this.F = h170Var;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.rootView);
        this.G = (MediaAdView) this.itemView.findViewById(R.id.mediaView);
        this.H = (FixedSizeVKEnhancedImageView) this.itemView.findViewById(R.id.imageView);
        this.I = (IconAdView) this.itemView.findViewById(R.id.icon);
        this.J = (ImageView) this.itemView.findViewById(R.id.iconImage);
        this.K = (LinearLayout) this.itemView.findViewById(R.id.ad_layout);
        this.L = (TextView) this.itemView.findViewById(R.id.ads_title);
        this.M = (PostHeaderSubtitleTextView) this.itemView.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.post_options_btn);
        this.N = imageView;
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.cta_button_container);
        this.O = (LinearLayout) this.itemView.findViewById(R.id.hide_reason_layout);
        this.P = (LottieAnimationView) this.itemView.findViewById(R.id.item_ignored_icon);
        this.Q = (LinearLayout) this.itemView.findViewById(R.id.hide_reasons_container);
        TextView textView = (TextView) this.itemView.findViewById(R.id.item_ignored_cancel);
        this.R = new c();
        this.S = new s2m(this);
        og1 og1Var = new og1(this, viewGroup, p20Var, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, og1Var);
        this.U = msy.a(lazyThreadSafetyMode, new gs1(viewGroup, this, p20Var, 4));
        this.V = new e();
        this.W = new f(frameLayout);
        this.X = new a();
        this.Y = new b();
        d dVar = new d();
        this.b0 = msy.a(lazyThreadSafetyMode, new hp30(this, 4));
        this.c0 = msy.a(lazyThreadSafetyMode, new jw30(this, 5));
        this.d0 = msy.a(lazyThreadSafetyMode, new so40(this, 2));
        this.f0 = pn00.k(new Pair(MyTargetNativeAdSinglePartUiDto.Type.INTERNAL_STATIC, new ejx(this.itemView)), new Pair(MyTargetNativeAdSinglePartUiDto.Type.STATIC, new jv50(this.itemView)), new Pair(MyTargetNativeAdSinglePartUiDto.Type.COLLAGE, new dv50(this.itemView)), new Pair(MyTargetNativeAdSinglePartUiDto.Type.CAROUSEL, new bv50(this.itemView)));
        textView.setOnClickListener(new asq(this, 3));
        frameLayout2.addView(h170Var.c() ? c7().itemView : b7().itemView);
        omw.d(imageView, R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_secondary);
        this.itemView.addOnAttachStateChangeListener(dVar);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        ii6 ii6Var = this.g0;
        if (ii6Var != null) {
            ii6Var.E2(disclaimerData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        if (((MyTargetNativeAdEntry) q6()) != null) {
            this.E.remove();
        }
    }

    @Override // xsna.t0n
    public final View R0() {
        View R0;
        ii6 ii6Var = this.g0;
        return (ii6Var == null || (R0 = ii6Var.R0()) == null) ? this.itemView : R0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        h170 h170Var;
        boolean z;
        int i;
        Text text;
        MyTargetNativeAdEntry myTargetNativeAdEntry;
        final MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto2 = myTargetNativeAdSinglePartUiDto;
        u1c0 u1c0Var = myTargetNativeAdSinglePartUiDto2.s;
        final gjx gjxVar = myTargetNativeAdSinglePartUiDto2.j;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.H;
        h170 h170Var2 = this.F;
        if (gjxVar != null) {
            com.vk.toggle.data.a a2 = h170Var2.a();
            zmk zmkVar = (a2 != null ? a2.c : null) != null ? new zmk() : null;
            if (zmkVar != null && (myTargetNativeAdEntry = (MyTargetNativeAdEntry) q6()) != null) {
                hg1.b(this.itemView, zmkVar.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pd40(new defpackage.s(23, this, myTargetNativeAdEntry), 2), new d750(new lp1(com.vk.metrics.eventtracking.b.a, 10), 2)));
                fixedSizeVKEnhancedImageView.setPostprocessor(zmkVar);
            }
        } else {
            fixedSizeVKEnhancedImageView.setPostprocessor(null);
            com.vk.toggle.data.a a3 = h170Var2.a();
            if (a3 != null && a3.c != null) {
                zmk zmkVar2 = new zmk();
                this.a0 = zmkVar2;
                io.reactivex.rxjava3.subjects.f<Integer> fVar = zmkVar2.d;
                if (fVar != null) {
                    io.reactivex.rxjava3.disposables.c subscribe = fVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j41(new ayo(this, 25), 28), new o3y(new kpd(com.vk.metrics.eventtracking.b.a, 8), 8));
                    if (subscribe != null) {
                        hg1.b(this.itemView, subscribe);
                    }
                }
            }
        }
        if (gjxVar != null) {
            this.e0 = ((yix) this.d0.getValue()).b(gjxVar);
        }
        ListBuilder e2 = e43.e();
        Description description = myTargetNativeAdSinglePartUiDto2.l;
        if (description != null) {
            e2.add(description);
        }
        Description description2 = myTargetNativeAdSinglePartUiDto2.m;
        if (description2 != null) {
            e2.add(description2);
        }
        Description description3 = myTargetNativeAdSinglePartUiDto2.p;
        if (description3 != null) {
            e2.add(description3);
        }
        ListBuilder g = e2.g();
        String str = myTargetNativeAdSinglePartUiDto2.k;
        if (str == null) {
            str = "";
        }
        TextView textView = this.L;
        textView.setText(str);
        PostHeaderSubtitleTextView postHeaderSubtitleTextView = this.M;
        postHeaderSubtitleTextView.setDescriptions(g);
        u1c0 J0 = J0();
        s2m s2mVar = this.S;
        if (J0 != null) {
            r8q.c(s2mVar.f, J0, s2mVar.j, true, s2mVar.h, false, 16);
        }
        Description description4 = myTargetNativeAdSinglePartUiDto2.n;
        String str2 = (description4 == null || (text = description4.b) == null) ? null : text.b;
        FrameLayout frameLayout = s2mVar.d;
        hs50 hs50Var = s2mVar.b;
        s1q s1qVar = s2mVar.j;
        r8q r8qVar = s2mVar.f;
        boolean z2 = r8qVar.o;
        SquareExcerptTextView squareExcerptTextView = s2mVar.e;
        squareExcerptTextView.setShouldTruncate(z2);
        if (z2) {
            h170Var = h170Var2;
            i = s1qVar.a;
            z = z2;
            int i2 = s1qVar.b + i;
            if (i2 >= i) {
                i = i2;
            }
        } else {
            h170Var = h170Var2;
            z = z2;
            i = Integer.MAX_VALUE;
        }
        squareExcerptTextView.setMaxLines(i);
        squareExcerptTextView.setMaxExcerptLines(z ? s1qVar.a : Integer.MAX_VALUE);
        squareExcerptTextView.setMinTrimmedLines(s1qVar.b);
        squareExcerptTextView.setEllipsize(z ? TextUtils.TruncateAt.END : null);
        squareExcerptTextView.setShowMoreText(s2mVar.g);
        if (str2 == null || str2.length() == 0) {
            bwt0.p0(frameLayout, false);
        } else {
            ej90 ej90Var = new ej90(str2, str2, str2);
            ?? q6 = hs50Var.q6();
            s2mVar.c.getContext();
            r8qVar.a(q6, ej90Var, hs50Var.w, hs50Var.u);
            bwt0.p0(frameLayout, true);
        }
        bp50 bp50Var = myTargetNativeAdSinglePartUiDto2.r;
        if (bp50Var != null) {
            bp50Var.d = this.X;
        }
        final zu50 zu50Var = myTargetNativeAdSinglePartUiDto2.h;
        if (zu50Var != null) {
            zu50Var.r = 5;
        }
        if (zu50Var != null) {
            zu50Var.l = this.V;
        }
        MyTargetNativeAdSinglePartUiDto.Type type = myTargetNativeAdSinglePartUiDto2.x;
        ii6 ii6Var = (ii6) this.f0.get(type);
        if (ii6Var == null) {
            L.e("Incorrect NativeAdDelegate type", type);
        }
        if (!epx.f(ii6Var, this.g0)) {
            ii6 ii6Var2 = this.g0;
            if (ii6Var2 != null) {
                ii6Var2.dispose();
            }
            this.g0 = ii6Var;
        }
        cjx cjxVar = this.e0;
        f fVar2 = this.W;
        if (zu50Var != null) {
            zu50Var.h(fVar2, null);
        } else if (cjxVar != null) {
            bwt0.i0(this.J, new defpackage.b0(22, this, cjxVar));
            bwt0.i0(fixedSizeVKEnhancedImageView, new h1(24, this, cjxVar));
            bwt0.i0(textView, new nk0(19, this, cjxVar));
            bwt0.i0(postHeaderSubtitleTextView, new m9(23, this, cjxVar));
            bwt0.i0(this.G, new n9(19, this, cjxVar));
            bwt0.i0(s2mVar.d, new js00(5, this, cjxVar));
            if (h170Var.c()) {
                bwt0.i0(c7().itemView, new defpackage.h0(21, this, cjxVar));
            } else {
                bwt0.i0(b7().itemView, new wd3(19, this, cjxVar));
            }
            cjxVar.q(fVar2);
            cjxVar.m(new d4n(this, myTargetNativeAdSinglePartUiDto2));
        }
        ii6 ii6Var3 = this.g0;
        if (ii6Var3 != null) {
            ii6Var3.j2(t6(), myTargetNativeAdSinglePartUiDto2);
        }
        if (zu50Var != null) {
            zu50Var.i(this.R);
        }
        if (h170Var.c()) {
            c7().a6(u1c0Var);
            bwt0.n(c7().itemView, new dlb(this, zu50Var, gjxVar, 8));
        } else {
            b7().a6(u1c0Var);
            bwt0.n(b7().itemView, new edd(this, zu50Var, gjxVar, 1));
        }
        this.N.setOnClickListener(new View.OnClickListener() { // from class: xsna.fs50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egz0 c2;
                ArrayList arrayList;
                ArrayList<b520> arrayList2;
                bp50 bp50Var2 = MyTargetNativeAdSinglePartUiDto.this.r;
                if (bp50Var2 != null && (arrayList2 = bp50Var2.c) != null) {
                    arrayList2.clear();
                }
                zu50 zu50Var2 = zu50Var;
                if (zu50Var2 != null) {
                    zu50Var2.e(view.getContext());
                    return;
                }
                if (gjxVar != null) {
                    hs50 hs50Var2 = this;
                    MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto3 = (MyTargetNativeAdSinglePartUiDto) hs50Var2.C;
                    if (myTargetNativeAdSinglePartUiDto3 == null) {
                        return;
                    }
                    MyTargetNativeAdEntry myTargetNativeAdEntry2 = myTargetNativeAdSinglePartUiDto3.t;
                    gjx gjxVar2 = myTargetNativeAdSinglePartUiDto3.j;
                    if (gjxVar2 == null || (c2 = gjxVar2.c()) == null || (arrayList = c2.b) == null) {
                        return;
                    }
                    com.vk.newsfeed.common.util.b bVar = new com.vk.newsfeed.common.util.b(myTargetNativeAdEntry2, null);
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ajx ajxVar = (ajx) it.next();
                        arrayList3.add(new b520(ajxVar.getTitle(), 0, ajxVar.getType(), ajxVar.b()));
                    }
                    bVar.i = arrayList3;
                    bVar.b = new kx2(myTargetNativeAdSinglePartUiDto3, hs50Var2, arrayList);
                    bVar.a(hs50Var2.itemView.getContext(), new a.AbstractC1374a.b(hs50Var2.N)).g();
                }
            }
        });
        h7(myTargetNativeAdSinglePartUiDto2);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.Z = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final jf0 b7() {
        return (jf0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final rf0 c7() {
        return (rf0) this.U.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7(View view, cjx cjxVar, String str, int i) {
        if (!com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_SINGLE_INA_MVI_CLICK)) {
            cjxVar.p(view, str);
            return;
        }
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) q6();
        if (myTargetNativeAdEntry != null) {
            hi60 hi60Var = this.D;
            Context context = this.itemView.getContext();
            NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, str, i, null);
            u1c0 J0 = J0();
            hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar, J0 != null ? J0.k : -1));
        }
    }

    public final void e7(Bitmap bitmap) {
        hg1.b(this.itemView, new io.reactivex.rxjava3.internal.operators.single.v(new rr10(1, this, bitmap)).q(asu0.a.c()).subscribe());
    }

    public final void f7(Drawable drawable) {
        Bitmap bitmap;
        try {
            bitmap = xjo.b(drawable, 0, 0, 7);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            bitmap = null;
        }
        if (bitmap != null) {
            e7(bitmap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h7(MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        Integer num;
        Integer num2;
        DisclaimerContent disclaimerContent;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_market_outline_28);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_clock_outline_28);
        Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_place_outline_28);
        Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_hide_outline_28);
        AdVkFeedItemState adVkFeedItemState = myTargetNativeAdSinglePartUiDto.u;
        AdVkFeedItemState adVkFeedItemState2 = AdVkFeedItemState.AD_SHOWING;
        LinearLayout linearLayout = this.O;
        LinearLayout linearLayout2 = this.K;
        if (adVkFeedItemState == adVkFeedItemState2) {
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
        } else if (adVkFeedItemState == AdVkFeedItemState.HIDE_REASONS_SHOWING) {
            gjx gjxVar = myTargetNativeAdSinglePartUiDto.j;
            LinearLayout linearLayout3 = this.Q;
            if (gjxVar != null) {
                egz0 c2 = gjxVar.c();
                if (c2 != null) {
                    linearLayout3.removeAllViews();
                    ArrayList arrayList = c2.b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        Object next = it2.next();
                        Integer num3 = valueOf;
                        if (epx.f(((ajx) next).getType(), "hide")) {
                            arrayList2.add(next);
                        }
                        it = it2;
                        valueOf = num3;
                    }
                    Integer num4 = valueOf;
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ajx ajxVar = (ajx) it3.next();
                        Iterator it4 = it3;
                        Integer num5 = valueOf2;
                        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.news_item_ignored_hide_option, (ViewGroup) linearLayout3, false);
                        TextView textView = (TextView) inflate.findViewById(R.id.text);
                        Integer num6 = valueOf3;
                        View findViewById = inflate.findViewById(R.id.icon);
                        Integer num7 = valueOf4;
                        inflate.setOnClickListener(new qg6(3, this, ajxVar));
                        textView.setText(ajxVar.getTitle());
                        this.itemView.getContext();
                        String b2 = ajxVar.b();
                        if (b2 != null) {
                            switch (b2.hashCode()) {
                                case -1791517821:
                                    if (b2.equals("purchased")) {
                                        num2 = num4;
                                        break;
                                    }
                                    break;
                                case -994856342:
                                    if (b2.equals("too_many")) {
                                        num2 = num5;
                                        break;
                                    }
                                    break;
                                case -770822888:
                                    if (b2.equals("missed_region")) {
                                        num2 = num6;
                                        break;
                                    }
                                    break;
                                case -701740491:
                                    if (b2.equals("not_interested")) {
                                        num2 = num7;
                                        break;
                                    }
                                    break;
                            }
                        }
                        num2 = null;
                        textView.setTextColor(dhr0.r(R.attr.vk_ui_text_primary));
                        findViewById.setBackground(num2 != null ? dhr0.t.a(num2.intValue()) : null);
                        findViewById.setBackgroundTintList(dhr0.r(R.attr.vk_ui_icon_secondary));
                        linearLayout3.addView(inflate, layoutParams);
                        it3 = it4;
                        valueOf2 = num5;
                        valueOf3 = num6;
                        valueOf4 = num7;
                    }
                }
            } else {
                final bp50 bp50Var = myTargetNativeAdSinglePartUiDto.r;
                if (bp50Var != null) {
                    linearLayout3.removeAllViews();
                    ArrayList<b520> arrayList3 = bp50Var.c;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<b520> it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        b520 next2 = it5.next();
                        if (epx.f(next2.b, "hide")) {
                            arrayList4.add(next2);
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        final b520 b520Var = (b520) it6.next();
                        View inflate2 = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.news_item_ignored_hide_option, (ViewGroup) linearLayout3, false);
                        TextView textView2 = (TextView) inflate2.findViewById(R.id.text);
                        Iterator it7 = it6;
                        View findViewById2 = inflate2.findViewById(R.id.icon);
                        inflate2.setOnClickListener(new View.OnClickListener() { // from class: xsna.es50
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bp50.this.d(b520Var);
                                hs50 hs50Var = this;
                                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
                                if (myTargetNativeAdEntry != null) {
                                    hs50Var.D.sa(new NewsfeedExternalAction.c.r(myTargetNativeAdEntry));
                                }
                            }
                        });
                        textView2.setText(b520Var.a);
                        this.itemView.getContext();
                        String str = b520Var.c;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1791517821:
                                    if (str.equals("purchased")) {
                                        num = valueOf;
                                        break;
                                    }
                                    break;
                                case -994856342:
                                    if (str.equals("too_many")) {
                                        num = valueOf2;
                                        break;
                                    }
                                    break;
                                case -770822888:
                                    if (str.equals("missed_region")) {
                                        num = valueOf3;
                                        break;
                                    }
                                    break;
                                case -701740491:
                                    if (str.equals("not_interested")) {
                                        num = valueOf4;
                                        break;
                                    }
                                    break;
                            }
                            textView2.setTextColor(dhr0.r(R.attr.vk_ui_text_primary));
                            findViewById2.setBackground(num == null ? dhr0.t.a(num.intValue()) : null);
                            findViewById2.setBackgroundTintList(dhr0.r(R.attr.vk_ui_icon_secondary));
                            linearLayout3.addView(inflate2, layoutParams2);
                            it6 = it7;
                        }
                        num = null;
                        textView2.setTextColor(dhr0.r(R.attr.vk_ui_text_primary));
                        findViewById2.setBackground(num == null ? dhr0.t.a(num.intValue()) : null);
                        findViewById2.setBackgroundTintList(dhr0.r(R.attr.vk_ui_icon_secondary));
                        linearLayout3.addView(inflate2, layoutParams2);
                        it6 = it7;
                    }
                }
            }
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            LottieAnimationView lottieAnimationView = this.P;
            lottieAnimationView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lottieAnimationView.m0();
        }
        NewsEntry t6 = t6();
        if (t6 instanceof MyTargetNativeAdEntry) {
            MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) t6;
            if (adVkFeedItemState == AdVkFeedItemState.AD_SHOWING) {
                MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto2 = (MyTargetNativeAdSinglePartUiDto) this.C;
                if (myTargetNativeAdSinglePartUiDto2 == null || (disclaimerContent = myTargetNativeAdSinglePartUiDto2.v) == null) {
                    disclaimerContent = DisclaimerContent.UNSUPPORTED;
                }
            } else {
                disclaimerContent = DisclaimerContent.UNSUPPORTED;
            }
            myTargetNativeAdEntry.r = disclaimerContent;
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.Z;
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
    }

    /* compiled from: MyTargetNativeAdSinglePartViewHolder.kt */
    public final class e implements zu50.b {
        public e() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            zu50 zu50Var2;
            hs50 hs50Var = hs50.this;
            MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) hs50Var.C;
            if (myTargetNativeAdSinglePartUiDto != null && (zu50Var2 = myTargetNativeAdSinglePartUiDto.h) != null) {
                zu50Var2.a();
            }
            MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) hs50Var.q6();
            if (myTargetNativeAdEntry != null) {
                ((c1c0) hs50Var.b0.getValue()).y(myTargetNativeAdEntry);
            }
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
