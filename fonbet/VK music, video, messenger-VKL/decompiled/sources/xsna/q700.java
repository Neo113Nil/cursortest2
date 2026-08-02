package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import xsna.e8f0.a;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes12.dex */
public final class q700 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static w800<i700> a(@Nullable final String str, Callable<u800<i700>> callable, @Nullable Runnable runnable) {
        i700 a2 = str == null ? null : j700.b.a(str);
        w800<i700> w800Var = a2 != null ? new w800<>(a2) : null;
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            w800Var = (w800) hashMap.get(str);
        }
        if (w800Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return w800Var;
        }
        w800<i700> w800Var2 = new w800<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            w800Var2.b(new r800() { // from class: xsna.l700
                @Override // xsna.r800
                public final void onResult(Object obj) {
                    HashMap hashMap2 = q700.a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        q700.n(true);
                    }
                }
            });
            w800Var2.a(new r800() { // from class: xsna.m700
                @Override // xsna.r800
                public final void onResult(Object obj) {
                    HashMap hashMap2 = q700.a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        q700.n(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, w800Var2);
                if (hashMap.size() == 1) {
                    n(false);
                }
            }
        }
        return w800Var2;
    }

    public static w800<i700> b(Context context, String str) {
        String b2 = go9.b("asset_", str);
        return a(b2, new zzd(context.getApplicationContext(), str, b2), null);
    }

    public static u800<i700> c(Context context, String str, @Nullable String str2) {
        i700 a2 = str2 == null ? null : j700.b.a(str2);
        if (a2 != null) {
            return new u800<>(a2);
        }
        try {
            return d(context.getAssets().open(str), str2, context);
        } catch (IOException e) {
            return new u800<>(e);
        }
    }

    public static u800 d(InputStream inputStream, @Nullable String str, @Nullable Context context) {
        i700 a2 = str == null ? null : j700.b.a(str);
        if (a2 != null) {
            return new u800(a2);
        }
        try {
            e8f0 e8f0Var = new e8f0(mq9.d(inputStream));
            if (m(e8f0Var, c).booleanValue()) {
                return k(context, new ZipInputStream(e8f0Var.new a()), str);
            }
            if (m(e8f0Var, d).booleanValue()) {
                return f(new GZIPInputStream(e8f0Var.new a()), str);
            }
            String[] strArr = JsonReader.f;
            return g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), str, true);
        } catch (IOException e) {
            return new u800(e);
        }
    }

    public static w800<i700> e(final InputStream inputStream, @Nullable final String str) {
        return a(str, new Callable() { // from class: xsna.k700
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q700.f(inputStream, str);
            }
        }, new nf0(inputStream, 6));
    }

    public static u800<i700> f(InputStream inputStream, @Nullable String str) {
        e8f0 e8f0Var = new e8f0(mq9.d(inputStream));
        String[] strArr = JsonReader.f;
        return g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), str, true);
    }

    public static u800 g(com.airbnb.lottie.parser.moshi.a aVar, @Nullable String str, boolean z) {
        i700 a2;
        try {
            if (str == null) {
                a2 = null;
            } else {
                try {
                    a2 = j700.b.a(str);
                } catch (Exception e) {
                    u800 u800Var = new u800(e);
                    if (z) {
                        b3r0.b(aVar);
                    }
                    return u800Var;
                }
            }
            if (a2 != null) {
                u800 u800Var2 = new u800(a2);
                if (z) {
                    b3r0.b(aVar);
                }
                return u800Var2;
            }
            i700 a3 = r700.a(aVar);
            if (str != null) {
                j700.b.a.put(str, a3);
            }
            u800 u800Var3 = new u800(a3);
            if (z) {
                b3r0.b(aVar);
            }
            return u800Var3;
        } catch (Throwable th) {
            if (z) {
                b3r0.b(aVar);
            }
            throw th;
        }
    }

    public static w800<i700> h(Context context, final int i, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: xsna.n700
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return q700.i(context2, i, str);
            }
        }, null);
    }

    public static u800<i700> i(Context context, int i, @Nullable String str) {
        i700 a2 = str == null ? null : j700.b.a(str);
        if (a2 != null) {
            return new u800<>(a2);
        }
        try {
            e8f0 e8f0Var = new e8f0(mq9.d(context.getResources().openRawResource(i)));
            if (m(e8f0Var, c).booleanValue()) {
                return k(context, new ZipInputStream(e8f0Var.new a()), str);
            }
            if (!m(e8f0Var, d).booleanValue()) {
                String[] strArr = JsonReader.f;
                return g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), str, true);
            }
            try {
                return f(new GZIPInputStream(e8f0Var.new a()), str);
            } catch (IOException e) {
                return new u800<>(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new u800<>(e2);
        }
    }

    public static w800<i700> j(Context context, String str) {
        String b2 = go9.b("url_", str);
        return a(b2, new ful(context, str, b2, 1), null);
    }

    public static u800<i700> k(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return l(context, zipInputStream, str);
        } finally {
            b3r0.b(zipInputStream);
        }
    }

    public static u800<i700> l(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        i700 a2;
        q800 q800Var;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = j700.b.a(str);
            } catch (IOException e) {
                return new u800<>(e);
            }
        }
        if (a2 != null) {
            return new u800<>(a2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i700 i700Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                e8f0 e8f0Var = new e8f0(mq9.d(zipInputStream));
                String[] strArr = JsonReader.f;
                i700Var = g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), null, false).a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split(DomExceptionUtils.SEPARATOR);
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new u800<>(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th3) {
                        n100.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        n100.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split(DomExceptionUtils.SEPARATOR);
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (i700Var == null) {
            return new u800<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) i700Var.d()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    q800Var = null;
                    break;
                }
                q800Var = (q800) it.next();
                if (q800Var.d.equals(str4)) {
                    break;
                }
            }
            if (q800Var != null) {
                q800Var.f = b3r0.e(q800Var.a, q800Var.b, (Bitmap) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (o4s o4sVar : i700Var.f.values()) {
                if (o4sVar.a.equals(entry2.getKey())) {
                    o4sVar.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                n100.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) i700Var.d()).entrySet().iterator();
            while (it2.hasNext()) {
                q800 q800Var2 = (q800) ((Map.Entry) it2.next()).getValue();
                if (q800Var2 == null) {
                    return null;
                }
                String str5 = q800Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            q800Var2.f = b3r0.e(q800Var2.a, q800Var2.b, decodeByteArray);
                        }
                    } catch (IllegalArgumentException e2) {
                        n100.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            j700.b.a.put(str, i700Var);
        }
        return new u800<>(i700Var);
    }

    public static Boolean m(e8f0 e8f0Var, byte[] bArr) {
        try {
            e8f0 e8f0Var2 = new e8f0(new vs90(e8f0Var));
            for (byte b2 : bArr) {
                if (e8f0Var2.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            e8f0Var2.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            n100.a.getClass();
            AsyncUpdates asyncUpdates = tky.a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void n(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((x800) arrayList.get(i)).a();
        }
    }

    public static String o(int i, Context context) {
        return z23.b(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
