package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.v;
import defpackage.ii60;
import defpackage.ny61;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.z120;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e implements og60 {
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final ii60 x;

    public e(Context context, z120 z120Var, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, ii60 ii60Var) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = ii60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        MeetingStartNotificationAppearance$applyAppearance$1 meetingStartNotificationAppearance$applyAppearance$1;
        int i;
        e eVar;
        String str;
        if (continuation instanceof MeetingStartNotificationAppearance$applyAppearance$1) {
            meetingStartNotificationAppearance$applyAppearance$1 = (MeetingStartNotificationAppearance$applyAppearance$1) continuation;
            int i2 = meetingStartNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                meetingStartNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = meetingStartNotificationAppearance$applyAppearance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = meetingStartNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p150 p150Var = this.c;
                    String g = p150Var.b.p ? p150Var.g() : p150Var.h();
                    String h = g == null ? p150Var.h() : g;
                    this.b.getClass();
                    vVar.m(this.a.getString(oyh0.notification_ticker, h));
                    meetingStartNotificationAppearance$applyAppearance$1.L$0 = this;
                    meetingStartNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    meetingStartNotificationAppearance$applyAppearance$1.L$2 = g;
                    meetingStartNotificationAppearance$applyAppearance$1.label = 1;
                    com.yandex.messaging.internal.authorized.chat.notifications.c cVar = this.w;
                    obj = cVar.f(cVar.a.e(), meetingStartNotificationAppearance$applyAppearance$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar = this;
                    str = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) meetingStartNotificationAppearance$applyAppearance$1.L$2;
                    vVar = (v) meetingStartNotificationAppearance$applyAppearance$1.L$1;
                    eVar = (e) meetingStartNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                vVar.i((Bitmap) obj);
                vVar.f(str);
                vVar.e(eVar.x.a);
                vVar.r = null;
                return zy11.a;
            }
        }
        meetingStartNotificationAppearance$applyAppearance$1 = new MeetingStartNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        Object obj2 = meetingStartNotificationAppearance$applyAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = meetingStartNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        vVar.i((Bitmap) obj2);
        vVar.f(str);
        vVar.e(eVar.x.a);
        vVar.r = null;
        return zy11.a;
    }
}
