package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.support.view.timeline.TimelineLayoutManager;
import com.yandex.payment.common.result.ResultType;
import defpackage.b0x;
import defpackage.bae;
import defpackage.c1x0;
import defpackage.ct21;
import defpackage.dbb;
import defpackage.e1k;
import defpackage.eja1;
import defpackage.ev10;
import defpackage.fv10;
import defpackage.gc60;
import defpackage.gzw;
import defpackage.h3y;
import defpackage.h9z0;
import defpackage.hab;
import defpackage.haz0;
import defpackage.hkk;
import defpackage.iaz0;
import defpackage.ie60;
import defpackage.iki0;
import defpackage.io9;
import defpackage.j3b;
import defpackage.j6b;
import defpackage.jbz0;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jw10;
import defpackage.k3b;
import defpackage.k6b;
import defpackage.k7q0;
import defpackage.kgx;
import defpackage.kux0;
import defpackage.l7;
import defpackage.mdb;
import defpackage.nob1;
import defpackage.ny61;
import defpackage.obb;
import defpackage.oyh0;
import defpackage.oyr;
import defpackage.p420;
import defpackage.p4t;
import defpackage.pbb;
import defpackage.pbz0;
import defpackage.pcb;
import defpackage.ps10;
import defpackage.pu31;
import defpackage.q6b;
import defpackage.qaz0;
import defpackage.qbz0;
import defpackage.qdz0;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rh2;
import defpackage.sbb;
import defpackage.sbi0;
import defpackage.sdz0;
import defpackage.sfl0;
import defpackage.sq60;
import defpackage.sz01;
import defpackage.t3z;
import defpackage.tbb;
import defpackage.tbz0;
import defpackage.tcz0;
import defpackage.tdz0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ubb;
import defpackage.ucz0;
import defpackage.udu0;
import defpackage.ulg0;
import defpackage.uv10;
import defpackage.v4a;
import defpackage.vbb;
import defpackage.vse;
import defpackage.w3c;
import defpackage.wbb;
import defpackage.wbz0;
import defpackage.wcz0;
import defpackage.wk31;
import defpackage.x4t;
import defpackage.xbb;
import defpackage.y2t;
import defpackage.yab;
import defpackage.ybb;
import defpackage.z83;
import defpackage.zq60;
import defpackage.zt11;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class i extends Brick implements sdz0, ucz0 {
    public static final /* synthetic */ kgx[] f0 = {new MutablePropertyReference1Impl("timelineSubscription", 0, "getTimelineSubscription()Lcom/yandex/alicekit/core/Disposable;", i.class), oyr.B(qoi0.a, i.class, "notificationsLock", "getNotificationsLock()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final tdz0 A;
    public final qaz0 B;
    public final ChatInputHeightState C;
    public final h3y D;
    public final ChatItemHighlighter E;
    public final pu31 F;
    public final m G;
    public final dbb H;
    public final x4t I;
    public final ulg0 J;
    public final wk31 K;
    public final RecyclerView L;
    public final TimelineLayoutManager M;
    public final y2t N;
    public final k7q0 O;
    public LocalMessageRef R;
    public String S;
    public boolean T;
    public j3b U;
    public ServerMessageRef V;
    public LocalMessageRef W;
    public final ps10 a;
    public Long a0;
    public final ChatRequest b;
    public c1x0 b0;
    public final pbb c;
    public jhu0 c0;
    public final pbz0 d0;
    public final k6b w;
    public final p4t x;
    public final com.yandex.messaging.domain.d y;
    public final hab z;
    public final qp3 P = new qp3();
    public final qp3 Q = new qp3();
    public boolean Z = true;
    public final g e0 = new g(this);

    public i(ps10 ps10Var, ChatRequest chatRequest, pbb pbbVar, k6b k6bVar, p4t p4tVar, com.yandex.messaging.domain.d dVar, g0 g0Var, hab habVar, tdz0 tdz0Var, qaz0 qaz0Var, ChatInputHeightState chatInputHeightState, h3y h3yVar, q6b q6bVar, hkk hkkVar, ChatItemHighlighter chatItemHighlighter, w3c w3cVar, sbi0 sbi0Var, pu31 pu31Var, m mVar, wcz0 wcz0Var, dbb dbbVar, mdb mdbVar, com.yandex.messaging.internal.view.timeline.common.a aVar, pcb pcbVar, qbz0 qbz0Var, x4t x4tVar, ulg0 ulg0Var, wk31 wk31Var, vse vseVar) {
        sz01 sz01Var;
        String str;
        this.a = ps10Var;
        this.b = chatRequest;
        this.c = pbbVar;
        this.w = k6bVar;
        this.x = p4tVar;
        this.y = dVar;
        this.z = habVar;
        this.A = tdz0Var;
        this.B = qaz0Var;
        this.C = chatInputHeightState;
        this.D = h3yVar;
        this.E = chatItemHighlighter;
        this.F = pu31Var;
        this.G = mVar;
        this.H = dbbVar;
        this.I = x4tVar;
        this.J = ulg0Var;
        this.K = wk31Var;
        this.V = q6bVar.e;
        this.W = q6bVar.f;
        int i = 1;
        Context context = hkkVar.getContext();
        habVar.c.getClass();
        qaz0Var.c0 = true;
        this.N = new y2t(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.messaging.internal.view.timeline.ChatTimelineViewController$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Pair pair;
                String str2;
                String str3;
                i iVar = i.this;
                c1x0 c1x0Var = iVar.b0;
                View view = null;
                view = null;
                if (c1x0Var != null) {
                    jbz0 jbz0Var = (jbz0) c1x0Var.a;
                    j3b j3bVar = iVar.U;
                    if (j3bVar == null || !j3bVar.D) {
                        qaz0 qaz0Var2 = iVar.B;
                        RecyclerView recyclerView = qaz0Var2.Z;
                        if (recyclerView != null) {
                            qaz0Var2.z.getClass();
                            int x = (int) e.getX();
                            int y = (int) e.getY();
                            int childCount = recyclerView.getChildCount();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childCount) {
                                    break;
                                }
                                e eVar = (e) recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
                                if (eVar.N.contains(x, y)) {
                                    String str4 = eVar.c0;
                                    if (str4 != null && (str2 = eVar.f0) != null) {
                                        pair = new Pair(str2, str4);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        pair = null;
                        if (pair != null) {
                            if (iVar.T) {
                                String str5 = (String) pair.c();
                                sfl0 sfl0Var = jbz0Var.e;
                                p420 p420Var = p420.d;
                                j3b j3bVar2 = jbz0Var.E;
                                new bae(p420Var, j3bVar2 != null ? j3bVar2.b : null, str5);
                                ((b0x) sfl0Var).c();
                            }
                        }
                    } else if (iVar.T) {
                        String str6 = j3bVar.e;
                        if (str6 != null) {
                            sfl0 sfl0Var2 = jbz0Var.e;
                            p420 p420Var2 = p420.d;
                            j3b j3bVar3 = jbz0Var.E;
                            new bae(p420Var2, j3bVar3 != null ? j3bVar3.b : null, str6);
                            ((b0x) sfl0Var2).c();
                            return true;
                        }
                        sfl0 sfl0Var3 = jbz0Var.e;
                        p420 p420Var3 = p420.d;
                        j3b j3bVar4 = jbz0Var.E;
                        if (j3bVar4 == null || (str3 = j3bVar4.b) == null) {
                            ny61.g("must be initialized");
                            return false;
                        }
                        new k3b(p420Var3, str3, str3);
                        ((b0x) sfl0Var3).a.getClass();
                        return true;
                    }
                    return true;
                }
                qaz0 qaz0Var3 = i.this.B;
                Rect rect = qaz0Var3.B;
                RecyclerView recyclerView2 = qaz0Var3.Z;
                if (recyclerView2 != null) {
                    int x2 = (int) e.getX();
                    int y2 = (int) e.getY();
                    int childCount2 = recyclerView2.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount2) {
                            break;
                        }
                        View childAt = recyclerView2.getChildAt(i3);
                        childAt.getHitRect(rect);
                        rect.left = 0;
                        rect.right = recyclerView2.getWidth();
                        qdz0 qdz0Var = (qdz0) recyclerView2.getChildViewHolder(childAt);
                        wbz0 wbz0Var = qdz0Var.O;
                        if (qaz0Var3.b0 && (wbz0Var instanceof tbz0)) {
                            int i4 = rect.top;
                            h9z0 h9z0Var = qaz0Var3.z;
                            h9z0Var.getClass();
                            rect.top = i4 - (((qdz0) recyclerView2.getChildViewHolder(childAt)).O instanceof tbz0 ? h9z0Var.d : 0);
                        }
                        if (qdz0Var.W()) {
                            rect.bottom += qaz0Var3.G;
                        }
                        if (rect.contains(x2, y2)) {
                            view = childAt;
                            break;
                        }
                        i3++;
                    }
                }
                if (view == null) {
                    return false;
                }
                e.setLocation(e.getX() - view.getX(), e.getY() - view.getY());
                MotionEvent obtain = MotionEvent.obtain(e);
                obtain.setAction(0);
                view.dispatchTouchEvent(obtain);
                view.dispatchTouchEvent(e);
                obtain.recycle();
                return true;
            }
        }, null);
        TimelineLayoutManager timelineLayoutManager = new TimelineLayoutManager();
        timelineLayoutManager.L = true;
        timelineLayoutManager.M = qaz0Var;
        timelineLayoutManager.i1();
        timelineLayoutManager.P = true;
        timelineLayoutManager.Q = 1.0f;
        timelineLayoutManager.e0 = new v4a(9, this);
        this.M = timelineLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setRecycledViewPool(new gc60());
        recyclerView.setVerticalFadingEdgeEnabled(mdbVar.k);
        recyclerView.setFadingEdgeLength(mdbVar.l);
        recyclerView.setClipToPadding(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(timelineLayoutManager);
        recyclerView.addItemDecoration(qaz0Var);
        int i2 = 0;
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(habVar);
        recyclerView.setPadding(0, 0, 0, 0);
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new ubb(this));
        recyclerView.addOnScrollListener(new udu0(new vbb(this, recyclerView)));
        recyclerView.setTag(zt11.a, Boolean.TRUE);
        this.L = recyclerView;
        if (wk31Var.c) {
            this.d0 = new pbz0(recyclerView, new sbb(this, i2), vseVar);
        }
        qbz0Var.a = recyclerView;
        jw10 jw10Var = new jw10(context, new h(this));
        new androidx.recyclerview.widget.s(jw10Var).f(recyclerView);
        recyclerView.addOnScrollListener(new iki0(wcz0Var, wcz0Var.b));
        ((uv10) h3yVar.get()).c.b(new wbb(this, jw10Var));
        k7q0 k7q0Var = new k7q0(recyclerView, g0Var, w3cVar, aVar);
        this.O = k7q0Var;
        tdz0Var.a.b(this);
        recyclerView.setOnTouchListener(new rh2(i, jw10Var, this));
        sbi0Var.b = recyclerView;
        zq60 zq60Var = timelineLayoutManager.S;
        zq60Var.b(sbi0Var);
        zq60Var.b(k7q0Var);
        pcbVar.i.b();
        gzw gzwVar = pcbVar.j;
        if (!gzwVar.c || (sz01Var = pcbVar.e.p) == null || (str = sz01Var.a) == null) {
            return;
        }
        kotlinx.coroutines.flow.e.H(pcbVar.l, new l7(3, gzwVar.a(pcbVar.a), pcbVar, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(i iVar, ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        ChatTimelineViewController$checkThreadsExistingForMessage$1 chatTimelineViewController$checkThreadsExistingForMessage$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof ChatTimelineViewController$checkThreadsExistingForMessage$1) {
            chatTimelineViewController$checkThreadsExistingForMessage$1 = (ChatTimelineViewController$checkThreadsExistingForMessage$1) continuationImpl;
            int i2 = chatTimelineViewController$checkThreadsExistingForMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTimelineViewController$checkThreadsExistingForMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatTimelineViewController$checkThreadsExistingForMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTimelineViewController$checkThreadsExistingForMessage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr a = iVar.x.a(nob1.b(serverMessageRef));
                    chatTimelineViewController$checkThreadsExistingForMessage$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(a, chatTimelineViewController$checkThreadsExistingForMessage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((j3b) obj).x > 0);
            }
        }
        chatTimelineViewController$checkThreadsExistingForMessage$1 = new ChatTimelineViewController$checkThreadsExistingForMessage$1(iVar, continuationImpl);
        Object obj2 = chatTimelineViewController$checkThreadsExistingForMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTimelineViewController$checkThreadsExistingForMessage$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((j3b) obj2).x > 0);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.L;
    }

    @Override // defpackage.sdz0
    public final void o() {
        this.Z = true;
        s(fv10.b, null);
        this.L.stopScroll();
        TimelineLayoutManager timelineLayoutManager = this.M;
        timelineLayoutManager.K.makeAnchoredAtBottom();
        timelineLayoutManager.b0 = 0;
        timelineLayoutManager.i1();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        i iVar;
        tje.e();
        super.onBrickAttach();
        if (this.K.c) {
            this.M.T.b(this.e0);
        }
        int i = 0;
        this.J.d = new tbb(i, this);
        ServerMessageRef serverMessageRef = this.V;
        int i2 = 1;
        pbb pbbVar = this.c;
        ChatRequest chatRequest = this.b;
        if (serverMessageRef != null) {
            t3z t3zVar = LocalMessageRef.Companion;
            long timestamp = serverMessageRef.getTimestamp();
            t3zVar.getClass();
            this.R = t3z.a(timestamp);
            ev10 ev10Var = fv10.a;
            iVar = this;
            iVar.v(pbbVar.b.e(chatRequest, new obb(pbbVar, iVar, new ybb(serverMessageRef.getTimestamp(), i2), this.V, null)));
        } else {
            iVar = this;
            LocalMessageRef localMessageRef = iVar.W;
            if (localMessageRef != null) {
                iVar.R = localMessageRef;
                ev10 ev10Var2 = fv10.a;
                iVar.v(pbbVar.b.e(chatRequest, new obb(pbbVar, iVar, new ybb(localMessageRef.getTimestamp(), i2), iVar.V, null)));
            } else {
                iVar.v(pbbVar.b.e(chatRequest, new obb(pbbVar, iVar, fv10.a, serverMessageRef, null)));
            }
        }
        dbb dbbVar = iVar.H;
        tcz0 a = dbbVar.a.a(dbbVar.b.uniqueRequestId());
        if (a != null && !a.e) {
            a.d = true;
        }
        iVar.V = null;
        iVar.W = null;
        com.yandex.messaging.extension.flow.c.c(iVar.x.a(chatRequest), iVar.getBrickScope(), new xbb(i, iVar));
        com.yandex.messaging.extension.flow.c.c(iVar.I.a(chatRequest), iVar.getBrickScope(), new xbb(i2, iVar));
        kotlinx.coroutines.flow.e.H(iVar.getBrickScope(), new jqr(iVar.C.b, new ChatTimelineViewController$onBrickAttach$7(iVar, null), 3));
        kotlinx.coroutines.flow.e.H(iVar.getBrickScope(), new jqr(iVar.y.a(chatRequest), new ChatTimelineViewController$onBrickAttach$8(iVar, null), 3));
        iVar.w();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        if (this.K.c) {
            this.M.T.d(this.e0);
            pbz0 pbz0Var = this.d0;
            if (pbz0Var != null) {
                pbz0Var.a(null);
            }
        }
        kgx kgxVar = f0[1];
        z83.f((e1k) this.Q.a(), null);
        this.z.g(null, new iaz0(), null);
        qaz0 qaz0Var = this.B;
        h9z0 h9z0Var = qaz0Var.z;
        HashMap hashMap = h9z0Var.m;
        HashMap hashMap2 = h9z0Var.l;
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            ((e1k) it.next()).close();
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((Drawable) it2.next()).setCallback(null);
        }
        hashMap2.clear();
        hashMap.clear();
        qaz0Var.w.clear();
        v(null);
        this.E.onDetach();
        m mVar = this.G;
        tje.N(mVar.c, ie60.a, null, new MessageViewsRefresher$cancelRequests$1(mVar, null), 2);
        this.U = null;
        dbb dbbVar = this.H;
        com.yandex.messaging.analytics.b bVar = dbbVar.a;
        String uniqueRequestId = dbbVar.b.uniqueRequestId();
        tcz0 tcz0Var = bVar.d;
        if (jl40.l(tcz0Var != null ? tcz0Var.a : null, uniqueRequestId)) {
            bVar.d = null;
            bVar.e = null;
        }
        this.J.d = null;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        pbz0 pbz0Var = this.d0;
        if (pbz0Var != null) {
            pbz0Var.a(null);
        }
        kgx kgxVar = f0[1];
        this.Q.b(null);
        k7q0 k7q0Var = this.O;
        if (k7q0Var != null) {
            k7q0Var.e = false;
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        pbz0 pbz0Var = this.d0;
        if (pbz0Var != null) {
            pbz0Var.a.post(new kux0(12, pbz0Var));
        }
        k7q0 k7q0Var = this.O;
        if (k7q0Var != null) {
            k7q0Var.e = true;
        }
        kgx[] kgxVarArr = f0;
        kgx kgxVar = kgxVarArr[1];
        qp3 qp3Var = this.Q;
        z83.f((e1k) qp3Var.a(), null);
        ct21 e = this.w.a.e(this.b, new j6b(0));
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var.b(e);
        this.F.a(this.L, "timeline", this.z.c.g != null ? "loaded" : ResultType.RESULT_TYPE_LOADING);
    }

    public final void r(yab yabVar, iaz0 iaz0Var, yab yabVar2) {
        tje.e();
        hab habVar = this.z;
        habVar.g(yabVar, iaz0Var, yabVar2);
        this.B.y.c = yabVar2 != null ? habVar.getItemCount() - yabVar2.getCount() : -1;
        dbb dbbVar = this.H;
        com.yandex.messaging.analytics.b bVar = dbbVar.a;
        tcz0 a = bVar.a(dbbVar.b.uniqueRequestId());
        if (a != null && !a.e) {
            bVar.c.getClass();
            a.k = Long.valueOf(SystemClock.elapsedRealtime());
            a.e = true;
        }
        Iterator it = Collections.unmodifiableList(iaz0Var.a).iterator();
        while (it.hasNext()) {
            ((haz0) it.next()).a(new io9(this));
        }
        LocalMessageRef localMessageRef = this.R;
        if (localMessageRef != null) {
            eja1.s(this).d(new ChatTimelineViewController$onChatTimelineChanged$3$1(this, localMessageRef, this.S, null));
        }
        this.R = null;
        this.S = null;
    }

    public final void s(fv10 fv10Var, LocalMessageRef localMessageRef) {
        this.R = localMessageRef;
        pbz0 pbz0Var = this.d0;
        if (pbz0Var != null) {
            pbz0Var.a(null);
        }
        this.z.g(null, new iaz0(), null);
        this.L.stopScroll();
        pbb pbbVar = this.c;
        v(pbbVar.b.e(this.b, new obb(pbbVar, this, fv10Var, null, localMessageRef)));
        dbb dbbVar = this.H;
        tcz0 a = dbbVar.a.a(dbbVar.b.uniqueRequestId());
        if (a != null && !a.e) {
            a.d = true;
        }
        w();
    }

    public final void u(long j, String str) {
        j3b j3bVar = this.U;
        if (j3bVar == null) {
            return;
        }
        LocalMessageRef.Companion.getClass();
        LocalMessageRef a = t3z.a(j);
        int i = 0;
        if (j <= j3bVar.w) {
            Toast.makeText(this.L.getContext(), oyh0.messenger_removed_message_text, 0).show();
            return;
        }
        this.S = str;
        this.Z = true;
        this.a0 = Long.valueOf(j);
        s(new ybb(j, i), a);
    }

    public final void v(ct21 ct21Var) {
        kgx kgxVar = f0[0];
        this.P.b(ct21Var);
    }

    public final void w() {
        boolean z = true;
        if (!this.L.canScrollVertically(1) && this.V == null && this.W == null && this.R == null) {
            z = false;
        }
        sq60 sq60Var = this.A.b;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((sdz0) sq60Var.next()).c(z);
        }
    }
}
