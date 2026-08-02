package com.yandex.div.core.view2.errors;

import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.R$dimen;
import com.yandex.div.R$drawable;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import xsna.a11;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ErrorView.kt */
/* loaded from: classes7.dex */
public final class ErrorView implements Disposable {
    private ViewGroup counterView;
    private DetailsViewGroup detailsView;
    private final ErrorModel errorModel;
    private final Disposable modelObservation;
    private final ViewGroup root;
    private final boolean showPermanently;
    private final DivTypefaceProvider typefaceProvider;
    private ErrorViewModel viewModel;

    public ErrorView(ViewGroup viewGroup, ErrorModel errorModel, DivTypefaceProvider divTypefaceProvider, boolean z) {
        this.root = viewGroup;
        this.errorModel = errorModel;
        this.typefaceProvider = divTypefaceProvider;
        this.showPermanently = z;
        this.modelObservation = errorModel.observeAndGet(new izs<ErrorViewModel, s3q0>() { // from class: com.yandex.div.core.view2.errors.ErrorView$modelObservation$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(ErrorViewModel errorViewModel) {
                invoke2(errorViewModel);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorViewModel errorViewModel) {
                ErrorView.this.setViewModel(errorViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewModel(ErrorViewModel errorViewModel) {
        updateView(this.viewModel, errorViewModel);
        this.viewModel = errorViewModel;
    }

    private final void tryAddCounterView() {
        if (this.counterView != null) {
            return;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.root.getContext());
        appCompatTextView.setBackgroundResource(R$drawable.error_counter_background);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(-16777216);
        appCompatTextView.setGravity(17);
        appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R$dimen.div_shadow_elevation));
        appCompatTextView.setTypeface(this.typefaceProvider.getRegular());
        appCompatTextView.setOnClickListener(new a11(this, 4));
        DisplayMetrics displayMetrics = this.root.getContext().getResources().getDisplayMetrics();
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(24, displayMetrics);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dpToPx, dpToPx);
        int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        marginLayoutParams.topMargin = dpToPx2;
        marginLayoutParams.leftMargin = dpToPx2;
        marginLayoutParams.rightMargin = dpToPx2;
        marginLayoutParams.bottomMargin = dpToPx2;
        FrameContainerLayout frameContainerLayout = new FrameContainerLayout(this.root.getContext(), null, 0, 6, null);
        frameContainerLayout.addView(appCompatTextView, marginLayoutParams);
        this.root.addView(frameContainerLayout, -1, -1);
        this.counterView = frameContainerLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAddCounterView$lambda$5$lambda$4(ErrorView errorView, View view) {
        errorView.errorModel.onCounterClick(errorView.root.getWidth(), errorView.root.getHeight());
    }

    private final void tryAddDetailsView() {
        if (this.detailsView != null) {
            return;
        }
        DetailsViewGroup detailsViewGroup = new DetailsViewGroup(this.root.getContext(), this.errorModel.getErrorHandler(), new gzs<s3q0>() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ErrorModel errorModel;
                errorModel = ErrorView.this.errorModel;
                errorModel.hideDetails();
            }
        }, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ErrorViewModel errorViewModel;
                ErrorModel errorModel;
                errorViewModel = ErrorView.this.viewModel;
                if (errorViewModel != null) {
                    errorModel = ErrorView.this.errorModel;
                    errorModel.copyReportToClipboard();
                }
            }
        });
        this.root.addView(detailsViewGroup, new ViewGroup.LayoutParams(-1, -1));
        this.detailsView = detailsViewGroup;
    }

    private final void updateView(ErrorViewModel errorViewModel, ErrorViewModel errorViewModel2) {
        if (errorViewModel == null || errorViewModel2 == null || errorViewModel.getShowDetails() != errorViewModel2.getShowDetails()) {
            ViewGroup viewGroup = this.counterView;
            if (viewGroup != null) {
                this.root.removeView(viewGroup);
            }
            this.counterView = null;
            DetailsViewGroup detailsViewGroup = this.detailsView;
            if (detailsViewGroup != null) {
                this.root.removeView(detailsViewGroup);
            }
            this.detailsView = null;
        }
        if (errorViewModel2 == null) {
            return;
        }
        if (errorViewModel2.getShowDetails()) {
            tryAddDetailsView();
            DetailsViewGroup detailsViewGroup2 = this.detailsView;
            if (detailsViewGroup2 != null) {
                detailsViewGroup2.setText(errorViewModel2.getDetails());
            }
            DetailsViewGroup detailsViewGroup3 = this.detailsView;
            if (detailsViewGroup3 != null) {
                detailsViewGroup3.updateVariables(this.errorModel.getAllControllers());
                return;
            }
            return;
        }
        if (errorViewModel2.getCounterText().length() <= 0 && !this.showPermanently) {
            ViewGroup viewGroup2 = this.counterView;
            if (viewGroup2 != null) {
                this.root.removeView(viewGroup2);
            }
            this.counterView = null;
        } else {
            tryAddCounterView();
        }
        ViewGroup viewGroup3 = this.counterView;
        KeyEvent.Callback childAt = viewGroup3 != null ? viewGroup3.getChildAt(0) : null;
        AppCompatTextView appCompatTextView = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(errorViewModel2.getCounterText());
            appCompatTextView.setBackgroundResource(errorViewModel2.getCounterBackground());
        }
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.modelObservation.close();
        this.root.removeView(this.counterView);
        this.root.removeView(this.detailsView);
    }
}
