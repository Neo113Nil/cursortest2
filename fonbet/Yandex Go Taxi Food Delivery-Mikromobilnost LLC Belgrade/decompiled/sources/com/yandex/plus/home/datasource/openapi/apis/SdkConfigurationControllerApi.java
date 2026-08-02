package com.yandex.plus.home.datasource.openapi.apis;

import defpackage.e6d0;
import defpackage.f060;
import defpackage.wqs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/datasource/openapi/apis/SdkConfigurationControllerApi;", "", "Le6d0;", "Lf060;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SdkConfigurationControllerApi {
    @wqs("/v1/sdk/configuration")
    Object a(Continuation<? super e6d0<f060>> continuation);
}
