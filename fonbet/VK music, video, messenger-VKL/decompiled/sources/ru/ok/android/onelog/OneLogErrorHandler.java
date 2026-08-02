package ru.ok.android.onelog;

import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public interface OneLogErrorHandler {

    public static class Default implements OneLogErrorHandler {
    }

    default void handleFailedItemStore(@NonNull Exception exc, @NonNull OneLogItem oneLogItem) {
    }
}
