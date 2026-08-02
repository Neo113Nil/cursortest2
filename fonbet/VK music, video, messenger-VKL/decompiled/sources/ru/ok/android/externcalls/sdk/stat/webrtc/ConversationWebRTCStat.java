package ru.ok.android.externcalls.sdk.stat.webrtc;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import one.video.calls.sdk.internal.stat.webrtc.config.WebRTCStatConfig;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.Timestamp;
import xsna.g57;
import xsna.gzs;
import xsna.lhx0;
import xsna.pn00;
import xsna.zcl;

/* compiled from: ConversationWebRTCStat.kt */
/* loaded from: classes9.dex */
public final class ConversationWebRTCStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_TRANSPORT = "transport";

    @Deprecated
    public static final String LOG_TAG = "ConversationWebRTCStat";
    private final c getConfigDisposable;
    private final gzs<CallEventualStatSender> getEventualStatSender;
    private long lastGatheringStartTs;
    private volatile long lastRemoteSDPRecvTs;
    private final RTCLog logger;
    private final TimeProvider timeProvider;
    private final List<Event> eventsCache = new ArrayList();
    private final Set<WebRTCStatConfig.LogItemType> logItems = new LinkedHashSet();
    private long signalingStateChangedTs = -1;
    private long gatheringStateChangedTs = -1;

    /* compiled from: ConversationWebRTCStat.kt */
    public final class AnswerGenerated extends Event {
        public AnswerGenerated() {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_GENERATED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(0L)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl("answer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SDP;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class AnswerReceived extends Event {
        public AnswerReceived() {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_RECEIVED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(0L)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl("answer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SDP;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class CandidateGenerated extends Event {
        public CandidateGenerated(long j, String str, String str2, String str3) {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_GENERATED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(j)), new EventItemsMap((Map<String, ? extends EventItemValue>) pn00.k(new Pair(StatCustomFieldKey.LOCAL_ADDRESS, EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str))), new Pair("transport", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str2))), new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str3))))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.CANDIDATE;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class CandidateReceived extends Event {
        public CandidateReceived(long j, String str, String str2, String str3) {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_RECEIVED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(j)), new EventItemsMap((Map<String, ? extends EventItemValue>) pn00.k(new Pair(StatCustomFieldKey.REMOTE_ADDRESS, EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str))), new Pair("transport", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str2))), new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str3))))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.CANDIDATE;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class GatheringStateChanged extends Event {
        public GatheringStateChanged(long j, String str) {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.GATHERING_STATE_CHANGED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(j)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str)))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SIGNALING;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class OfferGenerated extends Event {
        public OfferGenerated() {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_GENERATED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(0L)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl("offer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SDP;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class OfferReceived extends Event {
        public OfferReceived() {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SDP_RECEIVED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(0L)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl("offer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SDP;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public final class SignalingStateChanged extends Event {
        public SignalingStateChanged(long j, String str) {
            super(ConversationWebRTCStat.this, null, CallEventualStatName.SIGNALING_STATE_CHANGED, EventItemValue.LongValue.m318boximpl(EventItemValue.LongValue.m319constructorimpl(j)), new EventItemsMap((Pair<String, ? extends EventItemValue>) new Pair("string_value", EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(str)))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public WebRTCStatConfig.LogItemType getItemType() {
            return WebRTCStatConfig.LogItemType.SIGNALING;
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public static final class WebRTCStatException extends RuntimeException {
        public WebRTCStatException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PeerConnection.SignalingState.values().length];
            try {
                iArr[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PeerConnection.IceGatheringState.values().length];
            try {
                iArr2[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationWebRTCStat(lhx0 lhx0Var, RTCLog rTCLog, TimeProvider timeProvider, gzs<? extends CallEventualStatSender> gzsVar) {
        this.logger = rTCLog;
        this.timeProvider = timeProvider;
        this.getEventualStatSender = gzsVar;
        this.getConfigDisposable = lhx0Var.getConfig().k(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat$getConfigDisposable$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(WebRTCStatConfig webRTCStatConfig) {
                ConversationWebRTCStat.this.maybeInitWebRTCStat(webRTCStatConfig);
            }
        }, new f() { // from class: ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat$getConfigDisposable$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RTCLog rTCLog2;
                rTCLog2 = ConversationWebRTCStat.this.logger;
                rTCLog2.reportException(ConversationWebRTCStat.LOG_TAG, "Error getting p2p relay switch config", th);
            }
        }, new g57(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConfigDisposable$lambda$0(ConversationWebRTCStat conversationWebRTCStat) {
        conversationWebRTCStat.reset();
        conversationWebRTCStat.logger.log(LOG_TAG, "Remote config has not been provided, reset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeInitWebRTCStat(WebRTCStatConfig webRTCStatConfig) {
        if (this.logItems.isEmpty()) {
            this.logItems.addAll(webRTCStatConfig.a);
            if (!this.logItems.isEmpty()) {
                reportAll();
            } else {
                this.logItems.add(WebRTCStatConfig.LogItemType.NONE);
                this.eventsCache.clear();
            }
        }
    }

    private final MiscHelper.IceCandidateParts parseIceCandidateSdp(String str) {
        try {
            MiscHelper.IceCandidateParts fromString = MiscHelper.IceCandidateParts.fromString(str);
            if (fromString == null) {
                this.logger.log(LOG_TAG, "Can't parse candidate " + str);
                return null;
            }
            if (fromString.address != null) {
                return fromString;
            }
            this.logger.log(LOG_TAG, "Can't get address from candidate " + str);
            return null;
        } catch (Throwable th) {
            this.logger.reportException(LOG_TAG, "Error on parse candidate sdp", new WebRTCStatException(th));
            return null;
        }
    }

    private final void report(Event event) {
        if (!this.logItems.isEmpty()) {
            send(event);
            return;
        }
        this.eventsCache.add(event);
        this.logger.log(LOG_TAG, "Event " + event + " cached because logging level is not yet known");
    }

    private final void reportAll() {
        Iterator<T> it = this.eventsCache.iterator();
        while (it.hasNext()) {
            send((Event) it.next());
        }
        this.eventsCache.clear();
    }

    private final void reset() {
        this.logItems.clear();
        this.logItems.add(WebRTCStatConfig.LogItemType.NONE);
        this.eventsCache.clear();
    }

    private final void send(Event event) {
        if (!event.isSuitableForLoggingLevel(this.logItems)) {
            this.logger.log(LOG_TAG, "Event " + event + " is not suitable for logging level " + this.logItems);
            return;
        }
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            invoke.sendWithTs(event.getName(), event.getTs(), event.getValue(), event.getAttributes());
        }
        this.logger.log(LOG_TAG, "Event " + event + " submitted");
    }

    public final void onAnswerGenerated() {
        report(new AnswerGenerated());
    }

    public final void onAnswerReceived() {
        this.lastRemoteSDPRecvTs = this.timeProvider.getMsSinceBoot();
        report(new AnswerReceived());
    }

    public final void onGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
        String str;
        long msSinceBoot = this.timeProvider.getMsSinceBoot();
        long j = this.gatheringStateChangedTs;
        long j2 = j == -1 ? 0L : msSinceBoot - j;
        int i = WhenMappings.$EnumSwitchMapping$1[iceGatheringState.ordinal()];
        if (i == 1) {
            str = "new";
        } else if (i == 2) {
            this.lastGatheringStartTs = msSinceBoot;
            str = "gathering";
        } else {
            if (i != 3) {
                this.logger.log(LOG_TAG, "Unexpected ice gathering state " + iceGatheringState);
                return;
            }
            str = CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;
        }
        this.gatheringStateChangedTs = msSinceBoot;
        report(new GatheringStateChanged(j2, str));
    }

    public final void onIceCandidateGenerated(String str) {
        MiscHelper.IceCandidateParts parseIceCandidateSdp = parseIceCandidateSdp(str);
        if (parseIceCandidateSdp != null) {
            onIceCandidateGenerated(parseIceCandidateSdp.address, parseIceCandidateSdp.transport, parseIceCandidateSdp.type);
        }
    }

    public final void onIceCandidateReceived(String str) {
        MiscHelper.IceCandidateParts parseIceCandidateSdp = parseIceCandidateSdp(str);
        if (parseIceCandidateSdp != null) {
            onIceCandidateReceived(parseIceCandidateSdp.address, parseIceCandidateSdp.transport, parseIceCandidateSdp.type);
        }
    }

    public final void onOfferGenerated() {
        report(new OfferGenerated());
    }

    public final void onOfferReceived() {
        this.lastRemoteSDPRecvTs = this.timeProvider.getMsSinceBoot();
        report(new OfferReceived());
    }

    public final void onSignalingStateChanged(PeerConnection.SignalingState signalingState) {
        String str;
        long msSinceBoot = this.timeProvider.getMsSinceBoot();
        long j = this.signalingStateChangedTs;
        long j2 = j == -1 ? 0L : msSinceBoot - j;
        switch (WhenMappings.$EnumSwitchMapping$0[signalingState.ordinal()]) {
            case 1:
                str = "stable";
                break;
            case 2:
                str = "have.local.offer";
                break;
            case 3:
                str = "have.remote.offer";
                break;
            case 4:
                str = "have.local.answer";
                break;
            case 5:
                str = "have.remote.answer";
                break;
            case 6:
                str = "closed";
                break;
            default:
                this.logger.log(LOG_TAG, "Unexpected signaling state " + signalingState);
                return;
        }
        this.signalingStateChangedTs = msSinceBoot;
        report(new SignalingStateChanged(j2, str));
    }

    public final void release() {
        this.getConfigDisposable.dispose();
    }

    private final void onIceCandidateGenerated(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        report(new CandidateGenerated(this.timeProvider.getMsSinceBoot() - this.lastGatheringStartTs, str, str2, str3));
    }

    private final void onIceCandidateReceived(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        report(new CandidateReceived(this.timeProvider.getMsSinceBoot() - this.lastRemoteSDPRecvTs, str, str2, str3));
    }

    /* compiled from: ConversationWebRTCStat.kt */
    public abstract class Event {
        private final EventItemsMap attributes;
        private final String name;
        private final Timestamp ts;
        private final EventItemValue value;

        public Event(Timestamp timestamp, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
            this.ts = timestamp;
            this.name = str;
            this.value = eventItemValue;
            this.attributes = eventItemsMap;
        }

        public final EventItemsMap getAttributes() {
            return this.attributes;
        }

        public abstract WebRTCStatConfig.LogItemType getItemType();

        public final String getName() {
            return this.name;
        }

        public final Timestamp getTs() {
            return this.ts;
        }

        public final EventItemValue getValue() {
            return this.value;
        }

        public boolean isSuitableForLoggingLevel(Set<? extends WebRTCStatConfig.LogItemType> set) {
            return set.contains(getItemType());
        }

        public String toString() {
            return this.name + ", value=" + this.value + ", " + this.attributes;
        }

        public /* synthetic */ Event(ConversationWebRTCStat conversationWebRTCStat, Timestamp timestamp, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i, zcl zclVar) {
            this((i & 1) != 0 ? conversationWebRTCStat.timeProvider.timeMs() : timestamp, str, eventItemValue, (i & 8) != 0 ? new EventItemsMap() : eventItemsMap);
        }
    }
}
