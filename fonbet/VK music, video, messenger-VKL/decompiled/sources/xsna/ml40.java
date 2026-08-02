package xsna;

import android.net.Uri;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningNavInfo;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningPlayEventSubtypes;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioInputLagItem;
import com.vk.stat.scheme.CommonCoreNetworkStat$NetworkType;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.kw40;
import xsna.xua0;

/* compiled from: MusicInputLagAnalyticsTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class ml40 implements dv40 {
    public final boolean a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new de4(24));

    public ml40(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0192, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dv40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(iwa0 iwa0Var, boolean z) {
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes;
        Uri g;
        kw40 kw40Var = iwa0Var.a;
        p4b0 p4b0Var = iwa0Var.b;
        boolean z2 = kw40Var instanceof kw40.b;
        kw40.b bVar = z2 ? (kw40.b) kw40Var : null;
        if (bVar == null) {
            return;
        }
        q4b0 q4b0Var = p4b0Var.b;
        long j = p4b0Var.d;
        boolean Wb = q4b0Var.a.Wb();
        boolean z3 = p4b0Var.a;
        xua0 xua0Var = bVar.b;
        boolean z4 = ((xua0Var instanceof xua0.b) || xua0Var.equals(xua0.f.a) || xua0Var.equals(xua0.a.a) || xua0Var.equals(xua0.d.a)) ? false : true;
        boolean z5 = j > 0;
        if (this.a && z4 && !Wb && !z3 && z5) {
            kx6 kx6Var = new kx6();
            d2x d2xVar = ((e2x) this.b.getValue()).a;
            q4b0 q4b0Var2 = p4b0Var.b;
            MusicTrack musicTrack = q4b0Var2.a;
            String str = musicTrack.i;
            String host = (str == null || (g = jeq0.g(str)) == null) ? null : g.getHost();
            ak40 ak40Var = iwa0Var.c;
            d2xVar.getClass();
            CommonAudioStat$AudioListeningNavInfo l = uzp.l(ak40Var, q4b0Var2);
            kw40.b bVar2 = z2 ? (kw40.b) kw40Var : null;
            if (bVar2 != null) {
                xua0 xua0Var2 = bVar2.b;
                if (xua0Var2.equals(xua0.e.a)) {
                    commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.PLAY_BTN;
                } else if (xua0Var2.equals(xua0.f.a)) {
                    commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.REPEAT;
                } else if (xua0Var2.equals(xua0.h.a)) {
                    commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.MIX_AND_PLAY_BTN;
                } else if (xua0Var2.equals(xua0.d.a)) {
                    commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.HEARTBEAT;
                } else if (xua0Var2 instanceof xua0.c) {
                    commonAudioStat$AudioListeningPlayEventSubtypes = ((xua0.c) xua0Var2).a == 0 ? CommonAudioStat$AudioListeningPlayEventSubtypes.FASTPLAY_LIST_BTN : CommonAudioStat$AudioListeningPlayEventSubtypes.FASTPLAY_AUDIO_BTN;
                } else if (xua0Var2 instanceof xua0.k) {
                    int i = ((xua0.k) xua0Var2).a;
                    if (i == 0) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.VOICE;
                    } else if (i == 1) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.NEXT_VOICE;
                    } else if (i != 2) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.e, new Object[]{lhg.a(i, "Unknown event trigger voice type: ")});
                        }
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.VOICE;
                    } else {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.PREV_VOICE;
                    }
                } else if (xua0Var2 instanceof xua0.i) {
                    int i2 = ((xua0.i) xua0Var2).a;
                    if (i2 == 0) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.NEXT_BTN;
                    } else if (i2 == 1) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.PREV_BTN;
                    } else if (i2 == 2) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.NEXT_BY_SYSTEM;
                    } else if (i2 != 3) {
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.e, new Object[]{lhg.a(i2, "Unknown event trigger skip type: ")});
                        }
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.NEXT_BTN;
                    } else {
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.PREV_BY_SYSTEM;
                    }
                } else if (xua0Var2 instanceof xua0.g) {
                    xua0.g gVar = (xua0.g) xua0Var2;
                    int i3 = gVar.b;
                    int i4 = gVar.a;
                    boolean z6 = i3 == 0;
                    if (i4 == 0) {
                        commonAudioStat$AudioListeningPlayEventSubtypes = z6 ? CommonAudioStat$AudioListeningPlayEventSubtypes.PULL_SLIDER_FORWARD : CommonAudioStat$AudioListeningPlayEventSubtypes.PULL_SLIDER_BACK;
                    } else if (i4 != 1) {
                        L l4 = L.a;
                        l4.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l4, L.LogType.w, new Object[]{lhg.a(i4, "Unknown event trigger seek type: ")});
                        }
                        commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.PULL_SLIDER_FORWARD;
                    } else {
                        commonAudioStat$AudioListeningPlayEventSubtypes = z6 ? CommonAudioStat$AudioListeningPlayEventSubtypes.SEEK_TAP_FORWARD : CommonAudioStat$AudioListeningPlayEventSubtypes.SEEK_TAP_BACK;
                    }
                } else {
                    commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.UNHANDLED_ON_CLIENT;
                }
            }
            commonAudioStat$AudioListeningPlayEventSubtypes = CommonAudioStat$AudioListeningPlayEventSubtypes.UNHANDLED_ON_CLIENT;
            CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes2 = commonAudioStat$AudioListeningPlayEventSubtypes;
            String str2 = musicTrack.y;
            if (str2 == null) {
                str2 = "";
            }
            long j2 = j - kw40Var.a.f;
            long j3 = j2 >= 0 ? j2 : 0L;
            CommonAudioStat$TypeAudioInputLagItem.LoadSource loadSource = musicTrack.S4() ? CommonAudioStat$TypeAudioInputLagItem.LoadSource.DOWNLOADED : q4b0Var2.c ? CommonAudioStat$TypeAudioInputLagItem.LoadSource.CACHE : CommonAudioStat$TypeAudioInputLagItem.LoadSource.NETWORK;
            int i5 = musicTrack.b;
            long j4 = musicTrack.c.b;
            CommonAudioStat$TypeAudioInputLagItem.EventType eventType = CommonAudioStat$TypeAudioInputLagItem.EventType.START;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str2);
            CommonCoreNetworkStat$NetworkType d = x260.d(com.vk.core.utils.newtork.b.c());
            NetworkType.a aVar = NetworkType.Companion;
            Set<Integer> set = com.vk.core.utils.newtork.b.c().b;
            aVar.getClass();
            kx6Var.f = new CommonAudioStat$TypeAudioInputLagItem((int) j3, i5, j4, eventType, commonAudioStat$AudioListeningPlayEventSubtypes2, commonStat$TypeTrackCodeItem, d, NetworkType.VPN.n(set), l, x260.a(com.vk.core.utils.newtork.b.c()), host, loadSource);
            kx6Var.q();
        }
    }
}
