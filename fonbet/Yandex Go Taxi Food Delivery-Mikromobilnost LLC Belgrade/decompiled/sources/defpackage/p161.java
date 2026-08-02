package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes4.dex */
public final class p161 implements zo31 {
    public final FullscreenStatusView a;
    public final CloseButtonView b;
    public final YbButtonViewGroup c;
    public final AppCompatImageView d;
    public final CircularProgressIndicator e;
    public final AppCompatTextView f;
    public final AppCompatTextView g;

    public p161(FullscreenStatusView fullscreenStatusView, CloseButtonView closeButtonView, YbButtonViewGroup ybButtonViewGroup, AppCompatImageView appCompatImageView, CircularProgressIndicator circularProgressIndicator, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = fullscreenStatusView;
        this.b = closeButtonView;
        this.c = ybButtonViewGroup;
        this.d = appCompatImageView;
        this.e = circularProgressIndicator;
        this.f = appCompatTextView;
        this.g = appCompatTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
