package me.grishka.appkit.fragments;

import android.os.Bundle;
import android.view.View;
import xsna.h3p0;

/* loaded from: classes8.dex */
public abstract class VKToolbarFragment extends ToolbarFragment {
    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean ea() {
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        h3p0.c(this, this.Q);
    }
}
