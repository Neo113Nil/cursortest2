package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j21 implements v21 {
    public final AddressMapPickerPointType a;

    public j21(AddressMapPickerPointType addressMapPickerPointType) {
        this.a = addressMapPickerPointType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j21) && this.a == ((j21) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressClicked(pointType=" + this.a + Extension.C_BRAKE;
    }
}
