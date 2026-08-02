package ru.ok.android.webrtc.video;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.Size;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.mediarecord.ScreenShareRecord;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.simulcast.SimulcastConfig;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;
import ru.ok.android.webrtc.simulcast.SimulcastScaler;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdates;
import xsna.cgn;
import xsna.e43;
import xsna.efz;
import xsna.j5g;
import xsna.lhg;
import xsna.na8;
import xsna.sl9;
import xsna.zcl;
import xsna.zr;

@CallInternalApi
/* loaded from: classes9.dex */
public final class VideoSettingsCalculator implements SimulcastScaler {
    public static final Companion Companion = new Companion(null);
    public final SharedPeerConnectionFactory a;
    public final Context b;
    public final CallParams c;
    public final RTCLog d;
    public final SimulcastScaler e;
    public final VideoQualityUpdates f = new VideoQualityUpdates(null, 1, null);
    public PeerVideoSettings g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static final class BitRates {
        public final int a;
        public final int b;

        public BitRates(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static /* synthetic */ BitRates copy$default(BitRates bitRates, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bitRates.a;
            }
            if ((i3 & 2) != 0) {
                i2 = bitRates.b;
            }
            return bitRates.copy(i, i2);
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final BitRates copy(int i, int i2) {
            return new BitRates(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitRates)) {
                return false;
            }
            BitRates bitRates = (BitRates) obj;
            return this.a == bitRates.a && this.b == bitRates.b;
        }

        public final int getBitrateAudio() {
            return this.a;
        }

        public final int getBitrateVideo() {
            return this.b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public String toString() {
            return sl9.c(this.a, this.b, "BitRates(bitrateAudio=", ", bitrateVideo=", ")");
        }
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public VideoSettingsCalculator(SharedPeerConnectionFactory sharedPeerConnectionFactory, Context context, CallParams callParams, RTCLog rTCLog, SimulcastScaler simulcastScaler) {
        this.a = sharedPeerConnectionFactory;
        this.b = context;
        this.c = callParams;
        this.d = rTCLog;
        this.e = simulcastScaler;
    }

    public final int a(PeerVideoSettings peerVideoSettings, String str, boolean z) {
        int i;
        int i2;
        String a = zr.a("select bitrate ", z ? "for screenshare" : "for camera", " by videoSettings=");
        int i3 = z ? this.j : this.h;
        int i4 = z ? this.k : this.i;
        int max = Math.max(i3, i4);
        int maxDimension = peerVideoSettings.getMaxDimension();
        int maxBitrateK = peerVideoSettings.getMaxBitrateK() * 1000;
        PeerVideoSettingsBitrateTable bitrateTable = peerVideoSettings.getBitrateTable();
        if (bitrateTable == null || max <= 0) {
            i = 0;
            i2 = 0;
        } else {
            i = Math.min(peerVideoSettings.getMaxDimensionForBitrateTableCalc(), max);
            i2 = bitrateTable.getBitrate(i, str);
        }
        if (i2 > 0) {
            int min = Math.min(maxBitrateK, i2);
            RTCLog rTCLog = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(min);
            sb.append(" by table; encoder=");
            sb.append(str);
            sb.append(" maxDimensionForTable=");
            cgn.a(i, i2, " tableBitrate=", " maxBitrateSetting=", sb);
            sb.append(maxBitrateK);
            rTCLog.log("VideoSettingCalculator", sb.toString());
            return min;
        }
        if (max <= 0 || max >= maxDimension) {
            this.d.log("VideoSettingCalculator", a + maxBitrateK + " by maxBitrateSetting");
            return maxBitrateK;
        }
        int bitrateByVideoSize = peerVideoSettings.getBitrateByVideoSize(i3, i4) * 1024;
        this.d.log("VideoSettingCalculator", a + bitrateByVideoSize + " by videoSize=" + i3 + "x" + i4);
        return bitrateByVideoSize;
    }

    public final List<SimulcastLayerInfo> generateDefaultSimulcastLayers(SimulcastConfig simulcastConfig, Size size) {
        PeerVideoSettingsBitrateTable defaultTable;
        PeerVideoSettings peerVideoSettings = this.g;
        if (peerVideoSettings == null || (defaultTable = peerVideoSettings.getBitrateTable()) == null) {
            defaultTable = PeerVideoSettingsBitrateTable.Companion.defaultTable();
        }
        return generateSimulcastLayers(size, defaultTable.getBitrateList(PeerVideoSettingsBitrateTable.CODEC_GENERIC), null, simulcastConfig, 30, null);
    }

    @Override // ru.ok.android.webrtc.simulcast.SimulcastScaler
    public List<SimulcastLayerInfo> generateSimulcastLayers(Size size, List<PeerVideoSettingsBitrateTable.Bitrate> list, Integer num, SimulcastConfig simulcastConfig, int i, Integer num2) {
        return this.e.generateSimulcastLayers(size, list, num, simulcastConfig, i, num2);
    }

    public final int getCameraHeight() {
        return this.i;
    }

    public final int getCameraWidth() {
        return this.h;
    }

    public final BitRates getMaxBitrates(boolean z) {
        PeerVideoSettings peerVideoSettings = this.g;
        BitRates calcAudioVideoBitrates = MiscHelper.calcAudioVideoBitrates((ConnectivityManager) this.b.getSystemService("connectivity"), (TelephonyManager) this.b.getSystemService("phone"), this.c.getBitrates(), this.b);
        int bitrateAudio = calcAudioVideoBitrates.getBitrateAudio();
        int bitrateVideo = calcAudioVideoBitrates.getBitrateVideo();
        String a = lhg.a(bitrateVideo, "; network maxBitrate=");
        if (peerVideoSettings != null) {
            SharedPeerConnectionFactory sharedPeerConnectionFactory = this.a;
            String lastSelectedEncoderName = sharedPeerConnectionFactory != null ? sharedPeerConnectionFactory.getLastSelectedEncoderName() : null;
            if (lastSelectedEncoderName == null) {
                lastSelectedEncoderName = "unknown";
            }
            int a2 = a(peerVideoSettings, lastSelectedEncoderName, z);
            bitrateVideo = Math.min(bitrateVideo, a2);
            a = na8.a(a2, a, "; videoSettings maxBitrate=");
        }
        VideoQualityUpdate screenShareQuality = z ? this.f.getScreenShareQuality() : this.f.getCameraQuality();
        if (screenShareQuality != null && screenShareQuality.getMaxBitrate() > 0) {
            int maxBitrate = screenShareQuality.getMaxBitrate();
            bitrateVideo = Math.min(bitrateVideo, maxBitrate);
            a = na8.a(maxBitrate, a, "; videoQualityUpdate b=");
        }
        this.d.log("VideoSettingCalculator", sl9.c(bitrateAudio, bitrateVideo, "getMaxBitrates() AudioBitrate=", " VideoBitrate=", a));
        return new BitRates(bitrateAudio, bitrateVideo);
    }

    public final PeerVideoSettings getPeerVideoSettings() {
        return this.g;
    }

    public final int getScreenShareHeight() {
        return this.k;
    }

    public final int getScreenShareWidth() {
        return this.j;
    }

    public final VideoQualityUpdate getVideoQualityUpdateBySource(int i) {
        return this.f.getVideoQualityBySource(i);
    }

    public final void maybeUpdateEncodedFastScreenShareVideoSize(LocalMediaStreamSource.LocalMediaStream localMediaStream, PeerVideoSettings peerVideoSettings) {
        ScreenShareRecord screenShareRecord;
        int maxFrameRate = peerVideoSettings.getMaxFrameRate();
        ArrayList o = e43.o(Integer.valueOf(peerVideoSettings.getMaxDimension()));
        int i = this.j;
        int i2 = this.k;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        VideoQualityUpdate screenShareQuality = this.f.getScreenShareQuality();
        o.add(Integer.valueOf(screenShareQuality != null ? screenShareQuality.getMaxDimension() : 0));
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() > 0) {
                arrayList.add(next);
            }
        }
        Integer num = (Integer) j5g.o0(arrayList);
        if (localMediaStream == null || (screenShareRecord = localMediaStream.getScreenShareRecord()) == null) {
            return;
        }
        if (num == null || num.intValue() >= max) {
            screenShareRecord.setVideoMaxDimension(max, min, maxFrameRate);
            this.d.log("VideoSettingCalculator", efz.a(max, min, "select screenshare dimension: ", "x"));
            return;
        }
        int round = Math.round(num.intValue() * (min / max));
        screenShareRecord.setVideoMaxDimension(num.intValue(), round, maxFrameRate);
        this.d.log("VideoSettingCalculator", "select screenshare dimension compressed: " + num + "x" + round);
    }

    public final void maybeUpdateEncodedVideoSize(LocalMediaStreamSource.LocalMediaStream localMediaStream, int i) {
        VideoRecord cameraRecord;
        ArrayList o = e43.o(Integer.valueOf(i));
        if (localMediaStream == null || (cameraRecord = localMediaStream.getCameraRecord()) == null) {
            return;
        }
        VideoQualityUpdate cameraQuality = this.f.getCameraQuality();
        o.add(Integer.valueOf(cameraQuality != null ? cameraQuality.getMaxDimension() : 0));
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() > 0) {
                arrayList.add(next);
            }
        }
        cameraRecord.restrictMaxDimension((Integer) j5g.o0(arrayList));
    }

    public final void setCameraHeight(int i) {
        this.i = i;
    }

    public final void setCameraWidth(int i) {
        this.h = i;
    }

    public final void setPeerVideoSettings(PeerVideoSettings peerVideoSettings) {
        this.g = peerVideoSettings;
    }

    public final void setScreenShareHeight(int i) {
        this.k = i;
    }

    public final void setScreenShareWidth(int i) {
        this.j = i;
    }

    public final void setVideoQualityUpdate(VideoQualityUpdate videoQualityUpdate) {
        this.f.updateVideoQuality(videoQualityUpdate);
    }

    public final List<SimulcastLayerInfo> generateSimulcastLayers(Integer num, SimulcastConfig simulcastConfig, int i, Integer num2) {
        PeerVideoSettingsBitrateTable defaultTable;
        VideoSettingsCalculator videoSettingsCalculator;
        Integer num3;
        SimulcastConfig simulcastConfig2;
        int i2;
        Integer num4;
        PeerVideoSettings peerVideoSettings = this.g;
        if (peerVideoSettings == null || (defaultTable = peerVideoSettings.getBitrateTable()) == null) {
            defaultTable = PeerVideoSettingsBitrateTable.Companion.defaultTable();
        }
        Size size = new Size(this.h, this.i);
        List<PeerVideoSettingsBitrateTable.Bitrate> bitrateList = defaultTable.getBitrateList(PeerVideoSettingsBitrateTable.CODEC_GENERIC);
        VideoQualityUpdate cameraQuality = this.f.getCameraQuality();
        Integer valueOf = cameraQuality != null ? Integer.valueOf(cameraQuality.getMaxDimension()) : null;
        if (num == null && valueOf == null) {
            simulcastConfig2 = simulcastConfig;
            i2 = i;
            num4 = num2;
            num3 = null;
            videoSettingsCalculator = this;
        } else if (num == null) {
            videoSettingsCalculator = this;
            simulcastConfig2 = simulcastConfig;
            i2 = i;
            num4 = num2;
            num3 = valueOf;
        } else {
            if (valueOf != null) {
                num = Integer.valueOf(Math.min(num.intValue(), valueOf.intValue()));
            }
            videoSettingsCalculator = this;
            num3 = num;
            simulcastConfig2 = simulcastConfig;
            i2 = i;
            num4 = num2;
        }
        return videoSettingsCalculator.generateSimulcastLayers(size, bitrateList, num3, simulcastConfig2, i2, num4);
    }
}
