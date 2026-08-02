package com.yandex.go.taxi.order.details.v2.state;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AchievementRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Button;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostBreakdown;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CostCenter;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Destination;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DoneFooter;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfo;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfoSimple;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$FeedbackQuestion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Generic;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Payment;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Photo;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PickupCode;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PlainComment;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ProgressBarItem;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Promoblock;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RatingSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Requirement;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RoutePoint;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ShareLocation;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Source;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Status;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TagRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TextRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
import com.yandex.go.taxi.order.models.api.response.a7;
import com.yandex.go.taxi.order.models.api.response.z6;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g92;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.ief;
import defpackage.ijk0;
import defpackage.lfk0;
import defpackage.mfk0;
import defpackage.nfk0;
import defpackage.o2y0;
import defpackage.odk0;
import defpackage.pjk0;
import defpackage.tmk0;
import defpackage.tpr;
import defpackage.umk0;
import defpackage.vfk0;
import defpackage.w511;
import defpackage.wze0;
import defpackage.yjk0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public final h3y A;
    public final h3y B;
    public final h3y C;
    public final h3y D;
    public final tpr E;
    public final o2y0 a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public final h3y i;
    public final h3y j;
    public final h3y k;
    public final h3y l;
    public final h3y m;
    public final h3y n;
    public final h3y o;
    public final h3y p;
    public final h3y q;
    public final h3y r;
    public final h3y s;
    public final h3y t;
    public final h3y u;
    public final h3y v;
    public final h3y w;
    public final h3y x;
    public final h3y y;
    public final h3y z;

    public a(o2y0 o2y0Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9, h3y h3yVar10, h3y h3yVar11, h3y h3yVar12, h3y h3yVar13, h3y h3yVar14, h3y h3yVar15, h3y h3yVar16, h3y h3yVar17, h3y h3yVar18, h3y h3yVar19, h3y h3yVar20, h3y h3yVar21, h3y h3yVar22, h3y h3yVar23, h3y h3yVar24, h3y h3yVar25, h3y h3yVar26, h3y h3yVar27, h3y h3yVar28, h3y h3yVar29) {
        this.a = o2y0Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = h3yVar5;
        this.g = h3yVar6;
        this.h = h3yVar7;
        this.i = h3yVar8;
        this.j = h3yVar9;
        this.k = h3yVar10;
        this.l = h3yVar11;
        this.m = h3yVar12;
        this.n = h3yVar13;
        this.o = h3yVar14;
        this.p = h3yVar15;
        this.q = h3yVar16;
        this.r = h3yVar17;
        this.s = h3yVar18;
        this.t = h3yVar19;
        this.u = h3yVar20;
        this.v = h3yVar21;
        this.w = h3yVar22;
        this.x = h3yVar23;
        this.y = h3yVar24;
        this.z = h3yVar25;
        this.A = h3yVar26;
        this.B = h3yVar27;
        this.C = h3yVar28;
        this.D = h3yVar29;
        this.E = e.t(e.I(o2y0Var.a(), new RideCardItemStateDataSourceProxy$pendingChangesFlow$1(2, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a7 a7Var, Map map, RideCardPresentationType rideCardPresentationType, vfk0 vfk0Var, SuspendLambda suspendLambda) {
        mfk0 mfk0Var;
        o2y0 o2y0Var = this.a;
        ief iefVar = o2y0Var.b().V().K;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        if (a7Var instanceof RideCardItemDto$Status) {
            return ((com.yandex.go.taxi.order.details.v2.state.elements.status.a) this.b.get()).b((RideCardItemDto$Status) a7Var, h, vfk0Var, suspendLambda);
        }
        if (a7Var instanceof RideCardItemDto$CostBreakdown) {
            lfk0 lfk0Var = (lfk0) this.c.get();
            RideCardItemDto$CostBreakdown rideCardItemDto$CostBreakdown = (RideCardItemDto$CostBreakdown) a7Var;
            OrderStatusInfo.CostMessageDetails costMessageDetails = rideCardItemDto$CostBreakdown.c;
            String str = rideCardItemDto$CostBreakdown.a;
            lfk0Var.getClass();
            if (!ijk0.b(rideCardItemDto$CostBreakdown)) {
                return new g92(2, new yjk0(str));
            }
            List<OrderStatusInfo.CostBreakdown> list = costMessageDetails != null ? costMessageDetails.b : null;
            if (list == null) {
                list = EmptyList.a;
            }
            ArrayList arrayList = new ArrayList();
            for (OrderStatusInfo.CostBreakdown costBreakdown : list) {
                String str2 = costBreakdown.a;
                if (str2 == null || evu0.J(str2)) {
                    str2 = null;
                }
                String obj = str2 != null ? evu0.k0(str2).toString() : null;
                if (obj != null) {
                    String str3 = costBreakdown.c;
                    if (str3 == null || evu0.J(str3)) {
                        str3 = null;
                    }
                    String obj2 = str3 != null ? evu0.k0(str3).toString() : null;
                    if (obj2 != null) {
                        mfk0Var = new mfk0(obj, lfk0Var.a.a(h, obj2, false, false));
                        if (mfk0Var == null) {
                            arrayList.add(mfk0Var);
                        }
                    }
                }
                mfk0Var = null;
                if (mfk0Var == null) {
                }
            }
            if (arrayList.isEmpty()) {
                return new g92(2, new yjk0(str));
            }
            lfk0Var.b.getClass();
            return new g92(2, new nfk0(str, rideCardItemDto$CostBreakdown.b, wze0.a(costMessageDetails), arrayList));
        }
        if (a7Var instanceof RideCardItemDto$DriverInfo) {
            return ((com.yandex.go.taxi.order.details.v2.state.elements.driver.c) this.d.get()).b((RideCardItemDto$DriverInfo) a7Var, suspendLambda);
        }
        if (a7Var instanceof RideCardItemDto$DriverInfoSimple) {
            return ((com.yandex.go.taxi.order.details.v2.state.elements.driver.d) this.e.get()).a((RideCardItemDto$DriverInfoSimple) a7Var, suspendLambda);
        }
        if (a7Var instanceof RideCardItemDto$RatingSelector) {
            umk0 umk0Var = (umk0) this.m.get();
            RideCardItemDto$RatingSelector rideCardItemDto$RatingSelector = (RideCardItemDto$RatingSelector) a7Var;
            umk0Var.getClass();
            return umk0Var.f(rideCardItemDto$RatingSelector, new tmk0(rideCardItemDto$RatingSelector, umk0Var), suspendLambda);
        }
        if (a7Var instanceof RideCardItemDto$CoherentRatingSelector) {
            odk0 odk0Var = (odk0) this.n.get();
            RideCardItemDto$CoherentRatingSelector rideCardItemDto$CoherentRatingSelector = (RideCardItemDto$CoherentRatingSelector) a7Var;
            odk0Var.getClass();
            return odk0Var.f(rideCardItemDto$CoherentRatingSelector, new com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.coherent_selector.a(rideCardItemDto$CoherentRatingSelector, odk0Var), suspendLambda);
        }
        if (a7Var instanceof RideCardItemDto$TipsSelector) {
            return ((com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.a) this.o.get()).a((RideCardItemDto$TipsSelector) a7Var, h);
        }
        if (a7Var instanceof RideCardItemDto$TipsWishSelector) {
            return ((com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.a) this.p.get()).a((RideCardItemDto$TipsWishSelector) a7Var, h, suspendLambda);
        }
        boolean z = a7Var instanceof RideCardItemDto$AchievementRatingReasonsSelector;
        h3y h3yVar = this.s;
        if (!z && !(a7Var instanceof RideCardItemDto$TextRatingReasonsSelector) && !(a7Var instanceof RideCardItemDto$TagRatingReasonsSelector)) {
            if (a7Var instanceof RideCardItemDto$PlainComment) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.feedback.comment.c) this.k.get()).a((RideCardItemDto$PlainComment) a7Var);
            }
            if (a7Var instanceof RideCardItemDto$FeedbackQuestion) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.feedback.question.a) this.f.get()).c((RideCardItemDto$FeedbackQuestion) a7Var);
            }
            boolean z2 = a7Var instanceof RideCardItemDto$ActionButtons;
            tpr tprVar = this.E;
            if (z2) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$1(null, this, a7Var));
            }
            if (a7Var instanceof RideCardItemDto$CollapsingContainer) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing.c) this.r.get()).a((RideCardItemDto$CollapsingContainer) a7Var, rideCardPresentationType);
            }
            if (a7Var instanceof RideCardItemDto$Accordion) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2(null, this, a7Var, h, map));
            }
            if (a7Var instanceof RideCardItemDto$ComboCompanion) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.companion.a) this.g.get()).a((RideCardItemDto$ComboCompanion) a7Var, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$CompanionBufferSearch) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.a) this.h.get()).a((RideCardItemDto$CompanionBufferSearch) a7Var);
            }
            if (a7Var instanceof RideCardItemDto$Source) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3(null, this, a7Var, h));
            }
            if (a7Var instanceof RideCardItemDto$RoutePoint) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$4(null, this, a7Var, h));
            }
            if (a7Var instanceof RideCardItemDto$Destination) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$5(null, this, a7Var, h));
            }
            if (a7Var instanceof RideCardItemDto$Generic) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$6(null, this, a7Var, h));
            }
            if (a7Var instanceof RideCardItemDto$Requirement) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$7(null, this, a7Var, h));
            }
            if (a7Var instanceof RideCardItemDto$Payment) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.payment.c) this.j.get()).c((RideCardItemDto$Payment) a7Var, tprVar, h);
            }
            if (a7Var instanceof RideCardItemDto$Promoblock) {
                return new g92(2, new yjk0(((RideCardItemDto$Promoblock) a7Var).a));
            }
            if (a7Var instanceof RideCardItemDto$CostCenter) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.cost_center.c) this.w.get()).a((RideCardItemDto$CostCenter) a7Var, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$ShareLocation) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.share_location.a) this.t.get()).b((RideCardItemDto$ShareLocation) a7Var);
            }
            if (a7Var instanceof RideCardItemDto$DoneFooter) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.done.a) this.u.get()).a((RideCardItemDto$DoneFooter) a7Var, h, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$ProgressBarItem) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.a) this.v.get()).c((RideCardItemDto$ProgressBarItem) a7Var, h, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$Timeline) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$8(null, this, a7Var));
            }
            if (a7Var instanceof RideCardItemDto$Photo) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.photo.a) this.z.get()).b((RideCardItemDto$Photo) a7Var);
            }
            if (a7Var instanceof RideCardItemDto$Slider) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.slider.a) this.y.get()).b((RideCardItemDto$Slider) a7Var, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$AiBubble) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble.c) this.A.get()).c((RideCardItemDto$AiBubble) a7Var, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$Button) {
                return e.X(tprVar, new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$9(null, this, a7Var));
            }
            if (a7Var instanceof RideCardItemDto$PickupCode) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.pickup_code.a) this.C.get()).a((RideCardItemDto$PickupCode) a7Var, suspendLambda);
            }
            if (a7Var instanceof RideCardItemDto$StatusProgress) {
                return ((com.yandex.go.taxi.order.details.v2.state.elements.status_progress.a) this.D.get()).a((RideCardItemDto$StatusProgress) a7Var, o2y0Var.b().a, vfk0Var);
            }
            if (a7Var instanceof z6) {
                return new g92(2, new yjk0(""));
            }
            w511.b();
            return null;
        }
        return ((com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector.a) h3yVar.get()).b((pjk0) a7Var);
    }
}
