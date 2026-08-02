package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class g0r implements gog {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object w;

    public /* synthetic */ g0r(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static g0r d(Context context, Uri uri, q0z0 q0z0Var) {
        return new g0r(1, uri, new m2v(Glide.get(context).getRegistry().e(), q0z0Var, Glide.get(context).getArrayPool(), context.getContentResolver(), false));
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // defpackage.gog
    public final Class a() {
        switch (this.a) {
            case 0:
                return ((h0r) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        switch (this.a) {
            case 0:
                try {
                    Object i = ((h0r) this.c).i((File) this.b);
                    this.w = i;
                    fogVar.d(i);
                    break;
                } catch (FileNotFoundException e) {
                    Log.isLoggable("FileLoader", 3);
                    fogVar.e(e);
                    return;
                }
            default:
                try {
                    InputStream g = g();
                    this.w = g;
                    fogVar.d(g);
                    break;
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("MediaStoreThumbFetcher", 3);
                    fogVar.e(e2);
                }
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        switch (this.a) {
        }
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.gog
    public final void cleanup() {
        switch (this.a) {
            case 0:
                Object obj = this.w;
                if (obj != null) {
                    try {
                        ((h0r) this.c).n(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.w;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0041, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream g() {
        Cursor cursor;
        InputStream openInputStream;
        int n;
        m2v m2vVar = (m2v) this.c;
        ContentResolver contentResolver = (ContentResolver) m2vVar.c;
        Uri uri = (Uri) this.b;
        Cursor cursor2 = null;
        r4 = null;
        r4 = null;
        InputStream inputStream = null;
        try {
            cursor = ((q0z0) m2vVar.a).i(uri);
        } catch (SecurityException unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
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
                                            n = k4b1.n((ArrayList) m2vVar.w, inputStream, (g63) m2vVar.b);
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
                                        return n != -1 ? new vlo(n, openInputStream) : openInputStream;
                                    }
                                    n = -1;
                                    if (n != -1) {
                                    }
                                } catch (NullPointerException e) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
                                }
                            }
                        }
                        if (openInputStream != null) {
                        }
                        n = -1;
                        if (n != -1) {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        throw th2;
                    }
                    openInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
    }
}
