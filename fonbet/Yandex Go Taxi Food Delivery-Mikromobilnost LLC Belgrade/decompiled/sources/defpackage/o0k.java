package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.messaging.internal.displayname.AvatarType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o0k {
    public final String a;
    public final Drawable b;
    public final AvatarType c;

    public o0k(String str, Drawable drawable, AvatarType avatarType) {
        this.a = str;
        this.b = drawable;
        this.c = avatarType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0k)) {
            return false;
        }
        o0k o0kVar = (o0k) obj;
        return jl40.l(this.a, o0kVar.a) && jl40.l(this.b, o0kVar.b) && this.c == o0kVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DisplayUserData(name=" + this.a + ", avatarDrawable=" + this.b + ", avatarType=" + this.c + Extension.C_BRAKE;
    }
}
