package defpackage;

import com.yandex.go.destination_picker.ChooseAddressMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes12.dex */
public final class arb {
    public final String a;
    public final ChooseAddressMode b;
    public final ModalViewOrigin c;

    public arb(String str, ChooseAddressMode chooseAddressMode, ModalViewOrigin modalViewOrigin) {
        this.a = str;
        this.b = chooseAddressMode;
        this.c = modalViewOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arb)) {
            return false;
        }
        arb arbVar = (arb) obj;
        return this.a.equals(arbVar.a) && this.b == arbVar.b && this.c == arbVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChooseAddressParam(screen=" + this.a + ", pointType=" + this.b + ", modalViewOrigin=" + this.c + Extension.C_BRAKE;
    }
}
