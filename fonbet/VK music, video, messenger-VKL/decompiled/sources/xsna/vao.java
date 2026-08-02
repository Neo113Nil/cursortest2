package xsna;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.bug.Method;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.text.Regex;
import ru.ok.android.commons.http.Http;
import xsna.n8o;
import xsna.vao;

/* compiled from: DownloadUtils.java */
/* loaded from: classes17.dex */
public final class vao {
    public static final HashSet<Long> a = new HashSet<>();
    public static final HashSet<Long> b = new HashSet<>();
    public static final ysg0<n8o> c;
    public static final ConcurrentHashMap<String, String> d;

    /* compiled from: DownloadUtils.java */
    public class a extends a.b.C0766b {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Uri b;
        public final /* synthetic */ String c;

        public a(Context context, Uri uri, String str) {
            this.a = context;
            this.b = uri;
            this.c = str;
        }

        @Override // com.vk.core.files.a.b.C0766b, com.vk.core.files.a.b.InterfaceC0765a
        public final void onComplete() {
            Context context = this.a;
            Uri uri = this.b;
            File i = com.vk.core.files.a.i(context, uri);
            String str = this.c;
            if (i != null) {
                vao.c.a(new n8o.b(str, i.getAbsolutePath()));
                L.p("image-try-download", "finished method=" + Method.CACHE + ", filePath=" + i.getAbsolutePath());
            } else {
                vao.c.a(new n8o.b(str, null));
            }
            Context applicationContext = context.getApplicationContext();
            if (X3.i.b.equals(uri.getScheme())) {
                try {
                    MediaScannerConnection.scanFile(applicationContext, new String[]{uri.getPath()}, null, null);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onError(Throwable th) {
            L.p("image-try-download", "stop: ".concat("copy error"));
            vao.c.a(new n8o.a(this.c, null));
        }
    }

    static {
        ysg0<n8o> ysg0Var = new ysg0<>();
        c = ysg0Var;
        d = new ConcurrentHashMap<>();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.i0(ysg0Var.a.a0(asu0.i()), new pn(18)).U(new mr(16)).a0(asu0Var.d()).subscribe(new qao(0), new rao());
    }

    public static void a(Context context, String str, String str2, @Nullable String str3) {
        b(context, str, str2, false, str3, Boolean.TRUE, false);
    }

    public static void b(Context context, String str, String str2, boolean z, @Nullable String str3, Boolean bool, boolean z2) {
        if (bool.booleanValue()) {
            d.put(str2, str2);
        }
        try {
            c(context, str, str2, z, str3, z2);
        } catch (Exception e) {
            L.E(e, new Object[0]);
            c.a(new n8o.a(str2, e));
        }
    }

    public static void c(final Context context, String str, final String str2, final boolean z, @Nullable String str3, boolean z2) {
        rip ripVar;
        boolean z3;
        String path;
        String str4 = str3;
        StringBuilder a2 = xe9.a("operation-params filename=", str, ", url=", str2, ", open=");
        a2.append(z);
        a2.append(", sourceMimeType=");
        a2.append(str4);
        L.p("image-try-download", a2.toString());
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str4 == null) {
            str4 = k020.a(str2);
        }
        if (str4 == null && (path = Uri.parse(str2).getPath()) != null) {
            str4 = k020.a(path);
        }
        if (str4 == null) {
            str4 = k020.a(str);
        }
        final String str5 = str4;
        Object obj = k020.a;
        boolean B = str5 != null ? brm0.B(str5, "image/", false) : false;
        boolean b2 = k020.b(str5);
        String lastPathSegment = Uri.parse(str2).getLastPathSegment();
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("[.,]+", ".").replaceAll("[\\\\/:*?\"<>|%]", "-");
            if (replaceAll.contains(".")) {
                lastPathSegment = replaceAll;
            }
        }
        if (B) {
            Method method = Method.CACHE;
            StringBuilder sb = new StringBuilder("on-start method=");
            sb.append(method.name());
            sb.append(" mimeType=");
            sb.append(str5);
            sb.append(" targetFileName=");
            L.p("image-try-download", tdj.a(sb, lastPathSegment, " downloadUri=", str2));
            Uri parse = Uri.parse(str2);
            Field field = mcr0.a;
            ImageRequest.CacheChoice cacheChoice = ImageRequest.CacheChoice.DEFAULT;
            ImageRequestBuilder h = ImageRequestBuilder.h(parse);
            h.g = cacheChoice;
            try {
                e5o0<rip> d2 = mcr0.c().d(rhs.b().h.d(h.a(), null), new AtomicBoolean(false));
                synchronized (d2.a) {
                    try {
                        synchronized (d2.a) {
                            z3 = d2.b;
                        }
                        if (!z3) {
                            d2.a.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ripVar = d2.d();
            } catch (Exception e) {
                L.B("vk", e.getMessage(), e);
                ripVar = null;
            }
            InputStream p = ripVar == null ? null : ripVar.p();
            StringBuilder sb2 = new StringBuilder("cache-input-stream-opened encodedImage=");
            sb2.append(ripVar);
            sb2.append(", isValid=");
            sb2.append(ripVar != null ? Boolean.valueOf(ripVar.w()) : null);
            sb2.append(", inputStream=");
            sb2.append(p);
            sb2.append(", available=");
            sb2.append(p != null ? Integer.valueOf(p.available()) : null);
            L.p("image-try-download", sb2.toString());
            if (p != null) {
                asu0.a.getClass();
                final InputStream inputStream = p;
                final String str6 = lastPathSegment;
                asu0.n().execute(new Runnable() { // from class: xsna.sao
                    @Override // java.lang.Runnable
                    public final void run() {
                        Uri d3 = vao.d(str5, str6);
                        if (X3.i.b.equals(d3.getScheme())) {
                            try {
                                File file = new File(d3.getPath());
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                            } catch (Throwable th2) {
                                com.vk.metrics.eventtracking.b.a.a(th2);
                            }
                        }
                        Context context2 = context;
                        OutputStream c2 = a.c.c(context2, d3);
                        L.p("image-try-download", "cache-output-stream-opened outputStream=" + c2 + ", targetFileUri=" + d3);
                        String str7 = str2;
                        if (c2 == null) {
                            L.p("image-try-download", "stop: ".concat("output stream is null"));
                            vao.c.a(new n8o.a(str7, null));
                        } else {
                            a.b.d(inputStream, c2, new vao.a(context2, d3, str7));
                        }
                    }
                });
                return;
            }
        }
        final String str7 = lastPathSegment;
        final Uri parse2 = Uri.parse(str2);
        o260 o260Var = d260.a;
        if ((o260Var == null ? null : o260Var).h().enable()) {
            Method method2 = Method.BY_EXECUTOR;
            String uri = parse2.toString();
            StringBuilder sb3 = new StringBuilder("on-start method=");
            sb3.append(method2.name());
            sb3.append(" mimeType=");
            sb3.append(str5);
            sb3.append(" targetFileName=");
            L.p("image-try-download", tdj.a(sb3, str7, " downloadUri=", uri));
            Regex regex = com.vk.core.files.a.a;
            final File k = com.vk.core.files.a.k(System.currentTimeMillis() + "", "tmp");
            asu0.a.getClass();
            final boolean z4 = B;
            asu0.q().execute(new Runnable() { // from class: xsna.tao
                @Override // java.lang.Runnable
                public final void run() {
                    final Context context2 = context;
                    final boolean z5 = z;
                    final boolean z6 = z4;
                    final Uri d3 = vao.d(str5, str7);
                    final Uri uri2 = parse2;
                    String uri3 = uri2.toString();
                    final File file = k;
                    o8o o8oVar = new o8o(uri3, file, false);
                    try {
                        vx2.a.getClass();
                        vx2.b().m(o8oVar, new m7r0() { // from class: xsna.uao
                            @Override // xsna.m7r0
                            public final void onProgress(int i, int i2) {
                                L.e(efz.a(i, i2, "File download | current = ", " | max = "));
                                if (i >= i2) {
                                    File file2 = file;
                                    Uri fromFile = Uri.fromFile(file2);
                                    Context context3 = context2;
                                    Uri uri4 = d3;
                                    a.b.c(context3, fromFile, a.c.c(context3, uri4), null);
                                    file2.delete();
                                    File i3 = com.vk.core.files.a.i(context3, uri4);
                                    if (i3 != null) {
                                        vao.c.a(new n8o.b(uri2.toString(), i3.getAbsolutePath()));
                                    }
                                    if (z5) {
                                        String m = com.vk.core.files.a.m(context3, uri4);
                                        vao.f(context3, uri4, m == null ? null : com.vk.core.files.a.l(new File(m)));
                                    }
                                    if (z6) {
                                        Context applicationContext = context3.getApplicationContext();
                                        if (X3.i.b.equals(uri4.getScheme())) {
                                            try {
                                                MediaScannerConnection.scanFile(applicationContext, new String[]{uri4.getPath()}, null, null);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Exception e2) {
                        L.i(e2);
                    }
                }
            });
            return;
        }
        boolean z5 = B;
        Method method3 = Method.BY_REQUEST;
        String uri2 = parse2.toString();
        StringBuilder sb4 = new StringBuilder("on-start method=");
        sb4.append(method3.name());
        sb4.append(" mimeType=");
        sb4.append(str5);
        sb4.append(" targetFileName=");
        L.p("image-try-download", tdj.a(sb4, str7, " downloadUri=", uri2));
        DownloadManager.Request request = new DownloadManager.Request(parse2);
        if (z2) {
            String str8 = "";
            vx2.a.getClass();
            Lazy<? extends List<h7r0>> lazy = vx2.b().i().e;
            if (lazy.isInitialized()) {
                List<h7r0> value = lazy.getValue();
                if (!value.isEmpty()) {
                    str8 = value.get(0).a;
                }
            }
            if (!str8.isEmpty()) {
                request.addRequestHeader(Http.Header.AUTHORIZATION, "Bearer ".concat(str8));
            }
        }
        if (gz80.a(29)) {
            ExternalDirType externalDirType = z5 ? ExternalDirType.IMAGES : b2 ? ExternalDirType.VIDEO : ExternalDirType.DOWNLOADS;
            request.setDestinationInExternalPublicDir(externalDirType.h(), externalDirType.i() + File.separator + str7);
        } else {
            request.setDestinationUri(d(str5, str7));
        }
        request.setNotificationVisibility(1);
        request.allowScanningByMediaScanner();
        request.setTitle(str7);
        if (str != null) {
            request.setMimeType(com.vk.core.files.a.l(new File(str7)));
        }
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        if (downloadManager != null) {
            try {
                try {
                    long enqueue = downloadManager.enqueue(request);
                    b.add(Long.valueOf(enqueue));
                    if (z) {
                        a.add(Long.valueOf(enqueue));
                    }
                } catch (IllegalArgumentException unused) {
                    request.setDestinationUri(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str7)));
                    long enqueue2 = downloadManager.enqueue(request);
                    b.add(Long.valueOf(enqueue2));
                    if (z) {
                        a.add(Long.valueOf(enqueue2));
                    }
                }
            } catch (IllegalArgumentException e2) {
                L.i(e2);
                try {
                    context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:com.android.providers.downloads")));
                } catch (ActivityNotFoundException e3) {
                    L.i(e3);
                    context.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                }
                cvk.w("Please enable download manager", true);
            }
        }
    }

    @NonNull
    public static Uri d(String str, String str2) {
        Object obj = k020.a;
        if (str != null ? brm0.B(str, "image/", false) : false) {
            seq seqVar = com.vk.core.files.a.b;
            Context context = e43.a;
            ExternalDirType externalDirType = ExternalDirType.IMAGES;
            seqVar.getClass();
            return seq.c(context, str2, externalDirType);
        }
        if (k020.b(str)) {
            seq seqVar2 = com.vk.core.files.a.b;
            Context context2 = e43.a;
            ExternalDirType externalDirType2 = ExternalDirType.VIDEO;
            seqVar2.getClass();
            return seq.c(context2, str2, externalDirType2);
        }
        seq seqVar3 = com.vk.core.files.a.b;
        Context context3 = e43.a;
        ExternalDirType externalDirType3 = ExternalDirType.DOWNLOADS;
        seqVar3.getClass();
        return seq.c(context3, str2, externalDirType3);
    }

    public static boolean e(String str) {
        try {
            File file = new File(new URI(str.replace(" ", "%20")));
            if (file.exists()) {
                return com.vk.core.files.a.l(file).equals("application/vnd.android.package-archive");
            }
            return false;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return false;
        }
    }

    public static boolean f(Context context, Uri uri, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return i(context, uri);
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            if (str.equals("application/vnd.android.package-archive")) {
                intent.addFlags(268435456);
                intent.setDataAndType(uri, "vnd.android.document/directory");
            } else {
                intent.setDataAndType(uri, str);
                intent.setFlags(1);
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return i(context, uri);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return false;
        }
    }

    public static boolean g(Context context, String str) {
        if (Uri.parse(str).getScheme() == null) {
            str = go9.b("file://", str);
        }
        try {
            File file = new File(new URI(str.replace(" ", "%20")));
            if (!file.exists()) {
                return false;
            }
            String l = com.vk.core.files.a.l(file);
            if (!TextUtils.isEmpty(l)) {
                return f(context, com.vk.core.files.a.N(file), l);
            }
            if (file.exists()) {
                return i(context, Uri.fromFile(file));
            }
            return false;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return false;
        }
    }

    public static void h(Context context, String str, boolean z) {
        try {
            File file = new File(new URI(str.replace(" ", "%20")));
            if (file.exists()) {
                String l = com.vk.core.files.a.l(file);
                Uri N = com.vk.core.files.a.N(file);
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                if (z) {
                    intent.addFlags(268435456);
                    intent.setDataAndType(N, "vnd.android.document/directory");
                } else {
                    intent.setDataAndType(N, l);
                    intent.setFlags(1);
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    public static boolean i(Context context, Uri uri) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(uri, "application/*");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            L.i(e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(Context context, Uri uri, boolean z) {
        Cursor cursor = null;
        try {
            Cursor query = ((DownloadManager) context.getSystemService("download")).query(new DownloadManager.Query().setFilterByStatus(11));
            if (query != null && query.moveToFirst()) {
                while (!uri.toString().equals(query.getString(query.getColumnIndex("uri")))) {
                    if (!query.moveToNext()) {
                        query.close();
                        return false;
                    }
                }
                int i = query.getInt(query.getColumnIndex("status"));
                String string = query.getString(query.getColumnIndex("local_uri"));
                query.close();
                if (i == 1 || i == 2) {
                    cvk.u(R.string.download_is_in_progress, false);
                    query.close();
                    return true;
                }
                if (i != 8) {
                    query.close();
                    return false;
                }
                if (e(string)) {
                    h(context, string, z);
                    query.close();
                    return true;
                }
                boolean g = g(context, string);
                query.close();
                return g;
            }
        } catch (Throwable th) {
            try {
                com.vk.metrics.eventtracking.b.a.q(th);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
        return false;
    }
}
