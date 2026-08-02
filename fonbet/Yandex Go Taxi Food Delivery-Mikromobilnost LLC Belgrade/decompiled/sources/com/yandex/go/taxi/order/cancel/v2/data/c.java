package com.yandex.go.taxi.order.cancel.v2.data;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.cancel.v2.domain.models.OrderCancelUiState$HeaderImage$Content;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import defpackage.mk70;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.pfv;
import defpackage.pk70;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.tfv;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final e a;
    public final pwy0 b;

    public c(e eVar, pwy0 pwy0Var) {
        this.a = eVar;
        this.b = pwy0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r7 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, OrderCancelNotification.Style.IconAlignment iconAlignment, String str, String str2, ContinuationImpl continuationImpl) {
        OrderCancelHeaderImageRepository$getHeaderImageByTag$1 orderCancelHeaderImageRepository$getHeaderImageByTag$1;
        int i;
        BitmapDrawable bitmapDrawable;
        OrderCancelNotification.Style.IconAlignment iconAlignment2;
        String str3;
        cVar.getClass();
        e eVar = cVar.a;
        if (continuationImpl instanceof OrderCancelHeaderImageRepository$getHeaderImageByTag$1) {
            orderCancelHeaderImageRepository$getHeaderImageByTag$1 = (OrderCancelHeaderImageRepository$getHeaderImageByTag$1) continuationImpl;
            int i2 = orderCancelHeaderImageRepository$getHeaderImageByTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderCancelHeaderImageRepository$getHeaderImageByTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelHeaderImageRepository$getHeaderImageByTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tfv d = d(iconAlignment);
                    orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$0 = iconAlignment;
                    orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$1 = str;
                    orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$2 = str2;
                    orderCancelHeaderImageRepository$getHeaderImageByTag$1.label = 1;
                    obj = e.i(eVar, str2, d, orderCancelHeaderImageRepository$getHeaderImageByTag$1, 6);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$2;
                        str = (String) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$1;
                        iconAlignment2 = (OrderCancelNotification.Style.IconAlignment) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$0;
                        kotlin.b.b(obj);
                        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                        return bitmapDrawable2 == null ? new com.yandex.go.taxi.order.cancel.v2.domain.models.a(c(iconAlignment2), pkf.g(bitmapDrawable2, str3, null), str, null) : pk70.a;
                    }
                    str2 = (String) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$2;
                    str = (String) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$1;
                    iconAlignment = (OrderCancelNotification.Style.IconAlignment) orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return new com.yandex.go.taxi.order.cancel.v2.domain.models.a(c(iconAlignment), pkf.g(bitmapDrawable, str2, null), str, null);
                }
                tfv d2 = d(iconAlignment);
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$0 = iconAlignment;
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$1 = str;
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$2 = str2;
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.L$3 = null;
                orderCancelHeaderImageRepository$getHeaderImageByTag$1.label = 2;
                obj = e.f(eVar, str2, d2, orderCancelHeaderImageRepository$getHeaderImageByTag$1, 4);
                if (obj != coroutineSingletons) {
                    String str4 = str2;
                    iconAlignment2 = iconAlignment;
                    str3 = str4;
                    BitmapDrawable bitmapDrawable22 = (BitmapDrawable) obj;
                    if (bitmapDrawable22 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        orderCancelHeaderImageRepository$getHeaderImageByTag$1 = new OrderCancelHeaderImageRepository$getHeaderImageByTag$1(cVar, continuationImpl);
        Object obj2 = orderCancelHeaderImageRepository$getHeaderImageByTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelHeaderImageRepository$getHeaderImageByTag$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r8 == r12) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, OrderCancelNotification.Style.IconAlignment iconAlignment, String str, String str2, ContinuationImpl continuationImpl) {
        OrderCancelHeaderImageRepository$getHeaderImageByUrl$1 orderCancelHeaderImageRepository$getHeaderImageByUrl$1;
        int i;
        BitmapDrawable bitmapDrawable;
        OrderCancelNotification.Style.IconAlignment iconAlignment2;
        String str3;
        cVar.getClass();
        e eVar = cVar.a;
        if (continuationImpl instanceof OrderCancelHeaderImageRepository$getHeaderImageByUrl$1) {
            orderCancelHeaderImageRepository$getHeaderImageByUrl$1 = (OrderCancelHeaderImageRepository$getHeaderImageByUrl$1) continuationImpl;
            int i2 = orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderCancelHeaderImageRepository$getHeaderImageByUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tfv d = d(iconAlignment);
                    orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$0 = iconAlignment;
                    orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$1 = str;
                    orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$2 = str2;
                    orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label = 1;
                    obj = e.o(eVar, str, d, orderCancelHeaderImageRepository$getHeaderImageByUrl$1, 6);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = (String) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$2;
                        str = (String) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$1;
                        iconAlignment2 = (OrderCancelNotification.Style.IconAlignment) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$0;
                        kotlin.b.b(obj);
                        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                        return bitmapDrawable2 == null ? new com.yandex.go.taxi.order.cancel.v2.domain.models.a(c(iconAlignment2), pkf.g(bitmapDrawable2, str, null), null, str3) : pk70.a;
                    }
                    str2 = (String) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$2;
                    str = (String) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$1;
                    iconAlignment = (OrderCancelNotification.Style.IconAlignment) orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return new com.yandex.go.taxi.order.cancel.v2.domain.models.a(c(iconAlignment), pkf.g(bitmapDrawable, str, null), null, str2);
                }
                tfv d2 = d(iconAlignment);
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$0 = iconAlignment;
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$1 = str;
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$2 = str2;
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.L$3 = null;
                orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label = 2;
                obj = e.k(eVar, str, d2, orderCancelHeaderImageRepository$getHeaderImageByUrl$1, 6);
                if (obj != coroutineSingletons) {
                    String str4 = str2;
                    iconAlignment2 = iconAlignment;
                    str3 = str4;
                    BitmapDrawable bitmapDrawable22 = (BitmapDrawable) obj;
                    if (bitmapDrawable22 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        orderCancelHeaderImageRepository$getHeaderImageByUrl$1 = new OrderCancelHeaderImageRepository$getHeaderImageByUrl$1(cVar, continuationImpl);
        Object obj2 = orderCancelHeaderImageRepository$getHeaderImageByUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderCancelHeaderImageRepository$getHeaderImageByUrl$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
    }

    public static OrderCancelUiState$HeaderImage$Content.Alignment c(OrderCancelNotification.Style.IconAlignment iconAlignment) {
        int i = iconAlignment == null ? -1 : mk70.a[iconAlignment.ordinal()];
        return i != 1 ? i != 2 ? OrderCancelUiState$HeaderImage$Content.Alignment.LEADING : OrderCancelUiState$HeaderImage$Content.Alignment.FULL_SIZE : OrderCancelUiState$HeaderImage$Content.Alignment.CENTER;
    }

    public static tfv d(OrderCancelNotification.Style.IconAlignment iconAlignment) {
        return (iconAlignment == null ? -1 : mk70.a[iconAlignment.ordinal()]) == 2 ? pfv.a : nfv.a;
    }
}
