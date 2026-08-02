package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC5097pj;
import io.appmetrica.analytics.impl.B3;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.C5114qa;
import io.appmetrica.analytics.impl.C5119qf;
import io.appmetrica.analytics.impl.C5144rf;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.N5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes8.dex */
public class PreloadInfoContentProvider extends ContentProvider {
    private boolean a;
    private final UriMatcher b;

    public PreloadInfoContentProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("io.appmetrica.analytics.internal.PreloadInfoContentProvider.<init>(SourceFile:1)");
        try {
            this.a = false;
            this.b = new UriMatcher(-1);
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("io.appmetrica.analytics.internal.PreloadInfoContentProvider.<init>(SourceFile:1)");
        }
    }

    private void a(N5 n5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = n5.a.invoke(contentValues);
                if (invoke != null) {
                    n5.c.b(applicationContext);
                    if (((Boolean) n5.b.invoke(invoke)).booleanValue()) {
                        AbstractC5097pj.a("Successfully saved " + n5.d, new Object[0]);
                    } else {
                        AbstractC5097pj.a("Did not save " + n5.d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5097pj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.b.match(uri);
                    if (match == 1) {
                        a(new N5(new C5119qf(), new C5144rf(), C5114qa.d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC5097pj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new N5(new B3(), new C3(), C5114qa.d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = M5.a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.vk.metrics.performance.appstart.content_provider.a.b("io.appmetrica.analytics.internal.PreloadInfoContentProvider.onCreate(SourceFile:1)");
        try {
            Context context = getContext();
            Context applicationContext = context == null ? null : context.getApplicationContext();
            String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
            this.b.addURI(str, "preloadinfo", 1);
            this.b.addURI(str, "clids", 2);
            M5.a = new CountDownLatch(1);
            M5.b = this;
            com.vk.metrics.performance.appstart.content_provider.a.a("io.appmetrica.analytics.internal.PreloadInfoContentProvider.onCreate(SourceFile:1)");
            return true;
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("io.appmetrica.analytics.internal.PreloadInfoContentProvider.onCreate(SourceFile:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("io.appmetrica.analytics.internal.PreloadInfoContentProvider.query(SourceFile:1)");
        try {
            AbstractC5097pj.a("Query is not supported", new Object[0]);
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("io.appmetrica.analytics.internal.PreloadInfoContentProvider.query(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5097pj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
