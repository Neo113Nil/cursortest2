package xsna;

import com.vk.music.stickybannerad.MusicStickyBannerReporter$MusicStickyBannerEventType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetError;
import xsna.j11;
import xsna.qv40;
import xsna.ydl0;

/* compiled from: MusicPlayerAdvertisingFeature.kt */
/* loaded from: classes3.dex */
public final class nv40 implements ydl0.a {
    public final /* synthetic */ ov40 a;

    public nv40(ov40 ov40Var) {
        this.a = ov40Var;
    }

    @Override // xsna.ydl0.a
    public final void b(j11.b bVar) {
        ov40 ov40Var = this.a;
        p2k0 p2k0Var = ov40Var.g;
        ov40Var.T(qv40.d.b);
        ov40Var.U();
        int i = bVar.a;
        if (i == 3003) {
            MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType = MusicStickyBannerReporter$MusicStickyBannerEventType.NOT_RECEIVED;
            String valueOf = String.valueOf(p2k0Var.a());
            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_PLAYER_ADS_BANNERS.h(), null, null, null, p2k0Var.v0(), null, valueOf, null, musicStickyBannerReporter$MusicStickyBannerEventType.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_INVALID_AUTH_CREDENTIALS, 3, null);
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = schemeStat$TypeDevNullItem;
            l5mVar.q();
            return;
        }
        String valueOf2 = String.valueOf(p2k0Var.a());
        String valueOf3 = String.valueOf(i);
        String str = bVar.b;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2 = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_PLAYER_ADS_BANNERS.h(), null, null, null, p2k0Var.v0(), null, valueOf2, null, MusicStickyBannerReporter$MusicStickyBannerEventType.SHOW_ERROR.h(), null, valueOf3, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5458, 3, null);
        l5m l5mVar2 = new l5m(null, null, 3);
        l5mVar2.g = schemeStat$TypeDevNullItem2;
        l5mVar2.q();
    }

    @Override // xsna.ydl0.a
    public final void c(ydl0 ydl0Var, ydl0.b.AbstractC4094b.a aVar) {
        ov40 ov40Var = this.a;
        p2k0 p2k0Var = ov40Var.g;
        ydl0 ydl0Var2 = ov40Var.j;
        if (epx.f(ydl0Var2 != null ? Boolean.valueOf(ydl0Var2.d()) : null, Boolean.FALSE)) {
            ov40Var.T(qv40.b.b);
            ov40Var.k = false;
            return;
        }
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType = MusicStickyBannerReporter$MusicStickyBannerEventType.RECEIVED;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_PLAYER_ADS_BANNERS.h(), null, null, null, p2k0Var.v0(), null, String.valueOf(p2k0Var.a()), null, musicStickyBannerReporter$MusicStickyBannerEventType.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_INVALID_AUTH_CREDENTIALS, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
        ov40Var.T(new qv40.a(ydl0Var, aVar));
        ov40Var.k = true;
        if (ov40Var.h == null) {
            io.reactivex.rxjava3.internal.operators.observable.e1 R = io.reactivex.rxjava3.core.q.R(40L, TimeUnit.SECONDS);
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.disposables.c subscribe = R.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new f5y(new fju(ov40Var, 11), 6));
            ov40Var.h = subscribe;
            io.reactivex.rxjava3.disposables.b bVar = ov40Var.e;
            if (subscribe == null) {
                return;
            }
            bVar.b(subscribe);
        }
    }

    @Override // xsna.ydl0.a
    public final void onClose() {
        qv40.b bVar = qv40.b.b;
        ov40 ov40Var = this.a;
        ov40Var.T(bVar);
        ov40Var.U();
        Integer num = ov40Var.m;
        ov40Var.getClass();
        if (num != null) {
            ov40Var.V(num.intValue());
        } else {
            ov40Var.T(bVar);
        }
    }

    @Override // xsna.ydl0.a
    public final void a() {
    }

    @Override // xsna.ydl0.a
    public final void onClick() {
    }
}
