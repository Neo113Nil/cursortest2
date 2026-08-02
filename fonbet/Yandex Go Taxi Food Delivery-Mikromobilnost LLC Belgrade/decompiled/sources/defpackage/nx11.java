package defpackage;

import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.core.common.data.network.dto.b;
import com.ybsdk.core.common.data.network.dto.c;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.common.domain.entities.WidgetEntity;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;

/* loaded from: classes2.dex */
public abstract class nx11 {
    public static final UnconditionalLimitWidgetEntity a(UnconditionalLimitWidgetDto unconditionalLimitWidgetDto) {
        WidgetEntity.Type type;
        WidgetEntity.Theme theme;
        WidgetEntity.Type type2;
        WidgetEntity.Theme theme2;
        String description = unconditionalLimitWidgetDto.getDescription();
        ThemedImageUrlEntity c = qxy0.c(unconditionalLimitWidgetDto.getImage(), null);
        String action = unconditionalLimitWidgetDto.getAction();
        int i = b.a[unconditionalLimitWidgetDto.getWidgetType().ordinal()];
        if (i == 1) {
            type = WidgetEntity.Type.INFO;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            type = WidgetEntity.Type.LIMIT;
        }
        WidgetDto.Theme dark = unconditionalLimitWidgetDto.getThemes().getDark();
        WidgetEntity.Theme a = dark != null ? c.a(dark) : null;
        WidgetDto.Theme light = unconditionalLimitWidgetDto.getThemes().getLight();
        if (light != null) {
            type2 = type;
            theme2 = a;
            theme = c.a(light);
        } else {
            WidgetEntity.Theme theme3 = a;
            theme = null;
            type2 = type;
            theme2 = theme3;
        }
        return new UnconditionalLimitWidgetEntity(description, c, action, type2, theme2, theme);
    }

    public static final px11 b(UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity) {
        WidgetEntity.Image image;
        WidgetEntity.Image image2;
        if (unconditionalLimitWidgetEntity.getLightTheme() != null || unconditionalLimitWidgetEntity.getDarkTheme() != null) {
            Text.Constant i = g8e.i(Text.Companion, unconditionalLimitWidgetEntity.getDescription());
            WidgetEntity.Theme lightTheme = unconditionalLimitWidgetEntity.getLightTheme();
            String url = (lightTheme == null || (image2 = lightTheme.getImage()) == null) ? null : image2.getUrl();
            WidgetEntity.Theme darkTheme = unconditionalLimitWidgetEntity.getDarkTheme();
            rbv c = fob1.c(url, (darkTheme == null || (image = darkTheme.getImage()) == null) ? null : image.getUrl(), new of11(13));
            WidgetEntity.Theme lightTheme2 = unconditionalLimitWidgetEntity.getLightTheme();
            String backgroundColor = lightTheme2 != null ? lightTheme2.getBackgroundColor() : null;
            WidgetEntity.Theme darkTheme2 = unconditionalLimitWidgetEntity.getDarkTheme();
            ColorModel e = lvy0.e(backgroundColor, darkTheme2 != null ? darkTheme2.getBackgroundColor() : null);
            if (e != null) {
                WidgetEntity.Theme lightTheme3 = unconditionalLimitWidgetEntity.getLightTheme();
                String titleTextColor = lightTheme3 != null ? lightTheme3.getTitleTextColor() : null;
                WidgetEntity.Theme darkTheme3 = unconditionalLimitWidgetEntity.getDarkTheme();
                ColorModel e2 = lvy0.e(titleTextColor, darkTheme3 != null ? darkTheme3.getTitleTextColor() : null);
                if (e2 != null) {
                    return new px11(i, c, e, e2, unconditionalLimitWidgetEntity.getAction());
                }
            }
        }
        return null;
    }
}
