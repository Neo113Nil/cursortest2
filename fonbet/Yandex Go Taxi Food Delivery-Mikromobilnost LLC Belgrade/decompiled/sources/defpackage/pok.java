package defpackage;

import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;

/* loaded from: classes3.dex */
public final /* synthetic */ class pok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DivEducationsV2View b;
    public final /* synthetic */ yon c;

    public /* synthetic */ pok(DivEducationsV2View divEducationsV2View, yon yonVar, int i) {
        this.a = i;
        this.b = divEducationsV2View;
        this.c = yonVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yon yonVar = this.c;
        DivEducationsV2View divEducationsV2View = this.b;
        switch (i) {
            case 0:
                divEducationsV2View.showView(yonVar);
                break;
            default:
                DivEducationsV2View.animateShow$lambda$27(divEducationsV2View, yonVar);
                break;
        }
    }
}
