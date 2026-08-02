package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import xsna.udt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class hai implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hai(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((jai) this.d).h(this.e, this.f, this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c) | 1);
                break;
            case 1:
                ((Integer) obj2).intValue();
                f7t.a((udt.c) this.d, (rha) this.e, (izs) this.f, (xvy) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ns40.a((ma40) this.d, (ActionsAvailabilityState.AttachmentState) this.e, (ActionsAvailabilityState.AttachmentState) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
