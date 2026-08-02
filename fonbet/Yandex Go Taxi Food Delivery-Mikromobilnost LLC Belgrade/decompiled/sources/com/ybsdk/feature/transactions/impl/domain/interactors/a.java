package com.ybsdk.feature.transactions.impl.domain.interactors;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsFiltersLoadResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadInitiatedLoadType;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultResult;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.rconfig.configs.DivKitTransactionsLimitFeature;
import defpackage.cvu0;
import defpackage.jyk;
import defpackage.l0p;
import defpackage.ny61;
import defpackage.sf01;
import defpackage.ue01;
import defpackage.w511;
import defpackage.ze01;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.transactions.impl.data.b a;
    public final sf01 b;
    public final AppAnalyticsReporter c;

    public a(com.ybsdk.feature.transactions.impl.data.b bVar, sf01 sf01Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = bVar;
        this.b = sf01Var;
        this.c = appAnalyticsReporter;
    }

    public static TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle c(String str) {
        Object obj;
        Iterator<E> it = TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle) obj).getOriginalValue(), str, true)) {
                break;
            }
        }
        return (TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle) obj;
    }

    public static TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle d(String str) {
        Object obj;
        Iterator<E> it = TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle) obj).getOriginalValue(), str, true)) {
                break;
            }
        }
        return (TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransactionsFeedFilterEntity transactionsFeedFilterEntity, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        TransactionsFeedInteractor$getTransactionsFeedFilter$1 transactionsFeedInteractor$getTransactionsFeedFilter$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof TransactionsFeedInteractor$getTransactionsFeedFilter$1) {
            transactionsFeedInteractor$getTransactionsFeedFilter$1 = (TransactionsFeedInteractor$getTransactionsFeedFilter$1) continuationImpl;
            int i2 = transactionsFeedInteractor$getTransactionsFeedFilter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsFeedInteractor$getTransactionsFeedFilter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsFeedInteractor$getTransactionsFeedFilter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsFeedInteractor$getTransactionsFeedFilter$1.label;
                AppAnalyticsReporter appAnalyticsReporter = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0p l0pVar = appAnalyticsReporter.p0;
                    String product = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getProduct() : null;
                    String agreementId = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getAgreementId() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(6);
                    if (product != null) {
                        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, product);
                    }
                    if (agreementId != null) {
                        linkedHashMap.put("agreement_id", agreementId);
                    }
                    linkedHashMap.put("show_tabbar", Boolean.valueOf(z));
                    linkedHashMap.put("hide_filters", Boolean.valueOf(z2));
                    l0pVar.a.a("transactions.filters.load.initiated", linkedHashMap);
                    transactionsFeedInteractor$getTransactionsFeedFilter$1.label = 1;
                    a = this.a.a(transactionsFeedFilterEntity, z, z2, transactionsFeedInteractor$getTransactionsFeedFilter$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    appAnalyticsReporter.p0.k(TransactionsFeedEvents$TransactionsFiltersLoadResultResult.OK, null);
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    appAnalyticsReporter.p0.k(TransactionsFeedEvents$TransactionsFiltersLoadResultResult.ERROR, a2.getMessage());
                }
                return a;
            }
        }
        transactionsFeedInteractor$getTransactionsFeedFilter$1 = new TransactionsFeedInteractor$getTransactionsFeedFilter$1(this, continuationImpl);
        Object obj2 = transactionsFeedInteractor$getTransactionsFeedFilter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsFeedInteractor$getTransactionsFeedFilter$1.label;
        AppAnalyticsReporter appAnalyticsReporter2 = this.c;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransactionsFeedFilterEntity transactionsFeedFilterEntity, String str, TransactionsLoadType transactionsLoadType, int i, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        TransactionsFeedInteractor$getTransactionsFeedList$1 transactionsFeedInteractor$getTransactionsFeedList$1;
        int i2;
        int firstTransactionsLimit;
        TransactionsFeedEvents$TransactionsListLoadInitiatedLoadType transactionsFeedEvents$TransactionsListLoadInitiatedLoadType;
        TransactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle transactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle;
        int i3;
        TransactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle transactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle;
        Object b;
        TransactionsFeedFilterEntity transactionsFeedFilterEntity2;
        boolean z3;
        boolean z4;
        int i4;
        String filtersStyle;
        Object obj;
        String headerStyle;
        Object obj2;
        Throwable a;
        String filtersStyle2;
        String headerStyle2;
        String filtersStyle3;
        String headerStyle3;
        if (continuationImpl instanceof TransactionsFeedInteractor$getTransactionsFeedList$1) {
            transactionsFeedInteractor$getTransactionsFeedList$1 = (TransactionsFeedInteractor$getTransactionsFeedList$1) continuationImpl;
            int i5 = transactionsFeedInteractor$getTransactionsFeedList$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                transactionsFeedInteractor$getTransactionsFeedList$1.label = i5 - Integer.MIN_VALUE;
                TransactionsFeedInteractor$getTransactionsFeedList$1 transactionsFeedInteractor$getTransactionsFeedList$12 = transactionsFeedInteractor$getTransactionsFeedList$1;
                Object obj3 = transactionsFeedInteractor$getTransactionsFeedList$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transactionsFeedInteractor$getTransactionsFeedList$12.label;
                AppAnalyticsReporter appAnalyticsReporter = this.c;
                if (i2 != 0) {
                    kotlin.b.b(obj3);
                    TransactionsLoadType transactionsLoadType2 = TransactionsLoadType.NEXT_PAGE;
                    sf01 sf01Var = this.b;
                    if (transactionsLoadType == transactionsLoadType2) {
                        com.ybsdk.rconfig.b bVar = ((ue01) sf01Var).a;
                        bVar.getClass();
                        firstTransactionsLimit = ((DivKitTransactionsLimitFeature) bVar.d(jyk.a).getData()).getNextTransactionsLimit();
                    } else {
                        com.ybsdk.rconfig.b bVar2 = ((ue01) sf01Var).a;
                        bVar2.getClass();
                        firstTransactionsLimit = ((DivKitTransactionsLimitFeature) bVar2.d(jyk.a).getData()).getFirstTransactionsLimit();
                    }
                    com.ybsdk.rconfig.b bVar3 = ((ue01) sf01Var).a;
                    bVar3.getClass();
                    int pendingTransactionsLimit = ((DivKitTransactionsLimitFeature) bVar3.d(jyk.a).getData()).getPendingTransactionsLimit();
                    l0p l0pVar = appAnalyticsReporter.p0;
                    String product = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getProduct() : null;
                    String agreementId = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getAgreementId() : null;
                    int i6 = ze01.a[transactionsLoadType.ordinal()];
                    if (i6 == 1) {
                        transactionsFeedEvents$TransactionsListLoadInitiatedLoadType = TransactionsFeedEvents$TransactionsListLoadInitiatedLoadType.INITIAL;
                    } else if (i6 == 2) {
                        transactionsFeedEvents$TransactionsListLoadInitiatedLoadType = TransactionsFeedEvents$TransactionsListLoadInitiatedLoadType.PTR;
                    } else {
                        if (i6 != 3) {
                            w511.b();
                            return null;
                        }
                        transactionsFeedEvents$TransactionsListLoadInitiatedLoadType = TransactionsFeedEvents$TransactionsListLoadInitiatedLoadType.LOAD_MORE;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    if (transactionsFeedFilterEntity == null || (headerStyle = transactionsFeedFilterEntity.getHeaderStyle()) == null) {
                        transactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle = null;
                    } else {
                        Iterator<E> it = TransactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (cvu0.t(((TransactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle) obj2).getOriginalValue(), headerStyle, true)) {
                                break;
                            }
                        }
                        transactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle = (TransactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle) obj2;
                    }
                    if (transactionsFeedFilterEntity == null || (filtersStyle = transactionsFeedFilterEntity.getFiltersStyle()) == null) {
                        i3 = firstTransactionsLimit;
                        transactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle = null;
                    } else {
                        Iterator<E> it2 = TransactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle.getEntries().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i3 = firstTransactionsLimit;
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            i3 = firstTransactionsLimit;
                            if (cvu0.t(((TransactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle) obj).getOriginalValue(), filtersStyle, true)) {
                                break;
                            }
                            firstTransactionsLimit = i3;
                        }
                        transactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle = (TransactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle) obj;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(10);
                    linkedHashMap.put("pending_limit", Integer.valueOf(pendingTransactionsLimit));
                    linkedHashMap.put("regular_limit", Integer.valueOf(i3));
                    if (product != null) {
                        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, product);
                    }
                    if (agreementId != null) {
                        linkedHashMap.put("agreement_id", agreementId);
                    }
                    linkedHashMap.put("load_type", transactionsFeedEvents$TransactionsListLoadInitiatedLoadType.getOriginalValue());
                    linkedHashMap.put("load_count", Integer.valueOf(i));
                    linkedHashMap.put("show_tabbar", valueOf);
                    linkedHashMap.put("hide_filters", valueOf2);
                    if (transactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle != null) {
                        linkedHashMap.put("header_style", transactionsFeedEvents$TransactionsListLoadInitiatedHeaderStyle.getOriginalValue());
                    }
                    if (transactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle != null) {
                        linkedHashMap.put("filters_style", transactionsFeedEvents$TransactionsListLoadInitiatedFiltersStyle.getOriginalValue());
                    }
                    l0pVar.a.a("transactions.list.load.initiated", linkedHashMap);
                    transactionsFeedInteractor$getTransactionsFeedList$12.L$0 = transactionsFeedFilterEntity;
                    transactionsFeedInteractor$getTransactionsFeedList$12.I$0 = i;
                    transactionsFeedInteractor$getTransactionsFeedList$12.Z$0 = z;
                    transactionsFeedInteractor$getTransactionsFeedList$12.Z$1 = z2;
                    transactionsFeedInteractor$getTransactionsFeedList$12.label = 1;
                    b = this.a.b(transactionsFeedFilterEntity, str, i3, pendingTransactionsLimit, z, z2, transactionsFeedInteractor$getTransactionsFeedList$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    transactionsFeedFilterEntity2 = transactionsFeedFilterEntity;
                    z3 = z;
                    z4 = z2;
                    i4 = i;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = transactionsFeedInteractor$getTransactionsFeedList$12.Z$1;
                    z3 = transactionsFeedInteractor$getTransactionsFeedList$12.Z$0;
                    int i7 = transactionsFeedInteractor$getTransactionsFeedList$12.I$0;
                    transactionsFeedFilterEntity2 = (TransactionsFeedFilterEntity) transactionsFeedInteractor$getTransactionsFeedList$12.L$0;
                    kotlin.b.b(obj3);
                    b = ((Result) obj3).getValue();
                    i4 = i7;
                }
                if (!(b instanceof Result.Failure)) {
                    appAnalyticsReporter.p0.l(TransactionsFeedEvents$TransactionsListLoadResultResult.OK, null, transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getProduct() : null, transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getAgreementId() : null, i4, Boolean.valueOf(z3), Boolean.valueOf(z4), (transactionsFeedFilterEntity2 == null || (headerStyle3 = transactionsFeedFilterEntity2.getHeaderStyle()) == null) ? null : d(headerStyle3), (transactionsFeedFilterEntity2 == null || (filtersStyle3 = transactionsFeedFilterEntity2.getFiltersStyle()) == null) ? null : c(filtersStyle3));
                }
                a = Result.a(b);
                if (a != null) {
                    appAnalyticsReporter.p0.l(TransactionsFeedEvents$TransactionsListLoadResultResult.ERROR, a.getMessage(), transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getProduct() : null, transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getAgreementId() : null, i4, Boolean.valueOf(z3), Boolean.valueOf(z4), (transactionsFeedFilterEntity2 == null || (headerStyle2 = transactionsFeedFilterEntity2.getHeaderStyle()) == null) ? null : d(headerStyle2), (transactionsFeedFilterEntity2 == null || (filtersStyle2 = transactionsFeedFilterEntity2.getFiltersStyle()) == null) ? null : c(filtersStyle2));
                }
                return b;
            }
        }
        transactionsFeedInteractor$getTransactionsFeedList$1 = new TransactionsFeedInteractor$getTransactionsFeedList$1(this, continuationImpl);
        TransactionsFeedInteractor$getTransactionsFeedList$1 transactionsFeedInteractor$getTransactionsFeedList$122 = transactionsFeedInteractor$getTransactionsFeedList$1;
        Object obj32 = transactionsFeedInteractor$getTransactionsFeedList$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transactionsFeedInteractor$getTransactionsFeedList$122.label;
        AppAnalyticsReporter appAnalyticsReporter2 = this.c;
        if (i2 != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        return b;
    }
}
