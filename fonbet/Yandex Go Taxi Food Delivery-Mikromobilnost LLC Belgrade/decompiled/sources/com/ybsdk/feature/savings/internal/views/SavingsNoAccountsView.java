package com.ybsdk.feature.savings.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.doh0;
import defpackage.g8m0;
import defpackage.jr;
import defpackage.kdm0;
import defpackage.ny61;
import defpackage.tai0;
import defpackage.tbh0;
import defpackage.v4b1;
import defpackage.za61;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R>\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/savings/internal/views/SavingsNoAccountsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkdm0;", ClidProvider.STATE, "Lzy11;", "setVisibility", "(Lkdm0;)V", "render", "Lza61;", "binding", "Lza61;", "Lkotlin/Function3;", "Ljr;", "Lcom/ybsdk/feature/savings/internal/entities/CellType;", "Lcom/ybsdk/feature/savings/internal/entities/SavingProductType;", "actionListener", "Lzls;", "getActionListener", "()Lzls;", "setActionListener", "(Lzls;)V", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsNoAccountsView extends ConstraintLayout {
    private zls actionListener;
    private final za61 binding;

    public SavingsNoAccountsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(doh0.ybsdk_widget_no_account_layout, this);
        int i2 = tbh0.noAccountButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
        if (ybButtonView != null) {
            i2 = tbh0.noAccountImage;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = tbh0.noAccountSubtitle;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    i2 = tbh0.noAccountTitle;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        this.binding = new za61(this, ybButtonView, imageView, textView, textView2);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$0(kdm0 kdm0Var, YbButtonView.a aVar) {
        return new YbButtonView.a(kdm0Var.d, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2$lambda$1(SavingsNoAccountsView savingsNoAccountsView, kdm0 kdm0Var, View view) {
        zls zlsVar = savingsNoAccountsView.actionListener;
        if (zlsVar != null) {
            zlsVar.invoke(new jr(kdm0Var.e), kdm0Var.f, null);
        }
    }

    private final void setVisibility(kdm0 state) {
        this.binding.d.setVisibility(!(state.c instanceof Text.Empty) ? 0 : 8);
    }

    public final zls getActionListener() {
        return this.actionListener;
    }

    public final void render(kdm0 state) {
        setVisibility(state);
        za61 za61Var = this.binding;
        v4b1.k(state.a, za61Var.c, null, null, 6);
        za61Var.e.setText(d.a(getContext(), state.b));
        za61Var.d.setText(d.a(getContext(), state.c));
        YbButtonView ybButtonView = za61Var.b;
        ybButtonView.render(new g8m0(8, state));
        ybButtonView.setOnClickListener(new tai0(10, this, state));
    }

    public final void setActionListener(zls zlsVar) {
        this.actionListener = zlsVar;
    }

    public SavingsNoAccountsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsNoAccountsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsNoAccountsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
