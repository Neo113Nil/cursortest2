package com.yandex.go.taxi.order.experiments.orderdetails;

import defpackage.b64;
import defpackage.fs70;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/orderdetails/OrderDetailsDriverExperiment;", "Lxn11;", "Companion", "CarImageLayers", "ButtonsProperties", "com/yandex/go/taxi/order/experiments/orderdetails/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderDetailsDriverExperiment implements xn11 {
    public static final d Companion = new d();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(0)), null};
    public static final OrderDetailsDriverExperiment h = new OrderDetailsDriverExperiment(0);
    public final boolean b;
    public final CarImageLayers c;
    public final ButtonsProperties d;
    public final List e;
    public final boolean f;

    public /* synthetic */ OrderDetailsDriverExperiment(int i, boolean z, CarImageLayers carImageLayers, ButtonsProperties buttonsProperties, List list, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new CarImageLayers(0);
        } else {
            this.c = carImageLayers;
        }
        if ((i & 4) == 0) {
            this.d = new ButtonsProperties(0);
        } else {
            this.d = buttonsProperties;
        }
        if ((i & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsDriverExperiment)) {
            return false;
        }
        OrderDetailsDriverExperiment orderDetailsDriverExperiment = (OrderDetailsDriverExperiment) obj;
        return this.b == orderDetailsDriverExperiment.b && jl40.l(this.c, orderDetailsDriverExperiment.c) && jl40.l(this.d, orderDetailsDriverExperiment.d) && jl40.l(this.e, orderDetailsDriverExperiment.e) && this.f == orderDetailsDriverExperiment.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.c((this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderDetailsDriverExperiment(isEnabled=");
        sb.append(this.b);
        sb.append(", layers=");
        sb.append(this.c);
        sb.append(", buttonsProperties=");
        sb.append(this.d);
        sb.append(", ignoredPlaceholders=");
        sb.append(this.e);
        sb.append(", isSearchAnimationEnabled=");
        return x4e.i(sb, this.f, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/orderdetails/OrderDetailsDriverExperiment$ButtonsProperties;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/experiments/orderdetails/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class ButtonsProperties {
        public static final b Companion = new b();
        public final boolean a;
        public final boolean b;

        public /* synthetic */ ButtonsProperties(int i, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonsProperties)) {
                return false;
            }
            ButtonsProperties buttonsProperties = (ButtonsProperties) obj;
            return this.a == buttonsProperties.a && this.b == buttonsProperties.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return ly3.o("ButtonsProperties(shouldFillGreenCallButton=", ", shouldSeparateCommunications=", Extension.C_BRAKE, this.a, this.b);
        }

        public ButtonsProperties(int i) {
            this.a = false;
            this.b = false;
        }

        public ButtonsProperties() {
            this(0);
        }
    }

    public OrderDetailsDriverExperiment() {
        this(0);
    }

    public OrderDetailsDriverExperiment(int i) {
        CarImageLayers carImageLayers = new CarImageLayers(0);
        ButtonsProperties buttonsProperties = new ButtonsProperties(0);
        this.b = false;
        this.c = carImageLayers;
        this.d = buttonsProperties;
        this.e = EmptyList.a;
        this.f = false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/orderdetails/OrderDetailsDriverExperiment$CarImageLayers;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/experiments/orderdetails/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class CarImageLayers {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ CarImageLayers(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
                this.f = "";
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarImageLayers)) {
                return false;
            }
            CarImageLayers carImageLayers = (CarImageLayers) obj;
            return jl40.l(this.a, carImageLayers.a) && jl40.l(this.b, carImageLayers.b) && jl40.l(this.c, carImageLayers.c) && jl40.l(this.d, carImageLayers.d) && jl40.l(this.e, carImageLayers.e) && jl40.l(this.f, carImageLayers.f) && jl40.l(this.g, carImageLayers.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder v = b64.v("CarImageLayers(mask=", this.a, ", shadow=", this.b, ", warmLight=");
            g8e.D(v, this.c, ", softLight=", this.d, ", hardLight=");
            g8e.D(v, this.e, ", glossy=", this.f, ", details=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public CarImageLayers(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
        }

        public CarImageLayers() {
            this(0);
        }
    }
}
