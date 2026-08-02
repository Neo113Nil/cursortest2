package defpackage;

import com.yandex.messaging.SendAction;
import com.yandex.messaging.ui.sharing.SharingData$SharingFileData;
import com.yandex.messaging.ui.sharing.SharingData$SharingImageData;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hqr0 {
    public final g720 a;
    public final SendAction b;
    public final List c;
    public final List d;
    public final String e;
    public final List f;
    public final SharingData$SharingFileData g;
    public final SharingData$SharingImageData h;

    public hqr0(g720 g720Var, SendAction sendAction, List list, List list2, String str, List list3, SharingData$SharingFileData sharingData$SharingFileData, SharingData$SharingImageData sharingData$SharingImageData) {
        this.a = g720Var;
        this.b = sendAction;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = list3;
        this.g = sharingData$SharingFileData;
        this.h = sharingData$SharingImageData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqr0)) {
            return false;
        }
        hqr0 hqr0Var = (hqr0) obj;
        return jl40.l(this.a, hqr0Var.a) && this.b == hqr0Var.b && jl40.l(this.c, hqr0Var.c) && jl40.l(this.d, hqr0Var.d) && jl40.l(this.e, hqr0Var.e) && jl40.l(this.f, hqr0Var.f) && jl40.l(this.g, hqr0Var.g) && jl40.l(this.h, hqr0Var.h);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int c2 = unr0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        SharingData$SharingFileData sharingData$SharingFileData = this.g;
        int hashCode = (c2 + (sharingData$SharingFileData == null ? 0 : sharingData$SharingFileData.hashCode())) * 31;
        SharingData$SharingImageData sharingData$SharingImageData = this.h;
        return hashCode + (sharingData$SharingImageData != null ? sharingData$SharingImageData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingData(source=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", texts=");
        nnm.w(sb, this.c, ", uris=", this.d, ", chatId=");
        tse0.x(this.e, ", messages=", ", file=", sb, this.f);
        sb.append(this.g);
        sb.append(", image=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
