package com.yandex.mapkit.maps.core.utils.extensions.collections;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* synthetic */ class CollectionExtensionsKt$equalsBy$2 extends FunctionReferenceImpl implements wls {
    public static final CollectionExtensionsKt$equalsBy$2 INSTANCE = new CollectionExtensionsKt$equalsBy$2();

    public CollectionExtensionsKt$equalsBy$2() {
        super(2, 0, Object.class, "equals", "equals(Ljava/lang/Object;)Z");
    }

    @Override // defpackage.wls
    public final Boolean invoke(Object obj, Object obj2) {
        return Boolean.valueOf(obj.equals(obj2));
    }
}
