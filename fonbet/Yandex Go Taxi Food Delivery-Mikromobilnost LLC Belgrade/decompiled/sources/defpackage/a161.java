package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.widgets.common.DashboardDrawableTextView;

/* loaded from: classes4.dex */
public final class a161 implements zo31 {
    public final DashboardDrawableTextView a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;

    public a161(DashboardDrawableTextView dashboardDrawableTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.a = dashboardDrawableTextView;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
