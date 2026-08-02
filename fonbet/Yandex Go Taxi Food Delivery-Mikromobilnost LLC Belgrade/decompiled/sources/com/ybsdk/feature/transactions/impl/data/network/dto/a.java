package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ctu0;
import defpackage.jl40;
import defpackage.jpl;
import defpackage.ny61;
import defpackage.ppl;
import defpackage.rf01;
import defpackage.rpl;
import defpackage.rr51;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:10:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(TransactionsListDivkitDataDto transactionsListDivkitDataDto, ContinuationImpl continuationImpl) {
        TransactionsListResponseV2Kt$toDivList$1 transactionsListResponseV2Kt$toDivList$1;
        int i;
        TransactionsListDivkitDataDto transactionsListDivkitDataDto2;
        Iterator it;
        Collection collection;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        if (continuationImpl instanceof TransactionsListResponseV2Kt$toDivList$1) {
            transactionsListResponseV2Kt$toDivList$1 = (TransactionsListResponseV2Kt$toDivList$1) continuationImpl;
            int i2 = transactionsListResponseV2Kt$toDivList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsListResponseV2Kt$toDivList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsListResponseV2Kt$toDivList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsListResponseV2Kt$toDivList$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(transactionsListDivkitDataDto.getCommonDivData());
                    List<TransactionListItemDto> items = transactionsListDivkitDataDto.getItems();
                    ArrayList arrayList = new ArrayList();
                    transactionsListDivkitDataDto2 = transactionsListDivkitDataDto;
                    it = items.iterator();
                    collection = arrayList;
                    aVar = aVar2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) transactionsListResponseV2Kt$toDivList$1.L$3;
                    collection = (Collection) transactionsListResponseV2Kt$toDivList$1.L$2;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) transactionsListResponseV2Kt$toDivList$1.L$1;
                    TransactionsListDivkitDataDto transactionsListDivkitDataDto3 = (TransactionsListDivkitDataDto) transactionsListResponseV2Kt$toDivList$1.L$0;
                    b.b(obj);
                    jpl jplVar = (jpl) obj;
                    if (jplVar != null) {
                        collection.add(jplVar);
                    }
                    transactionsListDivkitDataDto2 = transactionsListDivkitDataDto3;
                    if (it.hasNext()) {
                        TransactionListItemDto transactionListItemDto = (TransactionListItemDto) it.next();
                        transactionsListResponseV2Kt$toDivList$1.L$0 = transactionsListDivkitDataDto2;
                        transactionsListResponseV2Kt$toDivList$1.L$1 = aVar;
                        transactionsListResponseV2Kt$toDivList$1.L$2 = collection;
                        transactionsListResponseV2Kt$toDivList$1.L$3 = it;
                        transactionsListResponseV2Kt$toDivList$1.label = 1;
                        Object b = b(transactionListItemDto, aVar, transactionsListResponseV2Kt$toDivList$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        transactionsListDivkitDataDto3 = transactionsListDivkitDataDto2;
                        obj = b;
                        jpl jplVar2 = (jpl) obj;
                        if (jplVar2 != null) {
                        }
                        transactionsListDivkitDataDto2 = transactionsListDivkitDataDto3;
                        if (it.hasNext()) {
                            return new ppl((List) collection, transactionsListDivkitDataDto2.getCursor());
                        }
                    }
                }
            }
        }
        transactionsListResponseV2Kt$toDivList$1 = new TransactionsListResponseV2Kt$toDivList$1(continuationImpl);
        Object obj2 = transactionsListResponseV2Kt$toDivList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsListResponseV2Kt$toDivList$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(TransactionListItemDto transactionListItemDto, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        TransactionsListResponseV2Kt$toDivViewItem$1 transactionsListResponseV2Kt$toDivViewItem$1;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof TransactionsListResponseV2Kt$toDivViewItem$1) {
            transactionsListResponseV2Kt$toDivViewItem$1 = (TransactionsListResponseV2Kt$toDivViewItem$1) continuationImpl;
            int i2 = transactionsListResponseV2Kt$toDivViewItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsListResponseV2Kt$toDivViewItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsListResponseV2Kt$toDivViewItem$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsListResponseV2Kt$toDivViewItem$1.label;
                if (i != 0) {
                    b.b(obj);
                    DivDataDto divData = transactionListItemDto.getDivData();
                    transactionsListResponseV2Kt$toDivViewItem$1.L$0 = transactionListItemDto;
                    transactionsListResponseV2Kt$toDivViewItem$1.label = 1;
                    b = aVar.b(divData, transactionsListResponseV2Kt$toDivViewItem$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transactionListItemDto = (TransactionListItemDto) transactionsListResponseV2Kt$toDivViewItem$1.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var == null) {
                    return new jpl(new ctu0(transactionListItemDto.getType()), rr51Var, new rpl(jl40.l(transactionListItemDto.getType(), "heading")), null, 20);
                }
                return null;
            }
        }
        transactionsListResponseV2Kt$toDivViewItem$1 = new TransactionsListResponseV2Kt$toDivViewItem$1(continuationImpl);
        Object obj3 = transactionsListResponseV2Kt$toDivViewItem$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsListResponseV2Kt$toDivViewItem$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(TransactionsInfoResponseV2 transactionsInfoResponseV2, Continuation continuation) {
        TransactionsInfoResponseV2Kt$toEntity$1 transactionsInfoResponseV2Kt$toEntity$1;
        int i;
        String str;
        String str2;
        if (continuation instanceof TransactionsInfoResponseV2Kt$toEntity$1) {
            transactionsInfoResponseV2Kt$toEntity$1 = (TransactionsInfoResponseV2Kt$toEntity$1) continuation;
            int i2 = transactionsInfoResponseV2Kt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsInfoResponseV2Kt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsInfoResponseV2Kt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsInfoResponseV2Kt$toEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    String title = transactionsInfoResponseV2.getTitle();
                    String subtitle = transactionsInfoResponseV2.getSubtitle();
                    TransactionsListDivkitDataDto divData = transactionsInfoResponseV2.getDivData();
                    transactionsInfoResponseV2Kt$toEntity$1.L$0 = title;
                    transactionsInfoResponseV2Kt$toEntity$1.L$1 = subtitle;
                    transactionsInfoResponseV2Kt$toEntity$1.label = 1;
                    Object a = a(divData, transactionsInfoResponseV2Kt$toEntity$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = title;
                    obj = a;
                    str2 = subtitle;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) transactionsInfoResponseV2Kt$toEntity$1.L$1;
                    str = (String) transactionsInfoResponseV2Kt$toEntity$1.L$0;
                    b.b(obj);
                }
                return new rf01(str, str2, (ppl) obj);
            }
        }
        transactionsInfoResponseV2Kt$toEntity$1 = new TransactionsInfoResponseV2Kt$toEntity$1(continuation);
        Object obj2 = transactionsInfoResponseV2Kt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsInfoResponseV2Kt$toEntity$1.label;
        if (i != 0) {
        }
        return new rf01(str, str2, (ppl) obj2);
    }
}
