package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import xsna.dwy0;
import xsna.ov50;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class is50 implements q120, ee0, cjc {
    public rjz0 a;
    public ov50 b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements ov50.b, ov50.a {
        public final dwy0.a a;

        public a(dwy0.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.ov50.b
        public final void a() {
            gu8.c(null, "MyTargetNativeBannerAdAdapter$AdListener: Ad shown");
            dwy0.a aVar = this.a;
            dwy0 dwy0Var = dwy0.this;
            if (dwy0Var.d != is50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "show", 1, null);
            ov50.b bVar = dwy0Var.j.h;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // xsna.ov50.b
        public final void b() {
            gu8.c(null, "MyTargetNativeBannerAdAdapter$AdListener: Ad clicked");
            dwy0.a aVar = this.a;
            dwy0 dwy0Var = dwy0.this;
            if (dwy0Var.d != is50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "click", 2, null);
            ov50.b bVar = dwy0Var.j.h;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // xsna.ov50.b
        public final void c(iaz0 iaz0Var) {
            gu8.c(null, "MyTargetNativeBannerAdAdapter$AdListener: No ad (" + iaz0Var.b + ")");
            this.a.a(iaz0Var, is50.this);
        }

        @Override // xsna.ov50.b
        public final void d(nv50 nv50Var) {
            gu8.c(null, "MyTargetNativeBannerAdAdapter$AdListener: Ad loaded");
            dwy0.a aVar = this.a;
            xgy0 xgy0Var = aVar.a;
            dwy0 dwy0Var = dwy0.this;
            if (dwy0Var.d != is50.this) {
                return;
            }
            String str = xgy0Var.a;
            gu8.c(null, "MediationNativeBannerAdEngine: Data from " + str + " ad network loaded successfully");
            WeakReference weakReference = dwy0Var.e;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            if (!xgy0Var.b() && !"0".equals(xgy0Var.a().get("lg")) && context != null) {
                o8z0.c(new x63(str, nv50Var, context, 3));
            }
            dwy0Var.t(xgy0Var, true);
            dwy0Var.k = nv50Var;
            ov50.b bVar = dwy0Var.j.h;
            if (bVar != null) {
                bVar.d(nv50Var);
            }
        }

        @Override // xsna.ov50.a
        public final boolean e() {
            gu8.c(null, "MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            ov50.a aVar = dwy0.this.j.j;
            if (aVar == null) {
                return true;
            }
            return aVar.e();
        }

        public final void f(kiw kiwVar, boolean z) {
            gu8.c(null, "MyTargetNativeBannerAdAdapter$AdListener: AdChoices icon downloading successfully");
            dwy0.a aVar = this.a;
            a aVar2 = dwy0.this.j.i;
            if (aVar2 == null) {
                return;
            }
            String str = aVar.a.a;
            if (z) {
                gu8.c(null, "MediationNativeBannerAdEngine: AdChoices icon from" + str + " ad network loaded successfully");
            } else {
                gu8.c(null, "MediationNativeBannerAdEngine: AdChoices icon from" + str + " hasn't loaded");
            }
            aVar2.f(kiwVar, z);
        }

        @Override // xsna.ov50.a
        public final void n(ov50 ov50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: the ad [" + ov50Var + "] should close automatically");
            ov50 ov50Var2 = dwy0.this.j;
            ov50.a aVar = ov50Var2.j;
            if (aVar == null) {
                return;
            }
            aVar.n(ov50Var2);
        }

        @Override // xsna.ov50.a
        public final void q(ov50 ov50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: the ad [" + ov50Var + "] should close manually");
            ov50 ov50Var2 = dwy0.this.j;
            ov50.a aVar = ov50Var2.j;
            if (aVar == null) {
                return;
            }
            aVar.q(ov50Var2);
        }
    }

    @Override // xsna.q120
    public final void a() {
        ov50 ov50Var = this.b;
        if (ov50Var == null) {
            return;
        }
        ov50Var.a();
    }

    @Override // xsna.ee0
    public final void b(@NonNull Context context) {
        qay0 qay0Var;
        ov50 ov50Var = this.b;
        if (ov50Var == null || (qay0Var = ov50Var.g) == null) {
            return;
        }
        qay0Var.b(context);
    }

    @Override // xsna.cjc
    public final void c(@NonNull View view) {
        qay0 qay0Var;
        ov50 ov50Var = this.b;
        if (ov50Var == null || (qay0Var = ov50Var.g) == null) {
            return;
        }
        qay0Var.c(view);
    }

    @Override // xsna.q120
    @Deprecated
    public final void d(@NonNull View view, @Nullable List<View> list, int i) {
        ov50 ov50Var = this.b;
        if (ov50Var == null) {
            return;
        }
        ov50Var.k = i;
        ov50Var.e(view, list);
    }

    @Override // xsna.n120
    public final void destroy() {
        ov50 ov50Var = this.b;
        if (ov50Var == null) {
            return;
        }
        ov50Var.a();
        this.b.h = null;
        this.b = null;
    }

    @Override // xsna.q120
    public final void h(int i, @Nullable List list) {
        ov50 ov50Var = this.b;
        if (ov50Var == null) {
            return;
        }
        ov50Var.k = i;
        throw null;
    }

    @Override // xsna.q120
    public final void j(@NonNull dwy0.b bVar, @NonNull dwy0.a aVar, @NonNull Context context) {
        String str = bVar.a;
        try {
            int parseInt = Integer.parseInt(str);
            ov50 ov50Var = new ov50(parseInt, context);
            this.b = ov50Var;
            u6z0 u6z0Var = ov50Var.a;
            u6z0Var.c = false;
            int i = bVar.g;
            u6z0Var.f = i;
            u6z0Var.j.g = i;
            a aVar2 = new a(aVar);
            ov50Var.h = aVar2;
            ov50Var.i = aVar2;
            ov50Var.j = aVar2;
            qnk qnkVar = u6z0Var.a;
            qnkVar.f(bVar.d);
            qnkVar.h(bVar.c);
            for (Map.Entry entry : bVar.e.entrySet()) {
                qnkVar.g((String) entry.getKey(), (String) entry.getValue());
            }
            String str2 = bVar.b;
            if (this.a != null) {
                gu8.c(null, "MyTargetNativeBannerAdAdapter: Got banner from mediation response");
                ov50 ov50Var2 = this.b;
                rjz0 rjz0Var = this.a;
                udz0 udz0Var = new udz0(ov50Var2.d, null, -1, 0, 2, v5z0.a);
                u6z0 u6z0Var2 = ov50Var2.a;
                u6z0Var2.b(udz0Var);
                udz0Var.c(0);
                s3z0.a aVar3 = new s3z0.a(u6z0Var2.g);
                s3z0 a2 = aVar3.a();
                laz0 laz0Var = new laz0(ov50Var2.f, u6z0Var2, aVar3, rjz0Var, null);
                laz0Var.d = new com.vk.movika.sdk.base.ui.p0(ov50Var2, 28);
                laz0Var.e(a2, ov50Var2.e);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                gu8.c(null, "MyTargetNativeBannerAdAdapter: Load id " + parseInt);
                this.b.d();
                return;
            }
            gu8.c(null, "MyTargetNativeBannerAdAdapter: Load id " + parseInt + " from BID " + str2);
            ov50 ov50Var3 = this.b;
            ov50Var3.a.e = str2;
            ov50Var3.d();
        } catch (Throwable unused) {
            gu8.e(null, "MyTargetNativeBannerAdAdapter: Error - " + zr.a("failed to request ad, unable to convert slotId ", str, " to int"));
            aVar.a(iaz0.o, this);
        }
    }
}
