package ru.ok.android.externcalls.sdk.chat;

/* compiled from: ChatStateListener.kt */
/* loaded from: classes9.dex */
public interface ChatStateListener {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ChatStateListener EMPTY = new ChatStateListener() { // from class: ru.ok.android.externcalls.sdk.chat.ChatStateListener$Companion$EMPTY$1
    };

    /* compiled from: ChatStateListener.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    default void onChatCreated(long j) {
    }

    default void onChatUpdated(long j) {
    }
}
