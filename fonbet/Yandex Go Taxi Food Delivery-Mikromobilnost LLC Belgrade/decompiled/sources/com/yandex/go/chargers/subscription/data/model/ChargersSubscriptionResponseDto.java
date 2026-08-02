package com.yandex.go.chargers.subscription.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionResponseDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersSubscriptionResponseDto {
    public static final o Companion = new o();
    public static final i3y[] f;
    public final FormattedText a;
    public final String b;
    public final List c;
    public final FormattedText d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new eua(1)), null, kotlin.a.b(lazyThreadSafetyMode, new eua(2))};
    }

    public /* synthetic */ ChargersSubscriptionResponseDto(int i, String str, List list, List list2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersSubscriptionResponseDto)) {
            return false;
        }
        ChargersSubscriptionResponseDto chargersSubscriptionResponseDto = (ChargersSubscriptionResponseDto) obj;
        return jl40.l(this.a, chargersSubscriptionResponseDto.a) && jl40.l(this.b, chargersSubscriptionResponseDto.b) && jl40.l(this.c, chargersSubscriptionResponseDto.c) && jl40.l(this.d, chargersSubscriptionResponseDto.d) && jl40.l(this.e, chargersSubscriptionResponseDto.e);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        FormattedText formattedText = this.d;
        return this.e.hashCode() + ((c + (formattedText != null ? formattedText.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersSubscriptionResponseDto(title=");
        sb.append(this.a);
        sb.append(", serviceTopIconTag=");
        sb.append(this.b);
        sb.append(", terms=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", buttons=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }

    public ChargersSubscriptionResponseDto() {
        this.a = FormattedText.c;
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = null;
        this.e = emptyList;
    }
}
