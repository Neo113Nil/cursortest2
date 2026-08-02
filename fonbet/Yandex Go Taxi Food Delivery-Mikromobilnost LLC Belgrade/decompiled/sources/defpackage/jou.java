package defpackage;

import android.text.TextUtils;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class jou implements s820 {
    public final String a;
    public final String b;
    public final List c;

    public jou(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = ly3.w(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jou.class == obj.getClass()) {
            jou jouVar = (jou) obj;
            if (TextUtils.equals(this.a, jouVar.a) && TextUtils.equals(this.b, jouVar.b) && this.c.equals(jouVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? oyr.t(unr0.x(" [", str, Extension.FIX_SPACE), this.b, "]") : "");
    }
}
