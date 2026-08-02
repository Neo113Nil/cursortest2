package com.yandex.go.chargers.tariff_item_info.api.data.model;

import defpackage.bxa;
import defpackage.cxa;
import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto;", "", "Companion", "Hint", "Type", "cxa", "$serializer", "com/yandex/go/chargers/tariff_item_info/api/data/model/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTariffDetailItemDto {
    public static final d Companion = new d();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(8))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final cxa e;
    public final Hint f;
    public final boolean g;
    public final Type h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto$Type;", "", "Companion", "com/yandex/go/chargers/tariff_item_info/api/data/model/f", "TARIFF_DETAIL", "TARIFF_DETAIL_WITH_TOP_DIVIDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final Type TARIFF_DETAIL;
        public static final Type TARIFF_DETAIL_WITH_TOP_DIVIDER;

        static {
            Type type = new Type("TARIFF_DETAIL", 0);
            TARIFF_DETAIL = type;
            Type type2 = new Type("TARIFF_DETAIL_WITH_TOP_DIVIDER", 1);
            TARIFF_DETAIL_WITH_TOP_DIVIDER = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(12));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersTariffDetailItemDto(int i2, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, cxa cxaVar, Hint hint, boolean z, Type type) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText3;
        }
        if ((i2 & 16) == 0) {
            this.e = bxa.INSTANCE;
        } else {
            this.e = cxaVar;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = hint;
        }
        if ((i2 & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i2 & 128) == 0) {
            this.h = Type.TARIFF_DETAIL;
        } else {
            this.h = type;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto$Hint;", "", "Companion", "$serializer", "com/yandex/go/chargers/tariff_item_info/api/data/model/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Hint {
        public static final e Companion = new e();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Hint(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public Hint() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    public ChargersTariffDetailItemDto() {
        FormattedText formattedText = FormattedText.c;
        bxa bxaVar = bxa.INSTANCE;
        Type type = Type.TARIFF_DETAIL;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = bxaVar;
        this.f = null;
        this.g = false;
        this.h = type;
    }
}
