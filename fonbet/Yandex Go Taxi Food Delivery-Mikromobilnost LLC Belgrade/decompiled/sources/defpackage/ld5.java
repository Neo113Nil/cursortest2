package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsV1Dto;

/* loaded from: classes5.dex */
public final class ld5 extends BaseWindowSettingsDto {
    public final BaseWindowSettingsV1Dto a;

    public ld5(BaseWindowSettingsV1Dto baseWindowSettingsV1Dto) {
        this.a = baseWindowSettingsV1Dto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld5) && this.a.equals(((ld5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseWindowSettings_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
