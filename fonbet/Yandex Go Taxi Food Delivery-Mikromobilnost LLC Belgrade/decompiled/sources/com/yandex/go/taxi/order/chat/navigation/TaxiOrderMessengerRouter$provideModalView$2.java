package com.yandex.go.taxi.order.chat.navigation;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class TaxiOrderMessengerRouter$provideModalView$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Fragment fragment;
        b bVar = (b) this.receiver;
        ViewGroup viewGroup = bVar.G;
        if (viewGroup != null && (fragment = bVar.F) != null) {
            FragmentManager supportFragmentManager = bVar.T().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.h(viewGroup.getId(), fragment, null);
            aVar.n();
        }
        return zy11.a;
    }
}
