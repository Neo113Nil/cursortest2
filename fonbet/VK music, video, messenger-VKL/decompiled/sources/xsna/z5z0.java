package xsna;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class z5z0 implements y6z0 {
    public long e;
    public long f;
    public final saz0 a = new saz0(o8z0.h, 15000);
    public final ffl0 b = new ffl0(this, 1);
    public final v7z0 c = new v7z0();
    public fpy0 d = new fpy0();
    public volatile HashMap g = new HashMap();
    public final WeakHashMap h = new WeakHashMap();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final HashMap b = new HashMap();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class b {
        public final ArrayList a = new ArrayList();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class c {
        public final long a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public c(int i, int i2, int i3, long j, String str, String str2) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = str;
            this.f = str2;
        }
    }

    @Override // xsna.y6z0
    public final void a(udz0 udz0Var, int i, int i2, int i3, String str, String str2) {
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (elapsedRealtime - this.f) + this.e;
        if (udz0Var.i == 2) {
            return;
        }
        c cVar = new c(i, i2, i3, j, str, str2);
        synchronized (this) {
            try {
                int i4 = udz0Var.i;
                if (i4 == 0) {
                    map = this.h;
                } else if (i4 != 1) {
                    return;
                } else {
                    map = this.g;
                }
                a aVar = (a) map.get(udz0Var);
                if (aVar == null) {
                    aVar = new a();
                    map.put(udz0Var, aVar);
                }
                aVar.a.add(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.y6z0
    public final void b(udz0 udz0Var, boolean z, zer0 zer0Var) {
        synchronized (this) {
            try {
                zer0Var.run();
                a aVar = (a) this.h.remove(udz0Var);
                if (z && aVar != null) {
                    this.g.put(udz0Var, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.y6z0
    public final void c(giy0 giy0Var, int i, int i2, int i3, String str, String str2) {
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (elapsedRealtime - this.f) + this.e;
        udz0 a2 = giy0Var.a();
        if (a2.i == 2) {
            return;
        }
        c cVar = new c(i, i2, i3, j, str, str2);
        synchronized (this) {
            try {
                int i4 = a2.i;
                if (i4 == 0) {
                    map = this.h;
                } else if (i4 != 1) {
                    return;
                } else {
                    map = this.g;
                }
                a aVar = (a) map.get(a2);
                if (aVar == null) {
                    aVar = new a();
                    map.put(a2, aVar);
                }
                b bVar = (b) aVar.b.get(giy0Var);
                if (bVar == null) {
                    bVar = new b();
                    aVar.b.put(giy0Var, bVar);
                }
                bVar.a.add(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
