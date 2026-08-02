package com.yandex.go.navigator.map_interactions.long_taps;

import android.net.Uri;
import com.yandex.mapkit.geometry.Point;
import defpackage.aoz;
import defpackage.boz;
import defpackage.coz;
import defpackage.ds11;
import defpackage.fx60;
import defpackage.js11;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1", f = "LongTapRouter.kt", l = {56, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    Object L$0;
    int label;
    final /* synthetic */ coz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1(coz cozVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cozVar;
        this.$point = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1(this.this$0, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        boolean booleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1 longTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1 = new LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.u(10000L, longTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.L$0;
                kotlin.b.b(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                coz cozVar = this.this$0;
                if (!booleanValue) {
                    cozVar.A((m950) cozVar.D.get(), new ds11(uri, new js11(this.$point.getLatitude(), this.$point.getLongitude())), new aoz(this.this$0, 1));
                    return zy11Var;
                }
                Point point = (Point) cozVar.x;
                if (point != null) {
                    cozVar.D((m950) cozVar.F.get(), point, new boz(cozVar));
                    return zy11Var;
                }
                cozVar.r(new qu(9));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        Uri uri2 = (Uri) obj;
        if (uri2 == null) {
            return zy11Var;
        }
        fx60 fx60Var = this.this$0.G;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.NAVIGATOR;
        this.L$0 = uri2;
        this.label = 2;
        Object c = fx60Var.c(events$Zalogin$LoginContext, this);
        if (c != coroutineSingletons) {
            uri = uri2;
            obj = c;
            booleanValue = ((Boolean) obj).booleanValue();
            coz cozVar2 = this.this$0;
            if (!booleanValue) {
            }
        }
        return coroutineSingletons;
    }
}
