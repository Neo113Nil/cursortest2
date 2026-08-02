package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.plus.core.graphql.type.CONSUMER_TYPE;
import com.yandex.plus.core.graphql.type.DEVICE;
import com.yandex.plus.core.graphql.type.INVOICE_STATUS;
import com.yandex.plus.core.graphql.type.PLAQUE_ACTION_PERFORM_STATUS;
import com.yandex.plus.core.graphql.type.PLAQUE_CLICKED_STATUS;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import com.yandex.plus.core.graphql.type.UPSALE_STEP;
import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class g97 implements b70 {
    public static final g97 b = new g97(0);
    public static final g97 c = new g97(1);
    public static final g97 d = new g97(2);
    public static final g97 e = new g97(3);
    public static final g97 f = new g97(4);
    public static final g97 g = new g97(5);
    public static final g97 h = new g97(6);
    public static final g97 i = new g97(7);
    public static final g97 j = new g97(8);
    public static final g97 k = new g97(9);
    public static final g97 l = new g97(10);
    public static final g97 m = new g97(11);
    public static final g97 n = new g97(12);
    public static final g97 o = new g97(13);
    public static final g97 p = new g97(14);
    public static final g97 q = new g97(15);
    public static final g97 r = new g97(16);
    public static final g97 s = new g97(17);
    public static final g97 t = new g97(18);
    public static final g97 u = new g97(19);
    public static final g97 v = new g97(20);
    public static final g97 w = new g97(21);
    public final /* synthetic */ int a;

    public /* synthetic */ g97(int i2) {
        this.a = i2;
    }

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        int i2 = this.a;
        wkf wkfVar = rs60.a;
        switch (i2) {
            case 0:
                bfxVar.r0(((CONSUMER_TYPE) obj).getRawValue());
                return;
            case 1:
                xib xibVar = (xib) obj;
                bfxVar.A1("isSelected");
                l80.f.a(bfxVar, cVar, Boolean.valueOf(xibVar.a));
                bfxVar.A1("offerName");
                cVar.d(wkfVar).a(bfxVar, cVar, xibVar.b);
                bfxVar.A1("offersBatchId");
                foe foeVar = l80.a;
                bfxVar.r0(xibVar.c);
                bfxVar.A1("positionId");
                bfxVar.r0(xibVar.d);
                bfxVar.A1("upsaleStep");
                bfxVar.r0(xibVar.e.getRawValue());
                return;
            case 2:
                yib yibVar = (yib) obj;
                yf70 yf70Var = yibVar.b;
                yf70 yf70Var2 = yibVar.a;
                if (yf70Var2 instanceof xf70) {
                    bfxVar.A1("offers");
                    lqy lqyVar = new lqy(l80.a(c));
                    Object obj2 = ((xf70) yf70Var2).a;
                    if (obj2 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar.a(bfxVar, cVar, obj2);
                    }
                }
                if (yf70Var instanceof xf70) {
                    bfxVar.A1("passedUpsaleSteps");
                    foe foeVar2 = l80.a;
                    lqy lqyVar2 = new lqy(v);
                    Object obj3 = ((xf70) yf70Var).a;
                    if (obj3 == null) {
                        bfxVar.k2();
                        return;
                    } else {
                        lqyVar2.a(bfxVar, cVar, obj3);
                        return;
                    }
                }
                return;
            case 3:
                okb okbVar = (okb) obj;
                bfxVar.A1("offerName");
                cVar.d(wkfVar).a(bfxVar, cVar, okbVar.a);
                bfxVar.A1("offersBatchId");
                foe foeVar3 = l80.a;
                bfxVar.r0(okbVar.b);
                bfxVar.A1("positionId");
                bfxVar.r0(okbVar.c);
                return;
            case 4:
                yf70 yf70Var3 = ((pkb) obj).a;
                if (yf70Var3 instanceof xf70) {
                    bfxVar.A1("offers");
                    lqy lqyVar3 = new lqy(l80.a(e));
                    Object obj4 = ((xf70) yf70Var3).a;
                    if (obj4 == null) {
                        bfxVar.k2();
                        return;
                    } else {
                        lqyVar3.a(bfxVar, cVar, obj4);
                        return;
                    }
                }
                return;
            case 5:
                bfxVar.A1("installed");
                l80.f.a(bfxVar, cVar, false);
                bfxVar.A1("name");
                foe foeVar4 = l80.a;
                bfxVar.r0(null);
                return;
            case 6:
                bfxVar.r0(((DEVICE) obj).getRawValue());
                return;
            case 7:
                throw oyr.d(obj);
            case 8:
                bfxVar.r0(((INVOICE_STATUS) obj).getRawValue());
                return;
            case 9:
                zkv zkvVar = (zkv) obj;
                bfxVar.A1(FinishFlowStatus.ORDER_ID_FIELD_NAME);
                foe foeVar5 = l80.a;
                bfxVar.r0(zkvVar.a);
                bfxVar.A1("productId");
                bfxVar.r0(zkvVar.b);
                bfxVar.A1("purchaseToken");
                bfxVar.r0(zkvVar.c);
                return;
            case 10:
                throw oyr.d(obj);
            case 11:
                bfxVar.r0(((PLAQUE_ACTION_PERFORM_STATUS) obj).getRawValue());
                return;
            case 12:
                bfxVar.r0(((PLAQUE_CLICKED_STATUS) obj).getRawValue());
                return;
            case 13:
                nze0 nze0Var = (nze0) obj;
                bfxVar.A1("amount");
                bfxVar.r0(nze0Var.a.toString());
                bfxVar.A1("currency");
                foe foeVar6 = l80.a;
                uga1.f(bfxVar, nze0Var.b);
                return;
            case 14:
                e0g0 e0g0Var = (e0g0) obj;
                bfxVar.A1("commonPeriodDuration");
                foe foeVar7 = l80.a;
                uga1.f(bfxVar, e0g0Var.a);
                bfxVar.A1("commonPrice");
                l80.a(o).a(bfxVar, cVar, e0g0Var.b);
                yf70 yf70Var4 = e0g0Var.c;
                if (yf70Var4 instanceof xf70) {
                    bfxVar.A1("quantity");
                    l80.k.a(bfxVar, cVar, ((xf70) yf70Var4).a);
                    return;
                }
                return;
            case 15:
                tju0 tju0Var = (tju0) obj;
                bfxVar.A1("offerName");
                cVar.d(wkfVar).a(bfxVar, cVar, tju0Var.a);
                bfxVar.A1("purchasePlans");
                ep60 a = l80.a(p);
                ArrayList arrayList = tju0Var.b;
                bfxVar.l();
                for (Object obj5 : arrayList) {
                    if (obj5 == null) {
                        bfxVar.k2();
                    } else {
                        a.a(bfxVar, cVar, obj5);
                    }
                }
                bfxVar.j();
                return;
            case 16:
                uju0 uju0Var = (uju0) obj;
                yf70 yf70Var5 = uju0Var.a;
                if (yf70Var5 instanceof xf70) {
                    bfxVar.A1("inAppPurchases");
                    lqy lqyVar4 = new lqy(new om60(l80.a(k)));
                    Object obj6 = ((xf70) yf70Var5).a;
                    if (obj6 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar4.a(bfxVar, cVar, obj6);
                    }
                }
                bfxVar.A1("storeOffers");
                ep60 a2 = l80.a(q);
                ArrayList arrayList2 = uju0Var.b;
                bfxVar.l();
                for (Object obj7 : arrayList2) {
                    if (obj7 == null) {
                        bfxVar.k2();
                    } else {
                        a2.a(bfxVar, cVar, obj7);
                    }
                }
                bfxVar.j();
                return;
            case 17:
                bfxVar.r0(((SubscriptionButtonType) obj).getRawValue());
                return;
            case 18:
                bfxVar.r0(((SubscriptionPaymentMethod) obj).getRawValue());
                return;
            case 19:
                bfxVar.r0(((SubscriptionWidgetType) obj).getRawValue());
                return;
            case 20:
                bfxVar.r0(((UPSALE_STEP) obj).getRawValue());
                return;
            case 21:
                bfxVar.r0(((UPSALE_STEP_VIEW) obj).getRawValue());
                return;
            case 22:
                uga1.f(bfxVar, obj);
                return;
            case 23:
                bfxVar.Z0(((Number) obj).floatValue());
                return;
            default:
                b64.D(obj);
                bfxVar.value();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        CONSUMER_TYPE consumer_type = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                String nextString = xdxVar.nextString();
                CONSUMER_TYPE.Companion.getClass();
                CONSUMER_TYPE[] values = CONSUMER_TYPE.values();
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        CONSUMER_TYPE consumer_type2 = values[i2];
                        if (jl40.l(consumer_type2.getRawValue(), nextString)) {
                            consumer_type = consumer_type2;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? CONSUMER_TYPE.UNKNOWN__ : consumer_type;
            case 1:
                throw new IllegalStateException("Input type used in output position");
            case 2:
                throw new IllegalStateException("Input type used in output position");
            case 3:
                throw new IllegalStateException("Input type used in output position");
            case 4:
                throw new IllegalStateException("Input type used in output position");
            case 5:
                throw new IllegalStateException("Input type used in output position");
            case 6:
                String nextString2 = xdxVar.nextString();
                DEVICE.Companion.getClass();
                DEVICE[] values2 = DEVICE.values();
                int length2 = values2.length;
                while (true) {
                    if (i2 < length2) {
                        DEVICE device = values2[i2];
                        if (jl40.l(device.getRawValue(), nextString2)) {
                            consumer_type = device;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? DEVICE.UNKNOWN__ : consumer_type;
            case 7:
                throw new IllegalStateException("Input type used in output position");
            case 8:
                String nextString3 = xdxVar.nextString();
                INVOICE_STATUS.Companion.getClass();
                INVOICE_STATUS[] values3 = INVOICE_STATUS.values();
                int length3 = values3.length;
                while (true) {
                    if (i2 < length3) {
                        INVOICE_STATUS invoice_status = values3[i2];
                        if (jl40.l(invoice_status.getRawValue(), nextString3)) {
                            consumer_type = invoice_status;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? INVOICE_STATUS.UNKNOWN__ : consumer_type;
            case 9:
                throw new IllegalStateException("Input type used in output position");
            case 10:
                throw new IllegalStateException("Input type used in output position");
            case 11:
                String nextString4 = xdxVar.nextString();
                PLAQUE_ACTION_PERFORM_STATUS.Companion.getClass();
                PLAQUE_ACTION_PERFORM_STATUS[] values4 = PLAQUE_ACTION_PERFORM_STATUS.values();
                int length4 = values4.length;
                while (true) {
                    if (i2 < length4) {
                        PLAQUE_ACTION_PERFORM_STATUS plaque_action_perform_status = values4[i2];
                        if (jl40.l(plaque_action_perform_status.getRawValue(), nextString4)) {
                            consumer_type = plaque_action_perform_status;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? PLAQUE_ACTION_PERFORM_STATUS.UNKNOWN__ : consumer_type;
            case 12:
                String nextString5 = xdxVar.nextString();
                PLAQUE_CLICKED_STATUS.Companion.getClass();
                PLAQUE_CLICKED_STATUS[] values5 = PLAQUE_CLICKED_STATUS.values();
                int length5 = values5.length;
                while (true) {
                    if (i2 < length5) {
                        PLAQUE_CLICKED_STATUS plaque_clicked_status = values5[i2];
                        if (jl40.l(plaque_clicked_status.getRawValue(), nextString5)) {
                            consumer_type = plaque_clicked_status;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? PLAQUE_CLICKED_STATUS.UNKNOWN__ : consumer_type;
            case 13:
                throw new IllegalStateException("Input type used in output position");
            case 14:
                throw new IllegalStateException("Input type used in output position");
            case 15:
                throw new IllegalStateException("Input type used in output position");
            case 16:
                throw new IllegalStateException("Input type used in output position");
            case 17:
                String nextString6 = xdxVar.nextString();
                SubscriptionButtonType.Companion.getClass();
                SubscriptionButtonType[] values6 = SubscriptionButtonType.values();
                int length6 = values6.length;
                while (true) {
                    if (i2 < length6) {
                        SubscriptionButtonType subscriptionButtonType = values6[i2];
                        if (jl40.l(subscriptionButtonType.getRawValue(), nextString6)) {
                            consumer_type = subscriptionButtonType;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? SubscriptionButtonType.UNKNOWN__ : consumer_type;
            case 18:
                String nextString7 = xdxVar.nextString();
                SubscriptionPaymentMethod.Companion.getClass();
                SubscriptionPaymentMethod[] values7 = SubscriptionPaymentMethod.values();
                int length7 = values7.length;
                while (true) {
                    if (i2 < length7) {
                        SubscriptionPaymentMethod subscriptionPaymentMethod = values7[i2];
                        if (jl40.l(subscriptionPaymentMethod.getRawValue(), nextString7)) {
                            consumer_type = subscriptionPaymentMethod;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? SubscriptionPaymentMethod.UNKNOWN__ : consumer_type;
            case 19:
                String nextString8 = xdxVar.nextString();
                SubscriptionWidgetType.Companion.getClass();
                SubscriptionWidgetType[] values8 = SubscriptionWidgetType.values();
                int length8 = values8.length;
                while (true) {
                    if (i2 < length8) {
                        SubscriptionWidgetType subscriptionWidgetType = values8[i2];
                        if (jl40.l(subscriptionWidgetType.getRawValue(), nextString8)) {
                            consumer_type = subscriptionWidgetType;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? SubscriptionWidgetType.UNKNOWN__ : consumer_type;
            case 20:
                String nextString9 = xdxVar.nextString();
                UPSALE_STEP.Companion.getClass();
                UPSALE_STEP[] values9 = UPSALE_STEP.values();
                int length9 = values9.length;
                while (true) {
                    if (i2 < length9) {
                        UPSALE_STEP upsale_step = values9[i2];
                        if (jl40.l(upsale_step.getRawValue(), nextString9)) {
                            consumer_type = upsale_step;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? UPSALE_STEP.UNKNOWN__ : consumer_type;
            case 21:
                String nextString10 = xdxVar.nextString();
                UPSALE_STEP_VIEW.Companion.getClass();
                UPSALE_STEP_VIEW[] values10 = UPSALE_STEP_VIEW.values();
                int length10 = values10.length;
                while (true) {
                    if (i2 < length10) {
                        UPSALE_STEP_VIEW upsale_step_view = values10[i2];
                        if (jl40.l(upsale_step_view.getRawValue(), nextString10)) {
                            consumer_type = upsale_step_view;
                        } else {
                            i2++;
                        }
                    }
                }
                return consumer_type == null ? UPSALE_STEP_VIEW.UNKNOWN__ : consumer_type;
            case 22:
                return ooc.y(xdxVar);
            case 23:
                return Float.valueOf((float) xdxVar.nextDouble());
            default:
                throw new IllegalStateException("File Upload used in output position");
        }
    }
}
