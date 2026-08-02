package com.ybsdk.feature.card.internal.presentation.carddetails;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.anh0;
import defpackage.cma1;
import defpackage.dac;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rje;
import defpackage.sah0;
import defpackage.ung0;
import defpackage.vng;
import defpackage.x361;
import defpackage.xty0;
import defpackage.yqj0;
import defpackage.yvg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddetails/CardRequisiteFieldView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyqj0;", ClidProvider.STATE, "Lzy11;", "render", "(Lyqj0;)V", "Lx361;", "binding", "Lx361;", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardRequisiteFieldView extends CardView {
    private final x361 binding;

    public CardRequisiteFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(anh0.ybsdk_partner_card_requisite_field_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = sah0.copyIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
        if (appCompatImageView != null) {
            i2 = sah0.textHint;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                i2 = sah0.textValue;
                TextView textView2 = (TextView) cma1.O(i2, inflate);
                if (textView2 != null) {
                    i2 = sah0.ybCardContent;
                    if (((ConstraintLayout) cma1.O(i2, inflate)) != null) {
                        this.binding = new x361((ShimmerFrameLayout) inflate, appCompatImageView, textView, textView2);
                        setCardBackgroundColor(rje.a(context, ung0.ybColor_fill_default_50));
                        setCardElevation(0.0f);
                        setRadius(com.ybsdk.core.utils.ext.view.b.h(yvg0.ybsdk_card_requisite_corner_radius, this));
                        TypedValue typedValue = new TypedValue();
                        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                        int i3 = typedValue.resourceId;
                        Drawable t = vng.t(i3, getContext());
                        if (t != null) {
                            setForeground(t);
                            return;
                        } else {
                            dac.f(getResources().getResourceEntryName(i3), "No drawable with id: ");
                            throw null;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final ImageView getIcon() {
        return this.binding.b;
    }

    public final void render(yqj0 state) {
        xty0.d(this.binding.c, state.b);
        CharSequence text = this.binding.d.getText();
        Text text2 = state.a;
        if (!jl40.l(text, text2)) {
            CharSequence a = d.a(getContext(), text2);
            TextView textView = this.binding.d;
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new SameWidthCharacterSpan(), 0, a.length(), 0);
            textView.setText(spannableString);
        }
        boolean z = state.c;
        x361 x361Var = this.binding;
        if (z) {
            x361Var.a.startShimmer();
        } else {
            x361Var.a.stopShimmer();
        }
    }

    public CardRequisiteFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardRequisiteFieldView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CardRequisiteFieldView(Context context) {
        this(context, null, 0, 6, null);
    }
}
