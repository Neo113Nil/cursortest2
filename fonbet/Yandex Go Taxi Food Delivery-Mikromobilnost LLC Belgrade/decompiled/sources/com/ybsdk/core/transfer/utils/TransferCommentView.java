package com.ybsdk.core.transfer.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import defpackage.auz0;
import defpackage.bgc;
import defpackage.bmg0;
import defpackage.cma1;
import defpackage.cuz0;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.f0z0;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.jl40;
import defpackage.kux0;
import defpackage.lcb1;
import defpackage.lh01;
import defpackage.m961;
import defpackage.mah0;
import defpackage.mh01;
import defpackage.ny61;
import defpackage.pk31;
import defpackage.rje;
import defpackage.rmy0;
import defpackage.sm91;
import defpackage.tls;
import defpackage.umh0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.uwl0;
import defpackage.w511;
import defpackage.y7z0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\f2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\f2\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001e\u001a\u00020\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001e\u0010\u0019R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b(\u0010\u000eR\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100¨\u00062"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferCommentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lzy11;", "showTooltip", "(Ljava/lang/String;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lmh01;", ClidProvider.STATE, "render", "(Lmh01;)V", "Lkotlin/Function1;", "clickListener", "setClickListener", "(Ltls;)V", "closeListener", "setOnCloseClickListener", "Lpk31;", "onVibrate", "setOnVibrateListener", "Lm961;", "binding", "Lm961;", "Lcuz0;", "tooltip", "Lcuz0;", "value", "tooltipText", "Ljava/lang/String;", "setTooltipText", "Lcom/ybsdk/core/transfer/utils/CommentValidator;", "commentValidator$delegate", "Li3y;", "getCommentValidator", "()Lcom/ybsdk/core/transfer/utils/CommentValidator;", "commentValidator", "onReadyButtonClickListener", "Ltls;", "onCloseListener", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferCommentView extends ConstraintLayout {
    private final m961 binding;

    /* renamed from: commentValidator$delegate, reason: from kotlin metadata */
    private final i3y commentValidator;
    private tls onCloseListener;
    private tls onReadyButtonClickListener;
    private tls onVibrate;
    private cuz0 tooltip;
    private String tooltipText;

    public TransferCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        View inflate = LayoutInflater.from(context).inflate(umh0.ybsdk_transfer_comment_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = mah0.grip;
        if (cma1.O(i2, inflate) != null && (O = cma1.O((i2 = mah0.transferCommentDelimiter), inflate)) != null) {
            i2 = mah0.transferCommentInput;
            AppCompatEditText appCompatEditText = (AppCompatEditText) cma1.O(i2, inflate);
            if (appCompatEditText != null) {
                i2 = mah0.transferCommentTitle;
                if (((TextView) cma1.O(i2, inflate)) != null && (O2 = cma1.O((i2 = mah0.transferCommentTooltipAnchor), inflate)) != null) {
                    i2 = mah0.transferCommentViewButton;
                    YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate);
                    if (ybButtonView != null) {
                        i2 = mah0.transferCommentViewSpaceBottom;
                        if (((Space) cma1.O(i2, inflate)) != null) {
                            m961 m961Var = new m961((ConstraintLayout) inflate, O, appCompatEditText, O2, ybButtonView);
                            this.binding = m961Var;
                            this.commentValidator = a.a(new i5y0(23, this, context));
                            this.onReadyButtonClickListener = new f0z0(25);
                            this.onCloseListener = new f0z0(26);
                            this.onVibrate = new f0z0(27);
                            appCompatEditText.addTextChangedListener(getCommentValidator());
                            appCompatEditText.requestFocus();
                            ybButtonView.setOnClickListener(new y7z0(5, this, m961Var));
                            ybButtonView.render(new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_transfer_comment_confirm_button), null, null, null, null, null, null, false, false, null, 4094));
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommentValidator commentValidator_delegate$lambda$2(TransferCommentView transferCommentView, Context context) {
        return new CommentValidator(transferCommentView.binding.c, new rmy0(24, transferCommentView, context), new lh01(transferCommentView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 commentValidator_delegate$lambda$2$lambda$0(TransferCommentView transferCommentView, Context context, int i) {
        sm91.h(bmg0.ybsdk_animation_wiggle, transferCommentView.binding.c);
        transferCommentView.onVibrate.invoke(pk31.c);
        transferCommentView.setTooltipText(context.getString(i));
        cuz0 cuz0Var = transferCommentView.tooltip;
        if (cuz0Var != null) {
            cuz0Var.a();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 commentValidator_delegate$lambda$2$lambda$1(TransferCommentView transferCommentView, String str) {
        transferCommentView.setTooltipText((String) null);
        cuz0 cuz0Var = transferCommentView.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        return zy11.a;
    }

    private final CommentValidator getCommentValidator() {
        return (CommentValidator) this.commentValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$7$lambda$6(TransferCommentView transferCommentView, m961 m961Var, View view) {
        transferCommentView.onReadyButtonClickListener.invoke(evu0.k0(String.valueOf(m961Var.c.getText())).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$8(TransferCommentView transferCommentView) {
        lcb1.f(transferCommentView.binding.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCloseListener$lambda$4(String str) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onReadyButtonClickListener$lambda$3(String str) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onVibrate$lambda$5(pk31 pk31Var) {
        return zy11.a;
    }

    private final void setTooltipText(String str) {
        if (jl40.l(this.tooltipText, str)) {
            return;
        }
        this.tooltipText = str;
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        this.tooltip = null;
        if (str != null) {
            showTooltip(str);
        }
    }

    private final void showTooltip(String text) {
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition;
        Context context = getContext();
        int a = rje.a(context, ung0.ybColor_button_primaryNormal);
        int a2 = rje.a(context, ung0.ybColor_textIcon_primaryInverted);
        int i = 12;
        bgc bgcVar = new bgc(i);
        bgc bgcVar2 = new bgc(i);
        TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition2 = TooltipCommon$PreferredPosition.TOP;
        Text.Companion.getClass();
        String obj = d.a(context, new Text.Constant(text)).toString();
        uwl0 uwl0Var = new uwl0(28, new lh01(this, 0));
        int i2 = auz0.a[Tooltip$PreferredPosition.TOP.ordinal()];
        if (i2 == 1) {
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.TOP;
        } else if (i2 == 2) {
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.BOTTOM;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.AUTO;
        }
        cuz0 cuz0Var = new cuz0(a, a2, 0, 0, 10, bgcVar, bgcVar2, uwl0Var, null, context, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, null, null, null, null, obj, null, false, false);
        this.tooltip = cuz0Var;
        cuz0Var.f(this.binding.d, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$10(TransferCommentView transferCommentView, Tooltip$DismissReason tooltip$DismissReason) {
        transferCommentView.tooltip = null;
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new kux0(21, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onCloseListener.invoke(evu0.k0(String.valueOf(this.binding.c.getText())).toString());
    }

    public final void render(mh01 state) {
        m961 m961Var = this.binding;
        AppCompatEditText appCompatEditText = m961Var.c;
        String str = state.a;
        appCompatEditText.setText(str);
        m961Var.c.setSelection(str != null ? str.length() : 0);
    }

    public final void setClickListener(tls clickListener) {
        this.onReadyButtonClickListener = clickListener;
    }

    public final void setOnCloseClickListener(tls closeListener) {
        this.onCloseListener = closeListener;
    }

    public final void setOnVibrateListener(tls onVibrate) {
        this.onVibrate = onVibrate;
    }

    public TransferCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransferCommentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransferCommentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
