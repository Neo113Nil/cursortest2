package ru.ok.android.api.common;

import java.io.IOException;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: AbstractApiRequest.kt */
/* loaded from: classes9.dex */
public abstract class AbstractApiRequest implements ApiRequest {
    private volatile ApiParamList cachedParams;

    private final synchronized ApiParamList getParams() {
        ApiParamList apiParamList = this.cachedParams;
        if (apiParamList != null) {
            return apiParamList;
        }
        ApiParamList apiParamList2 = new ApiParamList();
        populateParams(apiParamList2);
        this.cachedParams = apiParamList2;
        return apiParamList2;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return getParams().canRepeat$odnoklassniki_android_api_release();
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(ApiParamList apiParamList);

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldPost() {
        return getParams().shouldPost$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean willWriteParams() {
        return getParams().willWrite$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean willWriteSupplyParams() {
        return getParams().willWriteSupplied$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        getParams().write$odnoklassniki_android_api_release(jsonWriter);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final void writeSupplyParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        getParams().writeSupplied$odnoklassniki_android_api_release(jsonWriter);
    }
}
