package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class puq {
    public final String a;
    public final String b;
    public final BitmapDrawable c;
    public final q47 d;

    public puq(String str, String str2, BitmapDrawable bitmapDrawable, q47 q47Var) {
        this.a = str;
        this.b = str2;
        this.c = bitmapDrawable;
        this.d = q47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puq)) {
            return false;
        }
        puq puqVar = (puq) obj;
        return jl40.l(this.a, puqVar.a) && jl40.l(this.b, puqVar.b) && jl40.l(this.c, puqVar.c) && jl40.l(this.d, puqVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        BitmapDrawable bitmapDrawable = this.c;
        int hashCode = (b + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31;
        q47 q47Var = this.d;
        return hashCode + (q47Var != null ? q47Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackSentUiState(title=", this.a, ", subtitle=", this.b, ", image=");
        v.append(this.c);
        v.append(", buttons=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
