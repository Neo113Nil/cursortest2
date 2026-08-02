package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.DisclaimerType;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.viewer.impl.presentation.stories.view.ads.AspectRatioWrapperFrameLayout;
import com.vk.story.viewer.impl.presentation.stories.view.ads.html5.Html5LoadState;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bp50;
import xsna.e3m;
import xsna.h7u0;
import xsna.skm0;
import xsna.utl0;
import xsna.zu50;

/* compiled from: MyTargetAdStoryView.kt */
/* loaded from: classes6.dex */
public final class ep50 extends mkm0 {
    public final Object G;
    public final Object H;
    public final d I;
    public final b J;
    public final c K;
    public final y0n L;
    public dt50 M;
    public zu50 N;
    public boolean O;

    /* compiled from: MyTargetAdStoryView.kt */
    public static final class a implements bp50.a {
        public final plm0 a;
        public final bp50 b;

        public a(plm0 plm0Var, bp50 bp50Var) {
            this.a = plm0Var;
            this.b = bp50Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [T, xsna.skm0$b$a$c] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, xsna.skm0$b$a$a] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, xsna.gba0] */
        /* JADX WARN: Type inference failed for: r11v7, types: [T, kotlin.jvm.internal.FunctionReferenceImpl] */
        /* JADX WARN: Type inference failed for: r12v11, types: [T, xsna.skm0$b$b$a] */
        /* JADX WARN: Type inference failed for: r2v8, types: [xsna.zsu] */
        /* JADX WARN: Type inference failed for: r3v11, types: [T, xsna.okm0] */
        /* JADX WARN: Type inference failed for: r4v8, types: [T, xsna.skm0$b$a$d] */
        /* JADX WARN: Type inference failed for: r4v9, types: [T, xsna.h24] */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, xsna.skm0$b$a$g] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, xsna.aq3] */
        /* JADX WARN: Type inference failed for: r8v11, types: [T, xsna.skm0$b$a$e] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, xsna.skm0$b$a$b] */
        /* JADX WARN: Type inference failed for: r9v8, types: [T, xsna.hj3] */
        @Override // xsna.bp50.a
        public final void a(Context context, ArrayList arrayList) {
            dt50 dt50Var;
            b520 b520Var;
            ArrayList<b520> arrayList2;
            skm0.b.a.f fVar;
            b520 b520Var2;
            ArrayList<b520> arrayList3;
            b520 b520Var3;
            final Ref$ObjectRef ref$ObjectRef;
            final Ref$ObjectRef ref$ObjectRef2;
            b520 b520Var4;
            final Ref$ObjectRef ref$ObjectRef3;
            Ref$ObjectRef ref$ObjectRef4;
            b520 b520Var5;
            final Ref$ObjectRef ref$ObjectRef5;
            b520 b520Var6;
            atu atuVar;
            bp50 bp50Var;
            Ref$ObjectRef ref$ObjectRef6;
            Ref$ObjectRef ref$ObjectRef7;
            Ref$ObjectRef ref$ObjectRef8;
            DialogInterface.OnClickListener onClickListener;
            AlertController.RecycleListView recycleListView;
            String str;
            atu atuVar2 = this.a.e;
            StoryEntry currentStory = atuVar2.a.i0.getCurrentStory();
            if (currentStory == null) {
                return;
            }
            StoriesContainer storiesContainer = atuVar2.a.i0.getStoriesContainer();
            if ((storiesContainer instanceof MyTargetAdStoriesContainer) && (dt50Var = ((MyTargetAdStoriesContainer) storiesContainer).o.get(currentStory)) != null) {
                Context context2 = atuVar2.a.i0.getContext();
                dhr0.a.getClass();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, dhr0.u().c);
                h7u0.a aVar = new h7u0.a(contextThemeWrapper);
                skm0 skm0Var = atuVar2.e;
                mkm0 mkm0Var = atuVar2.a.j0;
                f0q0 f0q0Var = atuVar2.b;
                skm0Var.getClass();
                bp50 bp50Var2 = this.b;
                ArrayList<b520> arrayList4 = bp50Var2.c;
                skm0.b.a.f fVar2 = new skm0.b.a.f(contextThemeWrapper.getString(R.string.menu_settings));
                final ukm0 ukm0Var = new ukm0(0, mkm0Var, skm0.a.class, "openStoriesSettings", "openStoriesSettings()V", 0);
                Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                Iterator<b520> it = arrayList4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        b520Var = null;
                        break;
                    } else {
                        b520Var = it.next();
                        if (epx.f(b520Var.b, "hide")) {
                            break;
                        }
                    }
                }
                if (b520Var != null) {
                    ref$ObjectRef9.element = new skm0.b.a.c(contextThemeWrapper.getString(R.string.story_not_interesting_ad));
                    arrayList2 = arrayList4;
                    fVar = fVar2;
                    ref$ObjectRef10.element = new okm0(skm0Var, contextThemeWrapper, mkm0Var, bp50Var2, f0q0Var, 0);
                } else {
                    arrayList2 = arrayList4;
                    fVar = fVar2;
                }
                final Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                Iterator<b520> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        b520Var2 = null;
                        break;
                    } else {
                        b520Var2 = it2.next();
                        if (epx.f(b520Var2.c, "show_advertiser_info")) {
                            break;
                        }
                    }
                }
                b520 b520Var7 = b520Var2;
                if (b520Var7 != null) {
                    ref$ObjectRef11.element = new skm0.b.a.g(contextThemeWrapper.getString(R.string.story_show_advertiser_info));
                    ref$ObjectRef12.element = new aq3(bp50Var2, b520Var7, mkm0Var, 5);
                }
                final Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef14 = new Ref$ObjectRef();
                Iterator<b520> it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        arrayList3 = arrayList2;
                        b520Var3 = null;
                        break;
                    } else {
                        b520Var3 = it3.next();
                        arrayList3 = arrayList2;
                        if (epx.f(b520Var3.c, "ad_marker_template")) {
                            break;
                        } else {
                            arrayList2 = arrayList3;
                        }
                    }
                }
                b520 b520Var8 = b520Var3;
                if (b520Var8 != null) {
                    ref$ObjectRef13.element = new skm0.b.a.C3670a(b520Var8.a);
                    ref$ObjectRef14.element = new gba0(bp50Var2, b520Var8, mkm0Var, 1);
                }
                final Ref$ObjectRef ref$ObjectRef15 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef16 = new Ref$ObjectRef();
                Iterator<b520> it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        ref$ObjectRef = ref$ObjectRef12;
                        ref$ObjectRef2 = ref$ObjectRef14;
                        b520Var4 = null;
                        break;
                    } else {
                        b520Var4 = it4.next();
                        ref$ObjectRef = ref$ObjectRef12;
                        ref$ObjectRef2 = ref$ObjectRef14;
                        if (epx.f(b520Var4.c, "ads_recommendations_info")) {
                            break;
                        }
                        ref$ObjectRef12 = ref$ObjectRef;
                        ref$ObjectRef14 = ref$ObjectRef2;
                    }
                }
                b520 b520Var9 = b520Var4;
                if (b520Var9 != null) {
                    ref$ObjectRef15.element = new skm0.b.a.d(contextThemeWrapper.getString(R.string.story_show_recommendations_info));
                    ref$ObjectRef16.element = new h24(bp50Var2, b520Var9, mkm0Var, 4);
                }
                final Ref$ObjectRef ref$ObjectRef17 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef18 = new Ref$ObjectRef();
                Iterator<b520> it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        ref$ObjectRef3 = ref$ObjectRef16;
                        ref$ObjectRef4 = ref$ObjectRef9;
                        b520Var5 = null;
                        break;
                    } else {
                        b520Var5 = it5.next();
                        ref$ObjectRef3 = ref$ObjectRef16;
                        ref$ObjectRef4 = ref$ObjectRef9;
                        if (epx.f(b520Var5.c, "ads_copy_url")) {
                            break;
                        }
                        ref$ObjectRef9 = ref$ObjectRef4;
                        ref$ObjectRef16 = ref$ObjectRef3;
                    }
                }
                b520 b520Var10 = b520Var5;
                if (b520Var10 != null) {
                    ref$ObjectRef17.element = new skm0.b.a.C3671b(contextThemeWrapper.getString(R.string.story_actions_copy_url));
                    ref$ObjectRef18.element = new hj3(bp50Var2, b520Var10, mkm0Var, 5);
                }
                final Ref$ObjectRef ref$ObjectRef19 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef20 = new Ref$ObjectRef();
                Iterator<b520> it6 = arrayList3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        ref$ObjectRef5 = ref$ObjectRef18;
                        b520Var6 = null;
                        break;
                    } else {
                        b520Var6 = it6.next();
                        ref$ObjectRef5 = ref$ObjectRef18;
                        if (epx.f(b520Var6.b, "complain")) {
                            break;
                        } else {
                            ref$ObjectRef18 = ref$ObjectRef5;
                        }
                    }
                }
                if (b520Var6 != null) {
                    ref$ObjectRef19.element = new skm0.b.a.e(contextThemeWrapper.getString(R.string.report_content));
                    ref$ObjectRef7 = ref$ObjectRef4;
                    ref$ObjectRef6 = ref$ObjectRef10;
                    atuVar = atuVar2;
                    bp50Var = bp50Var2;
                    ref$ObjectRef8 = ref$ObjectRef20;
                    onClickListener = null;
                    ref$ObjectRef8.element = new tkm0(0, mkm0Var, skm0.a.class, "reportContent", "reportContent()V", 0);
                } else {
                    atuVar = atuVar2;
                    bp50Var = bp50Var2;
                    ref$ObjectRef6 = ref$ObjectRef10;
                    ref$ObjectRef7 = ref$ObjectRef4;
                    ref$ObjectRef8 = ref$ObjectRef20;
                    onClickListener = null;
                }
                final Ref$ObjectRef ref$ObjectRef21 = new Ref$ObjectRef();
                if (dt50Var.f == DisclaimerType.DECLARATION && (str = dt50Var.g) != null) {
                    ref$ObjectRef21.element = new skm0.b.AbstractC3672b.a(str);
                }
                final skm0.c cVar = new skm0.c(contextThemeWrapper, rl3.I(new skm0.b[]{fVar, ref$ObjectRef7.element, ref$ObjectRef11.element, ref$ObjectRef13.element, ref$ObjectRef15.element, ref$ObjectRef17.element, ref$ObjectRef19.element, ref$ObjectRef21.element}));
                aVar.R(cVar, onClickListener);
                final androidx.appcompat.app.d m = aVar.m();
                final Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef8;
                final skm0.b.a.f fVar3 = fVar;
                final Ref$ObjectRef ref$ObjectRef23 = ref$ObjectRef6;
                final Ref$ObjectRef ref$ObjectRef24 = ref$ObjectRef7;
                AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: xsna.pkm0
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        skm0.b bVar = skm0.c.this.c.get(i);
                        if (epx.f(bVar, fVar3)) {
                            ukm0Var.invoke();
                        } else if (epx.f(bVar, ref$ObjectRef24.element)) {
                            gzs gzsVar = (gzs) ref$ObjectRef23.element;
                            if (gzsVar != null) {
                                gzsVar.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef11.element)) {
                            gzs gzsVar2 = (gzs) ref$ObjectRef.element;
                            if (gzsVar2 != null) {
                                gzsVar2.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef13.element)) {
                            gzs gzsVar3 = (gzs) ref$ObjectRef2.element;
                            if (gzsVar3 != null) {
                                gzsVar3.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef15.element)) {
                            gzs gzsVar4 = (gzs) ref$ObjectRef3.element;
                            if (gzsVar4 != null) {
                                gzsVar4.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef17.element)) {
                            gzs gzsVar5 = (gzs) ref$ObjectRef5.element;
                            if (gzsVar5 != null) {
                                gzsVar5.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef19.element)) {
                            gzs gzsVar6 = (gzs) ref$ObjectRef22.element;
                            if (gzsVar6 != null) {
                                gzsVar6.invoke();
                            }
                        } else if (epx.f(bVar, ref$ObjectRef21.element)) {
                            return;
                        }
                        androidx.appcompat.app.d dVar = m;
                        if (dVar != null) {
                            dVar.dismiss();
                        }
                    }
                };
                if (m != null && (recycleListView = m.h.f) != null) {
                    recycleListView.setOnItemClickListener(onItemClickListener);
                }
                final bp50 bp50Var3 = bp50Var;
                atuVar.b.e(m, new DialogInterface.OnDismissListener() { // from class: xsna.zsu
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        bp50.this.a();
                    }
                });
            }
        }
    }

    /* compiled from: MyTargetAdStoryView.kt */
    public final class b implements aeq {
        public b() {
        }

        @Override // xsna.aeq
        public final void a(String str, String str2, String str3, boolean z) {
            ep50 ep50Var;
            StoryEntry storyEntry;
            if (jjc.d().a() || (storyEntry = (ep50Var = ep50.this).m) == null) {
                return;
            }
            if (ep50Var.t1()) {
                ep50Var.getDelegateProvider().l.g = true;
            }
            ep50Var.getStoriesBridge().o(ep50Var.getContext(), str, str2, str3, z, storyEntry);
        }
    }

    /* compiled from: MyTargetAdStoryView.kt */
    public final class d implements lv50 {
        public final View b;
        public final IconAdView c;

        public d() {
            this.b = new View(ep50.this.getContext());
            this.c = new IconAdView(ep50.this.getContext(), null);
        }

        @Override // xsna.lv50
        public final View c() {
            View subtitleView;
            StoryViewHeader headerView = ep50.this.getHeaderView();
            return (headerView == null || (subtitleView = headerView.getSubtitleView()) == null) ? this.b : subtitleView;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return ep50.this;
        }

        @Override // xsna.lv50
        public final View e() {
            StoryViewHeader headerView = ep50.this.getHeaderView();
            if (headerView != null) {
                return headerView.getMenuView();
            }
            return null;
        }

        @Override // xsna.lv50
        public final View f() {
            ImageView imageView = ep50.this.getDelegateProvider().a.C;
            return imageView != null ? imageView : this.b;
        }

        @Override // xsna.lv50
        public final View g() {
            return ep50.this.getCtaButtonView();
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return null;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return this.c;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            StoryViewHeader headerView = ep50.this.getHeaderView();
            if (headerView != null) {
                return headerView.getTitleView();
            }
            return null;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View i() {
            View subtitleView;
            StoryViewHeader headerView = ep50.this.getHeaderView();
            return (headerView == null || (subtitleView = headerView.getSubtitleView()) == null) ? this.b : subtitleView;
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return ep50.this.getDelegateProvider().a.z;
        }
    }

    public ep50(Context context, View.OnTouchListener onTouchListener, StoriesContainer storiesContainer, elm0 elm0Var, com.vk.story.api.a aVar, ac80 ac80Var, qlm0 qlm0Var, WeakReference weakReference) {
        super(context, onTouchListener, storiesContainer, elm0Var, aVar, ac80Var, qlm0Var, weakReference, 2560);
        ShimmerFrameLayout shimmerFrameLayout;
        ImageView imageView;
        int i = 2;
        x550 x550Var = new x550(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, x550Var);
        int i2 = 8;
        this.H = msy.a(lazyThreadSafetyMode, new cf00(this, i2));
        this.I = new d();
        this.J = new b();
        this.K = new c();
        this.L = new y0n(getDelegateProvider().a.C);
        MediaAdView mediaAdView = getDelegateProvider().a.z;
        if (mediaAdView != null) {
            mediaAdView.setBackground(null);
        }
        MediaAdView mediaAdView2 = getDelegateProvider().a.z;
        if (mediaAdView2 != null && (imageView = mediaAdView2.getImageView()) != null) {
            imageView.setBackgroundResource(R.color.vk_gray_850);
        }
        FrameLayout frameLayout = getDelegateProvider().a.B;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(R.color.vk_gray_850);
        }
        MediaAdView mediaAdView3 = getDelegateProvider().a.z;
        if (mediaAdView3 != null) {
            e3m.a aVar2 = e3m.a;
            mediaAdView3.setHtml5ViewBackgroundColor(context.getColor(R.color.vk_gray_850));
        }
        StoryViewHeader headerView = getHeaderView();
        int i3 = 0;
        if (headerView != null) {
            ShimmerFrameLayout shimmerFrameLayout2 = headerView.c;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
            }
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.d();
            }
            View view = headerView.d;
            if (view != null) {
                d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            d3m.e(headerView.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            View view2 = headerView.e;
            if (view2 != null) {
                d3m.c(view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            d3m.e(headerView.f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        StoryBottomViewGroup storyBottomViewGroup = getDelegateProvider().a.G;
        if (storyBottomViewGroup != null && (shimmerFrameLayout = storyBottomViewGroup.y) != null) {
            shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
            shimmerFrameLayout.d();
            d3m.c(storyBottomViewGroup.y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            d3m.e(storyBottomViewGroup.x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        StoryEntry storyEntry = this.m;
        int i4 = 1;
        int i5 = 9;
        int i6 = 10;
        if (storyEntry != null) {
            StoriesContainer storiesContainer2 = this.h;
            MyTargetAdStoriesContainer myTargetAdStoriesContainer = storiesContainer2 instanceof MyTargetAdStoriesContainer ? (MyTargetAdStoriesContainer) storiesContainer2 : null;
            if (myTargetAdStoriesContainer != null) {
                ttl0 g = getPrefetcher().g(storyEntry);
                if (g != null) {
                    w1(g, storyEntry, myTargetAdStoriesContainer);
                } else {
                    io.reactivex.rxjava3.core.a c2 = getPrefetcher().c(storyEntry, myTargetAdStoriesContainer);
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    a(c2.q(asu0.i()).o(asu0Var.d()).subscribe(new uyg(i4, myTargetAdStoriesContainer, this, storyEntry), new b8v(new kn20(this, i5), i6)));
                }
            }
        }
        io.reactivex.rxjava3.subjects.f<utl0.a> fVar = getPrefetcher().d().a;
        int i7 = 24;
        o7 o7Var = new o7(new yr00(this, i5), i7);
        fVar.getClass();
        int i8 = 11;
        int i9 = 5;
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, o7Var).subscribe(new n3t(new qz40(this, 3), i8), new ux00(new qey(15), i9)));
        io.reactivex.rxjava3.subjects.f<utl0.c.b> fVar2 = getPrefetcher().b().a;
        xb20 xb20Var = new xb20(new es00(this, i6), i9);
        fVar2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, xb20Var);
        int i10 = 4;
        a(i0Var.subscribe(new k130(new bk30(this, i10), 7), new f5y(new p7x(i6), i5)));
        io.reactivex.rxjava3.subjects.f<utl0.c.a> fVar3 = getPrefetcher().h().a;
        c8 c8Var = new c8(new o3w(this, 20), i7);
        fVar3.getClass();
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, c8Var).a0(asu0.a.d()).subscribe(new wx00(new yhu(this, i8), i10), new m330(new pqz(i2), i9)));
        io.reactivex.rxjava3.subjects.f<utl0.c.AbstractC3831c> fVar4 = getPrefetcher().e().a;
        oe40 oe40Var = new oe40(new i750(this, i), i4);
        fVar4.getClass();
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar4, oe40Var).subscribe(new cp50(new tcn(this, 27), i3), new zyu(new fo20(i9), i6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getCtaButtonView() {
        StoryBottomViewGroup storyBottomViewGroup = getDelegateProvider().a.G;
        if (storyBottomViewGroup != null) {
            return storyBottomViewGroup.findViewById(R.id.fl_link_container);
        }
        return null;
    }

    private final View getOwnerBlockView() {
        StoryViewHeader headerView = getHeaderView();
        if (headerView != null) {
            return headerView.getOwnerLayer();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final utl0 getPrefetcher() {
        return (utl0) this.G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final krl0 getStoriesBridge() {
        return (krl0) this.H.getValue();
    }

    public static void p1(ep50 ep50Var, StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
        ttl0 g = ep50Var.getPrefetcher().g(storyEntry);
        if (g == null) {
            return;
        }
        ep50Var.w1(g, storyEntry, myTargetAdStoriesContainer);
    }

    public static s3q0 q1(ep50 ep50Var, utl0.a aVar) {
        StoryEntry storyEntry;
        Integer num = aVar.a;
        View ownerBlockView = ep50Var.getOwnerBlockView();
        boolean f = epx.f(num, ownerBlockView != null ? Integer.valueOf(ownerBlockView.getId()) : null);
        Integer num2 = aVar.a;
        View ctaButtonView = ep50Var.getCtaButtonView();
        boolean f2 = epx.f(num2, ctaButtonView != null ? Integer.valueOf(ctaButtonView.getId()) : null);
        if (ep50Var.t1()) {
            iq50 iq50Var = ep50Var.getDelegateProvider().l;
            iq50Var.getClass();
            iq50Var.c(f ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_CLICK_ON_HEADER : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_CLICK_ON_CTA);
        } else if (!f && f2 && (storyEntry = ep50Var.m) != null) {
            if (ep50Var.O) {
                ep50Var.getDelegateProvider().a.i0.getDependencies().f.i(storyEntry, ep50Var.getDelegateProvider().a.i0.getViewEntryPoint(), ep50Var.P0());
                ep50Var.O = false;
            } else {
                ep50Var.getDelegateProvider().a.i0.getDependencies().f.s(storyEntry, ep50Var.getDelegateProvider().a.i0.getViewEntryPoint(), ep50Var.P0());
            }
        }
        return s3q0.a;
    }

    @Override // xsna.po6, xsna.qo6
    public final boolean X(int i, int i2) {
        int i3;
        int i4 = 0;
        if (!t1()) {
            return false;
        }
        iq50 iq50Var = getDelegateProvider().l;
        q7r q7rVar = iq50Var.a;
        if (iq50Var.d != Html5LoadState.FINISHED) {
            return true;
        }
        MediaAdView mediaAdView = q7rVar.z;
        View view = q7rVar.N;
        if (mediaAdView == null || view == null) {
            i3 = 0;
        } else {
            Rect e = f4m.e(mediaAdView);
            Rect e2 = f4m.e(view);
            int i5 = e.left - e2.left;
            i3 = e.top - e2.top;
            i4 = i5;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - 50;
        float f = i - i4;
        float f2 = i2 - i3;
        MotionEvent obtain = MotionEvent.obtain(j, j, 0, f, f2, 0);
        MotionEvent obtain2 = MotionEvent.obtain(j, currentTimeMillis, 1, f, f2, 0);
        MediaAdView mediaAdView2 = q7rVar.z;
        if (mediaAdView2 != null) {
            mediaAdView2.dispatchTouchEvent(obtain);
        }
        MediaAdView mediaAdView3 = q7rVar.z;
        if (mediaAdView3 != null) {
            mediaAdView3.dispatchTouchEvent(obtain2);
        }
        obtain.recycle();
        obtain2.recycle();
        return true;
    }

    @Override // xsna.po6
    public final void a1() {
        if (t1() && this.o) {
            return;
        }
        super.a1();
    }

    @Override // xsna.po6
    public final void d1() {
        super.d1();
        if (t1()) {
            iq50 iq50Var = getDelegateProvider().l;
            iq50Var.c.dispose();
            if (iq50Var.g) {
                return;
            }
            iq50Var.f = false;
        }
    }

    @Override // xsna.mkm0, xsna.umm0.a
    public final void g() {
        if (t1()) {
            getDelegateProvider().l.b(false);
        }
        super.g();
    }

    @Override // xsna.po6, xsna.umm0.a
    public final boolean o() {
        return super.o() && this.M != null && (!t1() || (getDelegateProvider().l.d == Html5LoadState.FINISHED && !getDelegateProvider().l.f));
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu50 zu50Var = this.N;
        if (zu50Var != null) {
            zu50Var.a();
        }
    }

    public final boolean t1() {
        StoryEntry storyEntry = this.m;
        return storyEntry != null && storyEntry.Ob();
    }

    public final void u1(zu50 zu50Var) {
        View ctaButtonView = getCtaButtonView();
        if (t1()) {
            ctaButtonView = null;
        }
        zu50Var.h(this.I, rl3.I(new View[]{ctaButtonView, getOwnerBlockView()}));
        if (t1()) {
            iq50 iq50Var = getDelegateProvider().l;
            MediaAdView mediaAdView = iq50Var.a.z;
            KeyEvent.Callback l = mediaAdView != null ? awt0.l(mediaAdView, new kdw(6)) : null;
            WebView webView = l instanceof WebView ? (WebView) l : null;
            if (webView == null) {
                tv4.b("Can't find WebView in MyTarget MediaAdView", com.vk.metrics.eventtracking.b.a);
            } else {
                webView.addJavascriptInterface(iq50Var.b, "VKMyTargetPlayableAds");
            }
        }
    }

    public final void v1(boolean z) {
        ckz0 ckz0Var;
        StoryBottomViewGroup storyBottomViewGroup;
        if (t1()) {
            iq50 iq50Var = getDelegateProvider().l;
            iq50Var.d = null;
            iq50Var.e = false;
            q7r q7rVar = iq50Var.a;
            StoryEntry currentStory = q7rVar.i0.getCurrentStory();
            if (currentStory != null && (storyBottomViewGroup = q7rVar.G) != null) {
                storyBottomViewGroup.B.m(currentStory, false);
            }
            if (!z) {
                zu50 zu50Var = this.N;
                if (zu50Var == null || (ckz0Var = zu50Var.h) == null) {
                    return;
                }
                ckz0Var.f();
                return;
            }
            zu50 zu50Var2 = this.N;
            if (zu50Var2 != null) {
                zu50Var2.a();
            }
            zu50 zu50Var3 = this.N;
            if (zu50Var3 != null) {
                u1(zu50Var3);
            }
        }
    }

    public final void w1(ttl0 ttl0Var, StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
        RecyclerView recyclerView;
        ShimmerFrameLayout shimmerFrameLayout;
        Float f;
        View menuView;
        final zu50 zu50Var = ttl0Var.a;
        this.M = myTargetAdStoriesContainer.o.get(storyEntry);
        this.N = zu50Var;
        c1(false);
        zu50Var.i(this.J);
        i620 i620Var = ttl0Var.b;
        final bp50 bp50Var = i620Var instanceof bp50 ? (bp50) i620Var : null;
        if (bp50Var == null) {
            return;
        }
        bp50Var.d = new a(getDelegateProvider(), bp50Var);
        zu50Var.r = 5;
        zu50Var.l = this.K;
        StoryViewHeader headerView = getHeaderView();
        if (headerView != null && (menuView = headerView.getMenuView()) != null) {
            menuView.setOnClickListener(new View.OnClickListener() { // from class: xsna.dp50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp50.this.c.clear();
                    zu50Var.e(this.getContext());
                }
            });
        }
        dt50 dt50Var = this.M;
        if (dt50Var != null && (f = dt50Var.i) != null) {
            float floatValue = f.floatValue();
            AspectRatioWrapperFrameLayout aspectRatioWrapperFrameLayout = getDelegateProvider().a.A;
            if (aspectRatioWrapperFrameLayout != null) {
                aspectRatioWrapperFrameLayout.setAspectRatio(floatValue);
            }
        }
        StoryViewHeader headerView2 = getHeaderView();
        if (headerView2 != null) {
            headerView2.a(storyEntry);
        }
        StoryViewHeader headerView3 = getHeaderView();
        if (headerView3 != null) {
            ShimmerFrameLayout shimmerFrameLayout2 = headerView3.c;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.a();
            }
            View view = headerView3.d;
            if (view != null) {
                d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            }
            d3m.c(headerView3.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view2 = headerView3.e;
            if (view2 != null) {
                d3m.e(view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            }
            d3m.c(headerView3.f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        StoryBottomViewGroup storyBottomViewGroup = getDelegateProvider().a.G;
        if (storyBottomViewGroup != null && (shimmerFrameLayout = storyBottomViewGroup.y) != null) {
            shimmerFrameLayout.a();
            d3m.e(storyBottomViewGroup.y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            d3m.c(storyBottomViewGroup.x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        StoryBottomViewGroup storyBottomViewGroup2 = getDelegateProvider().a.G;
        if (storyBottomViewGroup2 != null) {
            storyBottomViewGroup2.B.m(storyEntry, false);
        }
        this.L.a(this.M);
        StoryBottomViewGroup storyBottomViewGroup3 = getDelegateProvider().a.G;
        if (storyBottomViewGroup3 == null || (recyclerView = (RecyclerView) storyBottomViewGroup3.findViewById(R.id.rv_reactions_action)) == null) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (recyclerView.isLaidOut()) {
            u1(zu50Var);
        } else {
            recyclerView.addOnLayoutChangeListener(new fp50(this, zu50Var));
        }
    }

    /* compiled from: MyTargetAdStoryView.kt */
    public static final class c implements zu50.b {
        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
