package defpackage;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.data.model.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.view.OrderCancelSupportNotifiedNotification;

/* loaded from: classes14.dex */
public final class ip70 implements sy60 {
    public FeedbackDto a;
    public final /* synthetic */ TaxiOrder b;
    public final /* synthetic */ f c;
    public final /* synthetic */ DriveState w;
    public final /* synthetic */ o2y0 x;

    public ip70(FeedbackDto feedbackDto, TaxiOrder taxiOrder, f fVar, DriveState driveState, o2y0 o2y0Var) {
        this.b = taxiOrder;
        this.c = fVar;
        this.w = driveState;
        this.x = o2y0Var;
        this.a = feedbackDto;
    }

    @Override // defpackage.sy60
    public final void a() {
        f fVar = this.c;
        fVar.i0.getClass();
        boolean a = k990.a(this.b, this.w);
        o2y0 o2y0Var = this.x;
        if (a) {
            fVar.A((m950) fVar.t0.get(), o2y0Var.b(), new cb0(15, fVar, o2y0Var));
        } else {
            fVar.p0(o2y0Var);
        }
    }

    public final void n1(String str, List list, List list2, Map map) {
        FeedbackDto b = this.a.b(new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31).d(list));
        FeedbackChoices feedbackChoices = b.c;
        if (feedbackChoices == null) {
            feedbackChoices = new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31);
        }
        FeedbackDto b2 = b.b(feedbackChoices.g(list2));
        FeedbackChoices feedbackChoices2 = b2.c;
        if (feedbackChoices2 == null) {
            feedbackChoices2 = new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31);
        }
        FeedbackDto a = FeedbackDto.a(b2.b(feedbackChoices2.c(map)), null, (str == null || evu0.J(str)) ? null : str, null, 29);
        this.a = a;
        this.b.P(a);
        TaxiOrder taxiOrder = this.b;
        taxiOrder.getClass();
        synchronized (taxiOrder) {
            taxiOrder.l = taxiOrder.l.D(list);
        }
        woq0 woq0Var = this.c.R;
        TaxiOrder taxiOrder2 = this.b;
        FeedbackDto feedbackDto = this.a;
        woq0Var.getClass();
        String str2 = feedbackDto.b;
        if (str2 == null || evu0.J(str2)) {
            str2 = taxiOrder2.l.getW().getF();
        }
        FeedbackParam.a aVar = new FeedbackParam.a();
        String Hg = woq0Var.a.Hg();
        if (Hg == null) {
            Hg = "";
        }
        aVar.a = Hg;
        aVar.d = taxiOrder2.a;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            aVar.f = aVar.f.d(list);
        }
        aVar.e = str2;
        aVar.g = woq0Var.c.b(null);
        FeedbackChoices feedbackChoices3 = feedbackDto.c;
        if (feedbackChoices3 != null) {
            Map map2 = feedbackChoices3.c;
            if (map2 != null && !map2.isEmpty()) {
                aVar.f = aVar.f.c(map2);
            }
            List list4 = feedbackChoices3.b;
            List list5 = list4;
            if (list5 != null && !list5.isEmpty()) {
                aVar.f = aVar.f.g(list4);
            }
        }
        FeedbackParam.Companion.getClass();
        woq0Var.b.a(a.a(aVar));
        if (!list3.isEmpty() || str.length() > 0) {
            OrderCancelSupportNotifiedNotification orderCancelSupportNotifiedNotification = new OrderCancelSupportNotifiedNotification(this.c.G, null, 0, 6, null);
            orderCancelSupportNotifiedNotification.setExpiresListener(new qn5(10, this.c, orderCancelSupportNotifiedNotification));
            this.c.Z.e(orderCancelSupportNotifiedNotification);
            orderCancelSupportNotifiedNotification.startExpiresTimer(5000L);
        }
        o2y0 o2y0Var = this.x;
        f fVar = this.c;
        k990 k990Var = fVar.i0;
        TaxiOrder taxiOrder3 = this.b;
        DriveState driveState = this.w;
        k990Var.getClass();
        if (k990.a(taxiOrder3, driveState)) {
            fVar.A((m950) fVar.t0.get(), o2y0Var.b(), new cb0(15, fVar, o2y0Var));
        } else {
            fVar.p0(o2y0Var);
        }
    }
}
