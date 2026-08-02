package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d2b {
    public final String a;
    public final Drawable b;
    public final boolean c;

    public d2b(Drawable drawable, String str, boolean z) {
        this.a = str;
        this.b = drawable;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2b)) {
            return false;
        }
        d2b d2bVar = (d2b) obj;
        return jl40.l(this.a, d2bVar.a) && jl40.l(this.b, d2bVar.b) && this.c == d2bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatDisplayData(chatName=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", needSquareAvatar=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
