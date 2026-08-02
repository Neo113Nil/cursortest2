package com.ybsdk.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.api.widgets.YBBalanceBadgeView;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.bf51;
import defpackage.cf51;
import defpackage.df51;
import defpackage.j1i0;
import defpackage.tvg0;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/widgets/BalanceBadgeV2ViewImpl;", "Lcom/ybsdk/api/widgets/YBBalanceBadgeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldf51;", ClidProvider.STATE, "Lzy11;", "render", "(Ldf51;)V", "currentState", "Ldf51;", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalanceBadgeV2ViewImpl extends YBBalanceBadgeView {
    private df51 currentState;
    private final AppCompatTextView textView;

    public BalanceBadgeV2ViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, j1i0.YbSdkBalanceBadgeV2TextStyle));
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, b.h(tvg0.ybsdk_badge_height, this)));
        addView(appCompatTextView);
        this.textView = appCompatTextView;
    }

    @Override // com.ybsdk.api.widgets.YBBalanceBadgeView
    public void render(df51 state) {
        if (state.equals(bf51.a)) {
            b.l(this);
        } else {
            if (!(state instanceof cf51)) {
                w511.b();
                return;
            }
            setVisibility(0);
            cf51 cf51Var = (cf51) state;
            this.textView.setCompoundDrawablesRelativeWithIntrinsicBounds(cf51Var.b.a, (Drawable) null, (Drawable) null, (Drawable) null);
            this.textView.setText(cf51Var.a);
        }
        this.currentState = state;
    }

    public BalanceBadgeV2ViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BalanceBadgeV2ViewImpl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BalanceBadgeV2ViewImpl(Context context) {
        this(context, null, 0, 6, null);
    }
}
