package com.yandex.go.taxi.order.cancel.v2.data;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.f1h0;
import defpackage.mk70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk70;
import defpackage.pkf;
import defpackage.qk70;
import defpackage.rk70;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lrk70;", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lzy11;", "<anonymous>", "(Lvpr;Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelHeaderImageRepository$headerImageFlow$1", f = "OrderCancelHeaderImageRepository.kt", l = {34, 35, 39, 40, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelHeaderImageRepository$headerImageFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ OrderCancelNotification.IconWithBadge $icon;
    final /* synthetic */ OrderCancelNotification.Style.IconAlignment $iconAlignment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelHeaderImageRepository$headerImageFlow$1(OrderCancelNotification.IconWithBadge iconWithBadge, c cVar, OrderCancelNotification.Style.IconAlignment iconAlignment, Continuation continuation) {
        super(3, continuation);
        this.$icon = iconWithBadge;
        this.this$0 = cVar;
        this.$iconAlignment = iconAlignment;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderCancelHeaderImageRepository$headerImageFlow$1 orderCancelHeaderImageRepository$headerImageFlow$1 = new OrderCancelHeaderImageRepository$headerImageFlow$1(this.$icon, this.this$0, this.$iconAlignment, (Continuation) obj3);
        orderCancelHeaderImageRepository$headerImageFlow$1.L$0 = (vpr) obj;
        return orderCancelHeaderImageRepository$headerImageFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x013e, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0129, code lost:
    
        if (r12 != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        if (r12 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (r0.emit(r9, r11) == r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        rk70 rk70Var;
        String str2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderCancelNotification.IconWithBadge iconWithBadge = this.$icon;
            str = iconWithBadge != null ? iconWithBadge.b : null;
            if (str == null) {
                str = "";
            }
            String str3 = iconWithBadge != null ? iconWithBadge.a : null;
            if (str3 == null) {
                str3 = "";
            }
            if (str.length() > 0) {
                c cVar = this.this$0;
                OrderCancelNotification.Style.IconAlignment iconAlignment = this.$iconAlignment;
                OrderCancelNotification.IconWithBadge iconWithBadge2 = this.$icon;
                com.yandex.go.taxi.order.cancel.v2.domain.models.a aVar = new com.yandex.go.taxi.order.cancel.v2.domain.models.a(c.c(iconAlignment), pkf.g(tje.y(f1h0.driver_avatar_fallback_circled, cVar.a.a), "avatar_fallback", null), null, iconWithBadge2 != null ? iconWithBadge2.c : null);
                this.L$0 = vprVar;
                this.L$1 = str;
                this.L$2 = null;
                this.label = 1;
            } else {
                int length = str3.length();
                rk70 rk70Var2 = pk70.a;
                if (length > 0) {
                    c cVar2 = this.this$0;
                    OrderCancelNotification.Style.IconAlignment iconAlignment2 = this.$iconAlignment;
                    OrderCancelNotification.IconWithBadge iconWithBadge3 = this.$icon;
                    String str4 = iconWithBadge3 != null ? iconWithBadge3.d : null;
                    cVar2.getClass();
                    if ((iconAlignment2 == null ? -1 : mk70.a[iconAlignment2.ordinal()]) == 2) {
                        rk70Var2 = new qk70(str4);
                    }
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = str3;
                    this.label = 3;
                    if (vprVar.emit(rk70Var2, this) != coroutineSingletons) {
                        str2 = str3;
                        c cVar3 = this.this$0;
                        OrderCancelNotification.Style.IconAlignment iconAlignment3 = this.$iconAlignment;
                        OrderCancelNotification.IconWithBadge iconWithBadge4 = this.$icon;
                        if (iconWithBadge4 == null) {
                        }
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        obj = c.a(cVar3, iconAlignment3, r6, str2, this);
                    }
                } else {
                    rk70Var = rk70Var2;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            str = (String) this.L$1;
            kotlin.b.b(obj);
            c cVar4 = this.this$0;
            OrderCancelNotification.Style.IconAlignment iconAlignment4 = this.$iconAlignment;
            OrderCancelNotification.IconWithBadge iconWithBadge5 = this.$icon;
            String str5 = iconWithBadge5 != null ? iconWithBadge5.c : null;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = c.b(cVar4, iconAlignment4, str, str5, this);
        } else if (i == 2) {
            kotlin.b.b(obj);
            rk70Var = (rk70) obj;
        } else if (i == 3) {
            str2 = (String) this.L$2;
            kotlin.b.b(obj);
            c cVar32 = this.this$0;
            OrderCancelNotification.Style.IconAlignment iconAlignment32 = this.$iconAlignment;
            OrderCancelNotification.IconWithBadge iconWithBadge42 = this.$icon;
            String str6 = iconWithBadge42 == null ? iconWithBadge42.d : null;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            obj = c.a(cVar32, iconAlignment32, str6, str2, this);
        } else {
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            rk70Var = (rk70) obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 5;
    }
}
