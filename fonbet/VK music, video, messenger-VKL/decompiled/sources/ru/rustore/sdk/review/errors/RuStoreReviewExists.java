package ru.rustore.sdk.review.errors;

import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public final class RuStoreReviewExists extends RuStoreException {
    public RuStoreReviewExists() {
        super("Review already exists.");
    }
}
