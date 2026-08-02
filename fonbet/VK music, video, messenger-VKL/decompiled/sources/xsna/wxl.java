package xsna;

import android.graphics.Bitmap;
import android.location.Location;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointsMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dcr;
import xsna.hyl;
import xsna.pk00;
import xsna.qxl;

/* compiled from: DeliveryPointsMapReducer.kt */
/* loaded from: classes18.dex */
public final class wxl extends dm50<kyl, qxl, hyl> {
    public final fwl d;
    public final wyl e;
    public final xyl f;
    public final fl00 g;
    public final qk00 h;
    public final bpn0 i;

    public wxl(hyl hylVar) {
        super(hylVar);
        fwl fwlVar = new fwl();
        this.d = fwlVar;
        this.e = new wyl(fwlVar);
        this.f = new xyl();
        this.g = new fl00();
        this.h = new qk00(0);
        this.i = new bpn0(new mg(8));
    }

    @Override // xsna.dm50
    public final hyl c(hyl hylVar, qxl qxlVar) {
        boolean z;
        hyl hylVar2 = hylVar;
        qxl qxlVar2 = qxlVar;
        hgr hgrVar = hylVar2.h;
        hyl.b bVar = hylVar2.d;
        if (qxlVar2 instanceof qxl.f) {
            qxl.f fVar = (qxl.f) qxlVar2;
            if (fVar instanceof qxl.f.d) {
                return hyl.a(hylVar2, hyl.b.a(bVar, null, null, null, true, null, 47), null, null, false, null, false, 251);
            }
            if (!(fVar instanceof qxl.f.c)) {
                if (fVar instanceof qxl.f.a) {
                    return hyl.a(hylVar2, hyl.b.a(bVar, null, null, null, false, null, 55), null, null, false, null, false, 251);
                }
                if (fVar instanceof qxl.f.b) {
                    return hyl.a(hylVar2, hyl.b.a(bVar, null, null, null, false, ((qxl.f.b) fVar).b, 15), null, null, false, null, false, 251);
                }
                throw new NoWhenBranchMatchedException();
            }
            hyl.a aVar = hylVar2.b;
            hyl.a aVar2 = new hyl.a(aVar.a, aVar.b, aVar.c, aVar.d);
            hyl.b a = hyl.b.a(bVar, null, null, bVar.c, true, null, 43);
            DeliveryPointsMode deliveryPointsMode = hylVar2.c;
            DeliveryPoint deliveryPoint = hylVar2.f;
            return new hyl(aVar2, deliveryPointsMode, a, deliveryPoint, deliveryPoint != null, 200);
        }
        if (qxlVar2 instanceof qxl.i) {
            qxl.i iVar = (qxl.i) qxlVar2;
            if (iVar instanceof qxl.i.c) {
                return hyl.a(hylVar2, hyl.b.a(bVar, tj00.a(bVar.a, null, ((qxl.i.c) iVar).b, 13), null, null, false, null, 62), null, null, false, null, false, 251);
            }
            if (iVar instanceof qxl.i.b) {
                return hyl.a(hylVar2, hyl.b.a(bVar, null, null, null, true, null, 47), null, null, false, null, true, 123);
            }
            if (iVar instanceof qxl.i.a) {
                return hyl.a(hylVar2, hyl.b.a(bVar, tj00.a(bVar.a, null, false, 13), null, null, false, null, 46), null, null, false, null, false, 123);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (qxlVar2 instanceof qxl.c) {
            ((qxl.c) qxlVar2).getClass();
            return hyl.a(hylVar2, hyl.b.a(bVar, tj00.a(bVar.a, null, false, 13), null, null, bVar.a.b() ? false : bVar.e, null, 46), null, null, false, null, false, 123);
        }
        boolean z2 = qxlVar2 instanceof qxl.e;
        bpn0 bpn0Var = this.i;
        qk00 qk00Var = this.h;
        if (z2) {
            qxl.e eVar = (qxl.e) qxlVar2;
            if (eVar instanceof qxl.e.a) {
                qxl.e.a aVar3 = (qxl.e.a) eVar;
                return hyl.a(hylVar2, hyl.b.a(hylVar2.d, qk00Var.a(bVar.a, new pk00.b(aVar3.b, aVar3.c)), null, null, false, null, 46), null, null, false, null, false, 251);
            }
            if (eVar instanceof qxl.e.b) {
                hyl.b a2 = hyl.b.a(hylVar2.d, qk00Var.a(bVar.a, pk00.c.a), null, null, false, null, 62);
                hyl.c cVar = hylVar2.e;
                return hyl.a(hylVar2, a2, hyl.c.a(cVar, EmptyList.b, 0, null, ((double) cVar.b) >= 25000.0d ? cVar.d : true, 2), null, false, null, false, 243);
            }
            if (!(eVar instanceof qxl.e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            qxl.e.c cVar2 = (qxl.e.c) eVar;
            hyl.b a3 = hyl.b.a(hylVar2.d, qk00Var.a(bVar.a, new pk00.a(cVar2.b)), null, null, false, null, 62);
            DeliveryPoint deliveryPoint2 = hylVar2.g ? hylVar2.f : null;
            hyl.c cVar3 = hylVar2.e;
            alt altVar = (alt) bpn0Var.getValue();
            v0w0 v0w0Var = cVar2.c;
            altVar.getClass();
            float[] fArr = new float[3];
            Location.distanceBetween(v0w0Var.a().a, v0w0Var.a().b, v0w0Var.c().a, v0w0Var.c().b, fArr);
            int b = an10.b(fArr[0]);
            double d = v0w0Var.b().a;
            double d2 = v0w0Var.b().b;
            double d3 = v0w0Var.b.a;
            double d4 = v0w0Var.c().b;
            float[] fArr2 = new float[3];
            Location.distanceBetween(d, d2, d3, d4, fArr2);
            return hyl.a(hylVar2, a3, hyl.c.a(cVar3, null, Math.max(b, an10.b(fArr2[0])) / 2, null, false, 13), deliveryPoint2, false, null, false, 195);
        }
        if (qxlVar2 instanceof qxl.d) {
            qxl.d dVar = (qxl.d) qxlVar2;
            Coordinates coordinates = dVar.b;
            Coordinates coordinates2 = bVar.b;
            if (coordinates2 != null) {
                ((alt) bpn0Var.getValue()).getClass();
                float[] fArr3 = new float[3];
                Location.distanceBetween(coordinates2.b, coordinates2.c, coordinates.b, coordinates.c, fArr3);
                if (an10.b(fArr3[0]) <= 4) {
                    return hylVar2;
                }
            }
            tj00 tj00Var = bVar.a;
            boolean z3 = bVar.e;
            boolean z4 = tj00Var.b;
            if (z4 || z3) {
                tj00Var = qk00Var.a(tj00Var, new pk00.b(new gk9(coordinates, z3 ? vm00.d : tj00Var.a.b), z4));
            }
            return hyl.a(hylVar2, hyl.b.a(hylVar2.d, tj00Var, dVar.b, null, false, null, 44), null, null, false, null, true, 123);
        }
        if (qxlVar2 instanceof qxl.a) {
            return hyl.a(hylVar2, null, hyl.c.a(hylVar2.e, EmptyList.b, 0, null, false, 2), null, false, null, false, 247);
        }
        if (!(qxlVar2 instanceof qxl.g)) {
            if (qxlVar2 instanceof qxl.j) {
                return hyl.a(hylVar2, null, null, bVar.c.get(((qxl.j) qxlVar2).b), true, null, false, 207);
            }
            if (qxlVar2 instanceof qxl.b) {
                return hyl.a(hylVar2, null, null, null, false, null, false, 207);
            }
            if (!(qxlVar2 instanceof qxl.h)) {
                if (!(qxlVar2 instanceof qxl.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<dcr> list = ((qxl.k) qxlVar2).b;
                hgrVar.getClass();
                return hyl.a(hylVar2, null, null, null, false, new hgr(true, list), false, 191);
            }
            List<dcr> list2 = hgrVar.b;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (Object obj : list2) {
                dcr.a aVar4 = obj instanceof dcr.a ? (dcr.a) obj : null;
                if (aVar4 != null) {
                    obj = dcr.a.b(aVar4, aVar4.c);
                }
                arrayList.add(obj);
            }
            return hyl.a(hylVar2, null, null, null, false, new hgr(false, arrayList), false, 191);
        }
        qxl.g gVar = (qxl.g) qxlVar2;
        if (gVar instanceof qxl.g.b) {
            return hyl.a(hylVar2, null, hyl.c.a(hylVar2.e, null, 0, null, true, 3), null, false, null, false, 247);
        }
        if (!(gVar instanceof qxl.g.c)) {
            if (gVar instanceof qxl.g.a) {
                return hyl.a(hylVar2, null, hyl.c.a(hylVar2.e, null, 0, ((qxl.g.a) gVar).b, false, 3), null, false, null, false, 247);
            }
            throw new NoWhenBranchMatchedException();
        }
        qxl.g.c cVar4 = (qxl.g.c) gVar;
        hyl.c a4 = hyl.c.a(hylVar2.e, j5g.O0(cVar4.b.values()), 0, null, false, 6);
        hyl.b a5 = hyl.b.a(hylVar2.d, null, null, cVar4.b, false, null, 59);
        List<dcr> list3 = cVar4.c;
        List<dcr> list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            for (dcr dcrVar : list4) {
                if (dcrVar instanceof dcr.a) {
                    dcr.a aVar5 = (dcr.a) dcrVar;
                    if (aVar5.b != aVar5.c) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        hgrVar.getClass();
        return hyl.a(hylVar2, a5, a4, null, false, new hgr(z, list3), false, 179);
    }

    @Override // xsna.dm50
    public final kyl d() {
        return new kyl(e(new eqd(this, 14)), e(new j6e(this, 16)), e(new jr3(11)));
    }

    @Override // xsna.dm50, xsna.cm50
    public final void destroy() {
        super.destroy();
        fwl fwlVar = this.d;
        synchronized (fwlVar.a) {
            try {
                Iterator it = fwlVar.b.entrySet().iterator();
                while (it.hasNext()) {
                    ((Bitmap) ((Map.Entry) it.next()).getValue()).recycle();
                }
                fwlVar.b.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.dm50
    public final void h(hyl hylVar, kyl kylVar) {
        hyl hylVar2 = hylVar;
        kyl kylVar2 = kylVar;
        f(kylVar2.c, hylVar2);
        if (hylVar2.d.f != null) {
            f(kylVar2.a, hylVar2);
        } else {
            f(kylVar2.b, hylVar2);
        }
    }
}
