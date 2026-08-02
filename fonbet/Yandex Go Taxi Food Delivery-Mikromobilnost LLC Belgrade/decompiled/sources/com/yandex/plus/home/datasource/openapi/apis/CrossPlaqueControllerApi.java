package com.yandex.plus.home.datasource.openapi.apis;

import defpackage.dy50;
import defpackage.e6d0;
import defpackage.gy50;
import defpackage.jy50;
import defpackage.q76;
import defpackage.s490;
import defpackage.xx50;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/datasource/openapi/apis/CrossPlaqueControllerApi;", "", "", "retryContext", "Ldy50;", "networkPlaquePayloadRequestModel", "Le6d0;", "Lgy50;", "a", "(Ljava/lang/String;Ldy50;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxx50;", "networkPlaqueClickedRequestModel", "Lzy11;", "c", "(Lxx50;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljy50;", "networkPlaqueSeenRequestModel", "b", "(Ljy50;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CrossPlaqueControllerApi {
    @s490("/v1/pullnotifier/plaques")
    Object a(@z8u("X-Plus-Retry-Context") String str, @q76 dy50 dy50Var, Continuation<? super e6d0<gy50>> continuation);

    @s490("/v1/pullnotifier/plaque/seen")
    Object b(@q76 jy50 jy50Var, Continuation<? super e6d0<zy11>> continuation);

    @s490("/v1/pullnotifier/plaque/clicked")
    Object c(@q76 xx50 xx50Var, Continuation<? super e6d0<zy11>> continuation);
}
