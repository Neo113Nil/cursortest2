package com.yandex.passport.internal.push;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.network.ua;
import com.yandex.passport.data.network.wa;
import com.yandex.passport.data.network.xa;
import com.yandex.passport.data.network.za;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.ba;
import com.yandex.passport.internal.report.da;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.report.td;
import com.yandex.passport.internal.report.yd;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class i0 {
    public final wa a;
    public final za b;
    public final com.yandex.passport.internal.database.g c;
    public final m0 d;
    public final com.yandex.passport.internal.util.j e;
    public final com.yandex.passport.internal.storage.i f;
    public final com.yandex.passport.internal.flags.j g;
    public final com.yandex.passport.internal.report.reporters.s0 h;
    public final com.yandex.passport.internal.network.mappers.b i;

    public i0(wa waVar, za zaVar, com.yandex.passport.internal.database.g gVar, m0 m0Var, com.yandex.passport.internal.util.j jVar, com.yandex.passport.internal.storage.i iVar, com.yandex.passport.internal.flags.j jVar2, com.yandex.passport.internal.report.reporters.s0 s0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = waVar;
        this.b = zaVar;
        this.c = gVar;
        this.d = m0Var;
        this.e = jVar;
        this.f = iVar;
        this.g = jVar2;
        this.h = s0Var;
        this.i = bVar;
    }

    public static String b(PushPlatform pushPlatform) {
        int i = h0.b[pushPlatform.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return CoreConstants.Transport.HMS;
        }
        if (i == 3) {
            return CoreConstants.Transport.RUSTORE;
        }
        w511.b();
        return null;
    }

    public final void a(Uid uid, boolean z) {
        com.yandex.passport.internal.storage.i iVar = this.f;
        iVar.getClass();
        new com.yandex.passport.internal.storage.b(iVar, uid).d(z);
    }

    public final boolean c(ModernAccount modernAccount, PushPlatform pushPlatform, boolean z) {
        com.yandex.passport.common.time.a aVar;
        long b;
        Uid uid = modernAccount.getUid();
        m0 m0Var = this.d;
        com.yandex.passport.common.a aVar2 = m0Var.a;
        m0.f.getClass();
        String d = com.yandex.passport.common.permission.b.d(uid, pushPlatform);
        Long l = (Long) m0Var.a().a.get(d);
        if (l != null) {
            b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, l.longValue());
            aVar = new com.yandex.passport.common.time.a(b);
        } else {
            aVar = null;
        }
        boolean z2 = true;
        if (jl40.l((Boolean) ((com.yandex.passport.internal.util.storage.a) m0Var.d.getValue(m0Var, m0.g[1])).a.get(d), Boolean.valueOf(z)) && aVar != null) {
            long j = aVar.a;
            aVar2.getClass();
            if (jl40.r(com.yandex.passport.common.a.a(), j) >= 0 && jl40.r(com.yandex.passport.common.a.a(), j + m0Var.b) < 0) {
                z2 = false;
            }
        }
        LogLevel logLevel = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(logLevel, null, "canSubscribeNow() = " + z2, 10);
        }
        return z2;
    }

    public final boolean d(Uid uid) {
        com.yandex.passport.internal.storage.i iVar = this.f;
        iVar.getClass();
        return new com.yandex.passport.internal.storage.b(iVar, uid).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ModernAccount modernAccount, PushPlatform pushPlatform, String str, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        PushSubscriber$subscribe$1 pushSubscriber$subscribe$1;
        int i;
        int i2;
        if (continuationImpl instanceof PushSubscriber$subscribe$1) {
            pushSubscriber$subscribe$1 = (PushSubscriber$subscribe$1) continuationImpl;
            int i3 = pushSubscriber$subscribe$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pushSubscriber$subscribe$1.label = i3 - Integer.MIN_VALUE;
                PushSubscriber$subscribe$1 pushSubscriber$subscribe$12 = pushSubscriber$subscribe$1;
                Object obj = pushSubscriber$subscribe$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSubscriber$subscribe$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushSubscriber$subscribe$12.L$0 = this;
                    pushSubscriber$subscribe$12.L$1 = modernAccount;
                    pushSubscriber$subscribe$12.L$2 = pushPlatform;
                    pushSubscriber$subscribe$12.L$3 = str;
                    pushSubscriber$subscribe$12.Z$0 = z2;
                    pushSubscriber$subscribe$12.label = 1;
                    obj = f(modernAccount, pushPlatform, str, z, z2, z3, pushSubscriber$subscribe$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = pushSubscriber$subscribe$12.Z$0;
                    str = (String) pushSubscriber$subscribe$12.L$3;
                    pushPlatform = (PushPlatform) pushSubscriber$subscribe$12.L$2;
                    modernAccount = (ModernAccount) pushSubscriber$subscribe$12.L$1;
                    this = (i0) pushSubscriber$subscribe$12.L$0;
                    kotlin.b.b(obj);
                }
                PushPlatform pushPlatform2 = pushPlatform;
                i2 = h0.a[((PushSubscriber$SubscriptionResult) obj).ordinal()];
                zy11 zy11Var = zy11.a;
                if (i2 == 1) {
                    if (i2 == 2) {
                        this.d.b(modernAccount.getUid(), pushPlatform2, z2, modernAccount.getLocationId());
                        return zy11Var;
                    }
                    if (i2 == 3) {
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                if (pushPlatform2 == PushPlatform.FCM) {
                    com.yandex.passport.internal.database.g gVar = this.c;
                    Uid uid = modernAccount.getUid();
                    this.e.getClass();
                    j0 j0Var = new j0(uid, com.yandex.passport.internal.util.j.a(str));
                    gVar.getClass();
                    if (!j0Var.equals(gVar.a(j0Var.b()))) {
                        SQLiteDatabase writableDatabase = gVar.a.getWritableDatabase();
                        ContentValues contentValues = new ContentValues();
                        Uid b = j0Var.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append(b.getEnvironment().getInteger());
                        sb.append(':');
                        sb.append(b.getValue());
                        contentValues.put("uid", sb.toString());
                        contentValues.put("gcm_token_hash", j0Var.a());
                        if (writableDatabase.insert("gcm_subscriptions", null, contentValues) == -1) {
                            com.yandex.passport.legacy.a.b("insertSubscription: insert failed");
                        } else {
                            com.yandex.passport.legacy.a.a("insertSubscription: done");
                        }
                    }
                }
                this.d.b(modernAccount.getUid(), pushPlatform2, z2, modernAccount.getLocationId());
                return zy11Var;
            }
        }
        pushSubscriber$subscribe$1 = new PushSubscriber$subscribe$1(this, continuationImpl);
        PushSubscriber$subscribe$1 pushSubscriber$subscribe$122 = pushSubscriber$subscribe$1;
        Object obj3 = pushSubscriber$subscribe$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSubscriber$subscribe$122.label;
        if (i != 0) {
        }
        PushPlatform pushPlatform22 = pushPlatform;
        i2 = h0.a[((PushSubscriber$SubscriptionResult) obj3).ordinal()];
        zy11 zy11Var2 = zy11.a;
        if (i2 == 1) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:10)(2:70|71))(2:72|(3:(2:88|(2:79|(1:81)(1:82))(4:83|(1:85)|86|87))|77|(0)(0))(4:89|(2:91|(1:93))(2:94|(2:96|(1:98))(2:99|(2:101|(1:103))(2:104|(0)(0))))|77|(0)(0)))|11|12|(2:51|(4:53|(1:55)|56|(1:58)(2:59|60))(2:61|(2:63|64)(2:65|66)))(1:14)|15|(1:17)(1:50)|18|(2:20|(1:22)(1:48))(1:49)|23|(2:25|26)(4:28|(3:44|45|(1:47))(2:34|(2:36|(1:38))(2:41|(1:43)))|39|40)))|105|6|7|(0)(0)|11|12|(0)(0)|15|(0)(0)|18|(0)(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ba, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158 A[Catch: all -> 0x019d, TryCatch #0 {all -> 0x019d, blocks: (B:12:0x0153, B:51:0x0158, B:53:0x015c, B:56:0x016b, B:59:0x0171, B:60:0x019c, B:61:0x019f, B:63:0x01a3, B:64:0x01a5, B:65:0x01a6, B:66:0x01b9), top: B:11:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum f(ModernAccount modernAccount, PushPlatform pushPlatform, String str, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        PushSubscriber$trySubscription$1 pushSubscriber$trySubscription$1;
        Object obj;
        int i;
        boolean c;
        boolean z4;
        String str2;
        ?? r13;
        i0 i0Var;
        Throwable a;
        Object failure;
        Throwable a2;
        ModernAccount modernAccount2 = modernAccount;
        PushPlatform pushPlatform2 = pushPlatform;
        boolean z5 = z;
        boolean z6 = z2;
        if (continuationImpl instanceof PushSubscriber$trySubscription$1) {
            pushSubscriber$trySubscription$1 = (PushSubscriber$trySubscription$1) continuationImpl;
            int i2 = pushSubscriber$trySubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSubscriber$trySubscription$1.label = i2 - Integer.MIN_VALUE;
                PushSubscriber$trySubscription$1 pushSubscriber$trySubscription$12 = pushSubscriber$trySubscription$1;
                obj = pushSubscriber$trySubscription$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSubscriber$trySubscription$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((Boolean) this.g.b(com.yandex.passport.internal.flags.q.s)).booleanValue()) {
                        if (z5 || c(modernAccount2, pushPlatform2, z6)) {
                            c = true;
                            if (c) {
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Can't subscribe now", 8);
                                }
                                return PushSubscriber$SubscriptionResult.INAPPLICABLE;
                            }
                            Environment environment = modernAccount2.getUid().getEnvironment();
                            this.i.getClass();
                            z4 = z3;
                            str2 = "Can't cast ";
                            r13 = 1;
                            ua uaVar = new ua(com.yandex.passport.internal.network.mappers.b.a(environment), modernAccount2.getLocationId(), modernAccount2.getMasterToken(), str, b(pushPlatform2), z6, z4);
                            pushSubscriber$trySubscription$12.L$0 = this;
                            pushSubscriber$trySubscription$12.L$1 = modernAccount2;
                            pushSubscriber$trySubscription$12.L$2 = pushPlatform2;
                            pushSubscriber$trySubscription$12.Z$0 = z5;
                            pushSubscriber$trySubscription$12.Z$1 = z6;
                            pushSubscriber$trySubscription$12.Z$2 = z4;
                            pushSubscriber$trySubscription$12.label = 1;
                            obj = this.a.a(uaVar, pushSubscriber$trySubscription$12);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i0Var = this;
                        }
                        c = false;
                        if (c) {
                        }
                    } else {
                        if (com.yandex.passport.internal.ui.c.t(modernAccount2.getUid().getEnvironment())) {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "Don't subscribe on team account " + modernAccount2.getPrimaryDisplayName(), 8);
                            }
                        } else if (modernAccount2.getPrimaryAliasType() == 10) {
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "Don't subscribe on phonish account " + modernAccount2.getPrimaryDisplayName(), 8);
                            }
                        } else if (d(modernAccount2.getUid())) {
                            c = c(modernAccount2, pushPlatform2, z6);
                            if (c) {
                            }
                        } else {
                            com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "Don't subscribe after logout " + modernAccount2.getPrimaryDisplayName(), 8);
                            }
                        }
                        c = false;
                        if (c) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z7 = pushSubscriber$trySubscription$12.Z$2;
                    boolean z8 = pushSubscriber$trySubscription$12.Z$1;
                    boolean z9 = pushSubscriber$trySubscription$12.Z$0;
                    PushPlatform pushPlatform3 = (PushPlatform) pushSubscriber$trySubscription$12.L$2;
                    ModernAccount modernAccount3 = (ModernAccount) pushSubscriber$trySubscription$12.L$1;
                    i0Var = (i0) pushSubscriber$trySubscription$12.L$0;
                    kotlin.b.b(obj);
                    z5 = z9;
                    pushPlatform2 = pushPlatform3;
                    z4 = z7;
                    z6 = z8;
                    modernAccount2 = modernAccount3;
                    str2 = "Can't cast ";
                    r13 = 1;
                }
                if (!(obj instanceof com.yandex.passport.data.models.o)) {
                    if (!(obj instanceof Result)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                        declaredField.setAccessible(r13);
                        throw ((Throwable) declaredField.get(obj));
                    }
                    Object value = ((Result) obj).getValue();
                    kotlin.b.b(value);
                    if (!(value instanceof com.yandex.passport.data.models.o)) {
                        value = null;
                    }
                    com.yandex.passport.data.models.o oVar = (com.yandex.passport.data.models.o) value;
                    if (oVar == null) {
                        throw new ClassCastException(str2 + ((Object) Result.c(((Result) obj).getValue())) + " to " + qoi0.a(com.yandex.passport.data.models.o.class));
                    }
                    obj = oVar;
                }
                com.yandex.passport.internal.report.reporters.s0 s0Var = i0Var.h;
                Uid uid = modernAccount2.getUid();
                s0Var.getClass();
                ba baVar = ba.w;
                yd ydVar = new yd(uid);
                md mdVar = new md(pushPlatform2);
                td tdVar = new td(obj instanceof Result.Failure ? ((com.yandex.passport.data.models.o) obj).a : obj);
                com.yandex.passport.internal.report.i iVar = new com.yandex.passport.internal.report.i(z5, 4);
                md mdVar2 = new md(z6, 11);
                yd ydVar2 = new yd(z4, 22);
                pd[] pdVarArr = new pd[6];
                pdVarArr[0] = ydVar;
                pdVarArr[r13] = mdVar;
                pdVarArr[2] = tdVar;
                pdVarArr[3] = iVar;
                pdVarArr[4] = mdVar2;
                pdVarArr[5] = ydVar2;
                s0Var.f(baVar, pdVarArr);
                a = Result.a(obj);
                if (a != null) {
                    String str3 = ((com.yandex.passport.data.models.o) obj).a;
                    failure = jl40.l(str3, WriteBlocks.OK) ? PushSubscriber$SubscriptionResult.SUCCESS : new Result.Failure(new FailedResponseException(str3));
                } else {
                    failure = new Result.Failure(a);
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    return (PushSubscriber$SubscriptionResult) failure;
                }
                DropPlace dropPlace = DropPlace.UNKNOWN;
                if ((a2 instanceof IOException) || (a2 instanceof JSONException) || (a2 instanceof FailedResponseException)) {
                    com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error push subscriptions for account " + modernAccount2.getPrimaryDisplayName(), a2);
                    }
                } else if (a2 instanceof InvalidTokenException) {
                    com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "Invalid master token in account " + modernAccount2.getPrimaryDisplayName(), a2);
                    }
                } else {
                    com.yandex.passport.common.logger.c cVar7 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Unexpected error push subscriptions for account " + modernAccount2.getPrimaryDisplayName(), a2);
                    }
                }
                return PushSubscriber$SubscriptionResult.FAIL;
            }
        }
        pushSubscriber$trySubscription$1 = new PushSubscriber$trySubscription$1(this, continuationImpl);
        PushSubscriber$trySubscription$1 pushSubscriber$trySubscription$122 = pushSubscriber$trySubscription$1;
        obj = pushSubscriber$trySubscription$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSubscriber$trySubscription$122.label;
        if (i != 0) {
        }
        if (!(obj instanceof com.yandex.passport.data.models.o)) {
        }
        com.yandex.passport.internal.report.reporters.s0 s0Var2 = i0Var.h;
        Uid uid2 = modernAccount2.getUid();
        s0Var2.getClass();
        ba baVar2 = ba.w;
        yd ydVar3 = new yd(uid2);
        md mdVar3 = new md(pushPlatform2);
        td tdVar2 = new td(obj instanceof Result.Failure ? ((com.yandex.passport.data.models.o) obj).a : obj);
        com.yandex.passport.internal.report.i iVar2 = new com.yandex.passport.internal.report.i(z5, 4);
        md mdVar22 = new md(z6, 11);
        yd ydVar22 = new yd(z4, 22);
        pd[] pdVarArr2 = new pd[6];
        pdVarArr2[0] = ydVar3;
        pdVarArr2[r13] = mdVar3;
        pdVarArr2[2] = tdVar2;
        pdVarArr2[3] = iVar2;
        pdVarArr2[4] = mdVar22;
        pdVarArr2[5] = ydVar22;
        s0Var2.f(baVar2, pdVarArr2);
        a = Result.a(obj);
        if (a != null) {
        }
        a2 = Result.a(failure);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006e, code lost:
    
        if (r6.a().a.get(com.yandex.passport.common.permission.b.d(r2, r1)) != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(PushPlatform pushPlatform, Uid uid, ContinuationImpl continuationImpl) {
        PushSubscriber$unsubscribe$1 pushSubscriber$unsubscribe$1;
        int i;
        char c;
        Object value;
        Throwable a;
        Object failure;
        Throwable a2;
        PushSubscriber$SubscriptionResult pushSubscriber$SubscriptionResult;
        i0 i0Var = this;
        PushPlatform pushPlatform2 = pushPlatform;
        Uid uid2 = uid;
        if (continuationImpl instanceof PushSubscriber$unsubscribe$1) {
            pushSubscriber$unsubscribe$1 = (PushSubscriber$unsubscribe$1) continuationImpl;
            int i2 = pushSubscriber$unsubscribe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSubscriber$unsubscribe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSubscriber$unsubscribe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSubscriber$unsubscribe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PushPlatform pushPlatform3 = PushPlatform.FCM;
                    m0 m0Var = i0Var.d;
                    if (pushPlatform2 != pushPlatform3 || i0Var.c.a(uid2) == null) {
                        m0Var.getClass();
                        m0.f.getClass();
                    }
                    Environment environment = uid2.getEnvironment();
                    i0Var.i.getClass();
                    com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(environment);
                    String valueOf = String.valueOf(uid2.getValue());
                    String b = b(pushPlatform2);
                    com.yandex.passport.internal.util.storage.a aVar = (com.yandex.passport.internal.util.storage.a) m0Var.e.getValue(m0Var, m0.g[2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(uid2.getEnvironment().getInteger());
                    sb.append(':');
                    c = 2;
                    sb.append(uid2.getValue());
                    xa xaVar = new xa(a3, valueOf, b, (Long) aVar.a.get(sb.toString()));
                    pushSubscriber$unsubscribe$1.L$0 = uid2;
                    pushSubscriber$unsubscribe$1.L$1 = pushPlatform2;
                    pushSubscriber$unsubscribe$1.L$2 = i0Var;
                    pushSubscriber$unsubscribe$1.label = 1;
                    obj = i0Var.b.a(xaVar, pushSubscriber$unsubscribe$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i0Var = (i0) pushSubscriber$unsubscribe$1.L$2;
                    pushPlatform2 = (PushPlatform) pushSubscriber$unsubscribe$1.L$1;
                    uid2 = (Uid) pushSubscriber$unsubscribe$1.L$0;
                    kotlin.b.b(obj);
                    c = 2;
                }
                Result result = (Result) obj;
                value = result.getValue();
                com.yandex.passport.internal.report.reporters.s0 s0Var = i0Var.h;
                s0Var.getClass();
                da daVar = da.w;
                yd ydVar = new yd(uid2);
                md mdVar = new md(pushPlatform2);
                if (!(value instanceof Result.Failure)) {
                    value = ((com.yandex.passport.data.models.o) value).a;
                }
                td tdVar = new td(value);
                pd[] pdVarArr = new pd[3];
                pdVarArr[0] = ydVar;
                pdVarArr[1] = mdVar;
                pdVarArr[c] = tdVar;
                s0Var.f(daVar, pdVarArr);
                Object value2 = result.getValue();
                a = Result.a(value2);
                if (a != null) {
                    com.yandex.passport.data.models.o oVar = (com.yandex.passport.data.models.o) value2;
                    failure = jl40.l(oVar.a, WriteBlocks.OK) ? PushSubscriber$SubscriptionResult.SUCCESS : new Result.Failure(new FailedResponseException(oVar.a));
                } else {
                    failure = new Result.Failure(a);
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    pushSubscriber$SubscriptionResult = (PushSubscriber$SubscriptionResult) failure;
                } else {
                    if ((a2 instanceof IOException) || (a2 instanceof JSONException) || (a2 instanceof FailedResponseException)) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error push subscriptions for account " + uid2, a2);
                        }
                    } else {
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Unexpected error push subscriptions for account " + uid2, a2);
                        }
                    }
                    pushSubscriber$SubscriptionResult = PushSubscriber$SubscriptionResult.FAIL;
                }
                if (jl40.l(pushSubscriber$SubscriptionResult, PushSubscriber$SubscriptionResult.SUCCESS)) {
                    if (pushPlatform2 == PushPlatform.FCM) {
                        SQLiteDatabase readableDatabase = i0Var.c.a.getReadableDatabase();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uid2.getEnvironment().getInteger());
                        sb2.append(':');
                        sb2.append(uid2.getValue());
                        readableDatabase.delete("gcm_subscriptions", "uid = ?", new String[]{sb2.toString()});
                    }
                    m0 m0Var2 = i0Var.d;
                    m0Var2.getClass();
                    m0.f.getClass();
                    String d = com.yandex.passport.common.permission.b.d(uid2, pushPlatform2);
                    m0Var2.a().remove(d);
                    com.yandex.passport.internal.util.storage.b bVar = m0Var2.d;
                    kgx[] kgxVarArr = m0.g;
                    ((com.yandex.passport.internal.util.storage.a) bVar.getValue(m0Var2, kgxVarArr[1])).remove(d);
                    com.yandex.passport.internal.util.storage.a aVar2 = (com.yandex.passport.internal.util.storage.a) m0Var2.e.getValue(m0Var2, kgxVarArr[c]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(uid2.getEnvironment().getInteger());
                    sb3.append(':');
                    sb3.append(uid2.getValue());
                    aVar2.remove(sb3.toString());
                }
                return zy11.a;
            }
        }
        pushSubscriber$unsubscribe$1 = new PushSubscriber$unsubscribe$1(i0Var, continuationImpl);
        Object obj2 = pushSubscriber$unsubscribe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSubscriber$unsubscribe$1.label;
        if (i != 0) {
        }
        Result result2 = (Result) obj2;
        value = result2.getValue();
        com.yandex.passport.internal.report.reporters.s0 s0Var2 = i0Var.h;
        s0Var2.getClass();
        da daVar2 = da.w;
        yd ydVar2 = new yd(uid2);
        md mdVar2 = new md(pushPlatform2);
        if (!(value instanceof Result.Failure)) {
        }
        td tdVar2 = new td(value);
        pd[] pdVarArr2 = new pd[3];
        pdVarArr2[0] = ydVar2;
        pdVarArr2[1] = mdVar2;
        pdVarArr2[c] = tdVar2;
        s0Var2.f(daVar2, pdVarArr2);
        Object value22 = result2.getValue();
        a = Result.a(value22);
        if (a != null) {
        }
        a2 = Result.a(failure);
        if (a2 != null) {
        }
        if (jl40.l(pushSubscriber$SubscriptionResult, PushSubscriber$SubscriptionResult.SUCCESS)) {
        }
        return zy11.a;
    }
}
