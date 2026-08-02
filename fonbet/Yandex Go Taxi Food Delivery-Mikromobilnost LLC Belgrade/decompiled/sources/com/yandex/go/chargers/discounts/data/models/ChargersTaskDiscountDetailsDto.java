package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.as9;
import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersTaskDiscountDetailsDto;", "Las9;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTaskDiscountDetailsDto implements as9 {
    public static final s0 Companion = new s0();
    public static final i3y[] n = {null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(15)), null, null, null, null};
    public final ChargersDiscountDto a;
    public final FormattedText b;
    public final FormattedText c;
    public final int d;
    public final int e;
    public final String f;
    public final FormattedText g;
    public final FormattedText h;
    public final List i;
    public final FormattedText j;
    public final ChargersDiscountDetailsButtonDto k;
    public final String l;
    public final String m;

    public /* synthetic */ ChargersTaskDiscountDetailsDto(int i, ChargersDiscountDto chargersDiscountDto, FormattedText formattedText, FormattedText formattedText2, int i2, int i3, String str, FormattedText formattedText3, FormattedText formattedText4, List list, FormattedText formattedText5, ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersDiscountDto;
        }
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
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = FormattedText.c;
        } else {
            this.g = formattedText3;
        }
        if ((i & 128) == 0) {
            this.h = FormattedText.c;
        } else {
            this.h = formattedText4;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = FormattedText.c;
        } else {
            this.j = formattedText5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = chargersDiscountDetailsButtonDto;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str2;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str3;
        }
    }

    public ChargersTaskDiscountDetailsDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = formattedText;
        this.c = formattedText;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = formattedText;
        this.h = formattedText;
        this.i = EmptyList.a;
        this.j = formattedText;
        this.k = null;
        this.l = "";
        this.m = "";
    }
}
