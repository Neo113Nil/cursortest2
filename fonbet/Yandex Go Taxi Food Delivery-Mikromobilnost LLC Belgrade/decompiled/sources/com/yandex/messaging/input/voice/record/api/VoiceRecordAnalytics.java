package com.yandex.messaging.input.voice.record.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000f\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecordAnalytics;", "", "Lzy11;", "recognitionStarted", "()V", "", "from", "to", "recognitionTextChangedEmptiness", "(Ljava/lang/String;Ljava/lang/String;)V", "text", "recognitionEndOfUtterance", "(Ljava/lang/String;)V", "error", "recognitionFinished", "recordingFinished", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceRecordAnalytics {
    void recognitionEndOfUtterance(String text);

    void recognitionFinished(String error);

    void recognitionStarted();

    void recognitionTextChangedEmptiness(String from, String to);

    void recordingFinished(String error);
}
