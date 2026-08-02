package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.ProcessingWidget;
import ru.rt.ebs.cryptosdk.presentation.customView.SuccessfulVerificationWidget;

/* loaded from: classes4.dex */
public final class ijn implements zo31 {
    public final FrameLayout a;
    public final CustomizableButton b;
    public final ConstraintLayout c;
    public final CustomizableHeader d;
    public final ImageView e;
    public final PreviewView f;
    public final FrameLayout g;
    public final ProcessingWidget h;
    public final SuccessfulVerificationWidget i;
    public final WebView j;
    public final View k;

    public ijn(FrameLayout frameLayout, CustomizableButton customizableButton, ConstraintLayout constraintLayout, CustomizableHeader customizableHeader, ImageView imageView, PreviewView previewView, FrameLayout frameLayout2, ProcessingWidget processingWidget, SuccessfulVerificationWidget successfulVerificationWidget, WebView webView, View view) {
        this.a = frameLayout;
        this.b = customizableButton;
        this.c = constraintLayout;
        this.d = customizableHeader;
        this.e = imageView;
        this.f = previewView;
        this.g = frameLayout2;
        this.h = processingWidget;
        this.i = successfulVerificationWidget;
        this.j = webView;
        this.k = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
