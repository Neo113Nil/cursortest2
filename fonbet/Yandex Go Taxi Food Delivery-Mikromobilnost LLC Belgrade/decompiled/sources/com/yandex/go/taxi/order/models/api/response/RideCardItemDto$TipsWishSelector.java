package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.sjk0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "", "Companion", "Background", "com/yandex/go/taxi/order/models/api/response/w6", "wjk0", "Style", "StyleType", "$serializer", "com/yandex/go/taxi/order/models/api/response/s6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$TipsWishSelector extends a7 {
    public static final s6 Companion = new s6();
    public static final i3y[] k;
    public final String a;
    public final String b;
    public final Integer c;
    public final FormattedText d;
    public final FormattedText e;
    public final Background f;
    public final w6 g;
    public final List h;
    public final SlotItemDto i;
    public final List j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector$StyleType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/y6", "UNKNOWN", "SELECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StyleType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final y6 Companion;
        public static final StyleType SELECTED;
        public static final StyleType UNKNOWN;

        static {
            StyleType styleType = new StyleType("UNKNOWN", 0);
            UNKNOWN = styleType;
            StyleType styleType2 = new StyleType("SELECTED", 1);
            SELECTED = styleType2;
            StyleType[] styleTypeArr = {styleType, styleType2};
            $VALUES = styleTypeArr;
            $ENTRIES = kotlin.enums.a.a(styleTypeArr);
            Companion = new y6();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(19));
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(15)), null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(16))};
    }

    public RideCardItemDto$TipsWishSelector(int i, String str, String str2, Integer num, FormattedText formattedText, FormattedText formattedText2, Background background, w6 w6Var, List list, SlotItemDto slotItemDto, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = background;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = w6Var;
        }
        int i2 = i & 128;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.h = emptyList;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = slotItemDto;
        }
        if ((i & 512) == 0) {
            this.j = emptyList;
        } else {
            this.j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$TipsWishSelector)) {
            return false;
        }
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector = (RideCardItemDto$TipsWishSelector) obj;
        return jl40.l(this.a, rideCardItemDto$TipsWishSelector.a) && jl40.l(this.b, rideCardItemDto$TipsWishSelector.b) && jl40.l(this.c, rideCardItemDto$TipsWishSelector.c) && jl40.l(this.d, rideCardItemDto$TipsWishSelector.d) && jl40.l(this.e, rideCardItemDto$TipsWishSelector.e) && jl40.l(this.f, rideCardItemDto$TipsWishSelector.f) && jl40.l(this.g, rideCardItemDto$TipsWishSelector.g) && jl40.l(this.h, rideCardItemDto$TipsWishSelector.h) && jl40.l(this.i, rideCardItemDto$TipsWishSelector.i) && jl40.l(this.j, rideCardItemDto$TipsWishSelector.j);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int c = unr0.c(unr0.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d.a), 31, this.e.a);
        Background background = this.f;
        int hashCode3 = (c + (background == null ? 0 : background.hashCode())) * 31;
        w6 w6Var = this.g;
        int c2 = unr0.c((hashCode3 + (w6Var == null ? 0 : w6Var.hashCode())) * 31, 31, this.h);
        SlotItemDto slotItemDto = this.i;
        return this.j.hashCode() + ((c2 + (slotItemDto != null ? slotItemDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TipsWishSelector(id=", this.a, ", analyticsId=", this.b, ", subscriptionTipsPosition=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", subtitle=");
        v.append(this.e);
        v.append(", background=");
        v.append(this.f);
        v.append(", content=");
        v.append(this.g);
        v.append(", choiceStyles=");
        v.append(this.h);
        v.append(", subscriptionSlot=");
        v.append(this.i);
        v.append(", choices=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector$Background;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Background {
        public static final r6 Companion = new r6();
        public final String a;
        public final Integer b;

        public /* synthetic */ Background(int i, Integer num, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return jl40.l(this.a, background.a) && jl40.l(this.b, background.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Background(color=" + this.a + ", radius=" + this.b + Extension.C_BRAKE;
        }

        public Background() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$TipsWishSelector$Style;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/x6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Style {
        public static final x6 Companion = new x6();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(18)), null, null};
        public final StyleType a;
        public final String b;
        public final String c;

        public /* synthetic */ Style(int i, StyleType styleType, String str, String str2) {
            this.a = (i & 1) == 0 ? StyleType.UNKNOWN : styleType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return this.a == style.a && jl40.l(this.b, style.b) && jl40.l(this.c, style.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Style(type=");
            sb.append(this.a);
            sb.append(", textColor=");
            sb.append(this.b);
            sb.append(", backgroundColor=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public Style() {
            this.a = StyleType.UNKNOWN;
            this.b = null;
            this.c = null;
        }
    }

    public RideCardItemDto$TipsWishSelector() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = formattedText;
        this.e = formattedText;
        this.f = null;
        this.g = null;
        EmptyList emptyList = EmptyList.a;
        this.h = emptyList;
        this.i = null;
        this.j = emptyList;
    }
}
