package xsna;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.DisclaimerType;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.h7u0;
import xsna.p4g;
import xsna.skm0;

/* compiled from: MyTargetInternalAdStoryView.kt */
/* loaded from: classes6.dex */
public final class kq50 extends mkm0 {
    public final Object G;
    public final Object H;
    public final b I;
    public cjx J;

    /* compiled from: MyTargetInternalAdStoryView.kt */
    public final class a implements weq {
        public a() {
        }

        @Override // xsna.weq
        public final boolean c(String str, List<String> list) {
            kq50 kq50Var = kq50.this;
            StoryEntry storyEntry = kq50Var.m;
            if (storyEntry == null) {
                return false;
            }
            p4g.a aVar = p4g.a;
            if (!p4g.b(list, rl3.u0(new String[]{"vk", "lead_form", "vk_miniapp"}))) {
                return false;
            }
            kq50Var.getStoriesBridge().o(kq50Var.getContext(), null, null, str, false, storyEntry);
            return true;
        }
    }

    /* compiled from: MyTargetInternalAdStoryView.kt */
    public final class b implements vix {

        /* compiled from: MyTargetInternalAdStoryView.kt */
        public static final class a implements zgx {
            public final /* synthetic */ kq50 a;

            public a(kq50 kq50Var) {
                this.a = kq50Var;
            }
        }

        public b() {
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return kq50.this;
        }

        @Override // xsna.vix
        public final zgx b() {
            return new a(kq50.this);
        }
    }

    public kq50(Context context, View.OnTouchListener onTouchListener, StoriesContainer storiesContainer, elm0 elm0Var, com.vk.story.api.a aVar, ac80 ac80Var, qlm0 qlm0Var, WeakReference weakReference) {
        super(context, onTouchListener, storiesContainer, elm0Var, aVar, ac80Var, qlm0Var, weakReference, 2560);
        RecyclerView recyclerView;
        View menuView;
        s1x s1xVar = new s1x(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, s1xVar);
        this.H = msy.a(lazyThreadSafetyMode, new tzv(this, 16));
        this.I = new b();
        a aVar2 = new a();
        y0n y0nVar = new y0n(getDelegateProvider().a.C);
        StoryEntry storyEntry = this.m;
        if (storyEntry == null) {
            return;
        }
        StoriesContainer storiesContainer2 = this.h;
        MyTargetAdStoriesContainer myTargetAdStoriesContainer = storiesContainer2 instanceof MyTargetAdStoriesContainer ? (MyTargetAdStoriesContainer) storiesContainer2 : null;
        if (myTargetAdStoriesContainer == null) {
            return;
        }
        final gjx gjxVar = myTargetAdStoriesContainer.p.get(storyEntry);
        if (gjxVar == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("internalNativeBanner is null"));
            return;
        }
        final fkz0 b2 = getInternalNativeAdFactory().b(gjxVar);
        this.J = b2;
        getDelegateProvider().k.a = b2;
        b2.m(aVar2);
        StoryViewHeader headerView = getHeaderView();
        if (headerView != null && (menuView = headerView.getMenuView()) != null) {
            menuView.setOnClickListener(new View.OnClickListener() { // from class: xsna.jq50
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [T, xsna.skm0$b$a$a] */
                /* JADX WARN: Type inference failed for: r0v4, types: [T, xsna.i66] */
                /* JADX WARN: Type inference failed for: r10v17, types: [T, xsna.skm0$b$a$b] */
                /* JADX WARN: Type inference failed for: r10v18, types: [T, xsna.p210] */
                /* JADX WARN: Type inference failed for: r12v7, types: [T, kotlin.jvm.internal.FunctionReferenceImpl] */
                /* JADX WARN: Type inference failed for: r13v12, types: [T, xsna.skm0$b$b$a] */
                /* JADX WARN: Type inference failed for: r2v13, types: [T, xsna.skm0$b$a$g] */
                /* JADX WARN: Type inference failed for: r2v14, types: [T, com.vk.im.video.f] */
                /* JADX WARN: Type inference failed for: r2v18, types: [T, xsna.skm0$b$a$c] */
                /* JADX WARN: Type inference failed for: r4v12, types: [T, xsna.nkm0] */
                /* JADX WARN: Type inference failed for: r7v7, types: [T, xsna.skm0$b$a$d] */
                /* JADX WARN: Type inference failed for: r7v8, types: [T, xsna.ew3] */
                /* JADX WARN: Type inference failed for: r8v12, types: [T, xsna.skm0$b$a$e] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dt50 dt50Var;
                    skm0.b.a.f fVar;
                    Object obj;
                    Object obj2;
                    final Ref$ObjectRef ref$ObjectRef;
                    Object obj3;
                    final Ref$ObjectRef ref$ObjectRef2;
                    Object obj4;
                    final Ref$ObjectRef ref$ObjectRef3;
                    Object obj5;
                    Ref$ObjectRef ref$ObjectRef4;
                    final Ref$ObjectRef ref$ObjectRef5;
                    Object obj6;
                    Ref$ObjectRef ref$ObjectRef6;
                    Ref$ObjectRef ref$ObjectRef7;
                    AlertController.RecycleListView recycleListView;
                    String str;
                    atu atuVar = kq50.this.getDelegateProvider().e;
                    egz0 c = gjxVar.c();
                    StoryEntry currentStory = atuVar.a.i0.getCurrentStory();
                    if (currentStory == null) {
                        return;
                    }
                    StoriesContainer storiesContainer3 = atuVar.a.i0.getStoriesContainer();
                    if ((storiesContainer3 instanceof MyTargetAdStoriesContainer) && (dt50Var = ((MyTargetAdStoriesContainer) storiesContainer3).o.get(currentStory)) != null) {
                        Context context2 = atuVar.a.i0.getContext();
                        dhr0.a.getClass();
                        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, dhr0.u().c);
                        h7u0.a aVar3 = new h7u0.a(contextThemeWrapper);
                        final skm0 skm0Var = atuVar.e;
                        final mkm0 mkm0Var = atuVar.a.j0;
                        final f0q0 f0q0Var = atuVar.b;
                        skm0Var.getClass();
                        List list = c != null ? c.b : null;
                        if (list == null) {
                            list = EmptyList.b;
                        }
                        final List list2 = list;
                        skm0.b.a.f fVar2 = new skm0.b.a.f(contextThemeWrapper.getString(R.string.menu_settings));
                        final wkm0 wkm0Var = new wkm0(0, mkm0Var, skm0.a.class, "openStoriesSettings", "openStoriesSettings()V", 0);
                        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                fVar = fVar2;
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                fVar = fVar2;
                                if (epx.f(((ajx) obj).getType(), "hide")) {
                                    break;
                                } else {
                                    fVar2 = fVar;
                                }
                            }
                        }
                        ajx ajxVar = (ajx) obj;
                        final cjx cjxVar = b2;
                        if (ajxVar != null) {
                            ref$ObjectRef8.element = new skm0.b.a.c(contextThemeWrapper.getString(R.string.story_not_interesting_ad));
                            ref$ObjectRef9.element = new gzs() { // from class: xsna.nkm0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    skm0.this.getClass();
                                    or1 or1Var = new or1(contextThemeWrapper);
                                    List list4 = list2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj7 : list4) {
                                        if (epx.f(((ajx) obj7).getType(), "hide")) {
                                            arrayList.add(obj7);
                                        }
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        final ajx ajxVar2 = (ajx) it2.next();
                                        String title = ajxVar2.getTitle();
                                        final cjx cjxVar2 = cjxVar;
                                        final skm0.a aVar4 = mkm0Var;
                                        or1Var.b(new Runnable() { // from class: xsna.rkm0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                cjx.this.b(ajxVar2);
                                                aVar4.F0();
                                            }
                                        }, title);
                                    }
                                    f0q0Var.e(or1Var.d(), null);
                                    return s3q0.a;
                                }
                            };
                        }
                        final Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it2.next();
                                if (epx.f(((ajx) obj2).b(), "show_advertiser_info")) {
                                    break;
                                }
                            }
                        }
                        ajx ajxVar2 = (ajx) obj2;
                        if (ajxVar2 != null) {
                            ref$ObjectRef10.element = new skm0.b.a.g(contextThemeWrapper.getString(R.string.story_show_advertiser_info));
                            ref$ObjectRef11.element = new com.vk.im.video.f(cjxVar, ajxVar2, mkm0Var, 3);
                        }
                        final Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef13 = new Ref$ObjectRef();
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                ref$ObjectRef = ref$ObjectRef11;
                                obj3 = null;
                                break;
                            } else {
                                obj3 = it3.next();
                                ref$ObjectRef = ref$ObjectRef11;
                                if (epx.f(((ajx) obj3).b(), "ad_marker_template")) {
                                    break;
                                } else {
                                    ref$ObjectRef11 = ref$ObjectRef;
                                }
                            }
                        }
                        ajx ajxVar3 = (ajx) obj3;
                        if (ajxVar3 != null) {
                            ref$ObjectRef12.element = new skm0.b.a.C3670a(ajxVar3.getTitle());
                            ref$ObjectRef13.element = new i66(cjxVar, ajxVar3, mkm0Var, 3);
                        }
                        final Ref$ObjectRef ref$ObjectRef14 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef15 = new Ref$ObjectRef();
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                ref$ObjectRef2 = ref$ObjectRef13;
                                obj4 = null;
                                break;
                            }
                            obj4 = it4.next();
                            ref$ObjectRef2 = ref$ObjectRef13;
                            Iterator it5 = it4;
                            if (epx.f(((ajx) obj4).b(), "ads_recommendations_info")) {
                                break;
                            }
                            it4 = it5;
                            ref$ObjectRef13 = ref$ObjectRef2;
                        }
                        ajx ajxVar4 = (ajx) obj4;
                        if (ajxVar4 != null) {
                            ref$ObjectRef14.element = new skm0.b.a.d(contextThemeWrapper.getString(R.string.story_show_recommendations_info));
                            ref$ObjectRef15.element = new ew3(21, cjxVar, ajxVar4);
                        }
                        final Ref$ObjectRef ref$ObjectRef16 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef17 = new Ref$ObjectRef();
                        Iterator it6 = list3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                ref$ObjectRef3 = ref$ObjectRef15;
                                obj5 = null;
                                break;
                            }
                            obj5 = it6.next();
                            ref$ObjectRef3 = ref$ObjectRef15;
                            Iterator it7 = it6;
                            if (epx.f(((ajx) obj5).b(), "ads_copy_url")) {
                                break;
                            }
                            it6 = it7;
                            ref$ObjectRef15 = ref$ObjectRef3;
                        }
                        ajx ajxVar5 = (ajx) obj5;
                        if (ajxVar5 != null) {
                            ref$ObjectRef4 = ref$ObjectRef8;
                            ref$ObjectRef16.element = new skm0.b.a.C3671b(contextThemeWrapper.getString(R.string.story_actions_copy_url));
                            ref$ObjectRef17.element = new p210(cjxVar, ajxVar5, mkm0Var, 3);
                        } else {
                            ref$ObjectRef4 = ref$ObjectRef8;
                        }
                        final Ref$ObjectRef ref$ObjectRef18 = new Ref$ObjectRef();
                        final Ref$ObjectRef ref$ObjectRef19 = new Ref$ObjectRef();
                        Iterator it8 = list3.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                ref$ObjectRef5 = ref$ObjectRef17;
                                obj6 = null;
                                break;
                            } else {
                                obj6 = it8.next();
                                ref$ObjectRef5 = ref$ObjectRef17;
                                if (epx.f(((ajx) obj6).getType(), "complain")) {
                                    break;
                                } else {
                                    ref$ObjectRef17 = ref$ObjectRef5;
                                }
                            }
                        }
                        if (((ajx) obj6) != null) {
                            ref$ObjectRef18.element = new skm0.b.a.e(contextThemeWrapper.getString(R.string.report_content));
                            ref$ObjectRef6 = ref$ObjectRef9;
                            ref$ObjectRef7 = ref$ObjectRef4;
                            ref$ObjectRef19.element = new vkm0(0, mkm0Var, skm0.a.class, "reportContent", "reportContent()V", 0);
                        } else {
                            ref$ObjectRef6 = ref$ObjectRef9;
                            ref$ObjectRef7 = ref$ObjectRef4;
                        }
                        final Ref$ObjectRef ref$ObjectRef20 = new Ref$ObjectRef();
                        if (dt50Var.f == DisclaimerType.DECLARATION && (str = dt50Var.g) != null) {
                            ref$ObjectRef20.element = new skm0.b.AbstractC3672b.a(str);
                        }
                        final skm0.c cVar = new skm0.c(contextThemeWrapper, rl3.I(new skm0.b[]{fVar, ref$ObjectRef7.element, ref$ObjectRef10.element, ref$ObjectRef12.element, ref$ObjectRef14.element, ref$ObjectRef16.element, ref$ObjectRef18.element, ref$ObjectRef20.element}));
                        aVar3.R(cVar, null);
                        final androidx.appcompat.app.d m = aVar3.m();
                        final skm0.b.a.f fVar3 = fVar;
                        final Ref$ObjectRef ref$ObjectRef21 = ref$ObjectRef6;
                        final Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef7;
                        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: xsna.qkm0
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                                skm0.b bVar = skm0.c.this.c.get(i);
                                if (epx.f(bVar, fVar3)) {
                                    wkm0Var.invoke();
                                } else if (epx.f(bVar, ref$ObjectRef22.element)) {
                                    gzs gzsVar = (gzs) ref$ObjectRef21.element;
                                    if (gzsVar != null) {
                                        gzsVar.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef10.element)) {
                                    gzs gzsVar2 = (gzs) ref$ObjectRef.element;
                                    if (gzsVar2 != null) {
                                        gzsVar2.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef14.element)) {
                                    gzs gzsVar3 = (gzs) ref$ObjectRef3.element;
                                    if (gzsVar3 != null) {
                                        gzsVar3.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef12.element)) {
                                    gzs gzsVar4 = (gzs) ref$ObjectRef2.element;
                                    if (gzsVar4 != null) {
                                        gzsVar4.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef16.element)) {
                                    gzs gzsVar5 = (gzs) ref$ObjectRef5.element;
                                    if (gzsVar5 != null) {
                                        gzsVar5.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef18.element)) {
                                    gzs gzsVar6 = (gzs) ref$ObjectRef19.element;
                                    if (gzsVar6 != null) {
                                        gzsVar6.invoke();
                                    }
                                } else if (epx.f(bVar, ref$ObjectRef20.element)) {
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
                        atuVar.b.e(m, null);
                    }
                }
            });
        }
        StoryViewHeader headerView2 = getHeaderView();
        if (headerView2 != null) {
            headerView2.a(storyEntry);
        }
        StoryBottomViewGroup storyBottomViewGroup = getDelegateProvider().a.G;
        if (storyBottomViewGroup != null) {
            storyBottomViewGroup.B.m(storyEntry, false);
        }
        y0nVar.a(myTargetAdStoriesContainer.o.get(storyEntry));
        c1(false);
        StoryBottomViewGroup storyBottomViewGroup2 = getDelegateProvider().a.G;
        if (storyBottomViewGroup2 == null || (recyclerView = (RecyclerView) storyBottomViewGroup2.findViewById(R.id.rv_reactions_action)) == null) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (recyclerView.isLaidOut()) {
            q1(this);
        } else {
            recyclerView.addOnLayoutChangeListener(new lq50(this));
        }
    }

    private final View getCtaButtonView() {
        StoryBottomViewGroup storyBottomViewGroup = getDelegateProvider().a.G;
        if (storyBottomViewGroup != null) {
            return storyBottomViewGroup.findViewById(R.id.fl_link_container);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final yix getInternalNativeAdFactory() {
        return (yix) this.G.getValue();
    }

    private final View getOwnerBlockView() {
        StoryViewHeader headerView = getHeaderView();
        if (headerView != null) {
            return headerView.getOwnerLayer();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final krl0 getStoriesBridge() {
        return (krl0) this.H.getValue();
    }

    public static final void q1(kq50 kq50Var) {
        cjx cjxVar = kq50Var.J;
        if (cjxVar != null) {
            cjxVar.q(kq50Var.I);
        }
        View ownerBlockView = kq50Var.getOwnerBlockView();
        if (ownerBlockView != null) {
            bwt0.i0(ownerBlockView, new mgz(kq50Var, 14));
        }
        View ctaButtonView = kq50Var.getCtaButtonView();
        if (ctaButtonView != null) {
            bwt0.i0(ctaButtonView, new lw20(kq50Var, 8));
        }
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegateProvider().k.a = null;
        cjx cjxVar = this.J;
        b bVar = this.I;
        if (cjxVar != null) {
            cjxVar.f(bVar);
        }
        this.J = null;
        getInternalNativeAdFactory().a(bVar);
    }

    public final void r1() {
        View ctaButtonView = getCtaButtonView();
        if (ctaButtonView != null) {
            cjx cjxVar = this.J;
            if (cjxVar != null) {
                cjxVar.p(ctaButtonView, NativeAdContent.ViewTag.CTA);
            }
            s1(true);
        }
    }

    public final void s1(boolean z) {
        StoryEntry storyEntry = this.m;
        if (storyEntry == null) {
            return;
        }
        if (z) {
            getDelegateProvider().a.i0.getDependencies().f.i(storyEntry, getDelegateProvider().a.i0.getViewEntryPoint(), P0());
        } else {
            getDelegateProvider().a.i0.getDependencies().f.s(storyEntry, getDelegateProvider().a.i0.getViewEntryPoint(), P0());
        }
    }
}
