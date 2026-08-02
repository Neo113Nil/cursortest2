package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.EnumSet;
import java.util.Iterator;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;

/* compiled from: ExtraAnalyticsCollector.kt */
/* loaded from: classes8.dex */
public final class egq implements one.video.player.e {
    public final fgq a;

    public egq(fgq fgqVar) {
        this.a = fgqVar;
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        if (deb0Var2.a == deb0Var.a && discontinuityReason == OneVideoPlayer.DiscontinuityReason.INTERNAL) {
            new xs8(4, this.a, "discontinuity".concat(BundleUtil.UNDERLINE_TAG)).invoke("internal_pos_diff", Long.valueOf(deb0Var2.b - deb0Var.b));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void c(OneVideoPlayer oneVideoPlayer, long j, int i) {
        xs8 xs8Var = new xs8(4, this.a, "processing_offset".concat(BundleUtil.UNDERLINE_TAG));
        xs8Var.invoke("total_processing_offset_us", Long.valueOf(j));
        xs8Var.invoke("frame_count", Integer.valueOf(i));
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation) {
        Integer num;
        OneVideoDecoderReuseEvaluation.DecoderReuseResult decoderReuseResult;
        EnumSet<OneVideoDecoderReuseEvaluation.DecoderDiscardReasons> enumSet;
        String str = null;
        if (oneVideoDecoderReuseEvaluation == null || (enumSet = oneVideoDecoderReuseEvaluation.e) == null) {
            num = null;
        } else {
            num = 0;
            Iterator<T> it = enumSet.iterator();
            while (it.hasNext()) {
                num = Integer.valueOf(((OneVideoDecoderReuseEvaluation.DecoderDiscardReasons) it.next()).i(num.intValue()));
            }
        }
        xs8 xs8Var = new xs8(4, this.a, "format_changed".concat(BundleUtil.UNDERLINE_TAG));
        xs8Var.invoke("mime", er10Var.a());
        if (oneVideoDecoderReuseEvaluation != null && (decoderReuseResult = oneVideoDecoderReuseEvaluation.d) != null) {
            str = decoderReuseResult.name();
        }
        xs8Var.invoke("decoder_reuse_result", str);
        xs8Var.invoke("decoder_discard_reasons", num);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
        xs8 xs8Var = new xs8(4, this.a, "underrun".concat(BundleUtil.UNDERLINE_TAG));
        xs8Var.invoke("buffer_size", Integer.valueOf(i));
        xs8Var.invoke("buffer_size_ms", Long.valueOf(j));
        xs8Var.invoke("elapsed_since_last_feed_ms", Long.valueOf(j2));
        s3q0 s3q0Var = s3q0.a;
    }
}
