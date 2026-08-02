package xsna;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Iterator;
import java.util.Map;
import xsna.cq70;

/* compiled from: PipelineDraweeController.java */
/* loaded from: classes12.dex */
public final class kpa0 extends ce<uvf<svf>, mjw> {
    public boolean A;
    public ImmutableList<tjo> B;
    public ImageRequest C;
    public ImageRequest[] D;
    public ImageRequest E;
    public final pdl w;
    public final n220<ww8, svf> x;
    public ww8 y;
    public yhn0<zuk<uvf<svf>>> z;

    public kpa0(Resources resources, fsl fslVar, tjo tjoVar, h0q0 h0q0Var, n220 n220Var) {
        super(fslVar, h0q0Var);
        this.w = new pdl(resources, tjoVar);
        this.x = n220Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a5h0 D(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof a5h0) {
            return (a5h0) drawable;
        }
        if (drawable instanceof ako) {
            return D(((ako) drawable).l());
        }
        if (!(drawable instanceof uk3)) {
            return null;
        }
        uk3 uk3Var = (uk3) drawable;
        int length = uk3Var.d.length;
        for (int i = 0; i < length; i++) {
            a5h0 D = D(uk3Var.a(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public final void E(svf svfVar) {
        a5h0 D;
        if (this.A) {
            if (this.i == null) {
                q2l q2lVar = new q2l();
                a(new hkw(q2lVar));
                this.i = q2lVar;
                kzi0 kzi0Var = this.h;
                if (kzi0Var != null) {
                    kzi0Var.e(q2lVar);
                }
            }
            q2l q2lVar2 = this.i;
            if (q2lVar2 != null) {
                String str = this.j;
                q2lVar2.getClass();
                if (str == null) {
                    str = "none";
                }
                q2lVar2.a = str;
                q2lVar2.invalidateSelf();
                kzi0 kzi0Var2 = this.h;
                q2lVar2.e = (kzi0Var2 == null || (D = D(kzi0Var2.a())) == null) ? null : D.f;
                Object obj = this.k;
                String obj2 = obj != null ? obj.toString() : null;
                if (obj2 != null) {
                    q2lVar2.f.put("cc", obj2);
                }
                if (svfVar == null) {
                    q2lVar2.b();
                    return;
                }
                int width = svfVar.getWidth();
                int height = svfVar.getHeight();
                q2lVar2.b = width;
                q2lVar2.c = height;
                q2lVar2.invalidateSelf();
                q2lVar2.d = svfVar.u();
            }
        }
    }

    @Override // xsna.ce, xsna.dlo
    public final void e(elo eloVar) {
        super.e(eloVar);
        E(null);
    }

    @Override // xsna.ce
    public final Drawable g(uvf<svf> uvfVar) {
        uvf<svf> uvfVar2 = uvfVar;
        try {
            if (lhs.d()) {
                lhs.a("PipelineDraweeController#createDrawable");
            }
            sex0.f(uvf.t(uvfVar2));
            svf r = uvfVar2.r();
            E(r);
            ImmutableList<tjo> immutableList = this.B;
            if (immutableList != null) {
                Iterator<tjo> it = immutableList.iterator();
                while (it.hasNext()) {
                    tjo next = it.next();
                    if (next.b(r) && (r2 = next.a(r)) != null) {
                        break;
                    }
                }
            }
            Drawable a = null;
            if (a != null) {
                if (lhs.d()) {
                    lhs.b();
                }
                return a;
            }
            Drawable a2 = this.w.a(r);
            if (a2 != null) {
                if (lhs.d()) {
                    lhs.b();
                }
                return a2;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + r);
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    @Override // xsna.ce
    public final uvf<svf> h() {
        ww8 ww8Var;
        boolean d;
        if (lhs.d()) {
            lhs.a("PipelineDraweeController#getCachedImage");
        }
        try {
            n220<ww8, svf> n220Var = this.x;
            if (n220Var != null && (ww8Var = this.y) != null) {
                uvf<svf> uvfVar = n220Var.get(ww8Var);
                if (uvfVar == null || ((gpw) uvfVar.r().R3()).c) {
                    if (lhs.d()) {
                        lhs.b();
                    }
                    return uvfVar;
                }
                uvfVar.close();
                if (d) {
                    return null;
                }
                return null;
            }
            if (lhs.d()) {
                lhs.b();
            }
            return null;
        } finally {
            if (lhs.d()) {
                lhs.b();
            }
        }
    }

    @Override // xsna.ce
    public final zuk<uvf<svf>> j() {
        if (lhs.d()) {
            lhs.a("PipelineDraweeController#getDataSource");
        }
        if (ahq.a.a(2)) {
            ahq.f(kpa0.class, Integer.valueOf(System.identityHashCode(this)), "controller %x: getDataSource");
        }
        zuk<uvf<svf>> zukVar = this.z.get();
        if (lhs.d()) {
            lhs.b();
        }
        return zukVar;
    }

    @Override // xsna.ce
    public final int k(uvf<svf> uvfVar) {
        uvf<svf> uvfVar2 = uvfVar;
        if (uvfVar2 == null || !uvfVar2.s()) {
            return 0;
        }
        return System.identityHashCode(uvfVar2.c.a());
    }

    @Override // xsna.ce
    public final mjw l(Object obj) {
        uvf uvfVar = (uvf) obj;
        sex0.f(uvf.t(uvfVar));
        return ((svf) uvfVar.r()).B();
    }

    @Override // xsna.ce
    public final Uri m() {
        ImageRequest imageRequest = this.C;
        ImageRequest imageRequest2 = this.E;
        ImageRequest[] imageRequestArr = this.D;
        Uri uri = imageRequest != null ? imageRequest.b : null;
        if (uri != null) {
            return uri;
        }
        if (imageRequestArr != null && imageRequestArr.length != 0) {
            ImageRequest imageRequest3 = imageRequestArr[0];
            Uri uri2 = imageRequest3 != null ? imageRequest3.b : null;
            if (uri2 != null) {
                return uri2;
            }
        }
        if (imageRequest2 != null) {
            return imageRequest2.b;
        }
        return null;
    }

    @Override // xsna.ce
    public final Map t(mjw mjwVar) {
        mjw mjwVar2 = mjwVar;
        if (mjwVar2 == null) {
            return null;
        }
        return mjwVar2.getExtras();
    }

    @Override // xsna.ce
    public final String toString() {
        cq70.a b = cq70.b(this);
        b.d(super.toString(), "super");
        b.d(this.z, "dataSourceSupplier");
        return b.toString();
    }

    @Override // xsna.ce
    public final void v(Object obj) {
        synchronized (this) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ce
    public final void x(Drawable drawable) {
        if (drawable instanceof yko) {
            ((yko) drawable).a();
        }
    }

    @Override // xsna.ce
    public final void z(uvf<svf> uvfVar) {
        uvf.q(uvfVar);
    }
}
