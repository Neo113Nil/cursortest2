package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.impl.factory.e;
import java.util.Objects;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class gaf0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gaf0(tdj0 tdj0Var, int i) {
        this.a = 1;
        this.c = tdj0Var;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                e eVar = (e) obj3;
                eaf0 eaf0Var = (eaf0) obj;
                eaf0 eaf0Var2 = (eaf0) obj2;
                eVar.getClass();
                if (i2 == 0) {
                    z = jl40.l(eaf0Var, eaf0Var2);
                } else {
                    Address address = eaf0Var.b;
                    zzs zzsVar = eaf0Var.a;
                    if (jl40.l(address.getZoneName(), eaf0Var2.b.getZoneName())) {
                        if (!eaf0Var.equals(eaf0Var2)) {
                            if (a.j(zzsVar, eaf0Var2.a) < i2) {
                                hst hstVar = jst.e;
                                Objects.toString(zzsVar);
                                hstVar.getClass();
                                eVar.d.a.l(zzsVar);
                            }
                        }
                    }
                    z = false;
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                jla1.d((tdj0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                nwa1.d((iwl0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                wza1.g((spm0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                pao0.f((yao0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                g2p0.e((l2p0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                r6b1.a((aif0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                ndb1.d((vls0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                wdb1.e((oss0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ru.yandex.taxi.masstransit.ui.a.h((nvi0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                r4z0.c((s37) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                r4z0.a((kd3) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                r4z0.g((kqf0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                r4z0.k((n4z0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                r4z0.e((ef70) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                r4z0.i((ugg0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                r4z0.j((nox0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gaf0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
