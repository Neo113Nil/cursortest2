package com.yandex.go.payments.acceptance.domain;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentActionButton;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonAction;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentFullscreen;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentNotification;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentUi;
import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;
import defpackage.a60;
import defpackage.af;
import defpackage.bf;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.ff;
import defpackage.gci0;
import defpackage.je;
import defpackage.jl40;
import defpackage.kud;
import defpackage.l8x;
import defpackage.lud;
import defpackage.mdh;
import defpackage.me;
import defpackage.mud;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qe;
import defpackage.rd;
import defpackage.sd;
import defpackage.sjh;
import defpackage.td;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wd;
import defpackage.we;
import defpackage.xd;
import defpackage.y50;
import defpackage.yd;
import defpackage.zd;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes13.dex */
public final class c implements je {
    public final Lifecycle a;
    public final tse b;
    public final tt2 c;
    public final com.yandex.go.payments.acceptance.data.a d;
    public final ff e;
    public final p2y0 f;
    public final y50 g;
    public final d h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public final r0 l;
    public final gci0 m;
    public final r0 n;
    public final gci0 o;

    public c(Lifecycle lifecycle, tse tseVar, tt2 tt2Var, com.yandex.go.payments.acceptance.data.a aVar, ff ffVar, p2y0 p2y0Var, y50 y50Var, d dVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = aVar;
        this.e = ffVar;
        this.f = p2y0Var;
        this.g = y50Var;
        this.h = dVar;
        r0 c = bvf0.c(bf.a);
        this.l = c;
        this.m = e.d(c);
        r0 c2 = bvf0.c(new xd("", null));
        this.n = c2;
        this.o = e.d(c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x028f, code lost:
    
        if (kotlinx.coroutines.a.i(r11, r4) == r5) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
    
        if (ru.yandex.taxi.lifecycle.c.e(r3, r7, r4) == r5) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c9, code lost:
    
        if (r3 == r5) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00e2, code lost:
    
        if (r2 == r5) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0339 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02c9 -> B:18:0x02cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, sd sdVar, ContinuationImpl continuationImpl) {
        AcceptancePaymentController$pollStatus$1 acceptancePaymentController$pollStatus$1;
        int i;
        sd sdVar2;
        mud mudVar;
        String str2;
        sd sdVar3;
        long j;
        tt2 tt2Var;
        Continuation continuation;
        Object k0;
        boolean z;
        lud ludVar;
        AcceptancePaymentNotification acceptancePaymentNotification;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        tt2 tt2Var2 = cVar.c;
        if (continuationImpl instanceof AcceptancePaymentController$pollStatus$1) {
            acceptancePaymentController$pollStatus$1 = (AcceptancePaymentController$pollStatus$1) continuationImpl;
            int i2 = acceptancePaymentController$pollStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentController$pollStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptancePaymentController$pollStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentController$pollStatus$1.label;
                zy11 zy11Var = zy11.a;
                String str7 = null;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        tt2Var2.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        AcceptancePaymentController$pollStatus$result$1 acceptancePaymentController$pollStatus$result$1 = new AcceptancePaymentController$pollStatus$result$1(cVar, str6, null);
                        acceptancePaymentController$pollStatus$1.L$0 = str6;
                        sdVar2 = sdVar;
                        acceptancePaymentController$pollStatus$1.L$1 = sdVar2;
                        acceptancePaymentController$pollStatus$1.label = 1;
                        obj = tje.k0(mdhVar, acceptancePaymentController$pollStatus$result$1, acceptancePaymentController$pollStatus$1);
                        break;
                    case 1:
                        sd sdVar4 = (sd) acceptancePaymentController$pollStatus$1.L$1;
                        String str8 = (String) acceptancePaymentController$pollStatus$1.L$0;
                        kotlin.b.b(obj);
                        sdVar2 = sdVar4;
                        str6 = str8;
                        mudVar = (mud) obj;
                        lud ludVar2 = mudVar instanceof lud ? (lud) mudVar : null;
                        if (ludVar2 == null) {
                            acceptancePaymentController$pollStatus$1.L$0 = null;
                            acceptancePaymentController$pollStatus$1.L$1 = null;
                            acceptancePaymentController$pollStatus$1.L$2 = null;
                            acceptancePaymentController$pollStatus$1.L$3 = null;
                            acceptancePaymentController$pollStatus$1.label = 2;
                            return cVar.c(str6, sdVar2, acceptancePaymentController$pollStatus$1) == obj2 ? obj2 : zy11Var;
                        }
                        Long l = ludVar2.d;
                        long longValue = l != null ? l.longValue() : 3000L;
                        str2 = str6;
                        sdVar3 = sdVar2;
                        j = longValue;
                        z = mudVar instanceof lud;
                        if (z) {
                            lud ludVar3 = (lud) mudVar;
                            if (ludVar3.a == AcceptancePaymentStatus.PROCESSING) {
                                d dVar = cVar.h;
                                String str9 = ludVar3.b;
                                AcceptancePaymentUi acceptancePaymentUi = ludVar3.c;
                                if (str9 != null) {
                                    ff ffVar = cVar.e;
                                    if (!jl40.l(ffVar.d().l(ff.h(str2), str7), str9)) {
                                        ffVar.d().r(ff.h(str2), str9);
                                        cVar.i(str2, acceptancePaymentUi != null ? acceptancePaymentUi.a : str7, true, true);
                                        cVar.g(str9);
                                        sdVar3.c = true;
                                        cVar.e();
                                        if (sdVar3.e == AcceptancePaymentOrderContext.TRANSPORTING) {
                                            AcceptancePaymentNotification acceptancePaymentNotification2 = acceptancePaymentUi != null ? acceptancePaymentUi.a : str7;
                                            dVar.e.put(str2, new me(new rd(cVar, str2, 3), new rd(cVar, str2, 4)));
                                            qe qeVar = dVar.d;
                                            qeVar.b.put(str2, Boolean.FALSE);
                                            if (acceptancePaymentNotification2 == 0 || (str4 = acceptancePaymentNotification2.a) == null) {
                                                str4 = "";
                                            }
                                            String str10 = str4;
                                            String str11 = acceptancePaymentNotification2 != 0 ? acceptancePaymentNotification2.b : null;
                                            String str12 = acceptancePaymentNotification2 != 0 ? acceptancePaymentNotification2.c : null;
                                            AcceptancePaymentActionButton acceptancePaymentActionButton = acceptancePaymentNotification2 != 0 ? acceptancePaymentNotification2.d : null;
                                            if (acceptancePaymentActionButton != null) {
                                                AcceptancePaymentButtonAction acceptancePaymentButtonAction = acceptancePaymentActionButton.c;
                                                if ((acceptancePaymentButtonAction != null ? acceptancePaymentButtonAction.a : null) == AcceptancePaymentButtonActionType.CANCEL_PAYMENT) {
                                                    String str13 = acceptancePaymentActionButton.a;
                                                    if (str13.length() > 0) {
                                                        str5 = str13;
                                                        qeVar.b(str2, new we(str10, str11, str12, str5, true));
                                                        dVar.a(str2);
                                                    }
                                                }
                                            }
                                            str5 = null;
                                            qeVar.b(str2, new we(str10, str11, str12, str5, true));
                                            dVar.a(str2);
                                        }
                                    }
                                }
                                if (sdVar3.c && sdVar3.e == AcceptancePaymentOrderContext.TRANSPORTING) {
                                    cVar.i(str2, acceptancePaymentUi != null ? acceptancePaymentUi.a : null, true, true);
                                    cVar.e();
                                    rd rdVar = new rd(cVar, str2, 1);
                                    qe qeVar2 = dVar.d;
                                    if (acceptancePaymentUi == null || (acceptancePaymentNotification = acceptancePaymentUi.a) == null) {
                                        tt2Var = tt2Var2;
                                    } else {
                                        HashMap hashMap = dVar.e;
                                        me meVar = (me) hashMap.get(str2);
                                        hashMap.put(str2, meVar != null ? new me(meVar.a, rdVar) : new me(rdVar, 1));
                                        qeVar2.b.put(str2, Boolean.FALSE);
                                        String str14 = acceptancePaymentNotification.a;
                                        String str15 = acceptancePaymentNotification.b;
                                        String str16 = acceptancePaymentNotification.c;
                                        AcceptancePaymentActionButton acceptancePaymentActionButton2 = acceptancePaymentNotification.d;
                                        if (acceptancePaymentActionButton2 == null) {
                                            tt2Var = tt2Var2;
                                        } else {
                                            AcceptancePaymentButtonAction acceptancePaymentButtonAction2 = acceptancePaymentActionButton2.c;
                                            tt2Var = tt2Var2;
                                            if ((acceptancePaymentButtonAction2 != null ? acceptancePaymentButtonAction2.a : null) == AcceptancePaymentButtonActionType.CANCEL_PAYMENT) {
                                                String str17 = acceptancePaymentActionButton2.a;
                                                if (str17.length() > 0) {
                                                    str3 = str17;
                                                    qeVar2.b(str2, new we(str14, str15, str16, str3, true));
                                                    dVar.a(str2);
                                                }
                                            }
                                        }
                                        str3 = null;
                                        qeVar2.b(str2, new we(str14, str15, str16, str3, true));
                                        dVar.a(str2);
                                    }
                                } else {
                                    tt2Var = tt2Var2;
                                    AcceptancePaymentFullscreen acceptancePaymentFullscreen = acceptancePaymentUi != null ? acceptancePaymentUi.b : null;
                                    if (acceptancePaymentFullscreen != null) {
                                        String str18 = acceptancePaymentFullscreen.a;
                                        if (str18.length() == 0) {
                                            str18 = sdVar3.d;
                                        }
                                        cVar.l(new xd(str18, acceptancePaymentFullscreen));
                                    }
                                }
                                acceptancePaymentController$pollStatus$1.L$0 = str2;
                                acceptancePaymentController$pollStatus$1.L$1 = sdVar3;
                                continuation = null;
                                acceptancePaymentController$pollStatus$1.L$2 = null;
                                acceptancePaymentController$pollStatus$1.L$3 = null;
                                acceptancePaymentController$pollStatus$1.J$0 = j;
                                acceptancePaymentController$pollStatus$1.label = 3;
                                break;
                            }
                        }
                        String str19 = str7;
                        ludVar = !z ? (lud) mudVar : str19;
                        if (ludVar != 0) {
                            acceptancePaymentController$pollStatus$1.L$0 = str19;
                            acceptancePaymentController$pollStatus$1.L$1 = str19;
                            acceptancePaymentController$pollStatus$1.L$2 = str19;
                            acceptancePaymentController$pollStatus$1.L$3 = str19;
                            acceptancePaymentController$pollStatus$1.L$4 = str19;
                            acceptancePaymentController$pollStatus$1.J$0 = j;
                            acceptancePaymentController$pollStatus$1.label = 7;
                            if (cVar.c(str2, sdVar3, acceptancePaymentController$pollStatus$1) == obj2) {
                            }
                        } else {
                            acceptancePaymentController$pollStatus$1.L$0 = str19;
                            acceptancePaymentController$pollStatus$1.L$1 = str19;
                            acceptancePaymentController$pollStatus$1.L$2 = str19;
                            acceptancePaymentController$pollStatus$1.L$3 = str19;
                            acceptancePaymentController$pollStatus$1.L$4 = str19;
                            acceptancePaymentController$pollStatus$1.J$0 = j;
                            acceptancePaymentController$pollStatus$1.label = 8;
                            Object d = cVar.d(str2, sdVar3, ludVar, acceptancePaymentController$pollStatus$1);
                            if (d != obj2) {
                                return d;
                            }
                        }
                    case 2:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 3:
                        j = acceptancePaymentController$pollStatus$1.J$0;
                        sdVar3 = (sd) acceptancePaymentController$pollStatus$1.L$1;
                        str2 = (String) acceptancePaymentController$pollStatus$1.L$0;
                        kotlin.b.b(obj);
                        tt2Var = tt2Var2;
                        continuation = null;
                        Lifecycle lifecycle = cVar.a;
                        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                        acceptancePaymentController$pollStatus$1.L$0 = str2;
                        acceptancePaymentController$pollStatus$1.L$1 = sdVar3;
                        acceptancePaymentController$pollStatus$1.L$2 = continuation;
                        acceptancePaymentController$pollStatus$1.L$3 = continuation;
                        acceptancePaymentController$pollStatus$1.J$0 = j;
                        acceptancePaymentController$pollStatus$1.label = 4;
                        break;
                    case 4:
                        j = acceptancePaymentController$pollStatus$1.J$0;
                        sdVar3 = (sd) acceptancePaymentController$pollStatus$1.L$1;
                        str2 = (String) acceptancePaymentController$pollStatus$1.L$0;
                        kotlin.b.b(obj);
                        tt2Var = tt2Var2;
                        continuation = null;
                        tt2Var.getClass();
                        sjh sjhVar2 = uyj.a;
                        mdh mdhVar2 = mdh.b;
                        AcceptancePaymentController$pollStatus$2 acceptancePaymentController$pollStatus$2 = new AcceptancePaymentController$pollStatus$2(cVar, str2, continuation);
                        acceptancePaymentController$pollStatus$1.L$0 = str2;
                        acceptancePaymentController$pollStatus$1.L$1 = sdVar3;
                        acceptancePaymentController$pollStatus$1.L$2 = continuation;
                        acceptancePaymentController$pollStatus$1.L$3 = continuation;
                        acceptancePaymentController$pollStatus$1.J$0 = j;
                        acceptancePaymentController$pollStatus$1.label = 5;
                        k0 = tje.k0(mdhVar2, acceptancePaymentController$pollStatus$2, acceptancePaymentController$pollStatus$1);
                        break;
                    case 5:
                        j = acceptancePaymentController$pollStatus$1.J$0;
                        sdVar3 = (sd) acceptancePaymentController$pollStatus$1.L$1;
                        str2 = (String) acceptancePaymentController$pollStatus$1.L$0;
                        kotlin.b.b(obj);
                        tt2Var = tt2Var2;
                        k0 = obj;
                        continuation = null;
                        mud mudVar2 = (mud) k0;
                        if (!(mudVar2 instanceof kud)) {
                            if (!(mudVar2 instanceof lud)) {
                                w511.b();
                                return null;
                            }
                            Long l2 = ((lud) mudVar2).d;
                            if (l2 != null) {
                                j = l2.longValue();
                            }
                            mudVar = mudVar2;
                            tt2Var2 = tt2Var;
                            str7 = null;
                            z = mudVar instanceof lud;
                            if (z) {
                            }
                            String str192 = str7;
                            if (!z) {
                            }
                            if (ludVar != 0) {
                            }
                        }
                        acceptancePaymentController$pollStatus$1.L$0 = continuation;
                        acceptancePaymentController$pollStatus$1.L$1 = continuation;
                        acceptancePaymentController$pollStatus$1.L$2 = continuation;
                        acceptancePaymentController$pollStatus$1.L$3 = continuation;
                        acceptancePaymentController$pollStatus$1.J$0 = j;
                        acceptancePaymentController$pollStatus$1.label = 6;
                        if (cVar.c(str2, sdVar3, acceptancePaymentController$pollStatus$1) == obj2) {
                        }
                        break;
                    case 7:
                    case 6:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        acceptancePaymentController$pollStatus$1 = new AcceptancePaymentController$pollStatus$1(cVar, continuationImpl);
        Object obj3 = acceptancePaymentController$pollStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentController$pollStatus$1.label;
        zy11 zy11Var2 = zy11.a;
        String str72 = null;
        switch (i) {
        }
    }

    public final void b(String str) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new AcceptancePaymentController$cancelPayment$1(this, str, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, sd sdVar, ContinuationImpl continuationImpl) {
        AcceptancePaymentController$handleError$1 acceptancePaymentController$handleError$1;
        int i;
        if (continuationImpl instanceof AcceptancePaymentController$handleError$1) {
            acceptancePaymentController$handleError$1 = (AcceptancePaymentController$handleError$1) continuationImpl;
            int i2 = acceptancePaymentController$handleError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentController$handleError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptancePaymentController$handleError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentController$handleError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = sdVar.c;
                    ff ffVar = this.e;
                    if (z && sdVar.e == AcceptancePaymentOrderContext.TRANSPORTING) {
                        ffVar.d().u("terminal_notification_pending_" + str, true);
                        this.h.c(str, null, new rd(this, str, 2));
                        j(str);
                        return zy11.a;
                    }
                    ffVar.a();
                    l(new wd(sdVar.b, null));
                    acceptancePaymentController$handleError$1.L$0 = null;
                    acceptancePaymentController$handleError$1.L$1 = null;
                    acceptancePaymentController$handleError$1.label = 1;
                    if (kotlinx.coroutines.a.i(1000L, acceptancePaymentController$handleError$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                e();
                return zy11.a;
            }
        }
        acceptancePaymentController$handleError$1 = new AcceptancePaymentController$handleError$1(this, continuationImpl);
        Object obj2 = acceptancePaymentController$handleError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentController$handleError$1.label;
        if (i != 0) {
        }
        e();
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (kotlinx.coroutines.a.i(2000, r5) == r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r5) == r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ca, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r5) == r6) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, sd sdVar, lud ludVar, ContinuationImpl continuationImpl) {
        AcceptancePaymentController$handleTerminalStatus$1 acceptancePaymentController$handleTerminalStatus$1;
        int i;
        String str2;
        AcceptancePaymentFullscreen acceptancePaymentFullscreen;
        AcceptancePaymentFullscreen acceptancePaymentFullscreen2;
        String str3;
        String str4;
        AcceptancePaymentFullscreen acceptancePaymentFullscreen3;
        if (continuationImpl instanceof AcceptancePaymentController$handleTerminalStatus$1) {
            acceptancePaymentController$handleTerminalStatus$1 = (AcceptancePaymentController$handleTerminalStatus$1) continuationImpl;
            int i2 = acceptancePaymentController$handleTerminalStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentController$handleTerminalStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptancePaymentController$handleTerminalStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentController$handleTerminalStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AcceptancePaymentStatus acceptancePaymentStatus = ludVar.a;
                    AcceptancePaymentUi acceptancePaymentUi = ludVar.c;
                    int i3 = td.b[acceptancePaymentStatus.ordinal()];
                    ff ffVar = this.e;
                    d dVar = this.h;
                    switch (i3) {
                        case 1:
                            int i4 = td.a[sdVar.e.ordinal()];
                            if (i4 == 1) {
                                i(str, acceptancePaymentUi != null ? acceptancePaymentUi.a : null, false, false);
                                ffVar.d().u("terminal_notification_pending_" + str, true);
                                dVar.d(str, acceptancePaymentUi);
                                e();
                                j(str);
                                break;
                            } else if (i4 != 2) {
                                w511.b();
                                break;
                            } else {
                                dVar.b(str);
                                ffVar.a();
                                if (acceptancePaymentUi == null || (acceptancePaymentFullscreen = acceptancePaymentUi.b) == null || (str2 = acceptancePaymentFullscreen.a) == null) {
                                    str2 = "";
                                }
                                l(new yd(str2));
                                acceptancePaymentController$handleTerminalStatus$1.L$0 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$1 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$2 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$3 = null;
                                acceptancePaymentController$handleTerminalStatus$1.label = 1;
                                break;
                            }
                            break;
                        case 2:
                            boolean z = sdVar.c;
                            String str5 = sdVar.b;
                            if (!z || sdVar.e != AcceptancePaymentOrderContext.TRANSPORTING) {
                                dVar.b(str);
                                ffVar.a();
                                if (acceptancePaymentUi != null && (acceptancePaymentFullscreen2 = acceptancePaymentUi.b) != null && (str3 = acceptancePaymentFullscreen2.a) != null) {
                                    if (str3.length() == 0) {
                                        str3 = str5;
                                    }
                                    if (str3 != null) {
                                        str5 = str3;
                                    }
                                }
                                l(new wd(str5, acceptancePaymentUi != null ? acceptancePaymentUi.b : null));
                                acceptancePaymentController$handleTerminalStatus$1.L$0 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$1 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$2 = null;
                                acceptancePaymentController$handleTerminalStatus$1.L$3 = null;
                                acceptancePaymentController$handleTerminalStatus$1.label = 2;
                                break;
                            } else {
                                i(str, acceptancePaymentUi != null ? acceptancePaymentUi.a : null, false, false);
                                ffVar.d().u("terminal_notification_pending_" + str, true);
                                dVar.c(str, acceptancePaymentUi, new rd(this, str, 0));
                                j(str);
                                break;
                            }
                            break;
                        case 3:
                            if (sdVar.e != AcceptancePaymentOrderContext.TRANSPORTING) {
                                dVar.b(str);
                                ffVar.a();
                                e();
                                break;
                            } else {
                                i(str, acceptancePaymentUi != null ? acceptancePaymentUi.a : null, false, false);
                                ffVar.d().u("terminal_notification_pending_" + str, true);
                                dVar.d(str, acceptancePaymentUi);
                                e();
                                j(str);
                                break;
                            }
                        case 4:
                            dVar.b(str);
                            ffVar.a();
                            if (acceptancePaymentUi != null && (acceptancePaymentFullscreen3 = acceptancePaymentUi.b) != null && (str4 = acceptancePaymentFullscreen3.a) != null) {
                                if (str4.length() == 0) {
                                    str4 = sdVar.b;
                                    break;
                                }
                            }
                            str4 = sdVar.b;
                            l(new wd(str4, acceptancePaymentUi != null ? acceptancePaymentUi.b : null));
                            acceptancePaymentController$handleTerminalStatus$1.L$0 = null;
                            acceptancePaymentController$handleTerminalStatus$1.L$1 = null;
                            acceptancePaymentController$handleTerminalStatus$1.L$2 = null;
                            acceptancePaymentController$handleTerminalStatus$1.L$3 = null;
                            acceptancePaymentController$handleTerminalStatus$1.label = 3;
                            break;
                        case 5:
                        case 6:
                            dVar.b(str);
                            ffVar.a();
                            l(new wd(sdVar.b, null));
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    return null;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    e();
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    e();
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e();
                }
                return zy11.a;
            }
        }
        acceptancePaymentController$handleTerminalStatus$1 = new AcceptancePaymentController$handleTerminalStatus$1(this, continuationImpl);
        Object obj2 = acceptancePaymentController$handleTerminalStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentController$handleTerminalStatus$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void e() {
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.m(null, bf.a);
    }

    public final void f(String str) {
        HashMap hashMap = this.j;
        l8x l8xVar = (l8x) hashMap.get(str);
        if (l8xVar == null || !l8xVar.isActive()) {
            hashMap.put(str, tje.N(this.b, null, null, new AcceptancePaymentController$observeOrderCompletion$1(this, str, null), 3));
        }
    }

    public final void g(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(SelfTester_JCP.IMITA);
        ((a60) this.g).b(intent);
    }

    public final void h(AcceptancePaymentOrderContext acceptancePaymentOrderContext) {
        Object obj;
        AcceptancePaymentOrderContext acceptancePaymentOrderContext2;
        AcceptancePaymentOrderContext acceptancePaymentOrderContext3;
        pzt0 pzt0Var;
        ff ffVar = this.e;
        String l = ffVar.d().l("active_order_id", null);
        if (l == null) {
            return;
        }
        String l2 = ffVar.d().l(ff.g(l), null);
        if (l2 == null) {
            acceptancePaymentOrderContext2 = null;
        } else {
            AcceptancePaymentOrderContext.Companion.getClass();
            Iterator<E> it = AcceptancePaymentOrderContext.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (cvu0.t(((AcceptancePaymentOrderContext) obj).getWireName(), l2, true)) {
                        break;
                    }
                }
            }
            acceptancePaymentOrderContext2 = (AcceptancePaymentOrderContext) obj;
        }
        if (acceptancePaymentOrderContext2 == null) {
            acceptancePaymentOrderContext2 = acceptancePaymentOrderContext;
        }
        HashMap hashMap = this.i;
        sd sdVar = (sd) hashMap.get(l);
        if (sdVar != null && (pzt0Var = sdVar.a) != null && pzt0Var.isActive()) {
            boolean g = ffVar.d().g("terminal_notification_pending_".concat(l), false);
            if (acceptancePaymentOrderContext == AcceptancePaymentOrderContext.COMPLETE && sdVar.e == AcceptancePaymentOrderContext.TRANSPORTING && !g) {
                k(l);
                return;
            } else {
                if (sdVar.c && sdVar.e == AcceptancePaymentOrderContext.TRANSPORTING) {
                    this.h.b(l);
                    return;
                }
                return;
            }
        }
        String l3 = ffVar.d().l(ff.e(l), "");
        if (l3 == null) {
            l3 = "";
        }
        String l4 = ffVar.d().l(ff.f(l), "");
        sd sdVar2 = new sd(l3, l4 != null ? l4 : "", acceptancePaymentOrderContext2, 5);
        hashMap.put(l, sdVar2);
        f(l);
        String l5 = ffVar.d().l(ff.h(l), null);
        boolean g2 = ffVar.d().g("terminal_notification_pending_".concat(l), false);
        String str = sdVar2.d;
        if (l5 != null) {
            sdVar2.c = true;
            AcceptancePaymentOrderContext acceptancePaymentOrderContext4 = sdVar2.e;
            AcceptancePaymentOrderContext acceptancePaymentOrderContext5 = AcceptancePaymentOrderContext.TRANSPORTING;
            if (acceptancePaymentOrderContext4 == acceptancePaymentOrderContext5 && acceptancePaymentOrderContext == (acceptancePaymentOrderContext3 = AcceptancePaymentOrderContext.COMPLETE) && !g2) {
                sdVar2.e = acceptancePaymentOrderContext3;
                l(new xd(str, null));
            } else if (acceptancePaymentOrderContext4 != acceptancePaymentOrderContext5) {
                l(new xd(str, null));
            }
        } else {
            l(new xd(str, null));
        }
        sdVar2.a = tje.N(this.b, null, null, new AcceptancePaymentController$restoreIfNeeded$1(this, l, sdVar2, null), 3);
    }

    public final void i(String str, AcceptancePaymentNotification acceptancePaymentNotification, boolean z, boolean z2) {
        if (acceptancePaymentNotification == null) {
            return;
        }
        String str2 = acceptancePaymentNotification.a;
        String str3 = acceptancePaymentNotification.b;
        String str4 = acceptancePaymentNotification.c;
        AcceptancePaymentActionButton acceptancePaymentActionButton = acceptancePaymentNotification.d;
        String str5 = null;
        if (z && acceptancePaymentActionButton != null) {
            AcceptancePaymentButtonAction acceptancePaymentButtonAction = acceptancePaymentActionButton.c;
            if ((acceptancePaymentButtonAction != null ? acceptancePaymentButtonAction.a : null) == AcceptancePaymentButtonActionType.CANCEL_PAYMENT) {
                String str6 = acceptancePaymentActionButton.a;
                if (str6.length() > 0) {
                    str5 = str6;
                }
            }
        }
        ff ffVar = this.e;
        ffVar.d().r("notification_title_" + str, str2);
        ffVar.d().r("notification_subtitle_" + str, str3);
        ffVar.d().r("notification_image_tag_" + str, str4);
        ffVar.d().r("notification_cancel_button_title_" + str, str5);
        ffVar.d().u("notification_shimmering_" + str, z2);
    }

    public final void j(String str) {
        HashMap hashMap = this.k;
        l8x l8xVar = (l8x) hashMap.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        hashMap.put(str, tje.N(this.b, null, null, new AcceptancePaymentController$scheduleNotificationCleanup$1(this, str, null), 3));
    }

    public final void k(String str) {
        pzt0 pzt0Var;
        sd sdVar = (sd) this.i.get(str);
        if (sdVar != null && sdVar.e == AcceptancePaymentOrderContext.TRANSPORTING && (pzt0Var = sdVar.a) != null && pzt0Var.isActive()) {
            AcceptancePaymentOrderContext acceptancePaymentOrderContext = AcceptancePaymentOrderContext.COMPLETE;
            sdVar.e = acceptancePaymentOrderContext;
            this.e.d().r(ff.g(str), acceptancePaymentOrderContext.getWireName());
            d dVar = this.h;
            dVar.e.clear();
            qe qeVar = dVar.d;
            Iterator it = qeVar.a.values().iterator();
            while (it.hasNext()) {
                ((r0) ((pz40) it.next())).l(null);
            }
            qeVar.b.clear();
            qeVar.c.clear();
            l(new xd(sdVar.d, null));
        }
    }

    public final void l(zd zdVar) {
        r0 r0Var = this.n;
        r0Var.getClass();
        r0Var.m(null, zdVar);
        r0 r0Var2 = this.l;
        r0Var2.getClass();
        r0Var2.m(null, af.a);
    }

    public final void m(String str, String str2, String str3, AcceptancePaymentOrderContext acceptancePaymentOrderContext) {
        pzt0 pzt0Var;
        l8x l8xVar = (l8x) this.k.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        HashMap hashMap = this.i;
        sd sdVar = (sd) hashMap.get(str);
        if (sdVar == null || (pzt0Var = sdVar.a) == null || !pzt0Var.isActive()) {
            sd sdVar2 = new sd(str3, str2, acceptancePaymentOrderContext, 5);
            hashMap.put(str, sdVar2);
            f(str);
            ff ffVar = this.e;
            ffVar.d().r("active_order_id", str);
            ffVar.d().r(ff.g(str), acceptancePaymentOrderContext.getWireName());
            ffVar.d().r(ff.f(str), str2);
            ffVar.d().r(ff.e(str), str3);
            l(new xd(str2, null));
            sdVar2.a = tje.N(this.b, null, null, new AcceptancePaymentController$startPayment$1(this, str, sdVar2, null), 3);
        }
    }
}
