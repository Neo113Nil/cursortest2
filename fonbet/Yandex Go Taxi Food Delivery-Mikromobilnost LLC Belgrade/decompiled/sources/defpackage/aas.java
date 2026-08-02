package defpackage;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class aas implements jdv {
    public final jdv b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public aas(jdv jdvVar) {
        this.b = jdvVar;
    }

    @Override // defpackage.jdv
    public dav G0() {
        return this.b.G0();
    }

    public final void a(z9s z9sVar) {
        synchronized (this.a) {
            this.c.add(z9sVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((z9s) it.next()).a(this);
        }
    }

    @Override // defpackage.jdv
    public final Image f() {
        return this.b.f();
    }

    @Override // defpackage.jdv
    public Rect getCropRect() {
        return this.b.getCropRect();
    }

    @Override // defpackage.jdv
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.jdv
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.jdv
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.jdv
    public idv[] i0() {
        return this.b.i0();
    }
}
