package xsna;

import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import xsna.bqw;
import xsna.h3b0;
import xsna.hjl0;
import xsna.wml0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zyf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ zyf(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.CoAuthorsPicker.b));
                break;
            case 1:
                this.c.invoke(AuthorHeaderEvent.Info.d.a);
                break;
            case 2:
                this.c.invoke(bqw.a.a);
                break;
            case 3:
                this.c.invoke(a.d.b);
                break;
            case 4:
                this.c.invoke(OrderAction.a.b);
                break;
            case 5:
                this.c.invoke(h3b0.h.b);
                break;
            case 6:
                this.c.invoke(new hjl0.a.r(true));
                break;
            default:
                this.c.invoke(wml0.a.h.b);
                break;
        }
        return s3q0.a;
    }
}
