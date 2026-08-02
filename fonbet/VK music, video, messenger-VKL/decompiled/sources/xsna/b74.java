package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import xsna.wpc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b74 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b74(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = obj5;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                p74.a((wpc0.a.C3948a) this.e, (PostEditingReason) this.f, (ActionsAvailabilityState.Attachments) this.g, (PostingSettings) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((is5) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t2k.a((u2k) this.e, (wkj) this.f, (gzs) this.g, (r5j0) this.h, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ftd0.b((String) this.e, (ActionsAvailabilityState.AttachmentState) this.f, (izs) this.c, (PostingHints) this.g, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ b74(String str, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, PostingHints postingHints, q630 q630Var, int i) {
        this.b = 3;
        this.e = str;
        this.f = attachmentState;
        this.c = izsVar;
        this.g = postingHints;
        this.h = q630Var;
        this.d = i;
    }

    public /* synthetic */ b74(is5 is5Var, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.b = 1;
        this.e = is5Var;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.c = izsVar;
        this.d = i;
    }
}
