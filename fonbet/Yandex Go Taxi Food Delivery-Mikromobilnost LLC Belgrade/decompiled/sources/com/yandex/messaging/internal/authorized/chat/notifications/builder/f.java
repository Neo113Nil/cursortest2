package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.h0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.l420;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.ugd0;
import defpackage.ume;
import defpackage.z120;
import defpackage.zy11;
import defpackage.zz10;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class f implements og60 {
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final ume x;
    public final zz10 y;
    public final List z;

    public f(ume umeVar, zz10 zz10Var, z120 z120Var, l420 l420Var, p150 p150Var, o1b0 o1b0Var, Context context, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, com.yandex.messaging.internal.authorized.chat.notifications.d dVar, List list) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = umeVar;
        this.y = zz10Var;
        this.z = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        PrivateChatNotificationAppearance$applyAppearance$1 privateChatNotificationAppearance$applyAppearance$1;
        int i;
        if (continuation instanceof PrivateChatNotificationAppearance$applyAppearance$1) {
            privateChatNotificationAppearance$applyAppearance$1 = (PrivateChatNotificationAppearance$applyAppearance$1) continuation;
            int i2 = privateChatNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                privateChatNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = privateChatNotificationAppearance$applyAppearance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = privateChatNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String h = this.c.h();
                    this.b.getClass();
                    vVar.m(this.a.getString(oyh0.notification_ticker, h));
                    privateChatNotificationAppearance$applyAppearance$1.L$0 = this;
                    privateChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    privateChatNotificationAppearance$applyAppearance$1.L$2 = h;
                    privateChatNotificationAppearance$applyAppearance$1.label = 1;
                    obj = this.w.a(privateChatNotificationAppearance$applyAppearance$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vVar = (v) privateChatNotificationAppearance$applyAppearance$1.L$1;
                    this = (f) privateChatNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                IconCompat b = IconCompat.b((Bitmap) obj);
                h0 a = this.y.a(this.z, new ugd0(8, b, this));
                a.h = null;
                a.f(false);
                vVar.l(a);
                this.x.a();
                return zy11.a;
            }
        }
        privateChatNotificationAppearance$applyAppearance$1 = new PrivateChatNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        Object obj2 = privateChatNotificationAppearance$applyAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = privateChatNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        IconCompat b2 = IconCompat.b((Bitmap) obj2);
        h0 a2 = this.y.a(this.z, new ugd0(8, b2, this));
        a2.h = null;
        a2.f(false);
        vVar.l(a2);
        this.x.a();
        return zy11.a;
    }
}
