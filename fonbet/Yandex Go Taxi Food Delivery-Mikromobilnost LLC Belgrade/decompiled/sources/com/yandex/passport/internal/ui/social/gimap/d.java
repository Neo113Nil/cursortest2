package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.internal.ui.base.FragmentBackStack;

/* loaded from: classes2.dex */
public final class d implements com.yandex.passport.internal.ui.base.k {
    public final /* synthetic */ GimapBaseFragment a;

    public d(GimapBaseFragment gimapBaseFragment) {
        this.a = gimapBaseFragment;
    }

    @Override // com.yandex.passport.internal.ui.base.k
    public final void a(FragmentBackStack fragmentBackStack) {
        FragmentBackStack fragmentBackStack2;
        GimapBaseFragment gimapBaseFragment = this.a;
        gimapBaseFragment.updateCurrentTrack();
        gimapBaseFragment.onShowProgress(false);
        fragmentBackStack2 = gimapBaseFragment.getFragmentBackStack();
        fragmentBackStack2.b.remove(this);
    }
}
