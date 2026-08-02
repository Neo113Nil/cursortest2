package ru.ok.android.webrtc.stat.call.methods.eventual;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.utils.time.Timestamp;

/* loaded from: classes9.dex */
public interface CallEventualStatSender {
    static /* synthetic */ void send$default(CallEventualStatSender callEventualStatSender, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 2) != 0) {
            eventItemValue = null;
        }
        if ((i & 4) != 0) {
            eventItemsMap = new EventItemsMap();
        }
        callEventualStatSender.send(str, eventItemValue, eventItemsMap);
    }

    static /* synthetic */ void sendWithTs$default(CallEventualStatSender callEventualStatSender, String str, Timestamp timestamp, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWithTs");
        }
        if ((i & 4) != 0) {
            eventItemValue = null;
        }
        if ((i & 8) != 0) {
            eventItemsMap = new EventItemsMap();
        }
        callEventualStatSender.sendWithTs(str, timestamp, eventItemValue, eventItemsMap);
    }

    void notifyCallEnded();

    void send(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap);

    void sendWithTs(String str, Timestamp timestamp, EventItemValue eventItemValue, EventItemsMap eventItemsMap);
}
