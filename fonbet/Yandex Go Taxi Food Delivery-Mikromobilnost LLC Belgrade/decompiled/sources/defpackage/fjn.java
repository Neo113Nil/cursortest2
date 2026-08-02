package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableLinearLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableProgressBar;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final class fjn implements zo31 {
    public final ConstraintLayout a;
    public final CustomizableHeader b;
    public final CustomizableProgressBar c;
    public final CustomizableLinearLayout d;
    public final CustomizableTextView e;
    public final WebView f;

    public fjn(ConstraintLayout constraintLayout, CustomizableHeader customizableHeader, CustomizableProgressBar customizableProgressBar, CustomizableLinearLayout customizableLinearLayout, CustomizableTextView customizableTextView, WebView webView) {
        this.a = constraintLayout;
        this.b = customizableHeader;
        this.c = customizableProgressBar;
        this.d = customizableLinearLayout;
        this.e = customizableTextView;
        this.f = webView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
