package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.SizeF;
import android.view.ViewGroup;
import com.google.android.gms.internal.play_billing.zzco;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.go.routestops.v2.router.b;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.RangeState;
import org.altbeacon.beacon.service.RegionMonitoringState;

/* loaded from: classes15.dex */
public final class aye0 implements wuy0, ca20, pfi0, b8o, hwe, eo3, bdl0, rvl0, lxl0, ryj0, vof {
    public final /* synthetic */ int a;
    public Object b;

    public aye0(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new n2k0();
                break;
        }
    }

    @Override // defpackage.b8o
    public void a() {
        switch (this.a) {
            case 12:
                ((a) this.b).a();
                break;
            default:
                b bVar = (b) this.b;
                if (!gtq0.u(bVar.P)) {
                    bVar.P = null;
                    bVar.r(new qu(9));
                    break;
                } else {
                    m950 m950Var = bVar.P;
                    if (m950Var != null) {
                        ((h55) m950Var).i();
                    }
                    bVar.P = null;
                    break;
                }
        }
    }

    @Override // defpackage.b8o
    public void b() {
        ((a) this.b).a();
    }

    @Override // defpackage.pfi0
    public n2k0 c() {
        return (n2k0) this.b;
    }

    @Override // defpackage.pfi0
    public void clear() {
    }

    @Override // defpackage.eo3
    public void d() {
        ((sxj0) this.b).d = wfz.z;
    }

    @Override // defpackage.pfi0
    public boolean e(omk omkVar, omk omkVar2, ViewGroup viewGroup, com.yandex.div.core.state.b bVar) {
        return false;
    }

    @Override // defpackage.pfi0
    public boolean f() {
        return false;
    }

    public v5c0 g() {
        if (((zzco) this.b) != null) {
            return new v5c0(this);
        }
        ny61.g("Product list must be set to a non empty list.");
        return null;
    }

    public void h() {
        ((mlm0) this.b).f.a.clear();
        i630 i630Var = ((mlm0) this.b).d;
        synchronized (i630Var) {
            try {
                if (i630Var.b) {
                    i630Var.d();
                }
                boolean z = false;
                for (Region region : i630Var.e()) {
                    RegionMonitoringState j = i630Var.j(region);
                    if (j.f()) {
                        Callback a = j.a();
                        Context context = (Context) i630Var.e;
                        boolean b = j.b();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("region", region);
                        bundle.putBoolean("inside", b);
                        a.getClass();
                        Callback.a(context, bundle, "monitoringData");
                        z = true;
                    }
                }
                if (z) {
                    i630Var.g();
                } else {
                    ((Context) i630Var.e).getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").setLastModified(System.currentTimeMillis());
                }
            } finally {
            }
        }
        mlm0 mlm0Var = (mlm0) this.b;
        synchronized (mlm0Var.e) {
            try {
                for (Region region2 : mlm0Var.e.keySet()) {
                    RangeState rangeState = (RangeState) mlm0Var.e.get(region2);
                    Callback c = rangeState.c();
                    Context context2 = mlm0Var.i;
                    Bundle r = new o8g0((Collection) rangeState.b(), region2).r();
                    c.getClass();
                    Callback.a(context2, r, "rangingData");
                }
            } finally {
            }
        }
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        egm0 egm0Var = (egm0) this.b;
        CountDownTimer countDownTimer = egm0Var.E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        egm0Var.E = null;
        egm0Var.y.m(ufm0.b);
    }

    @Override // defpackage.eo3
    public void j(Bucket bucket) {
        ((sxj0) this.b).b((RestrictionsBucket) bucket);
    }

    @Override // defpackage.eo3
    public void k() {
        ((sxj0) this.b).a(2, "");
    }

    public ArrayList l(Image image, int i) {
        String m;
        wkt wktVar = (wkt) this.b;
        SizeF c = c7b1.c(image, i);
        xzv c2 = xzv.c(image, i, null);
        i3a1 i3a1Var = (i3a1) ((sv4) wktVar.a.getValue());
        List<fv4> list = (List) udq0.f(i3a1Var.c(c2).p(new egz(i3a1Var, c2.d, c2.e)));
        ArrayList arrayList = new ArrayList();
        for (fv4 fv4Var : list) {
            if (fv4Var != null && (m = fv4Var.a.m()) != null) {
                Uri parse = Uri.parse(m);
                Rect rect = fv4Var.b;
                if (rect != null) {
                    arrayList.add(new fgg0(parse, rect, c.getWidth(), c.getHeight()));
                }
            }
        }
        return arrayList;
    }

    public void m(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            ny61.g("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jjg0 jjg0Var = (jjg0) it.next();
            if (!"play_pass_subs".equals(jjg0Var.b)) {
                hashSet.add(jjg0Var.b);
            }
        }
        if (hashSet.size() <= 1) {
            this.b = zzco.m(arrayList);
        } else {
            ny61.g("All products should be of the same product type.");
        }
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        y4a0 y4a0Var = (y4a0) this.b;
        if (((c6f0) y4a0Var.c) == null) {
            return;
        }
        String str = x920Var.a;
        Object obj = x920Var.b;
        str.getClass();
        if (str.equals("ProcessText.processTextAction")) {
            try {
                ArrayList arrayList = (ArrayList) obj;
                ((c6f0) y4a0Var.c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (ba20) da20Var);
                return;
            } catch (IllegalStateException e) {
                ((ba20) da20Var).error("error", e.getMessage(), null);
                return;
            }
        }
        if (!str.equals("ProcessText.queryTextActions")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        try {
            ((ba20) da20Var).success(((c6f0) y4a0Var.c).b());
        } catch (IllegalStateException e2) {
            ((ba20) da20Var).error("error", e2.getMessage(), null);
        }
    }

    @Override // defpackage.bdl0
    public void onStopsUpdated(ecl0 ecl0Var, boolean z) {
        mdl0 mdl0Var;
        idl0 idl0Var = (idl0) this.b;
        ((adl0) idl0Var.Dg()).onStopsUpdated(ecl0Var, false);
        if (z || (mdl0Var = idl0Var.J) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) mdl0Var.z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zfu0) it.next()).a(arrayList2);
        }
        idl0Var.E.g(arrayList2);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        ((egm0) this.b).a0(bvu0.m(10, ((rim0) obj).a));
    }

    @Override // defpackage.wuy0
    public void onSurfaceAvailable() {
    }

    @Override // defpackage.wuy0
    public void onSurfaceCleanup() {
        znw0 znw0Var = (znw0) this.b;
        znw0Var.d();
        znw0Var.k.b(null);
    }

    @Override // defpackage.hwe
    public void q0() {
    }

    @Override // defpackage.hwe
    public String r0() {
        return ((avj0) ((dfj0) this.b).e).h(kyh0.common_done);
    }

    public /* synthetic */ aye0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public aye0(a8b0 a8b0Var) {
        this.a = 3;
        this.b = new ey4(new acu(a8b0Var.a, 16), 19);
    }
}
