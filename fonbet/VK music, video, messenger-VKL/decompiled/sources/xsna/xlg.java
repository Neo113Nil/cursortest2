package xsna;

import com.ironsource.X3;
import com.vk.dto.ProfileEditPage;
import com.vk.webapp.fragments.ProfileEditFragment;
import com.vkontakte.android.fragments.SettingsDomainFragment;
import kotlin.Pair;
import xsna.sw50;

/* compiled from: CommonProfileSettingsBridge.kt */
/* loaded from: classes7.dex */
public final class xlg implements sw50.o {
    @Override // xsna.sw50.o
    public final oz50 a(ProfileEditPage profileEditPage) {
        int i = ProfileEditFragment.a0;
        return ProfileEditFragment.b.a(null, profileEditPage, 1);
    }

    @Override // xsna.sw50.o
    public final oz50 b(String str) {
        return new oz50(SettingsDomainFragment.class, null, yfb.b(new Pair(X3.j.D, str)));
    }
}
