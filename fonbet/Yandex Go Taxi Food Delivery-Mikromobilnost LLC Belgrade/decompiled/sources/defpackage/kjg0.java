package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$AnswersAlignment;

/* loaded from: classes5.dex */
public final class kjg0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final DeliveryState$Poll$Question$AnswersAlignment d;
    public final boolean e;

    public kjg0(String str, String str2, ArrayList arrayList, DeliveryState$Poll$Question$AnswersAlignment deliveryState$Poll$Question$AnswersAlignment, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = deliveryState$Poll$Question$AnswersAlignment;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjg0)) {
            return false;
        }
        kjg0 kjg0Var = (kjg0) obj;
        return jl40.l(this.a, kjg0Var.a) && jl40.l(this.b, kjg0Var.b) && this.c.equals(kjg0Var.c) && this.d == kjg0Var.d && this.e == kjg0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("QuestionModel(id=", this.a, ", text=", this.b, ", answers=");
        v.append(this.c);
        v.append(", answersAlignment=");
        v.append(this.d);
        v.append(", haveUniqueIds=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
