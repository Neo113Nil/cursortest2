package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.vk.common.view.settings.SettingsSwitchView;
import com.vkontakte.android.R;

/* compiled from: WallRepostSettingsView.java */
/* loaded from: classes5.dex */
public final class gax0 {

    @NonNull
    public final SettingsSwitchView a;

    @NonNull
    public final SettingsSwitchView b;

    @NonNull
    public final SettingsSwitchView c;

    @NonNull
    public final SettingsSwitchView d;

    @NonNull
    public final SettingsSwitchView e;

    public gax0(@NonNull View view) {
        this.a = (SettingsSwitchView) view.findViewById(R.id.sharing_setting_friends_only);
        this.b = (SettingsSwitchView) view.findViewById(R.id.sharing_setting_facebook_export);
        this.c = (SettingsSwitchView) view.findViewById(R.id.sharing_setting_twitter_export);
        this.d = (SettingsSwitchView) view.findViewById(R.id.sharing_setting_comments);
        this.e = (SettingsSwitchView) view.findViewById(R.id.sharing_setting_notifications);
    }
}
