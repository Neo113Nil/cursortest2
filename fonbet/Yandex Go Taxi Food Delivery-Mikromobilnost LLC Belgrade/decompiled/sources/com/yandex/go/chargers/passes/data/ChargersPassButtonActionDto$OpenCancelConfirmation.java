package com.yandex.go.chargers.passes.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassButtonActionDto$OpenCancelConfirmation", "Lcom/yandex/go/chargers/passes/data/i;", "Companion", "com/yandex/go/chargers/passes/data/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassButtonActionDto$OpenCancelConfirmation extends i {
    public static final d Companion = new d();
    public final String a;
    public final String b;
    public final ChargersPassCancelConfirmationDetailsDto c;

    public ChargersPassButtonActionDto$OpenCancelConfirmation(int i, String str, String str2, ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto) {
        this.a = (i & 1) == 0 ? "open_cancel_confirmation" : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new ChargersPassCancelConfirmationDetailsDto(0);
        } else {
            this.c = chargersPassCancelConfirmationDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassButtonActionDto$OpenCancelConfirmation)) {
            return false;
        }
        ChargersPassButtonActionDto$OpenCancelConfirmation chargersPassButtonActionDto$OpenCancelConfirmation = (ChargersPassButtonActionDto$OpenCancelConfirmation) obj;
        return jl40.l(this.a, chargersPassButtonActionDto$OpenCancelConfirmation.a) && jl40.l(this.b, chargersPassButtonActionDto$OpenCancelConfirmation.b) && jl40.l(this.c, chargersPassButtonActionDto$OpenCancelConfirmation.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenCancelConfirmation(type=", this.a, ", passId=", this.b, ", details=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ChargersPassButtonActionDto$OpenCancelConfirmation() {
        ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto = new ChargersPassCancelConfirmationDetailsDto(0);
        this.a = "open_cancel_confirmation";
        this.b = "";
        this.c = chargersPassCancelConfirmationDetailsDto;
    }
}
