package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes10.dex */
public final class o5g0 implements gog {
    public static final String[] D = {"_data"};
    public final Class A;
    public volatile boolean B;
    public volatile gog C;
    public final Context a;
    public final q430 b;
    public final q430 c;
    public final Uri w;
    public final int x;
    public final int y;
    public final mg70 z;

    public o5g0(Context context, q430 q430Var, q430 q430Var2, Uri uri, int i, int i2, mg70 mg70Var, Class cls) {
        this.a = context.getApplicationContext();
        this.b = q430Var;
        this.c = q430Var2;
        this.w = uri;
        this.x = i;
        this.y = i2;
        this.z = mg70Var;
        this.A = cls;
    }

    @Override // defpackage.gog
    public final Class a() {
        return this.A;
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        try {
            gog d = d();
            if (d == null) {
                fogVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.w));
            } else {
                this.C = d;
                if (this.B) {
                    cancel();
                } else {
                    d.b(priority, fogVar);
                }
            }
        } catch (FileNotFoundException e) {
            fogVar.e(e);
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
        this.B = true;
        gog gogVar = this.C;
        if (gogVar != null) {
            gogVar.cancel();
        }
    }

    @Override // defpackage.gog
    public final void cleanup() {
        gog gogVar = this.C;
        if (gogVar != null) {
            gogVar.cleanup();
        }
    }

    public final gog d() {
        p430 a;
        Throwable th;
        boolean isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        mg70 mg70Var = this.z;
        int i = this.y;
        int i2 = this.x;
        if (isExternalStorageLegacy) {
            Uri uri = this.w;
            try {
                Cursor query = context.getContentResolver().query(uri, D, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            query.close();
                            a = this.b.a(file, i2, i, mg70Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri uri2 = this.w;
            boolean f = pkb1.f(uri2);
            q430 q430Var = this.c;
            if (f && uri2.getPathSegments().contains("picker")) {
                a = q430Var.a(uri2, i2, i, mg70Var);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                a = q430Var.a(uri2, i2, i, mg70Var);
            }
        }
        if (a != null) {
            return a.c;
        }
        return null;
    }
}
