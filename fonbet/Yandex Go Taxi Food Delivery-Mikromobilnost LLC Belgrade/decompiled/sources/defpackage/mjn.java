package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CameraPreview;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.ProcessingWidget;
import ru.rt.ebs.cryptosdk.presentation.customView.SuccessfulVerificationWidget;
import ru.rt.ebs.cryptosdk.presentation.customView.TimerIndicatorView;

/* loaded from: classes4.dex */
public final class mjn implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final CustomizableButton c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final CustomizableHeader f;
    public final View g;
    public final ProcessingWidget h;
    public final SuccessfulVerificationWidget i;
    public final CameraPreview j;
    public final TimerIndicatorView k;
    public final WebView l;

    public mjn(FrameLayout frameLayout, FrameLayout frameLayout2, CustomizableButton customizableButton, ImageView imageView, ConstraintLayout constraintLayout, CustomizableHeader customizableHeader, View view, ProcessingWidget processingWidget, SuccessfulVerificationWidget successfulVerificationWidget, CameraPreview cameraPreview, TimerIndicatorView timerIndicatorView, WebView webView) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = customizableButton;
        this.d = imageView;
        this.e = constraintLayout;
        this.f = customizableHeader;
        this.g = view;
        this.h = processingWidget;
        this.i = successfulVerificationWidget;
        this.j = cameraPreview;
        this.k = timerIndicatorView;
        this.l = webView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
