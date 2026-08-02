package com.yandex.go.taxi.order.chat.domain;

import com.yandex.go.taxi.order.chat.data.TaxiOrderChatApi;
import com.yandex.go.taxi.order.chat.data.db.b;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.dl01;
import defpackage.dne0;
import defpackage.j5z;
import defpackage.jse;
import defpackage.jtq0;
import defpackage.lzu0;
import defpackage.ny61;
import defpackage.s350;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yu0;
import defpackage.z221;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.launch.c;

/* loaded from: classes14.dex */
public final class a {
    public final tse a;
    public final c b;
    public final jtq0 c;
    public final TaxiOrderChatApi d;
    public final dne0 e;
    public final com.yandex.go.taxi.order.chat.data.db.a f;
    public final b g;
    public final j5z h;
    public final com.yandex.go.messenger_native.repositories.c i;
    public final s350 j;
    public final com.yandex.go.taxi.order.chat.experiments.b k;
    public final z221 l;
    public final a3y0 m = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "TaxiOrderChatMessagesRepository");
    public final jse n;
    public final jse o;
    public final HashMap p;

    public a(tse tseVar, c cVar, jtq0 jtq0Var, TaxiOrderChatApi taxiOrderChatApi, dne0 dne0Var, com.yandex.go.taxi.order.chat.data.db.a aVar, b bVar, j5z j5zVar, com.yandex.go.messenger_native.repositories.c cVar2, s350 s350Var, com.yandex.go.taxi.order.chat.experiments.b bVar2, z221 z221Var, tt2 tt2Var) {
        this.a = tseVar;
        this.b = cVar;
        this.c = jtq0Var;
        this.d = taxiOrderChatApi;
        this.e = dne0Var;
        this.f = aVar;
        this.g = bVar;
        this.h = j5zVar;
        this.i = cVar2;
        this.j = s350Var;
        this.k = bVar2;
        this.l = z221Var;
        tt2Var.getClass();
        jse P = uyj.a.P(1);
        this.n = P;
        this.o = P;
        this.p = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        TaxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1 taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1;
        Object obj;
        int i;
        String str3;
        String str4;
        if (continuationImpl instanceof TaxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1) {
            taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1 = (TaxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1) continuationImpl;
            int i2 = taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label = i2 - Integer.MIN_VALUE;
                obj = taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str2 != null && str2.length() != 0) {
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$0 = str;
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$1 = str2;
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label = 1;
                        obj = this.k.a(taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1);
                    }
                    if (str2 != null && str2.length() != 0) {
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$0 = str;
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$1 = str2;
                        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label = 2;
                        obj = this.j.a.a.b(taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1);
                        if (obj != coroutineSingletons) {
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    com.yandex.go.taxi.order.chat.data.b c = c(str);
                    return c.c(c.m);
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$1;
                    str3 = (String) taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$0;
                    kotlin.b.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return this.i.a(str4);
                    }
                    str = str3;
                    com.yandex.go.taxi.order.chat.data.b c2 = c(str);
                    return c2.c(c2.m);
                }
                String str6 = (String) taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$1;
                String str7 = (String) taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$0;
                kotlin.b.b(obj);
                str2 = str6;
                str = str7;
                if (((Boolean) obj).booleanValue()) {
                    z221 z221Var = this.l;
                    return ((ru.yandex.taxi.messenger.unreadcount.a) z221Var.e.computeIfAbsent(str2, new yu0(26, new dl01(18, z221Var, str2)))).b;
                }
                if (str2 != null) {
                    taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$0 = str;
                    taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.L$1 = str2;
                    taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label = 2;
                    obj = this.j.a.a.b(taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                com.yandex.go.taxi.order.chat.data.b c22 = c(str);
                return c22.c(c22.m);
            }
        }
        taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1 = new TaxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1(this, continuationImpl);
        obj = taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderChatMessagesRepositoryImpl$observeUnreadMessagesCount$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        if (str2 != null) {
        }
        com.yandex.go.taxi.order.chat.data.b c222 = c(str);
        return c222.c(c222.m);
    }

    public final void b(Runnable runnable) {
        com.yandex.go.coroutines.b.g(this.a, this.o, null, new TaxiOrderChatMessagesRepositoryImpl$postAction$1(runnable, this, null), 2);
    }

    public final synchronized com.yandex.go.taxi.order.chat.data.b c(String str) {
        return (com.yandex.go.taxi.order.chat.data.b) this.p.computeIfAbsent(str, new yu0(24, new lzu0(24, this, str)));
    }
}
