package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.concurrent.Callable;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ e(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = streamEncoderWrapper;
        this.c = obj;
        this.w = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoCodecStatus initEncode$lambda$0;
        VideoCodecStatus encode$lambda$2;
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper = this.b;
        switch (i) {
            case 0:
                initEncode$lambda$0 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.initEncode$lambda$0(streamEncoderWrapper, (VideoEncoder.Settings) obj2, (VideoEncoder.Callback) obj);
                return initEncode$lambda$0;
            default:
                encode$lambda$2 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.encode$lambda$2(streamEncoderWrapper, (VideoFrame) obj2, (VideoEncoder.EncodeInfo) obj);
                return encode$lambda$2;
        }
    }
}
