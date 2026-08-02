package com.yandex.go.chargers.error.api;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/error/api/ChargersErrorDetailsDto;", "", "Companion", "com/yandex/go/chargers/error/api/a", "$serializer", "go-client-android.features.chargers.error:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorDetailsDto {
    public static final a Companion = new a();
    public static final ChargersErrorDetailsDto d = new ChargersErrorDetailsDto(0);
    public final String a;
    public final FormattedText b;
    public final FormattedText c;

    public /* synthetic */ ChargersErrorDetailsDto(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
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
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public ChargersErrorDetailsDto() {
        this(0);
    }

    public ChargersErrorDetailsDto(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
    }
}
