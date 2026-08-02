package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.plus.resources.core.a;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class i1k0 {
    public static final /* synthetic */ kgx[] b = {new PropertyReference1Impl("retryButtonTitle", 0, "getRetryButtonTitle()Landroid/widget/TextView;", i1k0.class), b64.x(qoi0.a, i1k0.class, "retryButtonSubtitle", "getRetryButtonSubtitle()Landroid/widget/TextView;", 0)};
    public final View a;

    public i1k0(View view, lld0 lld0Var) {
        this.a = view;
        int i = v9h0.plus_sdk_retry_button_title;
        int i2 = v9h0.plus_sdk_retry_button_subtitle;
        kgx[] kgxVarArr = b;
        kgx kgxVar = kgxVarArr[0];
        try {
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            a aVar = (a) lld0Var;
            ((TextView) findViewById).setText(bb1.t(aVar.a(zyh0.Home_ContentPlaceholder_RetryButton_Title), view));
            kgx kgxVar2 = kgxVarArr[1];
            try {
                View findViewById2 = view.findViewById(i2);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) findViewById2).setText(bb1.t(aVar.a(zyh0.Home_ContentPlaceholder_RetryButton_Subtitle), view));
            } catch (ClassCastException e) {
                dy31.f(kgxVar2, e);
                throw null;
            }
        } catch (ClassCastException e2) {
            dy31.f(kgxVar, e2);
            throw null;
        }
    }
}
