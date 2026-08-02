package xsna;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import xsna.exy0;
import xsna.g8x;
import xsna.n8z0;
import xsna.s3z0;
import xsna.xrz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ijz0 {
    public final g8x a;
    public final i620 b;
    public final rez0 c;
    public final u6z0 d;
    public final s3z0.a e;
    public final o6z0 f;
    public final mez0 g;
    public fvy0 h;
    public String i;
    public volatile xrz0 j;
    public lgz0 k;
    public g8x.c l;
    public ArrayList n;
    public int p;
    public final a m = new a();
    public final float[] o = new float[0];
    public final rcz0 q = new rcz0();
    public final b r = new b();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements exy0.a {
        public a() {
        }

        @Override // xsna.exy0.a
        public final void b() {
            if (ijz0.this.a.j != null) {
                gu8.c(null, "InstreamAudioAdEngine: onBannerShouldClose called by adChoicesOption");
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements xrz0.a {
        public b() {
        }

        @Override // xsna.xrz0.a
        public final void a() {
        }

        @Override // xsna.xrz0.a
        public final boolean b(ArrayList arrayList, ga40 ga40Var) {
            return ijz0.a(ijz0.this, arrayList, ga40Var);
        }

        @Override // xsna.xrz0.a
        public final void c(lgz0 lgz0Var) {
            if (ijz0.this.f.g == null) {
                gu8.c(null, "InstreamAudioAdEngine: Can't send stat: no player");
            }
            h8z0.e(lgz0Var.a, "playbackStarted", 999, null);
        }

        @Override // xsna.xrz0.a
        public final void d(lgz0 lgz0Var) {
            List list;
            kiw kiwVar;
            boolean z;
            ijz0 ijz0Var = ijz0.this;
            ijz0Var.k = lgz0Var;
            wty0 wty0Var = lgz0Var.L;
            if (wty0Var != null) {
                ijz0Var.i = wty0Var.b;
                list = wty0Var.c;
            } else {
                list = null;
            }
            if (list != null) {
                ijz0Var.h = new fvy0(wty0Var, ijz0Var.b);
            }
            if (lgz0Var.v0 == null) {
                gu8.c(null, "InstreamAudioAdEngine: failed play instreamAd banner, media-data is empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(lgz0Var.U);
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                n4z0 n4z0Var = (n4z0) obj;
                arrayList.add(new g8x.b(n4z0Var.B, n4z0Var.C, n4z0Var.U, n4z0Var.V, n4z0Var.W, n4z0Var.X, !TextUtils.isEmpty(n4z0Var.J), n4z0Var.Y, n4z0Var.Z, n4z0Var.a0, n4z0Var.b0, n4z0Var.c0, n4z0Var.d0, n4z0Var.H));
            }
            wty0 wty0Var2 = lgz0Var.L;
            if (wty0Var2 != null) {
                kiwVar = wty0Var2.a;
                z = true;
            } else {
                kiwVar = null;
                z = false;
            }
            qhz0 qhz0Var = lgz0Var.v0;
            g8x.c cVar = new g8x.c(lgz0Var.m0, lgz0Var.n0, lgz0Var.o0, lgz0Var.D, lgz0Var.Y, lgz0Var.p0, new ArrayList(lgz0Var.V), arrayList, z, lgz0Var.r, kiwVar, lgz0Var.H, qhz0Var != null ? ((dbz0) qhz0Var).e : null);
            ijz0Var.l = cVar;
            ijz0Var.n = new ArrayList(arrayList);
            lgz0Var.T.e(1, yup.PERMISSION_NOT_DECLARED, lgz0Var.v());
            o6z0 o6z0Var = ijz0Var.f;
            o6z0Var.i = lgz0Var;
            o6z0Var.e.c(lgz0Var);
            o6z0Var.m = false;
            e5z0 e5z0Var = lgz0Var.a;
            Stack stack = o6z0Var.d;
            stack.addAll(e5z0Var.e);
            Collections.sort(stack, new c5z0());
            dbz0 dbz0Var = (dbz0) lgz0Var.v0;
            if (dbz0Var == null || o6z0Var.g == null) {
                return;
            }
            String str = (String) dbz0Var.d;
            Uri parse = str != null ? Uri.parse(str) : Uri.parse(dbz0Var.a);
            o6z0Var.g.setVolume(o6z0Var.f);
            try {
                o6z0Var.g.m(parse, cVar);
            } catch (AbstractMethodError e) {
                if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                    o6z0Var.g.getClass();
                }
            }
        }

        @Override // xsna.xrz0.a
        public final void a(xrz0 xrz0Var, boolean z) {
            ijz0 ijz0Var = ijz0.this;
            if (z) {
                ijz0Var.e(xrz0Var);
            } else {
                ijz0Var.d(xrz0Var);
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c {
        public c() {
        }

        public final void a(float f, float f2, lgz0 lgz0Var) {
            g8x.d dVar;
            if (b(lgz0Var) || (dVar = ijz0.this.a.j) == null) {
                return;
            }
            dVar.a(f, f2);
        }

        public final boolean b(lgz0 lgz0Var) {
            if (ijz0.this.j == null) {
                return true;
            }
            ijz0 ijz0Var = ijz0.this;
            return ijz0Var.k != lgz0Var || ijz0Var.l == null;
        }
    }

    public ijz0(g8x g8xVar, rez0 rez0Var, u6z0 u6z0Var, s3z0.a aVar, i620 i620Var) {
        this.a = g8xVar;
        this.c = rez0Var;
        this.d = u6z0Var;
        this.e = aVar;
        o6z0 o6z0Var = new o6z0();
        this.f = o6z0Var;
        o6z0Var.h = new c();
        this.g = mez0.a(g8xVar.a.a);
        this.b = i620Var;
    }

    public static boolean a(ijz0 ijz0Var, List list, n8z0.b bVar) {
        ijz0Var.getClass();
        s3z0.a aVar = ijz0Var.e;
        idy0 idy0Var = xr50.c;
        if (idy0Var == null) {
            gu8.c(null, "InstreamAudioAdEngine: can't load after services - context is null");
            return false;
        }
        dkz0 dkz0Var = new dkz0(list, ijz0Var.d, aVar, ijz0Var.p);
        dkz0Var.d = bVar;
        dkz0Var.e(aVar.a(), idy0Var.a);
        return true;
    }

    public final n4z0 b(g8x.b bVar) {
        lgz0 lgz0Var;
        if (this.n == null || this.l == null || (lgz0Var = this.k) == null) {
            gu8.c(null, "InstreamAudioAdEngine: Can't find companion banner - no playing banner");
            return null;
        }
        ArrayList arrayList = new ArrayList(lgz0Var.U);
        int indexOf = this.n.indexOf(bVar);
        if (indexOf >= 0 && indexOf < arrayList.size()) {
            return (n4z0) arrayList.get(indexOf);
        }
        gu8.c(null, "InstreamAudioAdEngine: Can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner");
        return null;
    }

    public final void c(i8x i8xVar) {
        o6z0 o6z0Var = this.f;
        kwy0 kwy0Var = o6z0Var.e;
        i8x i8xVar2 = o6z0Var.g;
        if (i8xVar2 != null) {
            i8xVar2.o(null);
        }
        o6z0Var.g = i8xVar;
        if (i8xVar == null) {
            kwy0Var.g = null;
        } else {
            i8xVar.o(o6z0Var.a);
            kwy0Var.g = i8xVar.J();
        }
    }

    public final void d(xrz0 xrz0Var) {
        ijz0 ijz0Var;
        g8x g8xVar;
        g8x.d dVar;
        if (xrz0Var != null) {
            o6z0 o6z0Var = this.f;
            if (o6z0Var.n == 1) {
                if (o6z0Var.i != null && o6z0Var.h != null) {
                    o6z0Var.e.o();
                    c cVar = o6z0Var.h;
                    if (!cVar.b(o6z0Var.i) && (dVar = (g8xVar = (ijz0Var = ijz0.this).a).j) != null) {
                        dVar.d(g8xVar, ijz0Var.l);
                    }
                }
                o6z0Var.n = 0;
            }
            i8x i8xVar = o6z0Var.g;
            if (i8xVar != null) {
                i8xVar.y();
            }
            e(xrz0Var);
        }
    }

    public final void e(xrz0 xrz0Var) {
        lgz0 lgz0Var = this.k;
        if (lgz0Var != null) {
            lgz0Var.T.e(1, yup.INVALID_PERMISSION_RATIONALE_DECLARATION, lgz0Var.v());
        }
        this.q.c(xrz0Var);
        if (xrz0Var != this.j) {
            return;
        }
        this.k = null;
        this.l = null;
        this.j = null;
        g8x g8xVar = this.a;
        g8x.d dVar = g8xVar.j;
        if (dVar != null) {
            dVar.g(xrz0Var.c.c, g8xVar);
        }
    }
}
