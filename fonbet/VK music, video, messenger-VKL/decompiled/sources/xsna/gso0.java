package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import xsna.buk;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes12.dex */
public final class gso0 implements buk<InputStream> {
    public final Uri b;
    public final wso0 c;
    public InputStream d;

    /* compiled from: ThumbFetcher.java */
    public static class a implements vso0 {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xsna.vso0
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    public static class b implements vso0 {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xsna.vso0
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public gso0(Uri uri, wso0 wso0Var) {
        this.b = uri;
        this.c = wso0Var;
    }

    public static gso0 c(Context context, Uri uri, vso0 vso0Var) {
        return new gso0(uri, new wso0(com.bumptech.glide.a.a(context).d.a().e(), vso0Var, com.bumptech.glide.a.a(context).e, context.getContentResolver()));
    }

    @Override // xsna.buk
    public final void a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // xsna.buk
    @NonNull
    public final Class<InputStream> b() {
        return InputStream.class;
    }

    @Override // xsna.buk
    public final void d(@NonNull Priority priority, @NonNull buk.a<? super InputStream> aVar) {
        try {
            InputStream f = f();
            this.d = f;
            aVar.c(f);
        } catch (FileNotFoundException e) {
            aVar.f(e);
        }
    }

    @Override // xsna.buk
    @NonNull
    public final DataSource e() {
        return DataSource.LOCAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0039, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0022: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:35), block:B:67:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream f() throws FileNotFoundException {
        Cursor cursor;
        Cursor cursor2;
        InputStream openInputStream;
        int a2;
        wso0 wso0Var = this.c;
        ContentResolver contentResolver = wso0Var.c;
        Uri uri = this.b;
        Cursor cursor3 = null;
        r5 = null;
        r5 = null;
        InputStream inputStream = null;
        try {
            try {
                cursor = wso0Var.a.a(uri);
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException unused) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        File file = new File(str);
                        if (file.exists() && 0 < file.length()) {
                            Uri fromFile = Uri.fromFile(file);
                            try {
                                openInputStream = contentResolver.openInputStream(fromFile);
                                if (openInputStream != null) {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        a2 = com.bumptech.glide.load.a.a(wso0Var.d, inputStream, wso0Var.b);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    } catch (IOException | NullPointerException unused4) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Objects.toString(uri);
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                    }
                                    return a2 != -1 ? new s4q(openInputStream, a2) : openInputStream;
                                }
                                a2 = -1;
                                if (a2 != -1) {
                                }
                            } catch (NullPointerException e) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
                            }
                        }
                    }
                    if (openInputStream != null) {
                    }
                    a2 = -1;
                    if (a2 != -1) {
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th3;
                }
                openInputStream = null;
            }
        }
    }

    @Override // xsna.buk
    public final void cancel() {
    }
}
