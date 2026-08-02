package com.yandex.go.quark.dynamic;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.quark.ai_assistant.api.chat.ChatViewNavigationEntry$Type;
import com.yandex.quark.js.implementation.facade.PreferredDirectivePayloadFormat;
import com.yandex.quark.js.serializer.JsDataSerializationStrategy;
import com.yandex.quark.webchat.params.WebChatParams;
import defpackage.azq;
import defpackage.be41;
import defpackage.bst;
import defpackage.bvf0;
import defpackage.c2b;
import defpackage.ce41;
import defpackage.csf0;
import defpackage.eci0;
import defpackage.ee41;
import defpackage.ep41;
import defpackage.exz0;
import defpackage.feh;
import defpackage.fm60;
import defpackage.fxz0;
import defpackage.gd41;
import defpackage.gxz0;
import defpackage.h3y;
import defpackage.hpe;
import defpackage.hst;
import defpackage.i10;
import defpackage.i1r;
import defpackage.i3y;
import defpackage.id41;
import defpackage.ike;
import defpackage.ipe;
import defpackage.j10;
import defpackage.j1r;
import defpackage.jhg0;
import defpackage.jl;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jyj0;
import defpackage.k10;
import defpackage.kd41;
import defpackage.ke00;
import defpackage.ke41;
import defpackage.kj;
import defpackage.kxj0;
import defpackage.lb7;
import defpackage.ld41;
import defpackage.lxj0;
import defpackage.lyj0;
import defpackage.mih;
import defpackage.mxj0;
import defpackage.nfh;
import defpackage.nm3;
import defpackage.nxj0;
import defpackage.ny61;
import defpackage.opt;
import defpackage.oxj0;
import defpackage.pe41;
import defpackage.po21;
import defpackage.ppe;
import defpackage.pxj0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qe41;
import defpackage.qoh;
import defpackage.qpe;
import defpackage.qqe;
import defpackage.qsy0;
import defpackage.rqe;
import defpackage.ru2;
import defpackage.sd41;
import defpackage.se41;
import defpackage.sgh;
import defpackage.sls;
import defpackage.sqe;
import defpackage.syj0;
import defpackage.t6z;
import defpackage.t830;
import defpackage.td41;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ud41;
import defpackage.uig0;
import defpackage.uyj;
import defpackage.va90;
import defpackage.vd41;
import defpackage.vdb;
import defpackage.vig0;
import defpackage.vnh;
import defpackage.w511;
import defpackage.wj21;
import defpackage.wly0;
import defpackage.wsr0;
import defpackage.x2n;
import defpackage.xa20;
import defpackage.xc41;
import defpackage.xsr0;
import defpackage.yig0;
import defpackage.yq6;
import defpackage.yr1;
import defpackage.z3x0;
import defpackage.zc41;
import defpackage.zq6;
import defpackage.zwf0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class h {
    public final Context a;
    public final tse b;
    public final Lifecycle c;
    public final yig0 d;
    public final bst e;
    public final ru.yandex.taxi.am.g f;
    public final opt g;
    public final ru.yandex.taxi.am.token.a h;
    public final po21 i;
    public final com.yandex.go.route.interactor.b j;
    public final c2b k;
    public final h3y l;
    public final i3y m;
    public final pzt0 n;
    public final pzt0 o;
    public final pzt0 p;
    public final qoh q;
    public final r0 r;

    public h(Context context, tse tseVar, Lifecycle lifecycle, yig0 yig0Var, bst bstVar, ru.yandex.taxi.am.g gVar, tt2 tt2Var, opt optVar, ru.yandex.taxi.am.token.a aVar, po21 po21Var, com.yandex.go.route.interactor.b bVar, c2b c2bVar, h3y h3yVar, ru2 ru2Var) {
        this.a = context;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = yig0Var;
        this.e = bstVar;
        this.f = gVar;
        this.g = optVar;
        this.h = aVar;
        this.i = po21Var;
        this.j = bVar;
        this.k = c2bVar;
        this.l = h3yVar;
        this.m = kotlin.a.a(new csf0(4, ru2Var));
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        this.n = tje.N(tseVar, null, coroutineStart, new QuarkServiceImpl$updateQuarkAccountJob$1(this, null), 1);
        this.o = tje.N(tseVar, null, coroutineStart, new QuarkServiceImpl$updateQuarkLocationJob$1(this, null), 1);
        this.p = tje.N(tseVar, null, coroutineStart, new QuarkServiceImpl$updateGoCapabilityLocationJob$1(this, null), 1);
        tt2Var.getClass();
        this.q = tje.h(tseVar, uyj.a, null, new QuarkServiceImpl$quarkFeaturesDeferred$1(this, null), 2);
        this.r = bvf0.c(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, kj kjVar, Continuation continuation) {
        QuarkServiceImpl$configureQuarkAccount$1 quarkServiceImpl$configureQuarkAccount$1;
        int i;
        nm3 nm3Var;
        Long l;
        Object d;
        nm3 nm3Var2;
        Object obj;
        Long l2;
        zy11 zy11Var;
        hVar.getClass();
        if (continuation instanceof QuarkServiceImpl$configureQuarkAccount$1) {
            quarkServiceImpl$configureQuarkAccount$1 = (QuarkServiceImpl$configureQuarkAccount$1) continuation;
            int i2 = quarkServiceImpl$configureQuarkAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkServiceImpl$configureQuarkAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = quarkServiceImpl$configureQuarkAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkServiceImpl$configureQuarkAccount$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hst hstVar = jst.e;
                    ke00 a = hstVar.b.a();
                    if (a != null && a.b(10)) {
                        a.a(10, "QuarkService", null, "Updating Quark auth data...", hstVar.a);
                    }
                    qoh qohVar = hVar.q;
                    quarkServiceImpl$configureQuarkAccount$1.L$0 = kjVar;
                    quarkServiceImpl$configureQuarkAccount$1.label = 1;
                    obj2 = qohVar.s(quarkServiceImpl$configureQuarkAccount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) quarkServiceImpl$configureQuarkAccount$1.L$2;
                        nm3Var2 = (nm3) quarkServiceImpl$configureQuarkAccount$1.L$1;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        str = (String) (obj instanceof Result.Failure ? null : obj);
                        l = l2;
                        nm3Var = nm3Var2;
                        zy11Var = zy11.a;
                        if (l != null || str == null) {
                            xa20 xa20Var = nm3Var.b;
                            xa20Var.b(ppe.d);
                            nm3Var.a.e();
                            xa20Var.b(qpe.d);
                            q5z.N();
                            if (zy11Var != null) {
                                hst hstVar2 = jst.e;
                                ke00 a2 = hstVar2.b.a();
                                if (a2 != null && a2.b(10)) {
                                    a2.a(10, null, null, "Quark auth data dropped", hstVar2.a);
                                }
                            }
                        } else {
                            jl jlVar = new jl(String.valueOf(l.longValue()), str);
                            xa20 xa20Var2 = nm3Var.b;
                            xa20Var2.b(hpe.d);
                            nm3Var.a.h(jlVar);
                            xa20Var2.b(ipe.d);
                            q5z.N();
                            if (zy11Var != null) {
                                hst hstVar3 = jst.e;
                                ke00 a3 = hstVar3.b.a();
                                if (a3 != null && a3.b(10)) {
                                    a3.a(10, null, null, "Quark auth data set", hstVar3.a);
                                }
                            }
                        }
                        return zy11Var;
                    }
                    kjVar = (kj) quarkServiceImpl$configureQuarkAccount$1.L$0;
                    kotlin.b.b(obj2);
                }
                nm3Var = ((uig0) obj2).d;
                l = kjVar == null ? new Long(kjVar.a) : null;
                if (kjVar != null) {
                    ru.yandex.taxi.am.token.a aVar = hVar.h;
                    quarkServiceImpl$configureQuarkAccount$1.L$0 = null;
                    quarkServiceImpl$configureQuarkAccount$1.L$1 = nm3Var;
                    quarkServiceImpl$configureQuarkAccount$1.L$2 = l;
                    quarkServiceImpl$configureQuarkAccount$1.label = 2;
                    d = aVar.d(false, quarkServiceImpl$configureQuarkAccount$1);
                    if (d != coroutineSingletons) {
                        nm3Var2 = nm3Var;
                        obj = d;
                        l2 = l;
                        str = (String) (obj instanceof Result.Failure ? null : obj);
                        l = l2;
                        nm3Var = nm3Var2;
                    }
                    return coroutineSingletons;
                }
                zy11Var = zy11.a;
                if (l != null) {
                }
                xa20 xa20Var3 = nm3Var.b;
                xa20Var3.b(ppe.d);
                nm3Var.a.e();
                xa20Var3.b(qpe.d);
                q5z.N();
                if (zy11Var != null) {
                }
                return zy11Var;
            }
        }
        quarkServiceImpl$configureQuarkAccount$1 = new QuarkServiceImpl$configureQuarkAccount$1(hVar, continuation);
        Object obj22 = quarkServiceImpl$configureQuarkAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkServiceImpl$configureQuarkAccount$1.label;
        String str2 = null;
        if (i != 0) {
        }
        nm3Var = ((uig0) obj22).d;
        if (kjVar == null) {
        }
        if (kjVar != null) {
        }
        zy11Var = zy11.a;
        if (l != null) {
        }
        xa20 xa20Var32 = nm3Var.b;
        xa20Var32.b(ppe.d);
        nm3Var.a.e();
        xa20Var32.b(qpe.d);
        q5z.N();
        if (zy11Var != null) {
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, Address address, Continuation continuation) {
        QuarkServiceImpl$configureQuarkLocation$1 quarkServiceImpl$configureQuarkLocation$1;
        int i;
        feh fehVar;
        Object obj;
        Object obj2;
        hVar.getClass();
        if (continuation instanceof QuarkServiceImpl$configureQuarkLocation$1) {
            quarkServiceImpl$configureQuarkLocation$1 = (QuarkServiceImpl$configureQuarkLocation$1) continuation;
            int i2 = quarkServiceImpl$configureQuarkLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkServiceImpl$configureQuarkLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = quarkServiceImpl$configureQuarkLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkServiceImpl$configureQuarkLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    qoh qohVar = hVar.q;
                    quarkServiceImpl$configureQuarkLocation$1.L$0 = address;
                    quarkServiceImpl$configureQuarkLocation$1.label = 1;
                    obj3 = qohVar.s(quarkServiceImpl$configureQuarkLocation$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    address = (Address) quarkServiceImpl$configureQuarkLocation$1.L$0;
                    kotlin.b.b(obj3);
                }
                fehVar = ((uig0) obj3).b;
                t6z t6zVar = new t6z(address.B().a, address.B().b, address.B().c);
                xa20 xa20Var = fehVar.c;
                xa20Var.b(rqe.d);
                fehVar.w = t6zVar;
                if (fehVar.x) {
                    syj0 a = fehVar.a(t6zVar);
                    lyj0 lyj0Var = a instanceof lyj0 ? (lyj0) a : null;
                    if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
                        xa20Var.b(sqe.d);
                    }
                    jyj0 jyj0Var = a instanceof jyj0 ? (jyj0) a : null;
                    if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                        xa20Var.e(new qqe(((jhg0) obj).b));
                    }
                }
                return zy11.a;
            }
        }
        quarkServiceImpl$configureQuarkLocation$1 = new QuarkServiceImpl$configureQuarkLocation$1(hVar, continuation);
        Object obj32 = quarkServiceImpl$configureQuarkLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkServiceImpl$configureQuarkLocation$1.label;
        if (i != 0) {
        }
        fehVar = ((uig0) obj32).b;
        t6z t6zVar2 = new t6z(address.B().a, address.B().b, address.B().c);
        xa20 xa20Var2 = fehVar.c;
        xa20Var2.b(rqe.d);
        fehVar.w = t6zVar2;
        if (fehVar.x) {
        }
        return zy11.a;
    }

    public static final vdb c(h hVar, gxz0 gxz0Var) {
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type;
        if (jl40.l(gxz0Var, fxz0.a)) {
            return null;
        }
        if (!(gxz0Var instanceof exz0)) {
            w511.b();
            return null;
        }
        exz0 exz0Var = (exz0) gxz0Var;
        String b = exz0Var.a().b();
        int i = vig0.a[exz0Var.a().d().ordinal()];
        if (i == 1) {
            chatViewNavigationEntry$Type = ChatViewNavigationEntry$Type.UNKNOWN;
        } else if (i == 2) {
            chatViewNavigationEntry$Type = ChatViewNavigationEntry$Type.CHAT;
        } else if (i == 3) {
            chatViewNavigationEntry$Type = ChatViewNavigationEntry$Type.CHAT_LIST;
        } else if (i == 4) {
            chatViewNavigationEntry$Type = ChatViewNavigationEntry$Type.SKILL;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            chatViewNavigationEntry$Type = ChatViewNavigationEntry$Type.CHAT_FOLDER;
        }
        return new vdb(b, chatViewNavigationEntry$Type, exz0Var.a().c(), exz0Var.a().a());
    }

    public static final com.yandex.quark.lite.b d(h hVar) {
        return (com.yandex.quark.lite.b) hVar.m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, ContinuationImpl continuationImpl) {
        QuarkServiceImpl$createChatViewController$1 quarkServiceImpl$createChatViewController$1;
        int i;
        Context context2;
        ld41 ld41Var;
        z3x0 z3x0Var;
        WebChatParams webChatParams;
        boolean z;
        mih mihVar;
        vnh vnhVar;
        vd41 td41Var;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof QuarkServiceImpl$createChatViewController$1) {
            quarkServiceImpl$createChatViewController$1 = (QuarkServiceImpl$createChatViewController$1) continuationImpl;
            int i2 = quarkServiceImpl$createChatViewController$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkServiceImpl$createChatViewController$1.label = i2 - Integer.MIN_VALUE;
                Object obj = quarkServiceImpl$createChatViewController$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkServiceImpl$createChatViewController$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    quarkServiceImpl$createChatViewController$1.L$0 = context;
                    quarkServiceImpl$createChatViewController$1.label = 1;
                    Object s = this.q.s(quarkServiceImpl$createChatViewController$1);
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context2 = context;
                    obj = s;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Context context3 = (Context) quarkServiceImpl$createChatViewController$1.L$0;
                    kotlin.b.b(obj);
                    context2 = context3;
                }
                uig0 uig0Var = (uig0) obj;
                ld41Var = uig0Var.c;
                if (ld41Var != null) {
                    ny61.r("Trying to create ChatView with disabled ChatFeature");
                    return null;
                }
                xc41 xc41Var = (xc41) ld41Var;
                kd41 kd41Var = xc41Var.C;
                zc41 zc41Var = xc41Var.a;
                com.yandex.quark.webchat.feature.delegate.b bVar = kd41Var.n;
                ike ikeVar = kd41Var.b;
                lb7 lb7Var = kd41Var.m;
                zwf0 zwf0Var = kd41Var.f;
                if (bVar != null) {
                    bVar.f.dispose();
                    bvf0.j(bVar.e, null);
                }
                mxj0 mxj0Var = zc41Var.e;
                if (mxj0Var instanceof kxj0) {
                    z3x0Var = ((kxj0) mxj0Var).a;
                } else {
                    if (!(mxj0Var instanceof lxj0)) {
                        w511.b();
                        return null;
                    }
                    new fm60();
                    z3x0Var = new z3x0(0);
                }
                com.yandex.quark.webchat.feature.delegate.b bVar2 = new com.yandex.quark.webchat.feature.delegate.b(kd41Var.a, ikeVar, kd41Var.c, kd41Var.d, kd41Var.e, zwf0Var, kd41Var.g, kd41Var.h, kd41Var.i, kd41Var.k, zc41Var, kd41Var.j, new com.yandex.quark.webchat.auth.internal.a(z3x0Var, zwf0Var, lb7Var, ikeVar), kd41Var.l, lb7Var);
                kd41Var.n = bVar2;
                gd41 gd41Var = new gd41(bVar2);
                qe41 qe41Var = bVar2.m;
                t830 t830Var = qe41Var.u;
                zq6 zq6Var = qe41Var.d;
                zwf0 zwf0Var2 = qe41Var.c;
                yq6 yq6Var = qe41Var.l;
                WebChatParams webChatParams2 = zc41Var.f;
                ep41 ep41Var = new ep41();
                sgh sghVar = new sgh();
                nfh nfhVar = qe41Var.r;
                x2n x2nVar = zc41Var.o;
                wly0 wly0Var = qe41Var.b;
                com.yandex.quark.webchat.js.d dVar = qe41Var.j;
                id41 id41Var = qe41Var.t;
                ee41 ee41Var = webChatParams2.d;
                JsDataSerializationStrategy jsDataSerializationStrategy = JsDataSerializationStrategy.JSON;
                int i3 = sd41.a[webChatParams2.f.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    webChatParams = webChatParams2;
                    z = false;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    webChatParams = webChatParams2;
                    z = true;
                }
                Context context4 = context2;
                mih mihVar2 = new mih(new com.yandex.quark.js.implementation.webView.internal.c(zwf0Var2, new com.yandex.quark.utils.assets.internal.a(context2, new wly0()), wly0Var, ep41Var, sghVar, zq6Var, id41Var, yq6Var, jsDataSerializationStrategy, z), zwf0Var2, zq6Var, new t830(kotlin.collections.b.f(), true), x2nVar, PreferredDirectivePayloadFormat.JSON);
                dVar.c(mihVar2, nfhVar);
                yr1 yr1Var = new yr1(mihVar2, t830Var);
                ee41Var.getClass();
                j1r j1rVar = new j1r();
                i1r i1rVar = new i1r();
                qsy0 qsy0Var = new qsy0();
                pxj0 pxj0Var = zc41Var.d;
                if (pxj0Var instanceof nxj0) {
                    vnhVar = ((nxj0) pxj0Var).a;
                    mihVar = mihVar2;
                } else {
                    if (!(pxj0Var instanceof oxj0)) {
                        w511.b();
                        return null;
                    }
                    mihVar = mihVar2;
                    vnhVar = new vnh(zwf0Var2, qe41Var.s, zq6Var, false, false);
                }
                com.yandex.quark.webchat.feature.delegate.b bVar3 = (com.yandex.quark.webchat.feature.delegate.b) qe41Var.k.b;
                com.yandex.quark.webchat.c cVar = new com.yandex.quark.webchat.c(bVar3.l.l, bVar3.e, bVar3.g.a, sghVar.b);
                com.yandex.quark.webchat.g gVar = qe41Var.e;
                azq azqVar = qe41Var.f;
                va90 va90Var = qe41Var.g;
                wj21 wj21Var = qe41Var.h;
                ke41 ke41Var = qe41Var.i;
                com.yandex.quark.webchat.navigation.internal.a aVar = new com.yandex.quark.webchat.navigation.internal.a(yr1Var, mihVar, zwf0Var2, t830Var);
                sls slsVar = qe41Var.m;
                tig0 tig0Var = qe41Var.n;
                int i4 = pe41.a[webChatParams.f.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    td41Var = new td41(qe41Var.o);
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    td41Var = new ud41();
                }
                be41 be41Var = webChatParams.e;
                ce41 ce41Var = webChatParams.g;
                eci0 eci0Var = qe41Var.a;
                vd41 vd41Var = td41Var;
                ike ikeVar2 = mihVar.a.a;
                mih mihVar3 = mihVar;
                j10 j10Var = new j10(yr1Var.a, new k10(), zwf0Var2, 0);
                xsr0.a.getClass();
                kotlinx.coroutines.flow.e.R(j10Var, ikeVar2, wsr0.c, i10.a);
                se41 se41Var = new se41(context4, vnhVar, zwf0Var2, zq6Var, cVar, gVar, azqVar, j1rVar, i1rVar, qsy0Var, mihVar3, va90Var, wj21Var, ke41Var, ep41Var, aVar, yq6Var, slsVar, tig0Var, vd41Var, be41Var, ce41Var, eci0Var, null, qe41Var.p, gd41Var);
                do {
                    r0Var = this.r;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new Integer(((Number) value).intValue() + 1)));
                return new c(se41Var, this, uig0Var);
            }
        }
        quarkServiceImpl$createChatViewController$1 = new QuarkServiceImpl$createChatViewController$1(this, continuationImpl);
        Object obj2 = quarkServiceImpl$createChatViewController$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkServiceImpl$createChatViewController$1.label;
        if (i != 0) {
        }
        uig0 uig0Var2 = (uig0) obj2;
        ld41Var = uig0Var2.c;
        if (ld41Var != null) {
        }
    }

    public final void f() {
        tje.N(this.b, null, null, new QuarkServiceImpl$dispose$$inlined$collectIn$1(this.r, null, this), 3);
    }
}
