package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupValidationResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.c;
import defpackage.g8e;
import defpackage.gsi0;
import defpackage.hsi0;
import defpackage.tcc;
import defpackage.wls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoTopupSetupRepository$validateRegularAutoTopup$3$1 extends AdaptedFunctionReference implements wls {
    public static final AutoTopupSetupRepository$validateRegularAutoTopup$3$1 a = new AutoTopupSetupRepository$validateRegularAutoTopup$3$1(2, 5, c.class, "toEntity", "toEntity(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponse;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupValidationResultEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        List<RegularAutoTopupValidationResponse.ValidationError> errors = ((RegularAutoTopupValidationResponse) obj).getErrors();
        ArrayList arrayList = new ArrayList(tcc.n(errors, 10));
        for (RegularAutoTopupValidationResponse.ValidationError validationError : errors) {
            arrayList.add(new gsi0(g8e.i(Text.Companion, validationError.getTitle()), d.g(validationError.getMessage())));
        }
        return new hsi0(arrayList);
    }
}
