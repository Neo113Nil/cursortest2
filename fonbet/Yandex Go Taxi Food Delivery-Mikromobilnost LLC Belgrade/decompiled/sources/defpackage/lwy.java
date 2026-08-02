package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.webview.UrlMatch;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class lwy {
    public static final jwy Companion = new jwy();
    public static final i3y[] d;
    public final String a;
    public final UrlMatch b;
    public final hlk c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new wky(16)), a.b(lazyThreadSafetyMode, new wky(18))};
    }

    public /* synthetic */ lwy(int i, String str, UrlMatch urlMatch, hlk hlkVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, hwy.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = urlMatch;
        this.c = hlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwy)) {
            return false;
        }
        lwy lwyVar = (lwy) obj;
        return jl40.l(this.a, lwyVar.a) && this.b == lwyVar.b && jl40.l(this.c, lwyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadCompleteAction(url=" + this.a + ", match=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
