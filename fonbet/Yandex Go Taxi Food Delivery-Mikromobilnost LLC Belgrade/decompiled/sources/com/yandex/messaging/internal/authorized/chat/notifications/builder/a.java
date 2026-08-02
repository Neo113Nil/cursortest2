package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.h0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.cs8;
import defpackage.ny61;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.z120;
import defpackage.zy11;
import defpackage.zz10;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a implements og60 {
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final zz10 x;
    public final List y;

    public a(Context context, z120 z120Var, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, zz10 zz10Var, List list) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = zz10Var;
        this.y = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        ChannelNotificationAppearance$applyAppearance$1 channelNotificationAppearance$applyAppearance$1;
        int i;
        if (continuation instanceof ChannelNotificationAppearance$applyAppearance$1) {
            channelNotificationAppearance$applyAppearance$1 = (ChannelNotificationAppearance$applyAppearance$1) continuation;
            int i2 = channelNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = channelNotificationAppearance$applyAppearance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String h = this.c.h();
                    this.b.getClass();
                    vVar.m(this.a.getString(oyh0.notification_ticker, h));
                    channelNotificationAppearance$applyAppearance$1.L$0 = vVar;
                    channelNotificationAppearance$applyAppearance$1.label = 1;
                    obj = b(this.y, channelNotificationAppearance$applyAppearance$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vVar = (v) channelNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                h0 h0Var = (h0) obj;
                h0Var.h = null;
                h0Var.f(false);
                vVar.l(h0Var);
                return zy11.a;
            }
        }
        channelNotificationAppearance$applyAppearance$1 = new ChannelNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        Object obj3 = channelNotificationAppearance$applyAppearance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        h0 h0Var2 = (h0) obj3;
        h0Var2.h = null;
        h0Var2.f(false);
        vVar.l(h0Var2);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        ChannelNotificationAppearance$buildMessagingStyle$1 channelNotificationAppearance$buildMessagingStyle$1;
        int i;
        if (continuationImpl instanceof ChannelNotificationAppearance$buildMessagingStyle$1) {
            channelNotificationAppearance$buildMessagingStyle$1 = (ChannelNotificationAppearance$buildMessagingStyle$1) continuationImpl;
            int i2 = channelNotificationAppearance$buildMessagingStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelNotificationAppearance$buildMessagingStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = channelNotificationAppearance$buildMessagingStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelNotificationAppearance$buildMessagingStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    channelNotificationAppearance$buildMessagingStyle$1.L$0 = this;
                    channelNotificationAppearance$buildMessagingStyle$1.L$1 = list;
                    channelNotificationAppearance$buildMessagingStyle$1.label = 1;
                    obj = this.w.a(channelNotificationAppearance$buildMessagingStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) channelNotificationAppearance$buildMessagingStyle$1.L$1;
                    this = (a) channelNotificationAppearance$buildMessagingStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.x.a(list, new cs8(10, IconCompat.b((Bitmap) obj), this));
            }
        }
        channelNotificationAppearance$buildMessagingStyle$1 = new ChannelNotificationAppearance$buildMessagingStyle$1(this, continuationImpl);
        Object obj2 = channelNotificationAppearance$buildMessagingStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelNotificationAppearance$buildMessagingStyle$1.label;
        if (i != 0) {
        }
        return this.x.a(list, new cs8(10, IconCompat.b((Bitmap) obj2), this));
    }
}
