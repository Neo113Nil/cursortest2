package com.vk.webapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.ies;
import xsna.oz50;

/* compiled from: NeedChangePasswordFragment.kt */
/* loaded from: classes7.dex */
public final class NeedChangePasswordFragment extends VKSuperAppBrowserFragment implements ies {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: NeedChangePasswordFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Bundle arguments = getArguments();
        return (arguments != null ? arguments.getBoolean("key_no_close") : false) || super.a0();
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            finish();
        }
    }
}
