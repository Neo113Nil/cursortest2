package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsPermissionState;
import defpackage.fk;
import defpackage.lb20;
import defpackage.lwc0;
import defpackage.mb20;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final com.yandex.go.platform.utils.a a;
    public final fk b;
    public final lb20 c;

    public g(com.yandex.go.platform.utils.a aVar, fk fkVar, lb20 lb20Var) {
        this.a = aVar;
        this.b = fkVar;
        this.c = lb20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        JsPermissionsHandler$requestLocationPermission$1 jsPermissionsHandler$requestLocationPermission$1;
        int i;
        Object b;
        if (continuationImpl instanceof JsPermissionsHandler$requestLocationPermission$1) {
            jsPermissionsHandler$requestLocationPermission$1 = (JsPermissionsHandler$requestLocationPermission$1) continuationImpl;
            int i2 = jsPermissionsHandler$requestLocationPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsPermissionsHandler$requestLocationPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsPermissionsHandler$requestLocationPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsPermissionsHandler$requestLocationPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsPermissionsHandler$requestLocationPermission$1.L$0 = this;
                    jsPermissionsHandler$requestLocationPermission$1.label = 1;
                    b = ((com.yandex.taxi.go_platform.delegates.a) this.b).b();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (g) jsPermissionsHandler$requestLocationPermission$1.L$0;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.getClass();
                        return booleanValue ? JsPermissionState.GRANTED : JsPermissionState.DENIED;
                    }
                    this = (g) jsPermissionsHandler$requestLocationPermission$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (((lwc0) (b instanceof Result.Failure ? null : b)) != null) {
                    ((mb20) this.c).a("JsPermissionsHandler", "Request location permission for authorized user", null);
                    return JsPermissionState.DENIED;
                }
                com.yandex.go.platform.utils.a aVar = this.a;
                jsPermissionsHandler$requestLocationPermission$1.L$0 = this;
                jsPermissionsHandler$requestLocationPermission$1.label = 2;
                obj = aVar.c(jsPermissionsHandler$requestLocationPermission$1);
            }
        }
        jsPermissionsHandler$requestLocationPermission$1 = new JsPermissionsHandler$requestLocationPermission$1(this, continuationImpl);
        Object obj2 = jsPermissionsHandler$requestLocationPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPermissionsHandler$requestLocationPermission$1.label;
        if (i != 0) {
        }
        if (((lwc0) (b instanceof Result.Failure ? null : b)) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(ContinuationImpl continuationImpl) {
        JsPermissionsHandler$tryToEnableGeolocation$1 jsPermissionsHandler$tryToEnableGeolocation$1;
        int i;
        if (continuationImpl instanceof JsPermissionsHandler$tryToEnableGeolocation$1) {
            jsPermissionsHandler$tryToEnableGeolocation$1 = (JsPermissionsHandler$tryToEnableGeolocation$1) continuationImpl;
            int i2 = jsPermissionsHandler$tryToEnableGeolocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsPermissionsHandler$tryToEnableGeolocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsPermissionsHandler$tryToEnableGeolocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsPermissionsHandler$tryToEnableGeolocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsPermissionsHandler$tryToEnableGeolocation$1.L$0 = this;
                    jsPermissionsHandler$tryToEnableGeolocation$1.label = 1;
                    obj = this.a.e(jsPermissionsHandler$tryToEnableGeolocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (g) jsPermissionsHandler$tryToEnableGeolocation$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.getClass();
                return !booleanValue ? JsPermissionState.GRANTED : JsPermissionState.DENIED;
            }
        }
        jsPermissionsHandler$tryToEnableGeolocation$1 = new JsPermissionsHandler$tryToEnableGeolocation$1(this, continuationImpl);
        Object obj2 = jsPermissionsHandler$tryToEnableGeolocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPermissionsHandler$tryToEnableGeolocation$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        this.getClass();
        if (!booleanValue2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(ContinuationImpl continuationImpl) {
        JsPermissionsHandler$tryToEnableNotifications$1 jsPermissionsHandler$tryToEnableNotifications$1;
        int i;
        if (continuationImpl instanceof JsPermissionsHandler$tryToEnableNotifications$1) {
            jsPermissionsHandler$tryToEnableNotifications$1 = (JsPermissionsHandler$tryToEnableNotifications$1) continuationImpl;
            int i2 = jsPermissionsHandler$tryToEnableNotifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsPermissionsHandler$tryToEnableNotifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsPermissionsHandler$tryToEnableNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsPermissionsHandler$tryToEnableNotifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsPermissionsHandler$tryToEnableNotifications$1.L$0 = this;
                    jsPermissionsHandler$tryToEnableNotifications$1.label = 1;
                    obj = this.a.f(jsPermissionsHandler$tryToEnableNotifications$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (g) jsPermissionsHandler$tryToEnableNotifications$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.getClass();
                return !booleanValue ? JsPermissionState.GRANTED : JsPermissionState.DENIED;
            }
        }
        jsPermissionsHandler$tryToEnableNotifications$1 = new JsPermissionsHandler$tryToEnableNotifications$1(this, continuationImpl);
        Object obj2 = jsPermissionsHandler$tryToEnableNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPermissionsHandler$tryToEnableNotifications$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        this.getClass();
        if (!booleanValue2) {
        }
    }
}
