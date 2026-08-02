package com.ybsdk.feature.partnerselection.internal.screens.partners.domain;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionDeeplink;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.partnerselection.api.SelectedPartnerCrossBorderData;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.utils.poller.b;
import com.ybsdk.utils.poller.c;
import defpackage.aj90;
import defpackage.ar51;
import defpackage.dms;
import defpackage.eh90;
import defpackage.gi90;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.mi90;
import defpackage.n1e0;
import defpackage.ny61;
import defpackage.p1e0;
import defpackage.pi90;
import defpackage.pzt0;
import defpackage.q1e0;
import defpackage.r8j0;
import defpackage.si90;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.ti90;
import defpackage.tje;
import defpackage.tls;
import defpackage.tv3;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wq51;
import defpackage.x4c;
import defpackage.xq51;
import defpackage.yq51;
import defpackage.zh90;
import defpackage.zq51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final l a;
    public final j3h b;
    public final zh90 c;
    public final mi90 d;
    public final tfl0 e;
    public final b f;
    public final tv3 g;
    public final String h;
    public final MoneyEntity i;
    public final String j;
    public final aj90 k;
    public final uc5 l;
    public final k5c m;
    public final String n;
    public final TransferScenario o;
    public final String p;
    public final boolean q;
    public final tls r;
    public final dms s;
    public final PartnerSelectionFeature$Companion$Entry t;
    public pzt0 u;
    public final com.ybsdk.feature.partnerselection.internal.data.helpers.a v;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.ybsdk.feature.partnerselection.internal.data.a aVar, com.ybsdk.feature.partnerselection.internal.data.b bVar, gi90 gi90Var, l lVar, j3h j3hVar, zh90 zh90Var, mi90 mi90Var, tfl0 tfl0Var, b bVar2, tv3 tv3Var, String str, MoneyEntity moneyEntity, String str2, aj90 aj90Var, uc5 uc5Var, k5c k5cVar, String str3, TransferScenario transferScenario, String str4, boolean z, tls tlsVar, dms dmsVar, PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry) {
        this.a = lVar;
        this.b = j3hVar;
        this.c = zh90Var;
        this.d = mi90Var;
        this.e = tfl0Var;
        this.f = bVar2;
        this.g = tv3Var;
        this.h = str;
        this.i = moneyEntity;
        this.j = str2;
        this.k = aj90Var;
        this.l = uc5Var;
        this.m = k5cVar;
        this.n = str3;
        this.o = transferScenario;
        this.p = str4;
        this.q = z;
        this.r = tlsVar;
        this.s = dmsVar;
        this.t = partnerSelectionFeature$Companion$Entry;
        switch (transferScenario == null ? -1 : eh90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 0:
            default:
                w511.b();
                throw null;
            case 13:
                aVar = bVar;
                break;
        }
        gi90Var.a.getClass();
        this.v = new com.ybsdk.feature.partnerselection.internal.data.helpers.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        PartnerCheckInteractorImpl$pollCheckUserPartner$1 partnerCheckInteractorImpl$pollCheckUserPartner$1;
        int i;
        q1e0 q1e0Var;
        aVar.getClass();
        if (continuationImpl instanceof PartnerCheckInteractorImpl$pollCheckUserPartner$1) {
            partnerCheckInteractorImpl$pollCheckUserPartner$1 = (PartnerCheckInteractorImpl$pollCheckUserPartner$1) continuationImpl;
            int i2 = partnerCheckInteractorImpl$pollCheckUserPartner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractorImpl$pollCheckUserPartner$1.label = i2 - Integer.MIN_VALUE;
                PartnerCheckInteractorImpl$pollCheckUserPartner$1 partnerCheckInteractorImpl$pollCheckUserPartner$12 = partnerCheckInteractorImpl$pollCheckUserPartner$1;
                Object obj = partnerCheckInteractorImpl$pollCheckUserPartner$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractorImpl$pollCheckUserPartner$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b bVar = aVar.f;
                TransferScenario transferScenario = aVar.o;
                switch (transferScenario == null ? -1 : eh90.a[transferScenario.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        q1e0Var = n1e0.b;
                        break;
                    case 0:
                    default:
                        w511.b();
                        return null;
                    case 13:
                        q1e0Var = p1e0.b;
                        break;
                }
                c c = bVar.c(q1e0Var, new PartnerCheckInteractorImpl$pollCheckUserPartner$2(2, null), new PartnerCheckInteractorImpl$pollCheckUserPartner$3(aVar, str, str5, str2, str6, str3, str4, null));
                partnerCheckInteractorImpl$pollCheckUserPartner$12.label = 1;
                Object e = c.e(partnerCheckInteractorImpl$pollCheckUserPartner$12);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        partnerCheckInteractorImpl$pollCheckUserPartner$1 = new PartnerCheckInteractorImpl$pollCheckUserPartner$1(aVar, continuationImpl);
        PartnerCheckInteractorImpl$pollCheckUserPartner$1 partnerCheckInteractorImpl$pollCheckUserPartner$122 = partnerCheckInteractorImpl$pollCheckUserPartner$1;
        Object obj2 = partnerCheckInteractorImpl$pollCheckUserPartner$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractorImpl$pollCheckUserPartner$122.label;
        if (i == 0) {
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.u;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        u8j0 l = this.k.l();
        r8j0 r8j0Var = l instanceof r8j0 ? (r8j0) l : null;
        List list = r8j0Var != null ? (List) r8j0Var.a : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c(((si90) it.next()).a.a, PartnerWithAction$Status.DEFAULT, null);
            arrayList.add(zy11.a);
        }
    }

    public final void c(String str, PartnerWithAction$Status partnerWithAction$Status, String str2) {
        aj90 aj90Var = this.k;
        u8j0 l = aj90Var.l();
        r8j0 r8j0Var = l instanceof r8j0 ? (r8j0) l : null;
        List list = r8j0Var != null ? (List) r8j0Var.a : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List<si90> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (si90 si90Var : list2) {
            ti90 ti90Var = si90Var.a;
            if (jl40.l(ti90Var.a, str)) {
                if (str2 != null) {
                    ti90Var = new ti90(ti90Var.a, str2, ti90Var.c, ti90Var.d);
                }
                si90Var = new si90(ti90Var, partnerWithAction$Status);
            } else {
                PartnerWithAction$Status partnerWithAction$Status2 = si90Var.b;
                if (partnerWithAction$Status2 == PartnerWithAction$Status.CHECKING || partnerWithAction$Status2 == PartnerWithAction$Status.FOUND) {
                    si90Var = new si90(ti90Var, PartnerWithAction$Status.DEFAULT);
                }
            }
            arrayList.add(si90Var);
        }
        aj90Var.N(new r8j0(arrayList, null, 14));
    }

    public final void d(PartnerEntity partnerEntity, String str, String str2, String str3) {
        pzt0 pzt0Var = this.u;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.u = tje.N(this.m, null, null, new PartnerCheckInteractorImpl$checkCrossBorderPartner$1(this, partnerEntity, str, str3, str2, null), 3);
    }

    public final void e(ti90 ti90Var, String str, String str2, String str3, boolean z) {
        ThemedImageUrlEntity themedImageUrlEntity = ti90Var.c;
        String str4 = ti90Var.b;
        String str5 = ti90Var.a;
        String str6 = ti90Var.d;
        b();
        boolean z2 = this.q;
        zh90 zh90Var = this.c;
        if (z2 || (((CommonFeatureFlag) this.g.a.d(wlp.J).getData()).isEnabled() && z)) {
            PartnerSelectionDeeplink a = str6 != null ? ((pi90) zh90Var).a(str6) : null;
            if ((a instanceof PartnerSelectionDeeplink.SelectPartner) || (a instanceof PartnerSelectionDeeplink.SelectCrossBorderPartner)) {
                PartnerEntity f = f(ti90Var);
                if (f == null) {
                    return;
                }
                this.r.invoke(new SelectedPartner(f, null, null, str, null, str2, null, 66, null));
                return;
            }
        }
        PartnerSelectionDeeplink a2 = str6 != null ? ((pi90) zh90Var).a(str6) : null;
        if (a2 instanceof PartnerSelectionDeeplink.SelectPartner) {
            PartnerEntity partnerEntity = new PartnerEntity(((PartnerSelectionDeeplink.SelectPartner) a2).getPartnerId(), str5, str4, themedImageUrlEntity);
            pzt0 pzt0Var = this.u;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.u = tje.N(this.m, null, null, new PartnerCheckInteractorImpl$checkPartner$1(this, partnerEntity, str2, str3, str, null), 3);
            return;
        }
        if (a2 instanceof PartnerSelectionDeeplink.SelectCrossBorderPartner) {
            d(new PartnerEntity(((PartnerSelectionDeeplink.SelectCrossBorderPartner) a2).getPartnerId(), str5, str4, themedImageUrlEntity), str, str2, null);
        } else if (jl40.l(a2, PartnerSelectionDeeplink.AllPartners.INSTANCE)) {
            i(str, str2, str3);
        } else if (str6 != null) {
            h791.e(this.b, str6, false, null, 14);
        }
    }

    public final PartnerEntity f(ti90 ti90Var) {
        String partnerId;
        String str = ti90Var.d;
        PartnerSelectionDeeplink a = str != null ? ((pi90) this.c).a(str) : null;
        if (a instanceof PartnerSelectionDeeplink.SelectPartner) {
            partnerId = ((PartnerSelectionDeeplink.SelectPartner) a).getPartnerId();
        } else {
            if (!(a instanceof PartnerSelectionDeeplink.SelectCrossBorderPartner)) {
                return null;
            }
            partnerId = ((PartnerSelectionDeeplink.SelectCrossBorderPartner) a).getPartnerId();
        }
        return new PartnerEntity(partnerId, ti90Var.a, ti90Var.b, ti90Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        PartnerCheckInteractorImpl$getAllPartners$1 partnerCheckInteractorImpl$getAllPartners$1;
        int i;
        if (continuationImpl instanceof PartnerCheckInteractorImpl$getAllPartners$1) {
            partnerCheckInteractorImpl$getAllPartners$1 = (PartnerCheckInteractorImpl$getAllPartners$1) continuationImpl;
            int i2 = partnerCheckInteractorImpl$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractorImpl$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerCheckInteractorImpl$getAllPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractorImpl$getAllPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TransferScenario transferScenario = this.o;
                    switch (transferScenario == null ? -1 : eh90.a[transferScenario.ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 13:
                            partnerCheckInteractorImpl$getAllPartners$1.label = 2;
                            Object c = this.v.c(str, str2, str3, str4, partnerCheckInteractorImpl$getAllPartners$1);
                            return c == coroutineSingletons ? coroutineSingletons : c;
                        case 0:
                        default:
                            w511.b();
                            return null;
                        case 10:
                            if (str5 == null) {
                                str5 = "UZ";
                            }
                            partnerCheckInteractorImpl$getAllPartners$1.label = 1;
                            Object d = this.v.d(str5, str4, partnerCheckInteractorImpl$getAllPartners$1);
                            if (d != coroutineSingletons) {
                                return d;
                            }
                            break;
                    }
                } else {
                    if (i == 1 || i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        partnerCheckInteractorImpl$getAllPartners$1 = new PartnerCheckInteractorImpl$getAllPartners$1(this, continuationImpl);
        Object obj2 = partnerCheckInteractorImpl$getAllPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractorImpl$getAllPartners$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ar51 ar51Var, PartnerEntity partnerEntity, String str, String str2, SelectedPartnerCrossBorderData selectedPartnerCrossBorderData, ContinuationImpl continuationImpl) {
        PartnerCheckInteractorImpl$handlePartnerCheckResult$1 partnerCheckInteractorImpl$handlePartnerCheckResult$1;
        int i;
        String str3;
        String str4;
        SelectedPartnerCrossBorderData selectedPartnerCrossBorderData2;
        PartnerEntity partnerEntity2;
        String transferId;
        ar51 ar51Var2 = ar51Var;
        if (continuationImpl instanceof PartnerCheckInteractorImpl$handlePartnerCheckResult$1) {
            partnerCheckInteractorImpl$handlePartnerCheckResult$1 = (PartnerCheckInteractorImpl$handlePartnerCheckResult$1) continuationImpl;
            int i2 = partnerCheckInteractorImpl$handlePartnerCheckResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractorImpl$handlePartnerCheckResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerCheckInteractorImpl$handlePartnerCheckResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractorImpl$handlePartnerCheckResult$1.label;
                tls tlsVar = this.r;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ar51Var2 instanceof xq51)) {
                        boolean z = ar51Var2 instanceof yq51;
                        dms dmsVar = this.s;
                        if (z) {
                            yq51 yq51Var = (yq51) ar51Var2;
                            if (yq51Var.b == null) {
                                tlsVar.invoke(null);
                                c(partnerEntity.getTitle(), PartnerWithAction$Status.NOT_FOUND, yq51Var.a);
                            } else {
                                b();
                                dmsVar.invoke(partnerEntity, null, null, null, yq51Var.b);
                            }
                        } else if (jl40.l(ar51Var2, zq51.a)) {
                            x4c.g("partnerCheck.Pending must be handled in poller", null, null, null, 14);
                        } else {
                            if (!(ar51Var2 instanceof wq51)) {
                                w511.b();
                                return null;
                            }
                            c(partnerEntity.getTitle(), PartnerWithAction$Status.DEFAULT, null);
                            wq51 wq51Var = (wq51) ar51Var2;
                            dmsVar.invoke(partnerEntity, null, wq51Var.a, wq51Var.b, null);
                        }
                        return zy11.a;
                    }
                    c(partnerEntity.getTitle(), PartnerWithAction$Status.FOUND, null);
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$0 = ar51Var2;
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$1 = partnerEntity;
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$2 = str;
                    str3 = str2;
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$3 = str3;
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$4 = selectedPartnerCrossBorderData;
                    partnerCheckInteractorImpl$handlePartnerCheckResult$1.label = 1;
                    if (kotlinx.coroutines.a.i(300L, partnerCheckInteractorImpl$handlePartnerCheckResult$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str4 = str;
                    selectedPartnerCrossBorderData2 = selectedPartnerCrossBorderData;
                    partnerEntity2 = partnerEntity;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SelectedPartnerCrossBorderData selectedPartnerCrossBorderData3 = (SelectedPartnerCrossBorderData) partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$4;
                    String str5 = (String) partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$3;
                    String str6 = (String) partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$2;
                    PartnerEntity partnerEntity3 = (PartnerEntity) partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$1;
                    ar51 ar51Var3 = (ar51) partnerCheckInteractorImpl$handlePartnerCheckResult$1.L$0;
                    kotlin.b.b(obj);
                    selectedPartnerCrossBorderData2 = selectedPartnerCrossBorderData3;
                    str3 = str5;
                    ar51Var2 = ar51Var3;
                    str4 = str6;
                    partnerEntity2 = partnerEntity3;
                }
                xq51 xq51Var = (xq51) ar51Var2;
                tlsVar.invoke(new SelectedPartner(partnerEntity2, xq51Var.b, xq51Var.a, str4, xq51Var.c, (selectedPartnerCrossBorderData2 != null || (transferId = selectedPartnerCrossBorderData2.getTransferId()) == null) ? str3 : transferId, selectedPartnerCrossBorderData2));
                return zy11.a;
            }
        }
        partnerCheckInteractorImpl$handlePartnerCheckResult$1 = new PartnerCheckInteractorImpl$handlePartnerCheckResult$1(this, continuationImpl);
        Object obj2 = partnerCheckInteractorImpl$handlePartnerCheckResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractorImpl$handlePartnerCheckResult$1.label;
        tls tlsVar2 = this.r;
        if (i != 0) {
        }
        xq51 xq51Var2 = (xq51) ar51Var2;
        tlsVar2.invoke(new SelectedPartner(partnerEntity2, xq51Var2.b, xq51Var2.a, str4, xq51Var2.c, (selectedPartnerCrossBorderData2 != null || (transferId = selectedPartnerCrossBorderData2.getTransferId()) == null) ? str3 : transferId, selectedPartnerCrossBorderData2));
        return zy11.a;
    }

    public final void i(String str, String str2, String str3) {
        PartnersFragment.Arguments arguments = new PartnersFragment.Arguments(str, this.h, this.t, this.i, this.j, str3, this.n, str2, this.o, this.p, false, this.q, 1024, null);
        this.d.getClass();
        this.e.h(mi90.a(arguments));
    }
}
