package sg.bigo.ads.bj;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC4319fe;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public abstract class a {

    @NonNull
    protected sg.bigo.ads.az.a b;
    final Map<String, C2441a> a = new ConcurrentHashMap();
    private final List<C2441a> e = new CopyOnWriteArrayList();
    private long f = -1;
    final Handler c = new Handler(Looper.getMainLooper());
    final byte[] d = new byte[0];

    /* renamed from: sg.bigo.ads.bj.a$a, reason: collision with other inner class name */
    public class C2441a {
        final String a;

        @Nullable
        final String b;
        volatile boolean c;
        private final boolean e;
        private final List<g> f;

        private C2441a(String str, @NonNull String str2, @Nullable boolean z, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            this.c = false;
            this.a = str;
            this.b = str2;
            this.e = z;
            arrayList.add(gVar);
        }

        public final void a(@Nullable Executor executor, final Context context) {
            if (this.c) {
                return;
            }
            this.c = true;
            sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(sg.bigo.ads.bx.a.a(), new sg.bigo.ads.bs.d(this.a), this.e, context);
            if (executor == null) {
                executor = sg.bigo.ads.bp.e.h();
            }
            aVar.l = executor;
            final String a = sg.bigo.ads.common.utils.g.a(this.a);
            sg.bigo.ads.bo.g.a(aVar, new sg.bigo.ads.bo.b<sg.bigo.ads.bs.a, sg.bigo.ads.bt.a>() { // from class: sg.bigo.ads.bj.a.a.2
                @Override // sg.bigo.ads.bo.b
                public final /* bridge */ /* synthetic */ sg.bigo.ads.bt.a a(@NonNull sg.bigo.ads.bt.a aVar2) {
                    return aVar2;
                }

                @Override // sg.bigo.ads.bo.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull sg.bigo.ads.bo.h hVar) {
                    C2441a.this.c = false;
                    C2441a.a(C2441a.this, context, hVar.a, hVar.getMessage(), new f(1, null, 0L, null, C2441a.this.a, a, null, null));
                }

                @Override // sg.bigo.ads.bo.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull sg.bigo.ads.bt.a aVar3) {
                    sg.bigo.ads.bt.a aVar4 = aVar3;
                    C2441a.this.c = false;
                    String a2 = aVar4.a("Content-Type");
                    a.this.a();
                    if (Build.VERSION.SDK_INT == 28 && "image/webp".equalsIgnoreCase(a2)) {
                        C2441a c2441a = C2441a.this;
                        C2441a.a(c2441a, context, 1303, "Not support parsing webp images in Android P.", new f(1, null, 0L, null, c2441a.a, a, a2, null));
                        return;
                    }
                    C2441a c2441a2 = C2441a.this;
                    String a3 = a.a(c2441a2.a, c2441a2.b);
                    a aVar5 = a.this;
                    Context context2 = context;
                    InputStream inputStream = aVar4.b;
                    sg.bigo.ads.an.c a4 = inputStream == null ? null : aVar5.a(aVar5.a(inputStream, a3, context2).getPath(), context2);
                    if (a4 == null) {
                        C2441a c2441a3 = C2441a.this;
                        C2441a.a(c2441a3, context, 1304, "Failed to parse image.", new f(1, null, 0L, null, c2441a3.a, a, a2, null));
                        return;
                    }
                    String str = a4.b;
                    a.this.a();
                    if (r.a((CharSequence) a4.b)) {
                        a4.b = a2;
                    }
                    a4.d = a;
                    a4.e = a2;
                    a4.f = str;
                    a.this.a(context, a3, a4);
                    long a5 = sg.bigo.ads.common.utils.g.a(a.this.c(context, a3), 2);
                    C2441a c2441a4 = C2441a.this;
                    C2441a.a(c2441a4, context, a4.a, new f(1, a4.b, a5, a4.c, c2441a4.a, a, a2, str));
                    a.this.d(context);
                }
            });
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2441a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((C2441a) obj).a);
        }

        public /* synthetic */ C2441a(a aVar, String str, String str2, boolean z, g gVar, byte b) {
            this(str, str2, z, gVar);
        }

        public static /* synthetic */ void a(C2441a c2441a, Context context, int i, String str, f fVar) {
            synchronized (a.this.d) {
                try {
                    sg.bigo.ads.bn.a.a(0, 5, a.this.a(), "Failed to download image: " + c2441a.a);
                    Iterator<g> it = c2441a.f.iterator();
                    while (it.hasNext()) {
                        it.next().a(i, str, fVar);
                    }
                    a.this.a.remove(c2441a.a);
                    a.this.c(context);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static /* synthetic */ void a(C2441a c2441a, Context context, final Bitmap bitmap, final f fVar) {
            synchronized (a.this.d) {
                try {
                    a.this.a();
                    for (final g gVar : c2441a.f) {
                        a.this.c.post(new Runnable() { // from class: sg.bigo.ads.bj.a.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                gVar.a(bitmap, fVar);
                            }
                        });
                    }
                    a.this.a.remove(c2441a.a);
                    a.this.c(context);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a(g gVar) {
            synchronized (a.this.d) {
                this.f.add(gVar);
            }
        }
    }

    @NonNull
    public final File a(@NonNull InputStream inputStream, String str, Context context) {
        FileOutputStream fileOutputStream;
        Throwable th;
        String b = b(context);
        sg.bigo.ads.common.utils.g.a(b, str);
        File file = new File(b, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
                    sg.bigo.ads.common.utils.h.a(fileOutputStream);
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
            sg.bigo.ads.common.utils.h.a(fileOutputStream2);
            return file;
        } catch (Throwable th3) {
            th = th3;
            sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
            sg.bigo.ads.common.utils.h.a(fileOutputStream);
            throw th;
        }
    }

    public abstract String a();

    public abstract sg.bigo.ads.an.c a(Context context, String str);

    public abstract void a(Context context);

    public abstract void a(Context context, String str, sg.bigo.ads.an.c cVar);

    public abstract int b();

    public abstract String b(Context context);

    public abstract void b(Context context, String str);

    public abstract String c(Context context, String str);

    public final synchronized void c(final Context context) {
        try {
            if (this.e.isEmpty()) {
                return;
            }
            a();
            while (this.a.size() < this.b.a) {
                if (this.e.isEmpty()) {
                    return;
                }
                final C2441a remove = this.e.remove(0);
                this.a.put(remove.a, remove);
                sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.bj.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        remove.a(null, context);
                    }
                });
            }
            a();
            this.e.size();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(final Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f > 3600000) {
            this.f = currentTimeMillis;
            sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.bj.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, context);
                }
            });
        }
    }

    public final void e(Context context) {
        synchronized (this.d) {
            this.e.clear();
            this.a.clear();
            a(context);
        }
    }

    public static String a(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : String.valueOf(str.hashCode());
    }

    public final boolean d(Context context, String str) {
        String a = a(str, (String) null);
        return a(context, a) != null || sg.bigo.ads.common.utils.g.c(c(context, a));
    }

    public final sg.bigo.ads.an.c a(String str, Context context) {
        return this instanceof d ? sg.bigo.ads.common.utils.e.b(str) : sg.bigo.ads.common.utils.e.b(str, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, @Nullable Executor executor, @NonNull String str, @Nullable String str2, boolean z, g gVar) {
        Throwable th;
        int i;
        String str3;
        if (!URLUtil.isNetworkUrl(str)) {
            i = InterfaceC4319fe.c.e;
            str3 = "Unknown scheme.";
        } else if (this.b.b()) {
            i = 1302;
            str3 = "Unable to download image.";
        } else {
            a();
            synchronized (this.d) {
                try {
                    try {
                        if (this.a.containsKey(str)) {
                            try {
                                a();
                                C2441a c2441a = this.a.get(str);
                                if (c2441a != null) {
                                    c2441a.a(gVar);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            C2441a c2441a2 = new C2441a(this, str, str2, z, gVar, (byte) 0);
                            int indexOf = this.e.indexOf(c2441a2);
                            if (indexOf >= 0) {
                                a();
                                C2441a c2441a3 = this.e.get(indexOf);
                                c2441a3.a(gVar);
                                if (executor != null) {
                                    this.e.remove(c2441a3);
                                    a(context, executor, c2441a3);
                                }
                            } else if (executor != null) {
                                a(context, executor, c2441a2);
                            } else {
                                this.e.add(c2441a2);
                                c(context);
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        gVar.a(i, str3, null);
    }

    public final void a(final Context context, @Nullable final Executor executor, @NonNull final String str, final boolean z, final g gVar) {
        String a = a(str, (String) null);
        final sg.bigo.ads.an.c a2 = a(context, a);
        if (a2 != null) {
            if (!a2.a.isRecycled()) {
                a();
                this.c.post(new Runnable() { // from class: sg.bigo.ads.bj.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar2 = gVar;
                        sg.bigo.ads.an.c cVar = a2;
                        gVar2.a(cVar.a, new f(2, cVar.b, 0L, cVar.c, str, cVar.d, cVar.e, cVar.f));
                    }
                });
                return;
            }
            b(context, a);
        }
        if (!sg.bigo.ads.common.utils.g.c(c(context, a))) {
            a(context, executor, str, null, z, gVar);
            return;
        }
        final String a3 = a(str, (String) null);
        final String c = c(context, a3);
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.bj.a.2
            final /* synthetic */ String g = null;

            @Override // java.lang.Runnable
            public final void run() {
                final sg.bigo.ads.an.c a4 = a.this.a(c, context);
                if (a4 == null) {
                    a.this.a(context, executor, str, this.g, z, gVar);
                    return;
                }
                a.this.a(context, a3, a4);
                final long a5 = sg.bigo.ads.common.utils.g.a(c, 2);
                a.this.a();
                a.this.c.post(new Runnable() { // from class: sg.bigo.ads.bj.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        g gVar2 = gVar;
                        sg.bigo.ads.an.c cVar = a4;
                        Bitmap bitmap = cVar.a;
                        String str2 = cVar.b;
                        gVar2.a(bitmap, new f(0, str2, a5, cVar.c, str, null, null, str2));
                    }
                });
                new File(c).setLastModified(System.currentTimeMillis());
                a.this.d(context);
            }
        });
    }

    private synchronized void a(final Context context, @NonNull final Executor executor, final C2441a c2441a) {
        if (executor == null || c2441a == null) {
            return;
        }
        this.a.put(c2441a.a, c2441a);
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.bj.a.3
            @Override // java.lang.Runnable
            public final void run() {
                c2441a.a(executor, context);
            }
        });
    }

    public final void a(sg.bigo.ads.az.a aVar) {
        this.b = aVar;
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        File[] listFiles;
        if (sg.bigo.ads.bh.d.b()) {
            return;
        }
        aVar.a();
        File file = new File(aVar.b(context));
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: sg.bigo.ads.bj.a.6
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                long lastModified = file2.lastModified() - file3.lastModified();
                if (lastModified > 0) {
                    return -1;
                }
                return lastModified == 0 ? 0 : 1;
            }
        });
        long currentTimeMillis = System.currentTimeMillis() - aVar.b.d;
        for (int i = 0; i < listFiles.length; i++) {
            File file2 = listFiles[i];
            if (i >= aVar.b() || file2.lastModified() <= currentTimeMillis) {
                file2.delete();
            }
        }
    }

    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.d) {
            try {
                containsKey = this.a.containsKey(str);
                if (!containsKey) {
                    Iterator<C2441a> it = this.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (TextUtils.equals(it.next().a, str)) {
                            containsKey = true;
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        return containsKey;
    }
}
