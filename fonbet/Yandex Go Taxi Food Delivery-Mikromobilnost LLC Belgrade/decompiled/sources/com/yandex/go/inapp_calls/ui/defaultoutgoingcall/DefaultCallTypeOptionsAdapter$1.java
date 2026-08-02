package com.yandex.go.inapp_calls.ui.defaultoutgoingcall;

import defpackage.c8h;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DefaultCallTypeOptionsAdapter$1 extends FunctionReferenceImpl implements wls {
    public static final DefaultCallTypeOptionsAdapter$1 b = new DefaultCallTypeOptionsAdapter$1(2, 0, c8h.class, "isTheSame", "isTheSame(Lcom/yandex/go/inapp_calls/ui/defaultoutgoingcall/DefaultCallTypeUiStateItem;)Z");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(((c8h) obj).a == ((c8h) obj2).a);
    }
}
