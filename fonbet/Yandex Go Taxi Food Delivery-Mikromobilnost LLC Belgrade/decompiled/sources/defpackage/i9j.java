package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model.TitleStyle;

/* loaded from: classes5.dex */
public final class i9j {
    public final String a;
    public final TitleStyle b;

    public i9j(String str, TitleStyle titleStyle) {
        this.a = str;
        this.b = titleStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9j)) {
            return false;
        }
        i9j i9jVar = (i9j) obj;
        return jl40.l(this.a, i9jVar.a) && this.b == i9jVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DetailsSectionTitle(text=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
