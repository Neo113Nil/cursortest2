package com.yandex.go.navigator.notifications.cartech;

import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.navigator.driving.r;
import defpackage.bvf0;
import defpackage.e19;
import defpackage.j19;
import defpackage.k19;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final j19 a;
    public final r b;
    public final k19 c;
    public final e19 d;
    public final tt2 e;
    public zzs f;
    public final r0 g;
    public final r0 h;

    public b(j19 j19Var, r rVar, k19 k19Var, e19 e19Var, tt2 tt2Var) {
        this.a = j19Var;
        this.b = rVar;
        this.c = k19Var;
        this.d = e19Var;
        this.e = tt2Var;
        r0 c = bvf0.c(null);
        this.g = c;
        this.h = c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(4:20|(2:22|(1:24))|14|15)|12|13|14|15))|28|6|7|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r5.d.b.a().w("cartech_geo_point_key");
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        NavigatorDestinationNotificationHolder$appendDestinationNotification$1 navigatorDestinationNotificationHolder$appendDestinationNotification$1;
        int i;
        if (continuationImpl instanceof NavigatorDestinationNotificationHolder$appendDestinationNotification$1) {
            navigatorDestinationNotificationHolder$appendDestinationNotification$1 = (NavigatorDestinationNotificationHolder$appendDestinationNotification$1) continuationImpl;
            int i2 = navigatorDestinationNotificationHolder$appendDestinationNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorDestinationNotificationHolder$appendDestinationNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorDestinationNotificationHolder$appendDestinationNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorDestinationNotificationHolder$appendDestinationNotification$1.label;
                DrivingModeNotification drivingModeNotification = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto = (CartechDeeplinkPayloadDto) ((xnt) this.a.a).c(str, CartechDeeplinkPayloadDto.Companion.serializer());
                        this.c.b(cartechDeeplinkPayloadDto);
                        r rVar = this.b;
                        navigatorDestinationNotificationHolder$appendDestinationNotification$1.L$0 = zzsVar;
                        navigatorDestinationNotificationHolder$appendDestinationNotification$1.L$1 = str;
                        navigatorDestinationNotificationHolder$appendDestinationNotification$1.L$2 = null;
                        navigatorDestinationNotificationHolder$appendDestinationNotification$1.L$3 = null;
                        navigatorDestinationNotificationHolder$appendDestinationNotification$1.label = 1;
                        obj = rVar.c(cartechDeeplinkPayloadDto, navigatorDestinationNotificationHolder$appendDestinationNotification$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    this.f = zzsVar;
                    this.g.l(drivingModeNotification);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzsVar = (zzs) navigatorDestinationNotificationHolder$appendDestinationNotification$1.L$0;
                kotlin.b.b(obj);
                drivingModeNotification = (DrivingModeNotification) obj;
                this.f = zzsVar;
                this.g.l(drivingModeNotification);
                return zy11.a;
            }
        }
        navigatorDestinationNotificationHolder$appendDestinationNotification$1 = new NavigatorDestinationNotificationHolder$appendDestinationNotification$1(this, continuationImpl);
        Object obj2 = navigatorDestinationNotificationHolder$appendDestinationNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorDestinationNotificationHolder$appendDestinationNotification$1.label;
        DrivingModeNotification drivingModeNotification2 = null;
        if (i != 0) {
        }
        drivingModeNotification2 = (DrivingModeNotification) obj2;
        this.f = zzsVar;
        this.g.l(drivingModeNotification2);
        return zy11.a;
    }

    public final Object b(Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new NavigatorDestinationNotificationHolder$init$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
