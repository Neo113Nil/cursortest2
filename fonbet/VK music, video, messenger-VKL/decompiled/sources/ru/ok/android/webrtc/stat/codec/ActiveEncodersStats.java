package ru.ok.android.webrtc.stat.codec;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.e43;
import xsna.epx;
import xsna.on00;
import xsna.pn00;
import xsna.pzl;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ActiveEncodersStats {
    public static final Companion Companion = new Companion(null);
    public static final List d = e43.l("", "null", "libvpx", "unknown");
    public final CallEventualStatSender a;
    public final ActiveVideoEncoderStat b;
    public final ActiveAudioEncoderStat c = new ActiveAudioEncoderStat(new a(this));

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public static String a(Ssrc.CodecInfo codecInfo) {
            if (codecInfo == null) {
                return "null";
            }
            String str = codecInfo.codecImplName;
            String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "null";
            return ActiveEncodersStats.d.contains(lowerCase) ? pzl.b(codecInfo.codecName, StringUtils.PROCESS_POSTFIX_DELIMITER, lowerCase) : lowerCase;
        }

        public static final /* synthetic */ String access$getCodecCanonicalName(Companion companion, Ssrc.CodecInfo codecInfo) {
            companion.getClass();
            return a(codecInfo);
        }
    }

    public ActiveEncodersStats(CallEventualStatSender callEventualStatSender, TimeProvider timeProvider, RTCLog rTCLog) {
        this.a = callEventualStatSender;
        this.b = new ActiveVideoEncoderStat(timeProvider, new b(this));
    }

    public static final void access$onAudioCodec(ActiveEncodersStats activeEncodersStats, NamedCodecInfo namedCodecInfo) {
        activeEncodersStats.getClass();
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(namedCodecInfo.getCanonicalName());
        String str = namedCodecInfo.getCodecInfo().sdpFmtpLine;
        if (str == null) {
            str = "NULL";
        }
        activeEncodersStats.a.send(CallEventualStatName.CODEC_USAGE, EventItemValueKt.toEventItemValue(0L), new EventItemsMap((Map<String, ? extends EventItemValue>) pn00.k(new Pair(StatCustomFieldKey.CODEC_IMPLEMENTATION, eventItemValue), new Pair("string_value", EventItemValueKt.toEventItemValue(str)))));
    }

    public static final void access$onVideoCodec(ActiveEncodersStats activeEncodersStats, NamedCodecInfo namedCodecInfo, long j) {
        activeEncodersStats.getClass();
        activeEncodersStats.a.send(CallEventualStatName.CODEC_USAGE, EventItemValueKt.toEventItemValue(j), new EventItemsMap((Map<String, ? extends EventItemValue>) on00.f(new Pair(StatCustomFieldKey.CODEC_IMPLEMENTATION, EventItemValueKt.toEventItemValue(namedCodecInfo.getCanonicalName())))));
    }

    public final void onCallEnded() {
        this.b.onStopped();
        this.c.onStopped();
    }

    public final void onCallStarted() {
        this.c.onStarted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRTCStat(RTCStat rTCStat) {
        Object obj;
        Object obj2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        List<Ssrc> list = rTCStat.ssrcs;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof Ssrc.VideoSend) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            objArr4 = 0;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (epx.f(((Ssrc.Send) obj).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        Ssrc.VideoSend videoSend = (Ssrc.VideoSend) ((Ssrc.Send) obj);
        int i3 = 2;
        NamedCodecInfo namedCodecInfo = videoSend != null ? new NamedCodecInfo(videoSend.codecInfo, objArr == true ? 1 : 0, i3, objArr2 == true ? 1 : 0) : null;
        List<Ssrc> list2 = rTCStat.ssrcs;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof Ssrc.AudioSend) {
                arrayList2.add(obj4);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            if (i >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList2.get(i);
            i++;
            if (epx.f(((Ssrc.Send) obj2).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        Ssrc.AudioSend audioSend = (Ssrc.AudioSend) ((Ssrc.Send) obj2);
        NamedCodecInfo namedCodecInfo2 = audioSend != null ? new NamedCodecInfo(audioSend.codecInfo, objArr3 == true ? 1 : 0, i3, objArr4 == true ? 1 : 0) : null;
        this.b.onRTCCodecInfo(namedCodecInfo);
        this.c.onRTCCodecInfo(namedCodecInfo2);
    }

    public final void onVideoEnabled(boolean z) {
        if (z) {
            this.b.onStarted();
        } else {
            this.b.onStopped();
        }
    }

    public static final class NamedCodecInfo {
        public final Ssrc.CodecInfo a;
        public final String b;

        public NamedCodecInfo(Ssrc.CodecInfo codecInfo, String str) {
            this.a = codecInfo;
            this.b = str;
        }

        public final String getCanonicalName() {
            return this.b;
        }

        public final Ssrc.CodecInfo getCodecInfo() {
            return this.a;
        }

        public /* synthetic */ NamedCodecInfo(Ssrc.CodecInfo codecInfo, String str, int i, zcl zclVar) {
            this(codecInfo, (i & 2) != 0 ? Companion.access$getCodecCanonicalName(ActiveEncodersStats.Companion, codecInfo) : str);
        }
    }
}
