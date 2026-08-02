package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e11 implements i11 {
    public final AddressMapPickerPointType a = AddressMapPickerPointType.Source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e11) && this.a == ((e11) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClarifyPoint(pointType=" + this.a + Extension.C_BRAKE;
    }
}
