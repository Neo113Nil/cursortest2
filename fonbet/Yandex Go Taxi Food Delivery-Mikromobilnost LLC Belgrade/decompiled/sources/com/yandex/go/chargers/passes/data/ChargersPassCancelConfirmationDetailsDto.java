package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nba;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassCancelConfirmationDetailsDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassCancelConfirmationDetailsDto {
    public static final l Companion = new l();
    public static final i3y[] d;
    public final FormattedText a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new nba(9)), kotlin.a.b(lazyThreadSafetyMode, new nba(10))};
    }

    public /* synthetic */ ChargersPassCancelConfirmationDetailsDto(int i, FormattedText formattedText, List list, List list2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassCancelConfirmationDetailsDto)) {
            return false;
        }
        ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto = (ChargersPassCancelConfirmationDetailsDto) obj;
        return jl40.l(this.a, chargersPassCancelConfirmationDetailsDto.a) && jl40.l(this.b, chargersPassCancelConfirmationDetailsDto.b) && jl40.l(this.c, chargersPassCancelConfirmationDetailsDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersPassCancelConfirmationDetailsDto(title=");
        sb.append(this.a);
        sb.append(", instructions=");
        sb.append(this.b);
        sb.append(", buttons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public ChargersPassCancelConfirmationDetailsDto() {
        this(0);
    }

    public ChargersPassCancelConfirmationDetailsDto(int i) {
        this.a = FormattedText.c;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
    }
}
