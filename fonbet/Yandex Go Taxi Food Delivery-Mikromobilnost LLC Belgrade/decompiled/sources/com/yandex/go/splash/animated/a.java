package com.yandex.go.splash.animated;

import android.content.Context;
import android.os.BatteryManager;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import defpackage.aqt0;
import defpackage.avj0;
import defpackage.i3y;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.wf7;
import defpackage.zf2;
import defpackage.zuj0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final aqt0 b;
    public final jtq0 c;
    public final zuj0 d;
    public final BatteryManager e;
    public final i3y f;

    public a(rqo rqoVar, Context context, aqt0 aqt0Var, jtq0 jtq0Var, zuj0 zuj0Var) {
        this.a = context;
        this.b = aqt0Var;
        this.c = jtq0Var;
        this.d = zuj0Var;
        this.e = (BatteryManager) context.getSystemService("batterymanager");
        this.f = kotlin.a.a(new zf2(rqoVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AnimatedSplashInteractor$getAvailableSplashAnimation$1 animatedSplashInteractor$getAvailableSplashAnimation$1;
        int i;
        if (continuationImpl instanceof AnimatedSplashInteractor$getAvailableSplashAnimation$1) {
            animatedSplashInteractor$getAvailableSplashAnimation$1 = (AnimatedSplashInteractor$getAvailableSplashAnimation$1) continuationImpl;
            int i2 = animatedSplashInteractor$getAvailableSplashAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animatedSplashInteractor$getAvailableSplashAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = animatedSplashInteractor$getAvailableSplashAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedSplashInteractor$getAvailableSplashAnimation$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.f.getValue();
                    animatedSplashInteractor$getAvailableSplashAnimation$1.label = 1;
                    obj = t1b0Var.b(animatedSplashInteractor$getAvailableSplashAnimation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                int intProperty = this.e.getIntProperty(4);
                for (AnimatedSplashScreenExperiment.SplashAnimation splashAnimation : ((AnimatedSplashScreenExperiment) obj).b) {
                    int d = qv10.d("ID_", splashAnimation.a, this.b.a, 0);
                    boolean z = ((float) intProperty) > splashAnimation.f;
                    boolean z2 = ((avj0) this.d).a.getResources().getIdentifier(splashAnimation.a, "raw", this.a.getPackageName()) != 0;
                    if (splashAnimation.e > d && z && z2 && wf7.d(this.c.b(null), splashAnimation.b, splashAnimation.c)) {
                        return splashAnimation;
                    }
                }
                return null;
            }
        }
        animatedSplashInteractor$getAvailableSplashAnimation$1 = new AnimatedSplashInteractor$getAvailableSplashAnimation$1(this, continuationImpl);
        Object obj2 = animatedSplashInteractor$getAvailableSplashAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedSplashInteractor$getAvailableSplashAnimation$1.label;
        if (i != 0) {
        }
        int intProperty2 = this.e.getIntProperty(4);
        while (r12.hasNext()) {
        }
        return null;
    }
}
