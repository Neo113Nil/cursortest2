package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.SimulcastVideoEncoderFactoryWrapper;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.SimulcastVideoEncoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;
import org.webrtc.VideoFrame;
import org.webrtc.WrappedNativeVideoEncoder;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper;", "Lorg/webrtc/VideoEncoderFactory;", "sharedContext", "Lorg/webrtc/EglBase$Context;", "enableIntelVp8Encoder", "", "enableH264HighProfile", "<init>", "(Lorg/webrtc/EglBase$Context;ZZ)V", "primary", "fallback", "native", "Lorg/webrtc/SimulcastVideoEncoderFactory;", "createEncoder", "Lorg/webrtc/VideoEncoder;", "info", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "FallbackFactory", "StreamEncoderWrapper", "StreamEncoderWrapperFactory", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimulcastVideoEncoderFactoryWrapper implements VideoEncoderFactory {
    private final VideoEncoderFactory fallback;
    private final SimulcastVideoEncoderFactory native;
    private final VideoEncoderFactory primary;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;", "Lorg/webrtc/VideoEncoderFactory;", "hardwareVideoEncoderFactory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "softwareVideoEncoderFactory", "createEncoder", "Lorg/webrtc/VideoEncoder;", "info", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FallbackFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory hardwareVideoEncoderFactory;
        private final VideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();

        public FallbackFactory(VideoEncoderFactory videoEncoderFactory) {
            this.hardwareVideoEncoderFactory = videoEncoderFactory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo info) {
            VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(info);
            VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(info);
            return (createEncoder2 == null || createEncoder == null) ? createEncoder == null ? createEncoder2 : createEncoder : new VideoEncoderFallback(createEncoder2, createEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            ArrayList arrayList = new ArrayList();
            ycc.t(arrayList, this.softwareVideoEncoderFactory.getSupportedCodecs());
            ycc.t(arrayList, this.hardwareVideoEncoderFactory.getSupportedCodecs());
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
        }
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u000200H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00061"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;", "Lorg/webrtc/VideoEncoder;", "encoder", "<init>", "(Lorg/webrtc/VideoEncoder;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "streamSettings", "Lorg/webrtc/VideoEncoder$Settings;", "getStreamSettings", "()Lorg/webrtc/VideoEncoder$Settings;", "setStreamSettings", "(Lorg/webrtc/VideoEncoder$Settings;)V", "initEncode", "Lorg/webrtc/VideoCodecStatus;", "settings", "callback", "Lorg/webrtc/VideoEncoder$Callback;", "release", "encode", "frame", "Lorg/webrtc/VideoFrame;", "encodeInfo", "Lorg/webrtc/VideoEncoder$EncodeInfo;", "setRateAllocation", "allocation", "Lorg/webrtc/VideoEncoder$BitrateAllocation;", "frameRate", "", "getScalingSettings", "Lorg/webrtc/VideoEncoder$ScalingSettings;", "getImplementationName", "", "createNative", "", "webrtcEnvRef", "isHardwareEncoder", "", "setRates", "rcParameters", "Lorg/webrtc/VideoEncoder$RateControlParameters;", "getResolutionBitrateLimits", "", "Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "getEncoderInfo", "Lorg/webrtc/VideoEncoder$EncoderInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreamEncoderWrapper implements VideoEncoder {
        private final VideoEncoder encoder;
        private final ExecutorService executor = Executors.newSingleThreadExecutor();
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder videoEncoder) {
            this.encoder = videoEncoder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long createNative$lambda$6(StreamEncoderWrapper streamEncoderWrapper, long j) {
            return Long.valueOf(streamEncoderWrapper.encoder.createNative(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus encode$lambda$2(StreamEncoderWrapper streamEncoderWrapper, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            if (streamEncoderWrapper.streamSettings != null && videoFrame.getBuffer().getWidth() != streamEncoderWrapper.streamSettings.width) {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                VideoEncoder.Settings settings = streamEncoderWrapper.streamSettings;
                VideoFrame.Buffer cropAndScale = buffer.cropAndScale(0, 0, width, height, settings.width, settings.height);
                VideoCodecStatus encode = streamEncoderWrapper.encoder.encode(new VideoFrame(cropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
                cropAndScale.release();
                return encode;
            }
            return streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.EncoderInfo getEncoderInfo$lambda$10(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getEncoderInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getImplementationName$lambda$5(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getImplementationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits$lambda$9(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getResolutionBitrateLimits();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ScalingSettings getScalingSettings$lambda$4(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.getScalingSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus initEncode$lambda$0(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            return streamEncoderWrapper.encoder.initEncode(settings, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean isHardwareEncoder$lambda$7(StreamEncoderWrapper streamEncoderWrapper) {
            return Boolean.valueOf(streamEncoderWrapper.encoder.isHardwareEncoder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus release$lambda$1(StreamEncoderWrapper streamEncoderWrapper) {
            return streamEncoderWrapper.encoder.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRateAllocation$lambda$3(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
            return streamEncoderWrapper.encoder.setRateAllocation(bitrateAllocation, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRates$lambda$8(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.RateControlParameters rateControlParameters) {
            return streamEncoderWrapper.encoder.setRates(rateControlParameters);
        }

        @Override // org.webrtc.VideoEncoder
        public long createNative(final long webrtcEnvRef) {
            return ((Number) this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Long createNative$lambda$6;
                    createNative$lambda$6 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.createNative$lambda$6(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, webrtcEnvRef);
                    return createNative$lambda$6;
                }
            }).get()).longValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) {
            return (VideoCodecStatus) this.executor.submit(new e(this, frame, encodeInfo, 1)).get();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.EncoderInfo getEncoderInfo() {
            return (VideoEncoder.EncoderInfo) this.executor.submit(new b(this, 3)).get();
        }

        public final ExecutorService getExecutor() {
            return this.executor;
        }

        @Override // org.webrtc.VideoEncoder
        public String getImplementationName() {
            return (String) this.executor.submit(new b(this, 0)).get();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
            return (VideoEncoder.ResolutionBitrateLimits[]) this.executor.submit(new b(this, 5)).get();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() {
            return (VideoEncoder.ScalingSettings) this.executor.submit(new b(this, 1)).get();
        }

        public final VideoEncoder.Settings getStreamSettings() {
            return this.streamSettings;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            this.streamSettings = settings;
            return (VideoCodecStatus) this.executor.submit(new e(this, settings, callback, 0)).get();
        }

        @Override // org.webrtc.VideoEncoder
        public boolean isHardwareEncoder() {
            return ((Boolean) this.executor.submit(new b(this, 2)).get()).booleanValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus release() {
            return (VideoCodecStatus) this.executor.submit(new b(this, 4)).get();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) {
            return (VideoCodecStatus) this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoCodecStatus rateAllocation$lambda$3;
                    rateAllocation$lambda$3 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRateAllocation$lambda$3(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, allocation, frameRate);
                    return rateAllocation$lambda$3;
                }
            }).get();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRates(final VideoEncoder.RateControlParameters rcParameters) {
            return (VideoCodecStatus) this.executor.submit(new Callable() { // from class: com.cloudwebrtc.webrtc.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoCodecStatus rates$lambda$8;
                    rates$lambda$8 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRates$lambda$8(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, rcParameters);
                    return rates$lambda$8;
                }
            }).get();
        }

        public final void setStreamSettings(VideoEncoder.Settings settings) {
            this.streamSettings = settings;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/cloudwebrtc/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;", "Lorg/webrtc/VideoEncoderFactory;", "factory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "createEncoder", "Lorg/webrtc/VideoEncoder;", "videoCodecInfo", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "flutter_webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory videoEncoderFactory) {
            this.factory = videoEncoderFactory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder createEncoder = this.factory.createEncoder(videoCodecInfo);
            if (createEncoder == null) {
                return null;
            }
            return createEncoder instanceof WrappedNativeVideoEncoder ? createEncoder : new StreamEncoderWrapper(createEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.factory.getSupportedCodecs();
        }
    }

    public SimulcastVideoEncoderFactoryWrapper(EglBase.Context context, boolean z, boolean z2) {
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(new HardwareVideoEncoderFactory(context, z, z2));
        this.primary = streamEncoderWrapperFactory;
        StreamEncoderWrapperFactory streamEncoderWrapperFactory2 = new StreamEncoderWrapperFactory(new FallbackFactory(streamEncoderWrapperFactory));
        this.fallback = streamEncoderWrapperFactory2;
        this.native = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, streamEncoderWrapperFactory2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo info) {
        return this.native.createEncoder(info);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return this.native.getSupportedCodecs();
    }
}
