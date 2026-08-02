package ru.ok.android.externcalls.sdk.android.ext.lifecycle;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import xsna.f5z;

/* compiled from: LifecycleExt.kt */
/* loaded from: classes9.dex */
public final class LifecycleExtKt {
    public static final void attachToLifecycle(final Conversation conversation, final f5z f5zVar) {
        conversation.getDisplayLayoutSender().applyFilter(new LifecycleConditionFilter(f5zVar));
        final DisplayLayoutLifecycleObserver displayLayoutLifecycleObserver = new DisplayLayoutLifecycleObserver(conversation.getDisplayLayoutSender());
        f5zVar.getLifecycle().addObserver(displayLayoutLifecycleObserver);
        conversation.addEventsListener(new ConversationEventsListener() { // from class: ru.ok.android.externcalls.sdk.android.ext.lifecycle.LifecycleExtKt$attachToLifecycle$1
            @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
            public void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
                f5z.this.getLifecycle().removeObserver(displayLayoutLifecycleObserver);
                conversation.getDisplayLayoutSender().applyFilter(null);
            }
        });
    }
}
