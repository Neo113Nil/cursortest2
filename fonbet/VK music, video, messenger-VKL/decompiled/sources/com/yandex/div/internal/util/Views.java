package com.yandex.div.internal.util;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class Views {
    private static final int[] HIT_TEST_ARRAY = new int[2];

    @NonNull
    public static <T extends View> T findViewAndCast(@NonNull View view, int i) {
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i) + "] doesn't exist");
    }
}
