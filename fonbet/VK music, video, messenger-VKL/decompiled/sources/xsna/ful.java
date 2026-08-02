package xsna;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import xsna.hul;
import xsna.j360;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ful implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ful(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        if ((r0.getResponseCode() / 100) == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0124, code lost:
    
        if (0 == 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Context context;
        String str;
        String str2;
        j360 j360Var;
        boolean z;
        ail ailVar;
        i700 i700Var;
        u800 u800Var;
        HttpURLConnection httpURLConnection;
        i700 i700Var2;
        Pair pair;
        u800<i700> k;
        File b;
        i260 i260Var;
        switch (this.b) {
            case 0:
                return ((gul) this.c).b.submit(new e50(3, (Callable) this.d, (hul.a) this.e));
            default:
                context = (Context) this.c;
                str = (String) this.d;
                str2 = (String) this.e;
                j360 j360Var2 = tky.b;
                if (j360Var2 == null) {
                    synchronized (j360.class) {
                        try {
                            j360Var2 = tky.b;
                            if (j360Var2 == null) {
                                Context applicationContext = context.getApplicationContext();
                                i260 i260Var2 = tky.c;
                                if (i260Var2 == null) {
                                    synchronized (i260.class) {
                                        i260Var = tky.c;
                                        if (i260Var == null) {
                                            i260Var = new i260(new tt0(applicationContext, 27));
                                            tky.c = i260Var;
                                        }
                                    }
                                    i260Var2 = i260Var;
                                }
                                j360Var2 = new j360(i260Var2, new mnh0());
                                tky.b = j360Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                }
                j360Var = j360Var2;
                z = true;
                ailVar = null;
                if (str2 != null) {
                    try {
                        b = j360Var.a.b(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (b != null) {
                        FileInputStream fileInputStream = new FileInputStream(b);
                        FileExtension fileExtension = b.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : b.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
                        b.getAbsolutePath();
                        n100.a();
                        pair = new Pair(fileExtension, fileInputStream);
                        if (pair != null) {
                            FileExtension fileExtension2 = (FileExtension) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int i = j360.a.a[fileExtension2.ordinal()];
                            if (i == 1) {
                                k = q700.k(context, new ZipInputStream(inputStream), str2);
                            } else if (i != 2) {
                                k = q700.f(inputStream, str2);
                            } else {
                                try {
                                    k = q700.f(new GZIPInputStream(inputStream), str2);
                                } catch (IOException e) {
                                    k = new u800<>(e);
                                }
                            }
                            i700Var = k.a;
                            break;
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                i700Var = null;
                if (i700Var != null) {
                    u800Var = new u800(i700Var);
                } else {
                    n100.a();
                    n100.a();
                    try {
                        try {
                            ailVar = mnh0.f(str);
                            httpURLConnection = ailVar.b;
                            try {
                                break;
                            } catch (IOException unused2) {
                                break;
                            }
                        } catch (Exception e2) {
                            u800Var = new u800(e2);
                            break;
                        }
                    } finally {
                    }
                }
                if (str2 != null && (i700Var2 = u800Var.a) != null) {
                    j700.b.a.put(str2, i700Var2);
                }
                return u800Var;
        }
        z = false;
        if (z) {
            u800Var = j360Var.a(context, httpURLConnection.getInputStream(), str, httpURLConnection.getContentType(), str2);
            i700 i700Var3 = u800Var.a;
            n100.a();
        } else {
            u800Var = new u800(new IllegalArgumentException(ailVar.m()));
        }
        try {
            ailVar.close();
        } catch (IOException e3) {
            n100.c("LottieFetchResult close failed ", e3);
        }
        if (str2 != null) {
            j700.b.a.put(str2, i700Var2);
        }
        return u800Var;
    }
}
