package com.yandex.go.chargers.tariff_item_info.api.data.model;

import defpackage.gsq0;
import defpackage.uqa;
import defpackage.xqa;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersStationButtonDto;", "", "Companion", "uqa", "wqa", "rqa", "sqa", "xqa", "vqa", "$serializer", "com/yandex/go/chargers/tariff_item_info/api/data/model/a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationButtonDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final kotlinx.serialization.json.b g;
    public final uqa h;

    public /* synthetic */ ChargersStationButtonDto(int i, FormattedText formattedText, String str, boolean z, boolean z2, boolean z3, boolean z4, kotlinx.serialization.json.b bVar, uqa uqaVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bVar;
        }
        if ((i & 128) == 0) {
            this.h = xqa.INSTANCE;
        } else {
            this.h = uqaVar;
        }
    }

    public ChargersStationButtonDto() {
        FormattedText formattedText = FormattedText.c;
        xqa xqaVar = xqa.INSTANCE;
        this.a = formattedText;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = xqaVar;
    }
}
