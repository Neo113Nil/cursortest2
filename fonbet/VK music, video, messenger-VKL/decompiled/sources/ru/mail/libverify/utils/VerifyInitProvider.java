package ru.mail.libverify.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.metrics.performance.appstart.content_provider.a;
import ru.mail.libverify.api.VerificationFactory;

/* loaded from: classes11.dex */
public class VerifyInitProvider extends ContentProvider {
    public VerifyInitProvider() {
        a.b("ru.mail.libverify.utils.VerifyInitProvider.<init>(SourceFile:1)");
        try {
        } finally {
            a.a("ru.mail.libverify.utils.VerifyInitProvider.<init>(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("ru.mail.libverify.utils.VerifyInitProvider.onCreate(SourceFile:1)");
        try {
            Context context = getContext();
            if (context != null) {
                VerificationFactory.initialize(context);
            }
            a.a("ru.mail.libverify.utils.VerifyInitProvider.onCreate(SourceFile:1)");
            return true;
        } catch (Throwable th) {
            a.a("ru.mail.libverify.utils.VerifyInitProvider.onCreate(SourceFile:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        a.b("ru.mail.libverify.utils.VerifyInitProvider.query(SourceFile)");
        try {
            return null;
        } finally {
            a.a("ru.mail.libverify.utils.VerifyInitProvider.query(SourceFile)");
        }
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
