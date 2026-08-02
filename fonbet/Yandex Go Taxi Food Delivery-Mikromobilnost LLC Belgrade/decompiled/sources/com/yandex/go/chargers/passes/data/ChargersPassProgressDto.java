package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassProgressDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassProgressDto {
    public static final b0 Companion = new b0();
    public final FormattedText a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public /* synthetic */ ChargersPassProgressDto(int i, FormattedText formattedText, int i2, int i3, String str, String str2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public ChargersPassProgressDto() {
        this(0);
    }

    public ChargersPassProgressDto(int i) {
        this.a = FormattedText.c;
        this.b = 0;
        this.c = 1;
        this.d = "";
        this.e = "";
    }
}
