package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.YbCardIconView;

/* loaded from: classes4.dex */
public final class o361 implements zo31 {
    public final YbCardIconView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final CircularProgressIndicator d;

    public o361(YbCardIconView ybCardIconView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CircularProgressIndicator circularProgressIndicator) {
        this.a = ybCardIconView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = circularProgressIndicator;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
