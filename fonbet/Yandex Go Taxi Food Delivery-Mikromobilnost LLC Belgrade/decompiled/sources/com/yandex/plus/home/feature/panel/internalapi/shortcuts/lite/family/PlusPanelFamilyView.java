package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.nvg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J7\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/family/PlusPanelFamilyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "themedContext", "Lzy11;", "onThemeChanged", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "value", "isShortLayout", "Z", "()Z", "longLayoutMinWidth", CA20Status.STATUS_USER_I, "currentLayoutId", "Landroid/content/Context;", "getThemedContext", "()Landroid/content/Context;", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelFamilyView extends ConstraintLayout {
    private int currentLayoutId;
    private boolean isShortLayout;
    private final int longLayoutMinWidth;
    private Context themedContext;

    public PlusPanelFamilyView(Context context) {
        super(context);
        this.isShortLayout = true;
        this.longLayoutMinWidth = getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_family_long_layout_min_width);
        int i = cmh0.plus_sdk_panel_family_view_short;
        this.currentLayoutId = i;
        this.themedContext = context;
        bb1.v(this, i, true);
    }

    public final Context getThemedContext() {
        return this.themedContext;
    }

    /* renamed from: isShortLayout, reason: from getter */
    public final boolean getIsShortLayout() {
        return this.isShortLayout;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        boolean z = right - left < this.longLayoutMinWidth;
        this.isShortLayout = z;
        int i = z ? cmh0.plus_sdk_panel_family_view_short : cmh0.plus_sdk_panel_family_view_long;
        if (i != this.currentLayoutId) {
            this.currentLayoutId = i;
            removeAllViews();
            bb1.v(this, i, true);
        }
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }
}
