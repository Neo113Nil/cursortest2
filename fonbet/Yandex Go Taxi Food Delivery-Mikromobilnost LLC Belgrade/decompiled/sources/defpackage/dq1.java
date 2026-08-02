package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data.TextFont;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.DeliveryAiToolsDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.GradientStopDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.LinearGradientDto;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.StyledTextDto;

/* loaded from: classes5.dex */
public final class dq1 {
    public static piy a(LinearGradientDto linearGradientDto) {
        List<GradientStopDto> stops = linearGradientDto.getStops();
        ArrayList arrayList = new ArrayList(tcc.n(stops, 10));
        for (GradientStopDto gradientStopDto : stops) {
            arrayList.add(new izt(gradientStopDto.getColor(), gradientStopDto.getLocation()));
        }
        return new piy(linearGradientDto.getAngleDeg(), arrayList);
    }

    public static ayu0 b(StyledTextDto styledTextDto, DeliveryAiToolsDto deliveryAiToolsDto) {
        String str;
        TextFont textFont;
        String titleKey = styledTextDto.getTitleKey();
        Map<String, String> l10n = deliveryAiToolsDto.getL10n();
        if (l10n == null || (str = l10n.get(titleKey)) == null) {
            str = "";
        }
        String textColor = styledTextDto.getTextColor();
        int textSize = styledTextDto.getTextSize();
        StyledTextDto.TextFontDto textFont2 = styledTextDto.getTextFont();
        TextFont textFont3 = null;
        if (textFont2 != null) {
            int i = cq1.a[textFont2.ordinal()];
            if (i == 1) {
                textFont = TextFont.BOLD;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                textFont = TextFont.REGULAR;
            }
            textFont3 = textFont;
        }
        return new ayu0(str, textColor, textSize, textFont3);
    }
}
