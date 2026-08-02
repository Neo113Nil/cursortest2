package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.k;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.k361;
import defpackage.k4o;
import defpackage.l1i0;
import defpackage.m2y;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.sm91;
import defpackage.tc70;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\n\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressOverlayDialog;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/k;", ClidProvider.STATE, "Lzy11;", "render", "(Lcom/ybsdk/widgets/common/k;)V", "Landroid/view/View$OnClickListener;", "listener", "setPrimaryActionClickListener", "(Landroid/view/View$OnClickListener;)V", "setSubActionClickListener", "Lk361;", "binding", "Lk361;", "TitleStyle", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperationProgressOverlayDialog extends LinearLayout {
    private final k361 binding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressOverlayDialog$TitleStyle;", "", "style", "", "<init>", "(Ljava/lang/String;II)V", "getStyle", "()I", "HEADLINE2", "NUMBER3", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TitleStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TitleStyle[] $VALUES;
        public static final TitleStyle HEADLINE2 = new TitleStyle("HEADLINE2", 0, l1i0.Widget_YB_Text_Headline2);
        public static final TitleStyle NUMBER3 = new TitleStyle("NUMBER3", 1, l1i0.Widget_YB_Text_Numbers3);
        private final int style;

        private static final /* synthetic */ TitleStyle[] $values() {
            return new TitleStyle[]{HEADLINE2, NUMBER3};
        }

        static {
            TitleStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TitleStyle(String str, int i, int i2) {
            this.style = i2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TitleStyle valueOf(String str) {
            return (TitleStyle) Enum.valueOf(TitleStyle.class, str);
        }

        public static TitleStyle[] values() {
            return (TitleStyle[]) $VALUES.clone();
        }

        public final int getStyle() {
            return this.style;
        }
    }

    public OperationProgressOverlayDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_operation_progress_overlay_dialog, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.actionButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate);
        if (ybButtonView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i2 = fch0.guideline_progress_top;
            if (((Guideline) cma1.O(i2, inflate)) != null && (O = cma1.O((i2 = fch0.progressInfoView), inflate)) != null) {
                m2y q = m2y.q(O);
                i2 = fch0.subActionButton;
                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i2, inflate);
                if (ybButtonView2 != null) {
                    this.binding = new k361(linearLayout, ybButtonView, linearLayout, q, ybButtonView2);
                    render(k.h);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$0(k kVar, YbButtonView.a aVar) {
        return new YbButtonView.a(kVar.e, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$1(k kVar, YbButtonView.a aVar) {
        return new YbButtonView.a(kVar.f, null, kVar.g, null, null, null, null, false, false, null, 4090);
    }

    public final void render(final k state) {
        k361 k361Var = this.binding;
        final int i = 1;
        tc70 tc70Var = new tc70(state.a, true);
        m2y m2yVar = k361Var.c;
        YbButtonView ybButtonView = k361Var.d;
        YbButtonView ybButtonView2 = k361Var.b;
        ((OperationStatusView) m2yVar.d).render(tc70Var);
        m2y m2yVar2 = k361Var.c;
        TextView textView = (TextView) m2yVar2.b;
        Text text = state.b;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(k361Var), text));
        textView.setTextAppearance(state.c.getStyle());
        TextView textView2 = (TextView) m2yVar2.e;
        Text text2 = state.d;
        if (text2 == null) {
            text2 = Text.Empty.INSTANCE;
        }
        textView2.setText(com.ybsdk.core.utils.text.d.a(sm91.c(k361Var), text2));
        ybButtonView2.render(new tls() { // from class: mc70
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                YbButtonView.a render$lambda$2$lambda$0;
                YbButtonView.a render$lambda$2$lambda$1;
                int i2 = r2;
                k kVar = state;
                YbButtonView.a aVar = (YbButtonView.a) obj;
                switch (i2) {
                    case 0:
                        render$lambda$2$lambda$0 = OperationProgressOverlayDialog.render$lambda$2$lambda$0(kVar, aVar);
                        return render$lambda$2$lambda$0;
                    default:
                        render$lambda$2$lambda$1 = OperationProgressOverlayDialog.render$lambda$2$lambda$1(kVar, aVar);
                        return render$lambda$2$lambda$1;
                }
            }
        });
        ybButtonView2.setVisibility(state.e == null ? 4 : 0);
        ybButtonView.render(new tls() { // from class: mc70
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                YbButtonView.a render$lambda$2$lambda$0;
                YbButtonView.a render$lambda$2$lambda$1;
                int i2 = i;
                k kVar = state;
                YbButtonView.a aVar = (YbButtonView.a) obj;
                switch (i2) {
                    case 0:
                        render$lambda$2$lambda$0 = OperationProgressOverlayDialog.render$lambda$2$lambda$0(kVar, aVar);
                        return render$lambda$2$lambda$0;
                    default:
                        render$lambda$2$lambda$1 = OperationProgressOverlayDialog.render$lambda$2$lambda$1(kVar, aVar);
                        return render$lambda$2$lambda$1;
                }
            }
        });
        ybButtonView.setVisibility(state.f == null ? 8 : 0);
    }

    public final void setPrimaryActionClickListener(View.OnClickListener listener) {
        this.binding.b.setOnClickListener(listener);
    }

    public final void setSubActionClickListener(View.OnClickListener listener) {
        this.binding.d.setOnClickListener(listener);
    }

    public OperationProgressOverlayDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OperationProgressOverlayDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OperationProgressOverlayDialog(Context context) {
        this(context, null, 0, 6, null);
    }
}
