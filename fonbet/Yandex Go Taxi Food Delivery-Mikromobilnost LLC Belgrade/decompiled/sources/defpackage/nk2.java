package defpackage;

import androidx.compose.ui.layout.o;
import com.yandex.go.chargers.subscription.a;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;

/* loaded from: classes10.dex */
public final /* synthetic */ class nk2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ nk2(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        zy11 zy11Var = zy11.a;
        ArrayList<Pair> arrayList = this.b;
        switch (i) {
            case 0:
                o.a aVar = (o.a) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    o.a.o(aVar, (o) arrayList.get(i4), 0, 0);
                }
                break;
            case 1:
                o.a aVar2 = (o.a) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o.a.o(aVar2, (o) it.next(), 0, 0);
                }
                break;
            case 2:
                qz3 qz3Var = (qz3) obj;
                break;
            case 3:
                a aVar3 = ((zua) obj).a;
                aVar3.A((m950) aVar3.I.get(), new jua(arrayList), new ava(aVar3));
                break;
            case 4:
                FoldersBucket.OrganizationFoldersData organizationFoldersData = (FoldersBucket.OrganizationFoldersData) obj;
                Iterable iterable = organizationFoldersData.customFolders;
                if (iterable == null) {
                    iterable = EmptyList.a;
                }
                Iterable iterable2 = iterable;
                int d = gw00.d(tcc.n(iterable2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj2 : iterable2) {
                    linkedHashMap.put(((FoldersBucket.FolderData) obj2).id, obj2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    FoldersBucket.FolderData folderData = (FoldersBucket.FolderData) linkedHashMap.get((String) it2.next());
                    if (folderData != null) {
                        arrayList2.add(folderData);
                    }
                }
                organizationFoldersData.customFolders = arrayList2;
                break;
            case 5:
                o.a aVar4 = (o.a) obj;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    aVar4.g((o) it3.next(), 0, 0, 0.0f);
                }
                break;
            case 6:
                ((ListYandexPlayerManager) obj).updateVisibleItemsList(arrayList);
                break;
            case 7:
                ((li6) obj).c(arrayList);
                break;
            case 8:
                o.a aVar5 = (o.a) obj;
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    da10 da10Var = (da10) arrayList.get(i5);
                    List list = da10Var.b;
                    boolean z = da10Var.g;
                    if (da10Var.k == Integer.MIN_VALUE) {
                        lxv.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i6 = i3;
                    while (i6 < size3) {
                        o oVar = (o) list.get(i6);
                        long c = z5w.c((r13[r14 + i2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (da10Var.i[i6 * 2] << 32), da10Var.c);
                        if (z) {
                            o.a.y(aVar5, oVar, c);
                        } else {
                            o.a.u(aVar5, oVar, c);
                        }
                        i6++;
                        i2 = 1;
                    }
                    i5++;
                    i2 = 1;
                    i3 = 0;
                }
                break;
            case 9:
                o.a aVar6 = (o.a) obj;
                int size4 = arrayList.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    aVar6.g((o) arrayList.get(i7), 0, 0, 0.0f);
                }
                break;
            case 10:
                o.a aVar7 = (o.a) obj;
                for (Pair pair : arrayList) {
                    o oVar2 = (o) pair.getFirst();
                    lce0 lce0Var = (lce0) pair.getSecond();
                    o.a.o(aVar7, oVar2, lce0Var.a, lce0Var.b);
                }
                break;
            case 11:
                ((vew0) obj).k0(arrayList);
                break;
            case 12:
                j1l0 j1l0Var = (j1l0) obj;
                k1l0 k1l0Var = j1l0Var.a;
                final y0l0 y0l0Var = k1l0Var.F;
                final o2y0 o2y0Var = j1l0Var.b;
                y0l0Var.getClass();
                ArrayList arrayList3 = this.b;
                if (!arrayList3.isEmpty()) {
                    final d0l0 d0l0Var = new d0l0(o2y0Var.b().t().a, arrayList3, 4);
                    o2y0Var.b().Q(d0l0Var);
                    ci70 ci70Var = y0l0Var.f;
                    String str = o2y0Var.b().a;
                    RouteChangeType routeChangeType = RouteChangeType.CHANGE_DESTINATIONS;
                    ci70Var.a(str, routeChangeType);
                    if (y0l0Var.g.d().b) {
                        y0l0Var.h.a(new f0f0(o2y0Var, arrayList3, routeChangeType, new Runnable() { // from class: s0l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i8 = i2;
                                d0l0 d0l0Var2 = d0l0Var;
                                o2y0 o2y0Var2 = o2y0Var;
                                y0l0 y0l0Var2 = y0l0Var;
                                switch (i8) {
                                    case 0:
                                        y0l0Var2.d(o2y0Var2, d0l0Var2, RouteChangeType.CHANGE_DESTINATIONS, true);
                                        break;
                                    default:
                                        y0l0Var2.d(o2y0Var2, d0l0Var2, RouteChangeType.CHANGE_DESTINATIONS, false);
                                        break;
                                }
                            }
                        }, new Runnable() { // from class: s0l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i8 = i3;
                                d0l0 d0l0Var2 = d0l0Var;
                                o2y0 o2y0Var2 = o2y0Var;
                                y0l0 y0l0Var2 = y0l0Var;
                                switch (i8) {
                                    case 0:
                                        y0l0Var2.d(o2y0Var2, d0l0Var2, RouteChangeType.CHANGE_DESTINATIONS, true);
                                        break;
                                    default:
                                        y0l0Var2.d(o2y0Var2, d0l0Var2, RouteChangeType.CHANGE_DESTINATIONS, false);
                                        break;
                                }
                            }
                        }));
                    } else {
                        y0l0Var.d(o2y0Var, d0l0Var, routeChangeType, true);
                    }
                }
                k1l0Var.r(new qu(9));
                break;
            default:
                ((o.a) obj).g((o) kotlin.collections.a.P(arrayList), 0, 0, 0.0f);
                break;
        }
        return zy11Var;
    }
}
