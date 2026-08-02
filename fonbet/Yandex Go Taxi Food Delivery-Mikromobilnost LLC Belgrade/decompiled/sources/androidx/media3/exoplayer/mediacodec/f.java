package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import defpackage.d6z;
import defpackage.quz;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class f {
    public final HashSet a;
    public final quz b;
    public LoudnessCodecController c;

    public f() {
        quz quzVar = quz.b;
        this.a = new HashSet();
        this.b = quzVar;
    }

    public final void a(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        d6z.x(this.a.add(mediaCodec));
    }

    public final void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void c(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        create = LoudnessCodecController.create(i, com.google.common.util.concurrent.b.a(), new LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController$1
            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                f.this.b.getClass();
                return bundle;
            }
        });
        this.c = create;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }
}
