package com.yandex.messaging.internal.authorized.chat.notifications;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import defpackage.ab4;
import defpackage.at2;
import defpackage.ffx;
import defpackage.hb4;
import defpackage.ib4;
import defpackage.in21;
import defpackage.kb4;
import defpackage.kjs0;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.p150;
import defpackage.w2b1;
import defpackage.xav;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c {
    public final p150 a;
    public final o1b0 b;
    public final at2 c;
    public final xav d;
    public final ab4 e;
    public final int f;
    public final int g;

    public c(p150 p150Var, o1b0 o1b0Var, at2 at2Var, xav xavVar, ab4 ab4Var) {
        this.a = p150Var;
        this.b = o1b0Var;
        this.c = at2Var;
        this.d = xavVar;
        this.e = ab4Var;
        int b = kjs0.b(48);
        this.f = b;
        this.g = new kb4(b).a();
    }

    public final Object a(ContinuationImpl continuationImpl) {
        p150 p150Var = this.a;
        return b(p150Var.e(), p150Var.h(), p150Var.a(), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        NotificationAvatarLoader$loadCircleAvatarOrPlaceholder$1 notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof NotificationAvatarLoader$loadCircleAvatarOrPlaceholder$1) {
            notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1 = (NotificationAvatarLoader$loadCircleAvatarOrPlaceholder$1) continuationImpl;
            int i2 = notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$0 = this;
                    notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$1 = str2;
                    notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$2 = str3;
                    notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.label = 1;
                    obj = f(str, notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$2;
                    str2 = (String) notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$1;
                    this = (c) notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return bitmap;
                }
                this.getClass();
                String a = w2b1.a(str2);
                ab4 ab4Var = this.e;
                int i3 = this.f;
                return ffx.c0(ab4Var.a.l(str3, a, null, hb4.a), i3, i3, Bitmap.Config.ARGB_8888);
            }
        }
        notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1 = new NotificationAvatarLoader$loadCircleAvatarOrPlaceholder$1(this, continuationImpl);
        Object obj2 = notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationAvatarLoader$loadCircleAvatarOrPlaceholder$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        NotificationAvatarLoader$loadSquareAvatarOrPlaceholder$1 notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof NotificationAvatarLoader$loadSquareAvatarOrPlaceholder$1) {
            notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1 = (NotificationAvatarLoader$loadSquareAvatarOrPlaceholder$1) continuationImpl;
            int i2 = notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$0 = this;
                    notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$1 = str2;
                    notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$2 = str3;
                    notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.label = 1;
                    obj = (str == null || str.length() == 0) ? null : kotlinx.coroutines.a.w(400L, new NotificationAvatarLoader$tryLoadAvatar$2(this, str, null), notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$2;
                    str2 = (String) notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$1;
                    this = (c) notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.getClass();
                    String a = w2b1.a(str2);
                    ab4 ab4Var = this.e;
                    int i3 = this.f;
                    return ffx.c0(ab4Var.a.l(str3, a, null, new ib4(Integer.valueOf(this.g))), i3, i3, Bitmap.Config.ARGB_8888);
                }
                ab4 ab4Var2 = this.e;
                int i4 = this.f;
                float f = this.g;
                ab4Var2.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                float f2 = i4;
                new Canvas(createBitmap).drawRoundRect(0.0f, 0.0f, f2, f2, f, f, ab4.a(bitmap, i4));
                return createBitmap;
            }
        }
        notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1 = new NotificationAvatarLoader$loadSquareAvatarOrPlaceholder$1(this, continuationImpl);
        Object obj2 = notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationAvatarLoader$loadSquareAvatarOrPlaceholder$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }

    public final Object d(String str, ContinuationImpl continuationImpl) {
        String str2;
        in21 a = this.c.a().a(str);
        String str3 = a != null ? a.b : null;
        String str4 = "";
        if (a == null || (str2 = a.a) == null) {
            str2 = "";
        }
        String str5 = a != null ? a.c : null;
        if (ChatNamespaces.b(this.b.b)) {
            str4 = this.a.a();
        } else if (str5 != null) {
            str4 = str5;
        }
        return b(str3, str2, str4, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ArrayList arrayList, ContinuationImpl continuationImpl) {
        NotificationAvatarLoader$loadUsersAvatar$1 notificationAvatarLoader$loadUsersAvatar$1;
        int i;
        if (continuationImpl instanceof NotificationAvatarLoader$loadUsersAvatar$1) {
            notificationAvatarLoader$loadUsersAvatar$1 = (NotificationAvatarLoader$loadUsersAvatar$1) continuationImpl;
            int i2 = notificationAvatarLoader$loadUsersAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationAvatarLoader$loadUsersAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationAvatarLoader$loadUsersAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationAvatarLoader$loadUsersAvatar$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map = (Map) notificationAvatarLoader$loadUsersAvatar$1.L$0;
                    kotlin.b.b(obj);
                    return map;
                }
                kotlin.b.b(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                NotificationAvatarLoader$loadUsersAvatar$2 notificationAvatarLoader$loadUsersAvatar$2 = new NotificationAvatarLoader$loadUsersAvatar$2(arrayList, linkedHashMap, this, null);
                notificationAvatarLoader$loadUsersAvatar$1.L$0 = linkedHashMap;
                notificationAvatarLoader$loadUsersAvatar$1.label = 1;
                return kotlinx.coroutines.a.w(400L, notificationAvatarLoader$loadUsersAvatar$2, notificationAvatarLoader$loadUsersAvatar$1) == coroutineSingletons ? coroutineSingletons : linkedHashMap;
            }
        }
        notificationAvatarLoader$loadUsersAvatar$1 = new NotificationAvatarLoader$loadUsersAvatar$1(this, continuationImpl);
        Object obj2 = notificationAvatarLoader$loadUsersAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationAvatarLoader$loadUsersAvatar$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        NotificationAvatarLoader$tryLoadCircleAvatar$1 notificationAvatarLoader$tryLoadCircleAvatar$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof NotificationAvatarLoader$tryLoadCircleAvatar$1) {
            notificationAvatarLoader$tryLoadCircleAvatar$1 = (NotificationAvatarLoader$tryLoadCircleAvatar$1) continuationImpl;
            int i2 = notificationAvatarLoader$tryLoadCircleAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationAvatarLoader$tryLoadCircleAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationAvatarLoader$tryLoadCircleAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationAvatarLoader$tryLoadCircleAvatar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    notificationAvatarLoader$tryLoadCircleAvatar$1.L$0 = this;
                    notificationAvatarLoader$tryLoadCircleAvatar$1.label = 1;
                    obj = (str == null || str.length() == 0) ? null : kotlinx.coroutines.a.w(400L, new NotificationAvatarLoader$tryLoadAvatar$2(this, str, null), notificationAvatarLoader$tryLoadCircleAvatar$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) notificationAvatarLoader$tryLoadCircleAvatar$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return null;
                }
                ab4 ab4Var = this.e;
                int i3 = this.f;
                ab4Var.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint a = ab4.a(bitmap, i3);
                float f = i3 / 2.0f;
                canvas.drawCircle(f, f, f, a);
                return createBitmap;
            }
        }
        notificationAvatarLoader$tryLoadCircleAvatar$1 = new NotificationAvatarLoader$tryLoadCircleAvatar$1(this, continuationImpl);
        Object obj2 = notificationAvatarLoader$tryLoadCircleAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationAvatarLoader$tryLoadCircleAvatar$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }
}
