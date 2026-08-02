package xsna;

import android.graphics.Point;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mjz0 extends b920 {
    public static kiw q(ArrayList arrayList, int i, int i2) {
        int i3;
        kiw kiwVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (i2 == 0 || i == 0) {
            gu8.c(null, "InterstitialAdResultProcessor: Display size is zero");
            return null;
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        Iterator it = arrayList.iterator();
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            kiw kiwVar2 = (kiw) it.next();
            int i4 = kiwVar2.b;
            if (i4 > 0 && (i3 = kiwVar2.c) > 0) {
                float f5 = i4;
                float f6 = i3;
                float f7 = f5 / f6;
                if (f3 < f7) {
                    if (f5 > f) {
                        f5 = f;
                    }
                    f6 = f5 / f7;
                } else {
                    if (f6 > f2) {
                        f6 = f2;
                    }
                    f5 = f6 * f7;
                }
                float f8 = f5 * f6;
                if (f8 <= f4) {
                    break;
                }
                kiwVar = kiwVar2;
                f4 = f8;
            }
        }
        return kiwVar;
    }

    public static oiz0 r(List list) {
        oiz0 oiz0Var = (oiz0) list.get(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oiz0 oiz0Var2 = (oiz0) it.next();
            if (oiz0Var2.h < oiz0Var.h) {
                oiz0Var = oiz0Var2;
            }
        }
        return oiz0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d8, code lost:
    
        if (r4.d == null) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(ArrayList arrayList) {
        kiw kiwVar;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((hkz0) it.next()) instanceof tez0) {
                i++;
            }
        }
        if (i > 0) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    hkz0 hkz0Var = (hkz0) it2.next();
                    if (hkz0Var instanceof tez0) {
                        ArrayList arrayList2 = new ArrayList();
                        i2++;
                        tez0 tez0Var = (tez0) hkz0Var;
                        lgz0 lgz0Var = tez0Var.c0;
                        if (lgz0Var != null) {
                            kiw kiwVar2 = lgz0Var.Z;
                            if (kiwVar2 != null) {
                                arrayList2.add(kiwVar2);
                            }
                            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
                            if (sgz0Var != null && sgz0Var.e) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(new wdz0(sgz0Var, giy0.d));
                                new vjz0(arrayList3).a();
                                if (sgz0Var.d == null && tez0Var.h0) {
                                    break;
                                }
                            }
                        }
                        kiw kiwVar3 = tez0Var.t;
                        if (kiwVar3 != null) {
                            arrayList2.add(kiwVar3);
                        }
                        kiw kiwVar4 = tez0Var.u;
                        if (kiwVar4 != null) {
                            arrayList2.add(kiwVar4);
                        }
                        kiw kiwVar5 = tez0Var.U;
                        if (kiwVar5 != null) {
                            arrayList2.add(kiwVar5);
                        }
                        kiw kiwVar6 = tez0Var.e0;
                        if (kiwVar6 != null) {
                            arrayList2.add(kiwVar6);
                        }
                        wty0 wty0Var = tez0Var.L;
                        if (wty0Var != null) {
                            arrayList2.add(wty0Var.a);
                        }
                        kiw kiwVar7 = tez0Var.a0.k;
                        if (kiwVar7 != null) {
                            arrayList2.add(kiwVar7);
                        }
                        ArrayList arrayList4 = tez0Var.b0;
                        if (!arrayList4.isEmpty()) {
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                kiw kiwVar8 = ((wfy0) it3.next()).t;
                                if (kiwVar8 != null) {
                                    arrayList2.add(kiwVar8);
                                }
                            }
                        }
                        hkz0 hkz0Var2 = tez0Var.d0;
                        if (hkz0Var2 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(hkz0Var2);
                            if (!s(arrayList5)) {
                                tez0Var.d0 = null;
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            o2z0.a(arrayList2).g();
                        }
                    }
                } else if (i2 != 0) {
                }
            }
            return false;
        }
        hkz0 hkz0Var3 = (hkz0) arrayList.get(0);
        if (hkz0Var3 instanceof p0z0) {
            p0z0 p0z0Var = (p0z0) hkz0Var3;
            ArrayList arrayList6 = new ArrayList();
            idy0 idy0Var = xr50.c;
            if (idy0Var != null) {
                Point q = c1z0.q(idy0Var.a);
                p0z0Var.getClass();
                kiw q2 = q(new ArrayList(p0z0Var.a0), Math.min(q.x, q.y), Math.max(q.x, q.y));
                if (q2 != null) {
                    arrayList6.add(q2);
                    p0z0Var.c0 = q2;
                }
                kiw q3 = q(new ArrayList(p0z0Var.b0), Math.max(q.x, q.y), Math.min(q.x, q.y));
                if (q3 != null) {
                    arrayList6.add(q3);
                    p0z0Var.d0 = q3;
                }
                if ((q2 != null || q3 != null) && (kiwVar = p0z0Var.U) != null) {
                    arrayList6.add(kiwVar);
                }
                wty0 wty0Var2 = p0z0Var.L;
                if (wty0Var2 != null) {
                    arrayList6.add(wty0Var2.a);
                }
                if (!arrayList6.isEmpty()) {
                    o2z0.a(arrayList6).g();
                    if ((q2 == null || q2.a() == null) && (q3 == null || q3.a() == null)) {
                        break;
                    }
                    return true;
                }
            }
            return false;
        }
        if (hkz0Var3 instanceof nxy0) {
            nxy0 nxy0Var = (nxy0) hkz0Var3;
            ArrayList arrayList7 = new ArrayList();
            wty0 wty0Var3 = nxy0Var.L;
            if (wty0Var3 != null) {
                arrayList7.add(wty0Var3.a);
            }
            kiw kiwVar9 = nxy0Var.U;
            if (kiwVar9 != null) {
                arrayList7.add(kiwVar9);
            }
            o2z0.a(arrayList7).g();
            return true;
        }
        if (hkz0Var3 instanceof s4z0) {
            s4z0 s4z0Var = (s4z0) hkz0Var3;
            tdz0 tdz0Var = s4z0Var.d0;
            haz0 haz0Var = s4z0Var.b0;
            if (tdz0Var != null) {
                ArrayList arrayList8 = new ArrayList();
                sgz0 sgz0Var2 = tdz0Var.g;
                if (sgz0Var2 != null) {
                    arrayList8.add(tdz0Var.f);
                    if (sgz0Var2.e) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(new wdz0(sgz0Var2, giy0.d));
                        new vjz0(arrayList9).a();
                    }
                    arrayList8.add(tdz0Var.d);
                }
                arrayList8.add(haz0Var.d);
                o2z0.a(arrayList8).g();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean t(e5z0 e5z0Var) {
        List list = e5z0Var.c(1).c;
        if (!list.isEmpty()) {
            r(list).d = true;
            return true;
        }
        List list2 = e5z0Var.c(2).c;
        if (!list2.isEmpty()) {
            r(list2).d = true;
            return true;
        }
        List list3 = e5z0Var.j("show").c;
        if (!list3.isEmpty()) {
            ((z1z0) list3.get(0)).d = true;
            return true;
        }
        List list4 = e5z0Var.j("playbackStarted").c;
        if (list4.isEmpty()) {
            return false;
        }
        ((z1z0) list4.get(0)).d = true;
        return true;
    }

    @Override // xsna.b920
    public final njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar) {
        lgz0 lgz0Var;
        ikz0 ikz0Var = (ikz0) njz0Var;
        ArrayList arrayList = ikz0Var.b;
        if (arrayList.isEmpty()) {
            wcy0 wcy0Var = ikz0Var.a;
            if (wcy0Var == null || wcy0Var.a.isEmpty()) {
                xlaVar.b(iaz0.r);
                return null;
            }
        } else {
            if (!s(arrayList)) {
                xlaVar.b(iaz0.s);
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hkz0 hkz0Var = (hkz0) it.next();
                e5z0 e5z0Var = hkz0Var.a;
                if (!e5z0Var.k && t(e5z0Var)) {
                    break;
                }
                if ((hkz0Var instanceof tez0) && (lgz0Var = ((tez0) hkz0Var).c0) != null) {
                    e5z0 e5z0Var2 = lgz0Var.a;
                    if (!e5z0Var2.k && t(e5z0Var2)) {
                        break;
                    }
                }
                if (hkz0Var instanceof s4z0) {
                    s4z0 s4z0Var = (s4z0) hkz0Var;
                    tdz0 tdz0Var = s4z0Var.d0;
                    if (tdz0Var != null) {
                        e5z0 e5z0Var3 = (e5z0) tdz0Var.b;
                        if (!e5z0Var3.k && t(e5z0Var3)) {
                            break;
                        }
                    }
                    e5z0 e5z0Var4 = (e5z0) s4z0Var.a0.b;
                    if (!e5z0Var4.k && t(e5z0Var4)) {
                        break;
                    }
                    e5z0 e5z0Var5 = (e5z0) s4z0Var.b0.b;
                    if (!e5z0Var5.k && t(e5z0Var5)) {
                        break;
                    }
                }
            }
        }
        return ikz0Var;
    }
}
