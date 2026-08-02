package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.syu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubOnboardingDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubOnboardingDto {
    public static final z Companion = new z();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(4))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final int d;
    public final HubOnboardingType e;

    public /* synthetic */ HubOnboardingDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, int i2, HubOnboardingType hubOnboardingType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = Integer.MAX_VALUE;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = HubOnboardingType.UNKNOWN;
        } else {
            this.e = hubOnboardingType;
        }
    }

    public HubOnboardingDto() {
        FormattedText formattedText = FormattedText.c;
        HubOnboardingType hubOnboardingType = HubOnboardingType.UNKNOWN;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = Integer.MAX_VALUE;
        this.e = hubOnboardingType;
    }
}
