package com.yandex.go.flex.common.descriptors.action;

import androidx.lifecycle.Lifecycle;
import defpackage.mu;
import defpackage.ou;
import defpackage.qoi0;
import defpackage.tls;
import defpackage.znt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class d {
    public final mu a(Lifecycle lifecycle, tls tlsVar) {
        return new mu("GoLoadDocumentAction", qoi0.a(znt.class), new GoLoadDocumentActionDescriptorFactoryImpl$createDescriptor$1(0, znt.INSTANCE, znt.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ou(20, lifecycle, tlsVar)), EmptyList.a, false);
    }
}
