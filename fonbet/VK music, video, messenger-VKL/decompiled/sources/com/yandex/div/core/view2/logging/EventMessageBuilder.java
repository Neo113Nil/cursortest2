package com.yandex.div.core.view2.logging;

/* compiled from: EventMessageBuilder.kt */
/* loaded from: classes7.dex */
public class EventMessageBuilder {
    private final StringBuilder consolidatedEvents = new StringBuilder();

    public final void appendEventMessage(String str, String str2) {
        if (this.consolidatedEvents.length() > 0) {
            this.consolidatedEvents.append(", ");
        }
        this.consolidatedEvents.append(str + " (" + str2 + ')');
    }

    public final String buildEventsLogMessage() {
        StringBuilder sb = this.consolidatedEvents;
        if (sb.length() <= 0) {
            return null;
        }
        String sb2 = sb.toString();
        sb.setLength(0);
        return sb2;
    }
}
