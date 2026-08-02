package androidx.heifwriter;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCodec mediaCodec = this.a.h.mEncoder;
        if (mediaCodec != null) {
            mediaCodec.signalEndOfInputStream();
        }
    }
}
