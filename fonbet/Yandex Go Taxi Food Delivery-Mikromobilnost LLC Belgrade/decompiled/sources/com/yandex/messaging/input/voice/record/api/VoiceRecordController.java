package com.yandex.messaging.input.voice.record.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController;", "", "sourceObtainer", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecordSourceObtainer;", "recorder", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecorder;", "Companion", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VoiceRecordController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController$Companion;", "", "<init>", "()V", "Stub", "Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController;", "getStub", "()Lcom/yandex/messaging/input/voice/record/api/VoiceRecordController;", "messaging-voice-record-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VoiceRecordController Stub = new VoiceRecordController() { // from class: com.yandex.messaging.input.voice.record.api.VoiceRecordController$Companion$Stub$1
            @Override // com.yandex.messaging.input.voice.record.api.VoiceRecordController
            public VoiceRecorder recorder() {
                throw new IllegalStateException("Stub");
            }

            @Override // com.yandex.messaging.input.voice.record.api.VoiceRecordController
            public VoiceRecordSourceObtainer sourceObtainer() {
                throw new IllegalStateException("Stub");
            }
        };

        private Companion() {
        }

        public final VoiceRecordController getStub() {
            return Stub;
        }
    }

    VoiceRecorder recorder();

    VoiceRecordSourceObtainer sourceObtainer();
}
