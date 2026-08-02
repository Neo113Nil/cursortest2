package xsna;

import android.graphics.Matrix;
import android.net.Uri;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.source.picture.ColorMediaSource;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.TimelineException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.laf;

/* compiled from: PipelineTimelineBuilder.kt */
/* loaded from: classes16.dex */
public final class rpa0 {
    public final Size a;
    public final f100 b;

    /* compiled from: PipelineTimelineBuilder.kt */
    public static final class a {
        public final Timeline a;
        public final MediaUtils.d b;

        public a(Timeline timeline, MediaUtils.d dVar) {
            this.a = timeline;
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BuildOutput(timeline=" + this.a + ", size=" + this.b + ')';
        }
    }

    public rpa0(Size size, f100 f100Var) {
        this.a = size;
        this.b = f100Var;
    }

    public final a a(com.vk.clips.editor.state.model.a aVar, boolean z, MediaUtils.d dVar) {
        long j;
        long j2;
        Iterator<com.vk.clips.editor.state.model.c> it;
        double d;
        long j3;
        float[] fArr;
        float f;
        rpa0 rpa0Var = this;
        yzd yzdVar = aVar.b;
        lwo0 lwo0Var = new lwo0(rpa0Var.b);
        Iterator<com.vk.clips.editor.state.model.c> it2 = aVar.c.iterator();
        while (true) {
            j = 1000;
            if (!it2.hasNext()) {
                break;
            }
            com.vk.clips.editor.state.model.c next = it2.next();
            int d2 = next.d();
            int c = next.c();
            File file = next.a;
            TrackMediaSource trackMediaSource = new TrackMediaSource(Uri.fromFile(file), -1);
            float f2 = next.b;
            float f3 = next.s;
            float f4 = 1000L;
            long j4 = (long) (f2 * f3 * f4);
            long j5 = (long) (next.c * f3 * f4);
            double d3 = f3;
            VideoTransform videoTransform = next.k;
            if (videoTransform == null) {
                it = it2;
                d = d3;
                j3 = j4;
                fArr = null;
            } else {
                it = it2;
                d = d3;
                float d4 = next.d();
                float c2 = next.c();
                j3 = j4;
                Size size = rpa0Var.a;
                laf.a aVar2 = new laf.a(d4, c2, size.getWidth(), size.getHeight());
                laf.a.getClass();
                Matrix matrix = (Matrix) laf.a(videoTransform, aVar2).d();
                float max = Math.max(next.c() / c, next.d() / d2);
                matrix.preScale(max, max);
                bpn0 bpn0Var = z5l0.a;
                float[] fArr2 = new float[9];
                z5l0.c(dVar.a, dVar.b, size.getWidth(), size.getHeight(), matrix).getValues(fArr2);
                fArr = fArr2;
            }
            VideoTransformEffect videoTransformEffect = fArr != null ? new VideoTransformEffect(fArr, dVar.a, dVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, null) : null;
            FilterInfo filterInfo = next.h;
            VideoEncodedItem videoEncodedItem = new VideoEncodedItem(trackMediaSource, j3, j5, d, new VideoEffect(videoTransformEffect, filterInfo.f ? filterInfo.d() : null));
            if (yzdVar.d || yzdVar.e) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem = next.r;
                f = !clipsEditorVideoVolumeItem.c ? clipsEditorVideoVolumeItem.b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            AudioItem audioItem = new AudioItem(new TrackMediaSource(Uri.fromFile(file), -1), j3, j5, d, f, next.m.i());
            meg megVar = new meg(lwo0Var);
            megVar.c(videoEncodedItem);
            megVar.a(audioItem);
            megVar.b();
            rpa0Var = this;
            it2 = it;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = j5g.u0(e43.m(aVar.d), c5g.v(aVar.e)).iterator();
        while (it3.hasNext()) {
            ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) it3.next();
            boolean z2 = clipsEditorAudioItem.e;
            ClipsEditorMusicInfo clipsEditorMusicInfo = clipsEditorAudioItem.a;
            if (z2) {
                j2 = j;
            } else {
                float f5 = yzdVar.e ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : clipsEditorAudioItem.b;
                float f6 = clipsEditorAudioItem.c;
                float f7 = j;
                j2 = j;
                AudioItem audioItem2 = new AudioItem(new TrackMediaSource(Uri.fromFile(new File(String.valueOf(clipsEditorMusicInfo.g))), -1), (long) (clipsEditorMusicInfo.d * f6 * f7), (long) (clipsEditorMusicInfo.e * f6 * f7), f6, f5, clipsEditorAudioItem.d.i());
                long j6 = clipsEditorAudioItem.getOffset().a * j2;
                long j7 = audioItem2.c;
                if (j7 < 0 || audioItem2.d <= j7) {
                    throw new TimelineException("Invalid item: " + audioItem2);
                }
                arrayList.add(new AudioFragmentItem(audioItem2, j6));
            }
            j = j2;
        }
        ((ArrayList) lwo0Var.c).addAll(arrayList);
        if (z) {
            VideoRawItem videoRawItem = new VideoRawItem(new ColorMediaSource(-16777216, dVar.a, dVar.b), 0L, 3000000L, 1.0d, null, 16, null);
            meg megVar2 = new meg(lwo0Var);
            megVar2.c(videoRawItem);
            megVar2.b();
        }
        return new a(lwo0Var.b(), dVar);
    }
}
