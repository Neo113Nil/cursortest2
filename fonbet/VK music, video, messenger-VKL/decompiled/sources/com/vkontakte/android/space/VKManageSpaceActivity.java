package com.vkontakte.android.space;

import com.vk.settings.ManageSpaceActivity;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: VKManageSpaceActivity.kt */
/* loaded from: classes7.dex */
public final class VKManageSpaceActivity extends ManageSpaceActivity {
    @Override // com.vk.settings.ManageSpaceActivity
    public final void T1() {
        SettingsGeneralFragment.a aVar = new SettingsGeneralFragment.a();
        aVar.j.putBoolean("com.vk.android.MANAGE_SPACE_MODE", true);
        aVar.k(this);
    }
}
