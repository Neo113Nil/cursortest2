package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassButtonActionDto$OpenPaymentSettings", "Lcom/yandex/go/chargers/passes/data/i;", "Companion", "com/yandex/go/chargers/passes/data/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassButtonActionDto$OpenPaymentSettings extends i {
    public static final f Companion = new f();
    public final String a;
    public final String b;

    public ChargersPassButtonActionDto$OpenPaymentSettings(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "open_payment_settings" : str;
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
        if (!(obj instanceof ChargersPassButtonActionDto$OpenPaymentSettings)) {
            return false;
        }
        ChargersPassButtonActionDto$OpenPaymentSettings chargersPassButtonActionDto$OpenPaymentSettings = (ChargersPassButtonActionDto$OpenPaymentSettings) obj;
        return jl40.l(this.a, chargersPassButtonActionDto$OpenPaymentSettings.a) && jl40.l(this.b, chargersPassButtonActionDto$OpenPaymentSettings.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenPaymentSettings(type=", this.a, ", passId=", this.b, Extension.C_BRAKE);
    }

    public ChargersPassButtonActionDto$OpenPaymentSettings() {
        this.a = "open_payment_settings";
        this.b = "";
    }
}
