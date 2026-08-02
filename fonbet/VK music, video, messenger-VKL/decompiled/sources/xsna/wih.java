package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.vjh;
import xsna.wih;

/* compiled from: CommunityProfileContentInfoItem.kt */
/* loaded from: classes5.dex */
public final class wih extends we6 {
    public final CommunityProfileContent g;
    public final wlj h;
    public final vt5 i;
    public final zih j;
    public final bjh k;
    public final io.reactivex.rxjava3.core.q<ajh> l;
    public final h7v m;
    public final boolean n;
    public final gzs<s3q0> o;
    public final gzs<s3q0> p;
    public final int q;

    public wih() {
        throw null;
    }

    public wih(CommunityProfileContent communityProfileContent, wlj wljVar, vt5 vt5Var, zih zihVar, bjh bjhVar, io.reactivex.rxjava3.core.q qVar, h7v h7vVar, fbh fbhVar, dnh dnhVar, int i) {
        fbhVar = (i & 256) != 0 ? null : fbhVar;
        dnhVar = (i & 512) != 0 ? null : dnhVar;
        this.g = communityProfileContent;
        this.h = wljVar;
        this.i = vt5Var;
        this.j = zihVar;
        this.k = bjhVar;
        this.l = qVar;
        this.m = h7vVar;
        this.n = false;
        this.o = fbhVar;
        this.p = dnhVar;
        this.q = -225;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        Context context;
        if (this.n) {
            lpj lpjVar = new lpj(viewGroup.getContext(), dhr0.C().c);
            dhr0.a.g(lpjVar);
            context = lpjVar;
        } else {
            context = viewGroup.getContext();
        }
        return new a(LayoutInflater.from(context).inflate(R.layout.item_community_full_content, viewGroup, false), this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.o, this.p);
    }

    @Override // xsna.we6
    public final int h() {
        return this.q;
    }

    /* compiled from: CommunityProfileContentInfoItem.kt */
    public static final class a extends vif0<wih> implements CommunityProfileTabsContainerLayout.b {
        public final VkTabs A;
        public final View B;
        public final dhq C;
        public final List<Integer> D;
        public final List<Integer> E;
        public boolean F;
        public boolean G;
        public final CommunityProfileContent n;
        public final vt5 o;
        public final zih p;
        public final bjh q;
        public final h7v r;
        public final gzs<s3q0> s;
        public final gzs<s3q0> t;
        public final io.reactivex.rxjava3.disposables.g u;
        public int v;
        public final CommunityProfileTabsContainerLayout w;
        public CommunityProfileContentItem x;
        public final vjh y;
        public final ViewPager2 z;

        /* compiled from: CommunityProfileContentInfoItem.kt */
        /* renamed from: xsna.wih$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC3935a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ io.reactivex.rxjava3.core.q<ajh> c;

            public ViewOnAttachStateChangeListenerC3935a(io.reactivex.rxjava3.core.q<ajh> qVar) {
                this.c = qVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                a aVar = a.this;
                aVar.u.b(this.c.subscribe(new cz(new mre(aVar, 8), 18)));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                a.this.u.b(null);
            }
        }

        /* compiled from: CommunityProfileContentInfoItem.kt */
        public final class b extends ViewPager2.g {
            public int d = -1;
            public boolean e;

            public b() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public final void onPageScrollStateChanged(int i) {
                a aVar = a.this;
                vjh vjhVar = aVar.y;
                ViewPager2 viewPager2 = aVar.z;
                super.onPageScrollStateChanged(i);
                if (i == 1) {
                    aVar.C.g(null);
                }
                if (i == 0) {
                    if (this.e) {
                        vjhVar.A0(viewPager2.getCurrentItem(), true);
                        if (aVar.F) {
                            aVar.q6(viewPager2.getCurrentItem());
                        }
                        this.e = false;
                    }
                    RecyclerView recyclerView = vjhVar.e;
                    Object findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(viewPager2.getCurrentItem()) : null;
                    wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
                    if (wjhVar != null) {
                        wjhVar.a6();
                    }
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public final void onPageScrolled(int i, float f, int i2) {
                a aVar = a.this;
                vjh vjhVar = aVar.y;
                CommunityProfileContentItem x0 = vjhVar.x0(i);
                Integer valueOf = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Integer.valueOf(i + 1) : f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Integer.valueOf(i - 1) : null;
                CommunityProfileContentItem x02 = valueOf != null ? vjhVar.x0(valueOf.intValue()) : null;
                aVar.C.n(x0 != null ? a.v6(x0) : null, x02 != null ? a.v6(x02) : null, Float.valueOf(Math.abs(f)));
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public final void onPageSelected(int i) {
                a aVar = a.this;
                bjh bjhVar = aVar.q;
                vjh vjhVar = aVar.y;
                CommunityProfileContentItem x0 = vjhVar.x0(i);
                if (x0 == null) {
                    return;
                }
                int i2 = this.d;
                if (i2 != i) {
                    CommunityProfileContentItem x02 = vjhVar.x0(i2);
                    if (x02 != null) {
                        bjhVar.k(x02, x0);
                    }
                    int i3 = this.d;
                    if (i3 == -1) {
                        vjhVar.A0(i, true);
                    } else {
                        vjhVar.A0(i3, false);
                    }
                    if (Math.abs(i - this.d) != 1) {
                        aVar.z.postDelayed(new xih(aVar, i, 0), 50L);
                    }
                    this.e = true;
                    this.d = i;
                }
                bjhVar.l(x0, false);
                if (Math.abs(i - i2) <= 1 || !aVar.F) {
                    return;
                }
                aVar.q6(i);
            }
        }

        /* compiled from: CommunityProfileContentInfoItem.kt */
        public static final /* synthetic */ class c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CommunityProfileContentItem.State.values().length];
                try {
                    iArr[CommunityProfileContentItem.State.LOADED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CommunityProfileContentItem.State.EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CommunityProfileContentItem.State.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CommunityProfileContentItem.State.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CommunityProfileContentItem.State.INITIAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CommunityProfileContentItem.State.RELOAD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: CommunityProfileContentInfoItem.kt */
        public static final class d implements vjh.b {
            public d() {
            }

            @Override // xsna.vjh.b
            public final void a(CommunityProfileContentItem communityProfileContentItem) {
                a.this.q.a(communityProfileContentItem);
            }

            @Override // xsna.vjh.b
            public final void b(int i) {
                a aVar = a.this;
                aVar.A3(aVar.w.getTop(), i);
            }

            @Override // xsna.vjh.b
            public final void c(CommunityProfileContentItem communityProfileContentItem) {
                a.this.q.f(communityProfileContentItem);
            }

            @Override // xsna.vjh.b
            public final void d(CommunityProfileContentItem communityProfileContentItem) {
                a aVar = a.this;
                if (epx.f(aVar.x, communityProfileContentItem)) {
                    return;
                }
                aVar.x = communityProfileContentItem;
                aVar.q.d(communityProfileContentItem);
            }

            @Override // xsna.vjh.b
            public final void e(CommunityProfileContentItem communityProfileContentItem) {
                a.this.q.c(communityProfileContentItem);
            }

            @Override // xsna.vjh.b
            public final void f(CommunityProfileContentItem communityProfileContentItem) {
                a.this.q.e(communityProfileContentItem);
            }

            @Override // xsna.vjh.b
            public final void g(CommunityProfileContentItem communityProfileContentItem) {
                a.this.q.m(communityProfileContentItem);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(View view, wlj wljVar, CommunityProfileContent communityProfileContent, vt5 vt5Var, zih zihVar, bjh bjhVar, io.reactivex.rxjava3.core.q<ajh> qVar, h7v h7vVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            super(view);
            this.n = communityProfileContent;
            this.o = vt5Var;
            this.p = zihVar;
            this.q = bjhVar;
            this.r = h7vVar;
            this.s = gzsVar;
            this.t = gzsVar2;
            this.u = new io.reactivex.rxjava3.disposables.g();
            this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3935a(qVar));
            CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = (CommunityProfileTabsContainerLayout) view.findViewById(R.id.vp_community_profile_content_layout);
            this.w = communityProfileTabsContainerLayout;
            vjh vjhVar = new vjh(wljVar, new d());
            vjhVar.submitList(communityProfileContent.b);
            this.y = vjhVar;
            b bVar = new b();
            ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.community_profile_vp_content);
            viewPager2.setOrientation(0);
            viewPager2.setAdapter(vjhVar);
            RecyclerView recyclerView = vjhVar.e;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            viewPager2.b(bVar);
            this.z = viewPager2;
            VkTabs vkTabs = (VkTabs) view.findViewById(R.id.community_profile_tabs);
            this.A = vkTabs;
            View findViewById = view.findViewById(R.id.community_profile_fab);
            this.B = findViewById;
            dhq dhqVar = (dhq) findViewById;
            dhqVar.setOnLeftButtonClicked(new ire(this, 7));
            dhqVar.setOnRightButtonClicked(new pcg(this, 5));
            dhqVar.setOnGrowthTrapButtonClick(new sje(this, 8));
            dhqVar.setOnGrowthTrapButtonShown(new cwg(this, 3));
            this.C = dhqVar;
            this.D = e43.l(1, -1, 2, -2);
            this.E = e43.l(1, -1);
            communityProfileTabsContainerLayout.setPager(viewPager2);
            communityProfileTabsContainerLayout.setPagerAdapter(vjhVar);
            communityProfileTabsContainerLayout.setTabLayoutHolder(this);
            communityProfileTabsContainerLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.uih
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (i2 != i6) {
                        wih.a.this.B.setTranslationY(-i2);
                    }
                }
            });
            new com.vk.core.view.components.tabs.e(vkTabs, viewPager2, false, new yih(this)).a();
            s6(vkTabs, communityProfileContent.e);
            CommunityProfileContent.InitialPosition initialPosition = communityProfileContent.g;
            if (initialPosition != null) {
                viewPager2.e(initialPosition.a, false);
            }
        }

        public static ProfileFabState v6(CommunityProfileContentItem communityProfileContentItem) {
            ProfileFabState.State state;
            com.vk.profile.core.tabs.state.b bVar;
            com.vk.profile.core.tabs.state.b bVar2;
            com.vk.profile.core.tabs.state.a aVar;
            int i = communityProfileContentItem.h;
            switch (c.$EnumSwitchMapping$0[communityProfileContentItem.f().ordinal()]) {
                case 1:
                    state = ProfileFabState.State.LOADED;
                    break;
                case 2:
                    state = ProfileFabState.State.EMPTY;
                    break;
                case 3:
                    state = ProfileFabState.State.LOADING;
                    break;
                case 4:
                    state = ProfileFabState.State.ERROR;
                    break;
                case 5:
                    state = ProfileFabState.State.INITIAL;
                    break;
                case 6:
                    state = ProfileFabState.State.RELOAD;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CommunityProfileContentItem.d c2 = communityProfileContentItem.c();
            dwd0 dwd0Var = null;
            cwd0 cwd0Var = (c2 == null || (aVar = c2.a) == null) ? null : new cwd0(aVar.a, aVar.b, aVar.c);
            CommunityProfileContentItem.d c3 = communityProfileContentItem.c();
            dwd0 dwd0Var2 = (c3 == null || (bVar2 = c3.b) == null) ? null : new dwd0(bVar2.a);
            CommunityProfileContentItem.d c4 = communityProfileContentItem.c();
            if (c4 != null && (bVar = c4.c) != null) {
                dwd0Var = new dwd0(bVar.a);
            }
            return new ProfileFabState(i, state, cwd0Var, dwd0Var2, dwd0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.profile.tool.view.CommunityProfileTabsContainerLayout.b
        public final void A3(int i, int i2) {
            float f = -i;
            bjh bjhVar = this.q;
            float i3 = bjhVar.i() + f;
            if (i3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i3 = 0.0f;
            }
            CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = this.w;
            float height = (communityProfileTabsContainerLayout.getHeight() - i) / communityProfileTabsContainerLayout.getHeight();
            this.B.setTranslationY(f);
            ViewPager2 viewPager2 = this.z;
            viewPager2.setTranslationY(i3);
            f4m.v((int) i3, viewPager2);
            this.A.setTranslationY(i3);
            if (bjhVar.i() + f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ((wih) this.m).a = 1;
            } else {
                ((wih) this.m).a = 2;
            }
            dhq dhqVar = this.C;
            if (i2 != 0) {
                dhqVar.c(Boolean.TRUE, Boolean.valueOf(i2 < 0), Float.valueOf(height));
            } else {
                dhq.f(dhqVar, null, Float.valueOf(height), 3);
            }
        }

        @Override // xsna.vif0
        public final void i6(wih wihVar) {
            wih wihVar2 = wihVar;
            this.x = null;
            CommunityProfileContent communityProfileContent = wihVar2.g;
            List<CommunityProfileContentItem> list = communityProfileContent.b;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            int size = list.size();
            vjh vjhVar = this.y;
            boolean z = size != vjhVar.getItemCount();
            ref$BooleanRef.element = z;
            if (!z) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) obj;
                    CommunityProfileContentItem communityProfileContentItem2 = (CommunityProfileContentItem) j5g.b0(i, vjhVar.getCurrentList());
                    if (communityProfileContentItem2 == null || communityProfileContentItem2.h != communityProfileContentItem.h) {
                        ref$BooleanRef.element = true;
                    }
                    i = i2;
                }
            }
            CommunityProfileContent.InitialPosition initialPosition = communityProfileContent.g;
            Integer valueOf = initialPosition != null ? Integer.valueOf(initialPosition.a) : null;
            CommunityProfileContentItem communityProfileContentItem3 = (CommunityProfileContentItem) j5g.b0(valueOf != null ? valueOf.intValue() : 0, vjhVar.getCurrentList());
            CommunityProfileContentItem communityProfileContentItem4 = (CommunityProfileContentItem) j5g.b0(valueOf != null ? valueOf.intValue() : 0, list);
            if (this.z.isAttachedToWindow() && communityProfileContentItem3 != null && communityProfileContentItem4 != null && communityProfileContentItem4.h == communityProfileContentItem3.h && communityProfileContentItem4.f() == CommunityProfileContentItem.State.INITIAL) {
                this.q.l(communityProfileContentItem4, true);
            }
            CommunityProfileContentItem communityProfileContentItem5 = (CommunityProfileContentItem) j5g.b0(0, vjhVar.getCurrentList());
            CommunityProfileContentItem communityProfileContentItem6 = (CommunityProfileContentItem) j5g.b0(0, list);
            if (communityProfileContentItem5 != null && (communityProfileContentItem6 == null || communityProfileContentItem6.h != communityProfileContentItem5.h)) {
                List<CommunityProfileContentItem> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((CommunityProfileContentItem) it.next()).f() == CommunityProfileContentItem.State.RELOAD) {
                            break;
                        }
                    }
                }
                vjhVar.submitList(null);
            }
            vjhVar.submitList(list, new rih(ref$BooleanRef, this, wihVar2, 0));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void q6(int i) {
            List<Integer> list;
            Iterator<Integer> it;
            if (fkq0.b(this.n.a)) {
                ComFeatures comFeatures = ComFeatures.COM_CONTENT_FOR_TAB_OPTIMIZE;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures)) {
                    upu b2 = com.vk.toggle.d.J0.b();
                    if (b2 == null) {
                        upu.c.getClass();
                        b2 = upu.d;
                    }
                    if (b2.a) {
                        list = this.E;
                        it = list.iterator();
                        while (it.hasNext()) {
                            CommunityProfileContentItem x0 = this.y.x0(it.next().intValue() + i);
                            if (x0 != null) {
                                this.q.j(x0);
                            }
                        }
                    }
                }
            }
            list = this.D;
            it = list.iterator();
            while (it.hasNext()) {
            }
        }

        public final void s6(VkTabs vkTabs, boolean z) {
            vkTabs.setFixedIcon(z ? new wmr(krv0.f(R.drawable.vk_icon_gear_outline_20, R.attr.vk_ui_icon_medium, this.itemView.getContext()), this.itemView.getContext().getString(R.string.profile_content_accessibility_options_button), new zqf(this, 4)) : null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            if (com.vk.toggle.b.A.a(r0) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            r7.Q4(xsna.cn70.b(20), true, java.lang.Integer.valueOf(r2.h().intValue()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            if (r0.b() == false) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void t6(VkTabs.c cVar, final int i) {
            CommunityProfileContentItem x0 = this.y.x0(i);
            ContentTab contentTab = x0 != null ? x0.a : null;
            com.vk.core.view.components.tabs.d dVar = cVar.a;
            com.vk.core.view.components.tabs.d dVar2 = cVar.a;
            if (contentTab == null) {
                return;
            }
            CommunityProfileContentItem.e e2 = x0.e();
            if (e2 != null) {
                dVar.addOnAttachStateChangeListener(new e(dVar, e2, x0));
            }
            Integer d2 = contentTab.d();
            if (d2 != null) {
                dVar2.setText(d2.intValue());
            }
            CommunityProfileContent communityProfileContent = this.n;
            if (fkq0.b(communityProfileContent.a)) {
                ComFeatures comFeatures = ComFeatures.COM_MAIN_TAB;
                comFeatures.getClass();
            }
            dVar.setOnClickListener(new View.OnClickListener() { // from class: xsna.vih
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommunityProfileContent communityProfileContent2;
                    List<CommunityProfileContentItem> list;
                    CommunityProfileContentItem communityProfileContentItem;
                    wih.a aVar = wih.a.this;
                    T t = aVar.m;
                    ViewPager2 viewPager2 = aVar.z;
                    wih wihVar = (wih) t;
                    int i2 = i;
                    if (wihVar != null && (communityProfileContent2 = wihVar.g) != null && (list = communityProfileContent2.b) != null && (communityProfileContentItem = (CommunityProfileContentItem) j5g.b0(i2, list)) != null) {
                        aVar.C.g(wih.a.v6(communityProfileContentItem));
                    }
                    viewPager2.e(i2, Math.abs(viewPager2.getCurrentItem() - i2) == 1);
                }
            });
            dVar.setOnLongClickListener(null);
        }

        /* compiled from: CommunityProfileContentInfoItem.kt */
        public static final class e implements View.OnAttachStateChangeListener {
            public final /* synthetic */ com.vk.core.view.components.tabs.d c;
            public final /* synthetic */ CommunityProfileContentItem.e d;
            public final /* synthetic */ CommunityProfileContentItem e;

            public e(com.vk.core.view.components.tabs.d dVar, CommunityProfileContentItem.e eVar, CommunityProfileContentItem communityProfileContentItem) {
                this.c = dVar;
                this.d = eVar;
                this.e = communityProfileContentItem;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                a aVar = a.this;
                View view2 = aVar.itemView;
                CommunityProfileContentItem.e eVar = this.d;
                CommunityProfileContentItem communityProfileContentItem = this.e;
                com.vk.core.view.components.tabs.d dVar = this.c;
                bwt0.n(dVar, new tih(aVar, eVar, communityProfileContentItem, view2, dVar, this));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
