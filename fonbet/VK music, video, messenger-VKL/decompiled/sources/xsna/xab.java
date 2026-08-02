package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import com.vk.channels.impl.reactions.ChannelReactionWebViewFragment;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.im.design.view.wheel.ImWheelSelectorView;
import com.vk.im.mediascope.MediaScopeCommand;
import com.vk.media.player.video.view.SimpleVideoView;
import java.util.concurrent.TimeUnit;
import xsna.o7x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xab implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xab(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle arguments;
        int i = 1;
        switch (this.b) {
            case 0:
                ChannelReactionWebViewFragment channelReactionWebViewFragment = (ChannelReactionWebViewFragment) this.c;
                if (channelReactionWebViewFragment.P && (arguments = channelReactionWebViewFragment.getArguments()) != null) {
                    long j = arguments.getLong("channel_id_arg", 0L);
                    int i2 = arguments.getInt("cmid_arg", 0);
                    int i3 = arguments.getInt("count_arg", 0);
                    int i4 = arguments.getInt("user_count_before_arg", 0);
                    if (j != 0 && i2 != 0 && i3 > 0) {
                        a1w a1wVar = q1w.a;
                        (a1wVar != null ? a1wVar : null).D(channelReactionWebViewFragment, new htw(i2, i3, i4, j));
                    }
                }
                channelReactionWebViewFragment.finish();
                return;
            case 1:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) this.c;
                AnimStartSearchView animStartSearchView = classifiedsCatalogRootVh.b0.g;
                String query = animStartSearchView != null ? animStartSearchView.getQuery() : null;
                bpn0 bpn0Var = cqm0.a;
                if (query == null) {
                    query = "";
                }
                int length = query.length();
                AnimStartSearchView animStartSearchView2 = classifiedsCatalogRootVh.b0.g;
                if (animStartSearchView2 != null) {
                    animStartSearchView2.setSelection(length);
                    return;
                }
                return;
            case 2:
                androidx.media3.exoplayer.c cVar = (androidx.media3.exoplayer.c) this.c;
                nx5<Integer> nx5Var = cVar.D;
                Context context = cVar.f;
                String str = y2r0.a;
                int generateAudioSessionId = hq4.a(context).generateAudioSessionId();
                ?? valueOf = Integer.valueOf(generateAudioSessionId != -1 ? generateAudioSessionId : 0);
                nx5Var.e = valueOf;
                cy3 cy3Var = new cy3(i, nx5Var, valueOf);
                otu otuVar = nx5Var.b;
                if (otuVar.getLooper().getThread().isAlive()) {
                    otuVar.post(cy3Var);
                    return;
                }
                return;
            case 3:
                ((ImWheelSelectorView) this.c).d();
                return;
            case 4:
                zx10 zx10Var = (zx10) this.c;
                if (zx10Var.d <= 0) {
                    zx10Var.e = false;
                    return;
                }
                zx10Var.g.dispose();
                zx10Var.g = zx10Var.a(MediaScopeCommand.PING);
                zx10Var.c.postDelayed(zx10Var.j, 10000L);
                zx10Var.e = true;
                return;
            case 5:
                kz30 kz30Var = (kz30) this.c;
                kz30.K(kz30Var.L);
                kz30.M(kz30Var.M);
                return;
            case 6:
                xv40 xv40Var = (xv40) this.c;
                xza0 xza0Var = xv40Var.e;
                xv40Var.h = xza0Var != null ? xza0Var.getVolume() : 1.0f;
                xza0 xza0Var2 = xv40Var.e;
                if (xza0Var2 != null) {
                    xza0Var2.setVolume(0.2f);
                    return;
                }
                return;
            case 7:
                nx50 nx50Var = (nx50) this.c;
                ((jwn0) nx50Var.V.getValue()).c(nx50Var.b, null);
                return;
            case 8:
                if (epx.f(((View) this.c).getTag(37742015), rte0.n)) {
                    return;
                }
                x290.a.update(true);
                return;
            case 9:
                ((androidx.media3.exoplayer.source.m) this.c).L = true;
                return;
            case 10:
                SimpleVideoView simpleVideoView = (SimpleVideoView) this.c;
                int i5 = SimpleVideoView.V;
                AudioManager a = f5b0.a(simpleVideoView.getContext());
                a4t0 a4t0Var = simpleVideoView.s;
                if (a.requestAudioFocus(a4t0Var, simpleVideoView.H, 2) == 1) {
                    a4t0Var.onAudioFocusChange(2);
                    return;
                } else {
                    a4t0Var.onAudioFocusChange(-1);
                    return;
                }
            case 11:
                com.vk.voip.ui.c.b.h1((ejw0) this.c);
                return;
            case 12:
                o7x0 o7x0Var = (o7x0) this.c;
                if (!r6m.i()) {
                    throw new IllegalStateException("no vpn");
                }
                TimeUnit timeUnit = TimeUnit.HOURS;
                o7x0.a aVar = o7x0Var.b;
                ky6 ky6Var = o7x0Var.d;
                long millis = timeUnit.toMillis(aVar.a);
                xuo0.a.getClass();
                if (millis > xuo0.a() - ky6Var.getLong("vpn_snack_last_show", 0L)) {
                    throw new IllegalStateException("invalid time");
                }
                qaj0.c(ky6Var, "vpn_snack_last_show", Long.valueOf(xuo0.a()));
                return;
            case 13:
                ((com.mbridge.msdk.config.component.status.b) this.c).c();
                return;
            default:
                try {
                    ((cny0) this.c).k();
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
