package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.concurrent.Executor;
import xsna.snw;
import xsna.wo9;

/* compiled from: CameraX.java */
/* loaded from: classes11.dex */
public final class vo9 {
    public static vo9 n;
    public static wo9.b o;
    public final wo9 c;
    public final Executor d;
    public final Handler e;

    @Nullable
    public final HandlerThread f;
    public oi9 g;
    public th9 h;
    public UseCaseConfigFactory i;
    public Context j;
    public static final Object m = new Object();
    public static ugz<Void> p = new snw.a(new IllegalStateException("CameraX is not initialized."));
    public static ugz<Void> q = snw.c.c;
    public final fl9 a = new fl9();
    public final Object b = new Object();
    public b k = b.UNINITIALIZED;
    public ugz<Void> l = snw.c.c;

    /* compiled from: CameraX.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.SHUTDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraX.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INITIALIZED;
        public static final b INITIALIZING;
        public static final b SHUTDOWN;
        public static final b UNINITIALIZED;

        static {
            b bVar = new b("UNINITIALIZED", 0);
            UNINITIALIZED = bVar;
            b bVar2 = new b("INITIALIZING", 1);
            INITIALIZING = bVar2;
            b bVar3 = new b("INITIALIZED", 2);
            INITIALIZED = bVar3;
            b bVar4 = new b("SHUTDOWN", 3);
            SHUTDOWN = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public vo9(@NonNull wo9 wo9Var) {
        Object obj;
        Object obj2;
        wo9Var.getClass();
        this.c = wo9Var;
        androidx.camera.core.impl.o oVar = wo9Var.s;
        try {
            obj = oVar.f(wo9.w);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Executor executor = (Executor) obj;
        try {
            obj2 = oVar.f(wo9.x);
        } catch (IllegalArgumentException unused2) {
            obj2 = null;
        }
        Handler handler = (Handler) obj2;
        this.d = executor == null ? new li9() : executor;
        if (handler != null) {
            this.f = null;
            this.e = handler;
        } else {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = Handler.createAsync(handlerThread.getLooper());
        }
    }

    @NonNull
    public static ugz<vo9> a() {
        vo9 vo9Var = n;
        if (vo9Var == null) {
            return new snw.a(new IllegalStateException("Must call CameraX.initialize() first"));
        }
        ugz<Void> ugzVar = p;
        g7 g7Var = new g7(vo9Var, 7);
        return r0t.g(ugzVar, new t98(g7Var), xo9.g());
    }

    public static void b(@NonNull Context context) {
        context.getClass();
        obr.f("CameraX already initialized.", n == null);
        o.getClass();
        vo9 vo9Var = new vo9(o.getCameraXConfig());
        n = vo9Var;
        p = ub9.a(new po9(vo9Var, context));
    }
}
