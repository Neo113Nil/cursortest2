package com.vkontakte.android.fragments.messages.chat_invite.accept;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.fuj0;

/* compiled from: ChatInviteActivity.kt */
/* loaded from: classes7.dex */
public final class ChatInviteActivity extends FragmentWrapperActivity implements fuj0 {
    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setBackground(null);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
    }

    @Override // com.vkontakte.android.VKActivity, android.app.Activity
    public final void setRequestedOrientation(int i) {
    }
}
