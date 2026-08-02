package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import defpackage.bvf0;
import defpackage.e3n;
import defpackage.e7z0;
import defpackage.fse;
import defpackage.gzq0;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o5f0;
import defpackage.p2f;
import defpackage.pzq0;
import defpackage.q1r;
import defpackage.q5f0;
import defpackage.tje;
import defpackage.tpg;
import defpackage.u1r0;
import defpackage.w511;
import defpackage.w5z0;
import defpackage.wpr0;
import defpackage.wyq0;
import defpackage.xpr0;
import defpackage.zy11;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public final class d implements wpr0 {
    public final com.google.firebase.sessions.settings.b a;
    public final pzq0 b;
    public final c c;
    public final e7z0 d;
    public final tpg e;
    public final q5f0 f;
    public final fse g;
    public wyq0 h;
    public boolean i;
    public String j;

    public d(com.google.firebase.sessions.settings.b bVar, pzq0 pzq0Var, c cVar, e7z0 e7z0Var, tpg tpgVar, q5f0 q5f0Var, fse fseVar) {
        this.a = bVar;
        this.b = pzq0Var;
        this.c = cVar;
        this.d = e7z0Var;
        this.e = tpgVar;
        this.f = q5f0Var;
        this.g = fseVar;
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = SharedSessionRepositoryImpl$NotificationType.GENERAL;
        this.j = "";
        tje.N(bvf0.a(fseVar), null, null, new SharedSessionRepositoryImpl$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType, Continuation continuation) {
        SharedSessionRepositoryImpl$notifySubscribers$1 sharedSessionRepositoryImpl$notifySubscribers$1;
        int i;
        dVar.getClass();
        if (continuation instanceof SharedSessionRepositoryImpl$notifySubscribers$1) {
            sharedSessionRepositoryImpl$notifySubscribers$1 = (SharedSessionRepositoryImpl$notifySubscribers$1) continuation;
            int i2 = sharedSessionRepositoryImpl$notifySubscribers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedSessionRepositoryImpl$notifySubscribers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedSessionRepositoryImpl$notifySubscribers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedSessionRepositoryImpl$notifySubscribers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(dVar.j, str)) {
                        return zy11.a;
                    }
                    dVar.j = str;
                    com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
                    sharedSessionRepositoryImpl$notifySubscribers$1.L$0 = str;
                    sharedSessionRepositoryImpl$notifySubscribers$1.L$1 = sharedSessionRepositoryImpl$NotificationType;
                    sharedSessionRepositoryImpl$notifySubscribers$1.label = 1;
                    obj = aVar.b(sharedSessionRepositoryImpl$notifySubscribers$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharedSessionRepositoryImpl$NotificationType = (SharedSessionRepositoryImpl$NotificationType) sharedSessionRepositoryImpl$notifySubscribers$1.L$1;
                    str = (String) sharedSessionRepositoryImpl$notifySubscribers$1.L$0;
                    kotlin.b.b(obj);
                }
                for (p2f p2fVar : ((Map) obj).values()) {
                    u1r0 u1r0Var = new u1r0(str);
                    p2fVar.getClass();
                    Objects.toString(u1r0Var);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    jb7 jb7Var = p2fVar.b;
                    synchronized (jb7Var) {
                        if (!Objects.equals((String) jb7Var.w, str)) {
                            q1r q1rVar = (q1r) jb7Var.b;
                            String str2 = (String) jb7Var.c;
                            if (str2 != null) {
                                try {
                                    q1rVar.c(str2, "aqs.".concat(str)).createNewFile();
                                } catch (IOException unused) {
                                }
                            }
                            jb7Var.w = str;
                        }
                    }
                    int i3 = xpr0.a[sharedSessionRepositoryImpl$NotificationType.ordinal()];
                    if (i3 == 1) {
                        Objects.toString(SessionSubscriber$Name.CRASHLYTICS);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        Objects.toString(SessionSubscriber$Name.CRASHLYTICS);
                    }
                }
                return zy11.a;
            }
        }
        sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(dVar, continuation);
        Object obj2 = sharedSessionRepositoryImpl$notifySubscribers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedSessionRepositoryImpl$notifySubscribers$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return zy11.a;
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            return;
        }
        this.f.a();
        tje.N(bvf0.a(this.g), null, null, new SharedSessionRepositoryImpl$appBackground$1(this, null), 3);
    }

    public final boolean c(wyq0 wyq0Var) {
        Map map = wyq0Var.c;
        boolean z = true;
        q5f0 q5f0Var = this.f;
        if (map == null) {
            q5f0Var.a();
            return true;
        }
        o5f0 o5f0Var = (o5f0) map.get(q5f0Var.a());
        if (o5f0Var != null && o5f0Var.a == q5f0Var.c && jl40.l(o5f0Var.b, (String) q5f0Var.d.getValue())) {
            z = false;
        }
        if (z) {
            q5f0Var.a();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (defpackage.e3n.i(r4) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (defpackage.e3n.i(r4) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(wyq0 wyq0Var) {
        long U;
        w5z0 w5z0Var = wyq0Var.b;
        gzq0 gzq0Var = wyq0Var.a;
        if (w5z0Var == null) {
            String str = gzq0Var.a;
            return false;
        }
        this.d.getClass();
        w5z0 a = e7z0.a();
        o430 o430Var = e3n.b;
        long V = kp50.V(a.a - w5z0Var.a, DurationUnit.MILLISECONDS);
        com.google.firebase.sessions.settings.b bVar = this.a;
        e3n d = bVar.a.d();
        if (d != null) {
            U = d.a;
            if (e3n.j(U)) {
            }
        }
        e3n d2 = bVar.b.d();
        if (d2 != null) {
            U = d2.a;
            if (e3n.j(U)) {
            }
        }
        U = kp50.U(30, DurationUnit.MINUTES);
        boolean z = e3n.c(V, U) > 0;
        if (z) {
            String str2 = gzq0Var.a;
        }
        return z;
    }
}
