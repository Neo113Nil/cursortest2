package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersResponse;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.ve01;
import defpackage.we01;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(TransactionsFeedFiltersResponse transactionsFeedFiltersResponse, ContinuationImpl continuationImpl) {
        TransactionsFeedMapperKt$toEntity$1 transactionsFeedMapperKt$toEntity$1;
        int i;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        TransactionsFeedFiltersResponse transactionsFeedFiltersResponse2;
        rr51 rr51Var;
        Object b;
        DivDataDto filtersDivData;
        TransactionsFeedFiltersResponse transactionsFeedFiltersResponse3;
        rr51 rr51Var2;
        Object obj;
        TransactionsFeedFiltersResponse.ToolbarData toolbarData;
        String title;
        if (continuationImpl instanceof TransactionsFeedMapperKt$toEntity$1) {
            transactionsFeedMapperKt$toEntity$1 = (TransactionsFeedMapperKt$toEntity$1) continuationImpl;
            int i2 = transactionsFeedMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsFeedMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transactionsFeedMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsFeedMapperKt$toEntity$1.label;
                ve01 ve01Var = null;
                ve01Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto headerDivData = transactionsFeedFiltersResponse.getHeaderDivData();
                    if (headerDivData == null) {
                        aVar2 = aVar;
                        transactionsFeedFiltersResponse2 = transactionsFeedFiltersResponse;
                        rr51Var = null;
                        filtersDivData = transactionsFeedFiltersResponse2.getFiltersDivData();
                        if (filtersDivData == null) {
                            transactionsFeedFiltersResponse3 = transactionsFeedFiltersResponse2;
                            rr51Var2 = null;
                            toolbarData = transactionsFeedFiltersResponse3.getToolbarData();
                            if (toolbarData != null) {
                            }
                            return new we01(rr51Var, rr51Var2, ve01Var);
                        }
                        transactionsFeedMapperKt$toEntity$1.L$0 = transactionsFeedFiltersResponse2;
                        transactionsFeedMapperKt$toEntity$1.L$1 = rr51Var;
                        transactionsFeedMapperKt$toEntity$1.label = 2;
                        Object b2 = aVar2.b(filtersDivData, transactionsFeedMapperKt$toEntity$1);
                        if (b2 != coroutineSingletons) {
                            transactionsFeedFiltersResponse3 = transactionsFeedFiltersResponse2;
                            obj = b2;
                            if (obj instanceof Result.Failure) {
                            }
                            rr51Var2 = (rr51) obj;
                            toolbarData = transactionsFeedFiltersResponse3.getToolbarData();
                            if (toolbarData != null) {
                                Text.Constant i3 = g8e.i(Text.Companion, title);
                                String subtitle = toolbarData.getSubtitle();
                                ve01Var = new ve01(i3, subtitle != null ? new Text.Constant(subtitle) : null);
                            }
                            return new we01(rr51Var, rr51Var2, ve01Var);
                        }
                        return coroutineSingletons;
                    }
                    transactionsFeedMapperKt$toEntity$1.L$0 = transactionsFeedFiltersResponse;
                    transactionsFeedMapperKt$toEntity$1.L$1 = aVar;
                    transactionsFeedMapperKt$toEntity$1.label = 1;
                    b = aVar.b(headerDivData, transactionsFeedMapperKt$toEntity$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rr51Var = (rr51) transactionsFeedMapperKt$toEntity$1.L$1;
                        transactionsFeedFiltersResponse3 = (TransactionsFeedFiltersResponse) transactionsFeedMapperKt$toEntity$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        if (obj instanceof Result.Failure) {
                            obj = null;
                        }
                        rr51Var2 = (rr51) obj;
                        toolbarData = transactionsFeedFiltersResponse3.getToolbarData();
                        if (toolbarData != null && (title = toolbarData.getTitle()) != null) {
                            Text.Constant i32 = g8e.i(Text.Companion, title);
                            String subtitle2 = toolbarData.getSubtitle();
                            ve01Var = new ve01(i32, subtitle2 != null ? new Text.Constant(subtitle2) : null);
                        }
                        return new we01(rr51Var, rr51Var2, ve01Var);
                    }
                    com.ybsdk.feature.divkit.api.domain.a aVar3 = (com.ybsdk.feature.divkit.api.domain.a) transactionsFeedMapperKt$toEntity$1.L$1;
                    TransactionsFeedFiltersResponse transactionsFeedFiltersResponse4 = (TransactionsFeedFiltersResponse) transactionsFeedMapperKt$toEntity$1.L$0;
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj2).getValue();
                    aVar = aVar3;
                    transactionsFeedFiltersResponse = transactionsFeedFiltersResponse4;
                    b = value;
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                com.ybsdk.feature.divkit.api.domain.a aVar4 = aVar;
                transactionsFeedFiltersResponse2 = transactionsFeedFiltersResponse;
                rr51Var = (rr51) b;
                aVar2 = aVar4;
                filtersDivData = transactionsFeedFiltersResponse2.getFiltersDivData();
                if (filtersDivData == null) {
                }
            }
        }
        transactionsFeedMapperKt$toEntity$1 = new TransactionsFeedMapperKt$toEntity$1(continuationImpl);
        Object obj22 = transactionsFeedMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsFeedMapperKt$toEntity$1.label;
        ve01 ve01Var2 = null;
        ve01Var2 = null;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        com.ybsdk.feature.divkit.api.domain.a aVar42 = aVar;
        transactionsFeedFiltersResponse2 = transactionsFeedFiltersResponse;
        rr51Var = (rr51) b;
        aVar2 = aVar42;
        filtersDivData = transactionsFeedFiltersResponse2.getFiltersDivData();
        if (filtersDivData == null) {
        }
    }
}
