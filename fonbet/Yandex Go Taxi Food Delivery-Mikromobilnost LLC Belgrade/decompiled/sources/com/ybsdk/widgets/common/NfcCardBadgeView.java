package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.j361;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.sm91;
import defpackage.v4b1;
import defpackage.vng;
import defpackage.y760;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/widgets/common/NfcCardBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "drawableResId", "Lzy11;", "setBackground", "(I)V", "Lrbv;", "iconImageModel", "setIcon", "(Lrbv;)V", "Lcom/ybsdk/core/utils/text/Text;", "text", "textColorResId", "setText", "(Lcom/ybsdk/core/utils/text/Text;I)V", "Ly760;", "nfcBadgeState", "render", "(Ly760;)V", "Lj361;", "binding", "Lj361;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NfcCardBadgeView extends ConstraintLayout {
    private final j361 binding;

    public NfcCardBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_nfc_card_badge, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = fch0.imageNfcCardBadge;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = fch0.textNfcCardBadge;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                this.binding = new j361(constraintLayout, constraintLayout, imageView, textView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setBackground(int drawableResId) {
        j361 j361Var = this.binding;
        j361Var.b.setBackground(vng.t(drawableResId, sm91.c(j361Var)));
    }

    private final void setIcon(rbv iconImageModel) {
        v4b1.k(iconImageModel, this.binding.c, null, null, 6);
    }

    private final void setText(Text text, int textColorResId) {
        j361 j361Var = this.binding;
        j361Var.d.setText(com.ybsdk.core.utils.text.d.a(sm91.c(j361Var), text));
        j361Var.d.setTextColor(rje.a(sm91.c(j361Var), textColorResId));
    }

    public final void render(y760 nfcBadgeState) {
        this.binding.b.setVisibility(nfcBadgeState != null ? 0 : 8);
        if (nfcBadgeState != null) {
            setBackground(nfcBadgeState.a);
            setIcon(nfcBadgeState.b);
            setText(nfcBadgeState.c, nfcBadgeState.d);
        }
    }

    public NfcCardBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NfcCardBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public NfcCardBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
