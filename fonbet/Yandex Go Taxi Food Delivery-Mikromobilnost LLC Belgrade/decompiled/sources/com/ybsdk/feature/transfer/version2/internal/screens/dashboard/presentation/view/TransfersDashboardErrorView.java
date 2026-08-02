package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.d;
import defpackage.cch0;
import defpackage.cma1;
import defpackage.ev01;
import defpackage.hbv;
import defpackage.ja61;
import defpackage.noh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.v4b1;
import defpackage.xbg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/view/TransfersDashboardErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "listener", "setHyperLinkOnClickListener", "(Lsls;)V", "Lev01;", ClidProvider.STATE, "Lhbv;", "render", "(Lev01;)Lhbv;", "Lja61;", "binding", "Lja61;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersDashboardErrorView extends ConstraintLayout {
    private final ja61 binding;

    public TransfersDashboardErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(noh0.ybsdk_transfers_dashboard_error_view, this);
        int i2 = cch0.errorViewDescription;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = cch0.errorViewIcon;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = cch0.errorViewLinkText;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = cch0.errorViewTitle;
                    TextView textView3 = (TextView) cma1.O(i2, this);
                    if (textView3 != null) {
                        this.binding = new ja61(this, textView, imageView, textView2, textView3);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final hbv render(ev01 state) {
        ja61 ja61Var = this.binding;
        ja61Var.e.setText(d.a(getContext(), state.a));
        ja61Var.b.setText(d.a(getContext(), state.b));
        ja61Var.d.setText(d.a(getContext(), state.c));
        return v4b1.k(state.d, ja61Var.c, null, null, 6);
    }

    public final void setHyperLinkOnClickListener(sls listener) {
        this.binding.d.setOnClickListener(new xbg0(17, listener));
    }

    public TransfersDashboardErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransfersDashboardErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransfersDashboardErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
