package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.wfa;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassesBuyStatusResponseDto$Pending", "Lwfa;", "Companion", "Ui", "com/yandex/go/chargers/passes/data/h0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesBuyStatusResponseDto$Pending implements wfa {
    public static final h0 Companion = new h0();
    public final String a;
    public final Ui b;

    public /* synthetic */ ChargersPassesBuyStatusResponseDto$Pending(int i, String str, Ui ui) {
        this.a = (i & 1) == 0 ? "pending" : str;
        if ((i & 2) == 0) {
            this.b = new Ui(0);
        } else {
            this.b = ui;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesBuyStatusResponseDto$Pending)) {
            return false;
        }
        ChargersPassesBuyStatusResponseDto$Pending chargersPassesBuyStatusResponseDto$Pending = (ChargersPassesBuyStatusResponseDto$Pending) obj;
        return jl40.l(this.a, chargersPassesBuyStatusResponseDto$Pending.a) && jl40.l(this.b, chargersPassesBuyStatusResponseDto$Pending.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Pending(status=" + this.a + ", ui=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyStatusResponseDto$Pending$Ui;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Ui {
        public static final i0 Companion = new i0();
        public final FormattedText a;

        public /* synthetic */ Ui(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public Ui() {
            this(0);
        }

        public Ui(int i) {
            this.a = FormattedText.c;
        }
    }

    public ChargersPassesBuyStatusResponseDto$Pending() {
        Ui ui = new Ui(0);
        this.a = "pending";
        this.b = ui;
    }
}
