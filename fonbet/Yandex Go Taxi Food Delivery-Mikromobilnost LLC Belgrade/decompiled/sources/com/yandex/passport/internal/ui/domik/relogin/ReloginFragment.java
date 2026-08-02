package com.yandex.passport.internal.ui.domik.relogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$Relogin;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.legacy.d;
import defpackage.ds31;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;

/* loaded from: classes2.dex */
public class ReloginFragment extends BaseDomikFragment<c, AuthTrack> {
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.relogin.ReloginFragment";
    private static final String KEY_IS_ACCOUNT_CHANGING_ALLOWED = "is_account_changing_allowed";

    public static ReloginFragment newInstance(AuthTrack authTrack, boolean z) {
        ReloginFragment reloginFragment = (ReloginFragment) BaseDomikFragment.baseNewInstance(authTrack, new com.yandex.passport.internal.ui.authbytrack.b(4));
        reloginFragment.getArguments().putBoolean("is_account_changing_allowed", z);
        return reloginFragment;
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public c createViewModel(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return getDomikComponent().newReloginViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.RELOGIN;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String str) {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(getDomikComponent().getDomikDesignProvider().a, viewGroup, false);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onErrorCode(EventError eventError) {
        c cVar = (c) this.viewModel;
        cVar.c.m(Boolean.FALSE);
        cVar.D.g(DomikScreenSuccessMessages$Relogin.error);
        cVar.B.c();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d.b(requireContext(), (ProgressBar) view.findViewById(R.id.progress), R.color.passport_progress_bar);
        c cVar = (c) this.viewModel;
        AuthTrack authTrack = (AuthTrack) this.currentTrack;
        cVar.getClass();
        k5c a = ds31.a(cVar);
        sjh sjhVar = uyj.a;
        tje.N(a, mdh.b, null, new ReloginViewModel$startRelogin$1(cVar, authTrack, null), 2);
    }
}
