package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import defpackage.as9;
import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto;", "Las9;", "Companion", "ProgressDiscountPerkDto", "$serializer", "com/yandex/go/chargers/discounts/data/models/g0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersProgressDiscountDetailsDto implements as9 {
    public static final g0 Companion = new g0();
    public static final i3y[] p = {null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(1)), null, null};
    public final FormattedText a;
    public final FormattedText b;
    public final ChargersAttributeDto c;
    public final String d;
    public final ChargersProgressImageParamsDto e;
    public final FormattedText f;
    public final String g;
    public final ChargersProgressImageParamsDto h;
    public final FormattedText i;
    public final int j;
    public final int k;
    public final String l;
    public final List m;
    public final FormattedText n;
    public final ChargersDiscountDetailsButtonDto o;

    public /* synthetic */ ChargersProgressDiscountDetailsDto(int i, FormattedText formattedText, FormattedText formattedText2, ChargersAttributeDto chargersAttributeDto, String str, ChargersProgressImageParamsDto chargersProgressImageParamsDto, FormattedText formattedText3, String str2, ChargersProgressImageParamsDto chargersProgressImageParamsDto2, FormattedText formattedText4, int i2, int i3, String str3, List list, FormattedText formattedText5, ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersAttributeDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = chargersProgressImageParamsDto;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = chargersProgressImageParamsDto2;
        }
        if ((i & 256) == 0) {
            this.i = FormattedText.c;
        } else {
            this.i = formattedText4;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i2;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 4096) == 0) {
            this.m = EmptyList.a;
        } else {
            this.m = list;
        }
        this.n = (i & 8192) == 0 ? FormattedText.c : formattedText5;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = chargersDiscountDetailsButtonDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto$ProgressDiscountPerkDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/h0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ProgressDiscountPerkDto {
        public static final h0 Companion = new h0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ ProgressDiscountPerkDto(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? null : str;
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

        public ProgressDiscountPerkDto() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = formattedText;
        }
    }

    public ChargersProgressDiscountDetailsDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = formattedText;
        this.g = null;
        this.h = null;
        this.i = formattedText;
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = EmptyList.a;
        this.n = formattedText;
        this.o = null;
    }
}
