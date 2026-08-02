package defpackage;

import android.net.Uri;
import com.yandex.go.deeplinks.generated.city_mode.IntercityMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class plw {
    public final Uri a;
    public final IntercityMode b;

    public plw(Uri uri, IntercityMode intercityMode) {
        this.a = uri;
        this.b = intercityMode;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plw)) {
            return false;
        }
        plw plwVar = (plw) obj;
        return jl40.l(this.a, plwVar.a) && this.b == plwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntercityDeeplink(deeplinkUri=" + this.a + ", mode=" + this.b + Extension.C_BRAKE;
    }
}
