package com.yandex.passport.internal.ui.tv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.u;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.e;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.m;
import com.yandex.passport.internal.ui.util.j;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.util.p;
import defpackage.ds31;
import defpackage.j50;
import defpackage.jl40;
import defpackage.m50;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w53;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0003R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00107\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010505048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/yandex/passport/internal/ui/tv/AuthInWebViewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/yandex/passport/internal/properties/AuthByQrProperties;", "properties", "Lzy11;", "showWebViewActivity", "(Lcom/yandex/passport/internal/properties/AuthByQrProperties;)V", "Lcom/yandex/passport/internal/ModernAccount;", "account", "finishWithAccount", "(Lcom/yandex/passport/internal/ModernAccount;)V", "finishCancelled", "Lcom/yandex/passport/internal/ui/EventError;", "eventError", "processError", "(Lcom/yandex/passport/internal/ui/EventError;)V", "error", "finishWithError", "showErrorDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onPause", "Lcom/yandex/passport/internal/ui/tv/d;", "viewModel", "Lcom/yandex/passport/internal/ui/tv/d;", "Lcom/yandex/passport/internal/analytics/c0;", "eventReporter", "Lcom/yandex/passport/internal/analytics/c0;", "", "finishWithoutDialogOnError", "Z", "progress", "Landroid/view/View;", "Lcom/yandex/passport/internal/entities/Cookie;", "cookie", "Lcom/yandex/passport/internal/entities/Cookie;", "Lm50;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "webViewActivityLauncher", "Lm50;", "Companion", "com/yandex/passport/internal/ui/tv/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthInWebViewFragment extends Fragment {
    public static final int $stable = 8;
    public static final c Companion = new c();
    private static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.tv.AuthInWebViewFragment";
    private static final int REQUEST_WEB_VIEW_ACTION = 1;
    private Cookie cookie;
    private c0 eventReporter;
    private boolean finishWithoutDialogOnError;
    private View progress;
    private d viewModel;
    private final m50 webViewActivityLauncher = registerForActivityResult(new j50(), new h(this, 7));

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishCancelled() {
        FragmentActivity requireActivity = requireActivity();
        requireActivity.setResult(0);
        requireActivity.finish();
    }

    private final void finishWithAccount(ModernAccount account) {
        com.yandex.passport.internal.ui.c.k(requireActivity(), com.yandex.passport.internal.ui.c.B(new u(p.A(account.getUid()), a0.g0(account), PassportLoginAction.QR_ON_TV, null, null)));
    }

    private final void finishWithError(EventError error) {
        d dVar = this.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        int b = dVar.C.b(error.getErrorCode());
        Intent intent = new Intent();
        String string = getString(b);
        Bundle bundle = new Bundle();
        bundle.putString("passport-login-error-text", string);
        intent.putExtras(bundle);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.setResult(5, intent);
        requireActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(AuthInWebViewFragment authInWebViewFragment, ModernAccount modernAccount) {
        c0 c0Var = authInWebViewFragment.eventReporter;
        if (c0Var == null) {
            c0Var = null;
        }
        c0Var.c(modernAccount, false);
        c0 c0Var2 = authInWebViewFragment.eventReporter;
        c0 c0Var3 = c0Var2 != null ? c0Var2 : null;
        modernAccount.getUid();
        c0Var3.a.a(e.c, new w53());
        authInWebViewFragment.finishWithAccount(modernAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processError(EventError eventError) {
        if (jl40.l(eventError.getErrorCode(), "fake.user.cancelled")) {
            finishCancelled();
        } else if (this.finishWithoutDialogOnError) {
            finishWithError(eventError);
        } else {
            showErrorDialog(eventError);
        }
    }

    private final void showErrorDialog(EventError error) {
        Context requireContext = requireContext();
        m mVar = new m(requireContext);
        d dVar = this.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        mVar.d(dVar.C.b(error.getErrorCode()));
        final int i = 0;
        mVar.e(R.string.passport_reg_try_again, new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.tv.a
            public final /* synthetic */ AuthInWebViewFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                AuthInWebViewFragment authInWebViewFragment = this.b;
                switch (i3) {
                    case 0:
                        AuthInWebViewFragment.showErrorDialog$lambda$11(authInWebViewFragment, dialogInterface, i2);
                        break;
                    default:
                        authInWebViewFragment.finishCancelled();
                        break;
                }
            }
        });
        int i2 = R.string.passport_reg_cancel;
        final int i3 = 1;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.tv.a
            public final /* synthetic */ AuthInWebViewFragment b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                int i32 = i3;
                AuthInWebViewFragment authInWebViewFragment = this.b;
                switch (i32) {
                    case 0:
                        AuthInWebViewFragment.showErrorDialog$lambda$11(authInWebViewFragment, dialogInterface, i22);
                        break;
                    default:
                        authInWebViewFragment.finishCancelled();
                        break;
                }
            }
        };
        mVar.i = requireContext.getText(i2);
        mVar.j = onClickListener;
        mVar.d = new com.yandex.passport.internal.ui.e(4, this);
        mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$11(AuthInWebViewFragment authInWebViewFragment, DialogInterface dialogInterface, int i) {
        Cookie cookie = authInWebViewFragment.cookie;
        if (cookie == null) {
            com.yandex.passport.internal.properties.c cVar = AuthByQrProperties.Companion;
            Bundle requireArguments = authInWebViewFragment.requireArguments();
            cVar.getClass();
            authInWebViewFragment.showWebViewActivity(com.yandex.passport.internal.properties.c.a(requireArguments));
            return;
        }
        d dVar = authInWebViewFragment.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c.m(Boolean.TRUE);
        tje.N(ds31.a(dVar), null, null, new AuthInWebViewViewModel$authorizeByCookie$1(dVar, cookie, null, null), 3);
    }

    private final void showWebViewActivity(AuthByQrProperties properties) {
        com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
        PassportEnvironmentImpl environment = properties.getEnvironment();
        Context requireContext = requireContext();
        PassportTheme theme = properties.getTheme();
        WebCaseType webCaseType = WebCaseType.AUTH_ON_TV;
        boolean isShowSkipButton = properties.isShowSkipButton();
        boolean isShowSettingsButton = properties.isShowSettingsButton();
        boolean isFinishWithoutDialogOnError = properties.isFinishWithoutDialogOnError();
        Integer lottieSpinnerResId = properties.getLottieSpinnerResId();
        Integer backgroundResId = properties.getBackgroundResId();
        boolean skipBackButton = properties.getSkipBackButton();
        String origin = properties.getOrigin();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_skip_button", isShowSkipButton);
        bundle.putBoolean("show_settings_button", isShowSettingsButton);
        bundle.putBoolean("finish_without_dialog_on_error", isFinishWithoutDialogOnError);
        if (lottieSpinnerResId != null) {
            bundle.putInt("lottie_spinner_res_id", lottieSpinnerResId.intValue());
        }
        if (backgroundResId != null) {
            bundle.putInt("background_res_id", backgroundResId.intValue());
        }
        bundle.putBoolean("skip_back_button", skipBackButton);
        bundle.putString("origin", origin);
        this.webViewActivityLauncher.a(com.yandex.passport.internal.ui.webview.b.b(bVar, environment, requireContext, theme, webCaseType, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewActivityLauncher$lambda$6(AuthInWebViewFragment authInWebViewFragment, ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int resultCode = activityResult.getResultCode();
        if (resultCode == -1) {
            if (data == null || data.getExtras() == null) {
                c0 c0Var = authInWebViewFragment.eventReporter;
                if (c0Var == null) {
                    c0Var = null;
                }
                t tVar = c0Var.a;
                e eVar = e.b;
                tVar.a(a0.y(), new w53());
                d dVar = authInWebViewFragment.viewModel;
                (dVar != null ? dVar : null).b.m(new EventError("unknown error", new Exception("no cookie has returned from webview")));
                return;
            }
            Cookie.Companion.getClass();
            Cookie a = com.yandex.passport.internal.entities.d.a(data);
            Bundle arguments = authInWebViewFragment.getArguments();
            if (arguments == null) {
                ny61.r("Required value was null.");
                return;
            }
            arguments.putAll(a.toBundle());
            c0 c0Var2 = authInWebViewFragment.eventReporter;
            if (c0Var2 == null) {
                c0Var2 = null;
            }
            c0Var2.a.a(e.b, new w53());
            d dVar2 = authInWebViewFragment.viewModel;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.c.m(Boolean.TRUE);
            tje.N(ds31.a(dVar2), null, null, new AuthInWebViewViewModel$authorizeByCookie$1(dVar2, a, null, null), 3);
            return;
        }
        if (resultCode == 0) {
            c0 c0Var3 = authInWebViewFragment.eventReporter;
            if (c0Var3 == null) {
                c0Var3 = null;
            }
            t tVar2 = c0Var3.a;
            e eVar2 = e.b;
            tVar2.a(a0.N(), new w53());
            d dVar3 = authInWebViewFragment.viewModel;
            if (dVar3 == null) {
                dVar3 = null;
            }
            dVar3.b.m(new EventError("fake.user.cancelled", null, 2, null));
            return;
        }
        if (resultCode == 4) {
            c0 c0Var4 = authInWebViewFragment.eventReporter;
            t tVar3 = (c0Var4 != null ? c0Var4 : null).a;
            e eVar3 = e.b;
            tVar3.a(a0.N(), new w53());
            authInWebViewFragment.requireActivity().setResult(4);
            authInWebViewFragment.requireActivity().finish();
            return;
        }
        if (resultCode == 5 && authInWebViewFragment.finishWithoutDialogOnError) {
            c0 c0Var5 = authInWebViewFragment.eventReporter;
            t tVar4 = (c0Var5 != null ? c0Var5 : null).a;
            e eVar4 = e.b;
            tVar4.a(a0.y(), new w53());
            authInWebViewFragment.requireActivity().setResult(5, data);
            authInWebViewFragment.requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.yandex.passport.internal.entities.d dVar = Cookie.Companion;
        Bundle requireArguments = requireArguments();
        dVar.getClass();
        requireArguments.setClassLoader(p.class.getClassLoader());
        this.cookie = (Cookie) requireArguments.getParcelable("passport-cookie");
        com.yandex.passport.internal.properties.c cVar = AuthByQrProperties.Companion;
        Bundle requireArguments2 = requireArguments();
        cVar.getClass();
        AuthByQrProperties a = com.yandex.passport.internal.properties.c.a(requireArguments2);
        this.finishWithoutDialogOnError = a.isFinishWithoutDialogOnError();
        PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
        this.viewModel = a2.getAuthInWebViewViewModel();
        this.eventReporter = a2.getEventReporter();
        if (savedInstanceState == null) {
            showWebViewActivity(a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.passport_fragment_qr_on_tv, container, false);
        com.yandex.passport.internal.properties.c cVar = AuthByQrProperties.Companion;
        Bundle requireArguments = requireArguments();
        cVar.getClass();
        AuthByQrProperties a = com.yandex.passport.internal.properties.c.a(requireArguments);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.container);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.lottie);
        lottieAnimationView.setVisibility(8);
        Integer lottieSpinnerResId = a.getLottieSpinnerResId();
        if (lottieSpinnerResId != null) {
            lottieAnimationView.setAnimation(lottieSpinnerResId.intValue());
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress);
        progressBar.setVisibility(8);
        Integer backgroundResId = a.getBackgroundResId();
        if (backgroundResId != null) {
            frameLayout.setBackground(requireContext().getDrawable(backgroundResId.intValue()));
        }
        if (a.getLottieSpinnerResId() == null) {
            com.yandex.passport.legacy.d.b(requireContext(), progressBar, R.color.passport_progress_bar);
            lottieAnimationView = progressBar;
        }
        this.progress = lottieAnimationView;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.progress = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        d dVar = this.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        dVar.D.k(this);
        d dVar2 = this.viewModel;
        (dVar2 != null ? dVar2 : null).b.k(this);
        View view = this.progress;
        if (view instanceof LottieAnimationView) {
            ((LottieAnimationView) view).clearAnimation();
            ((LottieAnimationView) this.progress).cancelAnimation();
        }
        View view2 = this.progress;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.progress;
        if (view instanceof LottieAnimationView) {
            ((LottieAnimationView) view).playAnimation();
        }
        View view2 = this.progress;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d dVar = this.viewModel;
        if (dVar == null) {
            dVar = null;
        }
        final int i = 0;
        dVar.D.n(getViewLifecycleOwner(), new j(this) { // from class: com.yandex.passport.internal.ui.tv.b
            public final /* synthetic */ AuthInWebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i2 = i;
                AuthInWebViewFragment authInWebViewFragment = this.b;
                switch (i2) {
                    case 0:
                        AuthInWebViewFragment.onViewCreated$lambda$4(authInWebViewFragment, (ModernAccount) obj);
                        break;
                    default:
                        authInWebViewFragment.processError((EventError) obj);
                        break;
                }
            }
        });
        d dVar2 = this.viewModel;
        final int i2 = 1;
        (dVar2 != null ? dVar2 : null).b.n(getViewLifecycleOwner(), new j(this) { // from class: com.yandex.passport.internal.ui.tv.b
            public final /* synthetic */ AuthInWebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i2;
                AuthInWebViewFragment authInWebViewFragment = this.b;
                switch (i22) {
                    case 0:
                        AuthInWebViewFragment.onViewCreated$lambda$4(authInWebViewFragment, (ModernAccount) obj);
                        break;
                    default:
                        authInWebViewFragment.processError((EventError) obj);
                        break;
                }
            }
        });
    }
}
