package ru.ok.android.externcalls.sdk.stat.start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.internal.StatExtensionsKt;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ConversationStartedStat.kt */
/* loaded from: classes9.dex */
public final class ConversationStartedStat extends SingleShotStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String STATUS_FINISHED = "warmup_finished";

    @Deprecated
    public static final String STATUS_IN_PROGRESS = "warmup_inprogress";

    @Deprecated
    public static final String STATUS_STARTED = "warmup_start";
    private final Conversation.CallType callType;
    private final long startTimeMs;
    private final TimeProvider timeProvider;

    /* compiled from: ConversationStartedStat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationStartedStat(Conversation.CallType callType, TimeProvider timeProvider, gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
        this.callType = callType;
        this.timeProvider = timeProvider;
        this.startTimeMs = timeProvider.getMsSinceBoot();
    }

    private final String getWarmupStatusString() {
        return STATUS_STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(CallEventualStatSender callEventualStatSender) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(this.timeProvider.getMsSinceBoot() - this.startTimeMs);
        EventItemsMap eventItemsMap = new EventItemsMap();
        List l = e43.l(StatExtensionsKt.asString$default(this.callType, false, 1, null), getWarmupStatusString());
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl((String) it.next())));
        }
        if (!arrayList2.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            s3q0 s3q0Var = s3q0.a;
            eventItemsMap.set("string_value", jSONObject.put("labels", jSONArray).toString());
        }
        s3q0 s3q0Var2 = s3q0.a;
        callEventualStatSender.send(CallEventualStatName.CALL_STARTED, eventItemValue, eventItemsMap);
    }

    public final void onConversationStarted() {
        reportOnce(new ConversationStartedStat$onConversationStarted$1(this));
    }
}
