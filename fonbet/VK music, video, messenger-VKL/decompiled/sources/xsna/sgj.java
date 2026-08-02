package xsna;

import android.widget.FrameLayout;

/* compiled from: ContentInfoBottomSheetView.kt */
/* loaded from: classes17.dex */
public final class sgj extends FrameLayout {
    public gzs<s3q0> b;
    public izs<? super String, s3q0> c;

    public final gzs<s3q0> getOnCloseButtonClick() {
        return this.b;
    }

    public final izs<String, s3q0> getOnLegalLinkClick() {
        return this.c;
    }

    public final void setOnCloseButtonClick(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setOnLegalLinkClick(izs<? super String, s3q0> izsVar) {
        this.c = izsVar;
    }
}
