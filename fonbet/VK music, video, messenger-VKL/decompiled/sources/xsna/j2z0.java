package xsna;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.utils.time.Timestamp;

/* loaded from: classes8.dex */
public final class j2z0 {
    public final String a;
    public final EventItemValue b;
    public final EventItemsMap c;
    public final Timestamp d;

    public j2z0(String str, Timestamp timestamp, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        this.a = str;
        this.b = eventItemValue;
        this.c = eventItemsMap;
        this.d = timestamp;
    }
}
