package com.yandex.go.platform.utils;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.app.s0;
import androidx.core.location.j;
import defpackage.b60;
import defpackage.l50;
import defpackage.lza0;
import defpackage.ny61;
import defpackage.qke;
import defpackage.scc;
import defpackage.sza0;
import defpackage.tza0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes13.dex */
public final class a {
    public static final List i = scc.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    public final Context a;
    public final String b;
    public final b60 c;
    public final l50 d;
    public final lza0 e;
    public final tza0 f;
    public final LocationManager g;
    public final s0 h;

    public a(Context context, String str, b60 b60Var, l50 l50Var, lza0 lza0Var, tza0 tza0Var) {
        this.a = context;
        this.b = str;
        this.c = b60Var;
        this.d = l50Var;
        this.e = lza0Var;
        this.f = tza0Var;
        this.g = (LocationManager) context.getSystemService("location");
        this.h = new s0(context);
    }

    public final boolean a() {
        List list = i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (qke.h(this.a, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PermissionsHandler$requestCameraPermission$1 permissionsHandler$requestCameraPermission$1;
        int i2;
        if (continuationImpl instanceof PermissionsHandler$requestCameraPermission$1) {
            permissionsHandler$requestCameraPermission$1 = (PermissionsHandler$requestCameraPermission$1) continuationImpl;
            int i3 = permissionsHandler$requestCameraPermission$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsHandler$requestCameraPermission$1.label = i3 - Integer.MIN_VALUE;
                Object obj = permissionsHandler$requestCameraPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = permissionsHandler$requestCameraPermission$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (qke.h(this.a, "android.permission.CAMERA") == 0) {
                        return Boolean.TRUE;
                    }
                    androidx.core.app.b.J(((com.yandex.go.platform.permissions.a) this.e).a, new String[]{"android.permission.CAMERA"}, 305);
                    permissionsHandler$requestCameraPermission$1.label = 1;
                    obj = ((com.yandex.go.platform.permissions.a) this.f).a(305, permissionsHandler$requestCameraPermission$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((sza0) obj).a.contains("android.permission.CAMERA"));
            }
        }
        permissionsHandler$requestCameraPermission$1 = new PermissionsHandler$requestCameraPermission$1(this, continuationImpl);
        Object obj2 = permissionsHandler$requestCameraPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = permissionsHandler$requestCameraPermission$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((sza0) obj2).a.contains("android.permission.CAMERA"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PermissionsHandler$requestLocationPermission$1 permissionsHandler$requestLocationPermission$1;
        int i2;
        if (continuationImpl instanceof PermissionsHandler$requestLocationPermission$1) {
            permissionsHandler$requestLocationPermission$1 = (PermissionsHandler$requestLocationPermission$1) continuationImpl;
            int i3 = permissionsHandler$requestLocationPermission$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsHandler$requestLocationPermission$1.label = i3 - Integer.MIN_VALUE;
                Object obj = permissionsHandler$requestLocationPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = permissionsHandler$requestLocationPermission$1.label;
                List list = i;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (a()) {
                        return Boolean.TRUE;
                    }
                    androidx.core.app.b.J(((com.yandex.go.platform.permissions.a) this.e).a, (String[]) list.toArray(new String[0]), 303);
                    permissionsHandler$requestLocationPermission$1.label = 1;
                    obj = ((com.yandex.go.platform.permissions.a) this.f).a(303, permissionsHandler$requestLocationPermission$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((sza0) obj).a.containsAll(list));
            }
        }
        permissionsHandler$requestLocationPermission$1 = new PermissionsHandler$requestLocationPermission$1(this, continuationImpl);
        Object obj2 = permissionsHandler$requestLocationPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = permissionsHandler$requestLocationPermission$1.label;
        List list2 = i;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((sza0) obj2).a.containsAll(list2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PermissionsHandler$requestPostNotificationsPermission$1 permissionsHandler$requestPostNotificationsPermission$1;
        int i2;
        if (continuationImpl instanceof PermissionsHandler$requestPostNotificationsPermission$1) {
            permissionsHandler$requestPostNotificationsPermission$1 = (PermissionsHandler$requestPostNotificationsPermission$1) continuationImpl;
            int i3 = permissionsHandler$requestPostNotificationsPermission$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsHandler$requestPostNotificationsPermission$1.label = i3 - Integer.MIN_VALUE;
                Object obj = permissionsHandler$requestPostNotificationsPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = permissionsHandler$requestPostNotificationsPermission$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (Build.VERSION.SDK_INT < 33 || qke.h(this.a, "android.permission.POST_NOTIFICATIONS") == 0) {
                        return Boolean.TRUE;
                    }
                    androidx.core.app.b.J(((com.yandex.go.platform.permissions.a) this.e).a, new String[]{"android.permission.POST_NOTIFICATIONS"}, 307);
                    permissionsHandler$requestPostNotificationsPermission$1.label = 1;
                    obj = ((com.yandex.go.platform.permissions.a) this.f).a(307, permissionsHandler$requestPostNotificationsPermission$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((sza0) obj).a.contains("android.permission.POST_NOTIFICATIONS"));
            }
        }
        permissionsHandler$requestPostNotificationsPermission$1 = new PermissionsHandler$requestPostNotificationsPermission$1(this, continuationImpl);
        Object obj2 = permissionsHandler$requestPostNotificationsPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = permissionsHandler$requestPostNotificationsPermission$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((sza0) obj2).a.contains("android.permission.POST_NOTIFICATIONS"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PermissionsHandler$tryToEnableGeolocation$1 permissionsHandler$tryToEnableGeolocation$1;
        int i2;
        if (continuationImpl instanceof PermissionsHandler$tryToEnableGeolocation$1) {
            permissionsHandler$tryToEnableGeolocation$1 = (PermissionsHandler$tryToEnableGeolocation$1) continuationImpl;
            int i3 = permissionsHandler$tryToEnableGeolocation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsHandler$tryToEnableGeolocation$1.label = i3 - Integer.MIN_VALUE;
                Object obj = permissionsHandler$tryToEnableGeolocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = permissionsHandler$tryToEnableGeolocation$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    WeakHashMap weakHashMap = j.a;
                    if (this.g.isLocationEnabled()) {
                        return Boolean.TRUE;
                    }
                    this.c.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 302);
                    permissionsHandler$tryToEnableGeolocation$1.L$0 = this;
                    permissionsHandler$tryToEnableGeolocation$1.label = 1;
                    if (this.d.a(302, permissionsHandler$tryToEnableGeolocation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) permissionsHandler$tryToEnableGeolocation$1.L$0;
                    kotlin.b.b(obj);
                }
                LocationManager locationManager = this.g;
                WeakHashMap weakHashMap2 = j.a;
                return Boolean.valueOf(locationManager.isLocationEnabled());
            }
        }
        permissionsHandler$tryToEnableGeolocation$1 = new PermissionsHandler$tryToEnableGeolocation$1(this, continuationImpl);
        Object obj2 = permissionsHandler$tryToEnableGeolocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = permissionsHandler$tryToEnableGeolocation$1.label;
        if (i2 != 0) {
        }
        LocationManager locationManager2 = this.g;
        WeakHashMap weakHashMap22 = j.a;
        return Boolean.valueOf(locationManager2.isLocationEnabled());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        PermissionsHandler$tryToEnableNotifications$1 permissionsHandler$tryToEnableNotifications$1;
        int i2;
        if (continuationImpl instanceof PermissionsHandler$tryToEnableNotifications$1) {
            permissionsHandler$tryToEnableNotifications$1 = (PermissionsHandler$tryToEnableNotifications$1) continuationImpl;
            int i3 = permissionsHandler$tryToEnableNotifications$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                permissionsHandler$tryToEnableNotifications$1.label = i3 - Integer.MIN_VALUE;
                Object obj = permissionsHandler$tryToEnableNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = permissionsHandler$tryToEnableNotifications$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (this.h.b.areNotificationsEnabled()) {
                        return Boolean.TRUE;
                    }
                    this.c.startActivityForResult(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", this.b), IDialogId.DIALOG_PIN_WND_IDD_PASSWORD);
                    permissionsHandler$tryToEnableNotifications$1.L$0 = this;
                    permissionsHandler$tryToEnableNotifications$1.label = 1;
                    if (this.d.a(IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, permissionsHandler$tryToEnableNotifications$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) permissionsHandler$tryToEnableNotifications$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(this.h.b.areNotificationsEnabled());
            }
        }
        permissionsHandler$tryToEnableNotifications$1 = new PermissionsHandler$tryToEnableNotifications$1(this, continuationImpl);
        Object obj2 = permissionsHandler$tryToEnableNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = permissionsHandler$tryToEnableNotifications$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(this.h.b.areNotificationsEnabled());
    }
}
