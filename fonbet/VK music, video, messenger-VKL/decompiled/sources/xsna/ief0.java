package xsna;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import kotlin.text.Regex;
import xsna.k840;

/* compiled from: RecommendedPlaylistPrettyLink.kt */
/* loaded from: classes3.dex */
public final class ief0 implements om40 {
    public final Regex a = new Regex(air.b(')', "/music/(", j5g.g0(k840.b.a.keySet(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62)));
    public final bpn0 b = new bpn0(new x1c0(1));

    @Override // xsna.om40
    public final boolean a(peq0 peq0Var) {
        return peq0.p(peq0Var, this.a, null, null, 14);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.om40
    public final void b(peq0 peq0Var, a550 a550Var, Context context, LaunchContext launchContext) {
        String str = launchContext.d;
        boolean z = peq0Var.t("autoplay") == 1;
        int intValue = ((Number) k840.b.a.getOrDefault(peq0Var.c.group(1), -1)).intValue();
        UserId c = o25.a().c();
        MusicPlaybackLaunchContext Fb = (str == null || str.length() == 0) ? MusicPlaybackLaunchContext.Q : MusicPlaybackLaunchContext.Fb(str);
        a550.b(a550Var, context, c, intValue, null, Fb.t(), null, null, 232);
        if (z) {
            ((u2b0) this.b.getValue()).N0(new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta("", false, c, intValue, 0, null, 48, null), null, null, null, 14, null), (MusicTrack) null, (List) null, Fb, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
        }
    }
}
