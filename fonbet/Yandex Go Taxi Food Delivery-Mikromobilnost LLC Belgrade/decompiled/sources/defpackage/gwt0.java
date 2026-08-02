package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class gwt0 {
    public final x7r0 a;
    public final if8 b;

    public gwt0(x7r0 x7r0Var, if8 if8Var) {
        this.a = x7r0Var;
        this.b = if8Var;
    }

    public final j59 a() {
        if (!((CommonFeatureFlag) this.b.a.d(wlp.C).getData()).isEnabled()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SettingsItemEntity$Type settingsItemEntity$Type = SettingsItemEntity$Type.SWITCH;
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_settings_spoiler_hide_with_gesture_settings_title);
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_settings_spoiler_settings_description);
        x7r0 x7r0Var = this.a;
        o8r0 o8r0Var = new o8r0("hide_spoiler_on_rotation", settingsItemEntity$Type, h, resource, null, true, x7r0Var.a.a(), null, null, null, null, 3984);
        arrayList.add(o8r0Var);
        arrayList.add(new o8r0("show_spoiler_on_launch", settingsItemEntity$Type, new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_title), new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_description), null, o8r0Var.g, x7r0Var.a.b(), null, null, null, null, 3984));
        return new j59("spoiler_settings_category", new Text.Resource(dzh0.ybsdk_settings_spoiler_settings_category_title), arrayList);
    }
}
