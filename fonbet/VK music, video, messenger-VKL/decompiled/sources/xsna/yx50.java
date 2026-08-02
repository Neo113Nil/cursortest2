package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.sticker.StickersCatalogFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.fave.fragments.FavesFragment;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.home.HomeFragment2;
import com.vk.money.MoneyTransfersFragment;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.photos.legacy.PhotosFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.features.CoreFeatures;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.webapp.fragments.BugtrackerFragment;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import com.vkontakte.android.fragments.videos.VideosFragment;
import com.vkontakte.android.ui.widget.MenuListView;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.dhr0;
import xsna.k840;
import xsna.l7v;
import xsna.oz50;
import xsna.xbs;
import xsna.z720;

/* compiled from: NavigationDelegateLeftMenu.java */
/* loaded from: classes7.dex */
public final class yx50<T extends Activity & xbs> extends ni6<T> implements SlidingPaneLayout.f, FitSystemWindowsFrameLayout.d, dhr0.e, w8i {
    public static final int G = iah0.a(84);
    public View A;
    public final io.reactivex.rxjava3.disposables.b B;
    public final bpn0 C;
    public final qot0 D;
    public final bpn0 E;
    public final a F;
    public final wvw o;
    public final g7s0 p;
    public final HashMap q;
    public final HashMap r;
    public final HashMap s;

    @Nullable
    public ay50 t;
    public MenuListView u;
    public boolean v;
    public long w;
    public final ReentrantReadWriteLock x;
    public final ArrayList y;
    public FitSystemWindowsFragmentWrapperFrameLayout z;

    /* compiled from: NavigationDelegateLeftMenu.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            View decorView;
            yx50 yx50Var = yx50.this;
            NavigationDelegateActivity navigationDelegateActivity = yx50Var.b;
            Window window = navigationDelegateActivity.getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = message.what;
            if (i == 0) {
                int navigationBarColor = window.getNavigationBarColor();
                androidx.lifecycle.f u = yx50Var.u();
                boolean z = dhr0.C().b;
                if (u != null && (u instanceof nds)) {
                    z = ((nds) u).W9();
                }
                int c0 = dhr0.c0(0, navigationBarColor, z);
                if (systemUiVisibility != c0) {
                    decorView.setSystemUiVisibility(c0);
                    return;
                }
                return;
            }
            if (i == 1) {
                int i2 = (navigationDelegateActivity.getResources().getConfiguration().orientation == 1 && (iah0.n(navigationDelegateActivity) || oen.a())) ? 6914 : 5895;
                int navigationBarColor2 = window.getNavigationBarColor();
                androidx.lifecycle.f u2 = yx50Var.u();
                boolean z2 = dhr0.C().b;
                if (u2 != null && (u2 instanceof nds)) {
                    z2 = ((nds) u2).W9();
                }
                int c02 = dhr0.c0(i2, navigationBarColor2, z2);
                if (systemUiVisibility != c02) {
                    decorView.setSystemUiVisibility(c02);
                }
            }
        }
    }

    /* compiled from: NavigationDelegateLeftMenu.java */
    public class b implements ViewTreeObserver.OnWindowFocusChangeListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                yx50.this.q0();
            }
        }
    }

    /* compiled from: NavigationDelegateLeftMenu.java */
    public class c implements e {
        public boolean a = false;
        public final /* synthetic */ UserId b;
        public final /* synthetic */ Class c;
        public final /* synthetic */ Bundle d;

        public c(UserId userId, Class cls, Bundle bundle) {
            this.b = userId;
            this.c = cls;
            this.d = bundle;
        }

        @Override // xsna.yx50.e
        public final void a() {
            if (!this.a) {
                final Class cls = this.c;
                final Bundle bundle = this.d;
                yx50.this.z0(this.b, new d() { // from class: xsna.zx50
                    @Override // xsna.yx50.d
                    public final void a() {
                        yx50.this.w0(cls, bundle);
                    }
                });
                this.a = true;
            }
            u1u0.e(new xy4(4, this, this));
        }
    }

    /* compiled from: NavigationDelegateLeftMenu.java */
    public interface d {
        void a();
    }

    /* compiled from: NavigationDelegateLeftMenu.java */
    public interface e {
        void a();
    }

    public yx50(@NonNull NavigationDelegateActivity navigationDelegateActivity, boolean z) {
        super(navigationDelegateActivity, z);
        this.o = pla.e();
        this.p = (g7s0) new bpn0(new rq6(7)).getValue();
        this.q = new HashMap();
        this.r = new HashMap();
        this.s = new HashMap();
        this.v = false;
        this.w = -1L;
        this.x = new ReentrantReadWriteLock();
        this.y = new ArrayList();
        this.B = new io.reactivex.rxjava3.disposables.b();
        this.C = new bpn0(new nuj(this, 28));
        this.D = new qot0(navigationDelegateActivity, new bpn0(new v3n(this, 25)), new bpn0(new q010(this, 7)), new bpn0(new nwk(this, 24)), new bpn0(new cnh(this, 29)), new bpn0(new cr20(this, 10)), new bpn0(new x3i(this, 29)), new bpn0(new f550(this, 2)));
        this.E = new bpn0(new f5x(this, 18));
        this.F = new a(Looper.getMainLooper());
        dhr0.f(this);
    }

    public static z720.b s0() {
        CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
        coreFeatures.getClass();
        return new z720.b(com.vk.toggle.b.A.a(coreFeatures) ? R.attr.vk_ui_icon_primary : R.attr.vk_ui_accent_blue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(FragmentImpl fragmentImpl) {
        MenuListView menuListView;
        if (this.z == null || (menuListView = this.u) == null) {
            return;
        }
        if (fragmentImpl instanceof tds) {
            menuListView.b(((tds) fragmentImpl).gf());
        } else {
            menuListView.b(s0());
        }
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = this.z;
        if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
            if (fragmentImpl instanceof nds) {
                fitSystemWindowsFragmentWrapperFrameLayout.setStatusBarBackgroundColor(((nds) fragmentImpl).l2());
            } else {
                fitSystemWindowsFragmentWrapperFrameLayout.setStatusBarBackgroundColor(FitSystemWindowsFragmentWrapperFrameLayout.c(fitSystemWindowsFragmentWrapperFrameLayout.getContext()));
            }
        }
        boolean z = fragmentImpl instanceof uds;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        if (z) {
            dhr0.t0(navigationDelegateActivity.getWindow(), ((uds) fragmentImpl).o7());
        } else {
            dhr0.r0(navigationDelegateActivity);
        }
    }

    @Override // xsna.ni6, xsna.xdr0, xsna.ww50
    public final void G() {
        super.G();
        this.B.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ww50
    public final void H(fcn fcnVar) {
        super.H(fcnVar);
        if (fcnVar instanceof Dialog) {
            this.f.getClass();
            UiTracker.i.h((Dialog) fcnVar, false);
        }
    }

    @Override // xsna.ww50
    public final boolean I() {
        return this.v;
    }

    @Override // xsna.ww50
    public final void J() {
        MenuListView menuListView = this.u;
        if (menuListView != null) {
            menuListView.f();
            UsableRecyclerView usableRecyclerView = menuListView.d;
            if (usableRecyclerView != null) {
                usableRecyclerView.scrollToPosition(0);
            }
        }
    }

    @Override // xsna.ww50
    public final void K(@Nullable Bundle bundle) {
        String str = MainActivity.P;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        Intent putExtra = new Intent(navigationDelegateActivity, (Class<?>) MainActivity.class).putExtra("key_logout", true);
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        navigationDelegateActivity.startActivity(putExtra.addFlags(603979776));
    }

    @Override // xsna.ww50
    public final boolean L(@Nullable FragmentImpl fragmentImpl) {
        if (this.v) {
            ay50 ay50Var = this.t;
            if (ay50Var == null) {
                return true;
            }
            ay50Var.e();
            return true;
        }
        ay50 ay50Var2 = this.t;
        if (ay50Var2 != null) {
            ay50Var2.a();
            return true;
        }
        this.b.finish();
        return true;
    }

    @Override // xsna.ww50
    public final void M(Intent intent) {
        if (k840.b.a().equals(intent.getAction())) {
            new StandalonePlayerFragment.a().k(this.b);
            return;
        }
        rsr rsrVar = oz50.k;
        FragmentEntry c2 = oz50.b.c(intent.getExtras());
        if (!this.c || c2 == null) {
            super.M(intent);
            return;
        }
        UserId userId = (UserId) intent.getParcelableExtra("target_user_id");
        if (userId == null) {
            userId = UserId.d;
        }
        z0(userId, new xx50(this, c2));
    }

    @Override // xsna.ww50
    public final void N() {
        this.m = new io.reactivex.rxjava3.internal.operators.completable.m(new mi6(this)).q(this.n).subscribe();
    }

    @Override // xsna.ww50
    public final void O(@NonNull Menu menu) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.getActionView() != null && (item.getActionView() instanceof SearchView)) {
                Object tag = item.getActionView().getTag();
                if (tag instanceof l0i0) {
                    l0i0 l0i0Var = (l0i0) tag;
                    if (this.v) {
                        l0i0Var.getClass();
                    } else if (l0i0Var.e) {
                        l0i0Var.c.expandActionView();
                        l0i0Var.h.T4();
                    }
                }
            }
        }
        if (this.v) {
            menu.setGroupVisible(0, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // xsna.ni6, xsna.ww50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        boolean z;
        super.Q();
        MenuListView menuListView = this.u;
        if (menuListView != null) {
            menuListView.k();
        }
        FragmentImpl u = u();
        int i = G;
        if (u != null) {
            int t0 = t0(u);
            MenuListView menuListView2 = this.u;
            if (menuListView2 != null && menuListView2.d(t0) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
                marginLayoutParams.leftMargin = i;
                this.A.setLayoutParams(marginLayoutParams);
                q0();
                androidx.lifecycle.f u2 = u();
                z = u2 instanceof vds;
                NavigationDelegateActivity navigationDelegateActivity = this.b;
                if (z) {
                    navigationDelegateActivity.setRequestedOrientation(-1);
                    return;
                } else {
                    navigationDelegateActivity.setRequestedOrientation(((vds) u2).Q0());
                    return;
                }
            }
        }
        if (this.t != null && this.z != null) {
            if (u == null || u.getArguments() == null || !u.getArguments().getBoolean("no_left_menu", false)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
                marginLayoutParams2.leftMargin = i;
                this.A.setLayoutParams(marginLayoutParams2);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
                marginLayoutParams3.leftMargin = 0;
                this.A.setLayoutParams(marginLayoutParams3);
            }
        }
        q0();
        androidx.lifecycle.f u22 = u();
        z = u22 instanceof vds;
        NavigationDelegateActivity navigationDelegateActivity2 = this.b;
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ww50
    public final void S(fcn fcnVar) {
        super.S(fcnVar);
        if (fcnVar instanceof Dialog) {
            this.f.getClass();
            UiTracker.i.h((Dialog) fcnVar, true);
        }
    }

    @Override // xsna.ww50
    public final void V(Bundle bundle) {
        m820.d(this, R.id.menu_clips, false, new Bundle(bundle), 28);
    }

    @Override // xsna.ww50
    public final void X(@NonNull Bundle bundle) {
        m820.c(this, R.id.menu_superapp, false);
    }

    @Override // xsna.ww50
    public final void Y(Bundle bundle) {
        m820.d(this, R.id.menu_videos, false, new Bundle(bundle), 28);
    }

    @Override // xsna.ww50
    public final boolean a0() {
        if (!this.v) {
            return false;
        }
        ay50 ay50Var = this.t;
        if (ay50Var == null) {
            return true;
        }
        ay50Var.e();
        return true;
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
    public final void c(float f) {
        this.u.setExpansion(f);
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
    public final void d() {
        ArrayList arrayList = this.y;
        this.v = false;
        ReentrantReadWriteLock reentrantReadWriteLock = this.x;
        reentrantReadWriteLock.readLock().lock();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ((e) arrayList.get(i)).a();
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
    public final void g() {
        ArrayList arrayList = this.y;
        this.v = true;
        ReentrantReadWriteLock reentrantReadWriteLock = this.x;
        reentrantReadWriteLock.readLock().lock();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ((e) arrayList.get(i)).getClass();
            } catch (Throwable th) {
                reentrantReadWriteLock.readLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.readLock().unlock();
        mhy.b(this.b);
    }

    @Override // com.vk.core.view.FitSystemWindowsFrameLayout.d
    public final boolean i(Rect rect, Rect rect2) {
        FragmentImpl u = u();
        if (u instanceof dbs) {
            return u.Wn(rect, rect2);
        }
        return true;
    }

    @Override // xsna.ww50
    public final void j0() {
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        FragmentImpl f = navigationDelegateActivity.n().f(R.id.fragment_wrapper);
        ybs q = navigationDelegateActivity.n().q();
        if (f != null) {
            q.c(R.id.fragment_wrapper, new FragmentImpl());
        }
    }

    @Override // xsna.ww50
    public final boolean k(@NonNull FragmentImpl fragmentImpl) {
        return !fragmentImpl.getActivity().isTaskRoot();
    }

    @Override // xsna.ww50
    public final void k0(@NonNull View view) {
        int i;
        Integer valueOf = Integer.valueOf(R.id.menu_superapp);
        this.z = (FitSystemWindowsFragmentWrapperFrameLayout) view;
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        MenuListView menuListView = new MenuListView(navigationDelegateActivity, this);
        this.u = menuListView;
        menuListView.setId(R.id.left_menu);
        ay50 ay50Var = new ay50(this, view.getContext());
        this.t = ay50Var;
        ay50Var.setFitsSystemWindows(true);
        this.t.addView(this.u, new SlidingPaneLayout.e(view.getContext().getResources().getDimensionPixelSize(R.dimen.vk_left_slide_panel_navigation_width)));
        this.t.addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.A = (View) view.getParent();
        SlidingPaneLayout.e eVar = new SlidingPaneLayout.e(-1);
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = G;
        this.A.setLayoutParams(eVar);
        this.t.setPanelSlideListener(this);
        this.t.setSliderFadeColor(-16777216);
        this.u.setFitsSystemWindows(true);
        this.t.setClipToPadding(false);
        this.t.setSystemUiVisibility(CoverVideoUploadTask.y);
        this.u.setExpansion(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ay50 ay50Var2 = this.t;
        if (ay50Var2 != null) {
            ay50Var2.e();
        }
        this.u.getViewTreeObserver().addOnPreDrawListener(new by50(this));
        this.u.getViewTreeObserver().addOnGlobalLayoutListener(new cy50(this));
        MenuListView menuListView2 = this.u;
        dy50 dy50Var = new dy50(this);
        UsableRecyclerView usableRecyclerView = menuListView2.d;
        if (usableRecyclerView != null) {
            usableRecyclerView.addOnScrollListener(dy50Var);
        }
        Integer valueOf2 = Integer.valueOf(R.id.menu_podcasts);
        int i2 = R.id.menu_newsfeed;
        Integer valueOf3 = Integer.valueOf(R.id.menu_newsfeed);
        HashMap hashMap = this.q;
        hashMap.put(HomeFragment2.class, valueOf3);
        bpn0 bpn0Var = this.C;
        hashMap.put(((NotificationListComponent) j6i.b((h7m) bpn0Var.getValue(), NotificationListComponent.class)).vc().a(), Integer.valueOf(R.id.menu_feedback));
        hashMap.put(((DialogsScreenFeatureComponent) j6i.b((h7m) bpn0Var.getValue(), DialogsScreenFeatureComponent.class)).g7().a(), Integer.valueOf(R.id.menu_messages));
        hashMap.put(ClipsOwnerSwipeFragment.class, Integer.valueOf(R.id.menu_clips));
        Integer valueOf4 = Integer.valueOf(R.id.menu_friends);
        hashMap.put(FriendsFragment.class, valueOf4);
        hashMap.put(FriendsCatalogFragment.class, valueOf4);
        hashMap.put(((CommunitiesCatalogComponent) j6i.b((h7m) bpn0Var.getValue(), CommunitiesCatalogComponent.class)).a().c(), Integer.valueOf(R.id.menu_groups));
        Integer valueOf5 = Integer.valueOf(R.id.menu_photos);
        hashMap.put(PhotosFragment.class, valueOf5);
        hashMap.put(ProfileMainPhotosFragment.class, valueOf5);
        Integer valueOf6 = Integer.valueOf(R.id.menu_videos);
        hashMap.put(VideosFragment.class, valueOf6);
        hashMap.put(VideoCatalogFragment.class, valueOf6);
        hashMap.put(((GamesCatalogComponent) j6i.b((h7m) bpn0Var.getValue(), GamesCatalogComponent.class)).E().a(), Integer.valueOf(R.id.menu_games));
        hashMap.put(AppsCatalogFragment.class, Integer.valueOf(R.id.menu_vk_apps));
        hashMap.put(FavesFragment.class, Integer.valueOf(R.id.menu_fave));
        hashMap.put(DiscoverSearchFragment.class, Integer.valueOf(R.id.menu_search));
        hashMap.put(SettingsListFragment.class, Integer.valueOf(R.id.menu_settings));
        hashMap.put(MoneyTransfersFragment.class, Integer.valueOf(R.id.menu_payments));
        hashMap.put(DocumentsViewFragment.class, Integer.valueOf(R.id.menu_documents));
        hashMap.put(HelpFragment.class, Integer.valueOf(R.id.menu_support));
        hashMap.put(VkPayFragment.class, Integer.valueOf(R.id.menu_vk_pay));
        hashMap.put(FeedLikesFragment.class, Integer.valueOf(R.id.menu_feed_likes));
        hashMap.put(StickersCatalogFragment.class, Integer.valueOf(R.id.menu_stickers));
        hashMap.put(VideoCatalogFragment.class, Integer.valueOf(R.id.menu_lives));
        hashMap.put(StoryArchiveFragment.class, Integer.valueOf(R.id.menu_archive));
        hashMap.put(BugtrackerFragment.class, Integer.valueOf(R.id.menu_bugs));
        Class<? extends FragmentImpl> d2 = ((MarketOrdersComponent) j6i.b((h7m) bpn0Var.getValue(), MarketOrdersComponent.class)).S4().d();
        if (d2 != null) {
            hashMap.put(d2, Integer.valueOf(R.id.menu_market_orders));
        }
        Class<? extends FragmentImpl> b2 = ((ClassifiedsComponent) j6i.b((h7m) bpn0Var.getValue(), ClassifiedsComponent.class)).dc().b();
        if (b2 != null) {
            hashMap.put(b2, Integer.valueOf(R.id.menu_market));
        }
        hashMap.put(BirthdaysListFragment.class, Integer.valueOf(R.id.menu_birthdays));
        hashMap.put(SuperAppFragment.class, valueOf);
        Long valueOf7 = Long.valueOf(InternalVkMiniApps.PODCASTS.h().a);
        HashMap hashMap2 = this.r;
        hashMap2.put(valueOf7, valueOf2);
        hashMap2.put(Long.valueOf(InternalVkMiniApps.ADS_EASY_PROMOTE.h().a), Integer.valueOf(R.id.menu_ads_easy_promote));
        hashMap2.put(Long.valueOf(InternalVkMiniApps.WISHLIST.h().a), Integer.valueOf(R.id.menu_wishlist));
        hashMap2.put(Long.valueOf(InternalVkMiniApps.EXPERT_CARD.h().a), Integer.valueOf(R.id.menu_expert_card));
        vq.f(this.s, "podcasts", valueOf2, R.id.menu_audios, BuildConfig.FLAVOR);
        navigationDelegateActivity.setContentView(this.t);
        CoreFeatures coreFeatures = CoreFeatures.FOLDABLE_FLOW;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            Integer w = w();
            String str = this.j;
            SharedPreferences sharedPreferences = this.g;
            if (sharedPreferences.getBoolean(str, false)) {
                if (w != null) {
                    i = ((Number) ((HashMap) b58.a.getValue()).getOrDefault(w, valueOf)).intValue();
                } else {
                    bpn0 bpn0Var2 = b58.a;
                    i = R.id.menu_newsfeed;
                }
                if (this.u.d(i) == null) {
                    this.u.setCurrentItemId(R.id.menu_newsfeed);
                } else {
                    m820.c(this, i, false);
                    this.u.setCurrentItemId(i);
                    i2 = i;
                }
                qaj0.c(sharedPreferences, this.i, Integer.valueOf(i2));
                l0(false);
            }
        } else if (this.c) {
            this.u.setCurrentItemId(R.id.menu_newsfeed);
        }
        ((FitSystemWindowsFrameLayout) view).setOnWindowInsetsListener(this);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new b());
        bwt0.V(this.u, new vex(this, 10));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.p.E().b().a0(asu0.a.d());
        qot0 qot0Var = this.D;
        Objects.requireNonNull(qot0Var);
        io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(new dh40(qot0Var, 3), new rao());
        io.reactivex.rxjava3.disposables.b bVar = this.B;
        bVar.b(subscribe);
        bVar.b(((mxa0) this.E.getValue()).a().subscribe());
    }

    @Override // xsna.xdr0
    public final void n0(@Nullable Bundle bundle) {
        super.n0(bundle);
        if (TextUtils.isEmpty(o25.a().Z())) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new w0n(this.b, (NewsfeedOptionalAdsComponent) j6i.c((h7m) this.C.getValue(), NewsfeedOptionalAdsComponent.class), 1));
        asu0.a.getClass();
        this.B.b(itg0.l(mVar.q(asu0.m())));
    }

    @Override // xsna.ww50
    @Nullable
    public final FragmentImpl p(Class<? extends FragmentImpl> cls) {
        FragmentImpl f = this.b.n().f(R.id.fragment_wrapper);
        if (f == null || f.getClass() != cls) {
            return null;
        }
        return f;
    }

    public final void q0() {
        androidx.lifecycle.f u = u();
        boolean z = u instanceof dbs;
        a aVar = this.F;
        if (z && ((dbs) u).N1()) {
            if (aVar.hasMessages(1)) {
                return;
            }
            aVar.removeCallbacksAndMessages(null);
            aVar.sendMessageDelayed(Message.obtain(aVar, 1), 300L);
            return;
        }
        if (aVar.hasMessages(0)) {
            return;
        }
        aVar.removeCallbacksAndMessages(null);
        aVar.sendMessageDelayed(Message.obtain(aVar, 0), 300L);
    }

    @Nullable
    public final View r0(int i) {
        RecyclerView listView;
        RecyclerView.e0 findViewHolderForItemId;
        MenuListView menuListView = this.u;
        if (menuListView == null || (listView = menuListView.getListView()) == null || (findViewHolderForItemId = listView.findViewHolderForItemId(i)) == null) {
            return null;
        }
        return findViewHolderForItemId.itemView;
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        A0(u());
    }

    @Override // xsna.ww50
    public final void t(Class<? extends FragmentImpl> cls, @Nullable Bundle bundle, boolean z) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("_from_left_menu", true);
        UserId userId = (UserId) bundle.getParcelable("target_user_id");
        if (userId == null) {
            userId = (UserId) bundle.getParcelable("target_id");
        }
        if (userId == null) {
            userId = UserId.d;
        }
        if (!this.v) {
            z0(userId, new wrl(this, cls, bundle));
            return;
        }
        c cVar = new c(userId, cls, bundle);
        this.x.writeLock().lock();
        try {
            synchronized (this.y) {
                this.y.add(cVar);
            }
            this.x.writeLock().unlock();
            ay50 ay50Var = this.t;
            if (ay50Var != null) {
                ay50Var.e();
            }
        } catch (Throwable th) {
            this.x.writeLock().unlock();
            throw th;
        }
    }

    public final int t0(FragmentImpl fragmentImpl) {
        Integer num = (Integer) this.q.get(fragmentImpl.getClass());
        if (num != null) {
            return num.intValue();
        }
        if (fragmentImpl instanceof VKSuperAppBrowserFragment) {
            Integer num2 = (Integer) this.r.get(Long.valueOf(((VKSuperAppBrowserFragment) fragmentImpl).ho()));
            if (num2 != null) {
                return num2.intValue();
            }
        }
        if (!(fragmentImpl instanceof MusicCatalogFragment)) {
            return -1;
        }
        Bundle arguments = fragmentImpl.getArguments();
        HashMap hashMap = this.s;
        Integer num3 = arguments != null ? (Integer) hashMap.get(arguments.getString("audio_section", BuildConfig.FLAVOR)) : (Integer) hashMap.get(BuildConfig.FLAVOR);
        if (num3 != null) {
            return num3.intValue();
        }
        return -1;
    }

    public final u2b0 v0() {
        return ((AudioModelsComponent) j6i.b((h7m) this.C.getValue(), AudioModelsComponent.class)).r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(Class<? extends FragmentImpl> cls, Bundle bundle) {
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        FragmentImpl f = navigationDelegateActivity.n().f(R.id.fragment_wrapper);
        boolean z = this.c;
        if (f != 0 && !z) {
            fxp0 fxp0Var = UiTracker.b;
            if (fxp0Var == null) {
                fxp0Var = null;
            }
            fxp0Var.i = true;
            navigationDelegateActivity.startActivity(new oz50(cls, MainActivity.class, bundle).n(navigationDelegateActivity).addFlags(67108864));
            return;
        }
        if (f != 0 && f.getActivity().isTaskRoot() && !f.isHidden() && f.getClass() == cls) {
            boolean s = f instanceof qhh0 ? ((qhh0) f).s() : false;
            if (!s && (f instanceof r230)) {
                s = ((r230) f).Ya();
            }
            if (s) {
                return;
            }
        }
        FragmentImpl Ab = new FragmentEntry(cls, bundle).Ab();
        qaj0.c(this.g, this.i, Integer.valueOf(t0(Ab)));
        if (!(Ab instanceof VKSuperAppBrowserFragment)) {
            if ((f != 0 || !z) && (Ab instanceof HomeFragment2)) {
                UiTracker uiTracker = UiTracker.a;
                l1q0 l1q0Var = UiTracker.i;
                l1q0Var.b = true;
                l1q0Var.c = true;
            }
            try {
                UiTracker uiTracker2 = UiTracker.a;
                UiTracker.f(navigationDelegateActivity).a(f, Ab, true);
            } catch (Throwable unused) {
            }
        }
        navigationDelegateActivity.n().q().c(R.id.fragment_wrapper, Ab);
        A0(Ab);
    }

    public final void y0() {
        View r0;
        View findViewById;
        View r02;
        View findViewById2;
        wvw wvwVar = this.o;
        l7v b2 = wvwVar.b();
        HintId hintId = HintId.INFO_DISCOVER_EXPERT_PROFILE;
        if (b2.a(hintId.getId()) && (r02 = r0(R.id.menu_expert_card)) != null && (findViewById2 = r02.findViewById(R.id.leftmenu_icon)) != null) {
            Rect d2 = w11.d(findViewById2);
            if (d2.height() != 0) {
                l7v b3 = wvwVar.b();
                String id = hintId.getId();
                b3.getClass();
                l7v.b bVar = new l7v.b(id, b3, d2);
                bVar.i = true;
                bVar.j(this.b);
            }
        }
        l7v b4 = wvwVar.b();
        HintId hintId2 = HintId.VOIP_PROMO_CALLS_TAB_BAR;
        if (b4.a(hintId2.getId()) && (r0 = r0(R.id.menu_messages)) != null && (findViewById = r0.findViewById(R.id.leftmenu_icon)) != null) {
            wvwVar.b().q(findViewById, hintId2);
        }
        asu0.a.getClass();
        asu0.h().submit(new oh(this, 10));
    }

    public final void z0(UserId userId, d dVar) {
        b25 a2 = o25.a();
        if (!fkq0.c(userId) || !a2.b() || a2.a(userId)) {
            i0q0.i(0L, new g0(dVar, 17));
            return;
        }
        io.reactivex.rxjava3.core.a f = a2.f(userId);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.completable.u o = f.q(asu0.i()).o(asu0Var.d());
        sh1 sh1Var = new sh1(dVar, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.B.b(hg1.l(new io.reactivex.rxjava3.internal.operators.completable.w(o, lVar, lVar, kVar, kVar, sh1Var, kVar), this.b, 32).subscribe(kVar, new rao()));
    }
}
