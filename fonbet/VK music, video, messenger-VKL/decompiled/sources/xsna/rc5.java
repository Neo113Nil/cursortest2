package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rc5 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rc5(PostingAuthorUiModel postingAuthorUiModel, boolean z, gzs gzsVar, q630 q630Var, int i) {
        this.e = postingAuthorUiModel;
        this.c = z;
        this.f = gzsVar;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                yc5.a((PostingAuthorUiModel) this.e, this.c, (gzs) this.f, this.d, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                hwl.c(this.c, (DeliveryPoint.WeekDay) this.e, (DeliveryPoint.WeekDayTimetable) this.f, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rc5(boolean z, DeliveryPoint.WeekDay weekDay, DeliveryPoint.WeekDayTimetable weekDayTimetable, q630 q630Var, int i) {
        this.c = z;
        this.e = weekDay;
        this.f = weekDayTimetable;
        this.d = q630Var;
    }
}
