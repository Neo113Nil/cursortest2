package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.b;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsV1Dto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BaseWindowSettingsV2Dto;

/* loaded from: classes5.dex */
public final class gwo {
    public final gd3 a;

    public gwo(gd3 gd3Var) {
        this.a = gd3Var;
    }

    public final od5 a(BaseWindowSettingsDto baseWindowSettingsDto) {
        if (baseWindowSettingsDto != null) {
            if (baseWindowSettingsDto instanceof ld5) {
                FormattedText formattedText = FormattedText.b;
                BaseWindowSettingsV1Dto baseWindowSettingsV1Dto = ((ld5) baseWindowSettingsDto).a;
                FormattedText a = b.a(baseWindowSettingsV1Dto.getTitle(), 24, "textMain", FormattedText.FontWeight.BOLD);
                String subtitle = baseWindowSettingsV1Dto.getSubtitle();
                FormattedText a2 = subtitle != null ? b.a(subtitle, 16, "textMain", FormattedText.FontWeight.REGULAR) : null;
                FormattedText a3 = b.a(baseWindowSettingsV1Dto.getDoneButtonTitle(), 16, "textOnControl", FormattedText.FontWeight.MEDIUM);
                String cancelButtonTitle = baseWindowSettingsV1Dto.getCancelButtonTitle();
                return new od5(a, a2, a3, cancelButtonTitle != null ? b.a(cancelButtonTitle, 16, "textOnControlMinor", FormattedText.FontWeight.REGULAR) : null, null, null);
            }
            if (baseWindowSettingsDto instanceof md5) {
                BaseWindowSettingsV2Dto baseWindowSettingsV2Dto = ((md5) baseWindowSettingsDto).a;
                AttributedTextDto attributedTitle = baseWindowSettingsV2Dto.getAttributedTitle();
                this.a.getClass();
                FormattedText b = gd3.b(attributedTitle);
                AttributedTextDto attributedSubtitle = baseWindowSettingsV2Dto.getAttributedSubtitle();
                FormattedText b2 = attributedSubtitle != null ? gd3.b(attributedSubtitle) : null;
                FormattedText b3 = gd3.b(baseWindowSettingsV2Dto.getDoneButtonAttributedTitle());
                AttributedTextDto cancelButtonAttributedTitle = baseWindowSettingsV2Dto.getCancelButtonAttributedTitle();
                FormattedText b4 = cancelButtonAttributedTitle != null ? gd3.b(cancelButtonAttributedTitle) : null;
                AttributedTextDto doneButtonAttributedSubtitle = baseWindowSettingsV2Dto.getDoneButtonAttributedSubtitle();
                FormattedText b5 = doneButtonAttributedSubtitle != null ? gd3.b(doneButtonAttributedSubtitle) : null;
                AttributedTextDto cancelButtonAttributedSubtitle = baseWindowSettingsV2Dto.getCancelButtonAttributedSubtitle();
                return new od5(b, b2, b3, b4, b5, cancelButtonAttributedSubtitle != null ? gd3.b(cancelButtonAttributedSubtitle) : null);
            }
            if (!baseWindowSettingsDto.equals(nd5.a)) {
                w511.b();
                return null;
            }
        }
        return null;
    }
}
