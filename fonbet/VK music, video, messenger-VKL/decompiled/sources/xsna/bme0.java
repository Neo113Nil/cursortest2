package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import xsna.b330;
import xsna.buk;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes12.dex */
public final class bme0<DataT> implements b330<Uri, DataT> {
    public final Context a;
    public final b330<File, DataT> b;
    public final b330<Uri, DataT> c;
    public final Class<DataT> d;

    /* compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements c330<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, DataT> d(@NonNull j540 j540Var) {
            Class<DataT> cls = this.b;
            return new bme0(this.a, j540Var.b(File.class, cls), j540Var.b(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class d<DataT> implements buk<DataT> {
        public static final String[] l = {"_data"};
        public final Context b;
        public final b330<File, DataT> c;
        public final b330<Uri, DataT> d;
        public final Uri e;
        public final int f;
        public final int g;
        public final au80 h;
        public final Class<DataT> i;
        public volatile boolean j;

        @Nullable
        public volatile buk<DataT> k;

        public d(Context context, b330<File, DataT> b330Var, b330<Uri, DataT> b330Var2, Uri uri, int i, int i2, au80 au80Var, Class<DataT> cls) {
            this.b = context.getApplicationContext();
            this.c = b330Var;
            this.d = b330Var2;
            this.e = uri;
            this.f = i;
            this.g = i2;
            this.h = au80Var;
            this.i = cls;
        }

        @Override // xsna.buk
        public final void a() {
            buk<DataT> bukVar = this.k;
            if (bukVar != null) {
                bukVar.a();
            }
        }

        @Override // xsna.buk
        @NonNull
        public final Class<DataT> b() {
            return this.i;
        }

        @Nullable
        public final buk<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            b330.a<DataT> a;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.b;
            au80 au80Var = this.h;
            int i = this.g;
            int i2 = this.f;
            if (isExternalStorageLegacy) {
                Uri uri = this.e;
                try {
                    Cursor query = context.getContentResolver().query(uri, l, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                a = this.c.a(file, i2, i, au80Var);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri uri2 = this.e;
                boolean y = c4g0.y(uri2);
                b330<Uri, DataT> b330Var = this.d;
                if (y && uri2.getPathSegments().contains("picker")) {
                    a = b330Var.a(uri2, i2, i, au80Var);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri2 = MediaStore.setRequireOriginal(uri2);
                    }
                    a = b330Var.a(uri2, i2, i, au80Var);
                }
            }
            if (a != null) {
                return a.c;
            }
            return null;
        }

        @Override // xsna.buk
        public final void cancel() {
            this.j = true;
            buk<DataT> bukVar = this.k;
            if (bukVar != null) {
                bukVar.cancel();
            }
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super DataT> aVar) {
            try {
                buk<DataT> c = c();
                if (c == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.e));
                } else {
                    this.k = c;
                    if (this.j) {
                        cancel();
                    } else {
                        c.d(priority, aVar);
                    }
                }
            } catch (FileNotFoundException e) {
                aVar.f(e);
            }
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public bme0(Context context, b330<File, DataT> b330Var, b330<Uri, DataT> b330Var2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = b330Var;
        this.c = b330Var2;
        this.d = cls;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        return new b330.a(new qp70(uri2), new d(this.a, this.b, this.c, uri2, i, i2, au80Var, this.d));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && c4g0.y(uri);
    }
}
