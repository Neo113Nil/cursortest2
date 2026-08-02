package com.yandex.div.internal.util;

import android.database.Cursor;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class IOUtils {
    public static void closeCursorSilently(@Nullable Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
