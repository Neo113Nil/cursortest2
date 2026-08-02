package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.pdfview.PDFView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class l161 implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final YbButtonViewGroup c;
    public final ErrorView d;
    public final TextView e;
    public final PDFView f;
    public final CircularProgressIndicator g;
    public final ToolbarView h;

    public l161(ConstraintLayout constraintLayout, FrameLayout frameLayout, YbButtonViewGroup ybButtonViewGroup, ErrorView errorView, TextView textView, PDFView pDFView, CircularProgressIndicator circularProgressIndicator, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = ybButtonViewGroup;
        this.d = errorView;
        this.e = textView;
        this.f = pDFView;
        this.g = circularProgressIndicator;
        this.h = toolbarView;
    }

    public static l161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(tnh0.ybsdk_fragment_pdf_loader, viewGroup, false);
        int i = kbh0.buttonFrame;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = kbh0.buttonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = kbh0.errorView;
                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                if (errorView != null) {
                    i = kbh0.loaderTitle;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        i = kbh0.pdfView;
                        PDFView pDFView = (PDFView) cma1.O(i, inflate);
                        if (pDFView != null) {
                            i = kbh0.progress;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
                            if (circularProgressIndicator != null) {
                                i = kbh0.toolbar;
                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                if (toolbarView != null) {
                                    return new l161((ConstraintLayout) inflate, frameLayout, ybButtonViewGroup, errorView, textView, pDFView, circularProgressIndicator, toolbarView);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
