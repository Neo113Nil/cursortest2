package com.ybsdk.feature.transfer.internal.network.dto.transfer.result;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResult;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultResponse;", "", TarifficatorScenarioActivity.RESULT_KEY, "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;", "widgets", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "<init>", "(Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;Ljava/util/List;)V", "getResult", "()Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;", "getWidgets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetResultResponse {
    private final TransferResult result;
    private final List<AutoTopupWidgetDto> widgets;

    public GetResultResponse(@Json(name = "result") TransferResult transferResult, @Json(name = "widgets") List<AutoTopupWidgetDto> list) {
        this.result = transferResult;
        this.widgets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetResultResponse copy$default(GetResultResponse getResultResponse, TransferResult transferResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            transferResult = getResultResponse.result;
        }
        if ((i & 2) != 0) {
            list = getResultResponse.widgets;
        }
        return getResultResponse.copy(transferResult, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferResult getResult() {
        return this.result;
    }

    public final List<AutoTopupWidgetDto> component2() {
        return this.widgets;
    }

    public final GetResultResponse copy(@Json(name = "result") TransferResult result, @Json(name = "widgets") List<AutoTopupWidgetDto> widgets) {
        return new GetResultResponse(result, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetResultResponse)) {
            return false;
        }
        GetResultResponse getResultResponse = (GetResultResponse) other;
        return jl40.l(this.result, getResultResponse.result) && jl40.l(this.widgets, getResultResponse.widgets);
    }

    public final TransferResult getResult() {
        return this.result;
    }

    public final List<AutoTopupWidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.result.hashCode() * 31;
        List<AutoTopupWidgetDto> list = this.widgets;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GetResultResponse(result=" + this.result + ", widgets=" + this.widgets + Extension.C_BRAKE;
    }
}
