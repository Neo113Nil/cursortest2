package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.styling.ButtonType;

/* loaded from: classes10.dex */
public final class m37 {
    public final Map a;

    public m37(Map map) {
        this.a = map;
    }

    public final j37 a(ButtonType buttonType) {
        return (j37) this.a.get(buttonType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m37) && this.a.equals(((m37) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("ButtonStyle(buttons=", Extension.C_BRAKE, this.a);
    }
}
