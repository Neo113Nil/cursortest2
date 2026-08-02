package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.wh60;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PickupPointPinNotification;", "Lwh60;", "Companion", "TextWithChevron", "com/yandex/go/taxi/order/models/api/objects/v0", "com/yandex/go/taxi/order/models/api/objects/w0", "com/yandex/go/taxi/order/models/api/objects/a1", "OpenModalAction", "$serializer", "com/yandex/go/taxi/order/models/api/objects/x0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PickupPointPinNotification implements wh60 {
    public static final x0 Companion = new x0();
    public final String a;
    public final TextWithChevron b;
    public final TextWithChevron c;
    public final v0 d;

    public /* synthetic */ PickupPointPinNotification(int i, String str, TextWithChevron textWithChevron, TextWithChevron textWithChevron2, v0 v0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new TextWithChevron(0);
        } else {
            this.b = textWithChevron;
        }
        if ((i & 4) == 0) {
            this.c = new TextWithChevron(0);
        } else {
            this.c = textWithChevron2;
        }
        if ((i & 8) == 0) {
            this.d = a1.INSTANCE;
        } else {
            this.d = v0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickupPointPinNotification)) {
            return false;
        }
        PickupPointPinNotification pickupPointPinNotification = (PickupPointPinNotification) obj;
        return jl40.l(this.a, pickupPointPinNotification.a) && jl40.l(this.b, pickupPointPinNotification.b) && jl40.l(this.c, pickupPointPinNotification.c) && jl40.l(this.d, pickupPointPinNotification.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PickupPointPinNotification(analyticsId=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PickupPointPinNotification$OpenModalAction;", "Lcom/yandex/go/taxi/order/models/api/objects/v0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/y0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OpenModalAction extends v0 {
        public static final y0 Companion = new y0();
        public final String a;

        public OpenModalAction(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenModalAction) && jl40.l(this.a, ((OpenModalAction) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("OpenModalAction(modalId=", this.a, Extension.C_BRAKE);
        }

        public OpenModalAction() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PickupPointPinNotification$TextWithChevron;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/z0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TextWithChevron {
        public static final z0 Companion = new z0();
        public final String a;
        public final boolean b;

        public /* synthetic */ TextWithChevron(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextWithChevron)) {
                return false;
            }
            TextWithChevron textWithChevron = (TextWithChevron) obj;
            return jl40.l(this.a, textWithChevron.a) && this.b == textWithChevron.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.k("TextWithChevron(text=", this.a, ", hasChevron=", this.b, Extension.C_BRAKE);
        }

        public TextWithChevron(int i) {
            this.a = "";
            this.b = false;
        }

        public TextWithChevron() {
            this(0);
        }
    }

    public PickupPointPinNotification() {
        TextWithChevron textWithChevron = new TextWithChevron(0);
        TextWithChevron textWithChevron2 = new TextWithChevron(0);
        a1 a1Var = a1.INSTANCE;
        this.a = "";
        this.b = textWithChevron;
        this.c = textWithChevron2;
        this.d = a1Var;
    }
}
