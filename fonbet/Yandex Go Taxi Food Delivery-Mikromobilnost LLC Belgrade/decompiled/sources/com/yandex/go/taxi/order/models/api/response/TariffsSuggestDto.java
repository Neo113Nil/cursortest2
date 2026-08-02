package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.mpx0;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TariffsSuggestDto;", "", "Companion", "TariffDetailsDto", "ButtonsList", "TariffButtonDto", "SelectionMode", "$serializer", "com/yandex/go/taxi/order/models/api/response/a8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TariffsSuggestDto {
    public static final a8 Companion = new a8();
    public static final i3y[] g;
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final ButtonsList d;
    public final String e;
    public final SelectionMode f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TariffsSuggestDto$SelectionMode;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/b8", "MULTI_CHOICE", "SINGLE_CHOICE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SelectionMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SelectionMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b8 Companion;
        public static final SelectionMode MULTI_CHOICE;
        public static final SelectionMode SINGLE_CHOICE;

        static {
            SelectionMode selectionMode = new SelectionMode("MULTI_CHOICE", 0);
            MULTI_CHOICE = selectionMode;
            SelectionMode selectionMode2 = new SelectionMode("SINGLE_CHOICE", 1);
            SINGLE_CHOICE = selectionMode2;
            SelectionMode[] selectionModeArr = {selectionMode, selectionMode2};
            $VALUES = selectionModeArr;
            $ENTRIES = kotlin.enums.a.a(selectionModeArr);
            Companion = new b8();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(6));
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new mpx0(4)), null, null, kotlin.a.b(lazyThreadSafetyMode, new mpx0(5))};
    }

    public /* synthetic */ TariffsSuggestDto(int i, FormattedText formattedText, FormattedText formattedText2, List list, ButtonsList buttonsList, String str, SelectionMode selectionMode) {
        if (32 != (i & 32)) {
            qje.Z(i, 32, TariffsSuggestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = buttonsList;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        this.f = selectionMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffsSuggestDto)) {
            return false;
        }
        TariffsSuggestDto tariffsSuggestDto = (TariffsSuggestDto) obj;
        return jl40.l(this.a, tariffsSuggestDto.a) && jl40.l(this.b, tariffsSuggestDto.b) && jl40.l(this.c, tariffsSuggestDto.c) && jl40.l(this.d, tariffsSuggestDto.d) && jl40.l(this.e, tariffsSuggestDto.e) && this.f == tariffsSuggestDto.f;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        ButtonsList buttonsList = this.d;
        int hashCode = (c + (buttonsList == null ? 0 : buttonsList.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("TariffsSuggestDto(title=", this.a, ", subtitle=", this.b, ", tariffs=");
        r.append(this.c);
        r.append(", buttons=");
        r.append(this.d);
        r.append(", suggestId=");
        r.append(this.e);
        r.append(", selectionMode=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TariffsSuggestDto$TariffButtonDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/c8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TariffButtonDto {
        public static final c8 Companion = new c8();
        public final FormattedText a;

        public /* synthetic */ TariffButtonDto(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TariffButtonDto) && jl40.l(this.a, ((TariffButtonDto) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return ly3.p("TariffButtonDto(title=", Extension.C_BRAKE, this.a);
        }

        public TariffButtonDto() {
            this.a = FormattedText.c;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TariffsSuggestDto$ButtonsList;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/z7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ButtonsList {
        public static final z7 Companion = new z7();
        public final TariffButtonDto a;
        public final TariffButtonDto b;

        public /* synthetic */ ButtonsList(int i, TariffButtonDto tariffButtonDto, TariffButtonDto tariffButtonDto2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = tariffButtonDto;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = tariffButtonDto2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonsList)) {
                return false;
            }
            ButtonsList buttonsList = (ButtonsList) obj;
            return jl40.l(this.a, buttonsList.a) && jl40.l(this.b, buttonsList.b);
        }

        public final int hashCode() {
            TariffButtonDto tariffButtonDto = this.a;
            int hashCode = (tariffButtonDto == null ? 0 : tariffButtonDto.hashCode()) * 31;
            TariffButtonDto tariffButtonDto2 = this.b;
            return hashCode + (tariffButtonDto2 != null ? tariffButtonDto2.hashCode() : 0);
        }

        public final String toString() {
            return "ButtonsList(updateTariffsButton=" + this.a + ", unavailableButton=" + this.b + Extension.C_BRAKE;
        }

        public ButtonsList() {
            this.a = null;
            this.b = null;
        }
    }

    public TariffsSuggestDto() {
        FormattedText formattedText = FormattedText.c;
        SelectionMode selectionMode = SelectionMode.MULTI_CHOICE;
        this.a = formattedText;
        this.b = formattedText;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
        this.f = selectionMode;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TariffsSuggestDto$TariffDetailsDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TariffDetailsDto {
        public static final d8 Companion = new d8();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final String d;
        public final FormattedText e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final boolean j;
        public final String k;

        public /* synthetic */ TariffDetailsDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, FormattedText formattedText3, String str3, boolean z, boolean z2, String str4, boolean z3, String str5) {
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
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str4;
            }
            if ((i & 512) == 0) {
                this.j = false;
            } else {
                this.j = z3;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = str5;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffDetailsDto)) {
                return false;
            }
            TariffDetailsDto tariffDetailsDto = (TariffDetailsDto) obj;
            return jl40.l(this.a, tariffDetailsDto.a) && jl40.l(this.b, tariffDetailsDto.b) && jl40.l(this.c, tariffDetailsDto.c) && jl40.l(this.d, tariffDetailsDto.d) && jl40.l(this.e, tariffDetailsDto.e) && jl40.l(this.f, tariffDetailsDto.f) && this.g == tariffDetailsDto.g && this.h == tariffDetailsDto.h && jl40.l(this.i, tariffDetailsDto.i) && this.j == tariffDetailsDto.j && jl40.l(this.k, tariffDetailsDto.k);
        }

        public final int hashCode() {
            int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
            String str = this.d;
            int c2 = unr0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.a);
            String str2 = this.f;
            int e = unr0.e(unr0.e((c2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h);
            String str3 = this.i;
            int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
            String str4 = this.k;
            return e2 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder q = xvz.q("TariffDetailsDto(tariffName=", this.a, ", title=", ", subtitle=", this.b);
            q.append(this.c);
            q.append(", carIconTag=");
            q.append(this.d);
            q.append(", price=");
            q.append(this.e);
            q.append(", cashbackValue=");
            q.append(this.f);
            q.append(", isSelected=");
            nnm.v(", isEnabled=", ", estimatedTimeText=", q, this.g, this.h);
            tse0.y(this.i, ", highlightEta=", ", confirmModalId=", q, this.j);
            return oyr.t(q, this.k, Extension.C_BRAKE);
        }

        public TariffDetailsDto() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
            this.d = null;
            this.e = formattedText;
            this.f = null;
            this.g = false;
            this.h = false;
            this.i = null;
            this.j = false;
            this.k = null;
        }
    }
}
