package ru.ok.android.externcalls.sdk.video;

import java.util.Collection;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;

/* compiled from: DisplayLayoutSender.kt */
/* loaded from: classes9.dex */
public interface DisplayLayoutSender {

    /* compiled from: DisplayLayoutSender.kt */
    public interface SendFilter {
        boolean shouldSend();
    }

    void applyFilter(SendFilter sendFilter);

    void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> collection);
}
