package xsna;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: AACDecoder.java */
/* loaded from: classes8.dex */
public final class k extends c8l {
    public int l;
    public int m;

    @Override // xsna.c8l
    public final MediaCodec c() {
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.l, this.m);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.i));
            createAudioFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            createDecoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            return createDecoderByType;
        } catch (IOException e) {
            Log.e("xsna.k", e.getMessage(), e);
            q();
            return null;
        }
    }
}
