package defpackage;

import com.ybsdk.common.entities.ChangePhoneApplicationStatusEntity$Status;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ee9 {
    public final ChangePhoneApplicationStatusEntity$Status a;
    public final Text b;
    public final Text c;
    public final String d;

    public ee9(ChangePhoneApplicationStatusEntity$Status changePhoneApplicationStatusEntity$Status, Text text, Text text2, String str) {
        this.a = changePhoneApplicationStatusEntity$Status;
        this.b = text;
        this.c = text2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee9)) {
            return false;
        }
        ee9 ee9Var = (ee9) obj;
        return this.a == ee9Var.a && jl40.l(this.b, ee9Var.b) && jl40.l(this.c, ee9Var.c) && jl40.l(this.d, ee9Var.d);
    }

    public final int hashCode() {
        int c = n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ChangePhoneApplicationStatusEntity(status=" + this.a + ", title=" + this.b + ", description=" + this.c + ", supportUrl=" + this.d + Extension.C_BRAKE;
    }
}
