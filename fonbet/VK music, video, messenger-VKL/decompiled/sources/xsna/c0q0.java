package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;

/* compiled from: UiQueueTaskExecutor.java */
/* loaded from: classes2.dex */
public final class c0q0 {
    public static final f9w h = e9w.b("ImTaskExecutor[UI]");
    public volatile boolean a;
    public final LinkedList b;
    public final b c;
    public volatile zzp0<?> d;
    public volatile a e;
    public final q5o f;
    public long g = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UiQueueTaskExecutor.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXECUTING;
        public static final a FINISHING;
        public static final a NONE;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("EXECUTING", 1);
            EXECUTING = aVar2;
            a aVar3 = new a("FINISHING", 2);
            FINISHING = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: UiQueueTaskExecutor.java */
    public class b implements d0q0 {
        public b() {
        }
    }

    public c0q0() {
        b();
        this.a = true;
        this.b = new LinkedList();
        this.c = new b();
        this.d = null;
        this.e = a.NONE;
        q5o q5oVar = new q5o();
        q5oVar.c = new rvv();
        q5oVar.b = new Handler(Looper.getMainLooper());
        this.f = q5oVar;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Can be called only from UI-thread");
        }
    }

    public static void h(String str, @NonNull Throwable th) {
        Throwable th2;
        f9w f9wVar = h;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.ERROR)) {
            String str2 = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                th2 = th;
                L.w(l, L.LogType.e, th2, new Object[]{str2, str}, null, null, 24);
                if (sv1.t(th2) && !(th2 instanceof IOException)) {
                    com.vk.metrics.eventtracking.b.a.a(th2);
                }
                return;
            }
        }
        th2 = th;
        if (sv1.t(th2)) {
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(th2);
    }

    public final void a() {
        if (!this.a) {
            throw new IllegalStateException("Executor is shut down");
        }
    }

    public final void c() {
        b();
        a();
        if (this.e == a.EXECUTING) {
            f9w f9wVar = h;
            jzm0 jzm0Var = new jzm0(3);
            Object[] objArr = {this.d};
            f9wVar.getClass();
            f9wVar.debug(new mh3(10, jzm0Var, objArr));
            this.d.a();
            e();
        }
    }

    public final void d() {
        h.debug(new ufm0(4));
        b();
        a();
        b();
        if (this.e != a.NONE) {
            c();
        }
        this.b.clear();
    }

    public final void e() {
        b();
        a();
        if (this.d != null) {
            this.d.f(null);
            this.d = null;
        }
        q5o q5oVar = this.f;
        ((rvv) q5oVar.c).a();
        ((Handler) q5oVar.b).removeCallbacksAndMessages(null);
        this.e = a.NONE;
    }

    public final void f() {
        b();
        a();
        b();
        a aVar = this.e;
        a aVar2 = a.NONE;
        if (aVar != aVar2) {
            return;
        }
        b();
        if (this.b.isEmpty()) {
            return;
        }
        b();
        a();
        b();
        if (this.e != aVar2) {
            throw new IllegalStateException("There's already running task");
        }
        b();
        if (this.b.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        this.d = (zzp0) this.b.poll();
        this.d.f(this.c);
        this.e = a.EXECUTING;
        this.g = SystemClock.uptimeMillis();
        try {
            f9w f9wVar = h;
            c2c0 c2c0Var = new c2c0(13);
            Object[] objArr = {this.d};
            f9wVar.getClass();
            f9wVar.debug(new mh3(10, c2c0Var, objArr));
            this.d.d();
        } catch (Throwable th) {
            h(String.format("failed %s", this.d), th);
            c();
            f();
        }
    }

    public final void g(@NonNull Object obj, zzp0<?> zzp0Var) {
        Object[] objArr = {zzp0Var};
        f9w f9wVar = h;
        f9wVar.getClass();
        if (!f9wVar.d(LogLevel.VERBOSE)) {
            String str = f9wVar.a;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.v;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, 1);
                L.u(l, logType, new Object[]{str, String.format(locale, "submitting %s", Arrays.copyOf(copyOf, copyOf.length))});
            }
        }
        b();
        a();
        zzp0Var.a = pla.g(5, obj);
        this.b.add(zzp0Var);
        f();
    }
}
