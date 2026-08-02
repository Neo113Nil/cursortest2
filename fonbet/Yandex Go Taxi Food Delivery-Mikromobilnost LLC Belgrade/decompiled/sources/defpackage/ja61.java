package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.TransfersDashboardErrorView;

/* loaded from: classes3.dex */
public final class ja61 implements zo31 {
    public final TransfersDashboardErrorView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public ja61(TransfersDashboardErrorView transfersDashboardErrorView, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.a = transfersDashboardErrorView;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
