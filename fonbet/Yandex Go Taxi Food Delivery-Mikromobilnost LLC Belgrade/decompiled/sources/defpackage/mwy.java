package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class mwy {
    public static final kwy Companion = new kwy();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new wky(17)), null};
    public final String a;
    public final UrlMatch b;
    public final ilk c;

    public /* synthetic */ mwy(int i, String str, UrlMatch urlMatch, ilk ilkVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, iwy.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = urlMatch;
        this.c = ilkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwy)) {
            return false;
        }
        mwy mwyVar = (mwy) obj;
        return jl40.l(this.a, mwyVar.a) && this.b == mwyVar.b && jl40.l(this.c, mwyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadCompleteAction(url=" + this.a + ", match=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
