package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveType;
import java.util.List;
import kotlin.Pair;
import xsna.bbt;
import xsna.dbt;
import xsna.ebt;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class arq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ arq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                aqw aqwVar = (aqw) this.d;
                Integer num = (Integer) this.e;
                FaveType faveType = (FaveType) this.f;
                pqq pqqVar = (pqq) this.g;
                iqq iqqVar = (iqq) obj;
                List<FaveItem> list = iqqVar.a;
                String str2 = iqqVar.d;
                return (!list.isEmpty() || str2 == null || str2.length() == 0 || str2.equals(str)) ? io.reactivex.rxjava3.core.x.k(iqqVar) : aqwVar.f(num, faveType, pqqVar, str2);
            default:
                final rha rhaVar = (rha) this.c;
                bbt.b bVar = (bbt.b) this.d;
                bbt.d dVar = (bbt.d) this.e;
                final xvy xvyVar = (xvy) this.f;
                final izs izsVar = (izs) this.g;
                nvy nvyVar = (nvy) obj;
                if (rhaVar.a) {
                    int i = 0;
                    int i2 = 0;
                    for (Object obj2 : bVar.b) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        final ebt ebtVar = (ebt) obj2;
                        final q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 == 0 ? 4 : i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        if (ebtVar.equals(ebt.b.a)) {
                            nvy.g(nvyVar, null, null, new jai(-719617394, new vvq(H, 2), true), 3);
                        } else if (ebtVar.equals(ebt.j.a)) {
                            nvy.g(nvyVar, null, null, chi.a, 3);
                        } else if (ebtVar.equals(ebt.g.a)) {
                            nvy.g(nvyVar, null, null, new jai(635743382, new yzs() { // from class: xsna.rk00
                                @Override // xsna.yzs
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(635743382, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:40)");
                                        }
                                        no50.a(q630.this, aVar, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 3);
                        } else if (ebtVar instanceof ebt.c) {
                            nvy.g(nvyVar, null, null, new jai(1785575669, new ouj(H, 1), true), 3);
                        } else if (ebtVar instanceof ebt.f) {
                            nvy.g(nvyVar, ((ebt.f) ebtVar).b, null, new jai(-1359559340, new yzs() { // from class: xsna.sk00
                                @Override // xsna.yzs
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1359559340, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:54)");
                                        }
                                        mo50.a(((ebt.f) ebtVar).a, rhaVar, izsVar, xvyVar, H, aVar, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 2);
                        } else if (ebtVar instanceof ebt.e) {
                            nvy.g(nvyVar, ((ebt.e) ebtVar).b, null, new jai(-209727053, new uq5(ebtVar, 3), true), 2);
                        } else if (ebtVar instanceof ebt.a) {
                            nvy.g(nvyVar, new Pair(Integer.valueOf(i2), ((ebt.a) ebtVar).b), null, new jai(940105234, new yzs() { // from class: xsna.tk00
                                @Override // xsna.yzs
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(940105234, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:72)");
                                        }
                                        e9t.c(((ebt.a) ebtVar).a, izsVar, rhaVar, xvyVar, H, aVar, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 2);
                        } else if (ebtVar instanceof ebt.i) {
                            nvy.g(nvyVar, new Pair(Integer.valueOf(i2), ((ebt.i) ebtVar).c), null, new jai(2089937521, new yzs() { // from class: xsna.uk00
                                @Override // xsna.yzs
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    ksy ksyVar = (ksy) obj3;
                                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= aVar.J(ksyVar) ? 4 : 2;
                                    }
                                    if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(2089937521, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:84)");
                                        }
                                        ebt.i iVar = (ebt.i) ebt.this;
                                        hgt.a(iVar.a, rhaVar, izsVar, xvyVar, s200.H(ksy.c(ksyVar, q630.a.a, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iVar.b ? 0 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 2);
                        } else if (ebtVar instanceof ebt.h) {
                            Pair pair = new Pair(Integer.valueOf(i2), ((ebt.h) ebtVar).c);
                            izs izsVar2 = izsVar;
                            rha rhaVar2 = rhaVar;
                            rhaVar = rhaVar2;
                            izsVar = izsVar2;
                            nvy.g(nvyVar, pair, null, new jai(-1055197488, new vk00(0, ebtVar, rhaVar2, xvyVar, izsVar2), true), 2);
                        } else if (ebtVar instanceof ebt.d) {
                            nvy.g(nvyVar, ((ebt.d) ebtVar).b, null, new jai(94634799, new yzs() { // from class: xsna.wk00
                                @Override // xsna.yzs
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(94634799, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:110)");
                                        }
                                        gft.a(((ebt.d) ebtVar).a, rhaVar, izsVar, xvyVar, H, aVar, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true), 2);
                        }
                        i2 = i3;
                        i = 0;
                    }
                } else {
                    List list2 = bVar.b;
                    wow wowVar = new wow(list2);
                    nvyVar.e(list2.size(), new dbt.a(new log(6), wowVar), new dbt.b(wowVar), new jai(2039820996, new dbt.c(wowVar, xvyVar, rhaVar, izsVar), true));
                }
                ybt.a(nvyVar, dVar.e, new gc0(izsVar, 4));
                return s3q0.a;
        }
    }
}
