package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.music.stickybannerad.MusicStickyBannerReporter$MusicStickyBannerEventType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.superapp.advertisement.api.dto.BannerSlotType;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetError;
import xsna.k840;
import xsna.pv40;
import xsna.qv40;

/* compiled from: MusicPlayerAdvertisingFeature.kt */
/* loaded from: classes3.dex */
public final class ov40 extends wk50<uv40, tv40, pv40, qv40> implements o2k0 {
    public final mo8 f;
    public final p2k0 g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public ydl0 j;
    public boolean k;
    public final nv40 l;
    public Integer m;

    public ov40(sv40 sv40Var, mo8 mo8Var, p2k0 p2k0Var) {
        super(null, sv40Var);
        this.f = mo8Var;
        this.g = p2k0Var;
        this.l = new nv40(this);
        p2k0Var.M(this, this);
        G(p2k0Var.a());
    }

    @Override // xsna.o2k0
    public final void G(Integer num) {
        if (num != null) {
            io.reactivex.rxjava3.disposables.c cVar = this.i;
            if (cVar != null) {
                cVar.dispose();
            }
            this.i = null;
            if (!this.k) {
                V(num.intValue());
            }
        } else {
            io.reactivex.rxjava3.disposables.c cVar2 = this.i;
            if (cVar2 == null || Boolean.valueOf(cVar2.h()).equals(Boolean.TRUE)) {
                io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(500L, TimeUnit.MILLISECONDS);
                asu0 asu0Var = asu0.a;
                this.i = r.q(asu0Var.c()).o(asu0Var.d()).subscribe(new g66(this, 5));
            }
        }
        this.m = num;
    }

    @Override // xsna.wk50
    public final void N(tv40 tv40Var, pv40 pv40Var) {
        xl50 cVar;
        pv40 pv40Var2 = pv40Var;
        if (pv40Var2 instanceof pv40.b) {
            cVar = new qv40.e(((pv40.b) pv40Var2).b);
        } else if (!(pv40Var2 instanceof pv40.a)) {
            return;
        } else {
            cVar = new qv40.c(((pv40.a) pv40Var2).b);
        }
        T(cVar);
    }

    public final void U() {
        ydl0 ydl0Var = this.j;
        if (ydl0Var != null) {
            ydl0Var.c();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
        this.k = false;
    }

    public final void V(int i) {
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        UserProfile b = ((b25) bpn0Var.getValue()).o().b();
        BannerSlotType bannerSlotType = BannerSlotType.AD;
        String valueOf = String.valueOf(b.c.b);
        boolean z = b.i == UserSex.FEMALE;
        int e = UserProfile.e(b);
        fp01 fp01Var = k840.a.j;
        if (fp01Var == null) {
            fp01Var = null;
        }
        fp01Var.getClass();
        o2l.a.getClass();
        yy40 yy40Var = new yy40(((rv40) this.f.b).getContext(), i, new df0(valueOf, (String) com.vk.core.apps.a.c.getValue(), z, e, o2l.b("__dbg_music_debug_advertisement_player_banner", false), false));
        ydl0 ydl0Var = this.j;
        if (ydl0Var != null) {
            ydl0Var.c();
        }
        this.j = yy40Var;
        yy40Var.b = this.l;
        yy40Var.load();
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_PLAYER_ADS_BANNERS.h(), null, null, null, this.g.v0(), null, String.valueOf(i), null, MusicStickyBannerReporter$MusicStickyBannerEventType.REQUESTED.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_INVALID_AUTH_CREDENTIALS, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    @Override // xsna.o2k0
    public final Integer a() {
        throw null;
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        this.g.d(this);
        super.onDestroy();
    }
}
