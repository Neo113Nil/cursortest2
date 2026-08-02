package com.yandex.go.zone.dto.objects;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButton;", "", "Companion", "com/yandex/go/zone/dto/objects/i1", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceScreenButton {
    public static final i1 Companion = new i1();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(25))};
    public static final DeliveryPaidInsuranceScreenButton e = new DeliveryPaidInsuranceScreenButton(0);
    public final FormattedText a;
    public final FormattedText b;
    public final ButtonStyle c;

    public /* synthetic */ DeliveryPaidInsuranceScreenButton(int i, FormattedText formattedText, FormattedText formattedText2, ButtonStyle buttonStyle) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = ButtonStyle.MAIN;
        } else {
            this.c = buttonStyle;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ButtonStyle getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceScreenButton)) {
            return false;
        }
        DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton = (DeliveryPaidInsuranceScreenButton) obj;
        return jl40.l(this.a, deliveryPaidInsuranceScreenButton.a) && jl40.l(this.b, deliveryPaidInsuranceScreenButton.b) && this.c == deliveryPaidInsuranceScreenButton.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("DeliveryPaidInsuranceScreenButton(title=", this.a, ", subtitle=", this.b, ", style=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public DeliveryPaidInsuranceScreenButton() {
        this(0);
    }

    public DeliveryPaidInsuranceScreenButton(int i) {
        FormattedText formattedText = FormattedText.c;
        ButtonStyle buttonStyle = ButtonStyle.MAIN;
        this.a = formattedText;
        this.b = null;
        this.c = buttonStyle;
    }
}
