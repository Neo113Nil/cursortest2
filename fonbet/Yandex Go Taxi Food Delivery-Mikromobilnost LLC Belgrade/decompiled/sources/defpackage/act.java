package defpackage;

import com.yandex.messaging.internal.entities.MessageData;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class act {
    public final MessageData a;
    public final String b;
    public final String c;

    public act(MessageData messageData, String str, String str2) {
        this.a = messageData;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof act)) {
            return false;
        }
        act actVar = (act) obj;
        return this.a.equals(actVar.a) && jl40.l(this.b, actVar.b) && jl40.l(this.c, actVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(data=");
        sb.append(this.a);
        sb.append(", authorGuid=");
        sb.append(this.b);
        sb.append(", translatedText=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
