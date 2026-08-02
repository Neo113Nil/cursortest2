package com.vungle.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.vk.metrics.performance.appstart.content_provider.a;
import com.vungle.ads.internal.util.d;

/* loaded from: classes7.dex */
public final class VungleProvider extends ContentProvider {
    public VungleProvider() {
        a.b("com.vungle.ads.VungleProvider.<init>(SourceFile:1)");
        try {
        } finally {
            a.a("com.vungle.ads.VungleProvider.<init>(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("com.vungle.ads.VungleProvider.onCreate(SourceFile:1)");
        try {
            Context context = getContext();
            if (context != null) {
                d dVar = d.f;
                com.vungle.ads.internal.util.a.a(context);
            }
            a.a("com.vungle.ads.VungleProvider.onCreate(SourceFile:1)");
            return true;
        } catch (Throwable th) {
            a.a("com.vungle.ads.VungleProvider.onCreate(SourceFile:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.vungle.ads.VungleProvider.query(SourceFile)");
        try {
            return null;
        } finally {
            a.a("com.vungle.ads.VungleProvider.query(SourceFile)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
