package com.ybsdk.feature.split.deposit.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.OperationStatusView;
import defpackage.c5z;
import defpackage.cma1;
import defpackage.goh0;
import defpackage.k4o;
import defpackage.l1i0;
import defpackage.m2y;
import defpackage.ny61;
import defpackage.p9t0;
import defpackage.rr51;
import defpackage.sm91;
import defpackage.tls;
import defpackage.vbh0;
import defpackage.xty0;
import defpackage.z861;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/StatusScreenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/feature/split/deposit/internal/ui/b;", ClidProvider.STATE, "Lzy11;", "render", "(Lcom/ybsdk/feature/split/deposit/internal/ui/b;)Lzy11;", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setActionHandler", "(Ltls;)V", "", "Lc5z;", "localVariables", "updateLocalDivkitVariables", "(Ljava/util/List;)V", "Lz861;", "binding", "Lz861;", "actionHandler", "Ltls;", "TitleStyle", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusScreenView extends ConstraintLayout {
    private tls actionHandler;
    private final z861 binding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/StatusScreenView$TitleStyle;", "", "style", "", "<init>", "(Ljava/lang/String;II)V", "getStyle", "()I", "HEADLINE2", "NUMBER3", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public StatusScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View inflate = LayoutInflater.from(context).inflate(goh0.ybsdk_status_screen_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = vbh0.bottomDivKitData;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, inflate);
        if (ybDivView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            int i3 = vbh0.guideline_progress_top;
            if (((Guideline) cma1.O(i3, inflate)) != null && (O = cma1.O((i3 = vbh0.progressInfoView), inflate)) != null) {
                this.binding = new z861(constraintLayout, ybDivView, m2y.q(O));
                render(b.f);
                return;
            }
            i2 = i3;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$2$lambda$0(StatusScreenView statusScreenView, String str) {
        tls tlsVar = statusScreenView.actionHandler;
        if (tlsVar != null) {
        }
        return zy11.a;
    }

    public final zy11 render(b state) {
        rr51 rr51Var = state.e;
        z861 z861Var = this.binding;
        m2y m2yVar = z861Var.c;
        YbDivView ybDivView = z861Var.b;
        ((OperationStatusView) m2yVar.d).render(state.a);
        m2y m2yVar2 = z861Var.c;
        TextView textView = (TextView) m2yVar2.b;
        Text text = state.b;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView.setText(d.a(sm91.c(z861Var), text));
        textView.setTextAppearance(state.d.getStyle());
        TextView textView2 = (TextView) m2yVar2.e;
        Text text2 = state.c;
        if (text2 == null) {
            text2 = Text.Empty.INSTANCE;
        }
        xty0.c(textView2, text2, null, new p9t0(9, this), 6);
        ybDivView.setVisibility(rr51Var != null ? 0 : 8);
        if (rr51Var == null) {
            return null;
        }
        YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        return zy11.a;
    }

    public final void setActionHandler(tls handler) {
        this.actionHandler = handler;
        this.binding.b.setActionHandler(handler);
    }

    public final void updateLocalDivkitVariables(List<c5z> localVariables) {
        this.binding.b.updateLocalVariables(localVariables);
    }

    public StatusScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StatusScreenView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public StatusScreenView(Context context) {
        this(context, null, 0, 6, null);
    }
}
