package com.yandex.passport.internal.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.database.Cursor;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.report.ca;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.s9;
import com.yandex.passport.internal.report.v9;
import com.yandex.passport.internal.report.yd;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.lxj;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.passport.internal.properties.p a;
    public final i0 b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.database.g d;
    public final com.yandex.passport.internal.util.j e;
    public final a0 f;
    public final com.yandex.passport.internal.report.reporters.s0 g;
    public final DatabaseHelper h;
    public final com.yandex.passport.internal.flags.j i;
    public final com.yandex.passport.internal.provider.communication.i j;
    public final f k;
    public final com.yandex.passport.internal.provider.communication.l l;
    public final ConcurrentHashMap m = new ConcurrentHashMap();

    public c(com.yandex.passport.internal.properties.p pVar, i0 i0Var, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.database.g gVar, com.yandex.passport.internal.util.j jVar, a0 a0Var, com.yandex.passport.internal.report.reporters.s0 s0Var, DatabaseHelper databaseHelper, com.yandex.passport.internal.flags.j jVar2, com.yandex.passport.internal.provider.communication.i iVar, f fVar, com.yandex.passport.internal.provider.communication.l lVar) {
        this.a = pVar;
        this.b = i0Var;
        this.c = dVar;
        this.d = gVar;
        this.e = jVar;
        this.f = a0Var;
        this.g = s0Var;
        this.h = databaseHelper;
        this.i = jVar2;
        this.j = iVar;
        this.k = fVar;
        this.l = lVar;
    }

    public final boolean a() {
        boolean z;
        lxj k;
        com.yandex.passport.internal.properties.p pVar = this.a;
        if (!pVar.m.isEmpty()) {
            pVar.getClass();
            if (!pVar.m.isEmpty()) {
                a0 a0Var = this.f;
                if (a0Var.a.b.areNotificationsEnabled() && ((k = com.yandex.passport.internal.util.p.k(a0Var.a)) == null || !k.b)) {
                    NotificationManager notificationManager = this.k.a.b;
                    int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                    boolean z2 = currentInterruptionFilter == 1 || currentInterruptionFilter == 0;
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("sign_in_notification_channel_id");
                    boolean canBypassDnd = notificationChannel != null ? notificationChannel.canBypassDnd() : false;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "Notification state group canDisturb: " + z2 + " isOnException: " + canBypassDnd, 8);
                    }
                    if (z2 || canBypassDnd) {
                        z = true;
                        com.yandex.passport.internal.report.reporters.s0 s0Var = this.g;
                        s0Var.getClass();
                        s0Var.f(v9.w, new com.yandex.passport.internal.report.c(z));
                        return z;
                    }
                }
            }
        }
        z = false;
        com.yandex.passport.internal.report.reporters.s0 s0Var2 = this.g;
        s0Var2.getClass();
        s0Var2.f(v9.w, new com.yandex.passport.internal.report.c(z));
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PushPlatform pushPlatform, ContinuationImpl continuationImpl) {
        GreatAgainPushSubscriptionManager$getToken$1 greatAgainPushSubscriptionManager$getToken$1;
        int i;
        Iterator it;
        Object obj;
        com.yandex.passport.api.i0 i0Var;
        String str;
        if (continuationImpl instanceof GreatAgainPushSubscriptionManager$getToken$1) {
            greatAgainPushSubscriptionManager$getToken$1 = (GreatAgainPushSubscriptionManager$getToken$1) continuationImpl;
            int i2 = greatAgainPushSubscriptionManager$getToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                greatAgainPushSubscriptionManager$getToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = greatAgainPushSubscriptionManager$getToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = greatAgainPushSubscriptionManager$getToken$1.label;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str3 = (String) this.m.get(pushPlatform);
                    if (str3 != null) {
                        return str3;
                    }
                    if (((Boolean) this.i.b(com.yandex.passport.internal.flags.q.p0)).booleanValue()) {
                        greatAgainPushSubscriptionManager$getToken$1.L$0 = this;
                        greatAgainPushSubscriptionManager$getToken$1.L$1 = pushPlatform;
                        greatAgainPushSubscriptionManager$getToken$1.label = 1;
                        obj2 = ((com.yandex.passport.internal.provider.communication.k) this.j).a(pushPlatform, greatAgainPushSubscriptionManager$getToken$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    com.yandex.passport.internal.properties.p pVar = this.a;
                    pVar.getClass();
                    it = pVar.m.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((com.yandex.passport.api.i0) obj).a() == pushPlatform) {
                            break;
                        }
                    }
                    i0Var = (com.yandex.passport.api.i0) obj;
                    if (i0Var == null) {
                        return null;
                    }
                    try {
                        str2 = i0Var.getToken();
                    } catch (Exception e) {
                        com.yandex.passport.internal.report.reporters.s0 s0Var = this.g;
                        PushPlatform a = i0Var.a();
                        s0Var.getClass();
                        s0Var.f(s9.w, new md(a), new yd(e), new ld(e));
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error receive token for " + i0Var.a(), e);
                        }
                    }
                    String e2 = com.yandex.passport.common.util.a.e(str2);
                    if (e2 != null) {
                        this.m.put(pushPlatform, e2);
                    }
                    return e2;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pushPlatform = (PushPlatform) greatAgainPushSubscriptionManager$getToken$1.L$1;
                this = (c) greatAgainPushSubscriptionManager$getToken$1.L$0;
                kotlin.b.b(obj2);
                str = (String) obj2;
                if (str != null) {
                    this.m.put(pushPlatform, str);
                    return str;
                }
                com.yandex.passport.internal.properties.p pVar2 = this.a;
                pVar2.getClass();
                it = pVar2.m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                i0Var = (com.yandex.passport.api.i0) obj;
                if (i0Var == null) {
                }
            }
        }
        greatAgainPushSubscriptionManager$getToken$1 = new GreatAgainPushSubscriptionManager$getToken$1(this, continuationImpl);
        Object obj22 = greatAgainPushSubscriptionManager$getToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = greatAgainPushSubscriptionManager$getToken$1.label;
        String str22 = null;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str != null) {
        }
        com.yandex.passport.internal.properties.p pVar22 = this.a;
        pVar22.getClass();
        it = pVar22.m.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        i0Var = (com.yandex.passport.api.i0) obj;
        if (i0Var == null) {
        }
    }

    public final String c(String str) {
        try {
            com.yandex.passport.internal.properties.p pVar = this.a;
            pVar.getClass();
            List list = pVar.m;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ru.yandex.taxi.am.n0) {
                    arrayList.add(obj);
                }
            }
            ru.yandex.taxi.am.n0 n0Var = (ru.yandex.taxi.am.n0) kotlin.collections.a.R(arrayList);
            if (n0Var != null) {
                return n0Var.b(str);
            }
        } catch (IOException e) {
            PushPlatform pushPlatform = PushPlatform.FCM;
            com.yandex.passport.internal.report.reporters.s0 s0Var = this.g;
            s0Var.getClass();
            s0Var.f(s9.w, new md(pushPlatform), new yd(e), new ld(e));
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error receive gcm token", e);
            }
        }
        return null;
    }

    public final boolean d(ModernAccount modernAccount) {
        Uid uid = modernAccount.getUid();
        i0 i0Var = this.b;
        if (i0Var.d(uid)) {
            return true;
        }
        ClientCredentials r = this.a.r(modernAccount.getUid().getEnvironment());
        ClientToken clientToken = r != null ? this.h.getClientToken(modernAccount.getUid(), r.getDecryptedId()) : null;
        boolean z = (clientToken == null || com.yandex.passport.common.util.a.e(clientToken.getValue()) == null) ? false : true;
        if (z) {
            i0Var.a(modernAccount.getUid(), true);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0081 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, Set set, Set set2, ContinuationImpl continuationImpl) {
        GreatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1 greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1;
        int i;
        c cVar;
        Iterator it;
        if (continuationImpl instanceof GreatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1) {
            greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1 = (GreatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1) continuationImpl;
            int i2 = greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterator it2 = list.iterator();
                    cVar = this;
                    it = it2;
                    while (it.hasNext()) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$3;
                Set set3 = (Set) greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$2;
                set = (Set) greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$1;
                c cVar2 = (c) greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$0;
                kotlin.b.b(obj);
                c cVar3 = cVar2;
                set2 = set3;
                cVar = cVar3;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Uid uid = (Uid) pair.c();
                    PushPlatform pushPlatform = (PushPlatform) pair.f();
                    if (!set.contains(uid) || !set2.contains(pushPlatform)) {
                        i0 i0Var = cVar.b;
                        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$0 = cVar;
                        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$1 = set;
                        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$2 = set2;
                        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.L$3 = it;
                        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.label = 1;
                        if (i0Var.g(pushPlatform, uid, greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Set set4 = set2;
                        cVar2 = cVar;
                        set3 = set4;
                        c cVar32 = cVar2;
                        set2 = set3;
                        cVar = cVar32;
                        while (it.hasNext()) {
                        }
                    }
                }
                return zy11.a;
            }
        }
        greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1 = new GreatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1(this, continuationImpl);
        Object obj2 = greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = greatAgainPushSubscriptionManager$launchRequiredUnsubscriptions$1.label;
        if (i != 0) {
        }
    }

    public final Object f(PushPlatform pushPlatform, String str, ContinuationImpl continuationImpl) {
        ConcurrentHashMap concurrentHashMap = this.m;
        com.yandex.passport.internal.report.reporters.s0 s0Var = this.g;
        if (str == null) {
            s0Var.getClass();
            s0Var.f(ca.w, new md(pushPlatform), new yd(false, 23));
            concurrentHashMap.remove(pushPlatform);
            Object h = h(pushPlatform, null, continuationImpl);
            if (h == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return h;
            }
        } else {
            s0Var.getClass();
            s0Var.f(ca.w, new md(pushPlatform), new yd(true, 23));
            concurrentHashMap.put(pushPlatform, str);
            Object j = j(pushPlatform, null, continuationImpl);
            if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return j;
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:10:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Uid uid, ContinuationImpl continuationImpl) {
        GreatAgainPushSubscriptionManager$unsubscribe$1 greatAgainPushSubscriptionManager$unsubscribe$1;
        int i;
        int i2;
        c cVar;
        int length;
        PushPlatform[] pushPlatformArr;
        Uid uid2;
        if (continuationImpl instanceof GreatAgainPushSubscriptionManager$unsubscribe$1) {
            greatAgainPushSubscriptionManager$unsubscribe$1 = (GreatAgainPushSubscriptionManager$unsubscribe$1) continuationImpl;
            int i3 = greatAgainPushSubscriptionManager$unsubscribe$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                greatAgainPushSubscriptionManager$unsubscribe$1.label = i3 - Integer.MIN_VALUE;
                Object obj = greatAgainPushSubscriptionManager$unsubscribe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = greatAgainPushSubscriptionManager$unsubscribe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PushPlatform[] values = PushPlatform.values();
                    i2 = 0;
                    cVar = this;
                    length = values.length;
                    pushPlatformArr = values;
                    uid2 = uid;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = greatAgainPushSubscriptionManager$unsubscribe$1.I$1;
                    int i4 = greatAgainPushSubscriptionManager$unsubscribe$1.I$0;
                    pushPlatformArr = (PushPlatform[]) greatAgainPushSubscriptionManager$unsubscribe$1.L$2;
                    Uid uid3 = (Uid) greatAgainPushSubscriptionManager$unsubscribe$1.L$1;
                    c cVar2 = (c) greatAgainPushSubscriptionManager$unsubscribe$1.L$0;
                    kotlin.b.b(obj);
                    uid2 = uid3;
                    i2 = i4 + 1;
                    cVar = cVar2;
                    if (i2 < length) {
                        PushPlatform pushPlatform = pushPlatformArr[i2];
                        i0 i0Var = cVar.b;
                        greatAgainPushSubscriptionManager$unsubscribe$1.L$0 = cVar;
                        greatAgainPushSubscriptionManager$unsubscribe$1.L$1 = uid2;
                        greatAgainPushSubscriptionManager$unsubscribe$1.L$2 = pushPlatformArr;
                        greatAgainPushSubscriptionManager$unsubscribe$1.I$0 = i2;
                        greatAgainPushSubscriptionManager$unsubscribe$1.I$1 = length;
                        greatAgainPushSubscriptionManager$unsubscribe$1.label = 1;
                        if (i0Var.g(pushPlatform, uid2, greatAgainPushSubscriptionManager$unsubscribe$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        cVar2 = cVar;
                        i4 = i2;
                        i2 = i4 + 1;
                        cVar = cVar2;
                        if (i2 < length) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        greatAgainPushSubscriptionManager$unsubscribe$1 = new GreatAgainPushSubscriptionManager$unsubscribe$1(this, continuationImpl);
        Object obj2 = greatAgainPushSubscriptionManager$unsubscribe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = greatAgainPushSubscriptionManager$unsubscribe$1.label;
        if (i != 0) {
        }
    }

    public final Object h(PushPlatform pushPlatform, Uid uid, ContinuationImpl continuationImpl) {
        if (((Boolean) this.i.b(com.yandex.passport.internal.flags.q.s)).booleanValue()) {
            Object j = j(pushPlatform, uid, continuationImpl);
            if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return j;
            }
        } else {
            Object i = i(pushPlatform != null, continuationImpl);
            if (i == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return i;
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0278 -> B:31:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0328 -> B:30:0x032a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(boolean z, ContinuationImpl continuationImpl) {
        GreatAgainPushSubscriptionManager$updateTokenOld$1 greatAgainPushSubscriptionManager$updateTokenOld$1;
        int i;
        Pair pair;
        Iterator it;
        Set set;
        Map map;
        boolean z2;
        Uid uid;
        long parseLong;
        Environment environment;
        c cVar;
        ModernAccount modernAccount;
        String str;
        int i2;
        Iterator it2;
        boolean z3;
        String str2;
        ModernAccount modernAccount2;
        Map map2;
        Set set2;
        i0 i0Var;
        PushPlatform pushPlatform;
        boolean z4;
        GreatAgainPushSubscriptionManager$updateTokenOld$1 greatAgainPushSubscriptionManager$updateTokenOld$12;
        c cVar2;
        boolean z5;
        int i3;
        c cVar3;
        Iterator it3;
        int i4;
        c cVar4 = this;
        if (continuationImpl instanceof GreatAgainPushSubscriptionManager$updateTokenOld$1) {
            greatAgainPushSubscriptionManager$updateTokenOld$1 = (GreatAgainPushSubscriptionManager$updateTokenOld$1) continuationImpl;
            int i5 = greatAgainPushSubscriptionManager$updateTokenOld$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                greatAgainPushSubscriptionManager$updateTokenOld$1.label = i5 - Integer.MIN_VALUE;
                Object obj = greatAgainPushSubscriptionManager$updateTokenOld$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = greatAgainPushSubscriptionManager$updateTokenOld$1.label;
                int i6 = 3;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.database.g gVar = cVar4.d;
                    gVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Cursor query = gVar.a.getReadableDatabase().query("gcm_subscriptions", com.yandex.passport.internal.database.tables.b.a, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("uid"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("gcm_token_hash"));
                            int D = evu0.D(string, ':', 0, false);
                            if (D >= 1 && D != string.length() - 1) {
                                String substring = string.substring(0, D);
                                try {
                                    parseLong = Long.parseLong(string.substring(D + 1));
                                } catch (NumberFormatException unused) {
                                }
                                if (parseLong > 0) {
                                    try {
                                        com.yandex.passport.common.core.a aVar = Environment.Companion;
                                        int parseInt = Integer.parseInt(substring);
                                        aVar.getClass();
                                        environment = com.yandex.passport.common.core.a.a(parseInt);
                                    } catch (Exception unused2) {
                                        environment = Environment.PRODUCTION;
                                    }
                                    uid = com.yandex.passport.internal.a0.b(environment, parseLong);
                                    if (uid == null) {
                                        arrayList.add(new j0(uid, string2));
                                    }
                                }
                            }
                            uid = null;
                            if (uid == null) {
                            }
                        } finally {
                        }
                    }
                    query.close();
                    if (cVar4.a()) {
                        ArrayList f = cVar4.c.a().f();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = f.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (cVar4.d((ModernAccount) next)) {
                                arrayList2.add(next);
                            } else {
                                arrayList3.add(next);
                            }
                        }
                        Pair pair2 = new Pair(arrayList2, arrayList3);
                        List list = (List) pair2.getFirst();
                        List list2 = (List) pair2.getSecond();
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((j0) it5.next()).b());
                        }
                        ArrayList arrayList5 = new ArrayList(tcc.n(f, 10));
                        Iterator it6 = f.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((ModernAccount) it6.next()).getUid());
                        }
                        List k0 = kotlin.collections.a.k0(arrayList4, kotlin.collections.a.N0(arrayList5));
                        List list3 = list2;
                        ArrayList arrayList6 = new ArrayList(tcc.n(list3, 10));
                        Iterator it7 = list3.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((ModernAccount) it7.next()).getUid());
                        }
                        pair = new Pair(list, kotlin.collections.a.N0(kotlin.collections.a.m0(k0, arrayList6)));
                    } else {
                        ArrayList arrayList7 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(((j0) it8.next()).b());
                        }
                        pair = new Pair(EmptyList.a, kotlin.collections.a.N0(arrayList7));
                    }
                    List list4 = (List) pair.getFirst();
                    Set set3 = (Set) pair.getSecond();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = list4.iterator();
                    set = set3;
                    map = linkedHashMap;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        i3 = greatAgainPushSubscriptionManager$updateTokenOld$1.I$0;
                        z5 = greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0;
                        str = (String) greatAgainPushSubscriptionManager$updateTokenOld$1.L$5;
                        modernAccount = (ModernAccount) greatAgainPushSubscriptionManager$updateTokenOld$1.L$4;
                        it = (Iterator) greatAgainPushSubscriptionManager$updateTokenOld$1.L$3;
                        map = (Map) greatAgainPushSubscriptionManager$updateTokenOld$1.L$2;
                        set = (Set) greatAgainPushSubscriptionManager$updateTokenOld$1.L$1;
                        cVar2 = (c) greatAgainPushSubscriptionManager$updateTokenOld$1.L$0;
                        kotlin.b.b(obj);
                        i2 = i3;
                        z3 = z5;
                        it2 = it;
                        cVar = cVar2;
                        str2 = str;
                        modernAccount2 = modernAccount;
                        map2 = map;
                        set2 = set;
                        com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        i0Var = cVar.b;
                        pushPlatform = PushPlatform.FCM;
                        if (i2 == 0) {
                        }
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$0 = cVar;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$1 = set2;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$2 = map2;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$3 = it2;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$4 = null;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.L$5 = null;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0 = z3;
                        greatAgainPushSubscriptionManager$updateTokenOld$1.label = 2;
                        greatAgainPushSubscriptionManager$updateTokenOld$12 = greatAgainPushSubscriptionManager$updateTokenOld$1;
                        if (i0Var.e(modernAccount2, pushPlatform, str2, z4, true, true, greatAgainPushSubscriptionManager$updateTokenOld$12) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it3 = (Iterator) greatAgainPushSubscriptionManager$updateTokenOld$1.L$1;
                        cVar3 = (c) greatAgainPushSubscriptionManager$updateTokenOld$1.L$0;
                        kotlin.b.b(obj);
                        while (it3.hasNext()) {
                            Uid uid2 = (Uid) it3.next();
                            com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                i4 = 8;
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateToken skipping subscribe for non-current account", 8);
                            } else {
                                i4 = 8;
                            }
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateToken unsubscribe for non-current account", i4);
                            }
                            i0 i0Var2 = cVar3.b;
                            PushPlatform pushPlatform2 = PushPlatform.FCM;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$0 = cVar3;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$1 = it3;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$2 = null;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$3 = null;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.label = 3;
                            if (i0Var2.g(pushPlatform2, uid2, greatAgainPushSubscriptionManager$updateTokenOld$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    z3 = greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0;
                    it2 = (Iterator) greatAgainPushSubscriptionManager$updateTokenOld$1.L$3;
                    map2 = (Map) greatAgainPushSubscriptionManager$updateTokenOld$1.L$2;
                    set2 = (Set) greatAgainPushSubscriptionManager$updateTokenOld$1.L$1;
                    cVar = (c) greatAgainPushSubscriptionManager$updateTokenOld$1.L$0;
                    kotlin.b.b(obj);
                    z2 = z3;
                    map = map2;
                    set = set2;
                    cVar4 = cVar;
                    it = it2;
                    i6 = 3;
                    if (it.hasNext()) {
                        modernAccount = (ModernAccount) it.next();
                        Environment environment2 = modernAccount.getUid().getEnvironment();
                        Object obj2 = map.get(environment2);
                        Object obj3 = obj2;
                        if (obj2 == null) {
                            Environment environment3 = modernAccount.getUid().getEnvironment();
                            cVar4.getClass();
                            int i7 = b.a[environment3.ordinal()];
                            String c = i7 == 1 ? cVar4.c("1087931301371") : i7 == 2 ? cVar4.c("410800666107") : i7 == i6 ? cVar4.c("1087931301371") : i7 == 4 ? cVar4.c("1087931301371") : i7 != 5 ? null : cVar4.c("410800666107");
                            map.put(environment2, c);
                            obj3 = c;
                        }
                        str = (String) obj3;
                        if (str != null) {
                            j0 a = cVar4.d.a(modernAccount.getUid());
                            String a2 = a != null ? a.a() : null;
                            cVar4.e.getClass();
                            boolean l = jl40.l(a2, com.yandex.passport.internal.util.j.a(str));
                            i2 = !l ? 1 : 0;
                            if (l || a2 == null) {
                                it2 = it;
                                cVar = cVar4;
                                z3 = z2;
                                str2 = str;
                                modernAccount2 = modernAccount;
                                map2 = map;
                                set2 = set;
                                com.yandex.passport.common.logger.c cVar52 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateToken subscribe", 8);
                                }
                                i0Var = cVar.b;
                                pushPlatform = PushPlatform.FCM;
                                z4 = i2 == 0 || z3;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$0 = cVar;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$1 = set2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$2 = map2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$3 = it2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$4 = null;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$5 = null;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0 = z3;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.label = 2;
                                greatAgainPushSubscriptionManager$updateTokenOld$12 = greatAgainPushSubscriptionManager$updateTokenOld$1;
                                if (i0Var.e(modernAccount2, pushPlatform, str2, z4, true, true, greatAgainPushSubscriptionManager$updateTokenOld$12) != coroutineSingletons) {
                                    greatAgainPushSubscriptionManager$updateTokenOld$1 = greatAgainPushSubscriptionManager$updateTokenOld$12;
                                    z2 = z3;
                                    map = map2;
                                    set = set2;
                                    cVar4 = cVar;
                                    it = it2;
                                }
                                return coroutineSingletons;
                            }
                            com.yandex.passport.common.logger.c cVar7 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateToken unsubscribe previous token", 8);
                            }
                            i0 i0Var3 = cVar4.b;
                            Uid uid3 = modernAccount.getUid();
                            PushPlatform pushPlatform3 = PushPlatform.FCM;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$0 = cVar4;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$1 = set;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$2 = map;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$3 = it;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$4 = modernAccount;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.L$5 = str;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0 = z2;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.I$0 = i2;
                            greatAgainPushSubscriptionManager$updateTokenOld$1.label = 1;
                            if (i0Var3.g(pushPlatform3, uid3, greatAgainPushSubscriptionManager$updateTokenOld$1) != coroutineSingletons) {
                                cVar2 = cVar4;
                                z5 = z2;
                                i3 = i2;
                                i2 = i3;
                                z3 = z5;
                                it2 = it;
                                cVar = cVar2;
                                str2 = str;
                                modernAccount2 = modernAccount;
                                map2 = map;
                                set2 = set;
                                com.yandex.passport.common.logger.c cVar522 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                                i0Var = cVar.b;
                                pushPlatform = PushPlatform.FCM;
                                if (i2 == 0) {
                                }
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$0 = cVar;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$1 = set2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$2 = map2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$3 = it2;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$4 = null;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.L$5 = null;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.Z$0 = z3;
                                greatAgainPushSubscriptionManager$updateTokenOld$1.label = 2;
                                greatAgainPushSubscriptionManager$updateTokenOld$12 = greatAgainPushSubscriptionManager$updateTokenOld$1;
                                if (i0Var.e(modernAccount2, pushPlatform, str2, z4, true, true, greatAgainPushSubscriptionManager$updateTokenOld$12) != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        i6 = 3;
                        if (it.hasNext()) {
                            cVar3 = cVar4;
                            it3 = set.iterator();
                            while (it3.hasNext()) {
                            }
                            return zy11.a;
                        }
                    }
                }
            }
        }
        greatAgainPushSubscriptionManager$updateTokenOld$1 = new GreatAgainPushSubscriptionManager$updateTokenOld$1(cVar4, continuationImpl);
        Object obj4 = greatAgainPushSubscriptionManager$updateTokenOld$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = greatAgainPushSubscriptionManager$updateTokenOld$1.label;
        int i62 = 3;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x034f, code lost:
    
        if (r0.e(r9, r1, r7, r4) != r5) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0321 A[LOOP:0: B:42:0x031b->B:44:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x02d5 -> B:18:0x02e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x02ed -> B:19:0x0302). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x023d -> B:20:0x024e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(PushPlatform pushPlatform, Uid uid, ContinuationImpl continuationImpl) {
        GreatAgainPushSubscriptionManager$updateTokenPushMe$1 greatAgainPushSubscriptionManager$updateTokenPushMe$1;
        int i;
        boolean a;
        Set h;
        Object obj;
        ArrayList arrayList;
        Iterator it;
        Uid uid2;
        Pair pair;
        long parseLong;
        Environment environment;
        Object obj2;
        Iterator it2;
        Object obj3;
        Iterator it3;
        Set set;
        ArrayList arrayList2;
        PushPlatform pushPlatform2;
        c cVar;
        Uid uid3;
        ModernAccount modernAccount;
        Iterator it4;
        Object obj4;
        PushPlatform pushPlatform3;
        boolean z;
        boolean z2;
        String str;
        c cVar2 = this;
        PushPlatform pushPlatform4 = pushPlatform;
        Uid uid4 = uid;
        if (continuationImpl instanceof GreatAgainPushSubscriptionManager$updateTokenPushMe$1) {
            greatAgainPushSubscriptionManager$updateTokenPushMe$1 = (GreatAgainPushSubscriptionManager$updateTokenPushMe$1) continuationImpl;
            int i2 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                greatAgainPushSubscriptionManager$updateTokenPushMe$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = greatAgainPushSubscriptionManager$updateTokenPushMe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj5);
                    a = cVar2.a();
                    com.yandex.passport.internal.core.accounts.d dVar = cVar2.c;
                    Iterable f = dVar.a().f();
                    if (a || ((Boolean) cVar2.i.b(com.yandex.passport.internal.flags.q.m0)).booleanValue()) {
                        if (uid4 != null) {
                            f = scc.h(dVar.a().e(uid4));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj6 : f) {
                            if (!((ModernAccount) obj6).getMasterToken().isDropped()) {
                                arrayList3.add(obj6);
                            }
                        }
                        if (pushPlatform4 != null) {
                            h = Collections.singleton(pushPlatform4);
                            obj = arrayList3;
                        } else {
                            com.yandex.passport.internal.properties.p pVar = cVar2.a;
                            pVar.getClass();
                            List list = pVar.m;
                            ArrayList arrayList4 = new ArrayList(tcc.n(list, 10));
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(((com.yandex.passport.api.i0) it5.next()).a());
                            }
                            h = v4r0.h(kotlin.collections.a.N0(arrayList4), kotlin.collections.a.N0(cVar2.l.a));
                            obj = arrayList3;
                        }
                    } else {
                        Object obj7 = EmptyList.a;
                        h = EmptySet.a;
                        obj = obj7;
                    }
                    Set<String> keySet = cVar2.b.d.a().a.keySet();
                    ArrayList arrayList5 = new ArrayList();
                    for (String str2 : keySet) {
                        m0.f.getClass();
                        PushPlatform pushPlatform5 = PushPlatform.HMS;
                        if (!cvu0.s(str2, com.yandex.passport.common.permission.b.c(pushPlatform5), false)) {
                            pushPlatform5 = PushPlatform.RuStore;
                            if (!cvu0.s(str2, com.yandex.passport.common.permission.b.c(pushPlatform5), false)) {
                                pushPlatform5 = PushPlatform.FCM;
                            }
                        }
                        String S = evu0.S(com.yandex.passport.common.permission.b.c(pushPlatform5), str2);
                        int D = evu0.D(S, ':', 0, false);
                        if (D >= 1 && D != S.length() - 1) {
                            String substring = S.substring(0, D);
                            try {
                                parseLong = Long.parseLong(S.substring(D + 1));
                            } catch (NumberFormatException unused) {
                            }
                            if (parseLong > 0) {
                                try {
                                    com.yandex.passport.common.core.a aVar = Environment.Companion;
                                    int parseInt = Integer.parseInt(substring);
                                    aVar.getClass();
                                    environment = com.yandex.passport.common.core.a.a(parseInt);
                                } catch (Exception unused2) {
                                    environment = Environment.PRODUCTION;
                                }
                                uid2 = com.yandex.passport.internal.a0.b(environment, parseLong);
                                pair = uid2 == null ? new Pair(uid2, pushPlatform5) : null;
                                if (pair == null) {
                                    arrayList5.add(pair);
                                }
                            }
                        }
                        uid2 = null;
                        if (uid2 == null) {
                        }
                        if (pair == null) {
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Pair pair2 = (Pair) next;
                        if (uid4 == null || jl40.l(pair2.c(), uid4)) {
                            if (pushPlatform4 == null || pair2.f() == pushPlatform4) {
                                arrayList.add(next);
                            }
                        }
                    }
                    boolean isEmpty = ((Collection) obj).isEmpty();
                    obj2 = obj;
                    if (!isEmpty) {
                        obj2 = obj;
                        if (!h.isEmpty()) {
                            it = ((Iterable) obj).iterator();
                            obj3 = obj;
                            obj2 = obj3;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    ArrayList arrayList6 = (Iterable) obj2;
                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                    it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList7);
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$9 = null;
                    greatAgainPushSubscriptionManager$updateTokenPushMe$1.label = 3;
                } else if (i == 1) {
                    z2 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$1;
                    z = greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$0;
                    pushPlatform3 = (PushPlatform) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$9;
                    Iterator it7 = (Iterator) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8;
                    modernAccount = (ModernAccount) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7;
                    Iterator it8 = (Iterator) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6;
                    ?? r11 = (List) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5;
                    Set set2 = (Set) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4;
                    Object obj8 = (List) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3;
                    Uid uid5 = (Uid) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2;
                    PushPlatform pushPlatform6 = (PushPlatform) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1;
                    c cVar3 = (c) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0;
                    kotlin.b.b(obj5);
                    it3 = it7;
                    obj4 = obj8;
                    cVar = cVar3;
                    it4 = it8;
                    uid3 = uid5;
                    arrayList2 = r11;
                    set = set2;
                    pushPlatform2 = pushPlatform6;
                    str = (String) obj5;
                    if (pushPlatform2 != pushPlatform3) {
                    }
                    if (str == null) {
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj5);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$1;
                    boolean z4 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$0;
                    Iterator it9 = (Iterator) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8;
                    ModernAccount modernAccount2 = (ModernAccount) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7;
                    Iterator it10 = (Iterator) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6;
                    ?? r14 = (List) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5;
                    set = (Set) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4;
                    Object obj9 = (List) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3;
                    uid3 = (Uid) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2;
                    pushPlatform2 = (PushPlatform) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1;
                    cVar = (c) greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0;
                    kotlin.b.b(obj5);
                    ArrayList arrayList8 = r14;
                    Iterator it11 = it10;
                    it3 = it9;
                    uid4 = uid3;
                    it = it11;
                    a = z4;
                    pushPlatform4 = pushPlatform2;
                    boolean d = z3;
                    cVar2 = cVar;
                    ModernAccount modernAccount3 = modernAccount2;
                    Object obj10 = obj9;
                    h = set;
                    arrayList = arrayList8;
                    Object obj11 = obj10;
                    if (!it3.hasNext()) {
                        PushPlatform pushPlatform7 = (PushPlatform) it3.next();
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0 = cVar2;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1 = pushPlatform4;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2 = uid4;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3 = obj11;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4 = h;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5 = arrayList;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6 = it;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7 = modernAccount3;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8 = it3;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$9 = pushPlatform7;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$0 = a;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$1 = d;
                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.label = 1;
                        Object b = cVar2.b(pushPlatform7, greatAgainPushSubscriptionManager$updateTokenPushMe$1);
                        if (b != coroutineSingletons) {
                            ModernAccount modernAccount4 = modernAccount3;
                            cVar = cVar2;
                            z2 = d;
                            pushPlatform2 = pushPlatform4;
                            z = a;
                            obj5 = b;
                            set = h;
                            it4 = it;
                            uid3 = uid4;
                            pushPlatform3 = pushPlatform7;
                            arrayList2 = arrayList;
                            modernAccount = modernAccount4;
                            obj4 = obj11;
                            str = (String) obj5;
                            boolean z5 = pushPlatform2 != pushPlatform3 || jl40.l(modernAccount.getUid(), uid3);
                            if (str == null) {
                                i0 i0Var = cVar.b;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0 = cVar;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1 = pushPlatform2;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2 = uid3;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3 = obj4;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4 = set;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5 = arrayList2;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6 = it4;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7 = modernAccount;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8 = it3;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$9 = null;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$0 = z;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.Z$1 = z2;
                                greatAgainPushSubscriptionManager$updateTokenPushMe$1.label = 2;
                                boolean z6 = z2;
                                boolean z7 = z;
                                GreatAgainPushSubscriptionManager$updateTokenPushMe$1 greatAgainPushSubscriptionManager$updateTokenPushMe$12 = greatAgainPushSubscriptionManager$updateTokenPushMe$1;
                                ModernAccount modernAccount5 = modernAccount;
                                if (i0Var.e(modernAccount5, pushPlatform3, str, z5, z7, z6, greatAgainPushSubscriptionManager$updateTokenPushMe$12) != coroutineSingletons) {
                                    obj9 = obj4;
                                    it9 = it3;
                                    modernAccount2 = modernAccount5;
                                    z4 = z7;
                                    z3 = z6;
                                    greatAgainPushSubscriptionManager$updateTokenPushMe$1 = greatAgainPushSubscriptionManager$updateTokenPushMe$12;
                                    it10 = it4;
                                    arrayList8 = arrayList2;
                                    Iterator it112 = it10;
                                    it3 = it9;
                                    uid4 = uid3;
                                    it = it112;
                                    a = z4;
                                    pushPlatform4 = pushPlatform2;
                                    boolean d2 = z3;
                                    cVar2 = cVar;
                                    ModernAccount modernAccount32 = modernAccount2;
                                    Object obj102 = obj9;
                                    h = set;
                                    arrayList = arrayList8;
                                    Object obj112 = obj102;
                                    if (!it3.hasNext()) {
                                        obj3 = obj112;
                                        obj2 = obj3;
                                        if (it.hasNext()) {
                                            modernAccount32 = (ModernAccount) it.next();
                                            d2 = cVar2.d(modernAccount32);
                                            it3 = h.iterator();
                                            obj112 = obj3;
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        ArrayList arrayList62 = (Iterable) obj2;
                                        ArrayList arrayList72 = new ArrayList(tcc.n(arrayList62, 10));
                                        it2 = arrayList62.iterator();
                                        while (it2.hasNext()) {
                                            arrayList72.add(((ModernAccount) it2.next()).getUid());
                                        }
                                        Set N02 = kotlin.collections.a.N0(arrayList72);
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$0 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$1 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$2 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$3 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$4 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$5 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$6 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$7 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$8 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.L$9 = null;
                                        greatAgainPushSubscriptionManager$updateTokenPushMe$1.label = 3;
                                    }
                                }
                            } else {
                                boolean z8 = z2;
                                boolean z9 = z;
                                uid4 = uid3;
                                cVar2 = cVar;
                                pushPlatform4 = pushPlatform2;
                                modernAccount32 = modernAccount;
                                a = z9;
                                d2 = z8;
                                it = it4;
                                arrayList = arrayList2;
                                h = set;
                                obj102 = obj4;
                                Object obj1122 = obj102;
                                if (!it3.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        greatAgainPushSubscriptionManager$updateTokenPushMe$1 = new GreatAgainPushSubscriptionManager$updateTokenPushMe$1(cVar2, continuationImpl);
        Object obj52 = greatAgainPushSubscriptionManager$updateTokenPushMe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = greatAgainPushSubscriptionManager$updateTokenPushMe$1.label;
        if (i != 0) {
        }
    }
}
