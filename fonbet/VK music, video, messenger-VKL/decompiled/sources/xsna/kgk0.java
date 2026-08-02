package xsna;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import xsna.b330;
import xsna.cuk;
import xsna.klp;

/* compiled from: SourceGenerator.java */
/* loaded from: classes12.dex */
public final class kgk0 implements cuk, cuk.a {
    public final q7l<?> b;
    public final r7l c;
    public volatile int d;
    public volatile stk e;
    public volatile Object f;
    public volatile b330.a<?> g;
    public volatile ttk h;

    public kgk0(q7l q7lVar, r7l r7lVar) {
        this.b = q7lVar;
        this.c = r7lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L12;
     */
    @Override // xsna.cuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (this.f != null) {
            Object obj = this.f;
            this.f = null;
        }
        if (this.e == null || !this.e.a()) {
            this.e = null;
            this.g = null;
            boolean z = false;
            while (!z && this.d < this.b.b().size()) {
                ArrayList b = this.b.b();
                int i = this.d;
                this.d = i + 1;
                this.g = (b330.a) b.get(i);
                if (this.g != null && (this.b.p.c(this.g.c.e()) || this.b.c(this.g.c.b()) != null)) {
                    this.g.c.d(this.b.o, new jgk0(this, this.g));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // xsna.cuk.a
    public final void b(ady adyVar, Exception exc, buk<?> bukVar, DataSource dataSource) {
        this.c.b(adyVar, exc, bukVar, this.g.c.e());
    }

    @Override // xsna.cuk.a
    public final void c(ady adyVar, Object obj, buk<?> bukVar, DataSource dataSource, ady adyVar2) {
        this.c.c(adyVar, obj, bukVar, this.g.c.e(), adyVar);
    }

    @Override // xsna.cuk
    public final void cancel() {
        b330.a<?> aVar = this.g;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public final boolean d(Object obj) throws IOException {
        Throwable th;
        int i = w000.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a g = this.b.c.a().g(obj);
            Object b = g.b();
            Object d = this.b.d(b);
            com.vk.movika.sdk.base.model.l lVar = new com.vk.movika.sdk.base.model.l(d, b, this.b.i);
            ady adyVar = this.g.a;
            q7l<?> q7lVar = this.b;
            ttk ttkVar = new ttk(adyVar, q7lVar.n);
            uan a = ((klp.c) q7lVar.h).a();
            a.a(ttkVar, lVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                ttkVar.toString();
                obj.toString();
                d.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (a.c(ttkVar) != null) {
                this.h = ttkVar;
                this.e = new stk(Collections.singletonList(this.g.a), this.b, this);
                this.g.c.a();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.h);
                obj.toString();
            }
            try {
                this.c.c(this.g.a, g.b(), this.g.c, this.g.c.e(), this.g.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.g.c.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
