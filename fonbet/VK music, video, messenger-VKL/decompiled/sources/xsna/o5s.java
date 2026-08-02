package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.d6s;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes11.dex */
public final class o5s {
    public static final m900<String, Typeface> a = new m900<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final dpj0<String, ArrayList<o7j<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new p7g0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new dpj0<>();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((j5s) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a b(Context context, List list, String str, int i) {
        Typeface typeface;
        int i2;
        Typeface b2;
        m900<String, Typeface> m900Var = a;
        Trace.beginSection(ndp0.f("getFontSync"));
        try {
            typeface = m900Var.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
        if (typeface != null) {
            return new a(typeface);
        }
        d6s.a a2 = g5s.a(context, list);
        List<d6s.b[]> list2 = a2.b;
        int i3 = a2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new a(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    d6s.b[] bVarArr = list2.get(0);
                    hup0 hup0Var = aup0.a;
                    Trace.beginSection(ndp0.f("TypefaceCompat.createFromFontInfo"));
                    b2 = aup0.a.b(context, bVarArr, i);
                    Trace.endSection();
                    if (b2 != null) {
                        return new a(-3);
                    }
                    m900Var.put(str, b2);
                    return new a(b2);
                }
                hup0 hup0Var2 = aup0.a;
                Trace.beginSection(ndp0.f("TypefaceCompat.createFromFontInfoWithFallback"));
                b2 = aup0.a.c(i, context, list2);
                Trace.endSection();
                if (b2 != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            d6s.b[] bVarArr2 = list2.get(0);
            if (bVarArr2 != null && bVarArr2.length != 0) {
                int length = bVarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = bVarArr2[i4].f;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
        Trace.endSection();
    }

    /* compiled from: FontRequestWorker.java */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
