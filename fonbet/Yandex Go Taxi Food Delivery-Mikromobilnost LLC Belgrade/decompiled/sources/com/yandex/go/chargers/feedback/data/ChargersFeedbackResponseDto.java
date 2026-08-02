package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFeedbackResponseDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackResponseDto {
    public static final e Companion = new e();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(10)), null, null, null};
    public final List a;
    public final ChargersFeedbackScreenBannerDto b;
    public final ChargersFeedbackScreenPromoPlateDto c;
    public final ChargersFeedbackItemsDto d;

    public /* synthetic */ ChargersFeedbackResponseDto(int i, List list, ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto, ChargersFeedbackScreenPromoPlateDto chargersFeedbackScreenPromoPlateDto, ChargersFeedbackItemsDto chargersFeedbackItemsDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = chargersFeedbackScreenBannerDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersFeedbackScreenPromoPlateDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chargersFeedbackItemsDto;
        }
    }

    public ChargersFeedbackResponseDto() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
