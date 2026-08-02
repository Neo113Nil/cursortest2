package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.network.dto.CreateApplicationResponse;
import defpackage.g8e;
import defpackage.u3f;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CardRepository$createApplication$2$1$1 extends AdaptedFunctionReference implements wls {
    public static final CardRepository$createApplication$2$1$1 a = new CardRepository$createApplication$2$1$1(2, 5, c.class, "toEntity", "toEntity(Lcom/ybsdk/feature/card/internal/network/dto/CreateApplicationResponse;)Lcom/ybsdk/feature/card/internal/entities/CreateApplicationEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreateApplicationResponse createApplicationResponse = (CreateApplicationResponse) obj;
        return new u3f(g8e.i(Text.Companion, createApplicationResponse.getTitle()), new Text.Constant(createApplicationResponse.getDescription()), createApplicationResponse.getApplicationId());
    }
}
