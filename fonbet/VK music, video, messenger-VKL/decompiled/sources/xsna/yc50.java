package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioManager;
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
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.gm50;
import xsna.ikv0;
import xsna.k840;
import xsna.lc50;
import xsna.mk50;

/* compiled from: MusicTrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class yc50 extends tl50<pc50, jd50, lc50> {
    public static final /* synthetic */ int x1 = 0;
    public hd50 i1;
    public vte0 j1;
    public final bpn0 k1 = new bpn0(new qfj(this, 27));
    public final com.vk.music.player.d l1;
    public final com.vk.music.track.a m1;
    public final bpn0 n1;
    public final Object o1;
    public MusicBottomSheetActionTracker p1;
    public final bpn0 q1;
    public final Object r1;
    public final bpn0 s1;
    public final Object t1;
    public final bpn0 u1;
    public final Object v1;
    public final b w1;

    /* compiled from: MusicTrackMenuModalBottomSheet.kt */
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
            yc50 yc50Var = new yc50();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MUSIC_TRACK", this.e);
            bundle.putParcelable("LAUNCH_POINT", this.f);
            bundle.putParcelable("REFER", this.h);
            bundle.putBoolean("FORCE_DARK_THEME", this.i);
            String str = this.j;
            if (str == null) {
                str = "";
            }
            Bundle arguments = yc50Var.getArguments();
            if (arguments != null) {
                arguments.putString("BLOCK_ID", str);
            }
            String str2 = this.k;
            String str3 = str2 != null ? str2 : "";
            Bundle arguments2 = yc50Var.getArguments();
            if (arguments2 != null) {
                arguments2.putString("SECTION_ID", str3);
            }
            yc50Var.setArguments(bundle);
            yc50Var.p1 = this.g;
            return yc50Var;
        }
    }

    /* compiled from: MusicTrackMenuModalBottomSheet.kt */
    public static final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final boolean t3(VkPlayerException vkPlayerException) {
            yc50 yc50Var = yc50.this;
            Context u = yc50Var.requireArguments().getBoolean("FORCE_DARK_THEME", false) ? bwt0.u(yc50Var.requireContext()) : yc50Var.requireContext();
            if (vkPlayerException instanceof VkPlayerException.NoVkMixException) {
                ikv0.a aVar = new ikv0.a(u);
                aVar.u = new ikv0.d(yc50Var.requireContext().getString(R.string.music_player_snack_bar_mix_by_track_not_found), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                hd50 hd50Var = yc50Var.i1;
                View view = (hd50Var != null ? hd50Var : null).e;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                int a = wtu.a(17);
                if (a != -1) {
                    view.performHapticFeedback(a);
                    return true;
                }
            } else {
                if (!(vkPlayerException instanceof VkPlayerException.NetworkError)) {
                    return false;
                }
                int i = ((VkPlayerException.NetworkError) vkPlayerException).g() ? R.string.music_player_snack_bar_internet_connection_problems : R.string.music_player_snack_bar_common_error;
                ikv0.a aVar2 = new ikv0.a(u);
                aVar2.u = new ikv0.d(yc50Var.requireContext().getString(i), (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                hd50 hd50Var2 = yc50Var.i1;
                View view2 = (hd50Var2 != null ? hd50Var2 : null).e;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                int a2 = wtu.a(17);
                if (a2 != -1) {
                    view2.performHapticFeedback(a2);
                    return true;
                }
            }
            return true;
        }
    }

    public yc50() {
        com.vk.music.player.d dVar = k840.a.f;
        this.l1 = dVar == null ? null : dVar;
        this.m1 = new com.vk.music.track.a();
        this.n1 = new bpn0(new w4u(this, 20));
        pvh pvhVar = new pvh(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o1 = msy.a(lazyThreadSafetyMode, pvhVar);
        this.q1 = new bpn0(new obh(this, 24));
        this.r1 = msy.a(lazyThreadSafetyMode, new c950(this, 1));
        this.s1 = new bpn0(new nef(this, 24));
        this.t1 = msy.a(lazyThreadSafetyMode, new sim(this, 25));
        this.u1 = new bpn0(new f540(this, 2));
        this.v1 = msy.a(lazyThreadSafetyMode, new x550(this, 1));
        b bVar = new b();
        this.w1 = bVar;
        eo().P0(bVar, true);
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
        View view;
        if (co(requireArguments()).Wb()) {
            vte0 vte0Var = this.j1;
            view = (vte0Var != null ? vte0Var : null).d;
        } else {
            hd50 hd50Var = this.i1;
            view = (hd50Var != null ? hd50Var : null).e;
        }
        this.e0 = new jgj(view, 0, cn70.b(424), 42);
        return new mk50.c(view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        jd50 jd50Var = (jd50) ao50Var;
        gm50.a.b(this, jd50Var.a, new i750(this, 1));
        gm50.a.b(this, jd50Var.b, new u3u(this, 15));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        pc50 pc50Var = (pc50) vk50Var;
        pc50Var.l.a(new qi00(this, 13), this);
        pc50Var.m.a(new xc50(this, 0), this);
    }

    public final u2b0 eo() {
        return (u2b0) this.k1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        eo().n0(this.w1);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Context requireContext;
        Context requireContext2;
        Parcelable parcelable;
        Object parcelable2;
        bpn0 bpn0Var = this.n1;
        AudioManager audioManager = (AudioManager) bpn0Var.getValue();
        if (bundle.getBoolean("FORCE_DARK_THEME", false)) {
            dhr0 dhr0Var = dhr0.a;
            Context requireContext3 = requireContext();
            dhr0Var.getClass();
            requireContext = dhr0.t(requireContext3);
        } else {
            requireContext = requireContext();
        }
        this.i1 = new hd50(audioManager, requireContext, this, new ai6(1, this, yc50.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
        AudioManager audioManager2 = (AudioManager) bpn0Var.getValue();
        if (bundle.getBoolean("FORCE_DARK_THEME", false)) {
            dhr0 dhr0Var2 = dhr0.a;
            Context requireContext4 = requireContext();
            dhr0Var2.getClass();
            requireContext2 = dhr0.t(requireContext4);
        } else {
            requireContext2 = requireContext();
        }
        this.j1 = new vte0(audioManager2, requireContext2, this, new bi6(1, this, yc50.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
        MusicTrack co = co(bundle);
        MusicTrack b2 = eo().b();
        if (b2 != null) {
            b2.c = co(bundle).c;
        }
        MusicTrack b3 = eo().b();
        if (b3 != null) {
            b3.l = co(bundle).l;
        }
        EmptyList emptyList = EmptyList.b;
        com.vk.music.player.d dVar = this.l1;
        Long valueOf = dVar.b() ? Long.valueOf(dVar.d.b) : null;
        DownloadingState downloadingState = co.J;
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
        gd50 gd50Var = new gd50(new id50(co, (MusicPlaybackLaunchContext) parcelable, emptyList, emptyList, valueOf, downloadingState, bo(bundle)));
        lc50.a aVar = new lc50.a(bo(bundle));
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.p1;
        s750 s750Var = k840.a.e;
        return new pc50(gd50Var, aVar, new di5(eo(), this.m1), new od50(musicBottomSheetActionTracker, s750Var != null ? s750Var : null), nr4.b(), new wz2(dVar, (AudioManager) bpn0Var.getValue()), (otp) this.q1.getValue(), bo(bundle), (lc40) this.s1.getValue());
    }
}
