package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.CancelType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bxh {
    public final CancelType a;
    public final FormattedText b;
    public final FormattedText c;
    public final ArrayList d;
    public final zwh e;
    public final axh f;

    public bxh(CancelType cancelType, FormattedText formattedText, FormattedText formattedText2, ArrayList arrayList, zwh zwhVar, axh axhVar) {
        this.a = cancelType;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = arrayList;
        this.e = zwhVar;
        this.f = axhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxh)) {
            return false;
        }
        bxh bxhVar = (bxh) obj;
        return this.a == bxhVar.a && jl40.l(this.b, bxhVar.b) && jl40.l(this.c, bxhVar.c) && this.d.equals(bxhVar.d) && this.e.equals(bxhVar.e) && this.f.equals(bxhVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ly3.b((hashCode2 + (formattedText2 != null ? formattedText2.a.hashCode() : 0)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "DeliveryCancelInfoModel(cancelType=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", contentActions=" + this.d + ", cancelButton=" + this.e + ", dismissButton=" + this.f + Extension.C_BRAKE;
    }
}
