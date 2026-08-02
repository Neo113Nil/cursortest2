package xsna;

import android.content.Context;
import java.io.File;

/* compiled from: DiskCacheConfig.java */
/* loaded from: classes.dex */
public final class wan {
    public final int a;
    public final String b;
    public final yhn0<File> c;
    public final long d;
    public final long e;
    public final long f;
    public final u370 g;
    public final e370 h;
    public final rw8 i;
    public final j370 j;
    public final Context k;

    /* compiled from: DiskCacheConfig.java */
    /* loaded from: classes12.dex */
    public class a implements yhn0<File> {
        public a() {
        }

        @Override // xsna.yhn0
        public final File get() {
            wan wanVar = wan.this;
            wanVar.k.getClass();
            return wanVar.k.getApplicationContext().getCacheDir();
        }
    }

    /* compiled from: DiskCacheConfig.java */
    public static final class b {
        public yhn0<File> b;
        public rw8 e;
        public final Context f;
        public String a = "image_cache";
        public long c = 41943040;
        public final u370 d = new u370();

        public b(Context context) {
            this.f = context;
        }
    }

    public wan(b bVar) {
        e370 e370Var;
        j370 j370Var;
        Context context = bVar.f;
        this.k = context;
        yhn0<File> yhn0Var = bVar.b;
        if (!((yhn0Var == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (yhn0Var == null && context != null) {
            bVar.b = new a();
        }
        this.a = 1;
        this.b = bVar.a;
        yhn0<File> yhn0Var2 = bVar.b;
        yhn0Var2.getClass();
        this.c = yhn0Var2;
        this.d = bVar.c;
        this.e = 10485760L;
        this.f = 2097152L;
        this.g = bVar.d;
        synchronized (e370.class) {
            try {
                if (e370.a == null) {
                    e370.a = new e370();
                }
                e370Var = e370.a;
            } finally {
            }
        }
        this.h = e370Var;
        rw8 rw8Var = bVar.e;
        this.i = rw8Var == null ? f370.v() : rw8Var;
        synchronized (j370.class) {
            try {
                if (j370.a == null) {
                    j370.a = new j370();
                }
                j370Var = j370.a;
            } finally {
            }
        }
        this.j = j370Var;
    }
}
