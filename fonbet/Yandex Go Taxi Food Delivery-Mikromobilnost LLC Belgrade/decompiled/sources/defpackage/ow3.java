package defpackage;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupType;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.api.dto.TopupWidgetTheme;

/* loaded from: classes3.dex */
public abstract class ow3 {
    public static final mw3 a(AutoTopupWidgetDto autoTopupWidgetDto) {
        Boolean bool;
        y1b1 y1b1Var;
        lw3 lw3Var;
        WidgetDto.Theme.ButtonTheme buttonTheme;
        WidgetDto.Theme.ButtonTheme buttonTheme2;
        WidgetDto.Theme.ButtonTheme buttonTheme3;
        WidgetDto.Theme.Background background;
        WidgetDto.Theme.ButtonTheme buttonTheme4;
        WidgetDto.Theme.Background background2;
        WidgetDto.Theme.Image image;
        WidgetDto.Theme.Image image2;
        WidgetDto.Theme.Background background3;
        WidgetDto.Theme.Background background4;
        y1b1 y1b1Var2;
        AutoTopupWidgetDto.SwitchState switchState = autoTopupWidgetDto.getSwitchState();
        if (switchState != null) {
            bool = Boolean.valueOf(switchState == AutoTopupWidgetDto.SwitchState.ON);
        } else {
            bool = null;
        }
        AutoTopupWidgetDto.Payload payload = autoTopupWidgetDto.getPayload();
        String agreementId = payload != null ? payload.getAgreementId() : null;
        AutoTopupWidgetDto.Payload payload2 = autoTopupWidgetDto.getPayload();
        PaymentMethodInfoDto paymentMethodInfo = payload2 != null ? payload2.getPaymentMethodInfo() : null;
        AutoTopupWidgetDto.Payload payload3 = autoTopupWidgetDto.getPayload();
        AutoTopupType type = payload3 != null ? payload3.getType() : null;
        int i = type == null ? -1 : nw3.a[type.ordinal()];
        if (i != -1) {
            if (i == 1) {
                y1b1Var2 = bu3.a;
            } else if (i == 2) {
                y1b1Var2 = cu3.a;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                y1b1Var2 = du3.a;
            }
            y1b1Var = y1b1Var2;
        } else {
            y1b1Var = null;
        }
        AutoTopupWidgetDto.Payload payload4 = autoTopupWidgetDto.getPayload();
        String autoTopupId = payload4 != null ? payload4.getAutoTopupId() : null;
        String title = autoTopupWidgetDto.getTitle();
        String description = autoTopupWidgetDto.getDescription();
        AutoTopupWidgetDto.Payload payload5 = autoTopupWidgetDto.getPayload();
        Money money = payload5 != null ? payload5.getMoney() : null;
        AutoTopupWidgetDto.Payload payload6 = autoTopupWidgetDto.getPayload();
        Money threshold = payload6 != null ? payload6.getThreshold() : null;
        Themes<TopupWidgetTheme> themes = autoTopupWidgetDto.getThemes();
        if (themes != null) {
            if (themes.getLight() == null && themes.getDark() == null) {
                x4c.g("there is no valid theme for Autotopup widget", null, null, null, 14);
            }
            TopupWidgetTheme light = themes.getLight();
            String titleTextColor = light != null ? light.getTitleTextColor() : null;
            TopupWidgetTheme dark = themes.getDark();
            ColorModel e = lvy0.e(titleTextColor, dark != null ? dark.getTitleTextColor() : null);
            TopupWidgetTheme light2 = themes.getLight();
            String descriptionTextColor = light2 != null ? light2.getDescriptionTextColor() : null;
            TopupWidgetTheme dark2 = themes.getDark();
            ColorModel e2 = lvy0.e(descriptionTextColor, dark2 != null ? dark2.getTitleTextColor() : null);
            TopupWidgetTheme light3 = themes.getLight();
            String color = (light3 == null || (background4 = light3.getBackground()) == null) ? null : background4.getColor();
            TopupWidgetTheme dark3 = themes.getDark();
            ColorModel e3 = lvy0.e(color, (dark3 == null || (background3 = dark3.getBackground()) == null) ? null : background3.getColor());
            TopupWidgetTheme light4 = themes.getLight();
            String url = (light4 == null || (image2 = light4.getImage()) == null) ? null : image2.getUrl();
            TopupWidgetTheme dark4 = themes.getDark();
            rbv c = fob1.c(url, (dark4 == null || (image = dark4.getImage()) == null) ? null : image.getUrl(), new at3(4));
            TopupWidgetTheme light5 = themes.getLight();
            String color2 = (light5 == null || (buttonTheme4 = light5.getButtonTheme()) == null || (background2 = buttonTheme4.getBackground()) == null) ? null : background2.getColor();
            TopupWidgetTheme dark5 = themes.getDark();
            ColorModel e4 = lvy0.e(color2, (dark5 == null || (buttonTheme3 = dark5.getButtonTheme()) == null || (background = buttonTheme3.getBackground()) == null) ? null : background.getColor());
            TopupWidgetTheme light6 = themes.getLight();
            String textColor = (light6 == null || (buttonTheme2 = light6.getButtonTheme()) == null) ? null : buttonTheme2.getTextColor();
            TopupWidgetTheme dark6 = themes.getDark();
            lw3Var = new lw3(e, e2, e3, c, e4, lvy0.e(textColor, (dark6 == null || (buttonTheme = dark6.getButtonTheme()) == null) ? null : buttonTheme.getTextColor()));
        } else {
            lw3Var = null;
        }
        AutoTopupWidgetDto.ButtonState buttonState = autoTopupWidgetDto.getButtonState();
        return new mw3(autoTopupId, title, description, bool, y1b1Var, money, threshold, agreementId, lw3Var, paymentMethodInfo, buttonState != null ? new kw3(buttonState.getText(), buttonState.getAction()) : null);
    }
}
