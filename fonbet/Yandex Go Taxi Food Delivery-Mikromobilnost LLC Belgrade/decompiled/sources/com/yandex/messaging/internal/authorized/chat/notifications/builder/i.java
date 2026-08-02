package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.t;
import androidx.core.app.v;
import defpackage.ii60;
import defpackage.ny61;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class i implements og60 {
    public final Context a;
    public final p150 b;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c c;
    public final List w;

    public i(Context context, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, List list) {
        this.a = context;
        this.b = p150Var;
        this.c = cVar;
        this.w = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[LOOP:0: B:11:0x0095->B:13:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        TurboAppNotificationAppearance$applyAppearance$1 turboAppNotificationAppearance$applyAppearance$1;
        int i;
        i iVar;
        String str;
        int size;
        Iterator it;
        if (continuation instanceof TurboAppNotificationAppearance$applyAppearance$1) {
            turboAppNotificationAppearance$applyAppearance$1 = (TurboAppNotificationAppearance$applyAppearance$1) continuation;
            int i2 = turboAppNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                turboAppNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = turboAppNotificationAppearance$applyAppearance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = turboAppNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String h = this.b.h();
                    turboAppNotificationAppearance$applyAppearance$1.L$0 = this;
                    turboAppNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    turboAppNotificationAppearance$applyAppearance$1.L$2 = h;
                    turboAppNotificationAppearance$applyAppearance$1.label = 1;
                    com.yandex.messaging.internal.authorized.chat.notifications.c cVar = this.c;
                    p150 p150Var = cVar.a;
                    Object c = cVar.c(p150Var.e(), p150Var.h(), p150Var.a(), turboAppNotificationAppearance$applyAppearance$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iVar = this;
                    str = h;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) turboAppNotificationAppearance$applyAppearance$1.L$2;
                    vVar = (v) turboAppNotificationAppearance$applyAppearance$1.L$1;
                    iVar = (i) turboAppNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                vVar.f(str);
                vVar.e(((ii60) kotlin.collections.a.Z(iVar.w)).a);
                List list = iVar.w;
                t.e eVar = new t.e();
                List B0 = kotlin.collections.a.B0(5, list);
                size = list.size() - B0.size();
                it = B0.iterator();
                while (it.hasNext()) {
                    eVar.e(((ii60) it.next()).a);
                }
                if (size > 0) {
                    eVar.f(iVar.a.getString(oyh0.notification_more_messages_count, Integer.valueOf(size)));
                }
                vVar.l(eVar);
                vVar.i(bitmap);
                return zy11.a;
            }
        }
        turboAppNotificationAppearance$applyAppearance$1 = new TurboAppNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        Object obj2 = turboAppNotificationAppearance$applyAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = turboAppNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        vVar.f(str);
        vVar.e(((ii60) kotlin.collections.a.Z(iVar.w)).a);
        List list2 = iVar.w;
        t.e eVar2 = new t.e();
        List B02 = kotlin.collections.a.B0(5, list2);
        size = list2.size() - B02.size();
        it = B02.iterator();
        while (it.hasNext()) {
        }
        if (size > 0) {
        }
        vVar.l(eVar2);
        vVar.i(bitmap2);
        return zy11.a;
    }
}
