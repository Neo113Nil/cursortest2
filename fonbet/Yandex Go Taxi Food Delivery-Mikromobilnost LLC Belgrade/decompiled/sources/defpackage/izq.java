package defpackage;

import android.net.Uri;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class izq {
    public final Uri a;
    public final jzq b;
    public final AttachInfo c;

    public izq(Uri uri, jzq jzqVar, AttachInfo attachInfo) {
        this.a = uri;
        this.b = jzqVar;
        this.c = attachInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izq)) {
            return false;
        }
        izq izqVar = (izq) obj;
        return jl40.l(this.a, izqVar.a) && this.b.equals(izqVar.b) && this.c.equals(izqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FileData(fileUri=" + this.a + ", shortFileData=" + this.b + ", attachInfo=" + this.c + Extension.C_BRAKE;
    }
}
