package xsna;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ub9;

/* compiled from: SettableImageProxyBundle.java */
/* loaded from: classes11.dex */
public final class nzi0 implements blw {
    public final List<Integer> e;
    public final String f;
    public final Object a = new Object();
    public final SparseArray<ub9.a<alw>> b = new SparseArray<>();
    public final SparseArray<ugz<alw>> c = new SparseArray<>();
    public final ArrayList d = new ArrayList();
    public boolean g = false;

    /* compiled from: SettableImageProxyBundle.java */
    public class a implements ub9.c<alw> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // xsna.ub9.c
        public final Object attachCompleter(@NonNull ub9.a<alw> aVar) {
            synchronized (nzi0.this.a) {
                nzi0.this.b.put(this.b, aVar);
            }
            return h5s.c(this.b, ")", new StringBuilder("getImageProxy(id: "));
        }
    }

    public nzi0(List<Integer> list, String str) {
        this.e = list;
        this.f = str;
        f();
    }

    @Override // xsna.blw
    @NonNull
    public final List<Integer> a() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // xsna.blw
    @NonNull
    public final ugz<alw> b(int i) {
        ugz<alw> ugzVar;
        synchronized (this.a) {
            try {
                if (this.g) {
                    throw new IllegalStateException("ImageProxyBundle already closed.");
                }
                ugzVar = this.c.get(i);
                if (ugzVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ugzVar;
    }

    public final void c(alw alwVar) {
        synchronized (this.a) {
            try {
                if (this.g) {
                    return;
                }
                Integer a2 = alwVar.B().c().a(this.f);
                if (a2 == null) {
                    throw new IllegalArgumentException("CaptureId is null.");
                }
                ub9.a<alw> aVar = this.b.get(a2.intValue());
                if (aVar != null) {
                    this.d.add(alwVar);
                    aVar.b(alwVar);
                } else {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + a2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                if (this.g) {
                    return;
                }
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((alw) it.next()).close();
                }
                this.d.clear();
                this.c.clear();
                this.b.clear();
                this.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (this.g) {
                    return;
                }
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((alw) it.next()).close();
                }
                this.d.clear();
                this.c.clear();
                this.b.clear();
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            try {
                Iterator<Integer> it = this.e.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    this.c.put(intValue, ub9.a(new a(intValue)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
