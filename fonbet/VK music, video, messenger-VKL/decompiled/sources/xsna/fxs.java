package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.dxs;
import xsna.gi0;
import xsna.y31;

/* compiled from: FullscreenAdvertisementController.kt */
/* loaded from: classes6.dex */
public final class fxs extends e41 {
    public final y31.b e;
    public final zws f;
    public final sni g;
    public final io.reactivex.rxjava3.disposables.b h;
    public boolean i;
    public final bpn0 j;

    /* compiled from: FullscreenAdvertisementController.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingFlags(showAfter=");
            sb.append(this.a);
            sb.append(", isBridgeAwaitCheckResult=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: FullscreenAdvertisementController.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: FullscreenAdvertisementController.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public fxs(d41 d41Var, zws zwsVar, sni sniVar, r31 r31Var, vh0 vh0Var, b41 b41Var) {
        super(r31Var, vh0Var, b41Var);
        this.e = d41Var;
        this.f = zwsVar;
        this.g = sniVar;
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.j = new bpn0(new f4(19));
    }

    public static io.reactivex.rxjava3.core.x t(AdvertisementType advertisementType, AdvertisementType advertisementType2, WebAdConfig webAdConfig, boolean z, boolean z2) {
        if (webAdConfig == null || webAdConfig.c == -1) {
            gnl gnlVar = e370.m;
            return (gnlVar != null ? gnlVar : null).a().g(advertisementType, webAdConfig, z, z2);
        }
        gnl gnlVar2 = e370.m;
        return (gnlVar2 != null ? gnlVar2 : null).a().i(advertisementType2, webAdConfig.d(), z, z2);
    }

    public final dxs s() {
        return (dxs) this.j.getValue();
    }

    public final void v(uh0 uh0Var, Activity activity, y31.a aVar, gi0.a aVar2, a aVar3, WebAdConfig webAdConfig) {
        cxs a2 = this.f.a(activity, jn00.a(aVar2), a());
        if (a2 == null) {
            x19.O(xgx0.a, "Incorrect fullscreen ad slot");
            this.e.a(aVar2.c, aVar2.a, aVar3.b, aVar3.a, (String) uh0Var.b);
            return;
        }
        a2.c(new hxs(this, uh0Var, aVar2, aVar2.c, aVar.a, aVar.c, aVar, activity, webAdConfig, aVar3.b, aVar3.a));
        dxs s = s();
        s.a.put(aVar2.c, new dxs.a(aVar2.a, aVar2.d, (String) uh0Var.b, aVar3.a));
        a2.load();
    }

    public final void w(Activity activity, y31.a aVar, WebAdConfig webAdConfig, boolean z, AdRequestPurpose adRequestPurpose) {
        AdvertisementType advertisementType = aVar.b;
        boolean z2 = aVar.c;
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        gnlVar.a().m();
        this.h.b(t(advertisementType, aVar.d, webAdConfig, z2, true).subscribe(new tf1(new exs(this, adRequestPurpose, activity, aVar, z, webAdConfig), 23), new com.vk.im.ui.components.dialogs_list.b(new b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 24)));
    }

    public final void x(Activity activity, y31.a aVar, WebAdConfig webAdConfig) {
        AdvertisementType advertisementType = aVar.d;
        boolean z = aVar.c;
        dxs s = s();
        AdvertisementType advertisementType2 = aVar.b;
        dxs.a a2 = s.a(advertisementType2);
        long i = this.g.i();
        if (a2 == null || !(a2.g || a2.a(i))) {
            this.h.b(t(advertisementType2, advertisementType, webAdConfig, z, false).subscribe(new eu0(new swe(aVar, this, activity, webAdConfig, 2), 26), new wf1(new c(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 24)));
            return;
        }
        if (!a2.a(i)) {
            if (a2.g) {
                a2.d = true;
                return;
            }
            return;
        }
        int i2 = a2.a;
        if (webAdConfig.c != -1) {
            gnl gnlVar = e370.m;
            if (gnlVar == null) {
                gnlVar = null;
            }
            gnlVar.a().o(advertisementType2, webAdConfig.d(), z, i2);
        } else {
            gnl gnlVar2 = e370.m;
            if (gnlVar2 == null) {
                gnlVar2 = null;
            }
            gnlVar2.a().e(advertisementType2, webAdConfig, z, i2);
        }
        cxs cxsVar = a2.f;
        int i3 = a2.b;
        AdvertisementType advertisementType3 = aVar.d;
        y31.a aVar2 = new y31.a(aVar.a, advertisementType3, aVar.c, advertisementType3);
        gnl gnlVar3 = e370.m;
        if (gnlVar3 == null) {
            gnlVar3 = null;
        }
        gnlVar3.a().c(advertisementType, aVar.a, i3);
        cxsVar.b(new com.vk.im.ui.fragments.chat.a(this, activity, aVar2, webAdConfig, 2));
        r31 r31Var = (r31) this.b;
        gnl gnlVar4 = e370.m;
        if (gnlVar4 == null) {
            gnlVar4 = null;
        }
        r31Var.f = gnlVar4.a().d();
        s().a.put(advertisementType2, null);
        cxsVar.show(activity);
    }
}
