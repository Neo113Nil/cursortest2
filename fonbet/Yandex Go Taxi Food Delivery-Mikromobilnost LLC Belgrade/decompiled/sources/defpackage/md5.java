package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsV2Dto;

/* loaded from: classes5.dex */
public final class md5 extends BaseWindowSettingsDto {
    public final BaseWindowSettingsV2Dto a;

    public md5(BaseWindowSettingsV2Dto baseWindowSettingsV2Dto) {
        this.a = baseWindowSettingsV2Dto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md5) && this.a.equals(((md5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseWindowSettings_Type1Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
