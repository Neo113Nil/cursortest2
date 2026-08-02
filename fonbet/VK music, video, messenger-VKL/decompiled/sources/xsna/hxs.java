package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.cxs;
import xsna.dxs;
import xsna.gi0;
import xsna.j11;
import xsna.r31;
import xsna.y31;

/* compiled from: FullscreenAdvertisementController.kt */
/* loaded from: classes6.dex */
public final class hxs implements cxs.a {
    public boolean a;
    public cxs.b b;
    public final /* synthetic */ fxs c;
    public final /* synthetic */ uh0 d;
    public final /* synthetic */ gi0.a e;
    public final /* synthetic */ AdvertisementType f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ y31.a i;
    public final /* synthetic */ Activity j;
    public final /* synthetic */ WebAdConfig k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* compiled from: FullscreenAdvertisementController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public hxs(fxs fxsVar, uh0 uh0Var, gi0.a aVar, AdvertisementType advertisementType, long j, boolean z, y31.a aVar2, Activity activity, WebAdConfig webAdConfig, boolean z2, boolean z3) {
        this.c = fxsVar;
        this.d = uh0Var;
        this.e = aVar;
        this.f = advertisementType;
        this.g = j;
        this.h = z;
        this.i = aVar2;
        this.j = activity;
        this.k = webAdConfig;
        this.l = z2;
        this.m = z3;
    }

    public static void f(r31 r31Var, gi0.a aVar) {
        r31Var.c = Integer.valueOf(aVar.a);
        r31Var.d = aVar.c;
        r31Var.e = Integer.valueOf(aVar.d);
    }

    @Override // xsna.cxs.a
    public final void a() {
        fxs fxsVar = this.c;
        r31 r31Var = (r31) fxsVar.b;
        gi0.a aVar = this.e;
        int i = aVar.a;
        r31Var.g = new r31.a(r31Var.b, aVar.c, Integer.valueOf(aVar.d), Integer.valueOf(i), (LinkedHashMap) r31Var.h());
        vh0 vh0Var = (vh0) fxsVar.c;
        String str = (String) this.d.b;
        vh0Var.d(str, new ei0(aVar), AdRequestPurpose.SHOW_INSTANCE);
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 == advertisementType) {
            fxsVar.i = false;
        } else {
            f(r31Var, aVar);
            fxsVar.e.c(advertisementType2, str);
        }
    }

    @Override // xsna.cxs.a
    public final void b(cxs.b bVar) {
        this.a = true;
        this.b = bVar;
    }

    @Override // xsna.cxs.a
    public final void c(j11 j11Var) {
        x19.O(xgx0.a, "Fullscreen ad display error: " + j11Var);
        fxs fxsVar = this.c;
        vh0 vh0Var = (vh0) fxsVar.c;
        String str = (String) this.d.b;
        gi0.a aVar = this.e;
        vh0.c(vh0Var, str, new ei0(aVar), j11Var);
        fxsVar.e.b(aVar.c, j11Var, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // xsna.cxs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(j11 j11Var) {
        boolean z;
        boolean z2;
        dxs.a a2;
        fxs fxsVar = this.c;
        vh0 vh0Var = (vh0) fxsVar.c;
        uh0 uh0Var = this.d;
        String str = (String) uh0Var.b;
        gi0.a aVar = this.e;
        vh0Var.b(str, new ei0(aVar), (AdRequestPurpose) uh0Var.a, j11Var);
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        f41 a3 = gnlVar.a();
        boolean z3 = this.m;
        boolean z4 = !z3;
        WebAdConfig webAdConfig = this.k;
        a3.h(aVar, webAdConfig);
        boolean z5 = this.l;
        AdvertisementType advertisementType = this.f;
        if (!z5) {
            dxs.a a4 = fxsVar.s().a(advertisementType);
            if (!(a4 != null ? a4.e : false)) {
                z = z4;
                z2 = false;
                dxs.a a5 = fxsVar.s().a(advertisementType);
                boolean z6 = !(a5 == null ? a5.d : false) || z3;
                a2 = fxsVar.s().a(advertisementType);
                if (a2 != null) {
                    a2.g = false;
                }
                y31.a aVar2 = this.i;
                fxsVar.h.b(fxs.t(aVar2.b, aVar2.d, webAdConfig, this.h, z).subscribe(new ov2(new gxs(fxsVar, z6, z2, uh0Var, this.j, aVar2, this.k, this.g, this.h, j11Var, this.f), 21), new xf1(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 24)));
            }
        }
        z = z4;
        z2 = true;
        dxs.a a52 = fxsVar.s().a(advertisementType);
        if (a52 == null ? a52.d : false) {
        }
        a2 = fxsVar.s().a(advertisementType);
        if (a2 != null) {
        }
        y31.a aVar22 = this.i;
        fxsVar.h.b(fxs.t(aVar22.b, aVar22.d, webAdConfig, this.h, z).subscribe(new ov2(new gxs(fxsVar, z6, z2, uh0Var, this.j, aVar22, this.k, this.g, this.h, j11Var, this.f), 21), new xf1(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 24)));
    }

    @Override // xsna.cxs.a
    public final void e(cxs cxsVar) {
        fxs fxsVar = this.c;
        vh0 vh0Var = (vh0) fxsVar.c;
        uh0 uh0Var = this.d;
        String str = (String) uh0Var.b;
        gi0.a aVar = this.e;
        vh0Var.a(str, new ei0(aVar), (AdRequestPurpose) uh0Var.a);
        dxs s = fxsVar.s();
        AdvertisementType advertisementType = this.f;
        dxs.a a2 = s.a(advertisementType);
        if (a2 == null) {
            return;
        }
        if (!a2.d) {
            gnl gnlVar = e370.m;
            long n = (gnlVar != null ? gnlVar : null).a().n(advertisementType, aVar.d);
            a2.f = cxsVar;
            a2.h = n;
            a2.g = false;
            if (this.l || a2.e) {
                fxsVar.e.d(advertisementType, true, str);
                return;
            }
            return;
        }
        AdvertisementType advertisementType2 = this.i.d;
        int i = aVar.d;
        long j = this.g;
        y31.a aVar2 = new y31.a(j, advertisementType2, this.h, advertisementType2);
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        gnlVar2.a().c(advertisementType2, j, i);
        Activity activity = this.j;
        cxsVar.b(new com.vk.im.ui.fragments.chat.a(fxsVar, activity, aVar2, this.k, 2));
        r31 r31Var = (r31) fxsVar.b;
        gnl gnlVar3 = e370.m;
        if (gnlVar3 == null) {
            gnlVar3 = null;
        }
        r31Var.f = gnlVar3.a().d();
        fxsVar.s().a.put(advertisementType, null);
        cxsVar.show(activity);
    }

    @Override // xsna.cxs.a
    public final void onClick() {
        this.c.e.g((String) this.d.b);
    }

    @Override // xsna.cxs.a
    public final void onCompleted() {
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 == advertisementType) {
            fxs fxsVar = this.c;
            f((r31) fxsVar.b, this.e);
            fxsVar.e.c(advertisementType2, (String) this.d.b);
            fxsVar.i = true;
        }
    }

    @Override // xsna.cxs.a
    public final void onDismiss() {
        fxs fxsVar = this.c;
        vh0 vh0Var = (vh0) fxsVar.c;
        boolean z = this.a;
        String str = (String) this.d.b;
        gi0.a aVar = this.e;
        ei0 ei0Var = new ei0(aVar);
        cxs.b bVar = this.b;
        vh0Var.f(z, str, ei0Var, bVar != null ? new xf0(bVar) : null);
        AdvertisementType advertisementType = AdvertisementType.REWARD;
        AdvertisementType advertisementType2 = this.f;
        if (advertisementType2 != advertisementType || fxsVar.i) {
            return;
        }
        f((r31) fxsVar.b, aVar);
        fxsVar.e.e(advertisementType2, new j11.b(401, "Ad closed before impression"), str);
    }
}
