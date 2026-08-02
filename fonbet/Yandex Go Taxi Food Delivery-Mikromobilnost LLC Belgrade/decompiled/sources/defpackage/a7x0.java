package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class a7x0 implements c7x0 {
    public final ContentAlignment a;

    public a7x0(ContentAlignment contentAlignment) {
        this.a = contentAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7x0) && this.a == ((a7x0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Box(alignment=" + this.a + Extension.C_BRAKE;
    }
}
