package com.ybsdk.core.transfer.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.cma1;
import defpackage.eu01;
import defpackage.fa61;
import defpackage.fu01;
import defpackage.gu01;
import defpackage.jl01;
import defpackage.mah0;
import defpackage.ny61;
import defpackage.qtz0;
import defpackage.rbv;
import defpackage.rtz0;
import defpackage.sls;
import defpackage.stz0;
import defpackage.tls;
import defpackage.umh0;
import defpackage.v4b1;
import defpackage.vng;
import defpackage.vxg0;
import defpackage.w511;
import defpackage.xty0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgu01;", ClidProvider.STATE, "Lzy11;", "render", "(Lgu01;)V", "Landroid/view/View$OnClickListener;", "listener", "setSubtitleClickListener", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function0;", "setOnCloseButtonClickListener", "(Lsls;)V", "setOnRightImageClickListener", "Lfa61;", "binding", "Lfa61;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferToolbarView extends ConstraintLayout {
    private final fa61 binding;

    public TransferToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(umh0.ybsdk_transfer_toolbar, this);
        int i2 = mah0.endSpace;
        if (((Space) cma1.O(i2, this)) != null) {
            i2 = mah0.startSpace;
            if (((Space) cma1.O(i2, this)) != null) {
                i2 = mah0.transferToolbarBase;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i2, this);
                if (toolbarView != null) {
                    i2 = mah0.transferToolbarLeftIcon;
                    ImageView imageView = (ImageView) cma1.O(i2, this);
                    if (imageView != null) {
                        i2 = mah0.transferToolbarRightIcon;
                        ImageView imageView2 = (ImageView) cma1.O(i2, this);
                        if (imageView2 != null) {
                            i2 = mah0.transferToolbarSubtitleAccount;
                            TextView textView = (TextView) cma1.O(i2, this);
                            if (textView != null) {
                                i2 = mah0.transferToolbarSubtitleAmount;
                                SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                                if (spoilerTextView != null && (O = cma1.O((i2 = mah0.transferToolbarSubtitleClickArea), this)) != null) {
                                    i2 = mah0.transferToolbarSubtitleDelimeter;
                                    TextView textView2 = (TextView) cma1.O(i2, this);
                                    if (textView2 != null) {
                                        i2 = mah0.transferToolbarTitle;
                                        TextView textView3 = (TextView) cma1.O(i2, this);
                                        if (textView3 != null) {
                                            this.binding = new fa61(this, toolbarView, imageView, imageView2, textView, spoilerTextView, O, textView2, textView3);
                                            xty0.b(textView);
                                            xty0.b(textView3);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$4$lambda$1(TransferToolbarView transferToolbarView, boolean z) {
        fa61 fa61Var = transferToolbarView.binding;
        fa61Var.g.setContentDescription(((Object) fa61Var.e.getText()) + " " + ((Object) transferToolbarView.binding.f.getContentDescription()));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$4$lambda$2(gu01 gu01Var, stz0 stz0Var) {
        eu01 eu01Var = (eu01) gu01Var;
        rtz0 rtz0Var = eu01Var.f;
        if (rtz0Var == null) {
            rtz0Var = qtz0.a;
        }
        return stz0.a(stz0Var, null, null, null, eu01Var.g, null, rtz0Var, false, false, null, null, 0, 32727);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$4$lambda$3(gu01 gu01Var, stz0 stz0Var) {
        fu01 fu01Var = (fu01) gu01Var;
        return stz0.a(stz0Var, fu01Var.a, null, null, null, null, fu01Var.b, true, false, null, null, 0, 32660);
    }

    public final void render(final gu01 state) {
        fa61 fa61Var = this.binding;
        if (!(state instanceof eu01)) {
            if (!(state instanceof fu01)) {
                w511.b();
                return;
            }
            TextView textView = fa61Var.i;
            ImageView imageView = fa61Var.d;
            textView.setVisibility(8);
            fa61Var.e.setVisibility(8);
            fa61Var.h.setVisibility(8);
            imageView.setVisibility(8);
            fa61Var.c.setVisibility(8);
            fa61Var.f.setVisibility(8);
            imageView.setVisibility(8);
            final int i = 1;
            fa61Var.b.render(new tls() { // from class: du01
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    stz0 render$lambda$4$lambda$2;
                    stz0 render$lambda$4$lambda$3;
                    int i2 = i;
                    gu01 gu01Var = state;
                    stz0 stz0Var = (stz0) obj;
                    switch (i2) {
                        case 0:
                            render$lambda$4$lambda$2 = TransferToolbarView.render$lambda$4$lambda$2(gu01Var, stz0Var);
                            return render$lambda$4$lambda$2;
                        default:
                            render$lambda$4$lambda$3 = TransferToolbarView.render$lambda$4$lambda$3(gu01Var, stz0Var);
                            return render$lambda$4$lambda$3;
                    }
                }
            });
            return;
        }
        eu01 eu01Var = (eu01) state;
        rbv rbvVar = eu01Var.c;
        Text text = eu01Var.a;
        CharSequence a = text != null ? d.a(getContext(), text) : null;
        TextView textView2 = fa61Var.i;
        ImageView imageView2 = fa61Var.d;
        TextView textView3 = fa61Var.e;
        ImageView imageView3 = fa61Var.c;
        SpoilerTextView spoilerTextView = fa61Var.f;
        textView2.setText(a);
        final int i2 = 0;
        fa61Var.i.setVisibility((a == null || a.length() == 0) ? 8 : 0);
        v4b1.k(rbvVar, imageView3, null, null, 6);
        Text text2 = eu01Var.d;
        CharSequence a2 = text2 != null ? d.a(getContext(), text2) : null;
        textView3.setText(a2);
        textView3.setVisibility((a2 == null || a2.length() == 0) ? 8 : 0);
        imageView3.setVisibility((rbvVar == null || a2 == null || a2.length() == 0) ? 8 : 0);
        Text text3 = eu01Var.e;
        CharSequence a3 = text3 != null ? d.a(getContext(), text3) : null;
        spoilerTextView.setText(a3);
        spoilerTextView.setVisibility((a3 == null || a3.length() == 0) ? 8 : 0);
        spoilerTextView.setSpoilerStateListener(new jl01(19, this));
        fa61Var.h.setVisibility((a3 == null || a3.length() == 0) ? 8 : 0);
        imageView2.setImageDrawable(vng.t(vxg0.ybsdk_arrow_short_bottom_gray_16, getContext()));
        imageView2.setVisibility(eu01Var.b ? 0 : 8);
        fa61Var.b.render(new tls() { // from class: du01
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                stz0 render$lambda$4$lambda$2;
                stz0 render$lambda$4$lambda$3;
                int i22 = i2;
                gu01 gu01Var = state;
                stz0 stz0Var = (stz0) obj;
                switch (i22) {
                    case 0:
                        render$lambda$4$lambda$2 = TransferToolbarView.render$lambda$4$lambda$2(gu01Var, stz0Var);
                        return render$lambda$4$lambda$2;
                    default:
                        render$lambda$4$lambda$3 = TransferToolbarView.render$lambda$4$lambda$3(gu01Var, stz0Var);
                        return render$lambda$4$lambda$3;
                }
            }
        });
    }

    public final void setOnCloseButtonClickListener(sls listener) {
        this.binding.b.setOnCloseButtonClickListener(listener);
    }

    public final void setOnRightImageClickListener(sls listener) {
        this.binding.b.setOnRightImageClickListener(listener);
    }

    public final void setSubtitleClickListener(View.OnClickListener listener) {
        this.binding.g.setOnClickListener(listener);
    }

    public TransferToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransferToolbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransferToolbarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
