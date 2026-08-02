package xsna;

import androidx.preference.Preference;
import com.vk.settings.GetAccountSettingsRequest;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class k0j0 implements io.reactivex.rxjava3.functions.f<Boolean> {
    public final /* synthetic */ int b;
    public final /* synthetic */ SettingsAccountInnerFragment c;

    public k0j0(SettingsAccountInnerFragment settingsAccountInnerFragment, int i) {
        this.c = settingsAccountInnerFragment;
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Boolean bool) throws Throwable {
        SettingsAccountInnerFragment settingsAccountInnerFragment = this.c;
        GetAccountSettingsRequest.Result result = settingsAccountInnerFragment.m0;
        settingsAccountInnerFragment.m0 = new GetAccountSettingsRequest.Result(result.b, result.c, result.d, result.e, result.f, this.b == 0, result.h, result.i, result.j);
        Preference findPreference = settingsAccountInnerFragment.findPreference("accountOnlyMyPosts");
        findPreference.I(findPreference.b.getString(settingsAccountInnerFragment.m0.g ? R.string.wall_my_posts : R.string.wall_all_posts));
    }
}
