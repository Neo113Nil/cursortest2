package ru.ok.android.webrtc.protocol.screenshare.recv;

import android.media.MediaCodec;
import androidx.core.app.NotificationCompat;
import org.webrtc.ThreadUtils;

/* loaded from: classes9.dex */
public final class d extends Thread {
    public final /* synthetic */ PatchedDecoder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PatchedDecoder patchedDecoder) {
        super("AndroidVideoDecoder.outputThread");
        this.a = patchedDecoder;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.g = new ThreadUtils.ThreadChecker();
        MediaCodec mediaCodec = this.a.codec;
        while (this.a.i) {
            try {
                this.a.deliverDecodedFrame();
            } catch (NullPointerException e) {
                this.a.a(NotificationCompat.CATEGORY_ERROR, e);
            }
        }
        this.a.a(mediaCodec);
    }
}
