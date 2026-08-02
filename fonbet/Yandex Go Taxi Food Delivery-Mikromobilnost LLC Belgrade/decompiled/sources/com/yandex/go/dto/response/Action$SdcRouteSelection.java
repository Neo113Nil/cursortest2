package com.yandex.go.dto.response;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jn;
import defpackage.k4o;
import defpackage.lq;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/dto/response/Action$SdcRouteSelection", "Lcom/yandex/go/dto/response/q1;", "Companion", "Screen", "ScreenType", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/dto/response/z0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$SdcRouteSelection extends q1 {
    public static final z0 Companion = new z0();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(26)), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/dto/response/Action$SdcRouteSelection$ScreenType;", "", "Companion", "com/yandex/go/dto/response/b1", "SOURCE", "DESTINATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ScreenType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b1 Companion;
        public static final ScreenType DESTINATION;
        public static final ScreenType SOURCE;

        static {
            ScreenType screenType = new ScreenType("SOURCE", 0);
            SOURCE = screenType;
            ScreenType screenType2 = new ScreenType("DESTINATION", 1);
            DESTINATION = screenType2;
            ScreenType[] screenTypeArr = {screenType, screenType2};
            $VALUES = screenTypeArr;
            $ENTRIES = kotlin.enums.a.a(screenTypeArr);
            Companion = new b1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(5));
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    public Action$SdcRouteSelection(int i, String str, String str2, String str3, String str4, List list) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.SDC_ROUTE_SELECTION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$SdcRouteSelection)) {
            return false;
        }
        Action$SdcRouteSelection action$SdcRouteSelection = (Action$SdcRouteSelection) obj;
        return jl40.l(this.a, action$SdcRouteSelection.a) && jl40.l(this.b, action$SdcRouteSelection.b) && jl40.l(this.c, action$SdcRouteSelection.c) && jl40.l(this.d, action$SdcRouteSelection.d) && jl40.l(this.e, action$SdcRouteSelection.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("SdcRouteSelection(mode=", this.a, ", tariffClass=", this.b, ", screens=");
        oyr.D(", onboardingPromoId=", this.d, ", unavailableReasonFullscreenId=", v, this.c);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$SdcRouteSelection$Button;", "", "Companion", "$serializer", "com/yandex/go/dto/response/y0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class Button {
        public static final y0 Companion = new y0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ Button(int i, String str, String str2, String str3) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return jl40.l(this.a, button.a) && jl40.l(this.b, button.b) && jl40.l(this.c, button.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("Button(text=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
        }

        public Button(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public Button() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$SdcRouteSelection$Screen;", "", "Companion", "$serializer", "com/yandex/go/dto/response/a1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class Screen {
        public static final a1 Companion = new a1();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(4)), null, null, null};
        public final ScreenType a;
        public final String b;
        public final String c;
        public final Button d;

        public /* synthetic */ Screen(int i, ScreenType screenType, String str, String str2, Button button) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = screenType;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = new Button(0);
            } else {
                this.d = button;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.a == screen.a && jl40.l(this.b, screen.b) && jl40.l(this.c, screen.c) && jl40.l(this.d, screen.d);
        }

        public final int hashCode() {
            ScreenType screenType = this.a;
            int b = unr0.b((screenType == null ? 0 : screenType.hashCode()) * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Screen(screenType=" + this.a + ", text=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
        }

        public Screen() {
            Button button = new Button(0);
            this.a = null;
            this.b = "";
            this.c = null;
            this.d = button;
        }
    }

    public Action$SdcRouteSelection() {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = "";
        this.e = "";
    }
}
