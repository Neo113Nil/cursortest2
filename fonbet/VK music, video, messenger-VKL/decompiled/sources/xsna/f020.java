package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.PlayableItem;
import com.vk.media.pipeline.model.timeline.Fragment;
import com.vk.media.pipeline.session.transform.task.transcode.TranscodeException;
import com.vk.media.pipeline.session.transform.task.transcode.producer.framerate.FrameRateController;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import xsna.fj50;

/* compiled from: MediaTrackTimeline.kt */
/* loaded from: classes3.dex */
public final class f020 {
    public final e020 a;
    public final f100 b;
    public long e;
    public FrameRateController k;
    public PlayableItem l;
    public long c = Long.MIN_VALUE;
    public long d = Long.MIN_VALUE;
    public long f = Long.MIN_VALUE;
    public long g = Long.MIN_VALUE;
    public long h = Long.MIN_VALUE;
    public double i = 1.0d;
    public int j = Integer.MIN_VALUE;

    public f020(e020 e020Var, f100 f100Var) {
        this.a = e020Var;
        this.b = f100Var;
    }

    public final x7l a(MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        if (j < 0) {
            throw new IllegalArgumentException(("Wrong media source position=" + k3r0.b(bufferInfo)).toString());
        }
        if (j < this.g) {
            return new x7l(DecodedSampleStatus.SKIP, null);
        }
        long j2 = this.h;
        f100 f100Var = this.b;
        if (j2 <= j) {
            if (f100Var != null) {
                f100Var.d("MediaTrackTimeline", "pts=" + bufferInfo.presentationTimeUs + " > max pts=" + this.h);
            }
            return new x7l(DecodedSampleStatus.END_OF_MEDIA, null);
        }
        int i = bufferInfo.flags;
        if ((i & 2) != 0) {
            if (f100Var != null) {
                f100Var.w("MediaTrackTimeline", "config buffer=" + k3r0.b(bufferInfo));
            }
            return new x7l(DecodedSampleStatus.SKIP, null);
        }
        if ((i & 4) != 0) {
            if (f100Var != null) {
                f100Var.v("MediaTrackTimeline", "EOS reached=" + k3r0.b(bufferInfo));
            }
            return new x7l(DecodedSampleStatus.END_OF_STREAM, null);
        }
        if (bufferInfo.size <= 0) {
            if (f100Var != null) {
                f100Var.w("MediaTrackTimeline", "empty buffer=" + k3r0.b(bufferInfo));
            }
            return new x7l(DecodedSampleStatus.SKIP, null);
        }
        long j3 = this.f;
        if (j3 == Long.MIN_VALUE) {
            this.f = j;
            bufferInfo.presentationTimeUs = this.e;
            DecodedSampleStatus decodedSampleStatus = DecodedSampleStatus.RENDER;
            FrameRateController frameRateController = this.k;
            return new x7l(decodedSampleStatus, frameRateController != null ? frameRateController.a() : null);
        }
        if (j < j3) {
            throw new IllegalArgumentException(("Wrong media source position=" + bufferInfo.presentationTimeUs).toString());
        }
        if (this.l instanceof AudioItem) {
            bufferInfo.presentationTimeUs = (this.e + j) - j3;
        } else {
            bufferInfo.presentationTimeUs = this.e + ((long) ((1 / this.i) * (j - j3)));
        }
        DecodedSampleStatus decodedSampleStatus2 = DecodedSampleStatus.RENDER;
        FrameRateController frameRateController2 = this.k;
        return new x7l(decodedSampleStatus2, frameRateController2 != null ? frameRateController2.a() : null);
    }

    public final void b(o98<? extends Fragment> o98Var, PlayableItem playableItem) {
        long j;
        fj50.a valueAt;
        int i;
        e020 e020Var = this.a;
        fj50 fj50Var = e020Var.a;
        int i2 = e020Var.d;
        long j2 = (i2 == Integer.MIN_VALUE || (i = (valueAt = fj50Var.c.valueAt(i2)).e) == 0) ? 0L : (long) (valueAt.f / i);
        if (j2 <= 0) {
            j2 = this.d;
        }
        FrameRateController frameRateController = this.k;
        if (frameRateController != null) {
            f100 f100Var = frameRateController.a;
            if (f100Var != null) {
                StringBuilder sb = new StringBuilder("in=");
                sb.append(frameRateController.e - 1);
                sb.append(", out=");
                sb.append(frameRateController.f);
                f100Var.d("FrameRateController", sb.toString());
            }
            s3q0 s3q0Var = s3q0.a;
        }
        this.k = null;
        boolean z = playableItem instanceof AudioItem;
        f100 f100Var2 = this.b;
        if (z) {
            this.g = 0L;
            this.h = o98Var.getLayout().W0() - o98Var.getLayout().O0();
        } else {
            this.i = playableItem.z();
            if (((c7s0) o98Var).a().e() != null && ((int) (r4.intValue() * this.i)) > 0 && this.j != Integer.MIN_VALUE) {
                this.k = new FrameRateController((int) (r4.intValue() * this.i), this.j, f100Var2);
            }
            this.g = Math.max(playableItem.O0(), 0L);
            this.h = playableItem.W0();
        }
        this.f = Long.MIN_VALUE;
        int i3 = e020Var.d;
        long j3 = i3 != Integer.MIN_VALUE ? fj50Var.c.valueAt(i3).d : Long.MIN_VALUE;
        if (j3 >= 0) {
            if (j3 < o98Var.getLayout().O0()) {
                j = o98Var.getLayout().O0();
            } else {
                if (f100Var2 != null) {
                    f100Var2.c("MediaTrackTimeline", new TranscodeException(new IllegalStateException("That happened: " + j3 + '/' + o98Var.getLayout().O0())));
                }
                j = j3 + j2;
            }
            this.e = j;
            if (f100Var2 != null) {
                f100Var2.d("MediaTrackTimeline", "mcs difference between fragments=" + (this.e - j3));
            }
        } else if (f100Var2 != null) {
            f100Var2.w("MediaTrackTimeline", "seems, there was no recording/encoding");
        }
        this.l = playableItem;
        if (f100Var2 != null) {
            f100Var2.d("MediaTrackTimeline", toString());
        }
    }

    public final void c(MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        if (j >= this.e) {
            this.c = j;
            return;
        }
        throw new IllegalArgumentException(("Wrong position=" + bufferInfo.presentationTimeUs + " < " + this.e).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\nencoder timeline:\n- sample duration=");
        sb.append(this.d);
        sb.append(" mcs\n- position offset=");
        sb.append(this.e);
        sb.append(" mcs\n- playable item range=[");
        PlayableItem playableItem = this.l;
        sb.append(playableItem != null ? Long.valueOf(playableItem.O0()) : null);
        sb.append(", ");
        PlayableItem playableItem2 = this.l;
        sb.append(playableItem2 != null ? Long.valueOf(playableItem2.W0()) : null);
        sb.append("]\n- media source range=[");
        sb.append(this.g);
        sb.append(", ");
        return efz.b(this.h, "]\n", sb);
    }
}
