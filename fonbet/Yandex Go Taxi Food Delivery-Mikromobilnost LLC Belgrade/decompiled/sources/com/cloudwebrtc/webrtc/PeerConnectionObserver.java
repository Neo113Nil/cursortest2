package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.Utils;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.afo;
import defpackage.da20;
import defpackage.g8e;
import defpackage.tt5;
import defpackage.xeo;
import defpackage.zeo;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.webrtc.AudioTrack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.DtmfSender;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
class PeerConnectionObserver implements PeerConnection.Observer, zeo {
    private static final String TAG = "FlutterWebRTCPlugin";
    private final PeerConnection.RTCConfiguration configuration;
    private final afo eventChannel;
    private xeo eventSink;
    private final String id;
    private final tt5 messenger;
    private PeerConnection peerConnection;
    private final StateProvider stateProvider;
    private final Map<String, DataChannel> dataChannels = new HashMap();
    final Map<String, MediaStream> remoteStreams = new HashMap();
    final Map<String, MediaStreamTrack> remoteTracks = new HashMap();
    final Map<String, RtpTransceiver> transceivers = new HashMap();

    /* renamed from: com.cloudwebrtc.webrtc.PeerConnectionObserver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection;

        static {
            int[] iArr = new int[RtpTransceiver.RtpTransceiverDirection.values().length];
            $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection = iArr;
            try {
                iArr[RtpTransceiver.RtpTransceiverDirection.SEND_RECV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.SEND_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.RECV_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PeerConnectionObserver(PeerConnection.RTCConfiguration rTCConfiguration, StateProvider stateProvider, tt5 tt5Var, String str) {
        this.configuration = rTCConfiguration;
        this.stateProvider = stateProvider;
        this.messenger = tt5Var;
        this.id = str;
        afo afoVar = new afo(tt5Var, g8e.o("FlutterWebRTC/peerConnectionEvent", str));
        this.eventChannel = afoVar;
        afoVar.a(this);
    }

    private Map<String, Object> dtmfSenderToMap(DtmfSender dtmfSender, String str) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("dtmfSenderId", str);
        if (dtmfSender != null) {
            constraintsMap.putInt("interToneGap", dtmfSender.interToneGap());
            constraintsMap.putInt("duration", dtmfSender.duration());
        }
        return constraintsMap.toMap();
    }

    private String getUIDForStream(MediaStream mediaStream) {
        for (Map.Entry<String, MediaStream> entry : this.remoteStreams.entrySet()) {
            if (entry.getValue().equals(mediaStream)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private RtpParameters.Encoding mapToEncoding(Map<String, Object> map) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding((String) map.get("rid"), true, Double.valueOf(1.0d));
        if (map.get(ClidProvider.APP_ACTIVE) != null) {
            encoding.active = ((Boolean) map.get(ClidProvider.APP_ACTIVE)).booleanValue();
        }
        if (map.get("ssrc") != null) {
            encoding.ssrc = Long.valueOf(((Integer) map.get("ssrc")).longValue());
        }
        if (map.get("minBitrate") != null) {
            encoding.minBitrateBps = (Integer) map.get("minBitrate");
        }
        if (map.get("maxBitrate") != null) {
            encoding.maxBitrateBps = (Integer) map.get("maxBitrate");
        }
        if (map.get("maxFramerate") != null) {
            encoding.maxFramerate = (Integer) map.get("maxFramerate");
        }
        if (map.get("numTemporalLayers") != null) {
            encoding.numTemporalLayers = (Integer) map.get("numTemporalLayers");
        }
        if (map.get("scaleResolutionDownBy") != null) {
            encoding.scaleResolutionDownBy = (Double) map.get("scaleResolutionDownBy");
        }
        if (map.get("scalabilityMode") != null) {
            encoding.scalabilityMode = (String) map.get("scalabilityMode");
        }
        return encoding;
    }

    private RtpTransceiver.RtpTransceiverInit mapToRtpTransceiverInit(Map<String, Object> map) {
        List list = (List) map.get("streamIds");
        List list2 = (List) map.get("sendEncodings");
        String str = (String) map.get("direction");
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = new ArrayList();
        }
        if (str == null) {
            str = "sendrecv";
        }
        if (list2 == null) {
            return new RtpTransceiver.RtpTransceiverInit(stringToTransceiverDirection(str), list);
        }
        for (int i = 0; i < list2.size(); i++) {
            arrayList.add(mapToEncoding((Map) list2.get(i)));
        }
        return new RtpTransceiver.RtpTransceiverInit(stringToTransceiverDirection(str), list, arrayList);
    }

    private Map<String, Object> mediaStreamToMap(MediaStream mediaStream) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("streamId", mediaStream.getId());
        constraintsMap.putString("ownerTag", this.id);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        Iterator<AudioTrack> it = mediaStream.audioTracks.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(mediaTrackToMap(it.next())));
        }
        Iterator<VideoTrack> it2 = mediaStream.videoTracks.iterator();
        while (it2.hasNext()) {
            constraintsArray2.pushMap(new ConstraintsMap(mediaTrackToMap(it2.next())));
        }
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        return constraintsMap.toMap();
    }

    private Map<String, Object> mediaTrackToMap(MediaStreamTrack mediaStreamTrack) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        if (mediaStreamTrack != null) {
            constraintsMap.putString("id", mediaStreamTrack.id());
            constraintsMap.putString("label", mediaStreamTrack.getClass() == VideoTrack.class ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
            constraintsMap.putString("kind", mediaStreamTrack.kind());
            constraintsMap.putBoolean(BackendConfig.Restrictions.ENABLED, mediaStreamTrack.enabled());
            constraintsMap.putString("readyState", mediaStreamTrack.state().toString());
        }
        return constraintsMap.toMap();
    }

    private void registerDataChannelObserver(String str, DataChannel dataChannel) {
        dataChannel.registerObserver(new DataChannelObserver(this.messenger, this.id, str, dataChannel));
    }

    private static void resultError(String str, String str2, da20 da20Var) {
        da20Var.error(str, g8e.p(str, "(): ", str2), null);
    }

    private Map<String, Object> rtpParametersToMap(RtpParameters rtpParameters) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("transactionId", rtpParameters.transactionId);
        RtpParameters.DegradationPreference degradationPreference = rtpParameters.degradationPreference;
        if (degradationPreference != null) {
            constraintsMap.putString("degradationPreference", degradationPreference.name().toLowerCase().replace("_", "-"));
        }
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString("cname", rtpParameters.getRtcp().getCname());
        constraintsMap2.putBoolean("reducedSize", rtpParameters.getRtcp().getReducedSize());
        constraintsMap.putMap("rtcp", constraintsMap2.toMap());
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpParameters.HeaderExtension headerExtension : rtpParameters.getHeaderExtensions()) {
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString(LaunchBrowserActivity.KEY_URI, headerExtension.getUri());
            constraintsMap3.putInt("id", headerExtension.getId());
            constraintsMap3.putBoolean("encrypted", headerExtension.getEncrypted());
            constraintsArray.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("headerExtensions", constraintsArray.toArrayList());
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (RtpParameters.Encoding encoding : rtpParameters.encodings) {
            ConstraintsMap constraintsMap4 = new ConstraintsMap();
            constraintsMap4.putBoolean(ClidProvider.APP_ACTIVE, encoding.active);
            String str = encoding.rid;
            if (str != null) {
                constraintsMap4.putString("rid", str);
            }
            Integer num = encoding.maxBitrateBps;
            if (num != null) {
                constraintsMap4.putInt("maxBitrate", num.intValue());
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 != null) {
                constraintsMap4.putInt("minBitrate", num2.intValue());
            }
            Integer num3 = encoding.maxFramerate;
            if (num3 != null) {
                constraintsMap4.putInt("maxFramerate", num3.intValue());
            }
            Integer num4 = encoding.numTemporalLayers;
            if (num4 != null) {
                constraintsMap4.putInt("numTemporalLayers", num4.intValue());
            }
            Double d = encoding.scaleResolutionDownBy;
            if (d != null) {
                constraintsMap4.putDouble("scaleResolutionDownBy", d.doubleValue());
            }
            Long l = encoding.ssrc;
            if (l != null) {
                constraintsMap4.putLong("ssrc", l.longValue());
            }
            constraintsArray2.pushMap(constraintsMap4);
        }
        constraintsMap.putArray("encodings", constraintsArray2.toArrayList());
        ConstraintsArray constraintsArray3 = new ConstraintsArray();
        for (RtpParameters.Codec codec : rtpParameters.codecs) {
            ConstraintsMap constraintsMap5 = new ConstraintsMap();
            constraintsMap5.putString("name", codec.name);
            constraintsMap5.putInt("payloadType", codec.payloadType);
            constraintsMap5.putInt("clockRate", codec.clockRate.intValue());
            Integer num5 = codec.numChannels;
            if (num5 != null) {
                constraintsMap5.putInt("numChannels", num5.intValue());
            }
            constraintsMap5.putMap("parameters", new HashMap(codec.parameters));
            try {
                Field declaredField = codec.getClass().getDeclaredField("kind");
                declaredField.setAccessible(true);
                if (declaredField.get(codec).equals(MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO)) {
                    constraintsMap5.putString("kind", MediaStreamTrack.AUDIO_TRACK_KIND);
                } else if (declaredField.get(codec).equals(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO)) {
                    constraintsMap5.putString("kind", MediaStreamTrack.VIDEO_TRACK_KIND);
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
            constraintsArray3.pushMap(constraintsMap5);
        }
        constraintsMap.putArray("codecs", constraintsArray3.toArrayList());
        return constraintsMap.toMap();
    }

    private Map<String, Object> rtpReceiverToMap(RtpReceiver rtpReceiver) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("receiverId", rtpReceiver.id());
        constraintsMap.putMap("rtpParameters", rtpParametersToMap(rtpReceiver.getParameters()));
        constraintsMap.putMap(BaseTrack.KEY_TRACK, mediaTrackToMap(rtpReceiver.track()));
        return constraintsMap.toMap();
    }

    private Map<String, Object> rtpSenderToMap(RtpSender rtpSender) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("senderId", rtpSender.id());
        constraintsMap.putBoolean("ownsTrack", true);
        constraintsMap.putMap("dtmfSender", dtmfSenderToMap(rtpSender.dtmf(), rtpSender.id()));
        constraintsMap.putMap("rtpParameters", rtpParametersToMap(rtpSender.getParameters()));
        constraintsMap.putMap(BaseTrack.KEY_TRACK, mediaTrackToMap(rtpSender.track()));
        return constraintsMap.toMap();
    }

    private MediaStreamTrack.MediaType stringToMediaType(String str) {
        MediaStreamTrack.MediaType mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        return (!str.equals(MediaStreamTrack.AUDIO_TRACK_KIND) && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) ? MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO : mediaType;
    }

    private RtpTransceiver.RtpTransceiverDirection stringToTransceiverDirection(String str) {
        str.getClass();
        switch (str) {
            case "stopped":
                return RtpTransceiver.RtpTransceiverDirection.STOPPED;
            case "recvonly":
                return RtpTransceiver.RtpTransceiverDirection.RECV_ONLY;
            case "inactive":
                return RtpTransceiver.RtpTransceiverDirection.INACTIVE;
            case "sendonly":
                return RtpTransceiver.RtpTransceiverDirection.SEND_ONLY;
            case "sendrecv":
                return RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
            default:
                return RtpTransceiver.RtpTransceiverDirection.INACTIVE;
        }
    }

    private String transceiverDirectionString(RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        int i = AnonymousClass1.$SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[rtpTransceiverDirection.ordinal()];
        if (i == 1) {
            return "sendrecv";
        }
        if (i == 2) {
            return "sendonly";
        }
        if (i == 3) {
            return "recvonly";
        }
        if (i == 4) {
            return ClidProvider.APP_INACTIVE;
        }
        if (i != 5) {
            return null;
        }
        return "stopped";
    }

    private RtpParameters updateRtpParameters(RtpParameters rtpParameters, Map<String, Object> map) {
        RtpParameters.Encoding encoding;
        int indexOf;
        List<Map> list = (List) map.get("encodings");
        List<RtpParameters.Encoding> list2 = rtpParameters.encodings;
        String str = (String) map.get("degradationPreference");
        if (str != null) {
            rtpParameters.degradationPreference = RtpParameters.DegradationPreference.valueOf(str.toUpperCase().replace("-", "_"));
        }
        for (Map map2 : list) {
            String str2 = (String) map2.get("rid");
            if (str2 != null) {
                Iterator<RtpParameters.Encoding> it = list2.iterator();
                while (it.hasNext()) {
                    encoding = it.next();
                    if (str2.equals(encoding.rid)) {
                        break;
                    }
                }
            }
            encoding = null;
            if (encoding == null && (indexOf = list.indexOf(map2)) < list2.size()) {
                encoding = list2.get(indexOf);
            }
            if (encoding != null) {
                Boolean bool = (Boolean) map2.get(ClidProvider.APP_ACTIVE);
                if (bool != null) {
                    encoding.active = bool.booleanValue();
                }
                Integer num = (Integer) map2.get("maxBitrate");
                if (num != null) {
                    encoding.maxBitrateBps = num;
                }
                Integer num2 = (Integer) map2.get("minBitrate");
                if (num2 != null) {
                    encoding.minBitrateBps = num2;
                }
                Integer num3 = (Integer) map2.get("maxFramerate");
                if (num3 != null) {
                    encoding.maxFramerate = num3;
                }
                Integer num4 = (Integer) map2.get("numTemporalLayers");
                if (num4 != null) {
                    encoding.numTemporalLayers = num4;
                }
                Double d = (Double) map2.get("scaleResolutionDownBy");
                if (d != null) {
                    encoding.scaleResolutionDownBy = d;
                }
            }
        }
        return rtpParameters;
    }

    public void addTrack(MediaStreamTrack mediaStreamTrack, List<String> list, da20 da20Var) {
        da20Var.success(rtpSenderToMap(this.peerConnection.addTrack(mediaStreamTrack, list)));
    }

    public void addTransceiver(MediaStreamTrack mediaStreamTrack, Map<String, Object> map, da20 da20Var) {
        PeerConnection peerConnection = this.peerConnection;
        RtpTransceiver addTransceiver = map != null ? peerConnection.addTransceiver(mediaStreamTrack, mapToRtpTransceiverInit(map)) : peerConnection.addTransceiver(mediaStreamTrack);
        String mid = addTransceiver.getMid();
        if (mid == null) {
            mid = this.stateProvider.getNextStreamUUID();
        }
        this.transceivers.put(mid, addTransceiver);
        da20Var.success(transceiverToMap(mid, addTransceiver));
    }

    public void addTransceiverOfType(String str, Map<String, Object> map, da20 da20Var) {
        PeerConnection peerConnection = this.peerConnection;
        RtpTransceiver addTransceiver = map != null ? peerConnection.addTransceiver(stringToMediaType(str), mapToRtpTransceiverInit(map)) : peerConnection.addTransceiver(stringToMediaType(str));
        String mid = addTransceiver.getMid();
        if (mid == null) {
            mid = this.stateProvider.getNextStreamUUID();
        }
        this.transceivers.put(mid, addTransceiver);
        da20Var.success(transceiverToMap(mid, addTransceiver));
    }

    public Map<String, Object> candidateToMap(IceCandidate iceCandidate) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putInt("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        constraintsMap.putString("sdpMid", iceCandidate.sdpMid);
        constraintsMap.putString("candidate", iceCandidate.sdp);
        return constraintsMap.toMap();
    }

    public void close() {
        this.peerConnection.close();
        this.remoteStreams.clear();
        this.remoteTracks.clear();
        this.dataChannels.clear();
    }

    public void createDataChannel(String str, ConstraintsMap constraintsMap, da20 da20Var) {
        DataChannel.Init init = new DataChannel.Init();
        if (constraintsMap != null) {
            if (constraintsMap.hasKey("id")) {
                init.id = constraintsMap.getInt("id");
            }
            if (constraintsMap.hasKey("ordered")) {
                init.ordered = constraintsMap.getBoolean("ordered");
            }
            if (constraintsMap.hasKey("maxRetransmits")) {
                init.maxRetransmits = constraintsMap.getInt("maxRetransmits");
            }
            if (constraintsMap.hasKey(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)) {
                init.protocol = constraintsMap.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
            }
            if (constraintsMap.hasKey("negotiated")) {
                init.negotiated = constraintsMap.getBoolean("negotiated");
            }
        }
        DataChannel createDataChannel = this.peerConnection.createDataChannel(str, init);
        String nextDataChannelUUID = getNextDataChannelUUID();
        if (createDataChannel == null) {
            resultError("createDataChannel", "Can't create data-channel for id: " + init.id, da20Var);
            return;
        }
        this.dataChannels.put(nextDataChannelUUID, createDataChannel);
        registerDataChannelObserver(nextDataChannelUUID, createDataChannel);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putInt("id", createDataChannel.id());
        constraintsMap2.putString("label", createDataChannel.label());
        constraintsMap2.putString("flutterId", nextDataChannelUUID);
        da20Var.success(constraintsMap2.toMap());
    }

    public void dataChannelClose(String str) {
        DataChannel dataChannel = this.dataChannels.get(str);
        if (dataChannel != null) {
            dataChannel.close();
            this.dataChannels.remove(str);
        }
    }

    public void dataChannelSend(String str, ByteBuffer byteBuffer, Boolean bool) {
        DataChannel dataChannel = this.dataChannels.get(str);
        if (dataChannel != null) {
            dataChannel.send(new DataChannel.Buffer(byteBuffer, bool.booleanValue()));
        }
    }

    public void dispose() {
        close();
        this.peerConnection.dispose();
        this.eventChannel.a(null);
    }

    public String getNextDataChannelUUID() {
        String uuid;
        do {
            uuid = UUID.randomUUID().toString();
        } while (this.dataChannels.get(uuid) != null);
        return uuid;
    }

    public PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    public void getReceivers(da20 da20Var) {
        List<RtpReceiver> receivers = this.peerConnection.getReceivers();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        Iterator<RtpReceiver> it = receivers.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(rtpReceiverToMap(it.next())));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("receivers", constraintsArray.toArrayList());
        da20Var.success(constraintsMap.toMap());
    }

    public RtpReceiver getRtpReceiverById(String str) {
        for (RtpReceiver rtpReceiver : this.peerConnection.getReceivers()) {
            if (str.equals(rtpReceiver.id())) {
                return rtpReceiver;
            }
        }
        return null;
    }

    public RtpSender getRtpSenderById(String str) {
        for (RtpSender rtpSender : this.peerConnection.getSenders()) {
            if (str.equals(rtpSender.id())) {
                return rtpSender;
            }
        }
        return null;
    }

    public RtpTransceiver getRtpTransceiverById(String str) {
        RtpTransceiver rtpTransceiver = this.transceivers.get(str);
        if (rtpTransceiver == null) {
            for (RtpTransceiver rtpTransceiver2 : this.peerConnection.getTransceivers()) {
                if (str.equals(rtpTransceiver2.getMid())) {
                    rtpTransceiver = rtpTransceiver2;
                }
            }
        }
        return rtpTransceiver;
    }

    public void getSenders(da20 da20Var) {
        List<RtpSender> senders = this.peerConnection.getSenders();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        Iterator<RtpSender> it = senders.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(rtpSenderToMap(it.next())));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("senders", constraintsArray.toArrayList());
        da20Var.success(constraintsMap.toMap());
    }

    public void getStats(da20 da20Var) {
        this.peerConnection.getStats(new a(this, da20Var, 2));
    }

    public void getStatsForTrack(String str, da20 da20Var) {
        RtpReceiver rtpReceiver;
        RtpSender rtpSender;
        if (str == null || str.isEmpty()) {
            resultError("peerConnectionGetStats", g8e.o("MediaStreamTrack not found for id: ", str), da20Var);
            return;
        }
        Iterator<RtpSender> it = this.peerConnection.getSenders().iterator();
        while (true) {
            rtpReceiver = null;
            if (!it.hasNext()) {
                rtpSender = null;
                break;
            }
            rtpSender = it.next();
            if (rtpSender.track() != null && str.equals(rtpSender.track().id())) {
                break;
            }
        }
        Iterator<RtpReceiver> it2 = this.peerConnection.getReceivers().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            RtpReceiver next = it2.next();
            if (next.track() != null && str.equals(next.track().id())) {
                rtpReceiver = next;
                break;
            }
        }
        if (rtpSender != null) {
            this.peerConnection.getStats(rtpSender, new a(this, da20Var, 0));
        } else if (rtpReceiver != null) {
            this.peerConnection.getStats(rtpReceiver, new a(this, da20Var, 1));
        } else {
            resultError("peerConnectionGetStats", "MediaStreamTrack not found for id: ".concat(str), da20Var);
        }
    }

    public void getTransceivers(da20 da20Var) {
        List<RtpTransceiver> transceivers = this.peerConnection.getTransceivers();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpTransceiver rtpTransceiver : transceivers) {
            String mid = rtpTransceiver.getMid();
            if (mid == null) {
                mid = this.stateProvider.getNextStreamUUID();
                this.transceivers.put(mid, rtpTransceiver);
            }
            constraintsArray.pushMap(new ConstraintsMap(transceiverToMap(mid, rtpTransceiver)));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("transceivers", constraintsArray.toArrayList());
        da20Var.success(constraintsMap.toMap());
    }

    public MediaStreamTrack getTransceiversTrack(String str) {
        if (this.configuration.sdpSemantics != PeerConnection.SdpSemantics.UNIFIED_PLAN) {
            return null;
        }
        Iterator<RtpTransceiver> it = this.peerConnection.getTransceivers().iterator();
        while (it.hasNext()) {
            RtpReceiver receiver = it.next().getReceiver();
            if (receiver != null && receiver.track() != null && receiver.track().id().equals(str)) {
                return receiver.track();
            }
        }
        return null;
    }

    /* renamed from: handleStatsReport, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$getStatsForTrack$1(RTCStatsReport rTCStatsReport, da20 da20Var) {
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RTCStats rTCStats : statsMap.values()) {
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", rTCStats.getId());
            constraintsMap2.putString("type", rTCStats.getType());
            constraintsMap2.putDouble(ClidProvider.TIMESTAMP, rTCStats.getTimestampUs());
            Map<String, Object> members = rTCStats.getMembers();
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            for (String str : members.keySet()) {
                Object obj = members.get(str);
                if (obj instanceof String) {
                    constraintsMap3.putString(str, (String) obj);
                } else if (obj instanceof String[]) {
                    ConstraintsArray constraintsArray2 = new ConstraintsArray();
                    for (String str2 : (String[]) obj) {
                        constraintsArray2.pushString(str2);
                    }
                    constraintsMap3.putArray(str, constraintsArray2.toArrayList());
                } else if (obj instanceof Integer) {
                    constraintsMap3.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    constraintsMap3.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    constraintsMap3.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    constraintsMap3.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof BigInteger) {
                    constraintsMap3.putLong(str, ((BigInteger) obj).longValue());
                } else if (obj instanceof LinkedHashMap) {
                    ConstraintsMap constraintsMap4 = new ConstraintsMap();
                    for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            constraintsMap4.putString((String) entry.getKey(), (String) value);
                        } else if (value instanceof Integer) {
                            constraintsMap4.putInt((String) entry.getKey(), ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            constraintsMap4.putLong((String) entry.getKey(), ((Long) value).longValue());
                        } else if (value instanceof Double) {
                            constraintsMap4.putDouble((String) entry.getKey(), ((Double) value).doubleValue());
                        } else if (value instanceof Boolean) {
                            constraintsMap4.putBoolean((String) entry.getKey(), ((Boolean) value).booleanValue());
                        } else if (value instanceof BigInteger) {
                            constraintsMap4.putLong((String) entry.getKey(), ((BigInteger) value).longValue());
                        } else {
                            value.getClass();
                            value.toString();
                        }
                    }
                    constraintsMap3.putMap(str, constraintsMap4.toMap());
                } else {
                    obj.getClass();
                    obj.toString();
                }
            }
            constraintsMap2.putMap("values", constraintsMap3.toMap());
            constraintsArray.pushMap(constraintsMap2);
        }
        constraintsMap.putArray("stats", constraintsArray.toArrayList());
        da20Var.success(constraintsMap.toMap());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String str;
        String id = mediaStream.getId();
        if ("default".equals(id)) {
            for (Map.Entry<String, MediaStream> entry : this.remoteStreams.entrySet()) {
                if (entry.getValue().equals(mediaStream)) {
                    str = entry.getKey();
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            this.stateProvider.getNextStreamUUID();
            this.remoteStreams.put(id, mediaStream);
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onAddStream");
        constraintsMap.putString("streamId", id);
        constraintsMap.putString("ownerTag", this.id);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (int i = 0; i < mediaStream.videoTracks.size(); i++) {
            VideoTrack videoTrack = mediaStream.videoTracks.get(i);
            String id2 = videoTrack.id();
            this.remoteTracks.put(id2, videoTrack);
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", id2);
            constraintsMap2.putString("label", "Video");
            constraintsMap2.putString("kind", videoTrack.kind());
            constraintsMap2.putBoolean(BackendConfig.Restrictions.ENABLED, videoTrack.enabled());
            constraintsMap2.putString("readyState", videoTrack.state().toString());
            constraintsMap2.putBoolean("remote", true);
            constraintsArray2.pushMap(constraintsMap2);
        }
        for (int i2 = 0; i2 < mediaStream.audioTracks.size(); i2++) {
            AudioTrack audioTrack = mediaStream.audioTracks.get(i2);
            String id3 = audioTrack.id();
            this.remoteTracks.put(id3, audioTrack);
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString("id", id3);
            constraintsMap3.putString("label", "Audio");
            constraintsMap3.putString("kind", audioTrack.kind());
            constraintsMap3.putBoolean(BackendConfig.Restrictions.ENABLED, audioTrack.enabled());
            constraintsMap3.putString("readyState", audioTrack.state().toString());
            constraintsMap3.putBoolean("remote", true);
            constraintsArray.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        for (MediaStream mediaStream : mediaStreamArr) {
            String id = mediaStream.getId();
            MediaStreamTrack track = rtpReceiver.track();
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onAddTrack");
            constraintsMap.putString("streamId", id);
            constraintsMap.putString("ownerTag", this.id);
            constraintsMap.putString("trackId", track.id());
            String id2 = track.id();
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", id2);
            constraintsMap2.putString("label", track.kind());
            constraintsMap2.putString("kind", track.kind());
            constraintsMap2.putBoolean(BackendConfig.Restrictions.ENABLED, track.enabled());
            constraintsMap2.putString("readyState", track.state().toString());
            constraintsMap2.putBoolean("remote", true);
            constraintsMap.putMap(BaseTrack.KEY_TRACK, constraintsMap2.toMap());
            sendEvent(constraintsMap);
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(track.kind())) {
                AudioSwitchManager.instance.start();
            }
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (MediaStream mediaStream2 : mediaStreamArr) {
            constraintsArray.pushMap(new ConstraintsMap(mediaStreamToMap(mediaStream2)));
        }
        constraintsMap3.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTrack");
        constraintsMap3.putArray("streams", constraintsArray.toArrayList());
        constraintsMap3.putMap(BaseTrack.KEY_TRACK, mediaTrackToMap(rtpReceiver.track()));
        constraintsMap3.putMap("receiver", rtpReceiverToMap(rtpReceiver));
        if (this.configuration.sdpSemantics == PeerConnection.SdpSemantics.UNIFIED_PLAN) {
            for (RtpTransceiver rtpTransceiver : this.peerConnection.getTransceivers()) {
                if (rtpTransceiver.getReceiver() != null && rtpReceiver.id().equals(rtpTransceiver.getReceiver().id())) {
                    String mid = rtpTransceiver.getMid();
                    if (mid == null) {
                        mid = this.stateProvider.getNextStreamUUID();
                        this.transceivers.put(mid, rtpTransceiver);
                    }
                    constraintsMap3.putMap("transceiver", transceiverToMap(mid, rtpTransceiver));
                }
            }
        }
        sendEvent(constraintsMap3);
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        peerConnectionState.name();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "peerConnectionState");
        constraintsMap.putString(ClidProvider.STATE, Utils.connectionStateString(peerConnectionState));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        String nextDataChannelUUID = getNextDataChannelUUID();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "didOpenDataChannel");
        constraintsMap.putInt("id", dataChannel.id());
        constraintsMap.putString("label", dataChannel.label());
        constraintsMap.putString("flutterId", nextDataChannelUUID);
        this.dataChannels.put(nextDataChannelUUID, dataChannel);
        registerDataChannelObserver(nextDataChannelUUID, dataChannel);
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onCandidate");
        constraintsMap.putMap("candidate", candidateToMap(iceCandidate));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "iceConnectionState");
        constraintsMap.putString(ClidProvider.STATE, Utils.iceConnectionStateString(iceConnectionState));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        iceGatheringState.name();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "iceGatheringState");
        constraintsMap.putString(ClidProvider.STATE, Utils.iceGatheringStateString(iceGatheringState));
        sendEvent(constraintsMap);
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        this.eventSink = new AnyThreadSink(xeoVar);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        String id = mediaStream.getId();
        Iterator<VideoTrack> it = mediaStream.videoTracks.iterator();
        while (it.hasNext()) {
            this.remoteTracks.remove(it.next().id());
        }
        Iterator<AudioTrack> it2 = mediaStream.audioTracks.iterator();
        while (it2.hasNext()) {
            this.remoteTracks.remove(it2.next().id());
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onRemoveStream");
        constraintsMap.putString("streamId", id);
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveTrack(RtpReceiver rtpReceiver) {
        MediaStreamTrack track = rtpReceiver.track();
        String id = track.id();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("id", id);
        constraintsMap.putString("label", track.kind());
        constraintsMap.putString("kind", track.kind());
        constraintsMap.putBoolean(BackendConfig.Restrictions.ENABLED, track.enabled());
        constraintsMap.putString("readyState", track.state().toString());
        constraintsMap.putBoolean("remote", true);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onRemoveTrack");
        constraintsMap2.putString("trackId", track.id());
        constraintsMap2.putMap(BaseTrack.KEY_TRACK, constraintsMap.toMap());
        sendEvent(constraintsMap2);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onRenegotiationNeeded");
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSelectedCandidatePairChanged");
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putInt("lastDataReceivedMs", candidatePairChangeEvent.lastDataReceivedMs);
        constraintsMap2.putMap("local", candidateToMap(candidatePairChangeEvent.local));
        constraintsMap2.putMap("remote", candidateToMap(candidatePairChangeEvent.remote));
        constraintsMap2.putString(CRLReasonCodeExtension.REASON, candidatePairChangeEvent.reason);
        constraintsMap.putMap("candidate", constraintsMap2.toMap());
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "signalingState");
        constraintsMap.putString(ClidProvider.STATE, Utils.signalingStateString(signalingState));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver rtpTransceiver) {
    }

    public void removeTrack(String str, da20 da20Var) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("removeTrack", "sender is null", da20Var);
            return;
        }
        boolean removeTrack = this.peerConnection.removeTrack(rtpSenderById);
        HashMap hashMap = new HashMap();
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, Boolean.valueOf(removeTrack));
        da20Var.success(hashMap);
    }

    public void restartIce() {
        this.peerConnection.restartIce();
    }

    public void rtpSenderSetParameters(String str, Map<String, Object> map, da20 da20Var) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetParameters", "sender is null", da20Var);
            return;
        }
        boolean parameters = rtpSenderById.setParameters(updateRtpParameters(rtpSenderById.getParameters(), map));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, parameters);
        da20Var.success(constraintsMap.toMap());
    }

    public void rtpSenderSetStreams(String str, List<String> list, da20 da20Var) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetStream", "sender is null", da20Var);
        } else {
            rtpSenderById.setStreams(list);
            da20Var.success(null);
        }
    }

    public void rtpSenderSetTrack(String str, MediaStreamTrack mediaStreamTrack, da20 da20Var, boolean z) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetTrack", "sender is null", da20Var);
        } else {
            rtpSenderById.setTrack(mediaStreamTrack, false);
            da20Var.success(null);
        }
    }

    public void rtpTransceiverGetCurrentDirection(String str, da20 da20Var) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverGetCurrentDirection", "transceiver is null", da20Var);
            return;
        }
        RtpTransceiver.RtpTransceiverDirection currentDirection = rtpTransceiverById.getCurrentDirection();
        if (currentDirection == null) {
            da20Var.success(null);
            return;
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(TarifficatorScenarioActivity.RESULT_KEY, transceiverDirectionString(currentDirection));
        da20Var.success(constraintsMap.toMap());
    }

    public void rtpTransceiverGetDirection(String str, da20 da20Var) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverGetDirection", "transceiver is null", da20Var);
            return;
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(TarifficatorScenarioActivity.RESULT_KEY, transceiverDirectionString(rtpTransceiverById.getDirection()));
        da20Var.success(constraintsMap.toMap());
    }

    public void rtpTransceiverSetCodecPreferences(String str, List<Map<String, Object>> list, da20 da20Var) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverSetCodecPreferences", "transceiver is null", da20Var);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : list) {
            RtpCapabilities.CodecCapability codecCapability = new RtpCapabilities.CodecCapability();
            String str2 = (String) map.get("mimeType");
            List asList = Arrays.asList(str2.split("/"));
            codecCapability.name = (String) asList.get(1);
            codecCapability.kind = stringToMediaType((String) asList.get(0));
            codecCapability.mimeType = str2;
            Integer num = (Integer) map.get("clockRate");
            num.intValue();
            codecCapability.clockRate = num;
            if (map.get("numChannels") != null) {
                Integer num2 = (Integer) map.get("numChannels");
                num2.intValue();
                codecCapability.numChannels = num2;
            }
            if (map.get("sdpFmtpLine") == null || map.get("sdpFmtpLine") == "") {
                codecCapability.parameters = new HashMap();
            } else {
                String str3 = (String) map.get("sdpFmtpLine");
                codecCapability.parameters = new HashMap();
                for (String str4 : str3.split(";")) {
                    if (str4.contains("=")) {
                        List asList2 = Arrays.asList(str4.split("="));
                        codecCapability.parameters.put((String) asList2.get(0), (String) asList2.get(1));
                    } else {
                        codecCapability.parameters.put("", str4);
                    }
                }
            }
            arrayList.add(codecCapability);
        }
        rtpTransceiverById.setCodecPreferences(arrayList);
        da20Var.success(null);
    }

    public void rtpTransceiverSetDirection(String str, String str2, da20 da20Var) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str2);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverSetDirection", "transceiver is null", da20Var);
        } else {
            rtpTransceiverById.setDirection(stringToTransceiverDirection(str));
            da20Var.success(null);
        }
    }

    public void rtpTransceiverStop(String str, da20 da20Var) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverStop", "transceiver is null", da20Var);
        } else {
            rtpTransceiverById.stop();
            da20Var.success(null);
        }
    }

    public void sendEvent(ConstraintsMap constraintsMap) {
        xeo xeoVar = this.eventSink;
        if (xeoVar != null) {
            xeoVar.success(constraintsMap.toMap());
        }
    }

    public void setPeerConnection(PeerConnection peerConnection) {
        this.peerConnection = peerConnection;
    }

    public Map<String, Object> transceiverToMap(String str, RtpTransceiver rtpTransceiver) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("transceiverId", str);
        if (rtpTransceiver.getMid() == null) {
            constraintsMap.putString("mid", "");
        } else {
            constraintsMap.putString("mid", rtpTransceiver.getMid());
        }
        constraintsMap.putString("direction", transceiverDirectionString(rtpTransceiver.getDirection()));
        constraintsMap.putMap("sender", rtpSenderToMap(rtpTransceiver.getSender()));
        constraintsMap.putMap("receiver", rtpReceiverToMap(rtpTransceiver.getReceiver()));
        return constraintsMap.toMap();
    }
}
