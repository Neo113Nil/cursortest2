package com.yandex.messaging.domain;

import android.content.SharedPreferences;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.g6u;
import defpackage.kse;
import defpackage.lqo;
import defpackage.me60;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.rz10;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.uft;
import defpackage.w5t;
import defpackage.zy11;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class h extends k {
    public final com.yandex.messaging.internal.authorized.j b;
    public final rz10 c;
    public final MessengerEnvironment d;
    public final lqo e;
    public final SharedPreferences f;
    public final kse g;
    public final w5t h;
    public final HashMap i;
    public final HashMap j;

    public h(com.yandex.messaging.internal.authorized.j jVar, rz10 rz10Var, MessengerEnvironment messengerEnvironment, lqo lqoVar, SharedPreferences sharedPreferences, kse kseVar, w5t w5tVar) {
        super(kseVar.b);
        this.b = jVar;
        this.c = rz10Var;
        this.d = messengerEnvironment;
        this.e = lqoVar;
        this.f = sharedPreferences;
        this.g = kseVar;
        this.h = w5tVar;
        this.i = new HashMap();
        this.j = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r11.f.getBoolean("enable_users_suggest", true) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Serializable, java.lang.String[]] */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(GetUserSuggestUseCase$Source getUserSuggestUseCase$Source, ContinuationImpl continuationImpl) {
        GetUserSuggestUseCase$run$1 getUserSuggestUseCase$run$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        uft uftVar;
        ?? r2;
        Object k0;
        h hVar;
        uft uftVar2;
        String[] strArr;
        if (continuationImpl instanceof GetUserSuggestUseCase$run$1) {
            getUserSuggestUseCase$run$1 = (GetUserSuggestUseCase$run$1) continuationImpl;
            int i2 = getUserSuggestUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserSuggestUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserSuggestUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserSuggestUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (getUserSuggestUseCase$Source != GetUserSuggestUseCase$Source.Search) {
                        if (!this.e.a(tz10.j)) {
                            if (!(this.c.c != null)) {
                                if (((Boolean) this.d.c(new me60())).booleanValue()) {
                                }
                            }
                        }
                        return new String[0];
                    }
                    tpr a = this.h.a(zy11.a);
                    getUserSuggestUseCase$run$1.L$0 = this;
                    getUserSuggestUseCase$run$1.L$1 = getUserSuggestUseCase$Source;
                    getUserSuggestUseCase$run$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(a, getUserSuggestUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uftVar2 = (uft) getUserSuggestUseCase$run$1.L$1;
                        hVar = (h) getUserSuggestUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        strArr = (String[]) ((oyj0) obj).b();
                        ?? r13 = strArr;
                        if (strArr == null) {
                            r13 = new String[0];
                        }
                        hVar.i.put(uftVar2, r13);
                        hVar.j.put(uftVar2, new Long(System.currentTimeMillis()));
                        return r13;
                    }
                    getUserSuggestUseCase$Source = (GetUserSuggestUseCase$Source) getUserSuggestUseCase$run$1.L$1;
                    this = (h) getUserSuggestUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                uftVar = new uft(((Number) obj).longValue(), getUserSuggestUseCase$Source);
                Long l = (Long) this.j.get(uftVar);
                long longValue = l == null ? l.longValue() : 0L;
                r2 = (String[]) this.i.get(uftVar);
                if (r2 == 0 && r2.length != 0 && System.currentTimeMillis() - longValue < 180000) {
                    return r2;
                }
                g6u g6uVar = this.g.e;
                GetUserSuggestUseCase$run$result$1 getUserSuggestUseCase$run$result$1 = new GetUserSuggestUseCase$run$result$1(this, getUserSuggestUseCase$Source, null);
                getUserSuggestUseCase$run$1.L$0 = this;
                getUserSuggestUseCase$run$1.L$1 = uftVar;
                getUserSuggestUseCase$run$1.label = 2;
                k0 = tje.k0(g6uVar, getUserSuggestUseCase$run$result$1, getUserSuggestUseCase$run$1);
                if (k0 != coroutineSingletons) {
                    hVar = this;
                    uftVar2 = uftVar;
                    obj = k0;
                    strArr = (String[]) ((oyj0) obj).b();
                    ?? r132 = strArr;
                    if (strArr == null) {
                    }
                    hVar.i.put(uftVar2, r132);
                    hVar.j.put(uftVar2, new Long(System.currentTimeMillis()));
                    return r132;
                }
                return coroutineSingletons;
            }
        }
        getUserSuggestUseCase$run$1 = new GetUserSuggestUseCase$run$1(this, continuationImpl);
        Object obj2 = getUserSuggestUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserSuggestUseCase$run$1.label;
        if (i != 0) {
        }
        uftVar = new uft(((Number) obj2).longValue(), getUserSuggestUseCase$Source);
        Long l2 = (Long) this.j.get(uftVar);
        if (l2 == null) {
        }
        r2 = (String[]) this.i.get(uftVar);
        if (r2 == 0) {
        }
        g6u g6uVar2 = this.g.e;
        GetUserSuggestUseCase$run$result$1 getUserSuggestUseCase$run$result$12 = new GetUserSuggestUseCase$run$result$1(this, getUserSuggestUseCase$Source, null);
        getUserSuggestUseCase$run$1.L$0 = this;
        getUserSuggestUseCase$run$1.L$1 = uftVar;
        getUserSuggestUseCase$run$1.label = 2;
        k0 = tje.k0(g6uVar2, getUserSuggestUseCase$run$result$12, getUserSuggestUseCase$run$1);
        if (k0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
