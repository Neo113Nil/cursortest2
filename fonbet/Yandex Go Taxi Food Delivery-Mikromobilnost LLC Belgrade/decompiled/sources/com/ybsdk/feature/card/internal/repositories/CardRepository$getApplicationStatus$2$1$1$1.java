package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.entities.GetApplicationStatusEntity$Status;
import com.ybsdk.feature.card.internal.network.dto.GetApplicationStatusResponse;
import defpackage.c3t;
import defpackage.cn8;
import defpackage.g8e;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CardRepository$getApplicationStatus$2$1$1$1 extends AdaptedFunctionReference implements wls {
    public static final CardRepository$getApplicationStatus$2$1$1$1 a = new CardRepository$getApplicationStatus$2$1$1$1(2, 5, c.class, "toEntity", "toEntity(Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse;)Lcom/ybsdk/feature/card/internal/entities/GetApplicationStatusEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetApplicationStatusEntity$Status getApplicationStatusEntity$Status;
        GetApplicationStatusResponse getApplicationStatusResponse = (GetApplicationStatusResponse) obj;
        int i = cn8.a[getApplicationStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            getApplicationStatusEntity$Status = GetApplicationStatusEntity$Status.PROCESSING;
        } else if (i == 2) {
            getApplicationStatusEntity$Status = GetApplicationStatusEntity$Status.SUCCESS;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            getApplicationStatusEntity$Status = GetApplicationStatusEntity$Status.FAILED;
        }
        GetApplicationStatusEntity$Status getApplicationStatusEntity$Status2 = getApplicationStatusEntity$Status;
        Text.Constant i2 = g8e.i(Text.Companion, getApplicationStatusResponse.getTitle());
        Text.Constant constant = new Text.Constant(getApplicationStatusResponse.getDescription());
        String titleTimeout = getApplicationStatusResponse.getTitleTimeout();
        Text.Constant constant2 = titleTimeout != null ? new Text.Constant(titleTimeout) : null;
        String descriptionTimeout = getApplicationStatusResponse.getDescriptionTimeout();
        return new c3t(getApplicationStatusEntity$Status2, i2, constant, constant2, descriptionTimeout != null ? new Text.Constant(descriptionTimeout) : null, getApplicationStatusResponse.getCardId(), getApplicationStatusResponse.getSupportUrl());
    }
}
