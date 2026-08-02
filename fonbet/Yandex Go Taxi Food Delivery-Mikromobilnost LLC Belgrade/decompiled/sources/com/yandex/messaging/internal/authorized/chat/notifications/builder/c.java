package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.g0;
import androidx.core.app.h0;
import androidx.core.app.v;
import androidx.core.app.w0;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.h2t;
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
public final class c implements og60 {
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final ii60 x;

    public c(Context context, z120 z120Var, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, ii60 ii60Var) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = ii60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        DeepSyncNotificationAppearance$applyAppearance$1 deepSyncNotificationAppearance$applyAppearance$1;
        int i;
        String h;
        String string;
        Object a;
        String str;
        h2t h2tVar;
        if (continuation instanceof DeepSyncNotificationAppearance$applyAppearance$1) {
            deepSyncNotificationAppearance$applyAppearance$1 = (DeepSyncNotificationAppearance$applyAppearance$1) continuation;
            int i2 = deepSyncNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deepSyncNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deepSyncNotificationAppearance$applyAppearance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deepSyncNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h = this.c.h();
                    Context context = this.a;
                    string = context.getString(oyh0.notification_ticker, h);
                    ii60 ii60Var = this.x;
                    if (ii60Var.k) {
                        h = context.getString(oyh0.notification_mention_title, h);
                    } else if (ii60Var.l) {
                        h = context.getString(oyh0.notification_reply_title, h);
                    }
                    deepSyncNotificationAppearance$applyAppearance$1.L$0 = this;
                    deepSyncNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    deepSyncNotificationAppearance$applyAppearance$1.L$2 = string;
                    deepSyncNotificationAppearance$applyAppearance$1.L$3 = h;
                    deepSyncNotificationAppearance$applyAppearance$1.label = 1;
                    a = this.w.a(deepSyncNotificationAppearance$applyAppearance$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) deepSyncNotificationAppearance$applyAppearance$1.L$3;
                    String str3 = (String) deepSyncNotificationAppearance$applyAppearance$1.L$2;
                    v vVar2 = (v) deepSyncNotificationAppearance$applyAppearance$1.L$1;
                    c cVar = (c) deepSyncNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                    h = str2;
                    this = cVar;
                    a = obj;
                    string = str3;
                    vVar = vVar2;
                }
                Bitmap bitmap = (Bitmap) a;
                ii60 ii60Var2 = this.x;
                w0 w0Var = new w0();
                w0Var.a = this.a.getResources().getString(oyh0.your_message_in_notification);
                h0 h0Var = new h0(w0Var.a());
                w0 w0Var2 = new w0();
                str = ii60Var2.f;
                if (str == null) {
                    this.b.getClass();
                } else {
                    str = null;
                }
                w0Var2.a = str;
                w0Var2.b = IconCompat.b(bitmap);
                g0 g0Var = new g0(ii60Var2.a, ii60Var2.c, w0Var2.a());
                h2tVar = ii60Var2.g;
                if (h2tVar != null) {
                    Uri uri = (Uri) h2tVar.a;
                    g0Var.e = "image/";
                    g0Var.f = uri;
                }
                h0Var.e(g0Var);
                h0Var.h = null;
                h0Var.f(false);
                vVar.m(string);
                vVar.i(bitmap);
                vVar.f(h);
                vVar.l(h0Var);
                return zy11.a;
            }
        }
        deepSyncNotificationAppearance$applyAppearance$1 = new DeepSyncNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        Object obj2 = deepSyncNotificationAppearance$applyAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deepSyncNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) a;
        ii60 ii60Var22 = this.x;
        w0 w0Var3 = new w0();
        w0Var3.a = this.a.getResources().getString(oyh0.your_message_in_notification);
        h0 h0Var2 = new h0(w0Var3.a());
        w0 w0Var22 = new w0();
        str = ii60Var22.f;
        if (str == null) {
        }
        w0Var22.a = str;
        w0Var22.b = IconCompat.b(bitmap2);
        g0 g0Var2 = new g0(ii60Var22.a, ii60Var22.c, w0Var22.a());
        h2tVar = ii60Var22.g;
        if (h2tVar != null) {
        }
        h0Var2.e(g0Var2);
        h0Var2.h = null;
        h0Var2.f(false);
        vVar.m(string);
        vVar.i(bitmap2);
        vVar.f(h);
        vVar.l(h0Var2);
        return zy11.a;
    }
}
