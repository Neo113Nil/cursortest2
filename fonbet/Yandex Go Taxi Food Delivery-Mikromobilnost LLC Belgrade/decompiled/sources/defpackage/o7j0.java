package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class o7j0 extends d7 {
    public static final rms b = new rms(9);
    public final MapBuilder a;

    public o7j0(MapBuilder mapBuilder) {
        super(b);
        this.a = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7j0) && this.a.equals(((o7j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestModifier(" + this.a + Extension.C_BRAKE;
    }
}
