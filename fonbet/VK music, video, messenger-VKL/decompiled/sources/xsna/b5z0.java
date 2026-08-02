package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.nativeads.views.IconAdView;
import java.util.List;
import xsna.is50;
import xsna.o2z0;
import xsna.ov50;
import xsna.thz0;
import xsna.ubz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class b5z0 implements qay0 {
    public final ov50 a;
    public final x1z0 b;
    public final mez0 c;
    public final z7z0 d;
    public final nv50 e;
    public final thz0 f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements o2z0.b {
        public final b5z0 b;
        public final ov50 c;

        public a(b5z0 b5z0Var, ov50 ov50Var) {
            this.b = b5z0Var;
            this.c = ov50Var;
        }

        public final void a(View view, int i) {
            this.b.e(view, i);
        }

        @Override // xsna.o2z0.b
        public final void a(boolean z) {
            ov50 ov50Var = this.c;
            is50.a aVar = ov50Var.i;
            if (aVar == null) {
                return;
            }
            if (!z) {
                aVar.f(null, false);
                return;
            }
            qay0 qay0Var = ov50Var.g;
            nv50 b = qay0Var == null ? null : qay0Var.b();
            if (b == null) {
                aVar.f(null, false);
                return;
            }
            kiw kiwVar = b.r;
            if (kiwVar == null) {
                aVar.f(null, false);
            } else {
                aVar.f(kiwVar, true);
            }
        }
    }

    public b5z0(ov50 ov50Var, x1z0 x1z0Var, Context context) {
        this.a = ov50Var;
        this.b = x1z0Var;
        this.e = new nv50(x1z0Var);
        this.d = new z7z0(x1z0Var, new a(this, ov50Var));
        this.f = thz0.a(x1z0Var, 2, null, context);
        this.c = mez0.a(ov50Var.a.a);
    }

    @Override // xsna.qay0
    public final void a() {
        z7z0 z7z0Var = this.d;
        izy0 izy0Var = z7z0Var.c;
        izy0Var.h();
        izy0Var.l = null;
        z7z0Var.f.e();
        z7z0Var.d.b(null);
        ubz0 ubz0Var = z7z0Var.l;
        if (ubz0Var != null) {
            IconAdView d = ubz0Var.d();
            if (d != null) {
                d.setOnClickListener(null);
                ImageView imageView = d.getImageView();
                imageView.setImageBitmap(null);
                if (imageView instanceof whz0) {
                    whz0 whz0Var = (whz0) imageView;
                    whz0Var.e = 0;
                    whz0Var.d = 0;
                }
                kiw kiwVar = z7z0Var.b.u;
                if (kiwVar != null) {
                    o2z0.d(kiwVar, imageView);
                }
            }
            ViewGroup g = z7z0Var.l.g();
            if (g != null) {
                z7z0Var.i.c(g);
                g.setVisibility(0);
            }
            z7z0.b(z7z0Var.l, null, null);
            z7z0Var.l.a();
            z7z0Var.l = null;
        }
        thz0 thz0Var = this.f;
        if (thz0Var != null) {
            thz0Var.g();
        }
    }

    @Override // xsna.qay0
    public final nv50 b() {
        return this.e;
    }

    @Override // xsna.qay0
    public final void c(View view) {
        e(view, 2);
    }

    @Override // xsna.qay0
    public final void d(View view, List list, int i) {
        a();
        thz0 thz0Var = this.f;
        if (thz0Var != null) {
            thz0Var.d(view, new thz0.b[0]);
        }
        z7z0 z7z0Var = this.d;
        if (z7z0Var.m) {
            gu8.e(null, "Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            gu8.e(null, "unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        ubz0.a aVar = new ubz0.a();
        aVar.d = 1;
        aVar.a = (ViewGroup) view;
        aVar.c = list;
        ubz0 b = aVar.b();
        z7z0Var.l = b;
        z7z0.b(b, z7z0Var.j, z7z0Var.k);
        ubz0 ubz0Var = z7z0Var.l;
        suy0 suy0Var = z7z0Var.d;
        izy0 izy0Var = z7z0Var.c;
        ViewGroup g = ubz0Var.g();
        if (g == null) {
            gu8.e(null, "something wrong, root ad view is null");
            return;
        }
        IconAdView d = ubz0Var.d();
        if (d == null) {
            gu8.e(null, "IconAdView component not found in ad view  " + g + ". It's required");
            return;
        }
        khy0.a |= 8;
        ImageView imageView = d.getImageView();
        if (imageView instanceof whz0) {
            kiw kiwVar = z7z0Var.b.u;
            if (kiwVar != null) {
                Bitmap a2 = kiwVar.a();
                int i2 = kiwVar.b;
                int i3 = kiwVar.c;
                if (i2 <= 0 || i3 <= 0) {
                    i2 = 100;
                    i3 = 100;
                }
                whz0 whz0Var = (whz0) imageView;
                whz0Var.e = i2;
                whz0Var.d = i3;
                if (a2 == null) {
                    o2z0.e(kiwVar, imageView, new alb0(z7z0Var, 13));
                } else {
                    imageView.setImageBitmap(a2);
                }
            } else {
                imageView.setImageBitmap(null);
                whz0 whz0Var2 = (whz0) imageView;
                whz0Var2.e = 0;
                whz0Var2.d = 0;
            }
        }
        izy0Var.l = z7z0Var.h;
        z7z0Var.i.b(g, ubz0Var, z7z0Var, i);
        o8z0.c(new o4(g.getContext(), 23));
        izy0Var.f(g);
        suy0Var.b(g);
        suy0Var.c();
        z7z0Var.e.a(ubz0Var);
        z7z0Var.f.b(ubz0Var.g(), ubz0Var.e());
    }

    public final void e(View view, int i) {
        gu8.c(null, "NativeBannerAdEngine: Click received by native banner ad, cs=" + i);
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                this.c.c(this.b, i, null, context);
            }
            ov50.b bVar = this.a.h;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public final void f() {
        z7z0 z7z0Var = this.d;
        izy0 izy0Var = z7z0Var.c;
        h8z0.e(z7z0Var.b.a, "closedByUser", 999, null);
        ubz0 ubz0Var = z7z0Var.l;
        ViewGroup g = ubz0Var != null ? ubz0Var.g() : null;
        izy0Var.h();
        izy0Var.l = null;
        z7z0Var.f.e();
        z7z0Var.d.d();
        z7z0Var.m = true;
        if (g != null) {
            g.setVisibility(4);
        }
    }

    @Override // xsna.qay0
    public final void b(Context context) {
        this.d.i.a(context);
    }
}
