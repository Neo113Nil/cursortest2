package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ibs0 {
    public final CharSequence a;
    public final Drawable b;
    public final String c;
    public final String d;

    public ibs0(CharSequence charSequence, Drawable drawable, String str, String str2) {
        this.a = charSequence;
        this.b = drawable;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibs0)) {
            return false;
        }
        ibs0 ibs0Var = (ibs0) obj;
        return jl40.l(this.a, ibs0Var.a) && jl40.l(this.b, ibs0Var.b) && jl40.l(this.c, ibs0Var.c) && jl40.l(this.d, ibs0Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignInputUiState(title=");
        sb.append((Object) this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", value=");
        return g8e.r(sb, this.c, ", bubbleText=", this.d, Extension.C_BRAKE);
    }
}
