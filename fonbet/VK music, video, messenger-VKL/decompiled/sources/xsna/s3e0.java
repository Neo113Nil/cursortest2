package xsna;

import android.view.View;
import one.video.controls.view.ProgressView;
import one.video.controls.view.buttons.TechBugReportButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class s3e0 implements o7j {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ s3e0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.o7j
    public final void accept(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ProgressView progressView = (ProgressView) view;
                int i2 = ProgressView.c;
                progressView.setVisibility(((w3e0) obj).a ? 0 : 8);
                break;
            default:
                TechBugReportButton techBugReportButton = (TechBugReportButton) view;
                int i3 = TechBugReportButton.c;
                techBugReportButton.setVisibility(((v7o0) obj).a ? 0 : 8);
                break;
        }
    }
}
