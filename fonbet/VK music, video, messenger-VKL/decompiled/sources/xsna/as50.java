package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.kuy0;
import xsna.s3z0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class as50 implements p120, ee0, cjc {
    public rjz0 a;
    public zu50 b;

    @Override // xsna.p120
    public final void a() {
        zu50 zu50Var = this.b;
        if (zu50Var == null) {
            return;
        }
        zu50Var.a();
    }

    @Override // xsna.ee0
    public final void b(@NonNull Context context) {
        zu50 zu50Var = this.b;
        if (zu50Var == null) {
            return;
        }
        zu50Var.e(context);
    }

    @Override // xsna.cjc
    public final void c(@NonNull View view) {
        ckz0 ckz0Var;
        zu50 zu50Var = this.b;
        if (zu50Var == null || (ckz0Var = zu50Var.h) == null) {
            return;
        }
        ckz0Var.c(view);
    }

    @Override // xsna.p120
    @Deprecated
    public final void d(@NonNull View view, @Nullable List<View> list, int i) {
        zu50 zu50Var = this.b;
        if (zu50Var == null) {
            return;
        }
        zu50Var.r = i;
        afz0.a(view, zu50Var);
        ckz0 ckz0Var = zu50Var.h;
        if (ckz0Var != null) {
            ckz0Var.j(view, list, zu50Var.r);
        }
    }

    @Override // xsna.n120
    public final void destroy() {
        zu50 zu50Var = this.b;
        if (zu50Var == null) {
            return;
        }
        zu50Var.a();
        this.b.i = null;
        this.b = null;
    }

    @Override // xsna.p120
    public final void e(@NonNull kuy0.b bVar, @NonNull kuy0.a aVar, @NonNull Context context) {
        String str = bVar.a;
        try {
            int parseInt = Integer.parseInt(str);
            zu50 zu50Var = new zu50(parseInt, bVar.h, context);
            this.b = zu50Var;
            u6z0 u6z0Var = zu50Var.a;
            u6z0Var.c = false;
            int i = bVar.g;
            u6z0Var.f = i;
            u6z0Var.j.g = i;
            a aVar2 = new a(aVar);
            zu50Var.i = aVar2;
            zu50Var.j = aVar2;
            zu50Var.l = aVar2;
            qnk qnkVar = u6z0Var.a;
            qnkVar.f(bVar.d);
            qnkVar.h(bVar.c);
            for (Map.Entry entry : bVar.e.entrySet()) {
                qnkVar.g((String) entry.getKey(), (String) entry.getValue());
            }
            String str2 = bVar.b;
            if (this.a != null) {
                gu8.c(null, "MyTargetNativeAdAdapter: Got banner from mediation response");
                zu50 zu50Var2 = this.b;
                rjz0 rjz0Var = this.a;
                udz0 udz0Var = new udz0(zu50Var2.d, null, -1, 1, 2, v5z0.a);
                u6z0 u6z0Var2 = zu50Var2.a;
                u6z0Var2.b(udz0Var);
                udz0Var.c(0);
                s3z0.a aVar3 = zu50Var2.b;
                s3z0 a2 = aVar3.a();
                laz0 laz0Var = new laz0(zu50Var2.f, u6z0Var2, aVar3, rjz0Var, null);
                laz0Var.d = new yzt(zu50Var2, 9);
                laz0Var.e(a2, zu50Var2.e);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                gu8.c(null, "MyTargetNativeAdAdapter: Load id " + parseInt);
                this.b.g();
                return;
            }
            gu8.c(null, "MyTargetNativeAdAdapter: Load id " + parseInt + " from BID " + str2);
            zu50 zu50Var3 = this.b;
            zu50Var3.a.e = str2;
            zu50Var3.g();
        } catch (Throwable unused) {
            gu8.e(null, "MyTargetNativeAdAdapter error: " + zr.a("failed to request ad, unable to convert slotId ", str, " to int"));
            aVar.a(iaz0.o, this);
        }
    }

    @Override // xsna.p120
    public final void f(@NonNull lv50 lv50Var, @Nullable ArrayList arrayList, int i) {
        zu50 zu50Var = this.b;
        if (zu50Var == null) {
            return;
        }
        zu50Var.r = i;
        zu50Var.h(lv50Var, arrayList);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements zu50.c, zu50.b {
        public final kuy0.a a;

        public a(kuy0.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: Ad clicked");
            kuy0.a aVar = this.a;
            kuy0 kuy0Var = kuy0.this;
            n120 n120Var = kuy0Var.d;
            zu50 zu50Var2 = kuy0Var.j;
            if (n120Var != as50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "click", 2, null);
            zu50.c cVar = zu50Var2.i;
            if (cVar != null) {
                try {
                    cVar.a(null, zu50Var2);
                } catch (AbstractMethodError e) {
                    if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                        cVar.onClick();
                    }
                }
            }
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: Ad shown");
            kuy0.a aVar = this.a;
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d != as50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "show", 1, null);
            zu50 zu50Var2 = kuy0Var.j;
            zu50.c cVar = zu50Var2.i;
            if (cVar != null) {
                cVar.b(zu50Var2);
            }
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: No ad (" + iaz0Var.b + ")");
            this.a.a(iaz0Var, as50.this);
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: Ad loaded");
            kuy0.a aVar = this.a;
            xgy0 xgy0Var = aVar.a;
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d != as50.this) {
                return;
            }
            String str = xgy0Var.a;
            gu8.c(null, "MediationNativeAdEngine: Data from " + str + " ad network loaded successfully");
            WeakReference weakReference = kuy0Var.e;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            if (!xgy0Var.b() && !"0".equals(xgy0Var.a().get("lg")) && context != null) {
                o8z0.c(new bbr(str, cw50Var, context));
            }
            kuy0Var.t(xgy0Var, true);
            kuy0Var.l = cw50Var;
            zu50 zu50Var2 = kuy0Var.j;
            zu50.c cVar = zu50Var2.i;
            if (cVar != null) {
                cVar.d(cw50Var, zu50Var2);
            }
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            gu8.c(null, "MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            zu50.b bVar = kuy0.this.j.l;
            if (bVar == null) {
                return true;
            }
            return bVar.e();
        }

        public final void f(kiw kiwVar, boolean z) {
            a aVar;
            gu8.c(null, "MyTargetNativeAdAdapter: AdChoices icon downloading successfully");
            kuy0.a aVar2 = this.a;
            kuy0 kuy0Var = kuy0.this;
            n120 n120Var = kuy0Var.d;
            zu50 zu50Var = kuy0Var.j;
            if (n120Var == as50.this && (aVar = zu50Var.j) != null) {
                String str = aVar2.a.a;
                if (z) {
                    gu8.c(null, "MediationNativeAdEngine: AdChoices icon from" + str + " ad network loaded successfully");
                } else {
                    gu8.c(null, "MediationNativeAdEngine: AdChoices icon from" + str + " hasn't loaded");
                }
                aVar.f(kiwVar, z);
            }
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: the ad [" + zu50Var + "] should close manually");
            zu50 zu50Var2 = kuy0.this.j;
            zu50.b bVar = zu50Var2.l;
            if (bVar == null) {
                return;
            }
            bVar.g(zu50Var2);
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
            gu8.c(null, "MyTargetNativeAdAdapter: the ad [" + zu50Var + "] should close automatically");
            zu50 zu50Var2 = kuy0.this.j;
            zu50.b bVar = zu50Var2.l;
            if (bVar == null) {
                return;
            }
            bVar.h(zu50Var2);
        }

        @Override // xsna.zu50.c
        public final void onVideoComplete() {
            zu50.c cVar;
            gu8.c(null, "MyTargetNativeAdAdapter: Video completed");
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d == as50.this && (cVar = kuy0Var.j.i) != null) {
                cVar.onVideoComplete();
            }
        }

        @Override // xsna.zu50.c
        public final void onVideoPause() {
            zu50.c cVar;
            gu8.c(null, "MyTargetNativeAdAdapter: Video paused");
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d == as50.this && (cVar = kuy0Var.j.i) != null) {
                cVar.onVideoPause();
            }
        }

        @Override // xsna.zu50.c
        public final void onVideoPlay() {
            zu50.c cVar;
            gu8.c(null, "MyTargetNativeAdAdapter: Video playing");
            kuy0 kuy0Var = kuy0.this;
            if (kuy0Var.d == as50.this && (cVar = kuy0Var.j.i) != null) {
                cVar.onVideoPlay();
            }
        }

        @Override // xsna.zu50.c
        public final void onClick() {
        }
    }
}
