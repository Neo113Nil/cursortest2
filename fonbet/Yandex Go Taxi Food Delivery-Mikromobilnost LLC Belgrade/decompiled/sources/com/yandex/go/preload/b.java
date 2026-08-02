package com.yandex.go.preload;

import android.os.Bundle;
import defpackage.dds;
import defpackage.toe0;
import defpackage.uoe0;
import defpackage.voe0;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes13.dex */
public final class b extends dds {
    public final a F;
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a G;

    public b(a aVar, com.yandex.go.mainscreen.superapp.impl.fragment.a aVar2) {
        super(null);
        this.F = aVar;
        this.G = aVar2;
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.G;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        ((PreloadFragment) baseFragment).setCallbackListener(new voe0(this));
        this.F.a.c(PreloadAnalytics$EventMarker.WAITING);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        uoe0 uoe0Var = (uoe0) obj;
        toe0 toe0Var = PreloadFragment.Companion;
        String str = uoe0Var.a;
        boolean z = uoe0Var.b;
        toe0Var.getClass();
        PreloadFragment preloadFragment = new PreloadFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.go.preload.PreloadFragment.TEXT_KEY", str);
        bundle.putBoolean("com.yandex.go.preload.PreloadFragment.SHOW_CANCEL_BUTTON_KEY", z);
        preloadFragment.setArguments(bundle);
        return preloadFragment;
    }
}
