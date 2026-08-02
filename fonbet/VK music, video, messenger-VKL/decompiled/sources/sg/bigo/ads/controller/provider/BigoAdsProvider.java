package sg.bigo.ads.controller.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.metrics.performance.appstart.content_provider.a;
import sg.bigo.ads.at.b;

/* loaded from: classes9.dex */
public class BigoAdsProvider extends ContentProvider {
    public BigoAdsProvider() {
        a.b("sg.bigo.ads.controller.provider.BigoAdsProvider.<init>(Unknown Source)");
        try {
        } finally {
            a.a("sg.bigo.ads.controller.provider.BigoAdsProvider.<init>(Unknown Source)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("sg.bigo.ads.controller.provider.BigoAdsProvider.onCreate(Unknown Source)");
        try {
            Context context = getContext();
            if (context instanceof Application) {
                b.a((Application) context);
            }
            a.a("sg.bigo.ads.controller.provider.BigoAdsProvider.onCreate(Unknown Source)");
            return true;
        } catch (Throwable th) {
            a.a("sg.bigo.ads.controller.provider.BigoAdsProvider.onCreate(Unknown Source)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        a.b("sg.bigo.ads.controller.provider.BigoAdsProvider.query(Unknown Source)");
        try {
            return null;
        } finally {
            a.a("sg.bigo.ads.controller.provider.BigoAdsProvider.query(Unknown Source)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
