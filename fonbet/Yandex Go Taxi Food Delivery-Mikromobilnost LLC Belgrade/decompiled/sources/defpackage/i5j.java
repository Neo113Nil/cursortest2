package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$DestinationState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i5j {
    public final String a;
    public final String b;
    public final DetailsCardDestinationStyleInteractor$DestinationState c;
    public final String d;

    public i5j(String str, String str2, DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState, String str3) {
        this.a = str;
        this.b = str2;
        this.c = detailsCardDestinationStyleInteractor$DestinationState;
        this.d = str3;
    }

    public static i5j a(i5j i5jVar, String str, String str2, DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState, String str3, int i) {
        if ((i & 1) != 0) {
            str = i5jVar.a;
        }
        if ((i & 2) != 0) {
            str2 = i5jVar.b;
        }
        if ((i & 4) != 0) {
            detailsCardDestinationStyleInteractor$DestinationState = i5jVar.c;
        }
        if ((i & 8) != 0) {
            str3 = i5jVar.d;
        }
        i5jVar.getClass();
        return new i5j(str, str2, detailsCardDestinationStyleInteractor$DestinationState, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5j)) {
            return false;
        }
        i5j i5jVar = (i5j) obj;
        return jl40.l(this.a, i5jVar.a) && jl40.l(this.b, i5jVar.b) && this.c == i5jVar.c && jl40.l(this.d, i5jVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DetailsCardDestinationStyleInteractor$DestinationState detailsCardDestinationStyleInteractor$DestinationState = this.c;
        int hashCode3 = (hashCode2 + (detailsCardDestinationStyleInteractor$DestinationState == null ? 0 : detailsCardDestinationStyleInteractor$DestinationState.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DestinationAddressDomainModel(address=", this.a, ", addressDetails=", this.b, ", destinationState=");
        v.append(this.c);
        v.append(", modeColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
