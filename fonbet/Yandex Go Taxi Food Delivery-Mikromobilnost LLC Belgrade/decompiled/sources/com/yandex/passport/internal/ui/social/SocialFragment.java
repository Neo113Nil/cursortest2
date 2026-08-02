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
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.social.VkNativeSocialAuthActivity;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.sloth.plusdevices.w;
import com.yandex.passport.internal.x;
import com.yandex.passport.internal.y;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.qx60;
import defpackage.vng;
import defpackage.xfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0003J)\u0010'\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0015J\u0019\u0010+\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b+\u0010\u0015R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0007R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/yandex/passport/internal/ui/social/SocialFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/yandex/passport/internal/ui/social/authenticators/f;", "Lcom/yandex/passport/internal/ui/social/h;", "createViewModel", "()Lcom/yandex/passport/internal/ui/social/authenticators/f;", "Lcom/yandex/passport/internal/ModernAccount;", "account", "Lzy11;", "onSuccessAuth", "(Lcom/yandex/passport/internal/ModernAccount;)V", "Lcom/yandex/passport/internal/ui/EventError;", ErrorResponseData.JSON_ERROR_CODE, "onErrorCode", "(Lcom/yandex/passport/internal/ui/EventError;)V", "onCancel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "onViewStateRestored", "Lcom/yandex/passport/internal/SocialConfiguration;", "configuration", "Lcom/yandex/passport/internal/SocialConfiguration;", "Landroid/widget/ProgressBar;", "progress", "Landroid/widget/ProgressBar;", "Landroid/os/Bundle;", "viewModel$delegate", "Li3y;", "getViewModel", "viewModel", "Lcom/yandex/passport/internal/ui/social/a;", "getListener", "()Lcom/yandex/passport/internal/ui/social/a;", "listener", "Lcom/yandex/passport/internal/ui/domik/di/a;", "getDomikComponent", "()Lcom/yandex/passport/internal/ui/domik/di/a;", "domikComponent", "Companion", "com/yandex/passport/internal/ui/social/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialFragment extends Fragment {
    public static final int $stable = 8;
    public static final n Companion = new n();
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.social.SocialFragment";
    private static final String KEY_SOCIAL_TYPE = "social-type";
    private static final String KEY_UID = "uid";
    private static final String KEY_USE_NATIVE = "use-native";
    private SocialConfiguration configuration;
    private ProgressBar progress;
    private Bundle savedInstanceState;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = kotlin.a.a(new w(7, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.ui.social.authenticators.f createViewModel() {
        ModernAccount modernAccount;
        String num;
        String str;
        Bundle arguments = getArguments();
        if (arguments == null) {
            ny61.r("Internal error: arguments can't be null");
            return null;
        }
        boolean z = arguments.getBoolean(KEY_USE_NATIVE);
        Bundle bundle = arguments.containsKey("master-account") ? arguments : null;
        if (bundle != null) {
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, ModernAccount.class, "master-account") : bundle.getParcelable("master-account");
            if (parcelable == null) {
                ny61.r("can't get required parcelable master-account");
                return null;
            }
            modernAccount = (ModernAccount) parcelable;
        } else {
            modernAccount = null;
        }
        y yVar = SocialConfiguration.Companion;
        SocialConfiguration socialConfiguration = this.configuration;
        if (socialConfiguration == null) {
            socialConfiguration = null;
        }
        PassportSocialConfiguration id = socialConfiguration.getId();
        Context requireContext = requireContext();
        yVar.getClass();
        int i = x.a[id.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 6) {
                    num = requireContext.getResources().getString(R.string.passport_default_google_client_id);
                }
                str = null;
            } else {
                num = requireContext.getResources().getString(R.string.passport_facebook_application_id_override);
                if (num.length() == 0) {
                    num = requireContext.getPackageManager().getApplicationInfo(requireContext.getPackageName(), 128).metaData.getString("com.facebook.sdk.ApplicationId");
                }
            }
            str = num;
        } else {
            Integer vkApplicationId = VkNativeSocialAuthActivity.getVkApplicationId(requireContext);
            if (vkApplicationId != null) {
                num = vkApplicationId.toString();
                str = num;
            }
            str = null;
        }
        Parcelable parcelable2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(arguments, AuthTrack.class, BaseTrack.KEY_TRACK) : arguments.getParcelable(BaseTrack.KEY_TRACK);
        if (parcelable2 == null) {
            ny61.r("can't get required parcelable track");
            return null;
        }
        AuthTrack authTrack = (AuthTrack) parcelable2;
        Bundle bundle2 = this.savedInstanceState;
        SocialConfiguration socialConfiguration2 = this.configuration;
        return new com.yandex.passport.internal.ui.social.factory.a(authTrack, str, bundle2, socialConfiguration2 == null ? null : socialConfiguration2, requireContext(), z, modernAccount).a();
    }

    private final com.yandex.passport.internal.ui.domik.di.a getDomikComponent() {
        return ((com.yandex.passport.internal.ui.domik.j) requireActivity()).getDomikComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getListener() {
        if (getActivity() instanceof a) {
            return (a) getActivity();
        }
        throw new RuntimeException(requireActivity() + " must implement SocialAuthListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.passport.internal.ui.social.authenticators.f getViewModel() {
        return (com.yandex.passport.internal.ui.social.authenticators.f) this.viewModel.getValue();
    }

    public static final SocialFragment newInstance(AuthTrack authTrack, SocialConfiguration socialConfiguration, boolean z, ModernAccount modernAccount) {
        Companion.getClass();
        return n.a(authTrack, socialConfiguration, z, modernAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel() {
        new Handler(Looper.getMainLooper()).post(new com.yandex.passport.internal.n(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCancel$lambda$4(SocialFragment socialFragment) {
        qx60 onBackPressedDispatcher;
        FragmentActivity activity = socialFragment.getActivity();
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
        FragmentActivity requireActivity = requireActivity();
        int i = exception instanceof IOException ? R.string.passport_error_network : R.string.passport_reg_error_unknown;
        com.yandex.passport.internal.ui.m mVar = new com.yandex.passport.internal.ui.m(requireActivity, getDomikComponent().getDomikDesignProvider().e);
        mVar.f(R.string.passport_error_dialog_title);
        mVar.d(i);
        int i2 = 3;
        mVar.e(android.R.string.ok, new com.yandex.passport.internal.ui.d(i2, requireActivity));
        mVar.d = new com.yandex.passport.internal.ui.e(i2, requireActivity);
        mVar.a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onErrorCode$lambda$2(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        fragmentActivity.getOnBackPressedDispatcher().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onErrorCode$lambda$3(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        fragmentActivity.getOnBackPressedDispatcher().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccessAuth(ModernAccount account) {
        getListener().onSocialAccountAdded(account);
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
        View inflate = inflater.inflate(getDomikComponent().getDomikDesignProvider().a, container, false);
        this.progress = (ProgressBar) inflate.findViewById(R.id.progress);
        Context requireContext = requireContext();
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            progressBar = null;
        }
        com.yandex.passport.legacy.d.b(requireContext, progressBar, R.color.passport_progress_bar);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(8);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getViewModel().Z(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        eja1.s(this).d(new SocialFragment$onViewCreated$1(this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        getViewModel().Y(savedInstanceState);
    }
}
