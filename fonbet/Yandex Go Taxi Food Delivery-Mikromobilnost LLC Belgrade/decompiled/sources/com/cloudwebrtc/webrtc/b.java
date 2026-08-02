package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.concurrent.Callable;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper b;

    public /* synthetic */ b(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, int i) {
        this.a = i;
        this.b = streamEncoderWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String implementationName$lambda$5;
        VideoEncoder.ScalingSettings scalingSettings$lambda$4;
        Boolean isHardwareEncoder$lambda$7;
        VideoEncoder.EncoderInfo encoderInfo$lambda$10;
        VideoCodecStatus release$lambda$1;
        VideoEncoder.ResolutionBitrateLimits[] resolutionBitrateLimits$lambda$9;
        int i = this.a;
        SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper = this.b;
        switch (i) {
            case 0:
                implementationName$lambda$5 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getImplementationName$lambda$5(streamEncoderWrapper);
                return implementationName$lambda$5;
            case 1:
                scalingSettings$lambda$4 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getScalingSettings$lambda$4(streamEncoderWrapper);
                return scalingSettings$lambda$4;
            case 2:
                isHardwareEncoder$lambda$7 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.isHardwareEncoder$lambda$7(streamEncoderWrapper);
                return isHardwareEncoder$lambda$7;
            case 3:
                encoderInfo$lambda$10 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getEncoderInfo$lambda$10(streamEncoderWrapper);
                return encoderInfo$lambda$10;
            case 4:
                release$lambda$1 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.release$lambda$1(streamEncoderWrapper);
                return release$lambda$1;
            default:
                resolutionBitrateLimits$lambda$9 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getResolutionBitrateLimits$lambda$9(streamEncoderWrapper);
                return resolutionBitrateLimits$lambda$9;
        }
    }
}
