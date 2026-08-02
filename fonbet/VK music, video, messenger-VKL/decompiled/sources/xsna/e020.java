package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import xsna.fj50;
import xsna.fj50.a;
import xsna.lv10;

/* compiled from: MediaTrackMuxer.kt */
/* loaded from: classes3.dex */
public final class e020 {
    public final fj50 a;
    public final lv10.a b;
    public final f100 c;
    public int d = Integer.MIN_VALUE;
    public gr10 e;

    public e020(fj50 fj50Var, lv10.a aVar, f100 f100Var) {
        this.a = fj50Var;
        this.b = aVar;
        this.c = f100Var;
    }

    public final long a() {
        int i = this.d;
        if (i != Integer.MIN_VALUE) {
            return this.a.c.valueAt(i).d;
        }
        return Long.MIN_VALUE;
    }

    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i = bufferInfo.flags;
        int i2 = i & 2;
        f100 f100Var = this.c;
        if (i2 != 0) {
            if (f100Var != null) {
                f100Var.w("MediaTrackMuxer", "ignore config buffer=" + k3r0.b(bufferInfo));
                return;
            }
            return;
        }
        if ((i & 4) != 0) {
            if (f100Var != null) {
                f100Var.w("MediaTrackMuxer", "ignore EOS buffer=" + k3r0.b(bufferInfo));
                return;
            }
            return;
        }
        if (bufferInfo.presentationTimeUs < 0) {
            throw new IllegalArgumentException(("Wrong pts=" + k3r0.b(bufferInfo)).toString());
        }
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        int i3 = this.d;
        fj50 fj50Var = this.a;
        fj50.a valueAt = fj50Var.c.valueAt(i3);
        if (!fj50Var.e) {
            fj50Var.b.start();
            fj50Var.e = true;
        }
        long c = valueAt.c(byteBuffer, bufferInfo);
        lv10.a aVar = this.b;
        long j = (long) (aVar.c * c);
        aVar.e = j;
        foo fooVar = aVar.a;
        long j2 = aVar.d + j;
        if (j2 < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j2, "Wrong duration=").toString());
        }
        int min = Math.min(100, (int) ((j2 * 100.0f) / fooVar.a));
        if (min != 100) {
            fooVar.b.a(min, Long.MIN_VALUE);
        }
    }

    public final void c(MediaFormat mediaFormat) {
        int i = this.d;
        f100 f100Var = this.c;
        if (i != Integer.MIN_VALUE) {
            if (!new gr10(mediaFormat).equals(this.e)) {
                throw new IllegalArgumentException(("Format changed twice, old=" + this.e + ", new=" + mediaFormat).toString());
            }
            if (f100Var != null) {
                f100Var.w("MediaTrackMuxer", "Format changed twice, " + mediaFormat);
                return;
            }
            return;
        }
        fj50 fj50Var = this.a;
        SparseArray<fj50.a> sparseArray = fj50Var.c;
        MediaMuxer mediaMuxer = fj50Var.b;
        gr10 gr10Var = new gr10(mediaFormat);
        boolean z = gr10Var.c;
        if (z && fj50Var.d != -1) {
            throw new IllegalArgumentException(("Multiple video tracks are not supported, format=" + mediaFormat).toString());
        }
        int addTrack = mediaMuxer.addTrack(mediaFormat);
        fj50.a aVar = fj50Var.new a(addTrack, gr10Var);
        sparseArray.put(addTrack, aVar);
        int indexOfKey = sparseArray.indexOfKey(addTrack);
        if (indexOfKey < 0) {
            throw new IllegalStateException(lhg.a(addTrack, "Muxer encountered unregistered track index: ").toString());
        }
        if (z) {
            Integer num = gr10Var.i;
            int intValue = num != null ? num.intValue() : 0;
            if (intValue != 0) {
                mediaMuxer.setOrientationHint(intValue);
            }
            fj50Var.d = indexOfKey;
        }
        f100 f100Var2 = fj50Var.a;
        if (f100Var2 != null) {
            f100Var2.v("Muxer", "track added: index=" + addTrack + ", track=" + aVar + ", format=" + mediaFormat);
        }
        this.d = indexOfKey;
        this.e = new gr10(mediaFormat);
        if (f100Var != null) {
            f100Var.i("MediaTrackMuxer", "add track=" + this.d + ", format=" + mediaFormat);
        }
    }
}
