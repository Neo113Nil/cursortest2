package com.ybsdk.core.common.data.network.dto;

import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.core.common.domain.entities.WidgetEntity;
import defpackage.w511;

/* loaded from: classes15.dex */
public abstract class c {
    public static final WidgetEntity.Theme a(WidgetDto.Theme theme) {
        WidgetEntity.Image image;
        WidgetEntity.Image.Type type;
        WidgetDto.Theme.Background background;
        String color = theme.getBackground().getColor();
        String titleTextColor = theme.getTitleTextColor();
        String descTextColor = theme.getDescTextColor();
        String delimiterColor = theme.getDelimiterColor();
        WidgetDto.Theme.ButtonTheme buttonTheme = theme.getButtonTheme();
        String color2 = (buttonTheme == null || (background = buttonTheme.getBackground()) == null) ? null : background.getColor();
        WidgetDto.Theme.ButtonTheme buttonTheme2 = theme.getButtonTheme();
        String textColor = buttonTheme2 != null ? buttonTheme2.getTextColor() : null;
        if (theme.getImage() != null) {
            int i = b.b[theme.getImage().getType().ordinal()];
            if (i == 1) {
                type = WidgetEntity.Image.Type.BACKGROUND;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                type = WidgetEntity.Image.Type.TITLE;
            }
            image = new WidgetEntity.Image(type, theme.getImage().getUrl());
        } else {
            image = null;
        }
        return new WidgetEntity.Theme(color, titleTextColor, descTextColor, delimiterColor, color2, textColor, image);
    }
}
