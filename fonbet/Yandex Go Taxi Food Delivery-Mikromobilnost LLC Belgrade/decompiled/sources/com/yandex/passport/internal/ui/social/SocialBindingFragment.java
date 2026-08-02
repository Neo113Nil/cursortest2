package com.yandex.passport.internal.ui.social;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.sloth.plusdevices.w;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.qx60;
import defpackage.vng;
import defpackage.wwg;
import defpackage.xfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0007R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/ui/social/SocialBindingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/yandex/passport/internal/ui/social/authenticators/f;", "Lcom/yandex/passport/internal/ui/social/m;", "createViewModel", "()Lcom/yandex/passport/internal/ui/social/authenticators/f;", "Lzy11;", "onCancel", "Lcom/yandex/passport/internal/ui/EventError;", ErrorResponseData.JSON_ERROR_CODE, "onErrorCode", "(Lcom/yandex/passport/internal/ui/EventError;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/yandex/passport/internal/SocialConfiguration;", "configuration", "Lcom/yandex/passport/internal/SocialConfiguration;", "viewModel$delegate", "Li3y;", "getViewModel", "viewModel", "Landroid/os/Bundle;", "Lcom/yandex/passport/internal/ui/social/j;", "getListener", "()Lcom/yandex/passport/internal/ui/social/j;", "listener", "Companion", "com/yandex/passport/internal/ui/social/i", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialBindingFragment extends Fragment {
    public static final int $stable = 8;
    public static final i Companion = new i();
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.social.SocialBindingFragment";
    private static final String KEY_SOCIAL_TYPE = "social-type";
    private static final String KEY_USE_NATIVE = "use-native";
    private SocialConfiguration configuration;
    private Bundle savedInstanceState;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = kotlin.a.a(new w(6, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.ui.social.authenticators.f createViewModel() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            ny61.r("Internal error: arguments can't be null");
            return null;
        }
        LoginProperties.Companion.getClass();
        LoginProperties a = com.yandex.passport.internal.properties.i.a(arguments);
        boolean z = arguments.getBoolean(KEY_USE_NATIVE);
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(arguments, ModernAccount.class, "master-account") : arguments.getParcelable("master-account");
        if (parcelable == null) {
            ny61.r("can't get required parcelable master-account");
            return null;
        }
        ModernAccount modernAccount = (ModernAccount) parcelable;
        Bundle bundle = this.savedInstanceState;
        SocialConfiguration socialConfiguration = this.configuration;
        return new com.yandex.passport.internal.ui.social.factory.a(a, bundle, modernAccount, socialConfiguration == null ? null : socialConfiguration, requireContext(), z).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j getListener() {
        if (getActivity() instanceof j) {
            return (j) getActivity();
        }
        throw new RuntimeException(getActivity() + " must implement SocialBindingListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.ui.social.authenticators.f getViewModel() {
        return (com.yandex.passport.internal.ui.social.authenticators.f) this.viewModel.getValue();
    }

    public static final SocialBindingFragment newInstance(LoginProperties loginProperties, SocialConfiguration socialConfiguration, ModernAccount modernAccount, boolean z) {
        Companion.getClass();
        SocialBindingFragment socialBindingFragment = new SocialBindingFragment();
        Bundle bundle = loginProperties.toBundle();
        bundle.putParcelable(KEY_SOCIAL_TYPE, socialConfiguration);
        bundle.putBoolean(KEY_USE_NATIVE, z);
        bundle.putAll(wwg.g(new Pair("master-account", modernAccount)));
        socialBindingFragment.setArguments(bundle);
        return socialBindingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel() {
        new Handler(Looper.getMainLooper()).post(new com.yandex.passport.internal.n(9, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCancel$lambda$1(SocialBindingFragment socialBindingFragment) {
        qx60 onBackPressedDispatcher;
        FragmentActivity activity = socialBindingFragment.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorCode(EventError errorCode) {
        Throwable exception = errorCode.getException();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Social auth error", exception);
        }
        int i = errorCode.getException() instanceof IOException ? R.string.passport_error_network : R.string.passport_reg_error_unknown;
        AlertDialog.a aVar = new AlertDialog.a(requireActivity());
        aVar.i(R.string.passport_error_dialog_title);
        aVar.c(i);
        aVar.setPositiveButton(android.R.string.ok, new com.yandex.passport.internal.ui.d(2, this)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onErrorCode$lambda$3(SocialBindingFragment socialBindingFragment, DialogInterface dialogInterface, int i) {
        socialBindingFragment.requireActivity().getOnBackPressedDispatcher().c();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        getViewModel().W(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        Bundle arguments = getArguments();
        if (arguments == null) {
            ny61.r("Internal error: configuration can't be null");
            return;
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(arguments, SocialConfiguration.class, KEY_SOCIAL_TYPE) : arguments.getParcelable(KEY_SOCIAL_TYPE);
        if (parcelable == null) {
            xfo.g("can't get required parcelable social-type");
        } else {
            this.configuration = (SocialConfiguration) parcelable;
            super.onCreate(savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.passport_fragment_social, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        eja1.s(this).d(new SocialBindingFragment$onViewCreated$1(this, null));
    }
}
