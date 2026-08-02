package com.ybsdk.feature.transfer.internal.domain;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultImage;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;
import com.ybsdk.utils.poller.c;
import defpackage.ar51;
import defpackage.ary;
import defpackage.bwb0;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.jvx0;
import defpackage.k5c;
import defpackage.ny61;
import defpackage.o1e0;
import defpackage.pt01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.txg0;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wq51;
import defpackage.x4c;
import defpackage.xq51;
import defpackage.yq51;
import defpackage.zq51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.transfer.internal.data.a a;
    public final bwb0 b;
    public final com.ybsdk.utils.poller.b c;
    public final com.ybsdk.feature.transfer.internal.screens.targets.presentation.b d;
    public final k5c e;
    public final com.ybsdk.feature.transfer.internal.screens.targets.presentation.b f;
    public final tls g;
    public final jvx0 h;
    public pzt0 i;

    public a(com.ybsdk.feature.transfer.internal.data.a aVar, bwb0 bwb0Var, com.ybsdk.utils.poller.b bVar, com.ybsdk.feature.transfer.internal.screens.targets.presentation.b bVar2, k5c k5cVar, com.ybsdk.feature.transfer.internal.screens.targets.presentation.b bVar3, tls tlsVar, jvx0 jvx0Var) {
        this.a = aVar;
        this.b = bwb0Var;
        this.c = bVar;
        this.d = bVar2;
        this.e = k5cVar;
        this.f = bVar3;
        this.g = tlsVar;
        this.h = jvx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ar51 ar51Var, PartnerEntity partnerEntity, String str, ContinuationImpl continuationImpl) {
        PartnerCheckInteractor$handleYbCheckResult$1 partnerCheckInteractor$handleYbCheckResult$1;
        int i;
        tls tlsVar = aVar.g;
        if (continuationImpl instanceof PartnerCheckInteractor$handleYbCheckResult$1) {
            partnerCheckInteractor$handleYbCheckResult$1 = (PartnerCheckInteractor$handleYbCheckResult$1) continuationImpl;
            int i2 = partnerCheckInteractor$handleYbCheckResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractor$handleYbCheckResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerCheckInteractor$handleYbCheckResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractor$handleYbCheckResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ar51Var instanceof xq51)) {
                        if (ar51Var instanceof yq51) {
                            tlsVar.invoke(null);
                            aVar.d(partnerEntity, ListContentData$Partner$Status.NOT_FOUND, ((yq51) ar51Var).a);
                        } else if (jl40.l(ar51Var, zq51.a)) {
                            x4c.g("YbCheck.Pending must be handled in poller", null, null, null, 14);
                        } else {
                            if (!(ar51Var instanceof wq51)) {
                                w511.b();
                                return null;
                            }
                            aVar.d(partnerEntity, ListContentData$Partner$Status.DEFAULT, null);
                            aVar.h.invoke(partnerEntity, null, ((wq51) ar51Var).a);
                        }
                        return zy11.a;
                    }
                    aVar.d(partnerEntity, ListContentData$Partner$Status.FOUND, null);
                    partnerCheckInteractor$handleYbCheckResult$1.L$0 = ar51Var;
                    partnerCheckInteractor$handleYbCheckResult$1.L$1 = partnerEntity;
                    partnerCheckInteractor$handleYbCheckResult$1.L$2 = str;
                    partnerCheckInteractor$handleYbCheckResult$1.label = 1;
                    if (kotlinx.coroutines.a.i(300L, partnerCheckInteractor$handleYbCheckResult$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) partnerCheckInteractor$handleYbCheckResult$1.L$2;
                    partnerEntity = (PartnerEntity) partnerCheckInteractor$handleYbCheckResult$1.L$1;
                    ar51Var = (ar51) partnerCheckInteractor$handleYbCheckResult$1.L$0;
                    kotlin.b.b(obj);
                }
                xq51 xq51Var = (xq51) ar51Var;
                tlsVar.invoke(new TransferSelectedTargetEntity(partnerEntity, xq51Var.b, str, xq51Var.a));
                return zy11.a;
            }
        }
        partnerCheckInteractor$handleYbCheckResult$1 = new PartnerCheckInteractor$handleYbCheckResult$1(aVar, continuationImpl);
        Object obj2 = partnerCheckInteractor$handleYbCheckResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractor$handleYbCheckResult$1.label;
        if (i != 0) {
        }
        xq51 xq51Var2 = (xq51) ar51Var;
        tlsVar.invoke(new TransferSelectedTargetEntity(partnerEntity, xq51Var2.b, str, xq51Var2.a));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PartnerCheckInteractor$pollCheckUserTarget$1 partnerCheckInteractor$pollCheckUserTarget$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PartnerCheckInteractor$pollCheckUserTarget$1) {
            partnerCheckInteractor$pollCheckUserTarget$1 = (PartnerCheckInteractor$pollCheckUserTarget$1) continuationImpl;
            int i2 = partnerCheckInteractor$pollCheckUserTarget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractor$pollCheckUserTarget$1.label = i2 - Integer.MIN_VALUE;
                PartnerCheckInteractor$pollCheckUserTarget$1 partnerCheckInteractor$pollCheckUserTarget$12 = partnerCheckInteractor$pollCheckUserTarget$1;
                Object obj = partnerCheckInteractor$pollCheckUserTarget$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractor$pollCheckUserTarget$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c c = aVar.c.c(o1e0.b, new PartnerCheckInteractor$pollCheckUserTarget$2(2, null), new PartnerCheckInteractor$pollCheckUserTarget$3(aVar, str3, str, str2, null));
                partnerCheckInteractor$pollCheckUserTarget$12.label = 1;
                Object e = c.e(partnerCheckInteractor$pollCheckUserTarget$12);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        partnerCheckInteractor$pollCheckUserTarget$1 = new PartnerCheckInteractor$pollCheckUserTarget$1(aVar, continuationImpl);
        PartnerCheckInteractor$pollCheckUserTarget$1 partnerCheckInteractor$pollCheckUserTarget$122 = partnerCheckInteractor$pollCheckUserTarget$1;
        Object obj2 = partnerCheckInteractor$pollCheckUserTarget$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractor$pollCheckUserTarget$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, PartnerEntity partnerEntity, ContinuationImpl continuationImpl) {
        PartnerCheckInteractor$successWithoutCheck$1 partnerCheckInteractor$successWithoutCheck$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PartnerCheckInteractor$successWithoutCheck$1) {
            partnerCheckInteractor$successWithoutCheck$1 = (PartnerCheckInteractor$successWithoutCheck$1) continuationImpl;
            int i2 = partnerCheckInteractor$successWithoutCheck$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerCheckInteractor$successWithoutCheck$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerCheckInteractor$successWithoutCheck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerCheckInteractor$successWithoutCheck$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.d(partnerEntity, ListContentData$Partner$Status.FOUND, null);
                    partnerCheckInteractor$successWithoutCheck$1.L$0 = partnerEntity;
                    partnerCheckInteractor$successWithoutCheck$1.label = 1;
                    if (kotlinx.coroutines.a.i(300L, partnerCheckInteractor$successWithoutCheck$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    partnerEntity = (PartnerEntity) partnerCheckInteractor$successWithoutCheck$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar.g.invoke(new TransferSelectedTargetEntity(partnerEntity, new ResultScreenHeader(unr0.h(Text.Companion, dzh0.ybsdk_transfer_sbp_title), new ResultImage.Resource(txg0.ybsdk_ic_transfers_sbp)), null, null));
                return zy11.a;
            }
        }
        partnerCheckInteractor$successWithoutCheck$1 = new PartnerCheckInteractor$successWithoutCheck$1(aVar, continuationImpl);
        Object obj2 = partnerCheckInteractor$successWithoutCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerCheckInteractor$successWithoutCheck$1.label;
        if (i != 0) {
        }
        aVar.g.invoke(new TransferSelectedTargetEntity(partnerEntity, new ResultScreenHeader(unr0.h(Text.Companion, dzh0.ybsdk_transfer_sbp_title), new ResultImage.Resource(txg0.ybsdk_ic_transfers_sbp)), null, null));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r1 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(PartnerEntity partnerEntity, ListContentData$Partner$Status listContentData$Partner$Status, String str) {
        List list;
        r0 r0Var;
        Object value;
        String str2;
        com.ybsdk.feature.transfer.internal.screens.targets.presentation.b bVar = this.d;
        u8j0 u8j0Var = ((pt01) bVar.X()).a;
        r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
        if (r8j0Var != null && (list = (List) r8j0Var.a) != null) {
            if (list.isEmpty()) {
                list = null;
            }
        }
        x4c.g("Checking yb with a strange state of yb items", null, String.valueOf(u8j0Var), null, 10);
        list = EmptyList.a;
        List<ary> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ary aryVar : list2) {
            if (jl40.l(aryVar.a.getPartnerId(), partnerEntity.getPartnerId())) {
                PartnerEntity partnerEntity2 = aryVar.a;
                if (str != null) {
                    str2 = str;
                    partnerEntity2 = PartnerEntity.copy$default(partnerEntity2, null, null, str2, null, 11, null);
                } else {
                    str2 = str;
                }
                aryVar = new ary(partnerEntity2, listContentData$Partner$Status);
            } else {
                str2 = str;
                ListContentData$Partner$Status listContentData$Partner$Status2 = aryVar.b;
                if (listContentData$Partner$Status2 == ListContentData$Partner$Status.CHECKING || listContentData$Partner$Status2 == ListContentData$Partner$Status.FOUND) {
                    aryVar = new ary(aryVar.a, ListContentData$Partner$Status.DEFAULT);
                }
            }
            arrayList.add(aryVar);
            str = str2;
        }
        r8j0 r8j0Var2 = new r8j0(arrayList, null, 14);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, pt01.a((pt01) value, r8j0Var2, null, null, 14)));
    }

    public final void e(PartnerEntity partnerEntity, TransferType transferType, String str) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = tje.N(this.e, null, null, new PartnerCheckInteractor$checkTarget$1(this, transferType, partnerEntity, str, null), 3);
    }
}
