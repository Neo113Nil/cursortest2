package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.e;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class gp91 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ e w;

    public gp91(e eVar, boolean z) {
        Objects.requireNonNull(eVar);
        this.w = eVar;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.w;
        if (eVar.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            eVar.b(e, false, this.c);
            b();
        }
    }
}
