package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import xsna.b330;
import xsna.buk;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes12.dex */
public final class dz10 implements b330<Uri, File> {
    public final Context a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements c330<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, File> d(j540 j540Var) {
            return new dz10(this.a);
        }
    }

    public dz10(Context context) {
        this.a = context;
    }

    @Override // xsna.b330
    public final b330.a<File> a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        return new b330.a<>(new qp70(uri2), new b(this.a, uri2));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        return c4g0.y(uri);
    }

    /* compiled from: MediaStoreFileLoader.java */
    public static class b implements buk<File> {
        public static final String[] d = {"_data"};
        public final Context b;
        public final Uri c;

        public b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        @Override // xsna.buk
        @NonNull
        public final Class<File> b() {
            return File.class;
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.c(new File(r0));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.c));
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }

        @Override // xsna.buk
        public final void a() {
        }

        @Override // xsna.buk
        public final void cancel() {
        }
    }
}
