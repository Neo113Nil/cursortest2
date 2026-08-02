package com.yandex.go.settings.domain;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.yandex.go.geosharing.controller.e;
import defpackage.a60;
import defpackage.aba0;
import defpackage.as21;
import defpackage.d1t;
import defpackage.fx2;
import defpackage.jer0;
import defpackage.jst;
import defpackage.ker0;
import defpackage.kt00;
import defpackage.n8z;
import defpackage.ny61;
import defpackage.qqt0;
import defpackage.rkv;
import defpackage.sw2;
import defpackage.tis0;
import defpackage.u8r0;
import defpackage.uw2;
import defpackage.v7j0;
import defpackage.x2r0;
import defpackage.xby;
import defpackage.xk60;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.b0;

/* loaded from: classes13.dex */
public final class a {
    public final tis0 a;
    public final x2r0 b;
    public final x2r0 c;
    public final as21 d;
    public final qqt0 e;
    public final aba0 f;
    public final kt00 g;
    public final n8z h;
    public final ru.yandex.taxi.utils.b i;
    public final d1t j;
    public final v7j0 k;
    public final jer0 l;
    public final b0 m;
    public final rkv n;
    public final xk60 o;

    public a(tis0 tis0Var, x2r0 x2r0Var, x2r0 x2r0Var2, as21 as21Var, qqt0 qqt0Var, aba0 aba0Var, kt00 kt00Var, n8z n8zVar, ru.yandex.taxi.utils.b bVar, d1t d1tVar, v7j0 v7j0Var, jer0 jer0Var, b0 b0Var, rkv rkvVar, xk60 xk60Var) {
        this.a = tis0Var;
        this.b = x2r0Var;
        this.c = x2r0Var2;
        this.d = as21Var;
        this.e = qqt0Var;
        this.f = aba0Var;
        this.g = kt00Var;
        this.h = n8zVar;
        this.i = bVar;
        this.j = d1tVar;
        this.k = v7j0Var;
        this.l = jer0Var;
        this.m = b0Var;
        this.n = rkvVar;
        this.o = xk60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fx2 fx2Var, sw2 sw2Var, ContinuationImpl continuationImpl) {
        SettingsUiActionInteractor$handleClick$1 settingsUiActionInteractor$handleClick$1;
        int i;
        Object b;
        Throwable a;
        if (continuationImpl instanceof SettingsUiActionInteractor$handleClick$1) {
            settingsUiActionInteractor$handleClick$1 = (SettingsUiActionInteractor$handleClick$1) continuationImpl;
            int i2 = settingsUiActionInteractor$handleClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsUiActionInteractor$handleClick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsUiActionInteractor$handleClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsUiActionInteractor$handleClick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = ker0.a[fx2Var.a.getId().ordinal()];
                    if (i3 == 1) {
                        sw2Var.c();
                    } else if (i3 == 2) {
                        sw2Var.e();
                    } else if (i3 == 3) {
                        if (!this.o.b()) {
                            switch (sw2Var.a) {
                                case 0:
                                    a60 a60Var = (a60) ((uw2) sw2Var.b).O;
                                    a60Var.getClass();
                                    try {
                                        a60Var.e(142, new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", a60Var.a.getApplication().getPackageName()));
                                        break;
                                    } catch (ActivityNotFoundException unused) {
                                        break;
                                    }
                            }
                        } else {
                            sw2Var.b();
                        }
                    } else if (i3 == 4) {
                        settingsUiActionInteractor$handleClick$1.L$0 = null;
                        settingsUiActionInteractor$handleClick$1.L$1 = sw2Var;
                        settingsUiActionInteractor$handleClick$1.label = 1;
                        b = this.m.b(settingsUiActionInteractor$handleClick$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sw2Var = (sw2) settingsUiActionInteractor$handleClick$1.L$1;
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (!(b instanceof Result.Failure) && ((Boolean) b).booleanValue()) {
                    sw2Var.a();
                }
                a = Result.a(b);
                if (a != null) {
                    xby.l(jst.e, "SETTINGS_COMPOSE:LOGOUT_EXCEPTION", null, a, "Failed to logout from account", 2);
                }
                return zy11.a;
            }
        }
        settingsUiActionInteractor$handleClick$1 = new SettingsUiActionInteractor$handleClick$1(this, continuationImpl);
        Object obj2 = settingsUiActionInteractor$handleClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsUiActionInteractor$handleClick$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
            sw2Var.a();
        }
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u8r0 u8r0Var, boolean z, sw2 sw2Var, ContinuationImpl continuationImpl) {
        SettingsUiActionInteractor$handleLiveLocationToggle$1 settingsUiActionInteractor$handleLiveLocationToggle$1;
        Object obj;
        int i;
        boolean z2;
        if (continuationImpl instanceof SettingsUiActionInteractor$handleLiveLocationToggle$1) {
            settingsUiActionInteractor$handleLiveLocationToggle$1 = (SettingsUiActionInteractor$handleLiveLocationToggle$1) continuationImpl;
            int i2 = settingsUiActionInteractor$handleLiveLocationToggle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsUiActionInteractor$handleLiveLocationToggle$1.label = i2 - Integer.MIN_VALUE;
                obj = settingsUiActionInteractor$handleLiveLocationToggle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsUiActionInteractor$handleLiveLocationToggle$1.label;
                d1t d1tVar = this.j;
                ru.yandex.taxi.utils.b bVar = this.i;
                tis0 tis0Var = this.a;
                jer0 jer0Var = this.l;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean e = bVar.e();
                    if (e == z) {
                        return zy11Var;
                    }
                    jer0Var.c(z);
                    if (!z) {
                        bVar.m.u(bVar.g, false);
                        ((e) d1tVar).g(false);
                        jer0Var.c(false);
                        tis0Var.X(u8r0Var, e, false);
                        return zy11Var;
                    }
                    settingsUiActionInteractor$handleLiveLocationToggle$1.L$0 = u8r0Var;
                    settingsUiActionInteractor$handleLiveLocationToggle$1.L$1 = sw2Var;
                    settingsUiActionInteractor$handleLiveLocationToggle$1.Z$0 = z;
                    settingsUiActionInteractor$handleLiveLocationToggle$1.Z$1 = e;
                    settingsUiActionInteractor$handleLiveLocationToggle$1.label = 1;
                    Object d = ((com.yandex.go.permission.b) this.k).d(1, settingsUiActionInteractor$handleLiveLocationToggle$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = d;
                    z2 = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = settingsUiActionInteractor$handleLiveLocationToggle$1.Z$1;
                    sw2Var = (sw2) settingsUiActionInteractor$handleLiveLocationToggle$1.L$1;
                    u8r0Var = (u8r0) settingsUiActionInteractor$handleLiveLocationToggle$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    jer0Var.c(false);
                    sw2Var.g();
                    return zy11Var;
                }
                bVar.m.u(bVar.g, true);
                ((e) d1tVar).g(true);
                jer0Var.c(true);
                tis0Var.X(u8r0Var, z2, true);
                return zy11Var;
            }
        }
        settingsUiActionInteractor$handleLiveLocationToggle$1 = new SettingsUiActionInteractor$handleLiveLocationToggle$1(this, continuationImpl);
        obj = settingsUiActionInteractor$handleLiveLocationToggle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsUiActionInteractor$handleLiveLocationToggle$1.label;
        d1t d1tVar2 = this.j;
        ru.yandex.taxi.utils.b bVar2 = this.i;
        tis0 tis0Var2 = this.a;
        jer0 jer0Var2 = this.l;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
