package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class jod {
    public static final eod Companion = new eod();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new juc(22)), null};
    public final String a;
    public final CompositeOfferDto$LegalInfo$Item$Type b;
    public final hod c;

    public /* synthetic */ jod(int i, String str, CompositeOfferDto$LegalInfo$Item$Type compositeOfferDto$LegalInfo$Item$Type, hod hodVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, dod.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = compositeOfferDto$LegalInfo$Item$Type;
        this.c = hodVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jod)) {
            return false;
        }
        jod jodVar = (jod) obj;
        return jl40.l(this.a, jodVar.a) && this.b == jodVar.b && jl40.l(this.c, jodVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Item(key=" + this.a + ", type=" + this.b + ", data=" + this.c + ')';
    }
}
