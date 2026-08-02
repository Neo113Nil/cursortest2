package xsna;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.FrameLayoutWithTouchInterceptor;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.home.HomeFragment2;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.music.fragment.impl.MusicContainerFragment;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.navigation.NavigationDelegateBottom$receiver$1;
import com.vk.navigation.SwipableTabsView;
import com.vk.network.kbh.state.NetworkState;
import com.vk.newsfeed.common.util.NewsfeedViewPostCache;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stat.scheme.SchemeStat$TypeNavigationTabClick;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggestApplyState;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.toggle.Features;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.auto.MusicAndroidAutoMediaService;
import com.vkontakte.android.fragments.SettingsListFragment;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.grishka.appkit.fragments.AppKitFragment;
import ru.ok.android.utils.Logger;
import xsna.aes;
import xsna.des;
import xsna.g620;
import xsna.gzp0;
import xsna.hfl0;
import xsna.hg1;
import xsna.iah0;
import xsna.iut0;
import xsna.k840;
import xsna.nx50;
import xsna.oz50;
import xsna.qmg0;
import xsna.r7v;
import xsna.v6j;
import xsna.vbs;
import xsna.wp80;
import xsna.xbs;

/* compiled from: NavigationDelegateBottom.kt */
/* loaded from: classes.dex */
public final class nx50<T extends AppCompatActivity & xbs> extends ni6<T> implements FitSystemWindowsFrameLayout.d, BottomNavigationView.a, g0m0, ViewPager.j, kcs, hsx0 {
    public static LinkedHashMap Q0 = b68.f();
    public View A;
    public final Object A0;
    public View B;
    public final Object B0;
    public SwipableTabsView C;
    public final Object C0;
    public tib D;
    public final Object D0;
    public Integer E;
    public final Object E0;
    public int F;
    public final Object F0;
    public final LinkedHashSet<i48> G;
    public final Object G0;
    public final WeakHashMap<Fragment, WeakReference<Lifecycle>> H;
    public final Object H0;
    public Integer I;
    public final qot0 I0;
    public int J;
    public final Object J0;
    public boolean K;
    public mz50 K0;
    public boolean L;
    public VkContextMenu L0;
    public boolean M;
    public final NavigationDelegateBottom$receiver$1 M0;
    public boolean N;
    public final px50 N0;
    public int O;
    public boolean O0;
    public final Object P;
    public final qx50 P0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final r7v a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final jst0 o;
    public final hfl0 o0;
    public final vbs p;
    public final f8v0 p0;
    public final rx50 q;

    @SuppressLint({"HandlerLeak"})
    public final wx50 q0;
    public final bpn0 r;
    public final yy80 r0;
    public final int s;
    public int s0;
    public final bpn0 t;
    public FitSystemWindowsFragmentWrapperFrameLayout t0;
    public final bpn0 u;
    public FitSystemWindowsFrameLayout u0;
    public FitSystemWindowsFragmentWrapperFrameLayout v;
    public qmg0 v0;
    public FrameLayoutWithTouchInterceptor w;
    public b w0;
    public FitSystemWindowsFrameLayout x;
    public final io.reactivex.rxjava3.disposables.b x0;
    public View y;
    public final io.reactivex.rxjava3.disposables.b y0;
    public BottomNavigationView z;
    public final io.reactivex.rxjava3.disposables.g z0;

    /* compiled from: NavigationDelegateBottom.kt */
    public static final class a {
        public static final ArrayList a(wtn0 wtn0Var) {
            LinkedHashMap linkedHashMap = nx50.Q0;
            Set<Map.Entry> entrySet = nx50.Q0.entrySet();
            ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                arrayList.add(new FragmentEntry((Class) entry.getKey(), ((Number) entry.getValue()).intValue() == TabMenuItemUiData.MANAGED_GROUP.h() ? wtn0Var.e("id") : null));
            }
            return arrayList;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final class b extends s1q0 {
        public final View f;

        public b(View view) {
            this.f = view;
        }

        @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i) {
            return i == -1 ? sni.k(this.f.getContext()) : super.getPageWidth(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (i == -1) {
                throw new IllegalStateException("Left view is not initialized");
            }
            if (i == 0) {
                return this.f;
            }
            throw new IllegalArgumentException("Unknown position");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TabbarSuggestApplyState.values().length];
            try {
                iArr[TabbarSuggestApplyState.OpenSettings.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<List<? extends VideoUploadEvent>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends VideoUploadEvent> list) {
            ((qot0) this.receiver).e(list);
            return s3q0.a;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public f(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final class h implements qmg0.a {
        public final /* synthetic */ nx50<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(nx50<? extends T> nx50Var) {
            this.a = nx50Var;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
        public final void a() {
            ?? r0;
            nx50<T> nx50Var = this.a;
            if (nx50Var.v0 == null || (r0 = nx50Var.o0.c) == 0) {
                return;
            }
            r0.M();
        }
    }

    /* compiled from: NavigationDelegateBottom.kt */
    public static final class i {
        public final /* synthetic */ nx50<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public i(nx50<? extends T> nx50Var) {
            this.a = nx50Var;
        }
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [com.vk.navigation.NavigationDelegateBottom$receiver$1] */
    public nx50(NavigationDelegateActivity navigationDelegateActivity, boolean z) {
        super(navigationDelegateActivity, z);
        jst0 jst0Var = new jst0();
        e1j0.a.getClass();
        jst0Var.g = e1j0.d;
        this.o = jst0Var;
        this.p = navigationDelegateActivity.n();
        this.q = new rx50(this);
        int i2 = 2;
        this.r = new bpn0(new gbl(this, i2));
        int dimensionPixelSize = navigationDelegateActivity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
        this.s = dimensionPixelSize;
        int i3 = 4;
        this.t = new bpn0(new rx2(navigationDelegateActivity, i3));
        int i4 = 1;
        this.u = new bpn0(new nxv(navigationDelegateActivity, i4));
        this.F = -128;
        int i5 = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.G = new LinkedHashSet<>();
        this.H = new WeakHashMap<>();
        new ox50();
        navigationDelegateActivity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_blur_height);
        this.J = dimensionPixelSize;
        jb3 jb3Var = new jb3(this, i3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, jb3Var);
        int i6 = 3;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new bky(this, i6));
        this.Q = a2;
        this.R = msy.a(lazyThreadSafetyMode, new iw00(this, i2));
        this.S = msy.a(lazyThreadSafetyMode, new uy2(this, i6));
        this.T = msy.a(lazyThreadSafetyMode, new ap(this, i6));
        this.U = msy.a(lazyThreadSafetyMode, new bp(this, i2));
        Lazy a3 = msy.a(lazyThreadSafetyMode, new cp(this, i6));
        this.V = a3;
        this.W = msy.a(lazyThreadSafetyMode, new tkj(this, i6));
        this.X = msy.a(lazyThreadSafetyMode, new b5o(this, i3));
        int i7 = 5;
        Lazy a4 = msy.a(lazyThreadSafetyMode, new c5o(this, i7));
        this.Y = a4;
        Lazy a5 = msy.a(lazyThreadSafetyMode, new i1q(this, i2));
        this.Z = a5;
        this.a0 = new r7v((utn0) a2.getValue(), (jwn0) a3.getValue(), E0(), (v57) a4.getValue(), (zys) a5.getValue(), new hx50(this, 0));
        int i8 = 6;
        this.b0 = msy.a(lazyThreadSafetyMode, new t0f(i8));
        this.c0 = msy.a(lazyThreadSafetyMode, new vwk(this, i6));
        this.d0 = msy.a(lazyThreadSafetyMode, new yg9(this, i8));
        this.e0 = msy.a(lazyThreadSafetyMode, new uia(this, i7));
        this.f0 = msy.a(lazyThreadSafetyMode, new ho4(this, i2));
        this.g0 = msy.a(lazyThreadSafetyMode, new sx2(this, i3));
        this.h0 = msy.a(lazyThreadSafetyMode, new yaa(this, i6));
        this.i0 = msy.a(lazyThreadSafetyMode, new cuq(this, i6));
        this.j0 = msy.a(lazyThreadSafetyMode, new duq(this, i7));
        this.k0 = msy.a(lazyThreadSafetyMode, new fat(this, i7));
        this.l0 = msy.a(lazyThreadSafetyMode, new gat(this, 7));
        this.m0 = msy.a(lazyThreadSafetyMode, new qy8(this, 11));
        this.n0 = msy.a(lazyThreadSafetyMode, new j90(this, i8));
        this.o0 = new hfl0(new vx50(navigationDelegateActivity, this));
        this.p0 = new f8v0(new byc0());
        int i9 = 9;
        y0().r(new eu2(i9));
        this.q0 = new wx50(this);
        this.r0 = new yy80();
        this.x0 = new io.reactivex.rxjava3.disposables.b();
        this.y0 = new io.reactivex.rxjava3.disposables.b();
        this.z0 = new io.reactivex.rxjava3.disposables.g();
        Lazy a6 = msy.a(lazyThreadSafetyMode, new vbp(this, i6));
        this.A0 = a6;
        Lazy a7 = msy.a(lazyThreadSafetyMode, new oxv(this, i3));
        this.B0 = a7;
        Lazy a8 = msy.a(lazyThreadSafetyMode, new pxv(this, i6));
        this.C0 = a8;
        Lazy a9 = msy.a(lazyThreadSafetyMode, new qxv(this, i4));
        this.D0 = a9;
        Lazy a10 = msy.a(lazyThreadSafetyMode, new mu2(this, i3));
        this.E0 = a10;
        Lazy a11 = msy.a(lazyThreadSafetyMode, new gb3(this, i9));
        this.F0 = a11;
        Lazy a12 = msy.a(lazyThreadSafetyMode, new g3o(this, i3));
        this.G0 = a12;
        this.H0 = msy.a(lazyThreadSafetyMode, new hy6(this, 8));
        this.I0 = new qot0(navigationDelegateActivity, a6, a7, a8, a9, a10, a11, a12);
        this.J0 = msy.a(lazyThreadSafetyMode, new rxv(this, i6));
        this.M0 = new BroadcastReceiver(this) { // from class: com.vk.navigation.NavigationDelegateBottom$receiver$1
            public final /* synthetic */ nx50<AppCompatActivity> a;

            {
                this.a = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Bundle extras;
                Image image;
                nx50<AppCompatActivity> nx50Var = this.a;
                vbs vbsVar = nx50Var.p;
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1414915502:
                            if (!action.equals("com.vkontakte.android.COUNTERS_UPDATED")) {
                                return;
                            }
                            break;
                        case -443120485:
                            if (action.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED")) {
                                if (nx50Var.v0().a(wp80.c(intent))) {
                                    String str = nx50Var.v0().o().c;
                                    Iterator it = nx50Var.y0().F().iterator();
                                    while (it.hasNext()) {
                                        f zb = ((FragmentEntry) it.next()).zb(vbsVar);
                                        aes aesVar = zb instanceof aes ? (aes) zb : null;
                                        if (aesVar != null) {
                                            aesVar.h7(new v6j(str));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        case -273209834:
                            if (action.equals("request_update_bottom_theme_event")) {
                                nx50.Z0(nx50Var, nx50Var.u(), 2);
                                return;
                            }
                            return;
                        case 333377586:
                            if (action.equals("com.vkontakte.android.USER_PHOTO_CHANGED")) {
                                UserId userId = (UserId) intent.getParcelableExtra("id");
                                if (userId == null) {
                                    userId = UserId.d;
                                }
                                if (!nx50Var.v0().a(userId) || (extras = intent.getExtras()) == null || (image = (Image) extras.getParcelable("image")) == null) {
                                    return;
                                }
                                ImageSize Cb = image.Cb(iah0.a(56), true, false);
                                String url = Cb != null ? Cb.getUrl() : null;
                                Iterator it2 = nx50Var.y0().F().iterator();
                                while (it2.hasNext()) {
                                    f zb2 = ((FragmentEntry) it2.next()).zb(vbsVar);
                                    aes aesVar2 = zb2 instanceof aes ? (aes) zb2 : null;
                                    if (aesVar2 != null) {
                                        aesVar2.h7(new v6j(url));
                                    }
                                }
                                return;
                            }
                            return;
                        case 611799995:
                            if (!action.equals("com.vkontakte.android.FRIEND_REQUESTS_CHANGED")) {
                                return;
                            }
                            break;
                        case 2137710859:
                            if (action.equals("show_hide_navigation_shadow_event") && intent.hasExtra("show")) {
                                FragmentImpl u = nx50Var.u();
                                nx50Var.c1(u);
                                nx50Var.a1(u, intent);
                                nx50Var.U0(u);
                                if (u instanceof des) {
                                    return;
                                }
                                hfl0 hfl0Var = nx50Var.o0;
                                hfl0.c(hfl0Var, hfl0Var.d.m0(), 2);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                    if (intent.getBooleanExtra("out", false)) {
                        return;
                    }
                    g620.D();
                    nx50Var.W0();
                }
            }
        };
        this.N0 = new px50(navigationDelegateActivity, this);
        this.P0 = new qx50(this);
    }

    public static int B0(Intent intent, Integer num) {
        LinkedHashMap linkedHashMap = Q0;
        rsr rsrVar = oz50.k;
        FragmentEntry c2 = oz50.b.c(intent.getExtras());
        Integer num2 = (Integer) linkedHashMap.get(c2 != null ? c2.b : null);
        if (num2 != null) {
            return num2.intValue();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getInt("last_bottom_menu_id", num != null ? num.intValue() : -1);
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static boolean M0(FragmentImpl fragmentImpl) {
        Bundle arguments;
        return (fragmentImpl == null || (arguments = fragmentImpl.getArguments()) == null || !arguments.getBoolean("no_bottom_navigation", false)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean N0(nx50 nx50Var, int i2, defpackage.u uVar, int i3) {
        boolean z = (i3 & 4) == 0;
        if ((i3 & 8) != 0) {
            uVar = null;
        }
        qaj0.c(nx50Var.g, nx50Var.i, Integer.valueOf(i2));
        nx50Var.E = Integer.valueOf(i2);
        TabMenuItemUiData.Companion.getClass();
        TabMenuItemUiData a2 = TabMenuItemUiData.a.a(i2);
        if (a2 != null) {
            if (nx50Var.L0 == null) {
                TabMenuItemUiData tabMenuItemUiData = TabMenuItemUiData.MANAGED_GROUP;
                Class<? extends FragmentImpl> a3 = m820.a(a2.h(), i2 == tabMenuItemUiData.h() ? nx50Var.E0().e("community_id_arg") : null);
                if (a3 != null) {
                    String i4 = a2.i();
                    if (i2 == tabMenuItemUiData.h()) {
                        nx50Var.G0().f();
                    }
                    if (!nx50Var.y0().A(a3)) {
                        Q0 = b68.f();
                        nx50Var.y0().t(a.a(nx50Var.E0()), true);
                    }
                    FragmentImpl m = nx50Var.y0().m();
                    if (m != 0 && !nx50Var.k(m) && !m.isHidden() && m.getClass().equals(a3)) {
                        boolean s = m instanceof qhh0 ? ((qhh0) m).s() : false;
                        if (!s && (m instanceof r230)) {
                            s = ((r230) m).Ya();
                        }
                        if (uVar != null) {
                            uVar.invoke();
                        }
                        return s;
                    }
                    m820.g(-1, i4);
                    nx50Var.T0(a2);
                    UiTracker uiTracker = UiTracker.a;
                    UiTracker.i.d = true;
                    nx50Var.y0().k(new FragmentEntry(a3, nx50Var.t0(a3, z)), false);
                    if (uVar != null) {
                        uVar.invoke();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void Z0(nx50 nx50Var, FragmentImpl fragmentImpl, int i2) {
        if ((i2 & 1) != 0) {
            fragmentImpl = nx50Var.w0();
        }
        nx50Var.c1(fragmentImpl);
        nx50Var.a1(fragmentImpl, null);
        nx50Var.U0(fragmentImpl);
        if (fragmentImpl instanceof des) {
            return;
        }
        hfl0 hfl0Var = nx50Var.o0;
        hfl0.c(hfl0Var, hfl0Var.d.m0(), 2);
    }

    public static int z0(int i2) {
        if (i2 == R.id.tab_news) {
            if (b68.i()) {
                return 0;
            }
            return g620.h();
        }
        if (i2 == R.id.tab_messages) {
            return g620.g();
        }
        if (i2 == R.id.tab_friends) {
            return g620.g;
        }
        if (i2 == R.id.tab_feedback) {
            return g620.h();
        }
        if (i2 == R.id.tab_groups) {
            return g620.l;
        }
        if (i2 == R.id.tab_games) {
            return g620.z;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean A0(int i2) {
        if (i2 == R.id.tab_news) {
            return z0(R.id.tab_news) > 0 || g620.o != 0;
        }
        if (i2 == R.id.tab_clips) {
            return (!((zof) this.d0.getValue()).k() || ((zof) this.d0.getValue()).S() || g620.p == 0) ? false : true;
        }
        if (i2 == R.id.tab_discover && ((zof) this.d0.getValue()).k()) {
            return g620.t != 0 || g620.u > 0;
        }
        return false;
    }

    @Override // xsna.ww50
    public final boolean B(FragmentImpl fragmentImpl) {
        return y0().E(fragmentImpl);
    }

    @Override // xsna.ww50
    public final boolean C() {
        boolean h2;
        b68 b68Var = b68.b;
        synchronized (b68.class) {
            h2 = b68.h();
        }
        return h2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final int C0() {
        Integer num;
        Integer num2 = this.E;
        if (num2 != null && num2.intValue() == R.id.tab_profile) {
            return 1;
        }
        ?? r0 = this.d0;
        return (((zof) r0.getValue()).c() && ((zof) r0.getValue()).k() && (num = this.E) != null && num.intValue() == R.id.tab_clips) ? 2 : 0;
    }

    @Override // xsna.hsx0
    public final Integer Ck() {
        if (f4m.h(this.w)) {
            return Integer.valueOf(this.s);
        }
        return null;
    }

    @Override // xsna.ww50
    public final boolean D(FragmentImpl fragmentImpl, boolean z) {
        boolean contains;
        b68 b68Var = b68.b;
        synchronized (b68.class) {
            contains = b68.f.contains(Integer.valueOf(TabMenuItemUiData.PROFILE.h()));
        }
        if (contains) {
            return false;
        }
        return y0().y(fragmentImpl) || z;
    }

    @Override // xsna.ww50
    public final void E(int i2, int i3, Intent intent) {
        w58 menuView;
        if (i2 == 366 && i3 == -1) {
            j58 j58Var = null;
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("TABBAR_ONBOARDING_SELECTED_TAB_INDEX", 0)) : null;
            if (valueOf == null) {
                FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.t0;
                if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
                    fitSystemWindowsFragmentWrapperFrameLayout.post(new xab(this, 7));
                    return;
                }
                return;
            }
            BottomNavigationView bottomNavigationView = this.z;
            if (bottomNavigationView != null && (menuView = bottomNavigationView.getMenuView()) != null) {
                try {
                    j58Var = menuView.g[valueOf.intValue()];
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (j58Var != null) {
                f(j58Var.getItemData(), j58Var);
                return;
            }
            FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout2 = this.t0;
            if (fitSystemWindowsFragmentWrapperFrameLayout2 != null) {
                fitSystemWindowsFragmentWrapperFrameLayout2.post(new q86(this, 7));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wtn0 E0() {
        return (wtn0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ww50
    public final void F(Configuration configuration) {
        if (com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL)) {
            ((g9g0) this.m0.getValue()).c();
        }
        this.a0.a.hide();
        VkContextMenu vkContextMenu = this.L0;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.L0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final TabbarSettingsComponent F0() {
        return (TabbarSettingsComponent) this.P.getValue();
    }

    @Override // xsna.ni6, xsna.xdr0, xsna.ww50
    public final void G() {
        super.G();
        this.H.clear();
        this.G.clear();
        mz50 mz50Var = this.K0;
        if (mz50Var != null) {
            mz50Var.a();
        }
        w1n.b.D();
        this.x0.dispose();
        this.z0.b(null);
        hfl0 hfl0Var = this.o0;
        hfl0Var.d.n0(hfl0Var.e);
        d6q0.g(hfl0Var.j);
        hfl0Var.a();
        this.a0.k.dispose();
        if (this.z != null) {
            bpn0 bpn0Var = dm10.c;
            ((l58) (bpn0Var != null ? bpn0Var : null).getValue()).dispose();
        }
        e1j0.a.getClass();
        CopyOnWriteArraySet<izs<Integer, s3q0>> copyOnWriteArraySet = e1j0.b;
        jst0 jst0Var = this.o;
        copyOnWriteArraySet.remove(jst0Var);
        c0(jst0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final pvn0 G0() {
        return (pvn0) this.T.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ww50
    public final void H(fcn fcnVar) {
        super.H(fcnVar);
        Dialog dialog = fcnVar instanceof Dialog ? (Dialog) fcnVar : null;
        if (dialog != null) {
            this.f.getClass();
            UiTracker.i.h(dialog, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final rvn0 H0() {
        return (rvn0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    @Override // xsna.ww50
    public final boolean I() {
        ?? r0 = this.o0.c;
        return r0 != 0 && r0.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
        if (fragmentImpl2 instanceof des) {
            des desVar = (des) fragmentImpl2;
            tib b2 = desVar.b();
            if (b2 != null) {
                Iterator it = ((ArrayList) b2.a).iterator();
                while (it.hasNext()) {
                    ((pel0) it.next()).getView().setVisibility(8);
                }
            }
            desVar.a();
        }
        boolean z = fragmentImpl instanceof jes;
        hfl0 hfl0Var = this.o0;
        if (z) {
            hfl0.c(hfl0Var, hfl0Var.d.m0(), 2);
        } else if (fragmentImpl2 instanceof jes) {
            hfl0.c(hfl0Var, hfl0Var.d.m0(), 2);
        }
        if (fragmentImpl instanceof des) {
            ((des) fragmentImpl).a();
        }
    }

    @Override // xsna.ww50
    public final void J() {
        P0(true, false);
    }

    public final void J0(boolean z) {
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout;
        qmg0 qmg0Var = this.v0;
        if (qmg0Var == null || (fitSystemWindowsFrameLayout = this.u0) == null) {
            return;
        }
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.t0;
        if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
            SwipableTabsView swipableTabsView = (SwipableTabsView) fitSystemWindowsFragmentWrapperFrameLayout.findViewById(R.id.swipable_container);
            this.C = swipableTabsView;
            if (swipableTabsView == null) {
                Context context = fitSystemWindowsFragmentWrapperFrameLayout.getContext();
                m820 m820Var = m820.b;
                SwipableTabsView swipableTabsView2 = new SwipableTabsView(context, e43.l(new Pair(Integer.valueOf(TabMenuItemUiData.HOME.h()), HomeFragment2.class), new Pair(Integer.valueOf(TabMenuItemUiData.OVERVIEW.h()), ExploreFragment.class)), this);
                this.C = swipableTabsView2;
                swipableTabsView2.setId(R.id.swipable_container);
                fitSystemWindowsFragmentWrapperFrameLayout.addView(this.C, fitSystemWindowsFragmentWrapperFrameLayout.getChildCount(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        qmg0Var.setAdapter(null);
        qmg0Var.removeAllViews();
        qmg0Var.addView(fitSystemWindowsFrameLayout);
        b bVar = new b(fitSystemWindowsFrameLayout);
        this.w0 = bVar;
        if (this.F == -128 || z) {
            this.F = 0;
        }
        qmg0Var.setAdapter(bVar);
        qmg0Var.setCurrentItem(this.F, false);
        qmg0Var.removeOnPageChangeListener(this);
        qmg0Var.addOnPageChangeListener(this);
    }

    @Override // xsna.ww50
    public final void K(Bundle bundle) {
        String string;
        Parcelable parcelable;
        Object parcelable2;
        this.z0.b(null);
        this.o0.a();
        int i2 = MusicAndroidAutoMediaService.p;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        MusicAndroidAutoMediaService.a.a(navigationDelegateActivity);
        if (bundle != null && (string = bundle.getString(CommonConstant.KEY_ACCESS_TOKEN)) != null) {
            VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("utilityTokens", UtilityTokens.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("utilityTokens");
                parcelable = (UtilityTokens) (parcelable3 instanceof UtilityTokens ? parcelable3 : null);
            }
            UtilityTokens utilityTokens = (UtilityTokens) parcelable;
            if (utilityTokens == null) {
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
            }
            r1 = new VkPassportRouterInfo(string, null, vkAuthMetaInfo, utilityTokens, null, 16, null);
        }
        if (r1 == null) {
            y0().B();
        }
        String str = MainActivity.P;
        Intent putExtra = new Intent(navigationDelegateActivity, (Class<?>) MainActivity.class).putExtra("key_logout", true);
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        navigationDelegateActivity.startActivity(putExtra.addFlags(603979776));
    }

    public final boolean K0() {
        FragmentImpl u = u();
        return u != null && y0().y(u);
    }

    @Override // xsna.ww50
    public final boolean L(FragmentImpl fragmentImpl) {
        if (fragmentImpl == null) {
            return true;
        }
        fragmentImpl.finish();
        return true;
    }

    public final boolean L0() {
        FragmentImpl u = u();
        HashSet hashSet = iah0.a;
        return fnj.d(this.b) || (u instanceof jes) || M0(u) || (u instanceof ies);
    }

    @Override // xsna.ww50
    public final void M(Intent intent) {
        if (!epx.f(intent.getAction(), k840.b.a())) {
            if (!this.c) {
                super.M(intent);
                return;
            }
            rsr rsrVar = oz50.k;
            FragmentEntry c2 = oz50.b.c(intent.getExtras());
            p210 p210Var = new p210(c2, this, intent, 1);
            UserId userId = (UserId) intent.getParcelableExtra("target_user_id");
            if (userId == null) {
                userId = UserId.d;
            }
            if (c2 != null) {
                S0(userId, p210Var);
                return;
            }
            return;
        }
        FragmentImpl u = u();
        String stringExtra = intent.getStringExtra("com.vk.music.common.EXTRA_POSITION");
        boolean booleanExtra = intent.getBooleanExtra("com.vk.music.common.FLAG_SECURE", false);
        if (u != null && !(u instanceof ies) && !(u instanceof jes) && !A() && !M0(u)) {
            i0q0.d(300L, new ls2(6, this, stringExtra));
            return;
        }
        StandalonePlayerFragment.a aVar = new StandalonePlayerFragment.a();
        aVar.z(stringExtra);
        aVar.y(booleanExtra);
        aVar.k(this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    @Override // xsna.ww50
    public final void N() {
        NavigationDelegateBottom$receiver$1 navigationDelegateBottom$receiver$1 = this.M0;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        try {
            navigationDelegateActivity.unregisterReceiver(navigationDelegateBottom$receiver$1);
            cuz.a(navigationDelegateActivity).d(navigationDelegateBottom$receiver$1);
        } catch (Exception unused) {
        }
        this.y0.e();
        VkContextMenu vkContextMenu = this.L0;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.L0 = null;
        hfl0 hfl0Var = this.o0;
        ?? r2 = hfl0Var.c;
        if (r2 != 0) {
            r2.onPause();
        }
        hfl0Var.f = false;
        r7v r7vVar = this.a0;
        r7vVar.h = null;
        r7vVar.i = null;
        r7vVar.j = null;
        r7vVar.f.a();
        r7vVar.g = false;
        r7vVar.a();
        this.m = new io.reactivex.rxjava3.internal.operators.completable.m(new mi6(this)).q(this.n).subscribe();
    }

    public final void O0(int i2, Long l) {
        wx50 wx50Var = this.q0;
        if (wx50Var.hasMessages(i2)) {
            return;
        }
        wx50Var.removeCallbacksAndMessages(null);
        wx50Var.sendMessageDelayed(Message.obtain(wx50Var, i2), l != null ? l.longValue() : 300L);
    }

    @Override // xsna.ww50
    public final void P(Bundle bundle) {
        Integer g2;
        final int i2 = bundle.getInt("currentMenuId");
        this.E = Integer.valueOf(i2);
        Q0(i2, false);
        SwipableTabsView swipableTabsView = this.C;
        if (swipableTabsView != null && (g2 = i7o0.g(swipableTabsView.i, new izs() { // from class: xsna.nln0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                List<Integer> list = SwipableTabsView.u;
                return Boolean.valueOf(((Number) ((Pair) obj).i()).intValue() == i2);
            }
        })) != null) {
            swipableTabsView.post(new oln0(g2.intValue(), swipableTabsView));
        }
        y0().l(bundle);
        this.F = bundle.getInt("currentRootPage", -128);
        qmg0 qmg0Var = this.v0;
        if (qmg0Var != null) {
            qmg0Var.post(new ov(this, 10));
        }
        this.K = bundle.getBoolean("currentFragmentSupportBottomBar", this.K);
        Z0(this, null, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x023a, code lost:
    
        if (r11.g != false) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(boolean z, boolean z2) {
        int i2;
        LinkedHashSet linkedHashSet;
        TabbarState b2;
        Object obj;
        Object obj2;
        int i3;
        FragmentImpl m;
        FragmentEntry Kn;
        Iterator it;
        Object obj3;
        b68 b68Var = b68.b;
        List O0 = j5g.O0(b68Var.g());
        synchronized (b68.class) {
            b68.b();
            i2 = 0;
            if (z) {
                h58 e2 = b68.e();
                e2.e = null;
                e2.c.e();
                e2.f = 0;
                L.e("bnts", "navigation cleared");
            }
        }
        FragmentImpl m2 = y0().m();
        if (z) {
            this.x0.b(com.vk.toggle.b.A.u(new com.vk.movika.sdk.android.defaultplayer.interactive.b(23), null));
        }
        Q0 = b68.f();
        if (z) {
            y0().H(a.a(E0()));
        } else {
            y0().t(a.a(E0()), !z2);
        }
        BottomNavigationView bottomNavigationView = this.z;
        if (bottomNavigationView != null) {
            Boolean e3 = b68.e().b.c().e();
            bottomNavigationView.setTitlesVisibility(e3 != null ? e3.booleanValue() : false);
        }
        BottomNavigationView bottomNavigationView2 = this.z;
        if (bottomNavigationView2 != null) {
            y58 y58Var = bottomNavigationView2.d;
            y58Var.d = true;
            t58 t58Var = bottomNavigationView2.b;
            t58Var.p = true;
            t58Var.clear();
            t58Var.clearHeader();
            t58Var.u.clear();
            t58Var.p = false;
            t58Var.q = false;
            t58Var.r = false;
            t58Var.p(true);
            y58Var.d = false;
            y58 y58Var2 = bottomNavigationView2.d;
            y58Var2.d = true;
            bpn0 bpn0Var = dm10.c;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            ((l58) bpn0Var.getValue()).a(bottomNavigationView2.b, bottomNavigationView2);
            y58Var2.d = false;
            y58Var2.c(true);
        }
        W0();
        J0(true);
        VkContextMenu vkContextMenu = this.L0;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.L0 = null;
        if (z2) {
            List O02 = j5g.O0(b68Var.g());
            if (!epx.f(O0, O02)) {
                List list = O02;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((Number) obj).intValue() == R.id.tab_managed_group) {
                            break;
                        }
                    }
                }
                Integer num = (Integer) obj;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    int intValue = ((Number) obj2).intValue();
                    Integer num2 = this.E;
                    if (num2 != null && intValue == num2.intValue()) {
                        break;
                    }
                }
                Integer num3 = (Integer) obj2;
                int intValue2 = num3 != null ? num3.intValue() : ((Number) j5g.Y(O02)).intValue();
                if (j5g.O0(b68.b.g()).contains(Integer.valueOf(R.id.tab_managed_group)) && G0().a() != null) {
                    Iterator<T> it4 = H0().h().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it4.next();
                            if (epx.f(((TabbarItem) obj3).e(), G0().a())) {
                                break;
                            }
                        }
                    }
                    if (obj3 != null && num != null) {
                        i3 = num.intValue();
                        if (num != null && i3 == num.intValue()) {
                            Q0(intValue2, false);
                        } else {
                            m = y0().m();
                            N0(this, i3, null, 14);
                            Q0(i3, false);
                            if ((m instanceof SettingsListFragment) && (Kn = ((SettingsListFragment) m).Kn()) != null) {
                                y0().q(Kn);
                            }
                        }
                        it = y0().F().iterator();
                        while (it.hasNext()) {
                            androidx.lifecycle.f zb = ((FragmentEntry) it.next()).zb(this.p);
                            if (zb instanceof aes) {
                                ((aes) zb).A0();
                            }
                            if (zb instanceof ges) {
                                ((ges) zb).Rc();
                            }
                        }
                    }
                }
                i3 = intValue2;
                if (num != null) {
                    Q0(intValue2, false);
                    it = y0().F().iterator();
                    while (it.hasNext()) {
                    }
                }
                m = y0().m();
                N0(this, i3, null, 14);
                Q0(i3, false);
                if (m instanceof SettingsListFragment) {
                    y0().q(Kn);
                }
                it = y0().F().iterator();
                while (it.hasNext()) {
                }
            }
            if (G0().a() != null) {
                G0().f();
            }
            Integer g2 = i7o0.g(O02, new bq00(this, 15));
            int intValue3 = g2 != null ? g2.intValue() : 0;
            r7v r7vVar = this.a0;
            v57 v57Var = r7vVar.d;
            r7v.a[] aVarArr = r7vVar.l;
            int length = aVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                } else if (!aVarArr[i4].b(r7vVar.j)) {
                    i4++;
                }
            }
            if (r7vVar.e.b.get() == null) {
                if (v57Var.a()) {
                    v57Var.f(null, new q7v(r7vVar, intValue3, i2));
                } else {
                    NavigationDelegateActivity navigationDelegateActivity = r7vVar.i;
                    if (navigationDelegateActivity != null && (b2 = r7vVar.c.b()) != null) {
                        r7vVar.b.a(navigationDelegateActivity, intValue3, b2);
                    }
                }
            }
            mz50 mz50Var = this.K0;
            if (mz50Var != null) {
                mz50Var.a();
            }
            synchronized (b68.class) {
                linkedHashSet = new LinkedHashSet(b68.h);
            }
            mz50 e4 = ine0.e(linkedHashSet);
            e4.b();
            this.K0 = e4;
            FragmentImpl m3 = y0().m();
            if (m3 != null) {
                I0(m3, m2);
            }
        }
        int i5 = MusicAndroidAutoMediaService.p;
        MusicAndroidAutoMediaService.a.a(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.qy90$c, xsna.wf] */
    @Override // xsna.ni6, xsna.ww50
    public final void Q() {
        MusicTrack b2;
        super.Q();
        W0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.COUNTERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_PROFILE_UPDATED");
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        anj.d(this.b, this.M0, intentFilter, hf8.a, 4);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("show_hide_navigation_shadow_event");
        intentFilter2.addAction("request_update_bottom_theme_event");
        cuz.a(this.b).b(this.M0, intentFilter2);
        q0();
        Z0(this, null, 3);
        if (!this.g.getBoolean(this.j, false)) {
            FragmentImpl m = y0().m();
            if (m instanceof bes) {
                ((bes) m).getClass();
            }
            r7v r7vVar = this.a0;
            NavigationDelegateActivity navigationDelegateActivity = this.b;
            r7vVar.h = this.z;
            r7vVar.i = navigationDelegateActivity;
            r7vVar.j = m;
            r7vVar.f.a();
            r7vVar.g = false;
            r7vVar.a();
            r7vVar.b();
        } else if (w() == null) {
            l0(false);
        } else {
            if (y0().v() != 0) {
                y0().B();
            }
            bpn0 bpn0Var = b58.a;
            int a2 = b58.a(w());
            Class<? extends FragmentImpl> a3 = m820.a(a2, null);
            if (a3 != null) {
                y0().q(new FragmentEntry(a3, null, 2, null));
                this.E = Integer.valueOf(a2);
                if (b68.f().values().contains(Integer.valueOf(a2))) {
                    Q0(a2, true);
                } else {
                    Integer num = (Integer) j5g.j0(b68.f().values());
                    Q0(num != null ? num.intValue() : a2, true);
                }
                qaj0.c(this.g, this.i, Integer.valueOf(a2));
                l0(false);
            }
        }
        hfl0 hfl0Var = this.o0;
        hfl0Var.f = true;
        ?? r1 = hfl0Var.c;
        if (r1 != 0) {
            r1.onResume();
            if (!r1.M() && !r1.o3() && !r1.v3()) {
                r1.q();
            }
            ifl0 ifl0Var = hfl0Var.j;
            ifl0Var.getClass();
            CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
            coreFeatures.getClass();
            if (com.vk.toggle.b.A.a(coreFeatures) && ifl0Var.a == NetworkState.UNSTABLE && (b2 = ifl0Var.b.d.b()) != null && !b2.S4() && r1.M()) {
                d6q0.a.getClass();
                d6q0.k();
            }
        }
    }

    public final void Q0(int i2, boolean z) {
        this.E = Integer.valueOf(i2);
        BottomNavigationView bottomNavigationView = this.z;
        if (bottomNavigationView != null) {
            t58 t58Var = bottomNavigationView.b;
            for (int i3 = 0; i3 < t58Var.f.size(); i3++) {
                if (t58Var.getItem(i3).getItemId() == i2) {
                    w58 w58Var = bottomNavigationView.c;
                    w58Var.a(i3, z);
                    w58Var.d();
                }
            }
        }
    }

    @Override // xsna.ww50
    public final void R(Bundle bundle) {
        Integer num = this.E;
        if (num != null) {
            bundle.putInt("currentMenuId", num.intValue());
        }
        bundle.putInt("currentRootPage", this.F);
        y0().h(bundle);
        bundle.putBoolean("currentFragmentSupportBottomBar", this.K);
    }

    public final void R0(float f2) {
        View view = this.B;
        if (view != null) {
            view.setVisibility(f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 8 : 0);
        }
        float f3 = swe0.f(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        View view2 = this.B;
        if (view2 != null) {
            view2.setAlpha(f3 * 0.64f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ww50
    public final void S(fcn fcnVar) {
        super.S(fcnVar);
        Dialog dialog = fcnVar instanceof Dialog ? (Dialog) fcnVar : null;
        if (dialog != null) {
            this.f.getClass();
            UiTracker.i.h(dialog, true);
        }
    }

    public final void S0(UserId userId, gzs<s3q0> gzsVar) {
        if (v0().a(userId) || !v0().b() || !fkq0.c(userId)) {
            i0q0.j(new ou4(gzsVar, 7));
            return;
        }
        io.reactivex.rxjava3.core.a l = hg1.l(v0().f(userId).o(io.reactivex.rxjava3.android.schedulers.a.b()), this.b, 54);
        u30 u30Var = new u30(gzsVar, 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.x0.b(itg0.l(new io.reactivex.rxjava3.internal.operators.completable.w(l, lVar, lVar, kVar, kVar, u30Var, kVar)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ww50
    public final void T() {
        hfl0 hfl0Var = this.o0;
        hfl0Var.d.P0(hfl0Var.e, true);
        ((qww) this.j0.getValue()).a(this.P0);
    }

    public final void T0(TabMenuItemUiData tabMenuItemUiData) {
        gzp0.a.c(new SchemeStat$TypeNavigationTabClick(tabMenuItemUiData.j(), A0(tabMenuItemUiData.h()) ? SchemeStat$TypeNavigationTabClick.IndicatorType.DOT : z0(tabMenuItemUiData.h()) > 0 ? SchemeStat$TypeNavigationTabClick.IndicatorType.COUNTER : null));
        if (tabMenuItemUiData.j() == SchemeStat$TypeNavigationTabClick.TabId.CLIPS && A0(tabMenuItemUiData.h())) {
            new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, SchemeStat$TypeClipViewerItem.EventType.CLIPS_RED_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null)).q();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ww50
    public final void U() {
        hfl0 hfl0Var = this.o0;
        hfl0Var.d.n0(hfl0Var.e);
        ((qww) this.j0.getValue()).b(this.P0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(FragmentImpl fragmentImpl) {
        sds sdsVar = fragmentImpl instanceof sds ? (sds) fragmentImpl : null;
        this.J = sdsVar != null ? sdsVar.getBottomMargin() : this.s;
        this.K = ((fragmentImpl instanceof ies) || M0(fragmentImpl)) ? false : true;
        V0();
    }

    @Override // xsna.ww50
    public final void V(Bundle bundle) {
        FragmentEntry fragmentEntry;
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        FragmentImpl i2 = y0().i(ClipsOwnerSwipeFragment.class);
        if (i2 == null || !y0().y(i2)) {
            i2 = null;
        }
        if (i2 == null || !i2.equals(y0().m())) {
            if (i2 == null || (fragmentEntry = i2.Kn()) == null) {
                fragmentEntry = new FragmentEntry(ClipsOwnerSwipeFragment.class, null, 2, null);
            }
            fragmentEntry.c.putAll(bundle);
            s0(fragmentEntry, true);
        }
        ale aleVar = i2 instanceof ale ? (ale) i2 : null;
        if (aleVar != null) {
            aleVar.oi(bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    public final void V0() {
        CoordinatorLayout coordinatorLayout;
        boolean z = this.K;
        f8v0 f8v0Var = this.p0;
        hfl0 hfl0Var = this.o0;
        if (!z || this.M || this.L) {
            efl0 efl0Var = hfl0Var.n;
            i0q0.g(efl0Var);
            i0q0.e(efl0Var);
            f8v0Var.getClass();
            FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor = this.w;
            if (frameLayoutWithTouchInterceptor != null) {
                frameLayoutWithTouchInterceptor.setVisibility(8);
            }
            FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.t0;
            if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
                ((ViewGroup.MarginLayoutParams) fitSystemWindowsFragmentWrapperFrameLayout.getLayoutParams()).bottomMargin = 0;
                fitSystemWindowsFragmentWrapperFrameLayout.requestLayout();
            }
            r0();
            return;
        }
        int i2 = this.J;
        f8v0Var.getClass();
        if (!L0() && hfl0Var.b()) {
            i2 += ((Number) this.t.getValue()).intValue();
            if (this.O0) {
                i2 += ((Number) this.u.getValue()).intValue();
            }
        }
        View view = this.y;
        if (view != null) {
            view.setY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor2 = this.w;
        if (frameLayoutWithTouchInterceptor2 != null) {
            ?? r6 = hfl0Var.c;
            bwt0.p0(frameLayoutWithTouchInterceptor2, (r6 == 0 || !r6.M()) && this.K && !this.M);
        }
        if (!(w0() instanceof des) && (coordinatorLayout = hfl0Var.c) != null) {
            tib tibVar = this.D;
            if (tibVar != null) {
                Iterator it = ((ArrayList) tibVar.a).iterator();
                while (it.hasNext()) {
                    pel0 pel0Var = (pel0) it.next();
                    pel0Var.getView().setVisibility(pel0Var.equals(coordinatorLayout) ? 0 : 8);
                }
            }
            if (!hfl0Var.b()) {
                hfl0.c(hfl0Var, null, 1);
            }
        }
        w0();
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout2 = this.t0;
        if (fitSystemWindowsFragmentWrapperFrameLayout2 != null) {
            ((ViewGroup.MarginLayoutParams) fitSystemWindowsFragmentWrapperFrameLayout2.getLayoutParams()).bottomMargin = i2;
            fitSystemWindowsFragmentWrapperFrameLayout2.requestLayout();
        }
        r0();
    }

    @Override // xsna.ww50
    public final void W() {
        qmg0 qmg0Var;
        if (K0() && C0() == 2 && this.w0 != null && (qmg0Var = this.v0) != null) {
            qmg0Var.setCurrentItem(-1, true);
        }
    }

    public final void W0() {
        CharSequence charSequence;
        Iterator it = Q0.values().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            boolean A0 = A0(intValue);
            int i2 = 0;
            boolean z = z0(intValue) > 0;
            if (A0) {
                BottomNavigationView bottomNavigationView = this.z;
                if (bottomNavigationView != null) {
                    bottomNavigationView.setIndicatorDot(intValue);
                }
            } else if (z) {
                BottomNavigationView bottomNavigationView2 = this.z;
                if (bottomNavigationView2 != null) {
                    String n = uqm0.n(z0(intValue));
                    w58 w58Var = bottomNavigationView2.c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= w58Var.n.f.size()) {
                            break;
                        }
                        if (w58Var.n.getItem(i3).getItemId() == intValue) {
                            w58Var.g[i3].setIndicatorCounter(n);
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                BottomNavigationView bottomNavigationView3 = this.z;
                if (bottomNavigationView3 != null) {
                    bottomNavigationView3.setIndicatorInvisible(intValue);
                }
            }
            BottomNavigationView bottomNavigationView4 = this.z;
            if (bottomNavigationView4 != null) {
                String str = null;
                if (!A0 && z) {
                    int b2 = (int) uqm0.b(z0(intValue));
                    if (intValue == R.id.tab_messages) {
                        str = this.b.getResources().getQuantityString(R.plurals.accessibility_messenger_tab_hint, b2, Integer.valueOf(b2));
                    }
                }
                w58 w58Var2 = bottomNavigationView4.c;
                while (true) {
                    if (i2 < w58Var2.n.f.size()) {
                        MenuItem item = w58Var2.n.getItem(i2);
                        if (item.getItemId() == intValue) {
                            if (str == null) {
                                charSequence = item.getTitle();
                            } else {
                                charSequence = ((Object) item.getTitle()) + " " + str;
                            }
                            item.setContentDescription(charSequence);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
    }

    @Override // xsna.ww50
    public final void X(Bundle bundle) {
        FragmentEntry fragmentEntry;
        FragmentImpl i2 = y0().i(SuperAppFragment.class);
        if (i2 == null || (fragmentEntry = i2.Kn()) == null) {
            fragmentEntry = new FragmentEntry(SuperAppFragment.class, null, 2, null);
        }
        fragmentEntry.c.putAll(bundle);
        s0(fragmentEntry, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(FragmentImpl fragmentImpl) {
        boolean z = fragmentImpl instanceof HomeFragment2;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        if (z && this.N) {
            dhr0.u0(navigationDelegateActivity.getWindow(), NavigationBarStyle.DARK);
        } else if (fragmentImpl instanceof uds) {
            dhr0.t0(navigationDelegateActivity.getWindow(), ((woo0) fragmentImpl).o7());
        } else {
            dhr0.r0(navigationDelegateActivity);
        }
    }

    @Override // xsna.ww50
    public final void Y(Bundle bundle) {
        FragmentEntry fragmentEntry;
        FragmentImpl i2 = y0().i(VideoCatalogFragment.class);
        Bundle bundle2 = null;
        if (i2 == null || (fragmentEntry = i2.Kn()) == null) {
            fragmentEntry = new FragmentEntry(VideoCatalogFragment.class, null, 2, null);
        }
        if (i2 == null) {
            fragmentEntry.c.putAll(bundle);
        } else {
            Bundle arguments = i2.getArguments();
            if (arguments != null) {
                arguments.putAll(bundle);
                bundle2 = arguments;
            }
            i2.setArguments(bundle2);
        }
        s0(fragmentEntry, true);
    }

    @Override // xsna.xdr0, xsna.ify.a
    public final void Y0() {
        super.Y0();
        this.M = false;
        V0();
    }

    @Override // com.vkontakte.android.ui.bottomnavigation.BottomNavigationView.a
    public final boolean a(MenuItem menuItem) {
        return N0(this, menuItem.getItemId(), new defpackage.u(23, this, menuItem), 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    @Override // xsna.ww50
    public final boolean a0() {
        ?? r0;
        hfl0 hfl0Var = this.o0;
        ?? r1 = hfl0Var.c;
        return (r1 != 0 && r1.t()) || ((r0 = hfl0Var.c) != 0 && r0.a0()) || y0().a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(FragmentImpl fragmentImpl, Intent intent) {
        boolean z;
        boolean z2 = true;
        this.K = ((fragmentImpl instanceof ies) || M0(fragmentImpl)) ? false : true;
        boolean i2 = this.o0.d.m0().i();
        boolean z3 = (fragmentImpl instanceof rds) && intent != null && intent.getBooleanExtra("show", false);
        boolean z4 = fragmentImpl instanceof qds;
        if (z4) {
            ((qds) fragmentImpl).getClass();
            z = false;
        } else {
            z = true;
        }
        if (z4) {
        }
        if (!this.K || (i2 && !z3)) {
            z2 = false;
        }
        View view = this.A;
        if (view != null) {
            bwt0.p0(view, z);
            if (z && z2) {
                view.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
            } else if (z) {
                view.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
            }
        }
    }

    @Override // xsna.kcs
    public final void b(FragmentEntry fragmentEntry) {
        int i2;
        if (Q0.containsKey(fragmentEntry != null ? fragmentEntry.b : null)) {
            Intent intent = this.b.getIntent();
            Integer num = (Integer) Q0.get(fragmentEntry != null ? fragmentEntry.b : null);
            if (num != null) {
                i2 = num.intValue();
            } else {
                Bundle extras = intent.getExtras();
                i2 = extras != null ? extras.getInt("last_bottom_menu_id", -1) : -1;
            }
            Q0(i2, false);
        }
    }

    @Override // xsna.ww50
    public final void b0(Intent intent) {
        Object obj;
        if (this.c) {
            intent.addFlags(603979776);
        }
        BottomNavigationView bottomNavigationView = this.z;
        Integer valueOf = bottomNavigationView != null ? Integer.valueOf(bottomNavigationView.getActiveMenuId()) : null;
        intent.putExtra("last_bottom_menu_id", valueOf != null ? valueOf.intValue() : B0(this.b.getIntent(), -1));
        Bundle bundleExtra = intent.getBundleExtra("args");
        Iterator it = Q0.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int intValue = ((Number) ((Map.Entry) obj).getValue()).intValue();
            if (valueOf != null && intValue == valueOf.intValue()) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        Class cls = entry != null ? (Class) entry.getKey() : null;
        if (bundleExtra == null || cls == null || bundleExtra.get("_fragment_impl_key_root_fragment") != null) {
            return;
        }
        bundleExtra.putSerializable("_fragment_impl_key_root_fragment", cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(FragmentImpl fragmentImpl) {
        Context context;
        int i2;
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.v;
        if (fitSystemWindowsFragmentWrapperFrameLayout == null || (context = fitSystemWindowsFragmentWrapperFrameLayout.getContext()) == null) {
            return;
        }
        Window window = this.b.getWindow();
        if ((fragmentImpl instanceof HomeFragment2) && this.N) {
            i2 = dhr0.Y(R.attr.vk_ui_background, bwt0.u(context));
        } else {
            if (fragmentImpl instanceof xds) {
                HashSet hashSet = iah0.a;
                if (!fnj.d(context)) {
                    i2 = ((xoo0) fragmentImpl).l2();
                }
            }
            i2 = this.O;
        }
        window.setStatusBarColor(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (com.vk.toggle.b.A.a(r3) == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(FragmentImpl fragmentImpl) {
        int i2;
        BottomNavigationView bottomNavigationView;
        FragmentActivity activity;
        Window window;
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.v;
        if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
            View view = null;
            fes fesVar = fragmentImpl instanceof fes ? (fes) fragmentImpl : null;
            if ((fragmentImpl instanceof yds) && gz80.a(30)) {
                Features.Type type = Features.Type.FEATURE_IM_KEYBOARD_ANIMATION;
                type.getClass();
            }
            fitSystemWindowsFragmentWrapperFrameLayout.setFitsSystemWindows(fesVar == null || !fesVar.df());
            Window window2 = this.b.getWindow();
            if (fragmentImpl instanceof xds) {
                Context context = fitSystemWindowsFragmentWrapperFrameLayout.getContext();
                HashSet hashSet = iah0.a;
                if (!fnj.d(context)) {
                    i2 = ((xoo0) fragmentImpl).l2();
                    window2.setStatusBarColor(i2);
                    bottomNavigationView = this.z;
                    if (bottomNavigationView != null) {
                        ees eesVar = fragmentImpl instanceof ees ? (ees) fragmentImpl : null;
                        boolean A4 = eesVar != null ? eesVar.A4() : fragmentImpl instanceof tds;
                        if ((fragmentImpl instanceof tds) && A4) {
                            tds tdsVar = (tds) fragmentImpl;
                            bottomNavigationView.setBackgroundColor(tdsVar.qc());
                            bottomNavigationView.setItemIconTintList(tdsVar.Oc());
                            bottomNavigationView.setItemTextColor(tdsVar.Oc());
                            if (!bottomNavigationView.h) {
                                bottomNavigationView.h = true;
                                bottomNavigationView.i = dhr0.m(bottomNavigationView, false);
                            }
                        } else {
                            bottomNavigationView.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
                            if (bottomNavigationView.h) {
                                bottomNavigationView.h = false;
                                SparseIntArray sparseIntArray = bottomNavigationView.i;
                                if (sparseIntArray != null) {
                                    dhr0.a.getClass();
                                    dhr0.D().getClass();
                                    bottomNavigationView.setTag(R.id.theme_tag_key, sparseIntArray);
                                }
                                bottomNavigationView.i = null;
                            }
                            bottomNavigationView.Ng();
                        }
                    }
                    X0(fragmentImpl);
                    b1(fragmentImpl);
                    if (fragmentImpl != 0 && (activity = fragmentImpl.getActivity()) != null && (window = activity.getWindow()) != null) {
                        view = window.getDecorView();
                    }
                    if (view != null) {
                        sp.u(view, fragmentImpl instanceof nds ? ((nds) fragmentImpl).W9() : dhr0.C().b);
                    }
                    fitSystemWindowsFragmentWrapperFrameLayout.requestLayout();
                }
            }
            i2 = this.O;
            window2.setStatusBarColor(i2);
            bottomNavigationView = this.z;
            if (bottomNavigationView != null) {
            }
            X0(fragmentImpl);
            b1(fragmentImpl);
            if (fragmentImpl != 0) {
                view = window.getDecorView();
            }
            if (view != null) {
            }
            fitSystemWindowsFragmentWrapperFrameLayout.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r4 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r2 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.qy90$c, xsna.wf] */
    @Override // xsna.kcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2, boolean z, pd4 pd4Var) {
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.t0;
        if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            fitSystemWindowsFragmentWrapperFrameLayout.requestApplyInsets();
        }
        I0(fragmentImpl2, fragmentImpl);
        Object p = y0().p(fragmentImpl2);
        if (p == null) {
            p = fragmentImpl2.getClass();
        }
        SwipableTabsView swipableTabsView = this.C;
        Integer num = null;
        if (swipableTabsView != null) {
            Iterator<T> it = swipableTabsView.i.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((Pair) next).j(), p)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        SwipableTabsView swipableTabsView2 = this.C;
        if (swipableTabsView2 != null) {
            f4m.E(swipableTabsView2, num != null);
        }
        if (num != null) {
            SwipableTabsView swipableTabsView3 = this.C;
            if (swipableTabsView3 != null) {
                swipableTabsView3.post(new oln0(num.intValue(), swipableTabsView3));
            }
            if (fragmentImpl2 instanceof mln0) {
                ((mln0) fragmentImpl2).N4();
            }
        }
        if (fragmentImpl2 instanceof dbs) {
            ((dbs) fragmentImpl2).ni(new ac20(this, 4));
        }
        lbs.B(fragmentImpl2, new l5l(this, fragmentImpl2, z));
        BottomNavigationView bottomNavigationView = this.z;
        r7v r7vVar = this.a0;
        r7vVar.h = bottomNavigationView;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        r7vVar.i = navigationDelegateActivity;
        r7vVar.j = fragmentImpl2;
        for (r7v.a aVar : r7vVar.l) {
            aVar.getClass();
        }
        r7vVar.a.hide();
        r7vVar.f.a();
        r7vVar.g = false;
        r7vVar.a();
        r7vVar.b();
        if (fragmentImpl != null) {
            fragmentImpl.Hn();
        }
        pd4Var.invoke();
        mhy.b(navigationDelegateActivity);
        ?? r11 = this.o0.c;
        if (r11 != 0 && !r11.v3()) {
            r11.q();
        }
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.u0;
        if (fitSystemWindowsFrameLayout != null) {
            fitSystemWindowsFrameLayout.setLastFragment(fragmentImpl2);
        }
        this.f.a(fragmentImpl, fragmentImpl2, z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vkontakte.android.ui.bottomnavigation.BottomNavigationView.a
    public final void f(androidx.appcompat.view.menu.h hVar, j58 j58Var) {
        if (this.L0 != null) {
            return;
        }
        this.a0.a.hide();
        TabMenuItemUiData.a aVar = TabMenuItemUiData.Companion;
        int i2 = hVar.a;
        aVar.getClass();
        TabMenuItemUiData a2 = TabMenuItemUiData.a.a(i2);
        Integer num = null;
        String name = a2 != null ? a2.name() : null;
        if (hVar.a == TabMenuItemUiData.MANAGED_GROUP.h()) {
            io.reactivex.rxjava3.core.x<List<sh00>> e2 = G0().e(true);
            asu0 asu0Var = asu0.a;
            this.x0.b(new io.reactivex.rxjava3.internal.operators.single.d0(e2.q(asu0Var.c()).m(asu0Var.d()), new defpackage.j0(27), null).l(new com.vk.movika.sdk.base.ui.p0(new aj50(this, 1), 29)).subscribe(new l8w(new ix50(this, j58Var, hVar, name), 10)));
            return;
        }
        s38 s38Var = (s38) this.n0.getValue();
        int i3 = hVar.a;
        EmptyList emptyList = EmptyList.b;
        if (hVar.getItemId() == TabMenuItemUiData.IM.h() && com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL)) {
            num = Integer.valueOf(g620.b + g620.d);
        }
        VkContextMenu a3 = s38Var.a(j58Var, new o720(i3, name, emptyList, num), new h4(11, name, this), new ha40(3));
        this.L0 = a3;
        if (a3 != null) {
            a3.e(new x4u(this, 19));
            a3.i(false);
        }
    }

    @Override // xsna.kcs
    public final void h(FragmentEntry fragmentEntry, boolean z, boolean z2) {
        if (fragmentEntry != null) {
            Class<? extends FragmentImpl> cls = fragmentEntry.b;
            if (Q0.containsKey(cls) && !z && z2) {
                androidx.lifecycle.f i2 = y0().i(cls);
                if (i2 instanceof bes) {
                    ((bes) i2).getClass();
                }
            }
        }
    }

    @Override // com.vk.core.view.FitSystemWindowsFrameLayout.d
    public final boolean i(Rect rect, Rect rect2) {
        FragmentImpl u = u();
        if (u != null) {
            return u.Wn(rect, rect2);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ww50
    public final void j0() {
        if (((Boolean) this.b0.getValue()).booleanValue()) {
            P0(true, false);
            y0().C(new pqz(9), true);
        }
        y0().B();
        int i2 = MusicAndroidAutoMediaService.p;
        MusicAndroidAutoMediaService.a.a(this.b);
    }

    @Override // xsna.ww50
    public final boolean k(FragmentImpl fragmentImpl) {
        return !y0().y(fragmentImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.pel0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, xsna.yw50] */
    @Override // xsna.ww50
    public final void k0(View view) {
        ViewGroup.LayoutParams layoutParams;
        BottomNavigationView bottomNavigationView;
        ViewTreeObserver x = bwt0.x(view);
        io.reactivex.rxjava3.disposables.b bVar = this.x0;
        if (x != 0) {
            final WeakReference weakReference = new WeakReference(this);
            final ?? r5 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: xsna.yw50
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    nx50 nx50Var;
                    if (!z || (nx50Var = (nx50) weakReference.get()) == null) {
                        return;
                    }
                    nx50Var.q0();
                }
            };
            x.addOnWindowFocusChangeListener(r5);
            final FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = (FitSystemWindowsFragmentWrapperFrameLayout) view;
            hg1.e(bVar, new io.reactivex.rxjava3.disposables.a(new io.reactivex.rxjava3.functions.a() { // from class: xsna.zw50
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    ViewTreeObserver x2 = bwt0.x(FitSystemWindowsFragmentWrapperFrameLayout.this);
                    if (x2 != null) {
                        x2.removeOnWindowFocusChangeListener(r5);
                    }
                }
            }));
        }
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        LayoutInflater from = LayoutInflater.from(navigationDelegateActivity);
        int i2 = 0;
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = (FitSystemWindowsFrameLayout) from.inflate(R.layout.navigation_bottom, (ViewGroup) null, false);
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout2 = this.x;
        hfl0 hfl0Var = this.o0;
        ?? r10 = hfl0Var.c;
        View view2 = r10 != 0 ? r10.getView() : null;
        if (fitSystemWindowsFrameLayout2 != null && view2 != null) {
            fitSystemWindowsFrameLayout2.removeView(view2);
        }
        this.x = (FitSystemWindowsFrameLayout) fitSystemWindowsFrameLayout.findViewById(R.id.bottom_nav_content);
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor = (FrameLayoutWithTouchInterceptor) from.inflate(R.layout.bottom_navigation_container, (ViewGroup) fitSystemWindowsFrameLayout, false);
        this.w = frameLayoutWithTouchInterceptor;
        if (frameLayoutWithTouchInterceptor != null) {
            tvt0 tvt0Var = new tvt0();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(frameLayoutWithTouchInterceptor, tvt0Var);
        }
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout3 = this.x;
        if (fitSystemWindowsFrameLayout3 != null) {
            fitSystemWindowsFrameLayout3.setFitsSystemWindows(false);
        }
        this.v = (FitSystemWindowsFragmentWrapperFrameLayout) view;
        fitSystemWindowsFrameLayout.addView(this.w, 0);
        this.y = fitSystemWindowsFrameLayout.findViewById(R.id.bottom_navigation_sliding_container);
        this.z = (BottomNavigationView) fitSystemWindowsFrameLayout.findViewById(R.id.bottom_navigation);
        CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures) && (bottomNavigationView = this.z) != null) {
            bottomNavigationView.f = R.attr.vk_ui_icon_primary;
            bottomNavigationView.e = R.attr.vk_ui_icon_secondary;
            bottomNavigationView.Ng();
        }
        BottomNavigationView bottomNavigationView2 = this.z;
        if (bottomNavigationView2 != null) {
            b68 b68Var = b68.b;
            Boolean e2 = b68.e().b.c().e();
            bottomNavigationView2.setTitlesVisibility(e2 != null ? e2.booleanValue() : false);
        }
        Q0(B0(navigationDelegateActivity.getIntent(), -1), false);
        BottomNavigationView bottomNavigationView3 = this.z;
        if (bottomNavigationView3 != null) {
            bottomNavigationView3.setOnNavigationItemSelectedListener(this);
        }
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor2 = this.w;
        if (frameLayoutWithTouchInterceptor2 != null) {
            frameLayoutWithTouchInterceptor2.setOnInterceptTouchEventListener(hfl0Var.m);
        }
        this.A = fitSystemWindowsFrameLayout.findViewById(R.id.bottom_navigation_shadow);
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout4 = (FitSystemWindowsFrameLayout) view;
        this.t0 = (FitSystemWindowsFragmentWrapperFrameLayout) fitSystemWindowsFrameLayout4;
        fitSystemWindowsFrameLayout4.setOnWindowInsetsListener(this);
        ArrayList arrayList = new ArrayList();
        CoordinatorLayout coordinatorLayout = hfl0Var.c;
        if (coordinatorLayout != null) {
            arrayList.add(coordinatorLayout);
        }
        this.D = new tib(arrayList);
        BottomNavigationView bottomNavigationView4 = this.z;
        int i3 = this.s;
        if (bottomNavigationView4 != null && (layoutParams = bottomNavigationView4.getLayoutParams()) != null) {
            layoutParams.height = i3;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.bottomMargin = i3;
        fitSystemWindowsFrameLayout.addView(view, 0, layoutParams2);
        this.O = navigationDelegateActivity.getWindow().getStatusBarColor();
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout2 = new FitSystemWindowsFragmentWrapperFrameLayout(fitSystemWindowsFrameLayout4.getContext(), 0);
        fitSystemWindowsFragmentWrapperFrameLayout2.setId(R.id.fragment_without_bottom_bar_wrapper);
        fitSystemWindowsFragmentWrapperFrameLayout2.setOnWindowInsetsListener(this);
        fitSystemWindowsFragmentWrapperFrameLayout2.setStatusBarDrawingEnabled(false);
        int childCount = fitSystemWindowsFrameLayout.getChildCount();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = fitSystemWindowsFrameLayout.getChildAt(i4);
            if (childAt.getElevation() > f2) {
                f2 = childAt.getElevation();
            }
        }
        fitSystemWindowsFragmentWrapperFrameLayout2.setElevation(f2 + 1.0f);
        fitSystemWindowsFrameLayout.addView(fitSystemWindowsFragmentWrapperFrameLayout2, fitSystemWindowsFrameLayout.getChildCount(), new ViewGroup.LayoutParams(-1, -1));
        this.u0 = fitSystemWindowsFrameLayout;
        View findViewById = fitSystemWindowsFrameLayout.findViewById(R.id.bottom_nav_overlay);
        this.B = findViewById;
        if (findViewById != null) {
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.bx50
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        nx50.this.getClass();
                    }
                    return true;
                }
            });
        }
        qmg0 qmg0Var = new qmg0(navigationDelegateActivity, new h(this), new i(this), this.r0);
        int i5 = 2;
        qmg0Var.setOverScrollMode(2);
        this.v0 = qmg0Var;
        J0(false);
        navigationDelegateActivity.setContentView(qmg0Var);
        io.reactivex.rxjava3.core.q<List<VideoUploadEvent>> b2 = fxc0.B().E().b();
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = b2.a0(asu0Var.d());
        final d dVar = new d(1, this.I0, qot0.class, "processVideoUploadEvents", "processVideoUploadEvents(Ljava/util/List;)V", 0);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.cx50
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                nx50.d.this.invoke(obj);
            }
        };
        L l = L.a;
        int i6 = 1;
        hg1.e(bVar, a0.subscribe(fVar, new m60(new e(1, l, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1)));
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            wvv.b(wvv.a, new y83(this, i6), 0L, 0L, 14);
        } else {
            hg1.e(bVar, ((ylf) this.g0.getValue()).b().a0(asu0Var.d()).U(new jm(new im(i5))).subscribe(new ex50(new dx50(this), i2), new acj(new g(1, l, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i6)));
        }
        hg1.e(bVar, H0().c().a0(asu0Var.d()).subscribe(new q27(new kpy(this, i6), i6), new jx50(new sx50(1, l, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0)));
        hg1.e(bVar, E0().j().a0(asu0Var.d()).subscribe(new lx50(new kx50(this), 0), new opy(new tx50(1, l, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i6)));
        hg1.e(bVar, H0().g().a0(asu0Var.d()).subscribe(new mx50(new jal(this, i6), i2), new gd9(new ux50(1, l, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i5)));
        Object obj = this.p0.a;
    }

    @Override // xsna.ww50
    public final void l(boolean z) {
        BottomNavigationView bottomNavigationView = this.z;
        if (bottomNavigationView != null) {
            for (View view : awt0.d(bottomNavigationView)) {
                if (z) {
                    d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            }
        }
    }

    @Override // xsna.ww50
    public final boolean m(boolean z) {
        FragmentImpl i2 = y0().i(HomeFragment2.class);
        if (i2 == null || i2.equals(y0().m()) || A()) {
            return false;
        }
        return y0().s(i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xdr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(Bundle bundle) {
        super.n0(bundle);
        boolean z = false;
        if (!((Boolean) this.b0.getValue()).booleanValue()) {
            if (this.g.getBoolean(this.j, false)) {
                l0(false);
            }
            if (w() != null) {
                qaj0.c(this.g, this.i, -1);
            }
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = a1wVar.l.a().a0(asu0.a.d());
        a1w a1wVar2 = q1w.a;
        if (a1wVar2 == null) {
            a1wVar2 = null;
        }
        this.x0.b(a0.subscribe(new qzv(a1wVar2, y0(), this.x0)));
        if (com.vk.toggle.b.A.a(ImFeatures.READ_ALL_IN_ALL)) {
            a1w a1wVar3 = q1w.a;
            this.x0.b(new io.reactivex.rxjava3.internal.operators.observable.i0((a1wVar3 != null ? a1wVar3 : null).l.a(), new hg1.r2()).U(new hg1.q2()).subscribe(new ax50(new xw50(this, 0), 0)));
        }
        this.x0.b(ktr.c(E0().i()).subscribe(new c340(new b340(this, 1), 1)));
        boolean z2 = bundle != null;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        ce60.b.getClass();
        if (((Boolean) ce60.n.getValue()).booleanValue()) {
            if (!ce60.j) {
                ce60.j = true;
                ce60.i.set(z2);
                if (!z2) {
                    ce60.h.clear();
                }
            }
            if (z) {
                itg0.a(navigationDelegateActivity, NewsfeedViewPostCache.b());
            }
            if (myc0.f(v0().Z())) {
                itg0.a(navigationDelegateActivity, itg0.l(fsk.u(navigationDelegateActivity, (NewsfeedOptionalAdsComponent) m7m.a(navigationDelegateActivity).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class)))));
            }
            hfl0 hfl0Var = this.o0;
            px50 px50Var = this.N0;
            ywb0 ywb0Var = (ywb0) this.R.getValue();
            hfl0Var.g = px50Var;
            hfl0Var.h = ywb0Var;
            e1j0 e1j0Var = e1j0.a;
            jst0 jst0Var = this.o;
            e1j0Var.getClass();
            e1j0.b.add(jst0Var);
            j(this.o);
        }
        ce60.i.set(z2);
        if (!z2) {
            ce60.h.clear();
        }
        z = !z2;
        if (z) {
        }
        if (myc0.f(v0().Z())) {
        }
        hfl0 hfl0Var2 = this.o0;
        px50 px50Var2 = this.N0;
        ywb0 ywb0Var2 = (ywb0) this.R.getValue();
        hfl0Var2.g = px50Var2;
        hfl0Var2.h = ywb0Var2;
        e1j0 e1j0Var2 = e1j0.a;
        jst0 jst0Var2 = this.o;
        e1j0Var2.getClass();
        e1j0.b.add(jst0Var2);
        j(this.o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (com.vk.libvideo.autoplay.e.c() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        xsna.jst0.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
    
        if (com.vk.libvideo.autoplay.e.b() != false) goto L29;
     */
    @Override // xsna.ww50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(KeyEvent keyEvent) {
        yg5 a2;
        yg5 a3;
        com.vk.libvideo.autoplay.a config;
        yg5 a4;
        com.vk.libvideo.autoplay.a config2;
        jst0 jst0Var = this.o;
        jst0Var.getClass();
        if (keyEvent.getKeyCode() == 24 && keyEvent.getAction() == 1) {
            e1j0.a.getClass();
            int i2 = e1j0.d;
            if (!jst0Var.h) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                xh5 d2 = b.C1208b.a().d();
                boolean z = epx.f((d2 == null || (a4 = d2.a()) == null || (config2 = a4.getConfig()) == null) ? null : Boolean.valueOf(config2.e()), Boolean.TRUE) || n34.s();
                if (!z) {
                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                }
                if (z) {
                    com.vk.libvideo.autoplay.e eVar2 = com.vk.libvideo.autoplay.e.a;
                }
                xh5 d3 = b.C1208b.a().d();
                if (((d3 == null || (a3 = d3.a()) == null || (config = a3.getConfig()) == null) ? null : config.d()) != null) {
                    xh5 d4 = b.C1208b.a().d();
                    if (epx.d((d4 == null || (a2 = d4.a()) == null) ? null : Float.valueOf(a2.getVolume()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        jst0.a(true);
                    }
                }
            }
            jst0Var.g = i2;
        }
        qmg0 qmg0Var = this.v0;
        return !(epx.f(qmg0Var != null ? Integer.valueOf(qmg0Var.getCurrentItem()) : null, this.w0 != null ? -1 : null) && this.s0 == 0) ? !nr2.C(keyEvent) : !nr2.C(keyEvent);
    }

    @Override // xsna.xdr0
    public final void o0(boolean z) {
        if (this.L != z) {
            this.L = z;
            V0();
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i2) {
        this.s0 = i2;
        qmg0 qmg0Var = this.v0;
        Integer valueOf = qmg0Var != null ? Integer.valueOf(qmg0Var.getCurrentItem()) : null;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        yy80 yy80Var = this.r0;
        if (i2 == 1) {
            yy80Var.a(navigationDelegateActivity);
            return;
        }
        if (i2 == 0) {
            if (epx.f(valueOf, this.w0 != null ? -1 : null)) {
                yy80Var.a(navigationDelegateActivity);
                return;
            }
        }
        if (i2 != 0 || valueOf == null) {
            return;
        }
        if (u() instanceof vds) {
            yy80Var.getClass();
        } else {
            yy80Var.b(navigationDelegateActivity);
        }
        if (v0().b() && this.N) {
            this.N = false;
            FragmentImpl w0 = w0();
            X0(w0);
            b1(w0);
        }
        ?? r7 = this.o0.c;
        if (r7 != 0) {
            r7.setCanInteract(true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i2, float f2, int i3) {
        int C0 = C0();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (C0 == 1 && this.w0 != null && i2 == 0 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = f2 / sni.k(this.b);
        }
        R0(f3);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i2) {
        this.F = i2;
        if (this.w0 != null) {
        }
        R0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i2 > 0) {
            bzu.c = true;
            return;
        }
        bzu.c();
        bzu.c = false;
        mhy.b(this.b);
        FragmentImpl u = u();
        if (u != null) {
            u.Hn();
        }
    }

    @Override // xsna.ww50
    public final FragmentImpl p(Class<? extends FragmentImpl> cls) {
        return y0().i(cls);
    }

    @Override // xsna.xdr0
    public final void p0(AppKitFragment appKitFragment, Toolbar toolbar) {
        boolean z = this.c;
        if (!z || !appKitFragment.Ci()) {
            if (z) {
                return;
            }
            if (!appKitFragment.Ci() && !appKitFragment.ea()) {
                return;
            }
        }
        u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
    }

    @Override // xsna.ww50
    public final boolean q(final int i2, Intent intent, final FragmentImpl fragmentImpl) {
        rsr rsrVar = oz50.k;
        final FragmentEntry c2 = oz50.b.c(intent.getExtras());
        if (c2 == null || !s(intent)) {
            return false;
        }
        pro0.e(new Runnable() { // from class: xsna.fx50
            @Override // java.lang.Runnable
            public final void run() {
                nx50 nx50Var = nx50.this;
                nx50Var.Z();
                nx50Var.y0().D(fragmentImpl, c2, i2);
            }
        });
        return true;
    }

    public final void q0() {
        androidx.lifecycle.f u = u();
        fcn z = z();
        int i2 = pe80.a;
        if (this.b instanceof vb0) {
            return;
        }
        if ((z instanceof kes) && ((kes) z).Xf()) {
            O0(1, null);
            return;
        }
        if ((u instanceof dbs) && ((dbs) u).N1()) {
            O0(2, null);
        } else if ((u instanceof kes) && ((kes) u).Xf()) {
            O0(1, null);
        } else {
            O0(0, null);
        }
    }

    @Override // xsna.ww50
    public final boolean r(Intent intent) {
        rsr rsrVar = oz50.k;
        FragmentEntry c2 = oz50.b.c(intent.getExtras());
        if (c2 == null || !s(intent)) {
            return false;
        }
        pro0.e(new rfw(this, c2, intent, 2));
        return true;
    }

    public final void r0() {
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor = this.w;
        if (frameLayoutWithTouchInterceptor != null) {
            frameLayoutWithTouchInterceptor.getVisibility();
        }
        Integer num = this.I;
        if (num != null && num.intValue() == 0) {
            return;
        }
        this.I = 0;
        Iterator it = j5g.O0(this.G).iterator();
        while (it.hasNext()) {
            ((i48) it.next()).a(0);
        }
    }

    public final void s0(FragmentEntry fragmentEntry, boolean z) {
        brb brbVar = new brb(this, fragmentEntry, z, 1);
        Bundle bundle = fragmentEntry.c;
        UserId userId = (UserId) bundle.getParcelable("target_user_id");
        if (userId == null && (userId = (UserId) bundle.getParcelable("target_id")) == null) {
            userId = UserId.d;
        }
        S0(userId, brbVar);
    }

    @Override // xsna.ww50
    public final void t(Class<? extends FragmentImpl> cls, Bundle bundle, boolean z) {
        s0(new FragmentEntry(cls, bundle), z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Bundle t0(Class<? extends FragmentImpl> cls, boolean z) {
        if (cls.equals((Class) this.l0.getValue())) {
            Bundle bundle = new Bundle();
            bundle.putString("referrer", "TAB_BAR".toLowerCase(Locale.ROOT));
            UserId k = E0().k();
            if (k != null) {
                bundle.putParcelable("id", k);
            }
            return bundle;
        }
        if (!cls.equals(MusicContainerFragment.class)) {
            if (cls.equals(((qqm) this.k0.getValue()).a())) {
                return ((qqm) this.k0.getValue()).c(z && y0().i(cls) == null);
            }
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_url", "https://" + a0a.d + "/audios" + v0().c());
        return bundle2;
    }

    @Override // xsna.ww50
    public final FragmentImpl u() {
        return y0().m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b25 v0() {
        return (b25) this.H0.getValue();
    }

    public final FragmentImpl w0() {
        return com.vk.toggle.d.J() ? y0().o() : u();
    }

    @Override // xsna.ww50
    public final Class<? extends FragmentImpl> x(FragmentImpl fragmentImpl) {
        return y0().p(fragmentImpl);
    }

    @Override // xsna.xdr0, xsna.ify.a
    public final void x0(int i2) {
        super.x0(i2);
        this.M = true;
        V0();
    }

    public final com.vk.core.fragments.a y0() {
        return (com.vk.core.fragments.a) this.r.getValue();
    }

    @Override // xsna.g0m0
    public final void o5(boolean z) {
    }

    @Override // xsna.g0m0
    public final void ad(int i2, Intent intent) {
    }
}
