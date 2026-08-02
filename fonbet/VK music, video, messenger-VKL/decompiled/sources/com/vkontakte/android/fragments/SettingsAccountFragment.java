package com.vkontakte.android.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.settings.GetAccountSettingsRequest;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.v;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.asu0;
import xsna.oz50;
import xsna.ozl;
import xsna.tlo0;
import xsna.tq;
import xsna.vbs;
import xsna.wt30;

/* compiled from: SettingsAccountFragment.kt */
/* loaded from: classes7.dex */
public final class SettingsAccountFragment extends LoaderFragment {
    public static final /* synthetic */ int l0 = 0;

    /* compiled from: SettingsAccountFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(SettingsAccountFragment.class, null, null);
        }

        public final void y(String str) {
            if (str != null) {
                this.j.putString("pref_to_highlight", str);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentImpl b2 = In().b("SettingsAccountInnerFragment");
        if (b2 != null) {
            b2.onActivityResult(i, i2, intent);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        qo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        vkTopBar.setBack(new VkTopBar.b(new wt30(this, 17), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
        tlo0.f fVar = new tlo0.f(R.string.sett_account);
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), cVar, objArr2, objArr, 14));
        jo(vkTopBar);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        q a2 = GetAccountSettingsRequest.a();
        asu0 asu0Var = asu0.a;
        a2.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new b());
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_settings, (ViewGroup) null);
        inflate.setId(R.id.id);
        return inflate;
    }

    /* compiled from: SettingsAccountFragment.kt */
    public static final class b implements v<GetAccountSettingsRequest.Result> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            SettingsAccountFragment.this.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(GetAccountSettingsRequest.Result result) {
            GetAccountSettingsRequest.Result result2 = result;
            SettingsAccountFragment settingsAccountFragment = SettingsAccountFragment.this;
            if (settingsAccountFragment.In().b("SettingsAccountInnerFragment") != null) {
                settingsAccountFragment.oo();
                return;
            }
            SettingsAccountInnerFragment settingsAccountInnerFragment = new SettingsAccountInnerFragment();
            Bundle bundle = settingsAccountFragment.getArguments() == null ? new Bundle() : settingsAccountFragment.getArguments();
            bundle.putParcelable("api_result", result2);
            Bundle arguments = settingsAccountFragment.getArguments();
            if (arguments != null) {
                bundle.putString("pref_to_highlight", arguments.getString("pref_to_highlight"));
            }
            settingsAccountInnerFragment.setArguments(bundle);
            vbs vbsVar = settingsAccountFragment.In().q().a;
            vbsVar.c();
            vbsVar.a(R.id.id, settingsAccountInnerFragment, "SettingsAccountInnerFragment", false);
            vbsVar.d();
            settingsAccountFragment.oo();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            int i = SettingsAccountFragment.l0;
            SettingsAccountFragment.this.i0 = cVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }
    }
}
