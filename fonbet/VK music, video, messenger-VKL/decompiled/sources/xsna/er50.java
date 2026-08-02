package xsna;

import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class er50 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ er50(fr50 fr50Var, MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto, MyTargetAdSurveyPageView.Page page, MyTargetAdSurveyPageView myTargetAdSurveyPageView) {
        this.c = fr50Var;
        this.d = myTargetInternalNativeAdBlsUiDto;
        this.e = page;
        this.f = myTargetAdSurveyPageView;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                fr50 fr50Var = (fr50) this.c;
                MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto = (MyTargetInternalNativeAdBlsUiDto) this.d;
                MyTargetAdSurveyPageView.Page page = (MyTargetAdSurveyPageView.Page) this.e;
                MyTargetAdSurveyPageView myTargetAdSurveyPageView = (MyTargetAdSurveyPageView) this.f;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                fr50Var.D.sa(new NewsfeedExternalAction.c.InterfaceC1439c.f(myTargetInternalNativeAdBlsUiDto.i, page.a, (String) obj, booleanValue));
                fr50Var.D.sa(new NewsfeedExternalAction.c.InterfaceC1439c.b(myTargetAdSurveyPageView, myTargetInternalNativeAdBlsUiDto.i));
                break;
            default:
                ((Integer) obj2).getClass();
                ((siq0) this.c).i((zjq0.a.b) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(4097));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ er50(siq0 siq0Var, zjq0.a.b bVar, izs izsVar, q630 q630Var, int i) {
        this.c = siq0Var;
        this.d = bVar;
        this.e = izsVar;
        this.f = q630Var;
    }
}
