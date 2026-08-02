package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;

/* loaded from: classes12.dex */
public final class edp {
    public final EditArguments a;
    public final boolean b;

    public edp(EditArguments editArguments, boolean z) {
        this.a = editArguments;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edp)) {
            return false;
        }
        edp edpVar = (edp) obj;
        return this.a.equals(edpVar.a) && this.b == edpVar.b;
    }

    public final int hashCode() {
        return qe0.b.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FavoriteAddressLaunchPayload(editArguments=" + this.a + ", fromMap=" + this.b + ", analyticsData=" + qe0.b + Extension.C_BRAKE;
    }
}
