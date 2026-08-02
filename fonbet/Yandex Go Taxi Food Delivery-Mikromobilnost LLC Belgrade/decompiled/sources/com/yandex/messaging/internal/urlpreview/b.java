package com.yandex.messaging.internal.urlpreview;

import com.yandex.messaging.core.net.entities.GetUrlPreviewRequestParam;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1;
import defpackage.c9v;
import defpackage.fse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final to3 a;
    public final kse b;
    public final c9v c = new c9v(1000);

    public b(to3 to3Var, kse kseVar) {
        this.a = to3Var;
        this.b = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GetUrlPreviewRequestParam getUrlPreviewRequestParam, ContinuationImpl continuationImpl) {
        UrlPreviewRequestController$requestUrlPreview$1 urlPreviewRequestController$requestUrlPreview$1;
        int i;
        GetUrlPreviewResponse getUrlPreviewResponse;
        if (continuationImpl instanceof UrlPreviewRequestController$requestUrlPreview$1) {
            urlPreviewRequestController$requestUrlPreview$1 = (UrlPreviewRequestController$requestUrlPreview$1) continuationImpl;
            int i2 = urlPreviewRequestController$requestUrlPreview$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urlPreviewRequestController$requestUrlPreview$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urlPreviewRequestController$requestUrlPreview$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urlPreviewRequestController$requestUrlPreview$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GetUrlPreviewResponse getUrlPreviewResponse2 = (GetUrlPreviewResponse) this.c.j(getUrlPreviewRequestParam.getUrl());
                    if (getUrlPreviewResponse2 != null) {
                        return getUrlPreviewResponse2;
                    }
                    fse fseVar = this.b.e;
                    urlPreviewRequestController$requestUrlPreview$1.L$0 = this;
                    urlPreviewRequestController$requestUrlPreview$1.L$1 = getUrlPreviewRequestParam;
                    urlPreviewRequestController$requestUrlPreview$1.label = 1;
                    if (fseVar == null) {
                        fseVar = urlPreviewRequestController$requestUrlPreview$1.get_context();
                    }
                    obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1(null, this.a, getUrlPreviewRequestParam), urlPreviewRequestController$requestUrlPreview$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    getUrlPreviewRequestParam = (GetUrlPreviewRequestParam) urlPreviewRequestController$requestUrlPreview$1.L$1;
                    this = (b) urlPreviewRequestController$requestUrlPreview$1.L$0;
                    kotlin.b.b(obj);
                }
                getUrlPreviewResponse = (GetUrlPreviewResponse) ((oyj0) obj).b();
                if (getUrlPreviewResponse != null) {
                    return null;
                }
                this.c.y(getUrlPreviewRequestParam.getUrl(), getUrlPreviewResponse);
                return getUrlPreviewResponse;
            }
        }
        urlPreviewRequestController$requestUrlPreview$1 = new UrlPreviewRequestController$requestUrlPreview$1(this, continuationImpl);
        Object obj2 = urlPreviewRequestController$requestUrlPreview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urlPreviewRequestController$requestUrlPreview$1.label;
        if (i != 0) {
        }
        getUrlPreviewResponse = (GetUrlPreviewResponse) ((oyj0) obj2).b();
        if (getUrlPreviewResponse != null) {
        }
    }
}
