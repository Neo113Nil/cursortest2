package com.ybsdk.feature.qr.payments.internal.screens.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.l;
import defpackage.cma1;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.oc70;
import defpackage.pbh0;
import defpackage.pc70;
import defpackage.tls;
import defpackage.v361;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.zl50;
import defpackage.znh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\n B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/OperationStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/a;", ClidProvider.STATE, "Lzy11;", "renderOperationProgressViewSmall", "(Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/a;)V", "renderOperationProgressView", "Lcom/ybsdk/widgets/common/OperationProgressView$StatusIcon;", "statusIcon", "renderOperationProgressViewSmallIcon", "(Lcom/ybsdk/widgets/common/OperationProgressView$StatusIcon;)V", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "renderCallback", "render", "(Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/a;Ltls;)V", "Lv361;", "binding", "Lv361;", "", "getHasImage", "()Z", "hasImage", "Status", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationStatusView extends ConstraintLayout {
    private final v361 binding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/OperationStatusView$Status;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "LOADING", "SUCCESS", "FAILURE", "TIMEOUT", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status HIDDEN = new Status("HIDDEN", 0);
        public static final Status LOADING = new Status("LOADING", 1);
        public static final Status SUCCESS = new Status("SUCCESS", 2);
        public static final Status FAILURE = new Status("FAILURE", 3);
        public static final Status TIMEOUT = new Status("TIMEOUT", 4);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{HIDDEN, LOADING, SUCCESS, FAILURE, TIMEOUT};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public OperationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(znh0.ybsdk_operation_status, this);
        int i2 = pbh0.operationStatusIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = pbh0.operationStatusProgress;
            OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i2, this);
            if (operationProgressView != null) {
                i2 = pbh0.operationStatusProgressSmall;
                OperationProgressView operationProgressView2 = (OperationProgressView) cma1.O(i2, this);
                if (operationProgressView2 != null) {
                    this.binding = new v361(this, appCompatImageView, operationProgressView, operationProgressView2);
                    operationProgressView.setSpinnerRotation(false);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$1$lambda$0(v361 v361Var, tls tlsVar, boolean z) {
        tlsVar.invoke(z ? null : v361Var.b.getDrawable());
        return zy11.a;
    }

    private final void renderOperationProgressView(a state) {
        OperationProgressView operationProgressView = this.binding.c;
        int i = b.a[state.b.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            operationProgressView.render(oc70.a);
        } else if (i == 5) {
            operationProgressView.render(pc70.a);
        } else {
            w511.b();
        }
    }

    private final void renderOperationProgressViewSmall(a state) {
        OperationProgressView.StatusIcon statusIcon = state.c;
        if (statusIcon != null) {
            renderOperationProgressViewSmallIcon(statusIcon);
        } else {
            this.binding.d.setVisibility(8);
        }
    }

    private final void renderOperationProgressViewSmallIcon(OperationProgressView.StatusIcon statusIcon) {
        OperationProgressView operationProgressView = this.binding.d;
        operationProgressView.setVisibility(0);
        operationProgressView.render(new l(statusIcon));
    }

    public final boolean getHasImage() {
        return this.binding.b.getDrawable() != null;
    }

    public final void render(a state, tls renderCallback) {
        v361 v361Var = this.binding;
        v4b1.k(state.a, v361Var.b, new zl50(12, v361Var, renderCallback), null, 4);
        renderOperationProgressView(state);
        renderOperationProgressViewSmall(state);
    }

    public OperationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OperationStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OperationStatusView(Context context) {
        this(context, null, 0, 6, null);
    }
}
