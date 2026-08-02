package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o5f implements l5f {
    public final String a;
    public final String b;
    public final Drawable c;
    public final boolean d;

    public o5f(String str, String str2, Drawable drawable, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5f)) {
            return false;
        }
        o5f o5fVar = (o5f) obj;
        return jl40.l(this.a, o5fVar.a) && jl40.l(this.b, o5fVar.b) && jl40.l(this.c, o5fVar.c) && this.d == o5fVar.d;
    }

    @Override // defpackage.q5f
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RegularChatItem(id=", this.a, ", chatName=", this.b, ", avatar=");
        v.append(this.c);
        v.append(", needSquareAvatar=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
