package com.vkontakte.android.fragments;

import android.view.ViewGroup;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import xsna.cez;

/* compiled from: SettingsListFragment.kt */
/* loaded from: classes7.dex */
public final class b extends cez {
    public final /* synthetic */ SettingsListFragment o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup, SettingsListFragment settingsListFragment) {
        super(viewGroup);
        this.o = settingsListFragment;
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        int i = SettingsListFragment.X0;
        SettingsListFragment settingsListFragment = this.o;
        settingsListFragment.No().e(settingsListFragment, MultiAccountEntryPoint.Settings.d);
    }
}
