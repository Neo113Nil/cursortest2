package com.ybsdk.screens.divbottomsheet;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetApi;", "", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;", "b", "(Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/screens/divbottomsheet/ProTopupBottomSheetRequest;", "a", "(Lcom/ybsdk/screens/divbottomsheet/ProTopupBottomSheetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DivBottomSheetApi {
    @s490("/v1/pro_topup_bottom_sheet")
    Object a(@q76 ProTopupBottomSheetRequest proTopupBottomSheetRequest, Continuation<? super Result<DataWithStatusResponse<DivBottomSheetResponse>>> continuation);

    @s490("/v1/notice/get")
    Object b(@q76 DivBottomSheetRequest divBottomSheetRequest, Continuation<? super Result<DataWithStatusResponse<DivBottomSheetResponse>>> continuation);
}
