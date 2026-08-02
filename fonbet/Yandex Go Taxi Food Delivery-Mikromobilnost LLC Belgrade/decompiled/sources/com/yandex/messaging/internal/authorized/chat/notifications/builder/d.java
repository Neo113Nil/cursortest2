package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.h0;
import androidx.core.app.v;
import defpackage.ii60;
import defpackage.l420;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.sxo;
import defpackage.tcc;
import defpackage.ume;
import defpackage.z120;
import defpackage.zy11;
import defpackage.zz10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class d implements og60 {
    public final List A;
    public final int B;
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final ume x;
    public final zz10 y;
    public final o1b0 z;

    public d(ume umeVar, zz10 zz10Var, z120 z120Var, l420 l420Var, p150 p150Var, o1b0 o1b0Var, Context context, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, com.yandex.messaging.internal.authorized.chat.notifications.d dVar, List list) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = umeVar;
        this.y = zz10Var;
        this.z = o1b0Var;
        this.A = list;
        this.B = context.getApplicationInfo().targetSdkVersion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        GroupChatNotificationAppearance$applyAppearance$1 groupChatNotificationAppearance$applyAppearance$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String g;
        d dVar;
        String str;
        if (continuation instanceof GroupChatNotificationAppearance$applyAppearance$1) {
            groupChatNotificationAppearance$applyAppearance$1 = (GroupChatNotificationAppearance$applyAppearance$1) continuation;
            int i2 = groupChatNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupChatNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                obj = groupChatNotificationAppearance$applyAppearance$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = groupChatNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p150 p150Var = this.c;
                    g = p150Var.b.p ? p150Var.g() : p150Var.h();
                    String h = g == null ? p150Var.h() : g;
                    this.b.getClass();
                    vVar.m(this.a.getString(oyh0.notification_ticker, h));
                    groupChatNotificationAppearance$applyAppearance$1.L$0 = this;
                    groupChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    groupChatNotificationAppearance$applyAppearance$1.L$2 = g;
                    groupChatNotificationAppearance$applyAppearance$1.label = 1;
                    com.yandex.messaging.internal.authorized.chat.notifications.c cVar = this.w;
                    p150 p150Var2 = cVar.a;
                    obj = cVar.c(p150Var2.e(), p150Var2.h(), p150Var2.a(), groupChatNotificationAppearance$applyAppearance$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) groupChatNotificationAppearance$applyAppearance$1.L$2;
                        vVar = (v) groupChatNotificationAppearance$applyAppearance$1.L$1;
                        dVar = (d) groupChatNotificationAppearance$applyAppearance$1.L$0;
                        kotlin.b.b(obj);
                        h0 h0Var = (h0) obj;
                        z120 z120Var = dVar.b;
                        List list = dVar.A;
                        o1b0 o1b0Var = dVar.z;
                        Context context = dVar.a;
                        String str2 = o1b0Var.b;
                        z120Var.getClass();
                        if (str != null) {
                            List list2 = list;
                            boolean z = list2 instanceof Collection;
                            if (!z || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((ii60) it.next()).k) {
                                        str = context.getString(oyh0.notification_mention_title, str);
                                        break;
                                    }
                                }
                            }
                            if (!z || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    if (((ii60) it2.next()).l) {
                                        str = context.getString(oyh0.notification_reply_title, str);
                                        break;
                                    }
                                }
                            }
                        }
                        h0Var.h = str;
                        h0Var.f((Build.VERSION.SDK_INT < 30 || dVar.B >= 30) && str != null);
                        vVar.l(h0Var);
                        dVar.x.a();
                        return zy11.a;
                    }
                    String str3 = (String) groupChatNotificationAppearance$applyAppearance$1.L$2;
                    vVar = (v) groupChatNotificationAppearance$applyAppearance$1.L$1;
                    d dVar2 = (d) groupChatNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                    g = str3;
                    this = dVar2;
                }
                vVar.i((Bitmap) obj);
                List list3 = this.A;
                groupChatNotificationAppearance$applyAppearance$1.L$0 = this;
                groupChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
                groupChatNotificationAppearance$applyAppearance$1.L$2 = g;
                groupChatNotificationAppearance$applyAppearance$1.label = 2;
                obj = this.b(list3, groupChatNotificationAppearance$applyAppearance$1);
                if (obj != coroutineSingletons) {
                    dVar = this;
                    str = g;
                    h0 h0Var2 = (h0) obj;
                    z120 z120Var2 = dVar.b;
                    List list4 = dVar.A;
                    o1b0 o1b0Var2 = dVar.z;
                    Context context2 = dVar.a;
                    String str22 = o1b0Var2.b;
                    z120Var2.getClass();
                    if (str != null) {
                    }
                    h0Var2.h = str;
                    if (Build.VERSION.SDK_INT < 30) {
                        h0Var2.f((Build.VERSION.SDK_INT < 30 || dVar.B >= 30) && str != null);
                        vVar.l(h0Var2);
                        dVar.x.a();
                        return zy11.a;
                    }
                    h0Var2.f((Build.VERSION.SDK_INT < 30 || dVar.B >= 30) && str != null);
                    vVar.l(h0Var2);
                    dVar.x.a();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        groupChatNotificationAppearance$applyAppearance$1 = new GroupChatNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        obj = groupChatNotificationAppearance$applyAppearance$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = groupChatNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        vVar.i((Bitmap) obj);
        List list32 = this.A;
        groupChatNotificationAppearance$applyAppearance$1.L$0 = this;
        groupChatNotificationAppearance$applyAppearance$1.L$1 = vVar;
        groupChatNotificationAppearance$applyAppearance$1.L$2 = g;
        groupChatNotificationAppearance$applyAppearance$1.label = 2;
        obj = this.b(list32, groupChatNotificationAppearance$applyAppearance$1);
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
        GroupChatNotificationAppearance$buildMessagingStyle$1 groupChatNotificationAppearance$buildMessagingStyle$1;
        int i;
        if (continuationImpl instanceof GroupChatNotificationAppearance$buildMessagingStyle$1) {
            groupChatNotificationAppearance$buildMessagingStyle$1 = (GroupChatNotificationAppearance$buildMessagingStyle$1) continuationImpl;
            int i2 = groupChatNotificationAppearance$buildMessagingStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupChatNotificationAppearance$buildMessagingStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = groupChatNotificationAppearance$buildMessagingStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = groupChatNotificationAppearance$buildMessagingStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ii60) it.next()).e);
                    }
                    groupChatNotificationAppearance$buildMessagingStyle$1.L$0 = this;
                    groupChatNotificationAppearance$buildMessagingStyle$1.L$1 = list;
                    groupChatNotificationAppearance$buildMessagingStyle$1.label = 1;
                    obj = this.w.e(arrayList, groupChatNotificationAppearance$buildMessagingStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) groupChatNotificationAppearance$buildMessagingStyle$1.L$1;
                    this = (d) groupChatNotificationAppearance$buildMessagingStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.y.a(list, new sxo(24, (Map) obj, this));
            }
        }
        groupChatNotificationAppearance$buildMessagingStyle$1 = new GroupChatNotificationAppearance$buildMessagingStyle$1(this, continuationImpl);
        Object obj2 = groupChatNotificationAppearance$buildMessagingStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = groupChatNotificationAppearance$buildMessagingStyle$1.label;
        if (i != 0) {
        }
        return this.y.a(list, new sxo(24, (Map) obj2, this));
    }
}
