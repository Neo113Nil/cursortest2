package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b64;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jl70;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wh60;
import defpackage.y570;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification;", "Lwh60;", "Companion", "ListItem", "IconWithBadge", "Style", "Buttons", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/taxi/order/models/api/cancel/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderCancelNotification implements wh60 {
    public static final g0 Companion = new g0();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(28)), null};
    public final String a;
    public final Style b;
    public final IconWithBadge c;
    public final String d;
    public final String e;
    public final List f;
    public final Buttons g;

    public /* synthetic */ OrderCancelNotification(int i, String str, Style style, IconWithBadge iconWithBadge, String str2, String str3, List list, Buttons buttons) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = style;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iconWithBadge;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = new Buttons(0);
        } else {
            this.g = buttons;
        }
    }

    public final boolean a() {
        return (evu0.J(this.e) || evu0.J(this.d)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCancelNotification)) {
            return false;
        }
        OrderCancelNotification orderCancelNotification = (OrderCancelNotification) obj;
        return jl40.l(this.a, orderCancelNotification.a) && jl40.l(this.b, orderCancelNotification.b) && jl40.l(this.c, orderCancelNotification.c) && jl40.l(this.d, orderCancelNotification.d) && jl40.l(this.e, orderCancelNotification.e) && jl40.l(this.f, orderCancelNotification.f) && jl40.l(this.g, orderCancelNotification.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Style style = this.b;
        int hashCode2 = (hashCode + (style == null ? 0 : style.a.hashCode())) * 31;
        IconWithBadge iconWithBadge = this.c;
        return this.g.hashCode() + unr0.c(unr0.b(unr0.b((hashCode2 + (iconWithBadge != null ? iconWithBadge.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderCancelNotification(id=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", text=");
        tse0.x(this.e, ", listItems=", ", buttons=", sb, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$Style;", "", "Companion", "IconAlignment", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/j0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Style {
        public static final j0 Companion = new j0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(1))};
        public final IconAlignment a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$Style$IconAlignment;", "", "Companion", "com/yandex/go/taxi/order/models/api/cancel/k0", "LEADING", "CENTER", "FULL_SIZE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class IconAlignment {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ IconAlignment[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final IconAlignment CENTER;
            public static final k0 Companion;
            public static final IconAlignment FULL_SIZE;
            public static final IconAlignment LEADING;

            static {
                IconAlignment iconAlignment = new IconAlignment("LEADING", 0);
                LEADING = iconAlignment;
                IconAlignment iconAlignment2 = new IconAlignment("CENTER", 1);
                CENTER = iconAlignment2;
                IconAlignment iconAlignment3 = new IconAlignment("FULL_SIZE", 2);
                FULL_SIZE = iconAlignment3;
                IconAlignment[] iconAlignmentArr = {iconAlignment, iconAlignment2, iconAlignment3};
                $VALUES = iconAlignmentArr;
                $ENTRIES = kotlin.enums.a.a(iconAlignmentArr);
                Companion = new k0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(2));
            }

            public static IconAlignment valueOf(String str) {
                return (IconAlignment) Enum.valueOf(IconAlignment.class, str);
            }

            public static IconAlignment[] values() {
                return (IconAlignment[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Style(int i, IconAlignment iconAlignment) {
            if ((i & 1) == 0) {
                this.a = IconAlignment.LEADING;
            } else {
                this.a = iconAlignment;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Style) && this.a == ((Style) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Style(iconAlignment=" + this.a + Extension.C_BRAKE;
        }

        public Style() {
            this.a = IconAlignment.LEADING;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$Buttons;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/f0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Buttons {
        public static final f0 Companion = new f0();
        public static final i3y[] c;
        public final Orientation a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new y570(29)), kotlin.a.b(lazyThreadSafetyMode, new jl70(0))};
        }

        public /* synthetic */ Buttons(int i, Orientation orientation, List list) {
            this.a = (i & 1) == 0 ? Orientation.VERTICAL : orientation;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Buttons)) {
                return false;
            }
            Buttons buttons = (Buttons) obj;
            return this.a == buttons.a && jl40.l(this.b, buttons.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Buttons(orientation=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
        }

        public Buttons() {
            this(0);
        }

        public Buttons(int i) {
            this.a = Orientation.VERTICAL;
            this.b = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$ListItem;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/i0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ListItem {
        public static final i0 Companion = new i0();
        public final String a;
        public final String b;
        public final n c;

        public /* synthetic */ ListItem(int i, String str, String str2, n nVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = m.INSTANCE;
            } else {
                this.c = nVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) obj;
            return jl40.l(this.a, listItem.a) && jl40.l(this.b, listItem.b) && jl40.l(this.c, listItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder v = b64.v("ListItem(imageTag=", this.a, ", text=", this.b, ", action=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public ListItem() {
            m mVar = m.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$IconWithBadge;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/h0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class IconWithBadge {
        public static final h0 Companion = new h0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ IconWithBadge(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconWithBadge)) {
                return false;
            }
            IconWithBadge iconWithBadge = (IconWithBadge) obj;
            return jl40.l(this.a, iconWithBadge.a) && jl40.l(this.b, iconWithBadge.b) && jl40.l(this.c, iconWithBadge.c) && jl40.l(this.d, iconWithBadge.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("IconWithBadge(imageTag=", this.a, ", imageUrl=", this.b, ", badgeText="), this.c, ", caption=", this.d, Extension.C_BRAKE);
        }

        public IconWithBadge() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/OrderCancelNotification$Button;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/e0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Button {
        public static final e0 Companion = new e0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final n f;

        public /* synthetic */ Button(int i, String str, String str2, String str3, String str4, String str5, n nVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = m.INSTANCE;
            } else {
                this.f = nVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return jl40.l(this.a, button.a) && jl40.l(this.b, button.b) && jl40.l(this.c, button.c) && jl40.l(this.d, button.d) && jl40.l(this.e, button.e) && jl40.l(this.f, button.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder v = b64.v("Button(text=", this.a, ", backgroundColor=", this.b, ", textColor=");
            g8e.D(v, this.c, ", subtitle=", this.d, ", subtitleColor=");
            v.append(this.e);
            v.append(", action=");
            v.append(this.f);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Button() {
            m mVar = m.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = mVar;
        }
    }

    public OrderCancelNotification() {
        Buttons buttons = new Buttons(0);
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = EmptyList.a;
        this.g = buttons;
    }
}
