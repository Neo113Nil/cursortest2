package com.yandex.plus.pay.ui.core.mobile.ui.kit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.theme.MaterialComponentsViewInflater;
import defpackage.gbd0;
import defpackage.sgd0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/ui/kit/PlusPayUiKitInflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "Lgbd0;", "designSystem", "<init>", "(Lgbd0;)V", "", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/view/View;", "onCreateView", "(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "parent", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "Lgbd0;", "Lcom/google/android/material/theme/MaterialComponentsViewInflater;", "fallbackInflater", "Lcom/google/android/material/theme/MaterialComponentsViewInflater;", "Companion", "sgd0", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayUiKitInflaterFactory implements LayoutInflater.Factory2 {
    private static final sgd0 Companion = new sgd0();

    @Deprecated
    public static final String NAME_BUTTON = "Button";

    @Deprecated
    public static final String NAME_PROGRESS_BAR = "ProgressBar";
    private final gbd0 designSystem;
    private final MaterialComponentsViewInflater fallbackInflater = new MaterialComponentsViewInflater();

    public PlusPayUiKitInflaterFactory(gbd0 gbd0Var) {
        this.designSystem = gbd0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return name.equals(NAME_BUTTON) ? new PlusPayUiKitButton(context, attrs, this.designSystem) : name.equals(NAME_PROGRESS_BAR) ? new PlusPayUiKitProgressBar(context, attrs, 0, 4, null) : this.fallbackInflater.f(parent, name, context, attrs, false, false, false, false);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }
}
