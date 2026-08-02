package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.state.DivStatePath;

/* loaded from: classes7.dex */
public interface DivViewFacade {
    @NonNull
    View getView();

    default void showTooltip(@NonNull String str) {
    }

    default void switchToState(long j) {
        switchToState(j, true);
    }

    void switchToState(long j, boolean z);

    default void showTooltip(@NonNull String str, boolean z) {
        showTooltip(str);
    }

    default void switchToState(@NonNull DivStatePath divStatePath, boolean z) {
        switchToState(divStatePath.getTopLevelStateId(), z);
    }

    default void hideTooltip(@NonNull String str) {
    }
}
