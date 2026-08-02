package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import xsna.cxs;
import xsna.ff6;
import xsna.hjz0;
import xsna.j11;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hox extends ff6 {
    public d j;
    public tr50 k;
    public sr50 l;
    public ur50 m;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class b {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class c {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    @Deprecated
    public interface d {
        @Deprecated
        void a();

        @Deprecated
        void c(@NonNull iaz0 iaz0Var);

        @Deprecated
        void f();

        @Deprecated
        void g();

        @Deprecated
        void k(@NonNull hox hoxVar);

        @Deprecated
        void onClick();

        @Deprecated
        void onDismiss();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class e {
    }

    public hox(int i, @NonNull Context context) {
        super(context, i, "fullscreen");
        String str = gt50.a;
        gu8.d("Interstitial ad created. Version - 5.50.2");
    }

    @Override // xsna.ff6
    public final void c(ikz0 ikz0Var, xla xlaVar) {
        Object obj;
        tr50 tr50Var = this.k;
        if (tr50Var != null || this.j != null) {
            try {
                iaz0 iaz0Var = (iaz0) xlaVar.b;
                try {
                    if (ikz0Var == null) {
                        if (tr50Var != null) {
                            if (iaz0Var == null) {
                                iaz0Var = iaz0.o;
                            }
                            tr50Var.b(iaz0Var);
                            return;
                        } else {
                            d dVar = this.j;
                            if (iaz0Var == null) {
                                iaz0Var = iaz0.o;
                            }
                            dVar.c(iaz0Var);
                            return;
                        }
                    }
                    ArrayList arrayList = ikz0Var.b;
                    wcy0 wcy0Var = ikz0Var.a;
                    boolean isEmpty = arrayList.isEmpty();
                    u6z0 u6z0Var = this.a;
                    if (!isEmpty) {
                        f fVar = new f();
                        try {
                            euy0 n = euy0.n(this, arrayList, ikz0Var, this.g, fVar, fVar);
                            this.f = n;
                            if (n != null) {
                                tr50 tr50Var2 = this.k;
                                if (tr50Var2 != null) {
                                    tr50Var2.a();
                                } else {
                                    d dVar2 = this.j;
                                    if (dVar2 != null) {
                                        dVar2.k(this);
                                    }
                                }
                                u6z0Var.j.c(3);
                                return;
                            }
                            tr50 tr50Var3 = this.k;
                            if (tr50Var3 != null) {
                                tr50Var3.b(iaz0.o);
                                return;
                            }
                            d dVar3 = this.j;
                            if (dVar3 != null) {
                                dVar3.c(iaz0.o);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            obj = th;
                            gu8.e(null, "InterstitialAd: " + obj);
                        }
                    }
                    if (wcy0Var != null) {
                        f fVar2 = new f();
                        rqy0 rqy0Var = new rqy0(wcy0Var, this.a, this.b, fVar2, fVar2);
                        this.f = rqy0Var;
                        rqy0Var.v(this.e);
                        u6z0Var.j.c(3);
                        return;
                    }
                    tr50 tr50Var4 = this.k;
                    if (tr50Var4 != null) {
                        if (iaz0Var == null) {
                            iaz0Var = iaz0.v;
                        }
                        tr50Var4.b(iaz0Var);
                    } else {
                        d dVar4 = this.j;
                        if (dVar4 != null) {
                            if (iaz0Var == null) {
                                iaz0Var = iaz0.v;
                            }
                            dVar4.c(iaz0Var);
                        }
                    }
                } catch (Throwable th2) {
                    obj = th2;
                    gu8.e(null, "InterstitialAd: " + obj);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // xsna.ff6
    public final void d() {
        super.d();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class f implements hjz0.a, hjz0.b {
        public float a = -10.0f;

        public f() {
        }

        @Override // xsna.hjz0.a
        public final void a(a aVar) {
            hox hoxVar = hox.this;
            sr50 sr50Var = hoxVar.l;
            if (sr50Var != null) {
                cxs.a aVar2 = sr50Var.a.a;
                if (aVar2 != null) {
                    aVar2.b(null);
                    return;
                }
                return;
            }
            ff6.a aVar3 = hoxVar.h;
            if (aVar3 != null) {
                aVar3.a();
            }
        }

        @Override // xsna.hjz0.a
        public final void b() {
            hox hoxVar = hox.this;
            tr50 tr50Var = hoxVar.k;
            if (tr50Var != null) {
                cxs.a aVar = tr50Var.a.a;
                if (aVar != null) {
                    aVar.onDismiss();
                    return;
                }
                return;
            }
            d dVar = hoxVar.j;
            if (dVar != null) {
                dVar.onDismiss();
            }
        }

        @Override // xsna.hjz0.a
        public final void c() {
            hox hoxVar = hox.this;
            tr50 tr50Var = hoxVar.k;
            if (tr50Var != null) {
                cxs.a aVar = tr50Var.a.a;
                if (aVar != null) {
                    aVar.c(new j11.b(1309, "Failed to show ad"));
                    return;
                }
                return;
            }
            d dVar = hoxVar.j;
            if (dVar != null) {
                dVar.g();
            }
        }

        @Override // xsna.hjz0.a
        public final void d() {
            hox hoxVar = hox.this;
            s3z0.a aVar = hoxVar.b;
            s3z0 s3z0Var = new s3z0(aVar.a, "myTarget", 4);
            s3z0Var.e = aVar.b;
            hoxVar.i = s3z0Var;
        }

        @Override // xsna.hjz0.a
        public final void e() {
            hox hoxVar = hox.this;
            s3z0 s3z0Var = hoxVar.i;
            if (s3z0Var != null) {
                s3z0Var.a(s3z0Var.d, System.currentTimeMillis() - s3z0Var.c);
                hoxVar.i.b();
            }
            tr50 tr50Var = hoxVar.k;
            if (tr50Var != null) {
                cxs.a aVar = tr50Var.a.a;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            d dVar = hoxVar.j;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // xsna.hjz0.a
        public final void g(a aVar) {
            hox hoxVar = hox.this;
            sr50 sr50Var = hoxVar.l;
            if (sr50Var != null) {
                cxs.a aVar2 = sr50Var.a.a;
                if (aVar2 != null) {
                    aVar2.onClick();
                    return;
                }
                return;
            }
            d dVar = hoxVar.j;
            if (dVar != null) {
                dVar.onClick();
            }
        }

        public final void c(a aVar) {
            hox hoxVar = hox.this;
            ur50 ur50Var = hoxVar.m;
            if (ur50Var != null) {
                cxs.a aVar2 = ur50Var.a.a;
                if (aVar2 != null) {
                    aVar2.onCompleted();
                    return;
                }
                return;
            }
            d dVar = hoxVar.j;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // xsna.hjz0.a
        public final void f() {
        }
    }
}
