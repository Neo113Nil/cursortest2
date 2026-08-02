package com.yandex.div.core.player;

import com.yandex.div2.DivVideoScale;

/* compiled from: DivVideoAttachable.kt */
/* loaded from: classes7.dex */
public interface DivVideoAttachable {
    default DivPlayer getAttachedPlayer() {
        return null;
    }

    default void detach() {
    }

    default void attach(DivPlayer divPlayer) {
    }

    default void setScale(DivVideoScale divVideoScale) {
    }

    default void setVisibleOnScreen(boolean z) {
    }
}
