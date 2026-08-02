package defpackage;

import android.util.Range;
import androidx.camera.core.j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class ody implements oey, co7 {
    public final pey b;
    public final qt7 c;
    public final Object a = new Object();
    public boolean w = false;
    public pbj x = null;

    public ody(pey peyVar, qt7 qt7Var) {
        this.b = peyVar;
        this.c = qt7Var;
        if (peyVar.getLifecycle().b().a(Lifecycle.State.STARTED)) {
            qt7Var.r();
        } else {
            qt7Var.u();
        }
        peyVar.getLifecycle().a(this);
    }

    @Override // defpackage.co7
    public final qp7 b() {
        return this.c.a.c;
    }

    @Override // defpackage.co7
    public final ar7 c() {
        return this.c.a.b;
    }

    public final void k(pbj pbjVar) {
        synchronized (this.a) {
            try {
                pbj pbjVar2 = this.x;
                if (pbjVar2 == null) {
                    this.x = pbjVar;
                } else {
                    boolean z = pbjVar.b;
                    boolean z2 = pbjVar2.b;
                    if (z) {
                        if (!z2) {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                        ArrayList arrayList = new ArrayList((List) this.x.A);
                        arrayList.addAll((List) pbjVar.A);
                        this.x = new pbj(arrayList, (xt31) pbjVar.c, (List) pbjVar.w);
                    } else {
                        if (z2) {
                            throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                        }
                        this.x = pbjVar;
                        qt7 qt7Var = this.c;
                        qt7Var.D((ArrayList) qt7Var.y());
                    }
                }
                qt7 qt7Var2 = this.c;
                xt31 xt31Var = (xt31) pbjVar.c;
                synchronized (qt7Var2.E) {
                    qt7Var2.A = xt31Var;
                }
                qt7 qt7Var3 = this.c;
                List list = (List) pbjVar.w;
                synchronized (qt7Var3.E) {
                    qt7Var3.B = list;
                }
                synchronized (this.c.E) {
                }
                qt7 qt7Var4 = this.c;
                Range range = (Range) pbjVar.x;
                synchronized (qt7Var4.E) {
                    qt7Var4.C = range;
                }
                ddf w = vuz.w(c(), pbjVar);
                ((k6u) pbjVar.B).execute(new r7v(18, w, pbjVar));
                this.c.e((List) pbjVar.A, w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(pey peyVar) {
        synchronized (this.a) {
            qt7 qt7Var = this.c;
            qt7Var.D((ArrayList) qt7Var.y());
        }
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause(pey peyVar) {
        this.c.a.n(false);
    }

    @w(Lifecycle.Event.ON_RESUME)
    public void onResume(pey peyVar) {
        this.c.a.n(true);
    }

    @w(Lifecycle.Event.ON_START)
    public void onStart(pey peyVar) {
        synchronized (this.a) {
            try {
                if (!this.w) {
                    this.c.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStop(pey peyVar) {
        synchronized (this.a) {
            try {
                if (!this.w) {
                    this.c.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pey p() {
        pey peyVar;
        synchronized (this.a) {
            peyVar = this.b;
        }
        return peyVar;
    }

    public final List r() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.c.y());
        }
        return unmodifiableList;
    }

    public final boolean s(j jVar) {
        boolean contains;
        synchronized (this.a) {
            contains = ((ArrayList) this.c.y()).contains(jVar);
        }
        return contains;
    }

    public final void t() {
        synchronized (this.a) {
            try {
                if (this.w) {
                    return;
                }
                onStop(this.b);
                this.w = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(pbj pbjVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            try {
                pbj pbjVar2 = this.x;
                if (pbjVar2 != null && (z = pbjVar2.b) == (z2 = pbjVar.b)) {
                    pbj pbjVar3 = null;
                    if (z || z2) {
                        if (z && z2) {
                            ArrayList arrayList = new ArrayList((List) this.x.A);
                            arrayList.removeAll((List) pbjVar.A);
                            if (!arrayList.isEmpty()) {
                                pbj pbjVar4 = this.x;
                                pbjVar3 = new pbj(arrayList, (xt31) pbjVar4.c, (List) pbjVar4.w);
                            }
                            this.x = pbjVar3;
                        }
                    } else if (pbjVar2 != pbjVar) {
                        return;
                    } else {
                        this.x = null;
                    }
                    ArrayList arrayList2 = new ArrayList((List) pbjVar.A);
                    arrayList2.retainAll(this.c.y());
                    this.c.D(arrayList2);
                }
            } finally {
            }
        }
    }

    public final void v() {
        synchronized (this.a) {
            qt7 qt7Var = this.c;
            qt7Var.D((ArrayList) qt7Var.y());
            this.x = null;
        }
    }

    public final void w() {
        synchronized (this.a) {
            try {
                if (this.w) {
                    this.w = false;
                    if (this.b.getLifecycle().b().a(Lifecycle.State.STARTED)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
