package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import xsna.iut0;
import xsna.k840;
import xsna.qy90;

/* compiled from: StickyMusicPlayerDelegate.kt */
/* loaded from: classes.dex */
public final class hfl0 {
    public final vx50 a;
    public final boolean b;
    public CoordinatorLayout c;
    public final u2b0 d;
    public final a e;
    public boolean f;
    public qy90.a g;
    public ywb0 h;
    public PlayState i;
    public final ifl0 j;
    public boolean k;
    public final boolean l;

    @SuppressLint({"ClickableViewAccessibility"})
    public final dfl0 m;
    public final efl0 n;
    public final ffl0 o;
    public final eaj p;

    /* compiled from: StickyMusicPlayerDelegate.kt */
    public final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            hfl0 hfl0Var = hfl0.this;
            hfl0Var.d();
            if (playState == null) {
                playState = PlayState.IDLE;
            }
            hfl0.c(hfl0Var, playState, 2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            hfl0 hfl0Var = hfl0.this;
            ?? r0 = hfl0Var.c;
            if (r0 == 0 || r0.k4() != hfl0Var.b) {
                hfl0Var.a();
            }
            hfl0.c(hfl0Var, null, 3);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void z3() {
            ?? r0 = hfl0.this.c;
            p630 mo94getModernSmallPlayerView = r0 != 0 ? r0.mo94getModernSmallPlayerView() : null;
            if (mo94getModernSmallPlayerView != null) {
                mo94getModernSmallPlayerView.a5();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [xsna.dfl0] */
    public hfl0(vx50 vx50Var) {
        this.a = vx50Var;
        boolean z = (BuildInfo.g() || BuildInfo.t()) ? false : true;
        this.b = z;
        this.d = k840.a.g().b();
        this.e = new a();
        ifl0 ifl0Var = new ifl0(this);
        this.j = ifl0Var;
        this.l = z;
        this.m = new View.OnTouchListener() { // from class: xsna.dfl0
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                FrameLayout contentLayout;
                hfl0 hfl0Var = hfl0.this;
                ?? r0 = hfl0Var.c;
                u2b0 u2b0Var = hfl0Var.d;
                if (r0 != 0 && (contentLayout = r0.getContentLayout()) != null) {
                    boolean i = u2b0Var.m0().i();
                    boolean z2 = u2b0Var.x1() != PlayerMode.LOADING;
                    if (!i && z2) {
                        if (motionEvent.getActionMasked() == 2) {
                            r0.getBottomSheetBehavior().H();
                        }
                        hfl0Var.k = true;
                        return r0.getBottomSheetBehavior().C(r0.getCoordinatorLayout(), contentLayout, motionEvent);
                    }
                }
                return false;
            }
        };
        int i = 0;
        this.n = new efl0(this, i);
        this.o = new ffl0(this, i);
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            d6q0.c(ifl0Var);
        }
        this.p = new eaj(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.pel0] */
    public static void c(final hfl0 hfl0Var, PlayState playState, int i) {
        final MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet;
        ArrayList arrayList;
        if ((i & 1) != 0) {
            playState = hfl0Var.d.m0();
        }
        boolean z = (i & 2) != 0;
        hfl0Var.getClass();
        efl0 efl0Var = hfl0Var.n;
        vx50 vx50Var = hfl0Var.a;
        NavigationDelegateActivity navigationDelegateActivity = vx50Var.a;
        nx50<AppCompatActivity> nx50Var = vx50Var.b;
        if (playState == PlayState.IDLE) {
            return;
        }
        if (hfl0Var.c != null) {
            boolean z2 = (nx50Var.M || playState.i() || hfl0Var.d.p() <= 0) ? false : true;
            FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = nx50Var.x;
            ?? r4 = hfl0Var.c;
            if (fitSystemWindowsFrameLayout != null && r4 != 0 && fitSystemWindowsFrameLayout.indexOfChild(r4.getView()) == -1) {
                fitSystemWindowsFrameLayout.addView(r4.getView(), 0);
            }
            if (nx50Var.L0()) {
                i0q0.g(efl0Var);
                i0q0.e(efl0Var);
                return;
            }
            ffl0 ffl0Var = hfl0Var.o;
            if (!z2) {
                if (z) {
                    nx50Var.a1(nx50Var.w0(), null);
                    nx50Var.U0(nx50Var.w0());
                }
                i0q0.g(efl0Var);
                i0q0.e(efl0Var);
                return;
            }
            ?? r10 = hfl0Var.c;
            if (r10 == 0 || !r10.v3()) {
                return;
            }
            i0q0.g(ffl0Var);
            i0q0.e(ffl0Var);
            return;
        }
        eaj eajVar = hfl0Var.p;
        float dimension = navigationDelegateActivity.getResources().getDimension(R.dimen.music_player_elevation);
        if (hfl0Var.b) {
            StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet = new StickyMusicPlayerBottomSheet(navigationDelegateActivity, null, 0);
            stickyMusicPlayerBottomSheet.setId(R.id.music_player);
            stickyMusicPlayerBottomSheet.setElevation(dimension);
            stickyMusicPlayerBottomSheet.setOutlineProvider(null);
            stickyMusicPlayerBottomSheet.setFocusableInTouchMode(true);
            stickyMusicPlayerBottomSheet.setFitsSystemWindows(true);
            stickyMusicPlayerBottomSheet.setSmallPlayerSize(vx50Var.a());
            musicPlayerPersistentBottomSheet = stickyMusicPlayerBottomSheet;
        } else {
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet2 = new MusicPlayerPersistentBottomSheet(navigationDelegateActivity, null, 0);
            musicPlayerPersistentBottomSheet2.setId(R.id.music_player);
            musicPlayerPersistentBottomSheet2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            musicPlayerPersistentBottomSheet2.setElevation(dimension);
            musicPlayerPersistentBottomSheet2.setOutlineProvider(null);
            musicPlayerPersistentBottomSheet2.setFocusableInTouchMode(true);
            musicPlayerPersistentBottomSheet2.w0(musicPlayerPersistentBottomSheet2.getContentLayout());
            musicPlayerPersistentBottomSheet2.setFitsSystemWindows(true);
            musicPlayerPersistentBottomSheet2.setPopupManager(hfl0Var.h);
            musicPlayerPersistentBottomSheet = musicPlayerPersistentBottomSheet2;
        }
        hfl0Var.a();
        hfl0Var.c = musicPlayerPersistentBottomSheet;
        musicPlayerPersistentBottomSheet.setPeekHeight(vx50Var.a() + nx50Var.s);
        musicPlayerPersistentBottomSheet.setHideable(true);
        musicPlayerPersistentBottomSheet.setState(5);
        qy90.a aVar = hfl0Var.g;
        if (aVar != null) {
            musicPlayerPersistentBottomSheet.z3(aVar);
        }
        if (hfl0Var.f) {
            musicPlayerPersistentBottomSheet.onResume();
        }
        u080 u080Var = new u080() { // from class: xsna.gfl0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                Application application;
                hfl0 hfl0Var2 = hfl0.this;
                boolean z3 = hfl0Var2.b;
                vx50 vx50Var2 = hfl0Var2.a;
                CoordinatorLayout coordinatorLayout = musicPlayerPersistentBottomSheet;
                if (z3) {
                    wf wfVar = (wf) coordinatorLayout;
                    wfVar.b0(bqx0Var);
                    wfVar.setPeekHeight(vx50Var2.a() + vx50Var2.b.s);
                    return bqx0.b;
                }
                int a2 = wqx0.a(bqx0Var);
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null || (application = b.getApplication()) == null) {
                    return bqx0.b;
                }
                boolean z4 = iah0.i(application) == 2;
                wf wfVar2 = (wf) coordinatorLayout;
                int p = iah0.p(coordinatorLayout.getContext());
                if (oen.a() && !z4) {
                    a2 = 0;
                }
                wfVar2.setMaxHeightBottomSheet(p - a2);
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(musicPlayerPersistentBottomSheet, u080Var);
        tib tibVar = nx50Var.D;
        if (tibVar != null && (arrayList = (ArrayList) tibVar.a) != null) {
            arrayList.add(musicPlayerPersistentBottomSheet);
        }
        hfl0Var.i = playState;
        i0q0.g(eajVar);
        i0q0.d(300L, eajVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, java.lang.Object, xsna.pel0, xsna.wf] */
    public final void a() {
        ArrayList arrayList;
        i0q0.g(this.n);
        i0q0.g(this.o);
        i0q0.g(this.p);
        this.i = null;
        ?? r1 = this.c;
        if (r1 == 0) {
            return;
        }
        tib tibVar = this.a.b.D;
        if (tibVar != null && (arrayList = (ArrayList) tibVar.a) != 0) {
            arrayList.remove((Object) r1);
        }
        ViewParent parent = r1.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(r1.getView());
        }
        r1.onDestroy();
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        ?? r0;
        ?? r02 = this.c;
        boolean z = (r02 == 0 || !r02.isVisible() || (r0 = this.c) == 0 || r0.v3()) ? false : true;
        boolean z2 = this.b;
        u2b0 u2b0Var = this.d;
        if (z2) {
            return z && !u2b0Var.m0().i();
        }
        if (z) {
            ?? r03 = this.c;
            p630 mo94getModernSmallPlayerView = r03 != 0 ? r03.mo94getModernSmallPlayerView() : null;
            if (mo94getModernSmallPlayerView == null || !bwt0.K(mo94getModernSmallPlayerView) || u2b0Var.m0().i()) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    public final void d() {
        p630 mo94getModernSmallPlayerView;
        com.vk.music.player.f H = this.d.H();
        Boolean valueOf = H != null ? Boolean.valueOf(H.n()) : null;
        if (epx.f(valueOf, Boolean.TRUE)) {
            if (!H.m()) {
                c(this, null, 3);
                return;
            }
            ?? r0 = this.c;
            mo94getModernSmallPlayerView = r0 != 0 ? r0.mo94getModernSmallPlayerView() : null;
            if (mo94getModernSmallPlayerView != null) {
                mo94getModernSmallPlayerView.Z4();
                return;
            }
            return;
        }
        if (!epx.f(valueOf, Boolean.FALSE)) {
            c(this, null, 3);
            return;
        }
        ?? r02 = this.c;
        mo94getModernSmallPlayerView = r02 != 0 ? r02.mo94getModernSmallPlayerView() : null;
        if (mo94getModernSmallPlayerView != null) {
            mo94getModernSmallPlayerView.X4();
        }
    }
}
