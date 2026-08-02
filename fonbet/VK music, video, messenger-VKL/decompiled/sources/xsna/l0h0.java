package xsna;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Size;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: SampleSourceFactory.kt */
/* loaded from: classes3.dex */
public final class l0h0 {
    public final csp a;
    public final ju4 b;
    public final boolean c;
    public final AtomicInteger d = new AtomicInteger();

    public l0h0(csp cspVar, ju4 ju4Var, boolean z) {
        this.a = cspVar;
        this.b = ju4Var;
        this.c = z;
    }

    public final xx4 a(AudioItem audioItem) {
        MediaExtractor mediaExtractor;
        int i;
        TrackMediaSource trackMediaSource = audioItem.b;
        Uri uri = trackMediaSource.b;
        int i2 = trackMediaSource.c;
        Uri uri2 = trackMediaSource.b;
        int length = uri.toString().length();
        csp cspVar = this.a;
        if (length > 0) {
            mediaExtractor = br10.a(cspVar.a, uri2);
            i = i2 == -1 ? br10.b(mediaExtractor, "audio/") : i2;
        } else {
            mediaExtractor = null;
            i = -1;
        }
        MediaExtractor mediaExtractor2 = mediaExtractor;
        AtomicInteger atomicInteger = this.d;
        if (mediaExtractor2 == null || (i == -1 && i2 == -1)) {
            if (mediaExtractor2 != null) {
                mediaExtractor2.release();
            }
            rmj0 rmj0Var = new rmj0(atomicInteger.incrementAndGet());
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.i("SampleSourceFactory", "created silent audio source (uri=" + uri2 + ", trackIndex=" + i + ')');
            }
            return rmj0Var;
        }
        if (i < 0 || i >= mediaExtractor2.getTrackCount()) {
            mediaExtractor2.release();
            throw new IllegalArgumentException("Invalid source in item=" + audioItem);
        }
        try {
            yq10 yq10Var = new yq10(atomicInteger.incrementAndGet(), mediaExtractor2, i, uri2, (ejp0) this.b.a, cspVar.d, cspVar.b.d(), this.c);
            f100 f100Var2 = cspVar.d;
            if (f100Var2 == null) {
                return yq10Var;
            }
            f100Var2.i("SampleSourceFactory", "created MediaExtractorAudioSource with format = " + yq10Var.s);
            return yq10Var;
        } catch (Throwable th) {
            mediaExtractor2.release();
            throw th;
        }
    }

    public final tht0 b(VideoItem videoItem) {
        boolean z = videoItem instanceof VideoEncodedItem;
        ju4 ju4Var = this.b;
        AtomicInteger atomicInteger = this.d;
        if (!z) {
            if (!(videoItem instanceof VideoRawItem)) {
                throw new NoWhenBranchMatchedException();
            }
            VideoRawItem videoRawItem = (VideoRawItem) videoItem;
            int incrementAndGet = atomicInteger.incrementAndGet();
            long j = videoRawItem.d - videoRawItem.c;
            ImageMediaSource imageMediaSource = videoRawItem.b;
            rye0 rye0Var = new rye0(incrementAndGet, j, imageMediaSource);
            if (imageMediaSource instanceof ImageFileMediaSource) {
                ErrorStatBuilder errorStatBuilder = (ErrorStatBuilder) ju4Var.b;
                int height = errorStatBuilder.f.getHeight() * errorStatBuilder.f.getWidth();
                int i = rye0Var.d;
                int i2 = rye0Var.e;
                if (height < i * i2) {
                    errorStatBuilder.f = new Size(i, i2);
                }
            }
            return rye0Var;
        }
        VideoEncodedItem videoEncodedItem = (VideoEncodedItem) videoItem;
        TrackMediaSource trackMediaSource = videoEncodedItem.b;
        csp cspVar = this.a;
        MediaExtractor a = br10.a(cspVar.a, trackMediaSource.b);
        int i3 = trackMediaSource.c;
        if (i3 == -1) {
            i3 = br10.b(a, "video/");
        }
        int i4 = i3;
        if (i4 < 0 || i4 >= a.getTrackCount()) {
            a.release();
            throw new IllegalArgumentException("Invalid source in item=" + videoEncodedItem);
        }
        try {
            cr10 cr10Var = new cr10(atomicInteger.incrementAndGet(), a, i4, trackMediaSource.b, this.b, cspVar.d);
            MediaFormat mediaFormat = cr10Var.o;
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.i("SampleSourceFactory", "created MediaExtractorVideoSource with format = " + mediaFormat);
            }
            ((ErrorStatBuilder) ju4Var.b).a(mediaFormat.getString("mime"), Math.max(cr10Var.p, cr10Var.q), cr10Var.r, mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) ? Integer.valueOf(mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) : null, videoEncodedItem.d - videoEncodedItem.c);
            return cr10Var;
        } catch (Throwable th) {
            a.release();
            throw th;
        }
    }
}
