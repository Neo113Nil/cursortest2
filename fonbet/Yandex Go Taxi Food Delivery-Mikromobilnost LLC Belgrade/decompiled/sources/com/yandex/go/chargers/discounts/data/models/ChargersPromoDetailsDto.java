package com.yandex.go.chargers.discounts.data.models;

import defpackage.as9;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto;", "Las9;", "Companion", "PromoUsage", "PromoDetailsButtonDto", "$serializer", "com/yandex/go/chargers/discounts/data/models/i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPromoDetailsDto implements as9 {
    public static final i0 Companion = new i0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final PromoUsage d;
    public final FormattedText e;
    public final FormattedText f;
    public final PromoDetailsButtonDto g;

    public /* synthetic */ ChargersPromoDetailsDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, PromoUsage promoUsage, FormattedText formattedText3, FormattedText formattedText4, PromoDetailsButtonDto promoDetailsButtonDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
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
            this.d = null;
        } else {
            this.d = promoUsage;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText3;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = promoDetailsButtonDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto$PromoUsage;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/r0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PromoUsage {
        public static final r0 Companion = new r0();
        public final int a;
        public final int b;
        public final FormattedText c;

        public /* synthetic */ PromoUsage(int i, int i2, int i3, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText;
            }
        }

        public PromoUsage() {
            FormattedText formattedText = FormattedText.c;
            this.a = 0;
            this.b = 0;
            this.c = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto$PromoDetailsButtonDto;", "", "Companion", "com/yandex/go/chargers/discounts/data/models/q0", "$serializer", "com/yandex/go/chargers/discounts/data/models/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PromoDetailsButtonDto {
        public static final j0 Companion = new j0();
        public final FormattedText a;
        public final FormattedText b;
        public final boolean c;
        public final q0 d;

        public /* synthetic */ PromoDetailsButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, boolean z, q0 q0Var) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = p0.INSTANCE;
            } else {
                this.d = q0Var;
            }
        }

        public PromoDetailsButtonDto() {
            FormattedText formattedText = FormattedText.c;
            p0 p0Var = p0.INSTANCE;
            this.a = formattedText;
            this.b = formattedText;
            this.c = false;
            this.d = p0Var;
        }
    }

    public ChargersPromoDetailsDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = formattedText;
        this.c = formattedText;
        this.d = null;
        this.e = null;
        this.f = formattedText;
        this.g = null;
    }
}
