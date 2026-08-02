package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import androidx.core.app.h0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.e8m;
import defpackage.h3y;
import defpackage.h9b;
import defpackage.i3y;
import defpackage.ii60;
import defpackage.l090;
import defpackage.l420;
import defpackage.m810;
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
import defpackage.z83;
import defpackage.zy11;
import defpackage.zz10;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class h implements og60 {
    public final h3y A;
    public final h3y B;
    public final List C;
    public final i3y D = kotlin.a.a(new oew0(25, this));
    public final Context a;
    public final z120 b;
    public final p150 c;
    public final com.yandex.messaging.internal.authorized.chat.notifications.c w;
    public final zz10 x;
    public final ume y;
    public final o1b0 z;

    public h(Context context, z120 z120Var, p150 p150Var, com.yandex.messaging.internal.authorized.chat.notifications.c cVar, zz10 zz10Var, com.yandex.messaging.internal.authorized.chat.notifications.d dVar, ume umeVar, l420 l420Var, o1b0 o1b0Var, h3y h3yVar, h3y h3yVar2, List list) {
        this.a = context;
        this.b = z120Var;
        this.c = p150Var;
        this.w = cVar;
        this.x = zz10Var;
        this.y = umeVar;
        this.z = o1b0Var;
        this.A = h3yVar;
        this.B = h3yVar2;
        this.C = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.og60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v vVar, Continuation continuation) {
        ThreadNotificationAppearance$applyAppearance$1 threadNotificationAppearance$applyAppearance$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        h hVar;
        String str;
        if (continuation instanceof ThreadNotificationAppearance$applyAppearance$1) {
            threadNotificationAppearance$applyAppearance$1 = (ThreadNotificationAppearance$applyAppearance$1) continuation;
            int i2 = threadNotificationAppearance$applyAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadNotificationAppearance$applyAppearance$1.label = i2 - Integer.MIN_VALUE;
                obj = threadNotificationAppearance$applyAppearance$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadNotificationAppearance$applyAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    threadNotificationAppearance$applyAppearance$1.L$0 = this;
                    threadNotificationAppearance$applyAppearance$1.L$1 = vVar;
                    threadNotificationAppearance$applyAppearance$1.label = 1;
                    obj = d(threadNotificationAppearance$applyAppearance$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) threadNotificationAppearance$applyAppearance$1.L$2;
                        vVar = (v) threadNotificationAppearance$applyAppearance$1.L$1;
                        hVar = (h) threadNotificationAppearance$applyAppearance$1.L$0;
                        kotlin.b.b(obj);
                        h0 h0Var = (h0) obj;
                        h0Var.h = str;
                        h0Var.f(true);
                        vVar.l(h0Var);
                        hVar.y.a();
                        return zy11.a;
                    }
                    vVar = (v) threadNotificationAppearance$applyAppearance$1.L$1;
                    this = (h) threadNotificationAppearance$applyAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                String str2 = (String) pair.getFirst();
                Bitmap bitmap = (Bitmap) pair.getSecond();
                this.b.getClass();
                vVar.m(this.a.getString(oyh0.notification_ticker, str2));
                vVar.i(bitmap);
                vVar.M = ((IconCompat) this.D.getValue()).i(vVar.a);
                vVar.f(str2);
                List list = this.C;
                threadNotificationAppearance$applyAppearance$1.L$0 = this;
                threadNotificationAppearance$applyAppearance$1.L$1 = vVar;
                threadNotificationAppearance$applyAppearance$1.L$2 = str2;
                threadNotificationAppearance$applyAppearance$1.L$3 = bitmap;
                threadNotificationAppearance$applyAppearance$1.label = 2;
                obj = this.b(list, threadNotificationAppearance$applyAppearance$1);
                if (obj != coroutineSingletons) {
                    hVar = this;
                    str = str2;
                    h0 h0Var2 = (h0) obj;
                    h0Var2.h = str;
                    h0Var2.f(true);
                    vVar.l(h0Var2);
                    hVar.y.a();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        threadNotificationAppearance$applyAppearance$1 = new ThreadNotificationAppearance$applyAppearance$1(this, (ContinuationImpl) continuation);
        obj = threadNotificationAppearance$applyAppearance$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadNotificationAppearance$applyAppearance$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj;
        String str22 = (String) pair2.getFirst();
        Bitmap bitmap2 = (Bitmap) pair2.getSecond();
        this.b.getClass();
        vVar.m(this.a.getString(oyh0.notification_ticker, str22));
        vVar.i(bitmap2);
        vVar.M = ((IconCompat) this.D.getValue()).i(vVar.a);
        vVar.f(str22);
        List list2 = this.C;
        threadNotificationAppearance$applyAppearance$1.L$0 = this;
        threadNotificationAppearance$applyAppearance$1.L$1 = vVar;
        threadNotificationAppearance$applyAppearance$1.L$2 = str22;
        threadNotificationAppearance$applyAppearance$1.L$3 = bitmap2;
        threadNotificationAppearance$applyAppearance$1.label = 2;
        obj = this.b(list2, threadNotificationAppearance$applyAppearance$1);
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
        ThreadNotificationAppearance$buildMessagingStyle$1 threadNotificationAppearance$buildMessagingStyle$1;
        int i;
        if (continuationImpl instanceof ThreadNotificationAppearance$buildMessagingStyle$1) {
            threadNotificationAppearance$buildMessagingStyle$1 = (ThreadNotificationAppearance$buildMessagingStyle$1) continuationImpl;
            int i2 = threadNotificationAppearance$buildMessagingStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadNotificationAppearance$buildMessagingStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadNotificationAppearance$buildMessagingStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadNotificationAppearance$buildMessagingStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ii60) it.next()).e);
                    }
                    threadNotificationAppearance$buildMessagingStyle$1.L$0 = this;
                    threadNotificationAppearance$buildMessagingStyle$1.L$1 = list;
                    threadNotificationAppearance$buildMessagingStyle$1.label = 1;
                    obj = this.w.e(arrayList, threadNotificationAppearance$buildMessagingStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) threadNotificationAppearance$buildMessagingStyle$1.L$1;
                    this = (h) threadNotificationAppearance$buildMessagingStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.x.a(rob1.e(this.a, list), new rmy0(7, (Map) obj, this));
            }
        }
        threadNotificationAppearance$buildMessagingStyle$1 = new ThreadNotificationAppearance$buildMessagingStyle$1(this, continuationImpl);
        Object obj2 = threadNotificationAppearance$buildMessagingStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadNotificationAppearance$buildMessagingStyle$1.label;
        if (i != 0) {
        }
        return this.x.a(rob1.e(this.a, list), new rmy0(7, (Map) obj2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        ThreadNotificationAppearance$getDefaultAppearance$1 threadNotificationAppearance$getDefaultAppearance$1;
        int i;
        String str;
        if (continuationImpl instanceof ThreadNotificationAppearance$getDefaultAppearance$1) {
            threadNotificationAppearance$getDefaultAppearance$1 = (ThreadNotificationAppearance$getDefaultAppearance$1) continuationImpl;
            int i2 = threadNotificationAppearance$getDefaultAppearance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadNotificationAppearance$getDefaultAppearance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadNotificationAppearance$getDefaultAppearance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadNotificationAppearance$getDefaultAppearance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String h = this.c.h();
                    threadNotificationAppearance$getDefaultAppearance$1.L$0 = h;
                    threadNotificationAppearance$getDefaultAppearance$1.label = 1;
                    Object a = this.w.a(threadNotificationAppearance$getDefaultAppearance$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    str = h;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) threadNotificationAppearance$getDefaultAppearance$1.L$0;
                    kotlin.b.b(obj);
                }
                return new Pair(str, obj);
            }
        }
        threadNotificationAppearance$getDefaultAppearance$1 = new ThreadNotificationAppearance$getDefaultAppearance$1(this, continuationImpl);
        Object obj2 = threadNotificationAppearance$getDefaultAppearance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadNotificationAppearance$getDefaultAppearance$1.label;
        if (i != 0) {
        }
        return new Pair(str, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0068, code lost:
    
        if (r0 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[EDGE_INSN: B:29:0x00d5->B:18:0x00d5 BREAK  A[LOOP:0: B:22:0x00bb->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ThreadNotificationAppearance$resolveAppearanceData$1 threadNotificationAppearance$resolveAppearanceData$1;
        int i;
        String str;
        s020 e;
        Object e2;
        List list;
        boolean z;
        Iterator it;
        Iterator it2;
        if (continuationImpl instanceof ThreadNotificationAppearance$resolveAppearanceData$1) {
            threadNotificationAppearance$resolveAppearanceData$1 = (ThreadNotificationAppearance$resolveAppearanceData$1) continuationImpl;
            int i2 = threadNotificationAppearance$resolveAppearanceData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadNotificationAppearance$resolveAppearanceData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadNotificationAppearance$resolveAppearanceData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadNotificationAppearance$resolveAppearanceData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n1b0 a = this.z.a();
                    if (a == null || (str = a.d) == null || (e = ((h9b) this.A.get()).e(str)) == null) {
                        threadNotificationAppearance$resolveAppearanceData$1.label = 1;
                        Serializable c = c(threadNotificationAppearance$resolveAppearanceData$1);
                        if (c != coroutineSingletons) {
                            return c;
                        }
                    } else {
                        threadNotificationAppearance$resolveAppearanceData$1.L$0 = this;
                        threadNotificationAppearance$resolveAppearanceData$1.L$1 = e;
                        threadNotificationAppearance$resolveAppearanceData$1.label = 2;
                        e2 = e(e, threadNotificationAppearance$resolveAppearanceData$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s020 s020Var = (s020) threadNotificationAppearance$resolveAppearanceData$1.L$1;
                h hVar = (h) threadNotificationAppearance$resolveAppearanceData$1.L$0;
                kotlin.b.b(obj);
                e = s020Var;
                this = hVar;
                e2 = obj;
                Bitmap bitmap = (Bitmap) e2;
                Context context = this.a;
                String h = ((m8g) e).i().h();
                list = this.C;
                z = list instanceof Collection;
                if (z || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((ii60) it.next()).k) {
                            h = context.getString(oyh0.notification_mention_title, h);
                            break;
                        }
                    }
                }
                if (z || !list.isEmpty()) {
                    it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ii60) it2.next()).l) {
                            h = context.getString(oyh0.notification_reply_title, h);
                            break;
                        }
                    }
                }
                return new Pair(h, bitmap);
            }
        }
        threadNotificationAppearance$resolveAppearanceData$1 = new ThreadNotificationAppearance$resolveAppearanceData$1(this, continuationImpl);
        Object obj2 = threadNotificationAppearance$resolveAppearanceData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadNotificationAppearance$resolveAppearanceData$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) e2;
        Context context2 = this.a;
        String h2 = ((m8g) e).i().h();
        list = this.C;
        z = list instanceof Collection;
        if (z) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
            }
        }
        return new Pair(h2, bitmap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(s020 s020Var, ContinuationImpl continuationImpl) {
        ThreadNotificationAppearance$resolveLargeIcon$1 threadNotificationAppearance$resolveLargeIcon$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        l090 l090Var;
        l090 l090Var2;
        Object c;
        Bitmap bitmap;
        if (continuationImpl instanceof ThreadNotificationAppearance$resolveLargeIcon$1) {
            threadNotificationAppearance$resolveLargeIcon$1 = (ThreadNotificationAppearance$resolveLargeIcon$1) continuationImpl;
            int i2 = threadNotificationAppearance$resolveLargeIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadNotificationAppearance$resolveLargeIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadNotificationAppearance$resolveLargeIcon$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadNotificationAppearance$resolveLargeIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ii60 ii60Var = (ii60) kotlin.collections.a.b0(this.C);
                    com.yandex.messaging.internal.authorized.chat.notifications.c cVar = this.w;
                    if (ii60Var == null) {
                        z83.i();
                        threadNotificationAppearance$resolveLargeIcon$1.label = 1;
                        Object a = cVar.a(threadNotificationAppearance$resolveLargeIcon$1);
                        if (a != coroutineSingletons) {
                            return a;
                        }
                    } else {
                        l090Var = (l090) this.B.get();
                        String str = ii60Var.e;
                        threadNotificationAppearance$resolveLargeIcon$1.L$0 = s020Var;
                        threadNotificationAppearance$resolveLargeIcon$1.L$1 = l090Var;
                        threadNotificationAppearance$resolveLargeIcon$1.label = 2;
                        obj = cVar.d(str, threadNotificationAppearance$resolveLargeIcon$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitmap = (Bitmap) threadNotificationAppearance$resolveLargeIcon$1.L$1;
                    l090Var2 = (l090) threadNotificationAppearance$resolveLargeIcon$1.L$0;
                    kotlin.b.b(obj);
                    l090Var2.getClass();
                    int b = m810.b(48.0f * e8m.a.density);
                    float f = b;
                    float f2 = f / 2.0f;
                    int b2 = m810.b(0.67f * f);
                    int b3 = m810.b(f * 0.42f);
                    float f3 = b2 / 2.0f;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj, b3, b3, true);
                    Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, b2, b2, true);
                    float sqrt = f2 - (f2 / ((float) Math.sqrt(2.0d)));
                    PointF pointF = new PointF(sqrt, sqrt);
                    float sqrt2 = (((f2 / ((float) Math.sqrt(2.0d))) + f2) - (f3 / ((float) Math.sqrt(2.0d)))) - f3;
                    PointF pointF2 = new PointF(sqrt2, sqrt2);
                    Bitmap createBitmap = Bitmap.createBitmap(b, b, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    canvas.drawBitmap(createScaledBitmap, pointF.x, pointF.y, paint);
                    canvas.drawBitmap(createScaledBitmap2, pointF2.x, pointF2.y, paint);
                    return createBitmap;
                }
                l090Var = (l090) threadNotificationAppearance$resolveLargeIcon$1.L$1;
                s020Var = (s020) threadNotificationAppearance$resolveLargeIcon$1.L$0;
                kotlin.b.b(obj);
                s020 s020Var2 = s020Var;
                l090Var2 = l090Var;
                Bitmap bitmap2 = (Bitmap) obj;
                com.yandex.messaging.internal.authorized.chat.notifications.c cVar2 = (com.yandex.messaging.internal.authorized.chat.notifications.c) ((m8g) s020Var2).x.get();
                threadNotificationAppearance$resolveLargeIcon$1.L$0 = l090Var2;
                threadNotificationAppearance$resolveLargeIcon$1.L$1 = bitmap2;
                threadNotificationAppearance$resolveLargeIcon$1.label = 3;
                p150 p150Var = cVar2.a;
                c = cVar2.c(p150Var.e(), p150Var.h(), p150Var.a(), threadNotificationAppearance$resolveLargeIcon$1);
                if (c != coroutineSingletons) {
                    obj = c;
                    bitmap = bitmap2;
                    l090Var2.getClass();
                    int b4 = m810.b(48.0f * e8m.a.density);
                    float f4 = b4;
                    float f22 = f4 / 2.0f;
                    int b22 = m810.b(0.67f * f4);
                    int b32 = m810.b(f4 * 0.42f);
                    float f32 = b22 / 2.0f;
                    Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap((Bitmap) obj, b32, b32, true);
                    Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(bitmap, b22, b22, true);
                    float sqrt3 = f22 - (f22 / ((float) Math.sqrt(2.0d)));
                    PointF pointF3 = new PointF(sqrt3, sqrt3);
                    float sqrt22 = (((f22 / ((float) Math.sqrt(2.0d))) + f22) - (f32 / ((float) Math.sqrt(2.0d)))) - f32;
                    PointF pointF22 = new PointF(sqrt22, sqrt22);
                    Bitmap createBitmap2 = Bitmap.createBitmap(b4, b4, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    Paint paint2 = new Paint(1);
                    canvas2.drawBitmap(createScaledBitmap3, pointF3.x, pointF3.y, paint2);
                    canvas2.drawBitmap(createScaledBitmap22, pointF22.x, pointF22.y, paint2);
                    return createBitmap2;
                }
                return coroutineSingletons;
            }
        }
        threadNotificationAppearance$resolveLargeIcon$1 = new ThreadNotificationAppearance$resolveLargeIcon$1(this, continuationImpl);
        Object obj2 = threadNotificationAppearance$resolveLargeIcon$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadNotificationAppearance$resolveLargeIcon$1.label;
        if (i != 0) {
        }
        s020 s020Var22 = s020Var;
        l090Var2 = l090Var;
        Bitmap bitmap22 = (Bitmap) obj2;
        com.yandex.messaging.internal.authorized.chat.notifications.c cVar22 = (com.yandex.messaging.internal.authorized.chat.notifications.c) ((m8g) s020Var22).x.get();
        threadNotificationAppearance$resolveLargeIcon$1.L$0 = l090Var2;
        threadNotificationAppearance$resolveLargeIcon$1.L$1 = bitmap22;
        threadNotificationAppearance$resolveLargeIcon$1.label = 3;
        p150 p150Var2 = cVar22.a;
        c = cVar22.c(p150Var2.e(), p150Var2.h(), p150Var2.a(), threadNotificationAppearance$resolveLargeIcon$1);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
