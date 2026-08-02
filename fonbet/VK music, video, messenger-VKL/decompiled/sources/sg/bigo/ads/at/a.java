package sg.bigo.ads.at;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class a {
    private static final a e = new a();
    boolean a = true;
    long b;
    long c;
    public InterfaceC2431a d;

    /* renamed from: sg.bigo.ads.at.a$a, reason: collision with other inner class name */
    public interface InterfaceC2431a {
        void a(long j, long j2);

        void a(boolean z, long j, long j2, long j3);
    }

    private a() {
        b();
    }

    public static a a() {
        return e;
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtime();
        this.c = System.currentTimeMillis();
    }

    public final boolean c() {
        return this.b > 0;
    }
}
