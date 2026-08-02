package com.vkontakte.android.fragments;

import android.os.Bundle;
import android.view.View;
import me.grishka.appkit.fragments.TabbedLoaderFragment;
import xsna.h3p0;

/* loaded from: classes11.dex */
public abstract class VkTabbedLoaderFragment extends TabbedLoaderFragment {
    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public boolean ea() {
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        h3p0.c(this, this.Q);
    }
}
