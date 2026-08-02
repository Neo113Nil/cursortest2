package ru.ok.media.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import ru.ok.media.audio.AACUtil;
import ru.ok.media.utils.DecoderBase;
import xsna.ne7;

/* loaded from: classes9.dex */
public class AACDecoder extends DecoderBase {
    public static final String AAC_MIME_TYPE = "audio/mp4a-latm";
    private static final String TAG = "Publisher";
    private int channelCount;
    private int inputSampleRate;

    @Override // ru.ok.media.utils.DecoderBase
    public MediaCodec createDecoder() {
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.inputSampleRate, this.channelCount);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(getCodecHeaders()));
            createDecoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            ne7.t(TAG, "MediaCodec configured for AAC");
            return createDecoderByType;
        } catch (IOException e) {
            ne7.o(TAG, "Failed to create AAC decoder: ", e);
            return null;
        }
    }

    @Override // ru.ok.media.utils.DecoderBase, ru.ok.media.utils.DecoderInterface
    public void setConfig(ByteBuffer byteBuffer) {
        super.setConfig(byteBuffer);
        AACUtil.StreamInfo parseStreamInfo = AACUtil.parseStreamInfo(getCodecHeaders());
        if (parseStreamInfo == null) {
            ne7.n(TAG, "Failed to parse decoder config");
        } else {
            this.inputSampleRate = parseStreamInfo.getSamplerate();
            this.channelCount = parseStreamInfo.getChannelCount();
        }
    }
}
