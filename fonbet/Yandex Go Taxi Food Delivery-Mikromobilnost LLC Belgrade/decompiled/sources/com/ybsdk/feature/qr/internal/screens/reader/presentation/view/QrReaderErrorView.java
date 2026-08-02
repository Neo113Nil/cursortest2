package com.ybsdk.feature.qr.internal.screens.reader.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.hbv;
import defpackage.ny61;
import defpackage.obh0;
import defpackage.odf0;
import defpackage.q461;
import defpackage.sls;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.xbg0;
import defpackage.ybg0;
import defpackage.ynh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/view/QrReaderErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "listener", "setGoToSettingsButtonClickListener", "(Lsls;)V", "Lybg0;", ClidProvider.STATE, "Lhbv;", "render", "(Lybg0;)Lhbv;", "Lq461;", "binding", "Lq461;", "feature-qr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrReaderErrorView extends ConstraintLayout {
    private final q461 binding;

    public QrReaderErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ynh0.ybsdk_qr_code_error_view, this);
        int i2 = obh0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = obh0.icon;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = obh0.openSettingsButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
                if (ybButtonView != null) {
                    i2 = obh0.title;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        this.binding = new q461(this, textView, imageView, ybButtonView, textView2);
                        b.x(ung0.ybColor_background_scanner, this);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$2$lambda$1(ybg0 ybg0Var, YbButtonView.a aVar) {
        return new YbButtonView.a(ybg0Var.c, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setGoToSettingsButtonClickListener$lambda$0(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final hbv render(ybg0 state) {
        q461 q461Var = this.binding;
        q461Var.e.setText(d.a(getContext(), state.a));
        q461Var.b.setText(d.a(getContext(), state.b));
        q461Var.d.render(new odf0(8, state));
        return v4b1.k(state.d, q461Var.c, null, null, 6);
    }

    public final void setGoToSettingsButtonClickListener(sls listener) {
        this.binding.d.setOnClickListener(new xbg0(0, listener));
    }

    public QrReaderErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ QrReaderErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public QrReaderErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
