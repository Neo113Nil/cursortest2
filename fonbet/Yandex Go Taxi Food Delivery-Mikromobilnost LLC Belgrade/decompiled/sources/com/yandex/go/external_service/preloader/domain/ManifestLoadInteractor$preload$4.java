package com.yandex.go.external_service.preloader.domain;

import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ManifestLoadInteractor$preload$4 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return g.a((g) this.receiver, (StaticInfo) obj, (Continuation) obj2);
    }
}
