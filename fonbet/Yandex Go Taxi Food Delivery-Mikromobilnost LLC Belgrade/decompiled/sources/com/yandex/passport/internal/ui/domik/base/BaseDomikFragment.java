package com.yandex.passport.internal.ui.domik.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.BaseNextFragment;
import com.yandex.passport.internal.ui.base.ShowFragmentInfo$AnimationType;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.domik.n;
import com.yandex.passport.internal.ui.g;
import com.yandex.passport.legacy.d;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.wuj0;
import defpackage.y4h0;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class BaseDomikFragment<V extends b, T extends BaseTrack> extends BaseNextFragment<V> {
    private static final float ERROR_SNACKBAR_TEXT_PROPORTION = 1.2f;
    protected Button buttonNext;
    protected e commonViewModel;
    protected T currentTrack;
    private Typeface editTextHintExpandedTypeface;
    protected c0 eventReporter;
    protected j flagRepository;
    private View progressBar;
    protected ScrollView scrollView;
    protected b0 statefulReporter;
    protected TextView textError;
    protected TextView textMessage;

    public static <F extends BaseDomikFragment> F baseNewInstance(BaseTrack baseTrack, Callable<F> callable) {
        try {
            F call = callable.call();
            Bundle bundle = new Bundle();
            bundle.putAll(baseTrack.toBundle());
            call.setArguments(bundle);
            return call;
        } catch (Exception e) {
            ny61.j(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showFatalErrorDialog$0(EventError eventError, DialogInterface dialogInterface, int i) {
        onFatalError(eventError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showFieldError$1() {
        this.scrollView.smoothScrollTo(0, this.textError.getBottom());
    }

    private void onFatalError(EventError eventError) {
        boolean isFatalErrorConsumed = isFatalErrorConsumed();
        e eVar = this.commonViewModel;
        if (isFatalErrorConsumed) {
            eVar.N = null;
        } else {
            eVar.N = eventError;
            eVar.A.m(new m(null, "pop_back", false));
        }
    }

    private void setTypeFaceForTextInputHint(View view) {
        if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setTypeface(this.editTextHintExpandedTypeface);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                setTypeFaceForTextInputHint(viewGroup.getChildAt(i));
            }
        }
    }

    private void showErrorDialog(EventError eventError, DialogInterface.OnClickListener onClickListener) {
        n nVar = ((b) this.viewModel).A;
        com.yandex.passport.internal.ui.m mVar = new com.yandex.passport.internal.ui.m(requireContext(), getDomikComponent().getDomikDesignProvider().e);
        Context requireContext = requireContext();
        nVar.getClass();
        mVar.e = requireContext.getString(R.string.passport_fatal_error_dialog_text);
        mVar.d(nVar.b(eventError.getErrorCode()));
        mVar.b = false;
        mVar.c = false;
        mVar.e(R.string.passport_fatal_error_dialog_button, onClickListener);
        registerDialog(mVar.a()).show();
    }

    private void showExternalAction(EventError eventError) {
        if (!"action.required_external_or_native".equals(eventError.getErrorCode())) {
            showExternalActionError(eventError);
            return;
        }
        getDomikComponent().getDomikRouter().a.A.m(new m(new t(6, this.currentTrack.toAuthTrack()), "ExternalActionFragment.FRAGMENT_TAG", true, ShowFragmentInfo$AnimationType.NONE));
    }

    private void showExternalActionError(EventError eventError) {
        e eVar = this.commonViewModel;
        eVar.M = eventError;
        eVar.A.m(new m(null, "pop_back", false));
        this.statefulReporter.b(eventError);
    }

    public com.yandex.passport.internal.ui.domik.di.a getDomikComponent() {
        return ((com.yandex.passport.internal.ui.domik.j) requireActivity()).getDomikComponent();
    }

    public abstract DomikStatefulReporter$Screen getScreenId();

    public void hideFieldError() {
        TextView textView = this.textError;
        if (textView != null) {
            getDomikComponent().getDomikDesignProvider().getClass();
            textView.setVisibility(4);
        }
    }

    public boolean isFatalErrorConsumed() {
        return false;
    }

    public abstract boolean isFieldErrorSupported(String str);

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.commonViewModel = (e) new ls31(requireActivity()).b(e.class);
        T t = (T) requireArguments().getParcelable(BaseTrack.KEY_TRACK);
        t.getClass();
        this.currentTrack = t;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.statefulReporter = a.getStatefulReporter();
        this.eventReporter = a.getEventReporter();
        this.flagRepository = a.getFlagRepository();
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onErrorCode(EventError eventError) {
        String errorCode = eventError.getErrorCode();
        this.statefulReporter.b(eventError);
        n nVar = ((b) this.viewModel).A;
        if (nVar.b.contains(errorCode) || g.d.matcher(errorCode).find()) {
            showErrorSnackbar(errorCode);
            return;
        }
        if ("action.required_external_or_native".equals(errorCode) || "action.required_native".equals(errorCode)) {
            showExternalAction(eventError);
            return;
        }
        if (nVar.c.contains(errorCode)) {
            showFatalErrorDialog(eventError);
        } else {
            if (isFieldErrorSupported(errorCode)) {
                showFieldError(nVar, errorCode);
                return;
            }
            e eVar = this.commonViewModel;
            eVar.M = eventError;
            eVar.A.m(new m(null, "pop_back", false));
        }
    }

    public void onScreenClosed() {
        b0 b0Var = this.statefulReporter;
        DomikStatefulReporter$Screen screenId = getScreenId();
        b0Var.getClass();
        b0Var.c(screenId, DomikStatefulReporter$Event.CLOSE_SCREEN);
    }

    public void onScreenOpened() {
        b0 b0Var = this.statefulReporter;
        DomikStatefulReporter$Screen screenId = getScreenId();
        Map f = kotlin.collections.b.f();
        b0Var.x = screenId;
        b0Var.d(screenId, DomikStatefulReporter$Event.OPEN_SCREEN, b0Var.a(f));
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onShowProgress(boolean z) {
        View view = this.progressBar;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
        Button button = this.buttonNext;
        if (button != null) {
            button.setEnabled(!z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        EventError eventError = this.commonViewModel.M;
        if (eventError != null) {
            ((b) this.viewModel).b.l(eventError);
            this.commonViewModel.M = null;
        }
        EventError eventError2 = this.commonViewModel.N;
        if (eventError2 != null) {
            onFatalError(eventError2);
        }
        super.onStart();
        if (getScreenId() != DomikStatefulReporter$Screen.NONE) {
            T t = this.currentTrack;
            boolean z = t instanceof RegTrack;
            b0 b0Var = this.statefulReporter;
            if (z) {
                b0Var.c = ((RegTrack) t).getRegOrigin();
            } else {
                b0Var.c = null;
            }
            onScreenOpened();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (getScreenId() != DomikStatefulReporter$Screen.NONE) {
            onScreenClosed();
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        try {
            this.editTextHintExpandedTypeface = wuj0.b(y4h0.ys_text_regular, requireContext());
        } catch (Resources.NotFoundException unused) {
        }
        setTypeFaceForTextInputHint(view);
        super.onViewCreated(view, bundle);
        this.buttonNext = (Button) view.findViewById(R.id.button_next);
        this.textError = (TextView) view.findViewById(R.id.text_error);
        this.textMessage = (TextView) view.findViewById(R.id.text_message);
        this.progressBar = view.findViewById(R.id.progress);
        this.scrollView = (ScrollView) view.findViewById(R.id.scroll_view);
        d.k(R.color.passport_progress_bar, view);
        hideFieldError();
        TextView textView = (TextView) view.findViewById(R.id.text_legal);
        if (textView != null) {
            d.a(this.statefulReporter, com.yandex.passport.internal.di.a.a().getProperties(), textView, this.currentTrack.getProperties().getTheme());
        }
    }

    public void showErrorSnackbar(String str) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(getString(((b) this.viewModel).A.b(str)));
        valueOf.setSpan(new RelativeSizeSpan(1.2f), 0, valueOf.length(), 0);
        this.commonViewModel.H.m(valueOf.toString());
        View view = getView();
        if (view != null) {
            view.announceForAccessibility(valueOf);
        }
    }

    public void showFatalErrorDialog(EventError eventError) {
        showErrorDialog(eventError, new a(0, this, eventError));
    }

    public void showFieldError(g gVar, String str) {
        TextView textView = this.textError;
        if (textView == null) {
            return;
        }
        textView.setText(gVar.b(str));
        this.textError.setVisibility(0);
        TextView textView2 = this.textError;
        if (textView2 != null) {
            textView2.performAccessibilityAction(64, null);
        }
        if (textView2 != null) {
            textView2.sendAccessibilityEvent(32768);
        }
        ScrollView scrollView = this.scrollView;
        if (scrollView != null) {
            scrollView.post(new com.yandex.passport.internal.n(8, this));
        }
    }
}
