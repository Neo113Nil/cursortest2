package xsna;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: LoudnessCodecController.java */
/* loaded from: classes12.dex */
public final class b900 {
    public final HashSet<MediaCodec> a = new HashSet<>();
    public final gq b = b.v7;

    @Nullable
    public LoudnessCodecController c;

    /* compiled from: LoudnessCodecController.java */
    public class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public a() {
        }

        public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            b900.this.b.getClass();
            return bundle;
        }
    }

    /* compiled from: LoudnessCodecController.java */
    public interface b {
        public static final gq v7 = new gq(23);
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void b(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        create = LoudnessCodecController.create(i, kzm.INSTANCE, new a());
        this.c = create;
        Iterator<MediaCodec> it = this.a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec(it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }
}
