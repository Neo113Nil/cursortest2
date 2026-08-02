package com.yandex.messaging.internal.authorized.sync;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.WhoamiResponse;
import com.yandex.messaging.core.net.entities.proto.WhoamiUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.AccountTypeProto;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingInfoFanoutResponse;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$updatePersonalInfo$$inlined$makeCall$1;
import defpackage.a3b;
import defpackage.ab51;
import defpackage.at2;
import defpackage.e9h0;
import defpackage.fse;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.h9b;
import defpackage.hlf;
import defpackage.ii8;
import defpackage.j73;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.k020;
import defpackage.l020;
import defpackage.m5b0;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.nkb1;
import defpackage.noh;
import defpackage.nqi0;
import defpackage.ny61;
import defpackage.oab;
import defpackage.oo31;
import defpackage.oyj0;
import defpackage.qoh;
import defpackage.r0x0;
import defpackage.rfa;
import defpackage.s020;
import defpackage.t0x0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.uiy0;
import defpackage.umu;
import defpackage.vmu;
import defpackage.wii0;
import defpackage.wls;
import defpackage.wmu;
import defpackage.x22;
import defpackage.z83;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.HistorySyncer$performSyncImpl$2", f = "HistorySyncer.kt", l = {179, 182, 199, 206, 214, 230, 244}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HistorySyncer$performSyncImpl$2 extends SuspendLambda implements wls {
    final /* synthetic */ t0x0 $callback;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistorySyncer$performSyncImpl$2(e eVar, t0x0 t0x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$callback = t0x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HistorySyncer$performSyncImpl$2 historySyncer$performSyncImpl$2 = new HistorySyncer$performSyncImpl$2(this.this$0, this.$callback, continuation);
        historySyncer$performSyncImpl$2.L$0 = obj;
        return historySyncer$performSyncImpl$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistorySyncer$performSyncImpl$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0318, code lost:
    
        if (r1 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x02df, code lost:
    
        if (r0 != r7) goto L76;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e9 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:87:0x049c, B:89:0x04b4, B:91:0x04bb, B:93:0x04c5, B:95:0x04d3, B:96:0x04e4, B:98:0x04ea, B:101:0x04f7, B:106:0x04fb, B:107:0x04ff, B:109:0x0505, B:111:0x0511, B:113:0x051d, B:115:0x052c, B:118:0x0532, B:120:0x0542, B:122:0x054e, B:124:0x0556, B:126:0x0559, B:130:0x055c, B:131:0x0567, B:133:0x056d, B:135:0x0579, B:137:0x057d, B:139:0x0581, B:141:0x0587, B:143:0x0594, B:145:0x059e, B:146:0x05a1, B:149:0x05a5, B:152:0x05ae, B:155:0x05b2, B:158:0x05b6, B:161:0x05ba, B:172:0x05c3, B:174:0x05cc, B:175:0x05cf, B:194:0x05db, B:195:0x05e3, B:197:0x05e9, B:199:0x05f5, B:206:0x0601, B:210:0x0610), top: B:86:0x049c }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0294 A[Catch: all -> 0x029b, TryCatch #2 {all -> 0x029b, blocks: (B:293:0x0290, B:295:0x0294, B:296:0x029f), top: B:292:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x045e A[LOOP:3: B:81:0x0458->B:83:0x045e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x069b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        noh h;
        Object s;
        noh nohVar;
        noh nohVar2;
        boolean z;
        boolean z2;
        Object k;
        WhoamiResponse whoamiResponse;
        long j3;
        HistoryResponse historyResponse;
        boolean z3;
        Integer num;
        umu umuVar;
        l020 C;
        WhoamiUserInfo whoamiUserInfo;
        WhoamiUserInfo whoamiUserInfo2;
        AccountTypeProto accountTypeProto;
        fse fseVar;
        Object k0;
        HistoryResponse historyResponse2;
        Object k2;
        HistoryResponse historyResponse3;
        List list;
        long j4;
        Object a;
        noh nohVar3;
        ChatHistoryResponse[] chatHistoryResponseArr;
        int i;
        Object k3;
        HistoryResponse historyResponse4;
        wmu wmuVar;
        int i2;
        HistoryResponse historyResponse5;
        ChatHistoryResponse[] chatHistoryResponseArr2;
        vmu vmuVar;
        int d;
        Iterator it;
        Set N0;
        wmu wmuVar2;
        HistoryResponse historyResponse6;
        Iterator it2;
        m5b0 m5b0Var;
        ChatHistoryResponse[] chatHistoryResponseArr3;
        long j5;
        zy11 zy11Var;
        wmu wmuVar3;
        int i3;
        String str;
        ChatHistoryResponse.OutMessage outMessage;
        ServerMessage serverMessage;
        ClientMessage clientMessage;
        PlainMessage plainMessage;
        ServerMessageInfo serverMessageInfo;
        ReducedUserInfo reducedUserInfo;
        wmu wmuVar4;
        HistoryResponse historyResponse7;
        m5b0 m5b0Var2;
        ChatHistoryResponse[] chatHistoryResponseArr4;
        int i4;
        Integer num2;
        umu umuVar2;
        zy11 zy11Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        zy11 zy11Var3 = zy11.a;
        switch (i5) {
            case 0:
                j = 0;
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                vmu vmuVar2 = this.this$0.v;
                vmuVar2.getClass();
                umu umuVar3 = new umu(vmuVar2);
                ((at2) vmuVar2.b.get()).c0(umuVar3.g);
                vmuVar2.c = umuVar3;
                this.this$0.o.f();
                this.this$0.v.a("init_exp_done");
                boolean z4 = ((wii0) this.this$0.B.get()).c;
                qoh h2 = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$whoamiRequest$1(this.this$0, z4 ? null : this.this$0.y.a, null), 3);
                r0x0 r0x0Var = this.this$0.l;
                k020 k020Var = r0x0Var.c;
                int i6 = r0x0Var.a.a.getInt("no_scheme_objects_version", -1);
                z83.h(null, 9 >= i6);
                if (i6 == 9) {
                    boolean z5 = ((hlf) r0x0Var.d.get()).w;
                    com.yandex.messaging.domain.statuses.b bVar = r0x0Var.b;
                    if (z5) {
                        z2 = !bVar.d;
                    } else {
                        bVar.d = false;
                        oo31.n(bVar.c, "IS_CUSTOM_STATUSES_ENABLED", false);
                        z2 = false;
                    }
                    if (!z2) {
                        j2 = Math.min(((Number) androidx.room.util.a.b(k020Var.b.A().a, true, false, new nqi0(21))).longValue(), ((Number) androidx.room.util.a.b(k020Var.b.A().a, true, false, new nqi0(18))).longValue());
                        h = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$historyRequest$1(this.this$0, j2, null), 3);
                        qoh h3 = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$threadsHistoryRequest$1(this.this$0, null), 3);
                        qoh h4 = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$bucketsRequest$1(this.this$0, null), 3);
                        this.this$0.v.a("requests_started");
                        this.L$0 = h;
                        this.L$1 = h3;
                        this.L$2 = h4;
                        this.Z$0 = z4;
                        this.J$0 = j2;
                        this.label = 1;
                        s = h2.s(this);
                        if (s != coroutineSingletons) {
                            nohVar = h3;
                            nohVar2 = h4;
                            z = z4;
                            WhoamiResponse whoamiResponse2 = (WhoamiResponse) s;
                            this.this$0.v.a("whoami_received");
                            this.L$0 = nohVar;
                            this.L$1 = nohVar2;
                            this.L$2 = whoamiResponse2;
                            this.Z$0 = z;
                            this.J$0 = j2;
                            this.label = 2;
                            k = h.k(this);
                            if (k != coroutineSingletons) {
                                long j6 = j2;
                                whoamiResponse = whoamiResponse2;
                                j3 = j6;
                                historyResponse = (HistoryResponse) k;
                                this.this$0.v.a("chats_received");
                                ab51 ab51Var = this.this$0.p;
                                int i7 = historyResponse.workspaceVersion;
                                at2 at2Var = ab51Var.a;
                                z3 = z;
                                num = (Integer) androidx.room.util.a.b(at2Var.A().a, true, false, new nqi0(20));
                                if (num != null) {
                                    ((Number) androidx.room.util.a.b(at2Var.A().a, false, true, new ii8(i7, 16))).intValue();
                                } else if (num.intValue() != i7) {
                                    tje.N(ab51Var.c, null, null, new WorkspaceVersionHandler$handle$1(ab51Var, null), 3);
                                    return zy11Var3;
                                }
                                if (z3) {
                                    String str2 = this.this$0.y.a;
                                    WhoamiUserInfo whoamiUserInfo3 = whoamiResponse.userInfo;
                                    if (!jl40.l(str2, whoamiUserInfo3 != null ? whoamiUserInfo3.userId : null)) {
                                        this.this$0.D.reportEvent("tech_sync_guid_mismatch");
                                        e eVar = this.this$0;
                                        tje.N(eVar.A, null, null, new HistorySyncer$recreateProfile$1(eVar, null), 3);
                                        return zy11Var3;
                                    }
                                }
                                umuVar = this.this$0.v.c;
                                if (umuVar != null) {
                                    umuVar.b = Long.valueOf(SystemClock.elapsedRealtime());
                                }
                                C = this.this$0.c.C();
                                try {
                                    whoamiUserInfo = whoamiResponse.userInfo;
                                    if (whoamiUserInfo != null) {
                                        C.u0(whoamiUserInfo);
                                        C.F0(whoamiUserInfo);
                                    }
                                    C.s();
                                    C.close();
                                    this.this$0.v.a("whoami_handled");
                                    whoamiUserInfo2 = whoamiResponse.userInfo;
                                    if (whoamiUserInfo2 != null && (accountTypeProto = whoamiUserInfo2.accountType) != null && !accountTypeProto.getFound()) {
                                        to3 to3Var = this.this$0.s;
                                        this.L$0 = nohVar;
                                        this.L$1 = nohVar2;
                                        this.L$2 = historyResponse;
                                        this.J$0 = j3;
                                        this.label = 3;
                                        fseVar = get_context();
                                        if (fseVar == null) {
                                            fseVar = get_context();
                                        }
                                        k0 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$updatePersonalInfo$$inlined$makeCall$1(null, to3Var), this);
                                        break;
                                    }
                                    historyResponse2 = historyResponse;
                                    this.L$0 = nohVar;
                                    this.L$1 = historyResponse2;
                                    this.L$2 = null;
                                    this.J$0 = j3;
                                    this.label = 4;
                                    k2 = nohVar2.k(this);
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                j2 = 0;
                h = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$historyRequest$1(this.this$0, j2, null), 3);
                qoh h32 = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$threadsHistoryRequest$1(this.this$0, null), 3);
                qoh h42 = tje.h(tseVar, null, null, new HistorySyncer$performSyncImpl$2$bucketsRequest$1(this.this$0, null), 3);
                this.this$0.v.a("requests_started");
                this.L$0 = h;
                this.L$1 = h32;
                this.L$2 = h42;
                this.Z$0 = z4;
                this.J$0 = j2;
                this.label = 1;
                s = h2.s(this);
                if (s != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 1:
                j = 0;
                long j7 = this.J$0;
                z = this.Z$0;
                nohVar2 = (noh) this.L$2;
                nohVar = (noh) this.L$1;
                h = (noh) this.L$0;
                kotlin.b.b(obj);
                j2 = j7;
                s = obj;
                WhoamiResponse whoamiResponse22 = (WhoamiResponse) s;
                this.this$0.v.a("whoami_received");
                this.L$0 = nohVar;
                this.L$1 = nohVar2;
                this.L$2 = whoamiResponse22;
                this.Z$0 = z;
                this.J$0 = j2;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                long j8 = this.J$0;
                z = this.Z$0;
                WhoamiResponse whoamiResponse3 = (WhoamiResponse) this.L$2;
                j = 0;
                noh nohVar4 = (noh) this.L$1;
                noh nohVar5 = (noh) this.L$0;
                kotlin.b.b(obj);
                j3 = j8;
                whoamiResponse = whoamiResponse3;
                nohVar2 = nohVar4;
                nohVar = nohVar5;
                k = obj;
                historyResponse = (HistoryResponse) k;
                this.this$0.v.a("chats_received");
                ab51 ab51Var2 = this.this$0.p;
                int i72 = historyResponse.workspaceVersion;
                at2 at2Var2 = ab51Var2.a;
                z3 = z;
                num = (Integer) androidx.room.util.a.b(at2Var2.A().a, true, false, new nqi0(20));
                if (num != null) {
                }
                if (z3) {
                }
                umuVar = this.this$0.v.c;
                if (umuVar != null) {
                }
                C = this.this$0.c.C();
                whoamiUserInfo = whoamiResponse.userInfo;
                if (whoamiUserInfo != null) {
                }
                C.s();
                C.close();
                this.this$0.v.a("whoami_handled");
                whoamiUserInfo2 = whoamiResponse.userInfo;
                if (whoamiUserInfo2 != null) {
                    to3 to3Var2 = this.this$0.s;
                    this.L$0 = nohVar;
                    this.L$1 = nohVar2;
                    this.L$2 = historyResponse;
                    this.J$0 = j3;
                    this.label = 3;
                    fseVar = get_context();
                    if (fseVar == null) {
                    }
                    k0 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$updatePersonalInfo$$inlined$makeCall$1(null, to3Var2), this);
                    break;
                }
                historyResponse2 = historyResponse;
                this.L$0 = nohVar;
                this.L$1 = historyResponse2;
                this.L$2 = null;
                this.J$0 = j3;
                this.label = 4;
                k2 = nohVar2.k(this);
                break;
            case 3:
                j3 = this.J$0;
                HistoryResponse historyResponse8 = (HistoryResponse) this.L$2;
                noh nohVar6 = (noh) this.L$1;
                noh nohVar7 = (noh) this.L$0;
                kotlin.b.b(obj);
                nohVar = nohVar7;
                j = 0;
                nohVar2 = nohVar6;
                historyResponse = historyResponse8;
                k0 = obj;
                PersonalUserData personalUserData = (PersonalUserData) ((oyj0) k0).b();
                if (personalUserData != null) {
                    C = this.this$0.c.C();
                    try {
                        C.q0(personalUserData);
                        C.s();
                        C.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                historyResponse2 = historyResponse;
                this.L$0 = nohVar;
                this.L$1 = historyResponse2;
                this.L$2 = null;
                this.J$0 = j3;
                this.label = 4;
                k2 = nohVar2.k(this);
                break;
            case 4:
                j3 = this.J$0;
                historyResponse2 = (HistoryResponse) this.L$1;
                noh nohVar8 = (noh) this.L$0;
                kotlin.b.b(obj);
                k2 = obj;
                nohVar = nohVar8;
                j = 0;
                long j9 = j3;
                historyResponse3 = historyResponse2;
                BucketsData bucketsData = (BucketsData) ((oyj0) k2).b();
                this.this$0.v.a("buckets_received");
                list = (List) androidx.room.util.a.b(this.this$0.i.q().a, true, false, new rfa(9));
                this.this$0.v.a("chats_db_read");
                e eVar2 = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    ChatId a2 = ChatId.Companion.a(((a3b) obj2).a);
                    if (!(a2 instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a2).d < j) {
                        arrayList.add(obj2);
                    }
                }
                this.L$0 = nohVar;
                this.L$1 = historyResponse3;
                this.L$2 = list;
                this.J$0 = j9;
                this.label = 5;
                j4 = j9;
                a = e.a(eVar2, j4, historyResponse3, bucketsData, arrayList, this);
                if (a != coroutineSingletons) {
                    nohVar3 = nohVar;
                    wmu wmuVar5 = (wmu) a;
                    this.this$0.v.a("chats_handled");
                    kotlinx.coroutines.a.k(get_context());
                    this.this$0.v.a("chats_coroutine_check");
                    e.c(this.this$0, historyResponse3);
                    this.this$0.v.a("mentions_handled");
                    chatHistoryResponseArr = historyResponse3.chats;
                    if (chatHistoryResponseArr == null) {
                        i = 0;
                        for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                            if (chatHistoryResponse.partnerInfo != null) {
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    this.L$0 = historyResponse3;
                    this.L$1 = list;
                    this.L$2 = wmuVar5;
                    this.J$0 = j4;
                    this.I$0 = i;
                    this.label = 6;
                    k3 = nohVar3.k(this);
                    if (k3 != coroutineSingletons) {
                        historyResponse4 = historyResponse3;
                        wmuVar = wmuVar5;
                        i2 = i;
                        historyResponse5 = (HistoryResponse) k3;
                        this.this$0.v.a("threads_received");
                        kotlinx.coroutines.a.k(get_context());
                        this.this$0.v.a("chats_coroutine_check");
                        e eVar3 = this.this$0;
                        chatHistoryResponseArr2 = historyResponse5.chats;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            ChatId a3 = ChatId.Companion.a(((a3b) obj3).a);
                            if ((a3 instanceof ChatId.ThreadId) && ((ChatId.ThreadId) a3).d >= j) {
                                arrayList2.add(obj3);
                            }
                        }
                        h9b h9bVar = eVar3.f;
                        vmuVar = eVar3.v;
                        d = gw00.d(tcc.n(arrayList2, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (it = arrayList2.iterator(); it.hasNext(); it = it) {
                            Object next = it.next();
                            linkedHashMap.put(((a3b) next).a, next);
                        }
                        N0 = kotlin.collections.a.N0((List) androidx.room.util.a.b(eVar3.i.d0().a, true, false, new uiy0(23)));
                        boolean a4 = eVar3.E.a();
                        C = eVar3.c.C();
                        try {
                            int i8 = i2;
                            C.z.c.d(e9h0.payload_update_without_notifications, Boolean.TRUE);
                            e.h(C, historyResponse5.users, chatHistoryResponseArr2);
                            long j10 = j4;
                            if (chatHistoryResponseArr2 != null || chatHistoryResponseArr2.length == 0) {
                                wmuVar2 = wmuVar;
                                historyResponse6 = historyResponse5;
                                it2 = N0.iterator();
                                while (it2.hasNext()) {
                                    s020 e = h9bVar.e((String) it2.next());
                                    if (e != null && (m5b0Var = (m5b0) ((m8g) e).O.get()) != null) {
                                        m5b0Var.c(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    }
                                }
                                C.c();
                                vmuVar.a("threads_cleared");
                                C.close();
                            } else {
                                ArrayList arrayList3 = new ArrayList(chatHistoryResponseArr2.length);
                                for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr2) {
                                    arrayList3.add(chatHistoryResponse2.chatId);
                                }
                                Set N02 = kotlin.collections.a.N0(arrayList3);
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : N0) {
                                    if (!N02.contains((String) obj4)) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    String str3 = (String) it3.next();
                                    s020 e2 = h9bVar.e(str3);
                                    if (e2 == null || (m5b0Var2 = (m5b0) ((m8g) e2).O.get()) == null) {
                                        wmuVar4 = wmuVar;
                                        historyResponse7 = historyResponse5;
                                    } else {
                                        wmuVar4 = wmuVar;
                                        historyResponse7 = historyResponse5;
                                        m5b0Var2.c(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    }
                                    C.d(str3, false);
                                    wmuVar = wmuVar4;
                                    historyResponse5 = historyResponse7;
                                }
                                wmuVar2 = wmuVar;
                                historyResponse6 = historyResponse5;
                                vmuVar.a("threads_deleted");
                                ArrayList arrayList5 = new ArrayList();
                                for (ChatHistoryResponse chatHistoryResponse3 : chatHistoryResponseArr2) {
                                    a3b a3bVar = (a3b) linkedHashMap.get(chatHistoryResponse3.chatId);
                                    if (a3bVar != null ? nkb1.b(chatHistoryResponse3, a3bVar) : true) {
                                        arrayList5.add(chatHistoryResponse3);
                                    }
                                }
                                vmuVar.a("threads_calculated");
                                Iterator it4 = arrayList5.iterator();
                                long j11 = j;
                                while (it4.hasNext()) {
                                    ChatHistoryResponse chatHistoryResponse4 = (ChatHistoryResponse) it4.next();
                                    String str4 = chatHistoryResponse4.chatId;
                                    ServerMessage serverMessage2 = chatHistoryResponse4.threadParentMessage;
                                    if (serverMessage2 == null || (serverMessageInfo = serverMessage2.serverMessageInfo) == null || (reducedUserInfo = serverMessageInfo.from) == null || (str = reducedUserInfo.displayName) == null) {
                                        str = "";
                                    }
                                    C.B.g(str4, str);
                                    s020 e3 = eVar3.f.e(str4);
                                    oab d2 = e3 != null ? ((m8g) e3).d() : null;
                                    if (d2 != null) {
                                        d2.j(C, chatHistoryResponse4, a4);
                                    }
                                    ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse4.messages;
                                    if (outMessageArr != null && (outMessage = (ChatHistoryResponse.OutMessage) j73.G(0, outMessageArr)) != null && (serverMessage = outMessage.serverMessage) != null && (clientMessage = serverMessage.clientMessage) != null && (plainMessage = clientMessage.plain) != null) {
                                        j11 = Math.max(j11, plainMessage.getTimestamp());
                                    }
                                }
                                vmuVar.a("threads_updated");
                                if (j11 > j) {
                                    C.k(j11);
                                }
                                C.s();
                                C.close();
                                vmuVar.a("threads_db_updated");
                            }
                            this.this$0.v.a("threads_handled");
                            e.c(this.this$0, historyResponse6);
                            this.this$0.v.a("threads_menions_handled");
                            r0 r0Var = ((g) ((jhu0) this.$callback).a).W;
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            e eVar4 = this.this$0;
                            chatHistoryResponseArr3 = historyResponse4.chats;
                            this.L$0 = historyResponse4;
                            this.L$1 = wmuVar2;
                            this.L$2 = historyResponse6;
                            j5 = j10;
                            this.J$0 = j5;
                            this.I$0 = i8;
                            this.label = 7;
                            eVar4.getClass();
                            if (chatHistoryResponseArr3 != null) {
                                ArrayList arrayList6 = new ArrayList();
                                for (ChatHistoryResponse chatHistoryResponse5 : chatHistoryResponseArr3) {
                                    MeetingInfoFanoutResponse meetingInfoFanoutResponse = chatHistoryResponse5.meetingInfo;
                                    if (meetingInfoFanoutResponse != null) {
                                        arrayList6.add(meetingInfoFanoutResponse);
                                    }
                                }
                                eVar4.n.getClass();
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            }
                            zy11Var = zy11Var3;
                            if (zy11Var != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            wmuVar3 = wmuVar2;
                            i3 = i8;
                            this.this$0.v.a("meetings_handled");
                            e eVar5 = this.this$0;
                            vmu vmuVar3 = eVar5.v;
                            boolean z6 = eVar5.I;
                            boolean z7 = j5 == wmuVar3.c;
                            ChatHistoryResponse[] chatHistoryResponseArr5 = historyResponse4.chats;
                            Integer num3 = chatHistoryResponseArr5 == null ? new Integer(chatHistoryResponseArr5.length) : null;
                            ChatHistoryResponse[] chatHistoryResponseArr6 = historyResponse6.chats;
                            Integer num4 = chatHistoryResponseArr6 == null ? new Integer(chatHistoryResponseArr6.length) : null;
                            chatHistoryResponseArr4 = historyResponse4.chats;
                            if (chatHistoryResponseArr4 == null) {
                                ArrayList arrayList7 = new ArrayList(chatHistoryResponseArr4.length);
                                int length = chatHistoryResponseArr4.length;
                                int i9 = 0;
                                while (i9 < length) {
                                    ChatHistoryResponse.OutMessage[] outMessageArr2 = chatHistoryResponseArr4[i9].messages;
                                    int i10 = i3;
                                    arrayList7.add(new Integer(outMessageArr2 != null ? outMessageArr2.length : 0));
                                    i9++;
                                    i3 = i10;
                                }
                                i4 = i3;
                                num2 = new Integer(kotlin.collections.a.z0(arrayList7));
                            } else {
                                i4 = i3;
                                num2 = null;
                            }
                            int i11 = wmuVar3.a;
                            int i12 = wmuVar3.b;
                            h3y h3yVar = vmuVar3.b;
                            x22 x22Var = vmuVar3.a;
                            umuVar2 = vmuVar3.c;
                            if (umuVar2 != null) {
                                LinkedHashMap linkedHashMap2 = umuVar2.i;
                                ((at2) h3yVar.get()).M(umuVar2.g);
                                Long l = umuVar2.b;
                                if (l != null) {
                                    long longValue = l.longValue();
                                    zy11Var2 = zy11Var;
                                    long j12 = umuVar2.a;
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    x22Var.reportEvent("tech sync finished", kotlin.collections.b.i(new Pair("syncTime", Long.valueOf(elapsedRealtime - j12)), new Pair("requestTime", Long.valueOf(longValue - j12)), new Pair("responseHandleTime", Long.valueOf(elapsedRealtime - longValue)), new Pair("chatsCount", Integer.valueOf(num3 != null ? num3.intValue() : 0)), new Pair("threadsCount", Integer.valueOf(num4 != null ? num4.intValue() : 0)), new Pair("usersCount", Integer.valueOf(i4)), new Pair("historySize", Integer.valueOf(num3 != null ? num3.intValue() : 0)), new Pair("messagesCount", Integer.valueOf(num2 != null ? num2.intValue() : 0)), new Pair("historyMissedChatsCount", Integer.valueOf(i11)), new Pair("historyChangedChatsCount", Integer.valueOf(i12)), new Pair("historyVersion", Long.valueOf(j5)), new Pair("historyVersionChanged", Boolean.valueOf(z7)), new Pair("coldSync", Boolean.valueOf(z6)), new Pair("historySync", Boolean.TRUE)));
                                    x22Var.reportEvent("tech sync db", kotlin.collections.b.i(new Pair("was_open", Boolean.valueOf(umuVar2.c)), new Pair("count", Integer.valueOf(umuVar2.d)), new Pair("commit_time", Long.valueOf(umuVar2.f)), new Pair("db_synchronous_mode", ((at2) h3yVar.get()).e())));
                                    Iterator it5 = linkedHashMap2.values().iterator();
                                    long j13 = j;
                                    while (it5.hasNext()) {
                                        j13 += ((Number) it5.next()).longValue();
                                    }
                                    linkedHashMap2.put("all", Long.valueOf(j13));
                                    x22Var.reportEvent("tech sync steps", linkedHashMap2);
                                    this.this$0.I = false;
                                    return zy11Var2;
                                }
                            }
                            zy11Var2 = zy11Var;
                            this.this$0.I = false;
                            return zy11Var2;
                        } finally {
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                long j14 = this.J$0;
                List list2 = (List) this.L$2;
                historyResponse3 = (HistoryResponse) this.L$1;
                nohVar3 = (noh) this.L$0;
                kotlin.b.b(obj);
                list = list2;
                j = 0;
                j4 = j14;
                a = obj;
                wmu wmuVar52 = (wmu) a;
                this.this$0.v.a("chats_handled");
                kotlinx.coroutines.a.k(get_context());
                this.this$0.v.a("chats_coroutine_check");
                e.c(this.this$0, historyResponse3);
                this.this$0.v.a("mentions_handled");
                chatHistoryResponseArr = historyResponse3.chats;
                if (chatHistoryResponseArr == null) {
                }
                this.L$0 = historyResponse3;
                this.L$1 = list;
                this.L$2 = wmuVar52;
                this.J$0 = j4;
                this.I$0 = i;
                this.label = 6;
                k3 = nohVar3.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i2 = this.I$0;
                j4 = this.J$0;
                wmuVar = (wmu) this.L$2;
                List list3 = (List) this.L$1;
                historyResponse4 = (HistoryResponse) this.L$0;
                kotlin.b.b(obj);
                list = list3;
                j = 0;
                k3 = obj;
                historyResponse5 = (HistoryResponse) k3;
                this.this$0.v.a("threads_received");
                kotlinx.coroutines.a.k(get_context());
                this.this$0.v.a("chats_coroutine_check");
                e eVar32 = this.this$0;
                chatHistoryResponseArr2 = historyResponse5.chats;
                ArrayList arrayList22 = new ArrayList();
                while (r8.hasNext()) {
                }
                h9b h9bVar2 = eVar32.f;
                vmuVar = eVar32.v;
                d = gw00.d(tcc.n(arrayList22, 10));
                if (d < 16) {
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
                while (it.hasNext()) {
                }
                N0 = kotlin.collections.a.N0((List) androidx.room.util.a.b(eVar32.i.d0().a, true, false, new uiy0(23)));
                boolean a42 = eVar32.E.a();
                C = eVar32.c.C();
                int i82 = i2;
                C.z.c.d(e9h0.payload_update_without_notifications, Boolean.TRUE);
                e.h(C, historyResponse5.users, chatHistoryResponseArr2);
                long j102 = j4;
                if (chatHistoryResponseArr2 != null) {
                    break;
                }
                wmuVar2 = wmuVar;
                historyResponse6 = historyResponse5;
                it2 = N0.iterator();
                while (it2.hasNext()) {
                }
                C.c();
                vmuVar.a("threads_cleared");
                C.close();
                this.this$0.v.a("threads_handled");
                e.c(this.this$0, historyResponse6);
                this.this$0.v.a("threads_menions_handled");
                r0 r0Var2 = ((g) ((jhu0) this.$callback).a).W;
                Boolean bool2 = Boolean.TRUE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
                e eVar42 = this.this$0;
                chatHistoryResponseArr3 = historyResponse4.chats;
                this.L$0 = historyResponse4;
                this.L$1 = wmuVar2;
                this.L$2 = historyResponse6;
                j5 = j102;
                this.J$0 = j5;
                this.I$0 = i82;
                this.label = 7;
                eVar42.getClass();
                if (chatHistoryResponseArr3 != null) {
                }
                zy11Var = zy11Var3;
                if (zy11Var != coroutineSingletons) {
                }
                break;
            case 7:
                i3 = this.I$0;
                long j15 = this.J$0;
                HistoryResponse historyResponse9 = (HistoryResponse) this.L$2;
                wmuVar3 = (wmu) this.L$1;
                historyResponse4 = (HistoryResponse) this.L$0;
                kotlin.b.b(obj);
                historyResponse6 = historyResponse9;
                j = 0;
                j5 = j15;
                zy11Var = zy11Var3;
                this.this$0.v.a("meetings_handled");
                e eVar52 = this.this$0;
                vmu vmuVar32 = eVar52.v;
                boolean z62 = eVar52.I;
                if (j5 == wmuVar3.c) {
                }
                ChatHistoryResponse[] chatHistoryResponseArr52 = historyResponse4.chats;
                if (chatHistoryResponseArr52 == null) {
                }
                ChatHistoryResponse[] chatHistoryResponseArr62 = historyResponse6.chats;
                if (chatHistoryResponseArr62 == null) {
                }
                chatHistoryResponseArr4 = historyResponse4.chats;
                if (chatHistoryResponseArr4 == null) {
                }
                int i112 = wmuVar3.a;
                int i122 = wmuVar3.b;
                h3y h3yVar2 = vmuVar32.b;
                x22 x22Var2 = vmuVar32.a;
                umuVar2 = vmuVar32.c;
                if (umuVar2 != null) {
                }
                zy11Var2 = zy11Var;
                this.this$0.I = false;
                return zy11Var2;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
