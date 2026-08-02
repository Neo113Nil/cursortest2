package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.data.SettingDto;
import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;

/* loaded from: classes3.dex */
public abstract class j9r0 {
    public static final o8r0 a(SettingDto settingDto, rbv rbvVar) {
        SettingsItemEntity$Type settingsItemEntity$Type;
        Boolean booleanValue;
        String key = settingDto.getKey();
        Text.Constant i = g8e.i(Text.Companion, settingDto.getTitle());
        String description = settingDto.getDescription();
        Text.Constant constant = description != null ? new Text.Constant(description) : null;
        ColorModel e = settingDto.getDescriptionColor() != null ? lvy0.e(settingDto.getDescriptionColor().getLight(), settingDto.getDescriptionColor().getDark()) : null;
        boolean enabled = settingDto.getEnabled();
        SettingPropertyDto property = settingDto.getProperty();
        boolean booleanValue2 = (property == null || (booleanValue = property.getBooleanValue()) == null) ? false : booleanValue.booleanValue();
        SettingPropertyDto property2 = settingDto.getProperty();
        String action = property2 != null ? property2.getAction() : null;
        SettingPropertyDto property3 = settingDto.getProperty();
        String analyticAction = property3 != null ? property3.getAnalyticAction() : null;
        SettingPropertyDto property4 = settingDto.getProperty();
        SettingPropertyDto.Type type = property4 != null ? property4.getType() : null;
        switch (type == null ? -1 : h9r0.b[type.ordinal()]) {
            case -1:
            case 6:
                x4c.g("Unknown setting type", null, String.valueOf(settingDto), null, 10);
                return null;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                settingsItemEntity$Type = SettingsItemEntity$Type.SWITCH;
                break;
            case 2:
                settingsItemEntity$Type = SettingsItemEntity$Type.GOTO;
                break;
            case 3:
                settingsItemEntity$Type = SettingsItemEntity$Type.EDIT;
                break;
            case 4:
                settingsItemEntity$Type = SettingsItemEntity$Type.SOON;
                break;
            case 5:
                settingsItemEntity$Type = SettingsItemEntity$Type.NONE;
                break;
        }
        return new o8r0(key, settingsItemEntity$Type, i, constant, e, enabled, booleanValue2, action, rbvVar, null, analyticAction, 1280);
    }

    public static final e9r0 b(o8r0 o8r0Var, boolean z, boolean z2) {
        String str = o8r0Var.a;
        Text text = o8r0Var.d;
        Text text2 = o8r0Var.c;
        switch (h9r0.a[o8r0Var.b.ordinal()]) {
            case 1:
                String str2 = o8r0Var.a;
                if (text2 == null) {
                    text2 = Text.Empty.INSTANCE;
                }
                Text text3 = text2;
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                return new g9r0(str2, text3, text, o8r0Var.f, o8r0Var.g, z, z2, o8r0Var.j, o8r0Var.i);
            case 2:
                String str3 = o8r0Var.a;
                if (text2 == null) {
                    text2 = Text.Empty.INSTANCE;
                }
                Text text4 = text2;
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                return new z8r0(str3, text4, text, o8r0Var.f, z2, z, o8r0Var.h, o8r0Var.i, o8r0Var.e, o8r0Var.k);
            case 3:
                String str4 = o8r0Var.a;
                if (text2 == null) {
                    text2 = Text.Empty.INSTANCE;
                }
                return new c9r0(str4, text2, o8r0Var.d, z2, o8r0Var.h, o8r0Var.f, o8r0Var.k);
            case 4:
                if (text2 == null) {
                    text2 = Text.Empty.INSTANCE;
                }
                return new f9r0(str, z2, text2);
            case 5:
                return new d9r0(text2, text, str);
            case 6:
                return new fer0(str, null);
            case 7:
                String str5 = o8r0Var.a;
                if (text2 == null) {
                    text2 = Text.Empty.INSTANCE;
                }
                Text text5 = text2;
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                return new v6r0(str5, text5, text, o8r0Var.i, o8r0Var.h);
            default:
                w511.b();
                return null;
        }
    }
}
