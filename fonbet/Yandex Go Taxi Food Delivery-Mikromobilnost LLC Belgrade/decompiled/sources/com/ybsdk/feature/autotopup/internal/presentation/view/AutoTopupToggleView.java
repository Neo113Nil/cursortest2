package com.ybsdk.feature.autotopup.internal.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.cma1;
import defpackage.gjb1;
import defpackage.hbv;
import defpackage.kp50;
import defpackage.m24;
import defpackage.n24;
import defpackage.ny61;
import defpackage.pah0;
import defpackage.rbv;
import defpackage.v4b1;
import defpackage.w161;
import defpackage.xmh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\n\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/view/AutoTopupToggleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm24;", ClidProvider.STATE, "Lhbv;", "render", "(Lm24;)Lhbv;", "Lw161;", "binding", "Lw161;", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchButton", "()Landroidx/appcompat/widget/SwitchCompat;", "switchButton", "Landroid/widget/ImageView;", "getSubtitleEndIcon", "()Landroid/widget/ImageView;", "subtitleEndIcon", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "Companion", "n24", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupToggleView extends ConstraintLayout {
    private static final n24 Companion = new n24();
    private static final int TITLE_END_BADGE_MEASUREMENTS_PX = kp50.r(16);
    private final w161 binding;

    public AutoTopupToggleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(xmh0.ybsdk_item_auto_topup_switch, (ViewGroup) this, false);
        addView(inflate);
        int i2 = pah0.subtitle;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = pah0.subtitleEndIcon;
            ImageView imageView = (ImageView) cma1.O(i2, inflate);
            if (imageView != null) {
                i2 = pah0.switchButton;
                SwitchCompat switchCompat = (SwitchCompat) cma1.O(i2, inflate);
                if (switchCompat != null) {
                    i2 = pah0.title;
                    TextView textView2 = (TextView) cma1.O(i2, inflate);
                    if (textView2 != null) {
                        this.binding = new w161((ShimmerFrameLayout) inflate, textView, imageView, switchCompat, textView2);
                        gjb1.d(switchCompat);
                        switchCompat.setSaveEnabled(false);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final ImageView getSubtitleEndIcon() {
        return this.binding.c;
    }

    public final SwitchCompat getSwitchButton() {
        return this.binding.d;
    }

    public final TextView getTitle() {
        return this.binding.e;
    }

    public final hbv render(m24 state) {
        w161 w161Var = this.binding;
        w161Var.e.setText(d.a(getContext(), state.a));
        TextView textView = w161Var.b;
        Text text = state.c;
        int i = 8;
        textView.setVisibility(text != null ? 0 : 8);
        if (text != null) {
            textView.setText(d.a(getContext(), text));
        }
        w161Var.d.setChecked(state.d);
        ImageView imageView = w161Var.c;
        if (textView.getVisibility() == 0 && state.e != null) {
            i = 0;
        }
        imageView.setVisibility(i);
        rbv rbvVar = state.b;
        if (rbvVar == null) {
            return null;
        }
        TextView textView2 = w161Var.e;
        int i2 = TITLE_END_BADGE_MEASUREMENTS_PX;
        return v4b1.h(rbvVar, textView2, i2, i2);
    }

    public AutoTopupToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AutoTopupToggleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AutoTopupToggleView(Context context) {
        this(context, null, 0, 6, null);
    }
}
