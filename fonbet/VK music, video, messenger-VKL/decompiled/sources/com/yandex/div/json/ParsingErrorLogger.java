package com.yandex.div.json;

import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import xsna.wj90;
import xsna.xj90;

/* loaded from: classes7.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger LOG = new wj90();
    public static final ParsingErrorLogger ASSERT = new xj90();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$1(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }

    void logError(@NonNull Exception exc);

    default void logTemplateError(@NonNull Exception exc, @NonNull String str) {
        logError(exc);
    }
}
