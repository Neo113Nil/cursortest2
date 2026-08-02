package ru.ok.android.commons.io;

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import java.io.Closeable;

/* loaded from: classes9.dex */
public final class Closeables {
    private Closeables() {
    }

    public static void closeSilently(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static void closeSilently(@Nullable Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception unused) {
        }
    }

    public static void closeSilently(@Nullable AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return;
        }
        try {
            assetFileDescriptor.close();
        } catch (Exception unused) {
        }
    }

    public static void closeSilently(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            parcelFileDescriptor.close();
        } catch (Exception unused) {
        }
    }
}
