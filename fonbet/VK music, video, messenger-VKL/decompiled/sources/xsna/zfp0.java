package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.k840;
import xsna.mk50;
import xsna.tfp0;
import xsna.wzm0;

/* compiled from: TrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class zfp0 extends tl50<xfp0, ggp0, tfp0> {
    public static final /* synthetic */ int x1 = 0;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final bpn0 l1;
    public final Object m1;
    public final bpn0 n1;
    public final com.vk.music.track.a o1;
    public final com.vk.music.player.d p1;
    public final g950 q1;
    public final u750 r1;
    public final Object s1;
    public final Object t1;
    public vfp0 u1;
    public MusicBottomSheetActionTracker v1;
    public Integer w1;

    /* compiled from: TrackMenuModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final MusicTrack e;
        public final MusicBottomSheetLaunchPoint f;
        public MusicBottomSheetActionTracker g;
        public MusicPlaybackLaunchContext h;
        public boolean i;
        public String j;
        public String k;

        public a(ContextWrapper contextWrapper, MusicTrack musicTrack, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            super(contextWrapper, tzp0.a(null, 3));
            this.e = musicTrack;
            this.f = musicBottomSheetLaunchPoint;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            zfp0 zfp0Var = new zfp0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MUSIC_TRACK", this.e);
            bundle.putParcelable("LAUNCH_POINT", this.f);
            bundle.putParcelable("REFER", this.h);
            bundle.putBoolean("FORCE_DARK_THEME", this.i);
            String str = this.j;
            if (str == null) {
                str = "";
            }
            Bundle arguments = zfp0Var.getArguments();
            if (arguments != null) {
                arguments.putString("BLOCK_ID", str);
            }
            String str2 = this.k;
            String str3 = str2 != null ? str2 : "";
            Bundle arguments2 = zfp0Var.getArguments();
            if (arguments2 != null) {
                arguments2.putString("SECTION_ID", str3);
            }
            zfp0Var.setArguments(bundle);
            zfp0Var.v1 = this.g;
            CoreFeatures coreFeatures = CoreFeatures.CORE_FIX_CLICK_BOTTOM_DIALOG;
            coreFeatures.getClass();
            this.d.G1 = com.vk.toggle.b.A.a(coreFeatures);
            return zfp0Var;
        }
    }

    public zfp0() {
        m5o0 m5o0Var = new m5o0(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, m5o0Var);
        this.j1 = msy.a(lazyThreadSafetyMode, new qbc0(this, 21));
        this.k1 = msy.a(lazyThreadSafetyMode, new gqh0(this, 9));
        this.l1 = new bpn0(new d3j0(this, 7));
        this.m1 = msy.a(lazyThreadSafetyMode, new bbb0(this, 28));
        this.n1 = new bpn0(new b6f0(this, 11));
        this.o1 = new com.vk.music.track.a();
        com.vk.music.player.d dVar = k840.a.f;
        this.p1 = dVar == null ? null : dVar;
        this.q1 = k840.a.i;
        s750 s750Var = k840.a.e;
        this.r1 = s750Var != null ? s750Var : null;
        this.s1 = msy.a(lazyThreadSafetyMode, new kld0(this, 16));
        this.t1 = msy.a(lazyThreadSafetyMode, new i6m0(this, 3));
    }

    public static MusicBottomSheetLaunchPoint bo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
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
        return (MusicBottomSheetLaunchPoint) parcelable;
    }

    public static MusicTrack co(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("MUSIC_TRACK", MusicTrack.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("MUSIC_TRACK");
            if (!(parcelable3 instanceof MusicTrack)) {
                parcelable3 = null;
            }
            parcelable = (MusicTrack) parcelable3;
        }
        return (MusicTrack) parcelable;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        vfp0 vfp0Var = this.u1;
        if (vfp0Var == null) {
            return mk50.a.a;
        }
        this.e0 = new kgj(vfp0Var.c());
        Activity h = e3m.h(requireContext());
        if (h != null) {
            this.w1 = Integer.valueOf(h.getWindow().getNavigationBarColor());
            h.getWindow().setNavigationBarColor(e3m.f(R.attr.vk_ui_background_modal, requireArguments().getBoolean("FORCE_DARK_THEME", false) ? bwt0.u(requireContext()) : requireContext()));
        }
        return new mk50.c(vfp0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ggp0 ggp0Var = (ggp0) ao50Var;
        vfp0 vfp0Var = this.u1;
        if (vfp0Var != null) {
            vfp0Var.f(ggp0Var, new kf8(1, this, zfp0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 11));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        xfp0 xfp0Var = (xfp0) vk50Var;
        xfp0Var.o.a(new qjm0(this, 3), this);
        xfp0Var.p.a(new l850(this, 23), this);
        xfp0Var.q.a(new hb40(this, 26), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Activity h = e3m.h(requireContext());
        Integer num = this.w1;
        if (h == null || num == null) {
            return;
        }
        h.getWindow().setNavigationBarColor(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        this.u1 = new vfp0(this, requireContext(), bundle.getBoolean("FORCE_DARK_THEME", false));
        MusicTrack co = co(bundle);
        EmptyList emptyList = EmptyList.b;
        DownloadingState downloadingState = co.J;
        wzm0.b bVar = wzm0.b.a;
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
        return new xfp0(new dgp0(new fgp0(co, bo(bundle), emptyList, downloadingState, bVar, (MusicPlaybackLaunchContext) parcelable)), new tfp0.a(bo(bundle)), this.v1, (u2b0) this.n1.getValue(), this.o1, this.q1, this.r1, (xl40) this.m1.getValue(), (x2b0) this.t1.getValue());
    }
}
