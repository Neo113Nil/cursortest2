package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$SourceEditState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j7j {
    public final String a;
    public final String b;
    public final String c;
    public final DetailsCardSourceStyleInteractor$SourceEditState d;

    public j7j(String str, String str2, String str3, DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = detailsCardSourceStyleInteractor$SourceEditState;
    }

    public static j7j a(j7j j7jVar, String str, String str2, String str3, DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState, int i) {
        if ((i & 1) != 0) {
            str = j7jVar.a;
        }
        if ((i & 2) != 0) {
            str2 = j7jVar.b;
        }
        if ((i & 4) != 0) {
            str3 = j7jVar.c;
        }
        if ((i & 8) != 0) {
            detailsCardSourceStyleInteractor$SourceEditState = j7jVar.d;
        }
        j7jVar.getClass();
        return new j7j(str, str2, str3, detailsCardSourceStyleInteractor$SourceEditState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7j)) {
            return false;
        }
        j7j j7jVar = (j7j) obj;
        return jl40.l(this.a, j7jVar.a) && jl40.l(this.b, j7jVar.b) && jl40.l(this.c, j7jVar.c) && this.d == j7jVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState = this.d;
        return hashCode3 + (detailsCardSourceStyleInteractor$SourceEditState != null ? detailsCardSourceStyleInteractor$SourceEditState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SourceAddressDomainModel(address=", this.a, ", addressDetails=", this.b, ", modeColor=");
        v.append(this.c);
        v.append(", sourceEditState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
