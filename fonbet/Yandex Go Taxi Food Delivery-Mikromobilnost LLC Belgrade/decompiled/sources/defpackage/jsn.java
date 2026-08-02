package defpackage;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljsn;", "", "Companion", "isn", "hsn", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class jsn {
    public static final isn Companion = new isn();
    public final String a;
    public final String b;

    public /* synthetic */ jsn(int i, String str, String str2) {
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
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int b() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        return hashCode != -1052263181 ? hashCode != 3548 ? hashCode != 848364926 ? (hashCode == 1274697058 && str.equals("confirmation_sent")) ? 2 : 0 : !str.equals("confirmation_error") ? 0 : 3 : !str.equals(WriteBlocks.OK) ? 0 : 1 : !str.equals("not_confirmed") ? 0 : 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsn)) {
            return false;
        }
        jsn jsnVar = (jsn) obj;
        return jl40.l(this.a, jsnVar.a) && jl40.l(this.b, jsnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.p("EmailResponse{status=", this.a, "}");
    }

    public jsn() {
        this.a = null;
        this.b = null;
    }
}
