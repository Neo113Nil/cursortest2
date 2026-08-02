package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.cch0;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.ka61;
import defpackage.kwg0;
import defpackage.n4u;
import defpackage.noh0;
import defpackage.ny61;
import defpackage.smg0;
import defpackage.tja1;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/GuidelineItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Ln4u;", "Lzy11;", "listener", "setOnClickListener", "(Ltls;)V", ClidProvider.STATE, "render", "(Ln4u;)V", "Lka61;", "binding", "Lka61;", "currentState", "Ln4u;", "onClickListener", "Ltls;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuidelineItemView extends LinearLayout {
    private final ka61 binding;
    private n4u currentState;
    private tls onClickListener;

    public GuidelineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(noh0.ybsdk_transfers_dashboard_guideline_item, this);
        int i2 = cch0.guidelineItemImage;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = cch0.guidelineItemText;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new ka61(this, imageView, textView);
                setOrientation(1);
                setLayoutParams(new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(kwg0.ybsdk_transfers_dashboard_guideline_item_width), -2));
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                setOnClickListener(new cmi(28, this));
                setClickable(true);
                setFocusable(true);
                setImportantForAccessibility(1);
                tja1.b(this);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(GuidelineItemView guidelineItemView, View view) {
        tls tlsVar;
        n4u n4uVar = guidelineItemView.currentState;
        if (n4uVar == null || (tlsVar = guidelineItemView.onClickListener) == null) {
            return;
        }
        tlsVar.invoke(n4uVar);
    }

    public final void render(n4u state) {
        ka61 ka61Var = this.binding;
        v4b1.k(state.a, ka61Var.b, null, null, 6);
        TextView textView = ka61Var.c;
        Text text = state.b;
        xty0.d(textView, text);
        setContentDescription(d.a(getContext(), text));
        this.currentState = state;
    }

    public final void setOnClickListener(tls listener) {
        this.onClickListener = listener;
    }

    public GuidelineItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ GuidelineItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public GuidelineItemView(Context context) {
        this(context, null, 0, 6, null);
    }
}
