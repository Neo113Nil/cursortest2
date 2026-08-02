package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ArBoxesSmartCameraAction$Intent;

/* loaded from: classes5.dex */
public final class m8x0 implements r9x0 {
    public final TapAction$ArBoxesSmartCameraAction$Intent a;

    public m8x0(TapAction$ArBoxesSmartCameraAction$Intent tapAction$ArBoxesSmartCameraAction$Intent) {
        this.a = tapAction$ArBoxesSmartCameraAction$Intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8x0) && this.a == ((m8x0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArBoxesSmartCameraAction(intent=" + this.a + Extension.C_BRAKE;
    }
}
