package com.yandex.plus.di;

import defpackage.sls;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class BasePlusDiComponentHolder$components$2 extends FunctionReferenceImpl implements sls {
    public static final BasePlusDiComponentHolder$components$2 b = new BasePlusDiComponentHolder$components$2(0, 0, ConcurrentHashMap.class, "<init>", "<init>()V");

    @Override // defpackage.sls
    public final Object invoke() {
        return new ConcurrentHashMap();
    }
}
