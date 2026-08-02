package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class adt0 implements iog, hog {
    public final uxg a;
    public final b b;
    public volatile int c;
    public volatile rng w;
    public volatile Object x;
    public volatile p430 y;
    public volatile sng z;

    public adt0(uxg uxgVar, b bVar) {
        this.a = uxgVar;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L13;
     */
    @Override // defpackage.iog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (this.x != null) {
            Object obj = this.x;
            this.x = null;
            try {
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.w == null || !this.w.a()) {
            this.w = null;
            this.y = null;
            boolean z = false;
            while (!z && this.c < this.a.b().size()) {
                ArrayList b = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.y = (p430) b.get(i);
                if (this.y != null && (this.a.p.c(this.y.c.c()) || this.a.c(this.y.c.a()) != null)) {
                    this.y.c.b(this.a.o, new f(this, this.y));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // defpackage.hog
    public final void b(khx khxVar, Object obj, gog gogVar, DataSource dataSource, khx khxVar2) {
        this.b.b(khxVar, obj, gogVar, this.y.c.c(), khxVar);
    }

    @Override // defpackage.hog
    public final void c(khx khxVar, Exception exc, gog gogVar, DataSource dataSource) {
        this.b.c(khxVar, exc, gogVar, this.y.c.c());
    }

    @Override // defpackage.iog
    public final void cancel() {
        p430 p430Var = this.y;
        if (p430Var != null) {
            p430Var.c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            cpg g = this.a.c.getRegistry().g(obj);
            Object d = g.d();
            wyn d2 = this.a.d(d);
            wwf wwfVar = new wwf(d2, d, this.a.i);
            khx khxVar = this.y.a;
            uxg uxgVar = this.a;
            sng sngVar = new sng(khxVar, uxgVar.n);
            bxj a = uxgVar.h.a();
            a.b(sngVar, wwfVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                sngVar.toString();
                obj.toString();
                d2.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (a.c(sngVar) != null) {
                this.z = sngVar;
                this.w = new rng(Collections.singletonList(this.y.a), this.a, this);
                this.y.c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.z);
                obj.toString();
            }
            try {
                this.b.b(this.y.a, g.d(), this.y.c, this.y.c.c(), this.y.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.y.c.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
