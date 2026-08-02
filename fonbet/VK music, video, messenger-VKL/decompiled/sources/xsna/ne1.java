package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import xsna.cd1;
import xsna.k740;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ne1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ne1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(cd1.f.b);
                break;
            case 1:
                this.c.invoke(a.h.b);
                break;
            case 2:
                this.c.invoke(sx40.b.a.b);
                break;
            case 3:
                this.c.invoke(k740.a.b);
                break;
            default:
                this.c.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b));
                break;
        }
        return s3q0.a;
    }
}
