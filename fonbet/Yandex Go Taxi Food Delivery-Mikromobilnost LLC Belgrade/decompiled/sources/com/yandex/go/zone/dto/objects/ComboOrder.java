package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboOrder;", "", "Companion", "PopupProperties", "BufferListItem", "FakePassengersNumberSelector", "com/yandex/go/zone/dto/objects/e0", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ComboOrder {
    public static final e0 Companion = new e0();
    public static final ComboOrder b = new ComboOrder(0);
    public final PopupProperties a;

    public ComboOrder(int i, PopupProperties popupProperties) {
        if ((i & 1) != 0) {
            this.a = popupProperties;
        } else {
            PopupProperties.Companion.getClass();
            this.a = PopupProperties.g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComboOrder) && jl40.l(this.a, ((ComboOrder) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComboOrder(popupProperties=" + this.a + Extension.C_BRAKE;
    }

    public ComboOrder() {
        this(0);
    }

    public ComboOrder(int i) {
        PopupProperties.Companion.getClass();
        this.a = PopupProperties.g;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboOrder$BufferListItem;", "", "Companion", "com/yandex/go/zone/dto/objects/d0", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BufferListItem {
        public static final d0 Companion = new d0();
        public static final BufferListItem c = new BufferListItem(0);
        public final String a;
        public final String b;

        public /* synthetic */ BufferListItem(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BufferListItem)) {
                return false;
            }
            BufferListItem bufferListItem = (BufferListItem) obj;
            return jl40.l(this.a, bufferListItem.a) && jl40.l(this.b, bufferListItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("BufferListItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
        }

        public BufferListItem(int i) {
            this.a = "";
            this.b = "";
        }

        public BufferListItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboOrder$FakePassengersNumberSelector;", "", "Companion", "com/yandex/go/zone/dto/objects/f0", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class FakePassengersNumberSelector {
        public static final f0 Companion = new f0();
        public static final FakePassengersNumberSelector f = new FakePassengersNumberSelector(0);
        public final String a;
        public final String b;
        public final int c;
        public final int d;
        public final String e;

        public /* synthetic */ FakePassengersNumberSelector(int i, int i2, int i3, String str, String str2, String str3) {
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
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FakePassengersNumberSelector)) {
                return false;
            }
            FakePassengersNumberSelector fakePassengersNumberSelector = (FakePassengersNumberSelector) obj;
            return jl40.l(this.a, fakePassengersNumberSelector.a) && jl40.l(this.b, fakePassengersNumberSelector.b) && this.c == fakePassengersNumberSelector.c && this.d == fakePassengersNumberSelector.d && jl40.l(this.e, fakePassengersNumberSelector.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("FakePassengersNumberSelector(title=", this.a, ", subtitle=", this.b, ", selectorMaxNumber=");
            vfc.u(this.c, this.d, ", maxAllowedNumber=", ", errorTextTooManyPassengers=", v);
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public FakePassengersNumberSelector(int i) {
            this.a = "";
            this.b = "";
            this.c = 0;
            this.d = 0;
            this.e = "";
        }

        public FakePassengersNumberSelector() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ComboOrder$PopupProperties;", "", "Companion", "com/yandex/go/zone/dto/objects/g0", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PopupProperties {
        public static final g0 Companion = new g0();
        public static final PopupProperties g = new PopupProperties(0);
        public final n7v a;
        public final String b;
        public final String c;
        public final String d;
        public final BufferListItem e;
        public final FakePassengersNumberSelector f;

        public PopupProperties(int i, n7v n7vVar, String str, String str2, String str3, BufferListItem bufferListItem, FakePassengersNumberSelector fakePassengersNumberSelector) {
            this.a = (i & 1) == 0 ? null : n7vVar;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                BufferListItem.Companion.getClass();
                this.e = BufferListItem.c;
            } else {
                this.e = bufferListItem;
            }
            if ((i & 32) != 0) {
                this.f = fakePassengersNumberSelector;
            } else {
                FakePassengersNumberSelector.Companion.getClass();
                this.f = FakePassengersNumberSelector.f;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopupProperties)) {
                return false;
            }
            PopupProperties popupProperties = (PopupProperties) obj;
            return jl40.l(this.a, popupProperties.a) && jl40.l(this.b, popupProperties.b) && jl40.l(this.c, popupProperties.c) && jl40.l(this.d, popupProperties.d) && jl40.l(this.e, popupProperties.e) && jl40.l(this.f, popupProperties.f);
        }

        public final int hashCode() {
            n7v n7vVar = this.a;
            return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PopupProperties(icon=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", declineButtonText=");
            g8e.D(sb, this.c, ", confirmButtonText=", this.d, ", bufferList=");
            sb.append(this.e);
            sb.append(", fakePassengersNumberSelector=");
            sb.append(this.f);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public PopupProperties() {
            this(0);
        }

        public PopupProperties(int i) {
            BufferListItem.Companion.getClass();
            FakePassengersNumberSelector.Companion.getClass();
            this.a = null;
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = BufferListItem.c;
            this.f = FakePassengersNumberSelector.f;
        }
    }
}
