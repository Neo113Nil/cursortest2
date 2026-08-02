package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.unity3d.services.core.device.MimeTypes;
import io.reactivex.rxjava3.core.e;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.single.s;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import xsna.bjn0;
import xsna.pn00;
import xsna.vk60;
import xsna.zoc0;

/* compiled from: SupportedCodecsStatistics.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class SupportedCodecsStatistics {
    private static final String LOG_TAG = "SupportedCodecsStatistics";
    public static final SupportedCodecsStatistics INSTANCE = new SupportedCodecsStatistics();
    private static final long ONE_MONTH_IN_MS = TimeUnit.DAYS.toMillis(30);
    private static final Map<String, String> CODEC_ALIASES = pn00.k(new Pair("video/av1", "AV1"), new Pair(MimeTypes.VIDEO_AV1, "AV1"), new Pair(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8, "VP8"), new Pair(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9, "VP9"), new Pair("video/avc", PeerConnectionClient.VIDEO_CODEC_H264), new Pair("video/hevc", "H265"), new Pair(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS, "OPUS"));

    private SupportedCodecsStatistics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject buildCodecLists() {
        boolean isHardwareAccelerated;
        int i = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int length = codecInfos.length;
        int i2 = 0;
        while (i2 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i2];
            JSONObject jSONObject2 = new JSONObject();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null && supportedTypes.length != 0) {
                int length2 = supportedTypes.length;
                int i3 = i;
                while (i3 < length2) {
                    String str = supportedTypes[i3];
                    String str2 = CODEC_ALIASES.get(str);
                    if (str2 != null) {
                        jSONObject2.put("codec_name", str2);
                        jSONObject2.put(StatCustomFieldKey.CODEC_IMPLEMENTATION, mediaCodecInfo.getName());
                        jSONObject2.put("mime_type", str);
                        jSONObject2.put("is_encoder", mediaCodecInfo.isEncoder());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            i5 += codecProfileLevelArr[i4].profile;
                            i4++;
                        }
                        jSONObject2.put("profiles", i5);
                        int i6 = Build.VERSION.SDK_INT;
                        jSONObject2.put("instance_count", capabilitiesForType.getMaxSupportedInstances());
                        if (i6 >= 29) {
                            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                            jSONObject2.put("is_hardware", isHardwareAccelerated);
                        }
                        jSONArray.put(jSONObject2);
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        jSONObject.put("codecs", jSONArray);
        return jSONObject;
    }

    @SuppressLint({"CheckResult"})
    public static final void tryToReport(final OkApiServiceInternal okApiServiceInternal, final PreferencesHelper preferencesHelper, final RTCLog rTCLog) {
        final long time = new Date().getTime();
        new s(new v(new zoc0(preferencesHelper, 1)), new l() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2

            /* compiled from: SupportedCodecsStatistics.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2$1, reason: invalid class name */
            public static final class AnonymousClass1<T, R> implements l {
                final /* synthetic */ long $currentTime;
                final /* synthetic */ PreferencesHelper $preferencesHelper;
                final /* synthetic */ RTCLog $rtcLog;

                public AnonymousClass1(RTCLog rTCLog, PreferencesHelper preferencesHelper, long j) {
                    this.$rtcLog = rTCLog;
                    this.$preferencesHelper = preferencesHelper;
                    this.$currentTime = j;
                }

                @Override // io.reactivex.rxjava3.functions.l
                public final e apply(ClientSupportedCodecs.Response response) {
                    this.$rtcLog.log("SupportedCodecsStatistics", "Supported codecs are sent with success=" + response.getSuccess());
                    if (!response.getSuccess()) {
                        return i.b;
                    }
                    final PreferencesHelper preferencesHelper = this.$preferencesHelper;
                    final long j = this.$currentTime;
                    return io.reactivex.rxjava3.core.a.l(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: RETURN 
                          (wrap:io.reactivex.rxjava3.internal.operators.completable.l:0x0028: INVOKE 
                          (wrap:io.reactivex.rxjava3.functions.a:0x0025: CONSTRUCTOR (r5v3 'preferencesHelper' ru.ok.android.webrtc.utils.PreferencesHelper A[DONT_INLINE]), (r0v1 'j' long A[DONT_INLINE]) A[MD:(ru.ok.android.webrtc.utils.PreferencesHelper, long):void (m), WRAPPED] call: ru.ok.android.externcalls.sdk.stat.supportedcodecs.a.<init>(ru.ok.android.webrtc.utils.PreferencesHelper, long):void type: CONSTRUCTOR)
                         STATIC call: io.reactivex.rxjava3.core.a.l(io.reactivex.rxjava3.functions.a):io.reactivex.rxjava3.internal.operators.completable.l A[MD:(io.reactivex.rxjava3.functions.a):io.reactivex.rxjava3.internal.operators.completable.l (m), WRAPPED])
                         in method: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2.1.apply(ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs$Response):io.reactivex.rxjava3.core.e, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.a, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        ru.ok.android.webrtc.RTCLog r0 = r4.$rtcLog
                        boolean r1 = r5.getSuccess()
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "Supported codecs are sent with success="
                        r2.<init>(r3)
                        r2.append(r1)
                        java.lang.String r1 = r2.toString()
                        java.lang.String r2 = "SupportedCodecsStatistics"
                        r0.log(r2, r1)
                        boolean r5 = r5.getSuccess()
                        if (r5 == 0) goto L2d
                        ru.ok.android.webrtc.utils.PreferencesHelper r5 = r4.$preferencesHelper
                        long r0 = r4.$currentTime
                        ru.ok.android.externcalls.sdk.stat.supportedcodecs.a r2 = new ru.ok.android.externcalls.sdk.stat.supportedcodecs.a
                        r2.<init>(r5, r0)
                        io.reactivex.rxjava3.internal.operators.completable.l r5 = io.reactivex.rxjava3.core.a.l(r2)
                        return r5
                    L2d:
                        io.reactivex.rxjava3.internal.operators.completable.i r5 = io.reactivex.rxjava3.internal.operators.completable.i.b
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$2.AnonymousClass1.apply(ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs$Response):io.reactivex.rxjava3.core.e");
                }
            }

            @Override // io.reactivex.rxjava3.functions.l
            public final e apply(Long l) {
                long j;
                JSONObject buildCodecLists;
                long longValue = time - l.longValue();
                j = SupportedCodecsStatistics.ONE_MONTH_IN_MS;
                if (longValue < j) {
                    return i.b;
                }
                buildCodecLists = SupportedCodecsStatistics.INSTANCE.buildCodecLists();
                rTCLog.log("SupportedCodecsStatistics", "Sending supported codecs " + buildCodecLists);
                x<ClientSupportedCodecs.Response> sendSupportedCodecsStatistics = okApiServiceInternal.sendSupportedCodecsStatistics(buildCodecLists);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(rTCLog, preferencesHelper, time);
                sendSupportedCodecsStatistics.getClass();
                return new s(sendSupportedCodecsStatistics, anonymousClass1);
            }
        }).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new vk60(1), new f() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics$tryToReport$4
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                bjn0.b("Failed to send supported codecs with error: ", th.getMessage(), RTCLog.this, "SupportedCodecsStatistics");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long tryToReport$lambda$0(PreferencesHelper preferencesHelper) {
        return Long.valueOf(preferencesHelper.getLong(PreferencesHelper.SUPPORTED_CODECS_LAST_UPDATE_INDEX_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryToReport$lambda$1() {
    }
}
