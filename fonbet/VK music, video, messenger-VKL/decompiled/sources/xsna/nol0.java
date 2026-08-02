package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.tlo0;
import xsna.wfq0;
import xsna.zol0;

/* compiled from: StorefrontServicesStateMapper.kt */
/* loaded from: classes18.dex */
public final class nol0 implements izs<mol0, zol0> {
    public final bpn0 b = new bpn0(new h13(24));

    public static ir1 d(gr1 gr1Var) {
        boolean z;
        ImageSize Fb;
        List<goi0> list = gr1Var.a;
        List<goi0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (goi0 goi0Var : list2) {
            int i = goi0Var.a;
            String str = goi0Var.c;
            Photo photo = goi0Var.d;
            arrayList.add(new foi0(i, str, (photo == null || (Fb = photo.Fb(176, true)) == null) ? null : Fb.d.d));
        }
        int i2 = gr1Var.b;
        boolean z2 = gr1Var.c;
        boolean z3 = true;
        boolean z4 = !z2;
        if (i2 > gr1Var.d) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z2 || list.size() >= gr1Var.b) {
            z = false;
        }
        return new ir1(arrayList, z4, i2, z3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004f  */
    @Override // xsna.izs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zol0 invoke(mol0 mol0Var) {
        ir1 ir1Var;
        zol0.a.d dVar;
        zol0.a c4188a;
        ir1 ir1Var2;
        tlo0 tlo0Var;
        tlo0 tlo0Var2;
        String str;
        String str2;
        LinkedHashMap linkedHashMap;
        ogr ogrVar;
        String str3;
        List<fsi0> list;
        ggr ggrVar = mol0Var.g;
        wyh0 wyh0Var = mol0Var.f;
        gr1 gr1Var = mol0Var.d;
        lsi0 lsi0Var = mol0Var.e;
        StorefrontServicesArgs storefrontServicesArgs = mol0Var.b;
        LoadingState loadingState = mol0Var.h;
        if (loadingState == LoadingState.Full) {
            c4188a = storefrontServicesArgs.f ? zol0.a.c.C4189a.a : storefrontServicesArgs.d != null ? zol0.a.c.C4190c.a : wyh0Var != null ? zol0.a.c.b.a : zol0.a.c.d.a;
        } else {
            if (loadingState == LoadingState.Page) {
                if (gr1Var != null) {
                    if (gr1Var.a.isEmpty() || wyh0Var != null) {
                        gr1Var = null;
                    }
                    if (gr1Var != null) {
                        ir1Var2 = d(gr1Var);
                        dVar = new zol0.a.d(ir1Var2, wyh0Var == null ? e(wyh0Var) : lsi0Var != null ? g(lsi0Var, storefrontServicesArgs.e) : null, loadingState, mol0Var.j());
                    }
                }
                ir1Var2 = null;
                dVar = new zol0.a.d(ir1Var2, wyh0Var == null ? e(wyh0Var) : lsi0Var != null ? g(lsi0Var, storefrontServicesArgs.e) : null, loadingState, mol0Var.j());
            } else if (loadingState == LoadingState.Error) {
                c4188a = zol0.a.b.a;
            } else if (lsi0Var != null && lsi0Var.b.isEmpty() && storefrontServicesArgs.c != null) {
                c4188a = new zol0.a.C4188a(PlaceholderState.Album, mol0Var.j());
            } else if (gr1Var != null && gr1Var.a.isEmpty() && gr1Var.c) {
                c4188a = new zol0.a.C4188a(PlaceholderState.Albums, mol0Var.j());
            } else if (lsi0Var != null && lsi0Var.b.isEmpty() && storefrontServicesArgs.d != null) {
                c4188a = new zol0.a.C4188a(PlaceholderState.Section, mol0Var.j(), loadingState);
            } else if (wyh0Var != null && wyh0Var.a.isEmpty()) {
                c4188a = new zol0.a.C4188a(PlaceholderState.Search, mol0Var.j());
            } else if (lsi0Var == null || !lsi0Var.b.isEmpty() || gr1Var == null || !gr1Var.a.isEmpty()) {
                if (gr1Var != null) {
                    if (gr1Var.a.isEmpty() || wyh0Var != null) {
                        gr1Var = null;
                    }
                    if (gr1Var != null) {
                        ir1Var = d(gr1Var);
                        dVar = new zol0.a.d(ir1Var, wyh0Var == null ? e(wyh0Var) : lsi0Var != null ? g(lsi0Var, storefrontServicesArgs.e) : null, loadingState, mol0Var.j());
                    }
                }
                ir1Var = null;
                dVar = new zol0.a.d(ir1Var, wyh0Var == null ? e(wyh0Var) : lsi0Var != null ? g(lsi0Var, storefrontServicesArgs.e) : null, loadingState, mol0Var.j());
            } else {
                c4188a = new zol0.a.C4188a(PlaceholderState.Services, mol0Var.j());
            }
            c4188a = dVar;
        }
        boolean j = mol0Var.j();
        boolean z = !storefrontServicesArgs.f;
        Integer num = mol0Var.c.b;
        boolean z2 = num != null;
        int intValue = num != null ? num.intValue() : 0;
        String str4 = ggrVar.e;
        String str5 = storefrontServicesArgs.e;
        if (str5 != null) {
            tlo0Var2 = oq.d(tlo0.Companion, str5);
        } else if (storefrontServicesArgs.f) {
            tlo0Var2 = tq.h(tlo0.Companion, R.string.community_market_albums_count);
        } else {
            if (storefrontServicesArgs.d == null) {
                tlo0Var = null;
                if (ggrVar.a) {
                    str3 = str4;
                    ogrVar = null;
                } else {
                    ServicesSort servicesSort = ggrVar.b;
                    tlo0.a aVar = tlo0.Companion;
                    String str6 = ggrVar.g;
                    if (str6 == null) {
                        str6 = "₽";
                    }
                    aVar.getClass();
                    tlo0.g c = tlo0.a.c(R.string.storefront_services_title_price, str6);
                    Integer num2 = ggrVar.c;
                    Integer num3 = ggrVar.d;
                    String str7 = ggrVar.f;
                    if (lsi0Var != null && (list = lsi0Var.c) != null) {
                        if (list.size() <= 1) {
                            list = null;
                        }
                        if (list != null) {
                            List<fsi0> list2 = list;
                            int e = on00.e(c5g.u(list2, 10));
                            if (e < 16) {
                                e = 16;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                            for (fsi0 fsi0Var : list2) {
                                String str8 = str4;
                                Pair pair = new Pair(fsi0Var.a, fsi0Var.b);
                                linkedHashMap2.put(pair.i(), pair.j());
                                str4 = str8;
                            }
                            str2 = str4;
                            linkedHashMap = linkedHashMap2;
                            ogrVar = new ogr(servicesSort, c, num2, num3, str7, linkedHashMap);
                            str3 = str2;
                        }
                    }
                    str2 = str4;
                    linkedHashMap = null;
                    ogrVar = new ogr(servicesSort, c, num2, num3, str7, linkedHashMap);
                    str3 = str2;
                }
                return new zol0(new zol0.b(new sol0(j, z, z2, intValue, str3, tlo0Var, ogrVar)), c4188a);
            }
            if (lsi0Var == null || (str = lsi0Var.e) == null) {
                tlo0.Companion.getClass();
                tlo0Var2 = tlo0.c.a;
            } else {
                tlo0Var2 = oq.d(tlo0.Companion, str);
            }
        }
        tlo0Var = tlo0Var2;
        if (ggrVar.a) {
        }
        return new zol0(new zol0.b(new sol0(j, z, z2, intValue, str3, tlo0Var, ogrVar)), c4188a);
    }

    public final MarketProductTileConfig c(uoi0 uoi0Var) {
        kc10 kc10Var = (kc10) this.b.getValue();
        boolean h = uoi0Var.r.h();
        wfq0.e eVar = wfq0.e.a;
        kc10Var.getClass();
        return kc10.a(uoi0Var, h, eVar);
    }

    public final nsi0 e(wyh0 wyh0Var) {
        Map<Long, uoi0> map = wyh0Var.a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Long, uoi0>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            uoi0 value = it.next().getValue();
            arrayList.add(new zni0(value.i, c(value)));
        }
        return new nsi0(Collections.singletonList(new esi0("NOTUSEDID", null, false, arrayList)), wyh0Var.b, wyh0Var.c);
    }

    public final nsi0 g(lsi0 lsi0Var, String str) {
        List<fsi0> list = lsi0Var.c;
        boolean z = lsi0Var.d;
        int i = lsi0Var.a;
        List<fsi0> list2 = lsi0Var.c;
        Map<Long, uoi0> map = lsi0Var.b;
        if (list == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<Long, uoi0>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                uoi0 value = it.next().getValue();
                arrayList.add(new zni0(value.i, c(value)));
            }
            return new nsi0(Collections.singletonList(new esi0("NOTUSEDID", null, false, arrayList)), (list2 != null ? list2.size() : map.size()) < i, z);
        }
        List<fsi0> list3 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        for (fsi0 fsi0Var : list3) {
            ArrayList arrayList3 = fsi0Var.d;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                uoi0 uoi0Var = map.get(Long.valueOf(((Number) it2.next()).longValue()));
                if (uoi0Var != null) {
                    arrayList4.add(uoi0Var);
                }
            }
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                uoi0 uoi0Var2 = (uoi0) it3.next();
                arrayList5.add(new zni0(uoi0Var2.i, c(uoi0Var2)));
            }
            boolean z2 = fsi0Var.c > fsi0Var.d.size();
            String str2 = fsi0Var.a;
            String str3 = fsi0Var.b;
            if (str != null) {
                str3 = null;
            }
            arrayList2.add(new esi0(str2, str3, z2, arrayList5));
        }
        return new nsi0(arrayList2, (list2 != null ? list2.size() : map.size()) < i, z);
    }
}
