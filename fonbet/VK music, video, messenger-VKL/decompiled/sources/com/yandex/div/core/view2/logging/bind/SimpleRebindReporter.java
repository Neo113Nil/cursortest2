package com.yandex.div.core.view2.logging.bind;

/* compiled from: SimpleRebindReporter.kt */
/* loaded from: classes7.dex */
public interface SimpleRebindReporter extends ForceRebindReporter {
    default void onSimpleRebindFatalNoState() {
    }

    default void onSimpleRebindNoChild() {
    }

    default void onSimpleRebindSuccess() {
    }

    default void onSimpleRebindException(Exception exc) {
    }
}
