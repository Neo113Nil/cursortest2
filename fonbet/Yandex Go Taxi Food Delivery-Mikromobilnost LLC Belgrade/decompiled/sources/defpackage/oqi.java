package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$AnswersAlignment;
import ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryState$Poll$Question$ChoicesType;

/* loaded from: classes5.dex */
public final class oqi {
    public final String a;
    public final String b;
    public final DeliveryState$Poll$Question$ChoicesType c;
    public final ArrayList d;
    public final LinkedHashMap e;
    public final DeliveryState$Poll$Question$AnswersAlignment f;

    public oqi(String str, String str2, DeliveryState$Poll$Question$ChoicesType deliveryState$Poll$Question$ChoicesType, ArrayList arrayList, LinkedHashMap linkedHashMap, DeliveryState$Poll$Question$AnswersAlignment deliveryState$Poll$Question$AnswersAlignment) {
        this.a = str;
        this.b = str2;
        this.c = deliveryState$Poll$Question$ChoicesType;
        this.d = arrayList;
        this.e = linkedHashMap;
        this.f = deliveryState$Poll$Question$AnswersAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqi)) {
            return false;
        }
        oqi oqiVar = (oqi) obj;
        return jl40.l(this.a, oqiVar.a) && jl40.l(this.b, oqiVar.b) && this.c == oqiVar.c && this.d.equals(oqiVar.d) && this.e.equals(oqiVar.e) && this.f == oqiVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ly3.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Question(id=", this.a, ", text=", this.b, ", choicesType=");
        v.append(this.c);
        v.append(", answers=");
        v.append(this.d);
        v.append(", nextQuestionsMap=");
        v.append(this.e);
        v.append(", answersAlignment=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
