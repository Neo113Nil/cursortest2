package xsna;

import android.content.Context;
import androidx.media3.exoplayer.offline.DownloadHelper;

/* compiled from: VideoTrackSelectionUtil.kt */
/* loaded from: classes8.dex */
public final class qlt0 {
    public final Long a;

    public qlt0(Context context, DownloadHelper downloadHelper) {
        long bitrateEstimate = ((jk80) fz5.d.j(context)).b.getBitrateEstimate();
        this.a = (bitrateEstimate <= 0 ? null : Long.valueOf(bitrateEstimate)) != null ? Long.valueOf((long) (r0.longValue() * 0.7f)) : null;
    }
}
