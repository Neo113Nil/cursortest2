package ru.rustore.sdk.review.errors;

import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public final class RuStoreRequestLimitReached extends RuStoreException {
    public RuStoreRequestLimitReached() {
        super("Review request limit reached. Review can't be called too often.");
    }
}
