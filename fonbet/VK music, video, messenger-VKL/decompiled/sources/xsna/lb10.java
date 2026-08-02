package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lb10 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lb10(PostingPollDto postingPollDto, PostingPollSettings postingPollSettings, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, int i) {
        this.e = postingPollDto;
        this.f = postingPollSettings;
        this.g = attachmentState;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                com.vk.ecomm.design.compose.gallery.a.a((List) this.e, this.d, this.c, (wzs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                brb0.a((PostingPollDto) this.e, (PostingPollSettings) this.f, (ActionsAvailabilityState.AttachmentState) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lb10(List list, int i, izs izsVar, wzs wzsVar, q630 q630Var, int i2) {
        this.e = list;
        this.d = i;
        this.c = izsVar;
        this.f = wzsVar;
        this.g = q630Var;
    }
}
