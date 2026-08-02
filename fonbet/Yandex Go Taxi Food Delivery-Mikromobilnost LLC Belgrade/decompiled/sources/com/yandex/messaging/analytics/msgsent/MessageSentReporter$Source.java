package com.yandex.messaging.analytics.msgsent;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/analytics/msgsent/MessageSentReporter$Source", "", "Lcom/yandex/messaging/analytics/msgsent/MessageSentReporter$Source;", "MIRROR", "RESPONSE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageSentReporter$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageSentReporter$Source[] $VALUES;
    public static final MessageSentReporter$Source MIRROR;
    public static final MessageSentReporter$Source RESPONSE;

    static {
        MessageSentReporter$Source messageSentReporter$Source = new MessageSentReporter$Source("MIRROR", 0);
        MIRROR = messageSentReporter$Source;
        MessageSentReporter$Source messageSentReporter$Source2 = new MessageSentReporter$Source("RESPONSE", 1);
        RESPONSE = messageSentReporter$Source2;
        MessageSentReporter$Source[] messageSentReporter$SourceArr = {messageSentReporter$Source, messageSentReporter$Source2};
        $VALUES = messageSentReporter$SourceArr;
        $ENTRIES = a.a(messageSentReporter$SourceArr);
    }

    public static MessageSentReporter$Source valueOf(String str) {
        return (MessageSentReporter$Source) Enum.valueOf(MessageSentReporter$Source.class, str);
    }

    public static MessageSentReporter$Source[] values() {
        return (MessageSentReporter$Source[]) $VALUES.clone();
    }
}
