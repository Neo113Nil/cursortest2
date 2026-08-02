package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data;

import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.AgreementSheetItemDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.FpsPayEnrollDto;
import defpackage.fl1;
import defpackage.g8e;
import defpackage.m4m0;
import defpackage.ns;
import defpackage.qxy0;
import defpackage.tcc;
import defpackage.vas;
import defpackage.wls;
import defpackage.wpa1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FpsPayRepository$getFpsPayEnrollData$2$1$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FpsPayEnrollDto fpsPayEnrollDto = (FpsPayEnrollDto) obj;
        ((a) this.receiver).getClass();
        Text.Constant i = g8e.i(Text.Companion, fpsPayEnrollDto.getAgreementsSheetTitle());
        PageHeaderEntity k = m4m0.k(fpsPayEnrollDto.getHeader());
        List<AgreementSheetItemDto> agreements = fpsPayEnrollDto.getAgreements();
        ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
        Iterator<T> it = agreements.iterator();
        while (true) {
            AgreementImageEntity agreementImageEntity = null;
            if (!it.hasNext()) {
                return new vas(i, k, g8e.i(Text.Companion, fpsPayEnrollDto.getTitle()), new Text.Constant(fpsPayEnrollDto.getDescription()), qxy0.c(fpsPayEnrollDto.getImage(), null), ns.a(fpsPayEnrollDto.getButton()), fpsPayEnrollDto.getButtonDescription(), arrayList);
            }
            AgreementSheetItemDto agreementSheetItemDto = (AgreementSheetItemDto) it.next();
            String agreementId = agreementSheetItemDto.getAgreementId();
            String title = agreementSheetItemDto.getTitle();
            String description = agreementSheetItemDto.getDescription();
            AgreementImageDto image = agreementSheetItemDto.getImage();
            if (image != null) {
                agreementImageEntity = wpa1.c(image);
            }
            arrayList.add(new fl1(agreementId, title, description, agreementImageEntity));
        }
    }
}
