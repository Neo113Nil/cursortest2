package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewBindingProvider;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes7.dex */
public final class ErrorVisualMonitor {
    private final ViewBindingProvider bindingProvider;
    private boolean enabled;
    private final ErrorModel errorModel;
    private ErrorView errorView;
    private ViewGroup lastConnectionView;
    private final boolean showPermanently;
    private final DivTypefaceProvider typefaceProvider;
    private final boolean visualErrorsEnabled;

    public ErrorVisualMonitor(ErrorCollectors errorCollectors, Div2View div2View, boolean z, boolean z2, ViewBindingProvider viewBindingProvider, DivTypefaceProvider divTypefaceProvider) {
        this.visualErrorsEnabled = z;
        this.showPermanently = z2;
        this.bindingProvider = viewBindingProvider;
        this.typefaceProvider = divTypefaceProvider;
        this.enabled = z || z2;
        this.errorModel = new ErrorModel(errorCollectors, div2View, z);
        connectOrDisconnect();
    }

    private final void connectOrDisconnect() {
        if (!this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = null;
            return;
        }
        this.bindingProvider.observeAndGet(new izs<Binding, s3q0>() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor$connectOrDisconnect$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Binding binding) {
                invoke2(binding);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Binding binding) {
                ErrorModel errorModel;
                errorModel = ErrorVisualMonitor.this.errorModel;
                errorModel.bind(binding);
            }
        });
        ViewGroup viewGroup = this.lastConnectionView;
        if (viewGroup != null) {
            connect(viewGroup);
        }
    }

    public final void connect(ViewGroup viewGroup) {
        this.lastConnectionView = viewGroup;
        if (this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = new ErrorView(viewGroup, this.errorModel, this.typefaceProvider, this.showPermanently);
        }
    }

    public final boolean getEnabled$div_release() {
        return this.enabled;
    }

    public final void setEnabled$div_release(boolean z) {
        this.enabled = z;
        connectOrDisconnect();
    }
}
