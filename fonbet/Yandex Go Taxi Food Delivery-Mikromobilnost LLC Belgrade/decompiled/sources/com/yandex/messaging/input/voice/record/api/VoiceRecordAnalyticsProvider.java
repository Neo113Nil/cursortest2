package com.yandex.messaging.input.voice.record.api;

import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecordAnalyticsProvider;", "", "Lkotlin/Function1;", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecordAnalytics;", "Lzy11;", "reportAction", "report", "(Ltls;)V", "attach", "()V", "detach", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceRecordAnalyticsProvider {
    void attach();

    void detach();

    void report(tls reportAction);
}
