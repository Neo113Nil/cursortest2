package xsna;

import android.content.Context;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import xsna.osd0;
import xsna.ozj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qzj implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qzj(Context context, ozj.c cVar, q630 q630Var, izs izsVar, int i) {
        this.f = context;
        this.g = cVar;
        this.d = q630Var;
        this.c = izsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                szj.b((Context) this.f, (ozj.c) this.g, this.d, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ftd0.a((osd0.a) this.f, (ActionsAvailabilityState.AttachmentState) this.g, this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qzj(osd0.a aVar, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, q630 q630Var, int i) {
        this.f = aVar;
        this.g = attachmentState;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }
}
