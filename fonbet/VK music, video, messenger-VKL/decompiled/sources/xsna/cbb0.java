package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.mk50;

/* compiled from: PlaylistMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class cbb0 extends tl50<yab0, jbb0, vab0> {
    public static final /* synthetic */ int q1 = 0;
    public final Object i1;
    public final bpn0 j1;
    public final Object k1;
    public final Object l1;
    public wab0 m1;
    public MusicBottomSheetActionTracker n1;
    public mdv0 o1;
    public Integer p1;

    /* compiled from: PlaylistMenuModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Playlist e;
        public MusicBottomSheetActionTracker f;
        public MusicPlaybackLaunchContext g;
        public MusicBottomSheetLaunchPoint h;
        public boolean i;
        public NewsEntry j;
        public String k;
        public mdv0 l;

        public a(ContextWrapper contextWrapper, Playlist playlist) {
            super(contextWrapper, tzp0.a(null, 3));
            this.e = playlist;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            cbb0 cbb0Var = new cbb0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("PLAYLIST", this.e);
            bundle.putParcelable("REFER", this.g);
            bundle.putParcelable("LAUNCH_POINT", this.h);
            bundle.putBoolean("FORCE_DARK_THEME", this.i);
            bundle.putParcelable("NEWS_ENTRY", this.j);
            bundle.putString("UNIQUE_KEY", this.k);
            cbb0Var.setArguments(bundle);
            cbb0Var.n1 = this.f;
            cbb0Var.o1 = this.l;
            CoreFeatures coreFeatures = CoreFeatures.CORE_FIX_CLICK_BOTTOM_DIALOG;
            coreFeatures.getClass();
            this.d.G1 = com.vk.toggle.b.A.a(coreFeatures);
            return cbb0Var;
        }
    }

    public cbb0() {
        flu fluVar = new flu(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, fluVar);
        this.j1 = new bpn0(new t210(this, 18));
        this.k1 = msy.a(lazyThreadSafetyMode, new sy50(this, 8));
        this.l1 = msy.a(lazyThreadSafetyMode, new bbb0(this, 0));
    }

    public static NewsEntry bo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("NEWS_ENTRY", NewsEntry.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("NEWS_ENTRY");
            if (!(parcelable3 instanceof NewsEntry)) {
                parcelable3 = null;
            }
            parcelable = (NewsEntry) parcelable3;
        }
        return (NewsEntry) parcelable;
    }

    public static Playlist co(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("PLAYLIST", Playlist.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("PLAYLIST");
            if (!(parcelable3 instanceof Playlist)) {
                parcelable3 = null;
            }
            parcelable = (Playlist) parcelable3;
        }
        return (Playlist) parcelable;
    }

    public static MusicPlaybackLaunchContext eo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("REFER", MusicPlaybackLaunchContext.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("REFER");
            if (!(parcelable3 instanceof MusicPlaybackLaunchContext)) {
                parcelable3 = null;
            }
            parcelable = (MusicPlaybackLaunchContext) parcelable3;
        }
        return (MusicPlaybackLaunchContext) parcelable;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        wab0 wab0Var = this.m1;
        if (wab0Var == null) {
            return mk50.a.a;
        }
        this.e0 = new kgj(wab0Var.c());
        Activity h = e3m.h(requireContext());
        if (h != null) {
            this.p1 = Integer.valueOf(h.getWindow().getNavigationBarColor());
            h.getWindow().setNavigationBarColor(e3m.f(R.attr.vk_ui_background_modal, requireArguments().getBoolean("FORCE_DARK_THEME", false) ? bwt0.u(requireContext()) : requireContext()));
        }
        return new mk50.c(wab0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        jbb0 jbb0Var = (jbb0) ao50Var;
        wab0 wab0Var = this.m1;
        if (wab0Var != null) {
            wab0Var.f(jbb0Var, new lw3(1, this, cbb0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        yab0 yab0Var = (yab0) vk50Var;
        yab0Var.j.a(new f410(this, 22), this);
        yab0Var.k.a(new hb40(this, 8), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Integer num = this.p1;
        if (num != null) {
            int intValue = num.intValue();
            Activity h = e3m.h(requireContext());
            if (h != null) {
                h.getWindow().setNavigationBarColor(intValue);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Playlist co = co(bundle);
        MusicPlaybackLaunchContext eo = eo(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("LAUNCH_POINT", MusicBottomSheetLaunchPoint.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("LAUNCH_POINT");
            if (!(parcelable3 instanceof MusicBottomSheetLaunchPoint)) {
                parcelable3 = null;
            }
            parcelable = (MusicBottomSheetLaunchPoint) parcelable3;
        }
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = (MusicBottomSheetLaunchPoint) parcelable;
        this.m1 = new wab0(this, requireContext(), bundle.getBoolean("FORCE_DARK_THEME", false));
        if (musicBottomSheetLaunchPoint == null) {
            musicBottomSheetLaunchPoint = MusicBottomSheetLaunchPoint.App.b;
        }
        gbb0 gbb0Var = new gbb0(new ibb0(co, musicBottomSheetLaunchPoint, EmptyList.b, co.H, eo));
        j7b0 j7b0Var = (j7b0) this.l1.getValue();
        bpn0 bpn0Var = this.j1;
        u2b0 u2b0Var = (u2b0) bpn0Var.getValue();
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.n1;
        mdv0 mdv0Var = this.o1;
        if (mdv0Var == null) {
            mdv0Var = new mdv0(co, (u2b0) bpn0Var.getValue());
        }
        return new yab0(gbb0Var, j7b0Var, mdv0Var, u2b0Var, musicBottomSheetActionTracker);
    }
}
