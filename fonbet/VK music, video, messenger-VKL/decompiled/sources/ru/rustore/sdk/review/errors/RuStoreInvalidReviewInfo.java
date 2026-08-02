package ru.rustore.sdk.review.errors;

import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public final class RuStoreInvalidReviewInfo extends RuStoreException {
    public RuStoreInvalidReviewInfo() {
        super("Review can't be started with the passed ReviewInfo instance");
    }
}
