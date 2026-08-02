package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.screens.notice.presentation.TopupNoticeContentDeprecatedView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class i961 implements zo31 {
    public final TopupNoticeContentDeprecatedView a;
    public final TextView b;
    public final FrameLayout c;
    public final AppCompatImageView d;
    public final FrameLayout e;
    public final YbButtonView f;
    public final TextView g;

    public i961(TopupNoticeContentDeprecatedView topupNoticeContentDeprecatedView, TextView textView, FrameLayout frameLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, YbButtonView ybButtonView, TextView textView2) {
        this.a = topupNoticeContentDeprecatedView;
        this.b = textView;
        this.c = frameLayout;
        this.d = appCompatImageView;
        this.e = frameLayout2;
        this.f = ybButtonView;
        this.g = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
