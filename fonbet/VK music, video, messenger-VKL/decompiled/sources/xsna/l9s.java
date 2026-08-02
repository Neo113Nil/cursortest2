package xsna;

import android.media.Image;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import xsna.alw;

/* compiled from: ForwardingImageProxy.java */
/* loaded from: classes11.dex */
public abstract class l9s implements alw {
    public final alw b;
    public final HashSet c = new HashSet();

    /* compiled from: ForwardingImageProxy.java */
    public interface a {
        void f(l9s l9sVar);
    }

    public l9s(alw alwVar) {
        this.b = alwVar;
    }

    @Override // xsna.alw
    @NonNull
    public synchronized ojw B() {
        return this.b.B();
    }

    @Override // xsna.alw
    @NonNull
    public final synchronized alw.a[] M2() {
        return this.b.M2();
    }

    public final synchronized void b(a aVar) {
        this.c.add(aVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        synchronized (this) {
            this.b.close();
        }
        synchronized (this) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f(this);
        }
    }

    @Override // xsna.alw
    public final synchronized int getFormat() {
        return this.b.getFormat();
    }

    @Override // xsna.alw
    public synchronized int getHeight() {
        return this.b.getHeight();
    }

    @Override // xsna.alw
    public final synchronized Image getImage() {
        return this.b.getImage();
    }

    @Override // xsna.alw
    public synchronized int getWidth() {
        return this.b.getWidth();
    }
}
