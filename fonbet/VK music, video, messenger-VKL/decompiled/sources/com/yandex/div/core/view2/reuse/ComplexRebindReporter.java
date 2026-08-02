package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.reuse.RebindTask;

/* compiled from: ComplexRebindReporter.kt */
/* loaded from: classes7.dex */
public interface ComplexRebindReporter extends ForceRebindReporter {
    default void onComplexRebindFatalNoState() {
    }

    default void onComplexRebindNoDivInState() {
    }

    default void onComplexRebindNoExistingParent() {
    }

    default void onComplexRebindNothingToBind() {
    }

    default void onComplexRebindSuccess() {
    }

    default void onComplexRebindUnsupportedElementException(RebindTask.UnsupportedElementException unsupportedElementException) {
    }
}
