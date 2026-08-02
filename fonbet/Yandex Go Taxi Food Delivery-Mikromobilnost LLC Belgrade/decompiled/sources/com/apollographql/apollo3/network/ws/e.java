package com.apollographql.apollo3.network.ws;

import defpackage.bvf0;
import defpackage.dxf0;
import defpackage.ffx;
import defpackage.fs10;
import defpackage.glc;
import defpackage.h5e;
import defpackage.hvu;
import defpackage.jl40;
import defpackage.l5c;
import defpackage.l8x;
import defpackage.m1u0;
import defpackage.mgu0;
import defpackage.ny61;
import defpackage.os50;
import defpackage.p1k;
import defpackage.qeo;
import defpackage.qv10;
import defpackage.rnh;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.x160;
import defpackage.zwj0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class e implements x160 {
    public final tls a;
    public final List b;
    public final a c;
    public final long d;
    public final b e;
    public final kotlinx.coroutines.channels.a f = sb2.a(Integer.MAX_VALUE, null, null, 6);
    public final n0 g;
    public final l5c h;
    public final dxf0 i;

    public e(tls tlsVar, List list, a aVar, long j, b bVar) {
        this.a = tlsVar;
        this.b = list;
        this.c = aVar;
        this.d = j;
        this.e = bVar;
        n0 b = ffx.b(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.g = b;
        b.j();
        l5c l5cVar = new l5c();
        this.h = l5cVar;
        tje.N(bvf0.a(l5cVar.b), null, null, new WebSocketNetworkTransport$1(this, null), 3);
        this.i = new dxf0(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:76|(1:77)|78|79|80|81|(1:95)|83|84|(0)(0)|12|(0)(0)|15) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:57|58|59|61|62|63|(2:125|126)|65|(3:68|(6:70|71|72|73|74|(1:112)(13:76|77|78|79|80|81|(1:95)|83|84|(0)(0)|12|(0)(0)|15))(1:119)|66)|120|121|122|123|124|73|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03cc, code lost:
    
        r9 = r2;
        r2 = r8;
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03e2, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03e4, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03e5, code lost:
    
        r2 = r6;
        r4 = r11;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f0, code lost:
    
        if (r15.isEmpty() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a1, code lost:
    
        r10 = 1;
        r2 = r4;
        r4 = r6;
        r6 = r13;
        r13 = r14;
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0305 A[Catch: Exception -> 0x02f3, TRY_ENTER, TryCatch #8 {Exception -> 0x02f3, blocks: (B:126:0x02e9, B:68:0x0305, B:71:0x0313), top: B:125:0x02e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, pzt0] */
    /* JADX WARN: Type inference failed for: r16v0, types: [T, com.apollographql.apollo3.network.ws.c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v59, types: [T, pzt0] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x04d2 -> B:16:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0245 -> B:16:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0439 -> B:12:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0455 -> B:12:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x046e -> B:12:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0490 -> B:12:0x0493). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x03d1 -> B:16:0x01e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, tse tseVar, ContinuationImpl continuationImpl) {
        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$1;
        e eVar2;
        LinkedHashMap linkedHashMap;
        long j;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$12;
        Ref$ObjectRef ref$ObjectRef3;
        tse tseVar2;
        tse tseVar3;
        long j2;
        long j3;
        Ref$ObjectRef ref$ObjectRef4;
        WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$13;
        Ref$ObjectRef ref$ObjectRef5;
        LinkedHashMap linkedHashMap2;
        fs10 fs10Var;
        boolean z;
        long j4;
        a aVar;
        fs10 fs10Var2;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        LinkedHashMap linkedHashMap3;
        int i;
        Ref$ObjectRef ref$ObjectRef8;
        Ref$ObjectRef ref$ObjectRef9;
        tse tseVar4;
        e eVar3;
        Ref$ObjectRef ref$ObjectRef10;
        fs10 fs10Var3;
        Ref$ObjectRef ref$ObjectRef11;
        tse tseVar5;
        Ref$ObjectRef ref$ObjectRef12;
        Ref$ObjectRef ref$ObjectRef13;
        e eVar4;
        Ref$ObjectRef ref$ObjectRef14;
        Ref$ObjectRef ref$ObjectRef15;
        kotlinx.coroutines.channels.a aVar2;
        os50 os50Var;
        int i2;
        e eVar5;
        Ref$ObjectRef ref$ObjectRef16;
        LinkedHashMap linkedHashMap4;
        fs10 fs10Var4;
        glc glcVar;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        ?? cVar;
        LinkedHashMap linkedHashMap7;
        List list;
        CoroutineSingletons coroutineSingletons;
        List o0;
        Iterator it;
        Object J;
        LinkedHashMap linkedHashMap8;
        Object obj;
        eVar.getClass();
        if (continuationImpl instanceof WebSocketNetworkTransport$supervise$1) {
            webSocketNetworkTransport$supervise$1 = (WebSocketNetworkTransport$supervise$1) continuationImpl;
            int i3 = webSocketNetworkTransport$supervise$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webSocketNetworkTransport$supervise$1.label = i3 - Integer.MIN_VALUE;
                eVar2 = eVar;
                Object obj2 = webSocketNetworkTransport$supervise$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = 3;
                int i5 = 1;
                Object obj3 = null;
                switch (webSocketNetworkTransport$supervise$1.label) {
                    case 0:
                        Ref$ObjectRef z2 = qv10.z(obj2);
                        Ref$ObjectRef ref$ObjectRef17 = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef18 = new Ref$ObjectRef();
                        linkedHashMap = new LinkedHashMap();
                        j = 0;
                        ref$ObjectRef = ref$ObjectRef18;
                        ref$ObjectRef2 = ref$ObjectRef17;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        ref$ObjectRef3 = z2;
                        tseVar2 = tseVar;
                        kotlinx.coroutines.channels.a aVar3 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar3.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar3, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        j2 = j;
                        tseVar3 = tseVar2;
                        obj2 = J;
                        long j5 = j2;
                        fs10Var4 = (fs10) obj2;
                        if (!(fs10Var4 instanceof qeo)) {
                            if (fs10Var4 instanceof glc) {
                                if (fs10Var4 instanceof p1k) {
                                    b(ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3);
                                    return zy11.a;
                                }
                                if (ref$ObjectRef.element != null) {
                                    i2 = i5;
                                    tseVar5 = tseVar3;
                                    j = j5;
                                    ref$ObjectRef13 = ref$ObjectRef3;
                                    webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                    ref$ObjectRef12 = ref$ObjectRef2;
                                    ref$ObjectRef16 = ref$ObjectRef;
                                    eVar5 = eVar2;
                                    linkedHashMap4 = linkedHashMap;
                                    glcVar = (glc) fs10Var4;
                                    if (glcVar instanceof m1u0) {
                                        m1u0 m1u0Var = (m1u0) fs10Var4;
                                        linkedHashMap4.put(m1u0Var.a().b, fs10Var4);
                                        ((f) ref$ObjectRef16.element).f(m1u0Var.a());
                                        linkedHashMap8 = linkedHashMap4;
                                    } else if (glcVar instanceof mgu0) {
                                        mgu0 mgu0Var = (mgu0) fs10Var4;
                                        linkedHashMap4.remove(mgu0Var.a().b);
                                        ((f) ref$ObjectRef16.element).g(mgu0Var.a());
                                        linkedHashMap8 = linkedHashMap4;
                                    } else {
                                        linkedHashMap8 = linkedHashMap4;
                                        if (glcVar instanceof zwj0) {
                                            kotlinx.coroutines.channels.a aVar4 = eVar5.f;
                                            h5e h5eVar = new h5e();
                                            webSocketNetworkTransport$supervise$1.L$0 = eVar5;
                                            webSocketNetworkTransport$supervise$1.L$1 = tseVar5;
                                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef13;
                                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef12;
                                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef16;
                                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap4;
                                            webSocketNetworkTransport$supervise$1.L$6 = null;
                                            webSocketNetworkTransport$supervise$1.J$0 = j;
                                            webSocketNetworkTransport$supervise$1.label = 9;
                                            linkedHashMap8 = linkedHashMap4;
                                            if (aVar4.o(h5eVar, webSocketNetworkTransport$supervise$1) == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                        }
                                    }
                                    linkedHashMap = linkedHashMap8;
                                    Ref$ObjectRef ref$ObjectRef19 = ref$ObjectRef16;
                                    e eVar6 = eVar5;
                                    Ref$ObjectRef ref$ObjectRef20 = ref$ObjectRef12;
                                    Ref$ObjectRef ref$ObjectRef21 = ref$ObjectRef13;
                                    tseVar2 = tseVar5;
                                    webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                    if (linkedHashMap.isEmpty()) {
                                        ref$ObjectRef3 = ref$ObjectRef21;
                                        i4 = 3;
                                        obj = null;
                                        ref$ObjectRef3.element = tje.N(tseVar2, null, null, new WebSocketNetworkTransport$supervise$4(eVar6, ref$ObjectRef19, ref$ObjectRef20, ref$ObjectRef21, null), 3);
                                    } else {
                                        ref$ObjectRef3 = ref$ObjectRef21;
                                        i4 = 3;
                                        obj = null;
                                        l8x l8xVar = (l8x) ref$ObjectRef3.element;
                                        if (l8xVar != null) {
                                            l8xVar.a(null);
                                        }
                                        ref$ObjectRef3.element = null;
                                    }
                                    int i6 = i2;
                                    obj3 = obj;
                                    i5 = i6;
                                    eVar2 = eVar6;
                                    ref$ObjectRef = ref$ObjectRef19;
                                    ref$ObjectRef2 = ref$ObjectRef20;
                                } else if (fs10Var4 instanceof mgu0) {
                                    linkedHashMap.remove(((mgu0) fs10Var4).a().b);
                                } else {
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                        i = i5;
                                        ref$ObjectRef9 = ref$ObjectRef3;
                                        webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                        ref$ObjectRef8 = ref$ObjectRef;
                                        eVar3 = eVar2;
                                        linkedHashMap3 = linkedHashMap;
                                        tseVar4 = tseVar3;
                                        j4 = j5;
                                        aVar2 = eVar3.f;
                                        os50Var = new os50(e);
                                        webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                                        webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                                        webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef9;
                                        webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                                        webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef8;
                                        webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap3;
                                        webSocketNetworkTransport$supervise$1.L$6 = null;
                                        webSocketNetworkTransport$supervise$1.L$7 = null;
                                        webSocketNetworkTransport$supervise$1.J$0 = j4;
                                        webSocketNetworkTransport$supervise$1.label = 6;
                                        if (aVar2.o(os50Var, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef8;
                                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                        ref$ObjectRef3 = ref$ObjectRef9;
                                        j = j4;
                                        ref$ObjectRef = ref$ObjectRef22;
                                        linkedHashMap = linkedHashMap3;
                                        tseVar2 = tseVar4;
                                        eVar2 = eVar3;
                                        i5 = i;
                                        i4 = 3;
                                        obj3 = null;
                                        kotlinx.coroutines.channels.a aVar32 = eVar2.f;
                                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                                        webSocketNetworkTransport$supervise$12.J$0 = j;
                                        webSocketNetworkTransport$supervise$12.label = i5;
                                        aVar32.getClass();
                                        J = kotlinx.coroutines.channels.a.J(aVar32, webSocketNetworkTransport$supervise$12);
                                        if (J == coroutineSingletons2) {
                                        }
                                    }
                                    a aVar5 = eVar2.c;
                                    tls tlsVar = eVar2.a;
                                    webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                                    webSocketNetworkTransport$supervise$12.L$1 = tseVar3;
                                    webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                                    webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                                    webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                                    webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                                    webSocketNetworkTransport$supervise$12.L$6 = fs10Var4;
                                    webSocketNetworkTransport$supervise$12.L$7 = aVar5;
                                    webSocketNetworkTransport$supervise$12.J$0 = j5;
                                    webSocketNetworkTransport$supervise$12.label = 4;
                                    Object invoke = tlsVar.invoke(webSocketNetworkTransport$supervise$12);
                                    if (invoke == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$14 = webSocketNetworkTransport$supervise$12;
                                    fs10Var2 = fs10Var4;
                                    obj2 = invoke;
                                    ref$ObjectRef10 = ref$ObjectRef3;
                                    webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$14;
                                    eVar3 = eVar2;
                                    aVar = aVar5;
                                    tseVar4 = tseVar3;
                                    ref$ObjectRef7 = ref$ObjectRef2;
                                    ref$ObjectRef6 = ref$ObjectRef;
                                    linkedHashMap7 = linkedHashMap;
                                    j4 = j5;
                                    try {
                                    } catch (Exception e2) {
                                        e = e2;
                                        i = i5;
                                        break;
                                    }
                                    String str = (String) obj2;
                                    list = eVar3.b;
                                    if (list instanceof Collection) {
                                        try {
                                        } catch (Exception e3) {
                                            e = e3;
                                            linkedHashMap3 = linkedHashMap7;
                                            ref$ObjectRef8 = ref$ObjectRef6;
                                            ref$ObjectRef2 = ref$ObjectRef7;
                                            i = 1;
                                            ref$ObjectRef9 = ref$ObjectRef10;
                                            aVar2 = eVar3.f;
                                            os50Var = new os50(e);
                                            webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                                            webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef9;
                                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef8;
                                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap3;
                                            webSocketNetworkTransport$supervise$1.L$6 = null;
                                            webSocketNetworkTransport$supervise$1.L$7 = null;
                                            webSocketNetworkTransport$supervise$1.J$0 = j4;
                                            webSocketNetworkTransport$supervise$1.label = 6;
                                            if (aVar2.o(os50Var, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                                            }
                                        }
                                        break;
                                    }
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (jl40.l(((hvu) it.next()).a, "Sec-WebSocket-Protocol")) {
                                            o0 = eVar3.b;
                                            coroutineSingletons = coroutineSingletons2;
                                            webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                                            webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef10;
                                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef7;
                                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef6;
                                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap7;
                                            webSocketNetworkTransport$supervise$1.L$6 = fs10Var2;
                                            webSocketNetworkTransport$supervise$1.L$7 = null;
                                            webSocketNetworkTransport$supervise$1.J$0 = j4;
                                            webSocketNetworkTransport$supervise$1.label = 5;
                                            obj2 = aVar.a(str, o0, webSocketNetworkTransport$supervise$1);
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (obj2 == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            fs10Var3 = fs10Var2;
                                            linkedHashMap6 = linkedHashMap7;
                                            ref$ObjectRef11 = ref$ObjectRef6;
                                            tseVar5 = tseVar4;
                                            ref$ObjectRef12 = ref$ObjectRef7;
                                            j = j4;
                                            eVar4 = eVar3;
                                            ref$ObjectRef13 = ref$ObjectRef10;
                                            try {
                                            } catch (Exception e4) {
                                                e = e4;
                                                i = 1;
                                                Ref$ObjectRef ref$ObjectRef23 = ref$ObjectRef13;
                                                eVar3 = eVar4;
                                                j4 = j;
                                                ref$ObjectRef9 = ref$ObjectRef23;
                                                linkedHashMap3 = linkedHashMap6;
                                                ref$ObjectRef8 = ref$ObjectRef11;
                                                ref$ObjectRef2 = ref$ObjectRef12;
                                                tseVar4 = tseVar5;
                                                aVar2 = eVar3.f;
                                                os50Var = new os50(e);
                                                webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                                                webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                                                webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef9;
                                                webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                                                webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef8;
                                                webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap3;
                                                webSocketNetworkTransport$supervise$1.L$6 = null;
                                                webSocketNetworkTransport$supervise$1.L$7 = null;
                                                webSocketNetworkTransport$supervise$1.J$0 = j4;
                                                webSocketNetworkTransport$supervise$1.label = 6;
                                                if (aVar2.o(os50Var, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                                                }
                                            }
                                            rnh rnhVar = (rnh) obj2;
                                            b bVar = eVar4.e;
                                            cVar = new c(rnhVar, eVar4.i, bVar.a, bVar.b, bVar.c);
                                            ref$ObjectRef11.element = cVar;
                                            webSocketNetworkTransport$supervise$1.L$0 = eVar4;
                                            webSocketNetworkTransport$supervise$1.L$1 = tseVar5;
                                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef13;
                                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef12;
                                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef11;
                                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap6;
                                            webSocketNetworkTransport$supervise$1.L$6 = fs10Var3;
                                            webSocketNetworkTransport$supervise$1.J$0 = j;
                                            webSocketNetworkTransport$supervise$1.label = 7;
                                            linkedHashMap5 = linkedHashMap6;
                                            if (cVar.h(webSocketNetworkTransport$supervise$1) == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            i2 = 1;
                                            ref$ObjectRef12.element = tje.N(tseVar5, null, CoroutineStart.UNDISPATCHED, new WebSocketNetworkTransport$supervise$3(null, ref$ObjectRef11), 1);
                                            fs10Var4 = fs10Var3;
                                            linkedHashMap4 = linkedHashMap5;
                                            ref$ObjectRef16 = ref$ObjectRef11;
                                            eVar5 = eVar4;
                                            glcVar = (glc) fs10Var4;
                                            if (glcVar instanceof m1u0) {
                                            }
                                            linkedHashMap = linkedHashMap8;
                                            Ref$ObjectRef ref$ObjectRef192 = ref$ObjectRef16;
                                            e eVar62 = eVar5;
                                            Ref$ObjectRef ref$ObjectRef202 = ref$ObjectRef12;
                                            Ref$ObjectRef ref$ObjectRef212 = ref$ObjectRef13;
                                            tseVar2 = tseVar5;
                                            webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                            if (linkedHashMap.isEmpty()) {
                                            }
                                            int i62 = i2;
                                            obj3 = obj;
                                            i5 = i62;
                                            eVar2 = eVar62;
                                            ref$ObjectRef = ref$ObjectRef192;
                                            ref$ObjectRef2 = ref$ObjectRef202;
                                        }
                                    }
                                    coroutineSingletons = coroutineSingletons2;
                                    o0 = kotlin.collections.a.o0(eVar3.b, new hvu("Sec-WebSocket-Protocol", "graphql-ws"));
                                    webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                                    webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                                    webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef10;
                                    webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef7;
                                    webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef6;
                                    webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap7;
                                    webSocketNetworkTransport$supervise$1.L$6 = fs10Var2;
                                    webSocketNetworkTransport$supervise$1.L$7 = null;
                                    webSocketNetworkTransport$supervise$1.J$0 = j4;
                                    webSocketNetworkTransport$supervise$1.label = 5;
                                    obj2 = aVar.a(str, o0, webSocketNetworkTransport$supervise$1);
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (obj2 == coroutineSingletons2) {
                                    }
                                }
                            }
                            obj3 = obj3;
                            i5 = i5;
                            tseVar2 = tseVar3;
                            j = j5;
                        } else if (fs10Var4 instanceof os50) {
                            b(ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3);
                            eVar2.getClass();
                            ref$ObjectRef4 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$13 = webSocketNetworkTransport$supervise$12;
                            fs10Var = fs10Var4;
                            tseVar2 = tseVar3;
                            ref$ObjectRef5 = ref$ObjectRef;
                            linkedHashMap2 = linkedHashMap;
                            j3 = j5;
                            z = false;
                            if (z) {
                                long j6 = j3 + 1;
                                kotlinx.coroutines.channels.a aVar6 = eVar2.f;
                                webSocketNetworkTransport$supervise$13.L$0 = eVar2;
                                webSocketNetworkTransport$supervise$13.L$1 = tseVar2;
                                webSocketNetworkTransport$supervise$13.L$2 = ref$ObjectRef3;
                                webSocketNetworkTransport$supervise$13.L$3 = ref$ObjectRef4;
                                webSocketNetworkTransport$supervise$13.L$4 = ref$ObjectRef5;
                                webSocketNetworkTransport$supervise$13.L$5 = linkedHashMap2;
                                webSocketNetworkTransport$supervise$13.L$6 = obj3;
                                webSocketNetworkTransport$supervise$13.J$0 = j6;
                                webSocketNetworkTransport$supervise$13.label = i4;
                                if (aVar6.o(zwj0.a, webSocketNetworkTransport$supervise$13) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$13;
                                ref$ObjectRef2 = ref$ObjectRef4;
                                ref$ObjectRef = ref$ObjectRef5;
                                j = j6;
                                linkedHashMap = linkedHashMap2;
                            } else {
                                eVar2.g.g(fs10Var);
                                webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$13;
                                ref$ObjectRef2 = ref$ObjectRef4;
                                ref$ObjectRef = ref$ObjectRef5;
                                linkedHashMap = linkedHashMap2;
                                j = 0;
                            }
                        } else {
                            if (fs10Var4 instanceof h5e) {
                                Iterator it2 = linkedHashMap.values().iterator();
                                while (it2.hasNext()) {
                                    eVar2.f.d((m1u0) it2.next());
                                }
                            } else {
                                eVar2.g.g(fs10Var4);
                            }
                            tseVar2 = tseVar3;
                            j = 0;
                        }
                        kotlinx.coroutines.channels.a aVar322 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar322.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar322, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                    case 1:
                        long j7 = webSocketNetworkTransport$supervise$1.J$0;
                        ?? r2 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        Ref$ObjectRef ref$ObjectRef24 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef2 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef25 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tseVar3 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar7 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        j2 = j7;
                        linkedHashMap = r2;
                        eVar2 = eVar7;
                        ref$ObjectRef = ref$ObjectRef24;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        ref$ObjectRef3 = ref$ObjectRef25;
                        long j52 = j2;
                        fs10Var4 = (fs10) obj2;
                        if (!(fs10Var4 instanceof qeo)) {
                        }
                        kotlinx.coroutines.channels.a aVar3222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar3222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar3222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 2:
                        j3 = webSocketNetworkTransport$supervise$1.J$0;
                        fs10 fs10Var5 = (fs10) webSocketNetworkTransport$supervise$1.L$6;
                        ?? r4 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        Ref$ObjectRef ref$ObjectRef26 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef4 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef27 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tse tseVar6 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar8 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        if (((Boolean) obj2).booleanValue()) {
                            webSocketNetworkTransport$supervise$13 = webSocketNetworkTransport$supervise$1;
                            ref$ObjectRef3 = ref$ObjectRef27;
                            ref$ObjectRef5 = ref$ObjectRef26;
                            tseVar2 = tseVar6;
                            linkedHashMap2 = r4;
                            fs10Var = fs10Var5;
                            eVar2 = eVar8;
                            z = true;
                            if (z) {
                            }
                            kotlinx.coroutines.channels.a aVar32222 = eVar2.f;
                            webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                            webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                            webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                            webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                            webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                            webSocketNetworkTransport$supervise$12.L$6 = obj3;
                            webSocketNetworkTransport$supervise$12.J$0 = j;
                            webSocketNetworkTransport$supervise$12.label = i5;
                            aVar32222.getClass();
                            J = kotlinx.coroutines.channels.a.J(aVar32222, webSocketNetworkTransport$supervise$12);
                            if (J == coroutineSingletons2) {
                            }
                        } else {
                            webSocketNetworkTransport$supervise$13 = webSocketNetworkTransport$supervise$1;
                            ref$ObjectRef3 = ref$ObjectRef27;
                            ref$ObjectRef5 = ref$ObjectRef26;
                            tseVar2 = tseVar6;
                            linkedHashMap2 = r4;
                            fs10Var = fs10Var5;
                            eVar2 = eVar8;
                            z = false;
                            if (z) {
                            }
                            kotlinx.coroutines.channels.a aVar322222 = eVar2.f;
                            webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                            webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                            webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                            webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                            webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                            webSocketNetworkTransport$supervise$12.L$6 = obj3;
                            webSocketNetworkTransport$supervise$12.J$0 = j;
                            webSocketNetworkTransport$supervise$12.label = i5;
                            aVar322222.getClass();
                            J = kotlinx.coroutines.channels.a.J(aVar322222, webSocketNetworkTransport$supervise$12);
                            if (J == coroutineSingletons2) {
                            }
                        }
                        break;
                    case 3:
                        long j8 = webSocketNetworkTransport$supervise$1.J$0;
                        ?? r22 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        Ref$ObjectRef ref$ObjectRef28 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef2 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef29 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tse tseVar7 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar9 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        tseVar2 = tseVar7;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        ref$ObjectRef3 = ref$ObjectRef29;
                        j = j8;
                        linkedHashMap = r22;
                        ref$ObjectRef = ref$ObjectRef28;
                        eVar2 = eVar9;
                        kotlinx.coroutines.channels.a aVar3222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar3222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar3222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 4:
                        j4 = webSocketNetworkTransport$supervise$1.J$0;
                        aVar = (a) webSocketNetworkTransport$supervise$1.L$7;
                        fs10Var2 = (fs10) webSocketNetworkTransport$supervise$1.L$6;
                        ?? r6 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        ref$ObjectRef6 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef7 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef30 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tse tseVar8 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar10 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            ref$ObjectRef10 = ref$ObjectRef30;
                            tseVar4 = tseVar8;
                            eVar3 = eVar10;
                            linkedHashMap7 = r6;
                        } catch (Exception e5) {
                            e = e5;
                            linkedHashMap3 = r6;
                            i = 1;
                            ref$ObjectRef8 = ref$ObjectRef6;
                            ref$ObjectRef2 = ref$ObjectRef7;
                            ref$ObjectRef9 = ref$ObjectRef30;
                            tseVar4 = tseVar8;
                            eVar3 = eVar10;
                            aVar2 = eVar3.f;
                            os50Var = new os50(e);
                            webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                            webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef9;
                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef8;
                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap3;
                            webSocketNetworkTransport$supervise$1.L$6 = null;
                            webSocketNetworkTransport$supervise$1.L$7 = null;
                            webSocketNetworkTransport$supervise$1.J$0 = j4;
                            webSocketNetworkTransport$supervise$1.label = 6;
                            if (aVar2.o(os50Var, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                            }
                        }
                        String str2 = (String) obj2;
                        list = eVar3.b;
                        if (list instanceof Collection) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        coroutineSingletons = coroutineSingletons2;
                        o0 = kotlin.collections.a.o0(eVar3.b, new hvu("Sec-WebSocket-Protocol", "graphql-ws"));
                        webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                        webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                        webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef10;
                        webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef7;
                        webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef6;
                        webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap7;
                        webSocketNetworkTransport$supervise$1.L$6 = fs10Var2;
                        webSocketNetworkTransport$supervise$1.L$7 = null;
                        webSocketNetworkTransport$supervise$1.J$0 = j4;
                        webSocketNetworkTransport$supervise$1.label = 5;
                        obj2 = aVar.a(str2, o0, webSocketNetworkTransport$supervise$1);
                        coroutineSingletons2 = coroutineSingletons;
                        if (obj2 == coroutineSingletons2) {
                        }
                        break;
                    case 5:
                        j4 = webSocketNetworkTransport$supervise$1.J$0;
                        fs10Var3 = (fs10) webSocketNetworkTransport$supervise$1.L$6;
                        ?? r42 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        ref$ObjectRef11 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        Ref$ObjectRef ref$ObjectRef31 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef32 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tseVar4 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        eVar3 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            tseVar5 = tseVar4;
                            ref$ObjectRef12 = ref$ObjectRef31;
                            ref$ObjectRef13 = ref$ObjectRef32;
                            j = j4;
                            eVar4 = eVar3;
                            linkedHashMap6 = r42;
                        } catch (Exception e6) {
                            e = e6;
                            linkedHashMap3 = r42;
                            ref$ObjectRef8 = ref$ObjectRef11;
                            i = 1;
                            ref$ObjectRef2 = ref$ObjectRef31;
                            ref$ObjectRef9 = ref$ObjectRef32;
                            aVar2 = eVar3.f;
                            os50Var = new os50(e);
                            webSocketNetworkTransport$supervise$1.L$0 = eVar3;
                            webSocketNetworkTransport$supervise$1.L$1 = tseVar4;
                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef9;
                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef8;
                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap3;
                            webSocketNetworkTransport$supervise$1.L$6 = null;
                            webSocketNetworkTransport$supervise$1.L$7 = null;
                            webSocketNetworkTransport$supervise$1.J$0 = j4;
                            webSocketNetworkTransport$supervise$1.label = 6;
                            if (aVar2.o(os50Var, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                            }
                        }
                        rnh rnhVar2 = (rnh) obj2;
                        b bVar2 = eVar4.e;
                        cVar = new c(rnhVar2, eVar4.i, bVar2.a, bVar2.b, bVar2.c);
                        ref$ObjectRef11.element = cVar;
                        webSocketNetworkTransport$supervise$1.L$0 = eVar4;
                        webSocketNetworkTransport$supervise$1.L$1 = tseVar5;
                        webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef13;
                        webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef12;
                        webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef11;
                        webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap6;
                        webSocketNetworkTransport$supervise$1.L$6 = fs10Var3;
                        webSocketNetworkTransport$supervise$1.J$0 = j;
                        webSocketNetworkTransport$supervise$1.label = 7;
                        linkedHashMap5 = linkedHashMap6;
                        if (cVar.h(webSocketNetworkTransport$supervise$1) == coroutineSingletons2) {
                        }
                        i2 = 1;
                        ref$ObjectRef12.element = tje.N(tseVar5, null, CoroutineStart.UNDISPATCHED, new WebSocketNetworkTransport$supervise$3(null, ref$ObjectRef11), 1);
                        fs10Var4 = fs10Var3;
                        linkedHashMap4 = linkedHashMap5;
                        ref$ObjectRef16 = ref$ObjectRef11;
                        eVar5 = eVar4;
                        glcVar = (glc) fs10Var4;
                        if (glcVar instanceof m1u0) {
                        }
                        linkedHashMap = linkedHashMap8;
                        Ref$ObjectRef ref$ObjectRef1922 = ref$ObjectRef16;
                        e eVar622 = eVar5;
                        Ref$ObjectRef ref$ObjectRef2022 = ref$ObjectRef12;
                        Ref$ObjectRef ref$ObjectRef2122 = ref$ObjectRef13;
                        tseVar2 = tseVar5;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        if (linkedHashMap.isEmpty()) {
                        }
                        int i622 = i2;
                        obj3 = obj;
                        i5 = i622;
                        eVar2 = eVar622;
                        ref$ObjectRef = ref$ObjectRef1922;
                        ref$ObjectRef2 = ref$ObjectRef2022;
                        kotlinx.coroutines.channels.a aVar32222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar32222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar32222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 6:
                        long j9 = webSocketNetworkTransport$supervise$1.J$0;
                        ?? r23 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        Ref$ObjectRef ref$ObjectRef33 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef2 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        Ref$ObjectRef ref$ObjectRef34 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tse tseVar9 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar11 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        i = 1;
                        tseVar2 = tseVar9;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        ref$ObjectRef3 = ref$ObjectRef34;
                        j = j9;
                        linkedHashMap = r23;
                        ref$ObjectRef = ref$ObjectRef33;
                        eVar2 = eVar11;
                        i5 = i;
                        i4 = 3;
                        obj3 = null;
                        kotlinx.coroutines.channels.a aVar322222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar322222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar322222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 7:
                        j = webSocketNetworkTransport$supervise$1.J$0;
                        fs10Var3 = (fs10) webSocketNetworkTransport$supervise$1.L$6;
                        ?? r43 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        ref$ObjectRef11 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef12 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        ref$ObjectRef13 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tseVar5 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        eVar4 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            linkedHashMap5 = r43;
                        } catch (Exception e7) {
                            e = e7;
                            i = 1;
                            ?? r7 = 0;
                            LinkedHashMap linkedHashMap9 = r43;
                            ref$ObjectRef14 = ref$ObjectRef11;
                            ref$ObjectRef2 = ref$ObjectRef12;
                            ref$ObjectRef15 = ref$ObjectRef13;
                            ref$ObjectRef14.element = r7;
                            kotlinx.coroutines.channels.a aVar7 = eVar4.f;
                            os50 os50Var2 = new os50(e);
                            webSocketNetworkTransport$supervise$1.L$0 = eVar4;
                            webSocketNetworkTransport$supervise$1.L$1 = tseVar5;
                            webSocketNetworkTransport$supervise$1.L$2 = ref$ObjectRef15;
                            webSocketNetworkTransport$supervise$1.L$3 = ref$ObjectRef2;
                            webSocketNetworkTransport$supervise$1.L$4 = ref$ObjectRef14;
                            webSocketNetworkTransport$supervise$1.L$5 = linkedHashMap9;
                            webSocketNetworkTransport$supervise$1.L$6 = r7;
                            webSocketNetworkTransport$supervise$1.J$0 = j;
                            webSocketNetworkTransport$supervise$1.label = 8;
                            if (aVar7.o(os50Var2, webSocketNetworkTransport$supervise$1) != coroutineSingletons2) {
                            }
                        }
                        i2 = 1;
                        ref$ObjectRef12.element = tje.N(tseVar5, null, CoroutineStart.UNDISPATCHED, new WebSocketNetworkTransport$supervise$3(null, ref$ObjectRef11), 1);
                        fs10Var4 = fs10Var3;
                        linkedHashMap4 = linkedHashMap5;
                        ref$ObjectRef16 = ref$ObjectRef11;
                        eVar5 = eVar4;
                        glcVar = (glc) fs10Var4;
                        if (glcVar instanceof m1u0) {
                        }
                        linkedHashMap = linkedHashMap8;
                        Ref$ObjectRef ref$ObjectRef19222 = ref$ObjectRef16;
                        e eVar6222 = eVar5;
                        Ref$ObjectRef ref$ObjectRef20222 = ref$ObjectRef12;
                        Ref$ObjectRef ref$ObjectRef21222 = ref$ObjectRef13;
                        tseVar2 = tseVar5;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        if (linkedHashMap.isEmpty()) {
                        }
                        int i6222 = i2;
                        obj3 = obj;
                        i5 = i6222;
                        eVar2 = eVar6222;
                        ref$ObjectRef = ref$ObjectRef19222;
                        ref$ObjectRef2 = ref$ObjectRef20222;
                        kotlinx.coroutines.channels.a aVar3222222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar3222222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar3222222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 8:
                        j = webSocketNetworkTransport$supervise$1.J$0;
                        ?? r24 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        ref$ObjectRef14 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef2 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        ref$ObjectRef15 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tse tseVar10 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        e eVar12 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        linkedHashMap = r24;
                        i = 1;
                        tseVar2 = tseVar10;
                        eVar2 = eVar12;
                        ref$ObjectRef = ref$ObjectRef14;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        ref$ObjectRef3 = ref$ObjectRef15;
                        i5 = i;
                        i4 = 3;
                        obj3 = null;
                        kotlinx.coroutines.channels.a aVar32222222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar32222222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar32222222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    case 9:
                        j = webSocketNetworkTransport$supervise$1.J$0;
                        ?? r25 = (Map) webSocketNetworkTransport$supervise$1.L$5;
                        ref$ObjectRef16 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$4;
                        ref$ObjectRef12 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$3;
                        ref$ObjectRef13 = (Ref$ObjectRef) webSocketNetworkTransport$supervise$1.L$2;
                        tseVar5 = (tse) webSocketNetworkTransport$supervise$1.L$1;
                        eVar5 = (e) webSocketNetworkTransport$supervise$1.L$0;
                        kotlin.b.b(obj2);
                        i2 = 1;
                        linkedHashMap8 = r25;
                        linkedHashMap = linkedHashMap8;
                        Ref$ObjectRef ref$ObjectRef192222 = ref$ObjectRef16;
                        e eVar62222 = eVar5;
                        Ref$ObjectRef ref$ObjectRef202222 = ref$ObjectRef12;
                        Ref$ObjectRef ref$ObjectRef212222 = ref$ObjectRef13;
                        tseVar2 = tseVar5;
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        if (linkedHashMap.isEmpty()) {
                        }
                        int i62222 = i2;
                        obj3 = obj;
                        i5 = i62222;
                        eVar2 = eVar62222;
                        ref$ObjectRef = ref$ObjectRef192222;
                        ref$ObjectRef2 = ref$ObjectRef202222;
                        kotlinx.coroutines.channels.a aVar322222222222 = eVar2.f;
                        webSocketNetworkTransport$supervise$12.L$0 = eVar2;
                        webSocketNetworkTransport$supervise$12.L$1 = tseVar2;
                        webSocketNetworkTransport$supervise$12.L$2 = ref$ObjectRef3;
                        webSocketNetworkTransport$supervise$12.L$3 = ref$ObjectRef2;
                        webSocketNetworkTransport$supervise$12.L$4 = ref$ObjectRef;
                        webSocketNetworkTransport$supervise$12.L$5 = linkedHashMap;
                        webSocketNetworkTransport$supervise$12.L$6 = obj3;
                        webSocketNetworkTransport$supervise$12.J$0 = j;
                        webSocketNetworkTransport$supervise$12.label = i5;
                        aVar322222222222.getClass();
                        J = kotlinx.coroutines.channels.a.J(aVar322222222222, webSocketNetworkTransport$supervise$12);
                        if (J == coroutineSingletons2) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        eVar2 = eVar;
        webSocketNetworkTransport$supervise$1 = new WebSocketNetworkTransport$supervise$1(eVar2, continuationImpl);
        Object obj22 = webSocketNetworkTransport$supervise$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i42 = 3;
        int i52 = 1;
        Object obj32 = null;
        switch (webSocketNetworkTransport$supervise$1.label) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        f fVar = (f) ref$ObjectRef.element;
        if (fVar != null) {
            fVar.a();
        }
        ref$ObjectRef.element = null;
        l8x l8xVar = (l8x) ref$ObjectRef2.element;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ref$ObjectRef2.element = null;
        l8x l8xVar2 = (l8x) ref$ObjectRef3.element;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        ref$ObjectRef3.element = null;
    }

    @Override // defpackage.x160
    public final void dispose() {
        this.f.d(p1k.a);
    }
}
