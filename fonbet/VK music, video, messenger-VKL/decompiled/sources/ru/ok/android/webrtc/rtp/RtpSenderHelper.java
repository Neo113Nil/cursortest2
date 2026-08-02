package ru.ok.android.webrtc.rtp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;
import org.webrtc.Size;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.simulcast.SimulcastConfig;
import ru.ok.android.webrtc.simulcast.SimulcastDirection;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;
import xsna.bjn0;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.jq;
import xsna.on00;
import xsna.q2z;
import xsna.sq;

/* loaded from: classes9.dex */
public final class RtpSenderHelper {

    @Deprecated
    public static final int AUDIO_BITRATE_MAX = 64000;

    @Deprecated
    public static final int AUDIO_BITRATE_MAX_DEFAULT = 48000;

    @Deprecated
    public static final int AUDIO_BITRATE_MIN = 6000;

    @Deprecated
    public static final double DEFAULT_BITRATE_PRIORITY = 1.0d;

    @Deprecated
    public static final String SENDER_NAME_AUDIO = "audio";

    @Deprecated
    public static final String SENDER_NAME_AUDIO_SHARE = "audio-share";

    @Deprecated
    public static final String SENDER_NAME_SCREENSHARE = "screen-share";

    @Deprecated
    public static final String SENDER_NAME_VIDEO = "video";

    @Deprecated
    public static final String TAG = "RtpSenderHelper";

    @Deprecated
    public static final int VIDEO_BITRATE_MAX = 2048000;

    @Deprecated
    public static final int VIDEO_BITRATE_MIN = 30000;
    public final CropAndScaleParamsProvider a;
    public final RTCLog b;

    public RtpSenderHelper(CropAndScaleParamsProvider cropAndScaleParamsProvider, RTCLog rTCLog) {
        this.a = cropAndScaleParamsProvider;
        this.b = rTCLog;
    }

    public final void a(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        try {
            b(rtpSender, str, z, num, num2, num3, degradationPreference);
        } catch (Throwable th) {
            this.b.reportException(TAG, "Error on update of sender " + str, th);
        }
    }

    public final void b(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        if (rtpSender == null) {
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            this.b.log(TAG, str + ": RtpParameters are not ready yet");
            return;
        }
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            if (!epx.f(encoding.maxBitrateBps, num)) {
                encoding.maxBitrateBps = num;
                z = true;
            }
            if (!epx.f(encoding.numTemporalLayers, num2)) {
                encoding.numTemporalLayers = num2;
                z = true;
            }
            if (!epx.f(encoding.maxFramerate, num3)) {
                encoding.maxFramerate = num3;
                z = true;
            }
        }
        if (parameters.degradationPreference != degradationPreference) {
            parameters.degradationPreference = degradationPreference;
            z = true;
        }
        if (!z) {
            this.b.log(TAG, "No " + str + " change detected. Ignore update");
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            RTCLog rTCLog = this.b;
            StringBuilder d = jq.d(num, "Sender parameters for ", str, ": maxBitrate=", ", numTemporalLayers=");
            sq.b(d, num2, ", maxFramerate=", num3, ", degradationPreference=");
            d.append(degradationPreference);
            rTCLog.log(TAG, d.toString());
            return;
        }
        RTCLog rTCLog2 = this.b;
        StringBuilder d2 = jq.d(num, "Failed to set sender parameters for ", str, ": maxBitrate=", ", numTemporalLayers=");
        sq.b(d2, num2, ", maxFramerate=", num3, ", degradationPreference=");
        d2.append(degradationPreference);
        rTCLog2.log(TAG, d2.toString());
    }

    public final int getAudioMinBitrate() {
        return AUDIO_BITRATE_MIN;
    }

    public final SimulcastConfig getLocalSimulcastConfig(RtpSender rtpSender, String str, Size size) {
        return new SimulcastConfig(str, getSimulcastLayersInfo(rtpSender, size));
    }

    public final int getSenderMaxBitrate(RtpSender rtpSender) {
        List<RtpParameters.Encoding> list;
        if (rtpSender == null) {
            return 0;
        }
        try {
            RtpParameters parameters = rtpSender.getParameters();
            if (parameters == null || (list = parameters.encodings) == null) {
                return 0;
            }
            Iterator<T> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                Integer num = ((RtpParameters.Encoding) it.next()).maxBitrateBps;
                i += num != null ? num.intValue() : 0;
            }
            return i;
        } catch (Throwable th) {
            this.b.reportException(TAG, "Unable to get sender max bitrate", th);
            return 0;
        }
    }

    public final List<SimulcastLayerInfo> getSimulcastLayersInfo(RtpSender rtpSender, Size size) {
        ListBuilder e = e43.e();
        Iterator<T> it = rtpSender.getParameters().encodings.iterator();
        while (it.hasNext()) {
            e.add(SimulcastLayerInfo.Companion.fromEncoding((RtpParameters.Encoding) it.next(), SimulcastDirection.SEND, size, this.a));
        }
        return e.g();
    }

    public final RtpSender setUpAudioSender(RtpSender rtpSender) {
        return a(rtpSender, "audio");
    }

    public final RtpSender setUpAudioShareSender(RtpSender rtpSender) {
        return a(rtpSender, SENDER_NAME_AUDIO_SHARE);
    }

    public final RtpSender setUpScreenShareSender(RtpSender rtpSender) {
        a(rtpSender, SENDER_NAME_SCREENSHARE, 30000, VIDEO_BITRATE_MAX, null, false);
        return rtpSender;
    }

    public final RtpSender setUpVideoSender(RtpSender rtpSender) {
        a(rtpSender, "video", 30000, VIDEO_BITRATE_MAX, null, false);
        return rtpSender;
    }

    public final RtpSender setUpVideoSenderWithSimulcast(RtpSender rtpSender, List<SimulcastLayerInfo> list) {
        updateVideoSenderWithSimulcast(rtpSender, true, list);
        return rtpSender;
    }

    public final void updateVideoSender(RtpSender rtpSender, boolean z, boolean z2, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        a(rtpSender, z ? SENDER_NAME_SCREENSHARE : "video", z2, num, num2, num3, degradationPreference);
    }

    public final boolean updateVideoSenderWithSimulcast(RtpSender rtpSender, boolean z, List<SimulcastLayerInfo> list) {
        try {
            return a(rtpSender, z, list);
        } catch (Throwable th) {
            this.b.reportException(TAG, "Error on update of sender video", th);
            return false;
        }
    }

    public final List<String> updateWithTracking(RtpParameters.Encoding encoding, SimulcastLayerInfo simulcastLayerInfo) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, SignalingProtocol.KEY_ACTIVE, Boolean.valueOf(encoding.active), Boolean.valueOf(simulcastLayerInfo.isActive()));
        encoding.active = simulcastLayerInfo.isActive();
        a(arrayList, "maxBitrateBps", encoding.maxBitrateBps, Integer.valueOf(simulcastLayerInfo.getMaxBitrate()));
        encoding.maxBitrateBps = Integer.valueOf(simulcastLayerInfo.getMaxBitrate());
        a(arrayList, SignalingProtocol.KEY_PEER_VIDEO_SETTINGS_MAX_FRAMERATE, encoding.maxFramerate, Integer.valueOf(simulcastLayerInfo.getMaxFps()));
        encoding.maxFramerate = Integer.valueOf(simulcastLayerInfo.getMaxFps());
        a(arrayList, "numTemporalLayers", encoding.numTemporalLayers, simulcastLayerInfo.getNumTemporalLayers());
        encoding.numTemporalLayers = simulcastLayerInfo.getNumTemporalLayers();
        a(arrayList, "scaleResolutionDownBy", encoding.scaleResolutionDownBy, Double.valueOf(simulcastLayerInfo.getResolutionScale()));
        encoding.scaleResolutionDownBy = Double.valueOf(simulcastLayerInfo.getResolutionScale());
        return arrayList;
    }

    public final RtpSender a(RtpSender rtpSender, String str) {
        this.b.log(TAG, "set audio bitrate range to 6000-48000, priority=1.0");
        a(rtpSender, str, AUDIO_BITRATE_MIN, 48000, Double.valueOf(1.0d), true);
        return rtpSender;
    }

    public final void a(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            b(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            this.b.reportException(TAG, "Failed to set bitrate of " + str, th);
        }
    }

    public final boolean a(RtpSender rtpSender, boolean z, List list) {
        this.b.log(TAG, "video updateVideoSenderUnsafeWithSimulcast forceUpdate = " + z + " , simulcastLayerInfos = " + list);
        RtpParameters parameters = rtpSender.getParameters();
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list) {
            linkedHashMap.put(((SimulcastLayerInfo) obj).getRid(), obj);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : parameters.encodings) {
            int i2 = i + 1;
            if (i >= 0) {
                RtpParameters.Encoding encoding = (RtpParameters.Encoding) obj2;
                String str = encoding.rid;
                if (str == null) {
                    str = ((SimulcastLayerInfo) list.get(i)).getRid();
                }
                SimulcastLayerInfo simulcastLayerInfo = (SimulcastLayerInfo) linkedHashMap.get(str);
                if (simulcastLayerInfo != null) {
                    List<String> updateWithTracking = updateWithTracking(encoding, simulcastLayerInfo);
                    if (!updateWithTracking.isEmpty()) {
                        q2z.a(str, j5g.g0(updateWithTracking, null, null, null, 0, null, 63), arrayList);
                    }
                } else if (encoding.active) {
                    encoding.active = false;
                    q2z.a(str, "active: true -> false", arrayList);
                }
                i = i2;
            } else {
                e43.t();
                throw null;
            }
        }
        if (arrayList.isEmpty() && !z) {
            this.b.log(TAG, "encodings update not needed");
            return false;
        }
        boolean parameters2 = rtpSender.setParameters(parameters);
        if (parameters2) {
            bjn0.b("setParameters success for video. Updated layers: ", j5g.g0(arrayList, ", ", null, null, 0, null, 62), this.b, TAG);
            return parameters2;
        }
        bjn0.b("setParameters failed for video. Updated layers: ", j5g.g0(arrayList, ", ", null, null, 0, null, 62), this.b, TAG);
        return parameters2;
    }

    public final void b(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        if (rtpSender == null) {
            this.b.log(TAG, str + ": no sender");
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            this.b.log(TAG, str + ": RtpParameters are not ready yet");
            return;
        }
        boolean z2 = false;
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            Integer num = encoding.maxBitrateBps;
            if (num == null || num.intValue() != i2) {
                encoding.maxBitrateBps = Integer.valueOf(i2);
                z2 = true;
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 == null || num2.intValue() != i) {
                encoding.minBitrateBps = Integer.valueOf(i);
                z2 = true;
            }
            if (d != null && encoding.bitratePriority != d.doubleValue()) {
                encoding.bitratePriority = d.doubleValue();
                z2 = true;
            }
            if (encoding.adaptiveAudioPacketTime != z) {
                encoding.adaptiveAudioPacketTime = z;
                z2 = true;
            }
        }
        if (!z2) {
            this.b.log(TAG, str + " encodings update not needed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            this.b.log(TAG, str + " encodings update done. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        this.b.log(TAG, str + " encodings update failed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
    }

    public static final void a(ArrayList arrayList, String str, Object obj, Object obj2) {
        if (epx.f(obj, obj2)) {
            return;
        }
        arrayList.add(str + ": " + obj + " -> " + obj2);
    }
}
