package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.widgets.common.CloseButtonView;

/* loaded from: classes3.dex */
public final class q161 implements zo31 {
    public final ImageToolbarView a;
    public final CloseButtonView b;
    public final ImageView c;
    public final AppCompatTextView d;
    public final ImageView e;
    public final SpoilerTextView f;
    public final ImageView g;

    public q161(ImageToolbarView imageToolbarView, CloseButtonView closeButtonView, ImageView imageView, AppCompatTextView appCompatTextView, ImageView imageView2, SpoilerTextView spoilerTextView, ImageView imageView3) {
        this.a = imageToolbarView;
        this.b = closeButtonView;
        this.c = imageView;
        this.d = appCompatTextView;
        this.e = imageView2;
        this.f = spoilerTextView;
        this.g = imageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
