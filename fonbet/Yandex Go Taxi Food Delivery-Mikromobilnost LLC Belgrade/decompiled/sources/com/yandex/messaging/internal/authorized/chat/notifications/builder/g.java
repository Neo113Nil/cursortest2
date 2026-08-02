package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.h0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.h3y;
import defpackage.h9b;
import defpackage.i3y;
import defpackage.ii60;
import defpackage.l420;
import defpackage.m8g;
import defpackage.n1b0;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.oew0;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.rmy0;
import defpackage.rob1;
import defpackage.s020;
import defpackage.tcc;
import defpackage.ume;
import defpackage.z120;
import defpackage.zy11;
import defpackage.zz10;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class g implements og60 {
    public final h3y A;
    public final List B;
    public final i3y C = kotlin.a.a(new oew0(24, this));
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final zz10 x;
    public final ume y;
    public final o1b0 z;

    public g(Context context, z120 z120Var, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, zz10 zz10Var, com.yandex.messaging.internal.authorized.chat.notifications.d dVar, ume umeVar, l420 l420Var, o1b0 o1b0Var, h3y h3yVar, List list) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = zz10Var;
        this.y = umeVar;
        this.z = o1b0Var;
        this.A = h3yVar;
        this.B = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        ThreadInPrivateChatNotificationAppearance$applyAppearance$1 threadInPrivateChatNotificationAppearance$applyAppearance$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        g gVar;
        v vVar2;
        if (continuation instanceof ThreadInPrivateChatNotificationAppearance$applyAppearance$1) {
            threadInPrivateChatNotificationAppearance$applyAppearance$1 = (ThreadInPrivateChatNotificationAppearance$applyAppearance$1) continuation;
            int i2 = threadInPrivateChatNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadInPrivateChatNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                obj = threadInPrivateChatNotificationAppearance$applyAppearance$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadInPrivateChatNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    threadInPrivateChatNotificationAppearance$applyAppearance$1.L$0 = this;
                    threadInPrivateChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    threadInPrivateChatNotificationAppearance$applyAppearance$1.label = 1;
                    obj = c(threadInPrivateChatNotificationAppearance$applyAppearance$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vVar2 = (v) threadInPrivateChatNotificationAppearance$applyAppearance$1.L$1;
                        gVar = (g) threadInPrivateChatNotificationAppearance$applyAppearance$1.L$0;
                        kotlin.b.b(obj);
                        h0 h0Var = (h0) obj;
                        h0Var.h = null;
                        h0Var.f(false);
                        vVar2.l(h0Var);
                        o1b0 o1b0Var = gVar.z;
                        gVar.y.a();
                        return zy11.a;
                    }
                    vVar = (v) threadInPrivateChatNotificationAppearance$applyAppearance$1.L$1;
                    this = (g) threadInPrivateChatNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                Bitmap bitmap = (Bitmap) pair.getSecond();
                this.b.getClass();
                vVar.m(this.a.getString(oyh0.notification_ticker, str));
                vVar.i(bitmap);
                vVar.M = ((IconCompat) this.C.getValue()).i(vVar.a);
                vVar.f(str);
                List list = this.B;
                threadInPrivateChatNotificationAppearance$applyAppearance$1.L$0 = this;
                threadInPrivateChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
                threadInPrivateChatNotificationAppearance$applyAppearance$1.L$2 = str;
                threadInPrivateChatNotificationAppearance$applyAppearance$1.L$3 = bitmap;
                threadInPrivateChatNotificationAppearance$applyAppearance$1.label = 2;
                obj = this.b(list, threadInPrivateChatNotificationAppearance$applyAppearance$1);
                if (obj != coroutineSingletons) {
                    v vVar3 = vVar;
                    gVar = this;
                    vVar2 = vVar3;
                    h0 h0Var2 = (h0) obj;
                    h0Var2.h = null;
                    h0Var2.f(false);
                    vVar2.l(h0Var2);
                    o1b0 o1b0Var2 = gVar.z;
                    gVar.y.a();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        threadInPrivateChatNotificationAppearance$applyAppearance$1 = new ThreadInPrivateChatNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        obj = threadInPrivateChatNotificationAppearance$applyAppearance$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadInPrivateChatNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj;
        String str2 = (String) pair2.getFirst();
        Bitmap bitmap2 = (Bitmap) pair2.getSecond();
        this.b.getClass();
        vVar.m(this.a.getString(oyh0.notification_ticker, str2));
        vVar.i(bitmap2);
        vVar.M = ((IconCompat) this.C.getValue()).i(vVar.a);
        vVar.f(str2);
        List list2 = this.B;
        threadInPrivateChatNotificationAppearance$applyAppearance$1.L$0 = this;
        threadInPrivateChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
        threadInPrivateChatNotificationAppearance$applyAppearance$1.L$2 = str2;
        threadInPrivateChatNotificationAppearance$applyAppearance$1.L$3 = bitmap2;
        threadInPrivateChatNotificationAppearance$applyAppearance$1.label = 2;
        obj = this.b(list2, threadInPrivateChatNotificationAppearance$applyAppearance$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        ThreadInPrivateChatNotificationAppearance$buildMessagingStyle$1 threadInPrivateChatNotificationAppearance$buildMessagingStyle$1;
        int i;
        if (continuationImpl instanceof ThreadInPrivateChatNotificationAppearance$buildMessagingStyle$1) {
            threadInPrivateChatNotificationAppearance$buildMessagingStyle$1 = (ThreadInPrivateChatNotificationAppearance$buildMessagingStyle$1) continuationImpl;
            int i2 = threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ii60) it.next()).e);
                    }
                    threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.L$0 = this;
                    threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.L$1 = list;
                    threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.label = 1;
                    obj = this.w.e(arrayList, threadInPrivateChatNotificationAppearance$buildMessagingStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.L$1;
                    this = (g) threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.x.a(rob1.e(this.a, list), new rmy0(6, (Map) obj, this));
            }
        }
        threadInPrivateChatNotificationAppearance$buildMessagingStyle$1 = new ThreadInPrivateChatNotificationAppearance$buildMessagingStyle$1(this, continuationImpl);
        Object obj2 = threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadInPrivateChatNotificationAppearance$buildMessagingStyle$1.label;
        if (i != 0) {
        }
        return this.x.a(rob1.e(this.a, list), new rmy0(6, (Map) obj2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1 threadInPrivateChatNotificationAppearance$resolveAppearanceData$1;
        int i;
        String str;
        String str2;
        s020 e;
        s020 s020Var;
        if (continuationImpl instanceof ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1) {
            threadInPrivateChatNotificationAppearance$resolveAppearanceData$1 = (ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1) continuationImpl;
            int i2 = threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        str = (String) threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.L$0;
                        kotlin.b.b(obj);
                        return new Pair(str, obj);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s020Var = (s020) threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.L$0;
                    kotlin.b.b(obj);
                    return new Pair(((m8g) s020Var).i().h(), (Bitmap) obj);
                }
                kotlin.b.b(obj);
                n1b0 a = this.z.a();
                if (a == null || (str2 = a.d) == null || (e = ((h9b) this.A.get()).e(str2)) == null) {
                    String h = this.c.h();
                    threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.L$0 = h;
                    threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label = 1;
                    Object a2 = this.w.a(threadInPrivateChatNotificationAppearance$resolveAppearanceData$1);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        str = h;
                        return new Pair(str, obj);
                    }
                } else {
                    com.yandex.messaging.internal.authorized.chat.notifications.c cVar = (com.yandex.messaging.internal.authorized.chat.notifications.c) ((m8g) e).x.get();
                    threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.L$0 = e;
                    threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label = 2;
                    Object a3 = cVar.a(threadInPrivateChatNotificationAppearance$resolveAppearanceData$1);
                    if (a3 != coroutineSingletons) {
                        obj = a3;
                        s020Var = e;
                        return new Pair(((m8g) s020Var).i().h(), (Bitmap) obj);
                    }
                }
                return coroutineSingletons;
            }
        }
        threadInPrivateChatNotificationAppearance$resolveAppearanceData$1 = new ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1(this, continuationImpl);
        Object obj2 = threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadInPrivateChatNotificationAppearance$resolveAppearanceData$1.label;
        if (i == 0) {
        }
    }
}
