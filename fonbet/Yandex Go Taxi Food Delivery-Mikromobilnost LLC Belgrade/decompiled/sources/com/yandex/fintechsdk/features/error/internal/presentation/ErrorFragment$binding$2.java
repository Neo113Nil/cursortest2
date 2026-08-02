package com.yandex.fintechsdk.features.error.internal.presentation;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.sar;
import defpackage.tgh0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public /* synthetic */ class ErrorFragment$binding$2 extends FunctionReferenceImpl implements tls {
    public static final ErrorFragment$binding$2 b = new ErrorFragment$binding$2(1, 0, sar.class, "bind", "bind(Landroid/view/View;)Lcom/yandex/fintechsdk/core/ui/impl/databinding/FinsdkErrorViewDefaultBinding;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = tgh0.finsdkCloseButton;
        View O = cma1.O(i, view);
        if (O != null) {
            i = tgh0.finsdkLinearlayout;
            if (((LinearLayout) cma1.O(i, view)) != null) {
                i = tgh0.finsdkTryAgainButton;
                TextView textView = (TextView) cma1.O(i, view);
                if (textView != null) {
                    return new sar((ConstraintLayout) view, O, textView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
