package com.yandex.passport.internal.ui.domik.extaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.entities.d;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.util.p;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.j50;
import defpackage.m50;
import defpackage.tje;
import defpackage.w53;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/passport/internal/ui/domik/extaction/ExternalActionFragment;", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "Lcom/yandex/passport/internal/ui/domik/extaction/b;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "<init>", "()V", "Lzy11;", "showExternalAction", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", ErrorResponseData.JSON_ERROR_CODE, "", "isFieldErrorSupported", "(Ljava/lang/String;)Z", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/extaction/b;", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "Landroid/widget/ProgressBar;", "progress", "Landroid/widget/ProgressBar;", "Lcom/yandex/passport/internal/entities/Cookie;", "cookie", "Lcom/yandex/passport/internal/entities/Cookie;", "Lm50;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "webViewActivityLauncher", "Lm50;", "Companion", "com/yandex/passport/internal/ui/domik/extaction/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalActionFragment extends BaseDomikFragment<b, AuthTrack> {
    public static final int $stable = 8;
    public static final a Companion = new a();
    private Cookie cookie;
    private ProgressBar progress;
    private final m50 webViewActivityLauncher = registerForActivityResult(new j50(), new h(this, 5));

    public static final ExternalActionFragment newInstance(AuthTrack authTrack) {
        Companion.getClass();
        return (ExternalActionFragment) BaseDomikFragment.baseNewInstance(authTrack, new com.yandex.passport.internal.ui.authbytrack.b(1));
    }

    private final void showExternalAction() {
        Bundle bundle = new Bundle();
        String trackId = ((AuthTrack) this.currentTrack).getTrackId();
        if (trackId != null) {
            bundle.putString("key-track-id", evu0.k0(trackId).toString());
        }
        Intent b = com.yandex.passport.internal.ui.webview.b.b(WebViewActivity.Companion, p.y(((AuthTrack) this.currentTrack).requireEnvironment()), requireContext(), ((AuthTrack) this.currentTrack).getProperties().getTheme(), WebCaseType.WEB_EXTERNAL_ACTION, bundle);
        b.putExtras(bundle);
        this.webViewActivityLauncher.a(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewActivityLauncher$lambda$0(ExternalActionFragment externalActionFragment, ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode != 0) {
                return;
            }
            b0 b0Var = externalActionFragment.statefulReporter;
            DomikStatefulReporter$Screen screenId = externalActionFragment.getScreenId();
            b0Var.getClass();
            b0Var.c(screenId, DomikStatefulReporter$Event.EXTERNAL_ACTION_AUTH_CANCEL);
            externalActionFragment.commonViewModel.A.m(new m(null, "pop_back", false));
            return;
        }
        if (data == null || data.getExtras() == null) {
            Exception exc = new Exception("no cookie has returned from webview");
            b0 b0Var2 = externalActionFragment.statefulReporter;
            DomikStatefulReporter$Screen screenId2 = externalActionFragment.getScreenId();
            b0Var2.getClass();
            w53 w53Var = new w53();
            w53Var.put("error", Log.getStackTraceString(exc));
            w53Var.put("success", "0");
            b0Var2.d(screenId2, DomikStatefulReporter$Event.EXTERNAL_ACTION_AUTH, w53Var);
            e eVar = externalActionFragment.commonViewModel;
            eVar.M = new EventError("Session not valid", exc);
            eVar.A.m(new m(null, "pop_back", false));
            return;
        }
        Cookie.Companion.getClass();
        Cookie a = d.a(data);
        externalActionFragment.requireArguments().putAll(a.toBundle());
        b0 b0Var3 = externalActionFragment.statefulReporter;
        DomikStatefulReporter$Screen screenId3 = externalActionFragment.getScreenId();
        b0Var3.getClass();
        w53 w53Var2 = new w53();
        w53Var2.put("success", "1");
        b0Var3.d(screenId3, DomikStatefulReporter$Event.EXTERNAL_ACTION_AUTH, w53Var2);
        b bVar = (b) externalActionFragment.viewModel;
        AuthTrack authTrack = (AuthTrack) externalActionFragment.currentTrack;
        bVar.c.m(Boolean.TRUE);
        tje.N(ds31.a(bVar), ((com.yandex.passport.common.coroutine.b) bVar.E).d, null, new ExternalActionViewModel$authorizeByCookie$1(bVar, a, authTrack, null), 2);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public b createViewModel(PassportProcessGlobalComponent component) {
        return getDomikComponent().newExternalActionViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.EXTERNAL_ACTION;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return false;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d dVar = Cookie.Companion;
        Bundle requireArguments = requireArguments();
        dVar.getClass();
        requireArguments.setClassLoader(p.class.getClassLoader());
        this.cookie = (Cookie) requireArguments.getParcelable("passport-cookie");
        this.statefulReporter = com.yandex.passport.internal.di.a.a().getStatefulReporter();
        if (savedInstanceState == null) {
            showExternalAction();
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
}
