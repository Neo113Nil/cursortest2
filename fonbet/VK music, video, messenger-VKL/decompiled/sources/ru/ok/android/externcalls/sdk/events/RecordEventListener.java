package ru.ok.android.externcalls.sdk.events;

import androidx.annotation.Nullable;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* loaded from: classes11.dex */
public interface RecordEventListener {
    default void onRecordDataChanged() {
    }

    default void onRecordStarted() {
    }

    default void onRecordError(@Nullable String str) {
    }

    default void onRecordStopped(@Nullable ConversationParticipant conversationParticipant) {
    }
}
