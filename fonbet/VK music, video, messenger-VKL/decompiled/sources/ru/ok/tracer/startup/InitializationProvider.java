package ru.ok.tracer.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.vk.metrics.performance.appstart.content_provider.a;

/* compiled from: InitializationProvider.kt */
/* loaded from: classes11.dex */
public final class InitializationProvider extends ContentProvider {
    public InitializationProvider() {
        a.b("ru.ok.tracer.startup.InitializationProvider.<init>(InitializationProvider.kt:9)");
        try {
        } finally {
            a.a("ru.ok.tracer.startup.InitializationProvider.<init>(InitializationProvider.kt:9)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("ru.ok.tracer.startup.InitializationProvider.onCreate(InitializationProvider.kt:11)");
        try {
            Context context = getContext();
            if (context == null) {
                throw new IllegalStateException();
            }
            try {
                TracerStartup.init(context);
            } catch (Exception e) {
                Log.e("Tracer", "Unable to initialize tracer due to error", e);
            }
            a.a("ru.ok.tracer.startup.InitializationProvider.onCreate(InitializationProvider.kt:11)");
            return true;
        } catch (Throwable th) {
            a.a("ru.ok.tracer.startup.InitializationProvider.onCreate(InitializationProvider.kt:11)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("ru.ok.tracer.startup.InitializationProvider.query(InitializationProvider.kt:34)");
        try {
            throw new UnsupportedOperationException();
        } catch (Throwable th) {
            a.a("ru.ok.tracer.startup.InitializationProvider.query(InitializationProvider.kt:34)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
