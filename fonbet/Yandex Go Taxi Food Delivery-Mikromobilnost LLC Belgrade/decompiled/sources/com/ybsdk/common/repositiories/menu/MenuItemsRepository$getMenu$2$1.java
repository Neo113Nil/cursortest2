package com.ybsdk.common.repositiories.menu;

import com.ybsdk.network.dto.GetMenuResponse;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class MenuItemsRepository$getMenu$2$1 extends FunctionReferenceImpl implements wls {
    public static final MenuItemsRepository$getMenu$2$1 b = new MenuItemsRepository$getMenu$2$1(2, 1, com.ybsdk.common.mappers.a.class, "toEntity", "toEntity(Lcom/ybsdk/network/dto/GetMenuResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return com.ybsdk.common.mappers.a.a((GetMenuResponse) obj, (Continuation) obj2);
    }
}
