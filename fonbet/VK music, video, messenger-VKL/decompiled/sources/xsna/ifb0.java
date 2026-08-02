package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.cmy;
import xsna.rfb0;
import xsna.t550;
import xsna.vj40;
import xsna.y050;

/* compiled from: PlaylistsContainer.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ifb0 extends CoordinatorLayout {
    public final rfb0 A;
    public final MusicPlaybackLaunchContext B;
    public final mzp0 C;
    public final Activity D;
    public final LifecycleHandler E;
    public final ViewAnimator F;
    public final View G;
    public final SwipeRefreshLayout H;
    public final t550.a I;
    public final Spinner J;
    public final utt0 K;
    public final vj40 L;
    public final ayn0 M;
    public final nfb0 N;
    public final z6b0 O;
    public final Object P;
    public final Object Q;
    public final b R;
    public final d S;
    public final c T;
    public final FragmentImpl z;

    /* compiled from: PlaylistsContainer.kt */
    public static final class b implements fsv<Integer> {
        public b() {
        }

        @Override // xsna.fsv
        public final void Ig(int i, Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            if (num2.intValue() == 0) {
                ifb0.y0(ifb0.this);
                return;
            }
            if (num2.intValue() == 1) {
                yk40 builder = ifb0.this.getMusicFragmentNavigator().builder();
                builder.b("https://" + a0a.d + "/audios" + o25.a().c() + "?section=recoms", false);
                builder.B(ifb0.this.getContext());
            }
        }

        @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            super.onMenuItemClick(menuItem);
            return true;
        }
    }

    /* compiled from: PlaylistsContainer.kt */
    public static final class c implements rfb0.a {
        public c() {
        }

        @Override // xsna.rfb0.a
        public final void a(Playlist playlist) {
            ifb0.this.O.G0(playlist, new d0w(playlist, 14));
        }

        @Override // xsna.rfb0.a
        public final void b() {
            ifb0 ifb0Var = ifb0.this;
            mzp0 mzp0Var = ifb0Var.C;
            if (mzp0Var != null) {
                mzp0Var.c(false);
            }
            ifb0Var.J0();
        }

        @Override // xsna.rfb0.a
        public final void c(rfb0 rfb0Var, Playlist playlist) {
            if (rfb0Var.R0()) {
                ifb0 ifb0Var = ifb0.this;
                z6b0 z6b0Var = ifb0Var.O;
                z6b0Var.B0(playlist);
                z6b0Var.notifyItemRangeChanged(0, 2);
                ifb0Var.L0(rfb0Var.d0());
            }
        }

        @Override // xsna.rfb0.a
        public final void d(rfb0 rfb0Var, VKApiExecutionException vKApiExecutionException) {
            ifb0 ifb0Var = ifb0.this;
            vj40 vj40Var = ifb0Var.L;
            mzp0 mzp0Var = ifb0Var.C;
            if (mzp0Var != null) {
                mzp0Var.f();
            }
            SwipeRefreshLayout swipeRefreshLayout = ifb0Var.H;
            if (swipeRefreshLayout.d) {
                swipeRefreshLayout.setRefreshing(false);
            }
            if (rfb0Var.d0() == null) {
                ViewAnimator viewAnimator = ifb0Var.F;
                viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(vj40Var.b));
                vj40.a aVar = vj40Var.c.get(vKApiExecutionException.s(), null);
                vj40Var.e.setText(j03.d(vj40Var.b.getContext(), vKApiExecutionException));
                if (aVar == null) {
                    u1u0.m(0, vj40Var.d);
                } else {
                    u1u0.m(0, vj40Var.d);
                }
            }
        }

        @Override // xsna.rfb0.a
        public final void e(rfb0 rfb0Var, Playlist playlist) {
            if (rfb0Var.R0()) {
                ifb0 ifb0Var = ifb0.this;
                z6b0 z6b0Var = ifb0Var.O;
                z6b0Var.z0(0, playlist);
                z6b0Var.notifyItemRangeChanged(0, 2);
                ifb0Var.L0(rfb0Var.d0());
            }
        }

        @Override // xsna.rfb0.a
        public final void f(VKApiExecutionException vKApiExecutionException) {
            rte0.z(ifb0.this.getContext(), vKApiExecutionException);
        }

        @Override // xsna.rfb0.a
        public final void g(rfb0 rfb0Var, VKList vKList) {
            ifb0 ifb0Var = ifb0.this;
            ifb0Var.O.n0(vKList);
            ifb0Var.K.x0(rfb0Var.a());
        }

        @Override // xsna.rfb0.a
        public final void h(rfb0 rfb0Var, Playlist playlist, boolean z) {
            if (z) {
                e(rfb0Var, playlist);
            } else {
                c(rfb0Var, playlist);
            }
        }
    }

    /* compiled from: PlaylistsContainer.kt */
    public static final class d extends b5z implements View.OnClickListener, cmy.a, fsv<Playlist> {
        public d() {
        }

        @Override // xsna.cmy.a
        public final void I2() {
            ifb0 ifb0Var = ifb0.this;
            if (ifb0Var.getModel$impl_release().a()) {
                ifb0Var.getModel$impl_release().c();
            }
        }

        @Override // xsna.fsv
        public final void Ig(int i, Playlist playlist) {
            Playlist playlist2 = playlist;
            ifb0 ifb0Var = ifb0.this;
            FragmentImpl fragmentImpl = ifb0Var.z;
            if (i == R.id.back_btn) {
                fragmentImpl.finish();
                return;
            }
            if (i == R.id.music_add_playlist_btn) {
                ifb0.y0(ifb0Var);
                return;
            }
            if (i == R.id.error_retry) {
                ifb0Var.A.refresh();
                ViewAnimator viewAnimator = ifb0Var.F;
                viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(ifb0Var.G));
                return;
            }
            if (i == R.id.playlist_menu) {
                if (playlist2 != null) {
                    ic40.j(lyd.g().w(), ifb0Var.D, playlist2, ifb0Var.B, null, null, 248);
                }
            } else if (playlist2 != null) {
                if (!ifb0Var.getModel$impl_release().a1()) {
                    lyd.g().U().a(ifb0Var.D, new y050.b.a(xx1.m(playlist2), ifb0Var.B.t(), null, null, null, 28));
                    return;
                }
                Long c0 = ifb0Var.getModel$impl_release().c0();
                if (c0.longValue() == playlist2.Db()) {
                    cvk.u(R.string.music_warning_adding_to_playlist, false);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("result", playlist2);
                fragmentImpl.setResult(-1, intent);
                fragmentImpl.finish();
            }
        }

        @Override // xsna.b5z
        public final void d(String str, int i, int i2, Intent intent) {
            ifb0 ifb0Var = ifb0.this;
            FragmentImpl fragmentImpl = ifb0Var.z;
            if ((23 == i || 25 == i) && i2 == 22) {
                cvk.w(ifb0Var.getContext().getString(R.string.music_toast_playlist_added_with_name, intent != null ? intent.getStringExtra("key_title_playlist") : null), false);
                View view = fragmentImpl.getView();
                if (view != null) {
                    bwt0.p0(view, false);
                }
                fragmentImpl.setResult(22);
                fragmentImpl.finish();
            }
        }

        @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            super.onMenuItemClick(menuItem);
            return true;
        }
    }

    public ifb0(FragmentImpl fragmentImpl, rfb0 rfb0Var, MusicPlaybackLaunchContext musicPlaybackLaunchContext, mzp0 mzp0Var) {
        super(fragmentImpl.requireContext(), null);
        this.z = fragmentImpl;
        this.A = rfb0Var;
        this.B = musicPlaybackLaunchContext;
        this.C = mzp0Var;
        Activity h = e3m.h(getContext());
        this.D = h;
        LayoutInflater from = LayoutInflater.from(getContext());
        x850 x850Var = new x850(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, x850Var);
        this.Q = msy.a(lazyThreadSafetyMode, new l1i(this, 25));
        this.R = new b();
        d dVar = new d();
        this.S = dVar;
        from.inflate(R.layout.music_playlists, this);
        ImageView imageView = (ImageView) findViewById(R.id.back_btn);
        imageView.setOnClickListener(dVar);
        imageView.setContentDescription(imageView.getContext().getString(R.string.music_talkback_go_back));
        imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, imageView.getContext())));
        this.F = (ViewAnimator) findViewById(R.id.content_animator);
        this.G = findViewById(R.id.progress);
        View findViewById = findViewById(R.id.error);
        SparseArray<vj40.a> sparseArray = new SparseArray<>();
        vj40 vj40Var = new vj40();
        vj40Var.g = EmptyDisposable.INSTANCE;
        vj40Var.b = findViewById;
        vj40Var.c = sparseArray;
        findViewById.addOnAttachStateChangeListener(vj40Var);
        View findViewById2 = findViewById.findViewById(R.id.error_retry);
        vj40Var.d = findViewById2;
        findViewById2 = findViewById2 == null ? findViewById.findViewById(R.id.error_button) : findViewById2;
        vj40Var.d = findViewById2;
        vj40Var.e = (TextView) findViewById.findViewById(R.id.error_text);
        z1q z1qVar = new z1q(this, 5);
        vj40Var.f = z1qVar;
        findViewById2.setOnClickListener(z1qVar);
        this.L = vj40Var;
        from.inflate(R.layout.music_playlists_empty_filter, (ViewGroup) findViewById(R.id.empty_wrapper));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.hfb0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                ifb0.this.A.refresh();
            }
        });
        this.H = swipeRefreshLayout;
        dhr0.a.getClass();
        dhr0.D().getClass();
        com.vk.core.ui.themes.a.c(swipeRefreshLayout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        recyclerView.setLayoutManager(linearLayoutManager);
        cmy cmyVar = new cmy(linearLayoutManager, 12);
        cmyVar.e = dVar;
        recyclerView.addOnScrollListener(cmyVar);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_nav);
        spinner.setOnItemSelectedListener(new a(spinner, this));
        spinner.setEnabled(rfb0Var.O());
        this.J = spinner;
        utt0 utt0Var = new utt0(from, R.layout.music_footer_loading, 3);
        this.K = utt0Var;
        d920 d920Var = new d920();
        d920Var.setHasStableIds(true);
        t550.a aVar = new t550.a("null", new i0b0(this, 1));
        this.I = aVar;
        aVar.x0(null);
        d920Var.x0(aVar);
        z6b0 z6b0Var = new z6b0(dVar, rfb0Var.a1(), rfb0Var.c0().longValue());
        this.O = z6b0Var;
        d920Var.x0(z6b0Var);
        d920Var.x0(utt0Var);
        recyclerView.setAdapter(d920Var);
        ScrollView scrollView = (ScrollView) findViewById(R.id.music_empty_scroll_view);
        this.N = new nfb0(scrollView, (ImageView) findViewById(R.id.music_empty_icon), (TextView) findViewById(R.id.music_empty_title), (TextView) findViewById(R.id.music_empty_description), (TextView) findViewById(R.id.music_empty_btn_1), (TextView) findViewById(R.id.music_empty_btn_2));
        scrollView.setVisibility(8);
        LifecycleHandler c2 = LifecycleHandler.c(h);
        this.E = c2;
        c2.a(dVar);
        this.M = new ayn0(recyclerView, null, 30);
        this.T = new c();
    }

    private final List<ucr> getFilterList() {
        ucr ucrVar;
        rfb0 rfb0Var = this.A;
        if (rfb0Var.a1()) {
            return Collections.singletonList(new ucr(0, K0(R.string.music_playlists_filter_label_my, new Object[0])));
        }
        if (rfb0Var.t()) {
            getContext();
            return Collections.singletonList(new ucr(0, rfb0Var.S0()));
        }
        if (rfb0Var.R0()) {
            ucrVar = new ucr(3, K0(R.string.music_playlists_filter_label_my, new Object[0]));
        } else {
            PlaylistOwner C = rfb0Var.C();
            String str = "";
            if (C != null) {
                if (C.b.b < 0) {
                    str = C.c;
                } else {
                    String str2 = C.d;
                    if (str2 != null) {
                        str = str2;
                    }
                }
            }
            ucrVar = new ucr(3, K0(R.string.music_playlists_filter_label_user, str));
        }
        return e43.l(new ucr(0, K0(R.string.music_playlists_filter_label_all, new Object[0])), ucrVar, new ucr(1, K0(R.string.music_playlists_filter_label_albums, new Object[0])), new ucr(2, K0(R.string.music_playlists_filter_label_added, new Object[0])));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xk40 getMusicFragmentNavigator() {
        return (xk40) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x2b0 getPlayerNavigationAnalyticsTracker() {
        return (x2b0) this.Q.getValue();
    }

    public static final void y0(ifb0 ifb0Var) {
        rfb0 rfb0Var = ifb0Var.A;
        int i = rfb0Var.k1() != null ? 23 : 24;
        LifecycleHandler lifecycleHandler = ifb0Var.E;
        String valueOf = String.valueOf(ifb0Var.S.b);
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        List<MusicTrack> k1 = rfb0Var.k1();
        aVar.j.putParcelableArrayList("EditPlaylistFragment.arg.musicTracks", k1 instanceof ArrayList ? (ArrayList) k1 : null);
        lifecycleHandler.g(i, valueOf, aVar.n(ifb0Var.getContext()));
    }

    public final void J0() {
        rfb0 rfb0Var = this.A;
        ArrayList d0 = rfb0Var.d0();
        mzp0 mzp0Var = this.C;
        ViewAnimator viewAnimator = this.F;
        if (d0 != null) {
            SwipeRefreshLayout swipeRefreshLayout = this.H;
            viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(swipeRefreshLayout));
            if (swipeRefreshLayout.d) {
                swipeRefreshLayout.setRefreshing(false);
            }
            this.K.x0(rfb0Var.a());
            this.I.x0(rfb0Var.n() ? l840.n : null);
            this.O.setItems(d0);
            L0(d0);
            x2b0 playerNavigationAnalyticsTracker = getPlayerNavigationAnalyticsTracker();
            if (playerNavigationAnalyticsTracker != null) {
                x2b0.c(playerNavigationAnalyticsTracker, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST, 13);
            }
            if (mzp0Var != null) {
                mzp0Var.d(this.z.getView());
            }
        } else if (rfb0Var.getError() != null) {
            viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(this.L.b));
        } else {
            viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(this.G));
            if (mzp0Var != null) {
                mzp0Var.a();
            }
            rfb0Var.A1();
        }
        Spinner spinner = this.J;
        if (spinner.getAdapter() == null) {
            spinner.setAdapter((SpinnerAdapter) new ofb0(getFilterList()));
        }
    }

    public final String K0(int i, Object... objArr) {
        return getContext().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 java.lang.String, still in use, count: 2, list:
          (r1v4 java.lang.String) from 0x0068: IF  (r1v4 java.lang.String) == (null java.lang.String)  -> B:14:0x0056 A[HIDDEN] (LINE:105)
          (r1v4 java.lang.String) from 0x006b: PHI (r1v6 java.lang.String) = (r1v4 java.lang.String), (r1v5 java.lang.String), (r1v55 java.lang.String) binds: [B:65:0x0068, B:63:0x0063, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(java.util.List<com.vk.dto.music.Playlist> r20) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.ifb0.L0(java.util.List):void");
    }

    public final rfb0 getModel$impl_release() {
        return this.A;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.r1(this.T);
        J0();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nfb0 nfb0Var = this.N;
        nfb0Var.a.postDelayed(new m50(nfb0Var, 4), 100L);
        this.M.b();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.b0(this.T);
        this.M.a();
    }

    /* compiled from: PlaylistsContainer.kt */
    public static final class a implements AdapterView.OnItemSelectedListener {
        public boolean b = true;
        public final /* synthetic */ Spinner c;
        public final /* synthetic */ ifb0 d;

        public a(Spinner spinner, ifb0 ifb0Var) {
            this.c = spinner;
            this.d = ifb0Var;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.b) {
                this.b = false;
                return;
            }
            ucr ucrVar = ((ofb0) this.c.getAdapter()).b.get(i);
            if (ucrVar != null) {
                this.d.getModel$impl_release().H1(ucrVar.a);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
