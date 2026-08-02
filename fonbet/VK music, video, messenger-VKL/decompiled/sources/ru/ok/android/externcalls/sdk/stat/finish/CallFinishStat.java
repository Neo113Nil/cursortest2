package ru.ok.android.externcalls.sdk.stat.finish;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.c5g;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: CallFinishStat.kt */
/* loaded from: classes9.dex */
public final class CallFinishStat extends SingleShotStat {
    public CallFinishStat(gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
    }

    public static /* synthetic */ void onCallFinished$default(CallFinishStat callFinishStat, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        callFinishStat.onCallFinished(conversationEndReason, list, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onCallFinished$lambda$0(CallFinishStat callFinishStat, ConversationEndReason conversationEndReason, List list, String str, boolean z, CallEventualStatSender callEventualStatSender) {
        callFinishStat.report(callEventualStatSender, conversationEndReason, list, str, z);
        return s3q0.a;
    }

    private final void report(CallEventualStatSender callEventualStatSender, ConversationEndReason conversationEndReason, List<RateHint> list, String str, boolean z) {
        if ((conversationEndReason instanceof ConversationEndReason.Missed) && z) {
            conversationEndReason = ConversationEndReason.CallTimeout.INSTANCE;
        }
        if (str == null) {
            str = "";
        }
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(str);
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("reason", conversationEndReason.getKey());
        List<RateHint> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RateHint) it.next()).getReason());
        }
        eventItemsMap.set(StatCustomFieldKey.RATE_REASONS_KEY, j5g.g0(j5g.C0(arrayList), StringUtils.COMMA, null, null, 0, null, 62));
        s3q0 s3q0Var = s3q0.a;
        callEventualStatSender.send(CallEventualStatName.CALL_FINISH, eventItemValue, eventItemsMap);
    }

    public static /* synthetic */ void report$default(CallFinishStat callFinishStat, CallEventualStatSender callEventualStatSender, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        callFinishStat.report(callEventualStatSender, conversationEndReason, list, str, z);
    }

    public final void onCallFinished(final ConversationEndReason conversationEndReason, final List<RateHint> list, final String str, final boolean z) {
        reportOnce(new izs() { // from class: xsna.o39
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                s3q0 onCallFinished$lambda$0;
                onCallFinished$lambda$0 = CallFinishStat.onCallFinished$lambda$0(CallFinishStat.this, conversationEndReason, list, str, z, (CallEventualStatSender) obj);
                return onCallFinished$lambda$0;
            }
        });
    }
}
