package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassButtonDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassButtonDto {
    public static final j Companion = new j();
    public final FormattedText a;
    public final String b;
    public final i c;

    public /* synthetic */ ChargersPassButtonDto(int i, FormattedText formattedText, String str, i iVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = h.INSTANCE;
        } else {
            this.c = iVar;
        }
    }

    public ChargersPassButtonDto() {
        this(0);
    }

    public ChargersPassButtonDto(int i) {
        FormattedText formattedText = FormattedText.c;
        h hVar = h.INSTANCE;
        this.a = formattedText;
        this.b = null;
        this.c = hVar;
    }
}
