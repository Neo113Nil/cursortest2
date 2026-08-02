package com.yandex.quark.webchat.auth.internal.synchronizer;

import android.content.SharedPreferences;
import android.net.Uri;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.d4h;
import defpackage.evu0;
import defpackage.gs21;
import defpackage.ike;
import defpackage.jhg0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jyj0;
import defpackage.ke41;
import defpackage.le41;
import defpackage.lyj0;
import defpackage.ne1;
import defpackage.ny61;
import defpackage.onh;
import defpackage.oyr;
import defpackage.ple;
import defpackage.r5z0;
import defpackage.rn3;
import defpackage.rpb1;
import defpackage.sls;
import defpackage.sn3;
import defpackage.syj0;
import defpackage.tn3;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wm3;
import defpackage.wn3;
import defpackage.y5e;
import defpackage.ya41;
import defpackage.yq6;
import defpackage.za41;
import defpackage.zq6;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class c {
    public final onh a;
    public final com.yandex.quark.webchat.auth.internal.b b;
    public final com.yandex.go.quark.dynamic.chat.b c;
    public final zwf0 d;
    public final zq6 e;
    public final jqr f;
    public final ke41 g;
    public final yq6 h;
    public final a i;
    public final sls j;
    public final r0 k;
    public final tpr l;

    public c(onh onhVar, com.yandex.quark.webchat.auth.internal.b bVar, com.yandex.go.quark.dynamic.chat.b bVar2, ike ikeVar, zwf0 zwf0Var, zq6 zq6Var, jqr jqrVar, ke41 ke41Var, yq6 yq6Var, a aVar) {
        gs21 gs21Var = new gs21(21);
        this.a = onhVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = zwf0Var;
        this.e = zq6Var;
        this.f = jqrVar;
        this.g = ke41Var;
        this.h = yq6Var;
        this.i = aVar;
        this.j = gs21Var;
        sn3 sn3Var = sn3.a;
        r0 c = bvf0.c(new ya41(sn3Var, null, sn3Var, null, false));
        this.k = c;
        this.l = e.t(new d4h(c, 2));
        jl40.D(ikeVar, "observe-web-chat-url-changes", new WebAuthorizationSynchronizer$2(this, null));
        jl40.D(ikeVar, "observe-synchronization-state", new WebAuthorizationSynchronizer$3(this, null));
        jl40.D(ikeVar, "observe-authorization-state", new WebAuthorizationSynchronizer$4(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, syj0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0149 -> B:11:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:15:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ya41 ya41Var, Continuation continuation) {
        WebAuthorizationSynchronizer$synchronizeState$1 webAuthorizationSynchronizer$synchronizeState$1;
        int i;
        String str;
        String str2;
        int i2;
        long j;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        long j2;
        WebAuthorizationSynchronizer$synchronizeState$1 webAuthorizationSynchronizer$synchronizeState$12;
        Ref$LongRef ref$LongRef;
        ya41 ya41Var2;
        zq6 zq6Var;
        r0 r0Var;
        sls slsVar;
        jyj0 jyj0Var;
        Object obj;
        int i4;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$LongRef ref$LongRef2;
        int i5;
        ya41 ya41Var3;
        long j3;
        ?? r13;
        c cVar2 = cVar;
        zwf0 zwf0Var = cVar2.d;
        sls slsVar2 = cVar2.j;
        r0 r0Var2 = cVar2.k;
        zq6 zq6Var2 = cVar2.e;
        if (continuation instanceof WebAuthorizationSynchronizer$synchronizeState$1) {
            webAuthorizationSynchronizer$synchronizeState$1 = (WebAuthorizationSynchronizer$synchronizeState$1) continuation;
            int i6 = webAuthorizationSynchronizer$synchronizeState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                webAuthorizationSynchronizer$synchronizeState$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = webAuthorizationSynchronizer$synchronizeState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationSynchronizer$synchronizeState$1.label;
                if (i != 0) {
                    str = "WebAuthorizationSynchronizer";
                    str2 = null;
                    kotlin.b.b(obj2);
                    i2 = 0;
                    zq6Var2.b(new ple(4, "web-chat-synchronize-authorization-start", ya41Var.c(), false));
                    long longValue = ((Number) slsVar2.invoke()).longValue();
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = 200L;
                    j = 2000;
                    i3 = 5;
                    ref$ObjectRef = new Ref$ObjectRef();
                    j2 = longValue;
                    webAuthorizationSynchronizer$synchronizeState$12 = webAuthorizationSynchronizer$synchronizeState$1;
                    ref$LongRef = ref$LongRef3;
                    ya41Var2 = ya41Var;
                    if (i2 >= i3) {
                    }
                } else if (i == 1) {
                    str = "WebAuthorizationSynchronizer";
                    str2 = null;
                    int i7 = webAuthorizationSynchronizer$synchronizeState$1.I$2;
                    i5 = webAuthorizationSynchronizer$synchronizeState$1.I$1;
                    long j4 = webAuthorizationSynchronizer$synchronizeState$1.J$1;
                    int i8 = webAuthorizationSynchronizer$synchronizeState$1.I$0;
                    long j5 = webAuthorizationSynchronizer$synchronizeState$1.J$0;
                    ref$ObjectRef2 = (Ref$ObjectRef) webAuthorizationSynchronizer$synchronizeState$1.L$2;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) webAuthorizationSynchronizer$synchronizeState$1.L$1;
                    ya41 ya41Var4 = (ya41) webAuthorizationSynchronizer$synchronizeState$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i7;
                    obj = obj2;
                    slsVar = slsVar2;
                    ya41Var3 = ya41Var4;
                    j3 = j4;
                    j2 = j5;
                    ref$LongRef2 = ref$LongRef4;
                    i4 = i8;
                    r13 = (syj0) obj;
                    r0Var = r0Var2;
                    if (r13 instanceof lyj0) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = webAuthorizationSynchronizer$synchronizeState$1.I$1;
                    long j6 = webAuthorizationSynchronizer$synchronizeState$1.J$1;
                    i4 = webAuthorizationSynchronizer$synchronizeState$1.I$0;
                    str = "WebAuthorizationSynchronizer";
                    str2 = null;
                    j2 = webAuthorizationSynchronizer$synchronizeState$1.J$0;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) webAuthorizationSynchronizer$synchronizeState$1.L$2;
                    ref$LongRef2 = (Ref$LongRef) webAuthorizationSynchronizer$synchronizeState$1.L$1;
                    ya41Var2 = (ya41) webAuthorizationSynchronizer$synchronizeState$1.L$0;
                    kotlin.b.b(obj2);
                    slsVar = slsVar2;
                    r0Var = r0Var2;
                    zq6 zq6Var3 = zq6Var2;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    long j7 = ref$LongRef2.element * 2;
                    if (j7 > j6) {
                        j7 = j6;
                    }
                    ref$LongRef2.element = j7;
                    long j8 = j6;
                    WebAuthorizationSynchronizer$synchronizeState$1 webAuthorizationSynchronizer$synchronizeState$13 = webAuthorizationSynchronizer$synchronizeState$1;
                    ref$LongRef = ref$LongRef2;
                    ref$ObjectRef = ref$ObjectRef3;
                    i3 = i4;
                    j = j8;
                    i2 = i5 + 1;
                    webAuthorizationSynchronizer$synchronizeState$12 = webAuthorizationSynchronizer$synchronizeState$13;
                    coroutineSingletons = coroutineSingletons2;
                    slsVar2 = slsVar;
                    r0Var2 = r0Var;
                    zq6Var2 = zq6Var3;
                    cVar2 = cVar;
                    if (i2 >= i3) {
                        webAuthorizationSynchronizer$synchronizeState$12.L$0 = ya41Var2;
                        webAuthorizationSynchronizer$synchronizeState$12.L$1 = ref$LongRef;
                        webAuthorizationSynchronizer$synchronizeState$12.L$2 = ref$ObjectRef;
                        webAuthorizationSynchronizer$synchronizeState$12.J$0 = j2;
                        webAuthorizationSynchronizer$synchronizeState$12.I$0 = i3;
                        webAuthorizationSynchronizer$synchronizeState$12.J$1 = j;
                        webAuthorizationSynchronizer$synchronizeState$12.I$1 = i2;
                        webAuthorizationSynchronizer$synchronizeState$12.I$2 = i2;
                        slsVar = slsVar2;
                        webAuthorizationSynchronizer$synchronizeState$12.label = 1;
                        Object b = cVar2.b(ya41Var2, webAuthorizationSynchronizer$synchronizeState$12);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = b;
                        ya41Var3 = ya41Var2;
                        j3 = j;
                        ref$ObjectRef2 = ref$ObjectRef;
                        i4 = i3;
                        ref$LongRef2 = ref$LongRef;
                        webAuthorizationSynchronizer$synchronizeState$1 = webAuthorizationSynchronizer$synchronizeState$12;
                        i5 = i2;
                        r13 = (syj0) obj;
                        r0Var = r0Var2;
                        if (r13 instanceof lyj0) {
                            zq6Var = zq6Var2;
                            jyj0Var = r13;
                            if (jyj0Var instanceof lyj0) {
                            }
                            return zy11.a;
                        }
                        if (!(r13 instanceof jyj0)) {
                            w511.b();
                            return str2;
                        }
                        zq6Var3 = zq6Var2;
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        zwf0Var.e(str, oyr.k(i2, "Synchronization attempt ", " failed: ", ((jhg0) ((jyj0) r13).a).b));
                        ref$ObjectRef2.element = r13;
                        if (i2 < i4 - 1) {
                            long j9 = ref$LongRef2.element;
                            webAuthorizationSynchronizer$synchronizeState$1.L$0 = ya41Var3;
                            webAuthorizationSynchronizer$synchronizeState$1.L$1 = ref$LongRef2;
                            webAuthorizationSynchronizer$synchronizeState$1.L$2 = ref$ObjectRef2;
                            webAuthorizationSynchronizer$synchronizeState$1.J$0 = j2;
                            webAuthorizationSynchronizer$synchronizeState$1.I$0 = i4;
                            webAuthorizationSynchronizer$synchronizeState$1.J$1 = j3;
                            webAuthorizationSynchronizer$synchronizeState$1.I$1 = i5;
                            webAuthorizationSynchronizer$synchronizeState$1.I$2 = i2;
                            webAuthorizationSynchronizer$synchronizeState$1.label = 2;
                            coroutineSingletons2 = coroutineSingletons3;
                            if (kotlinx.coroutines.a.i(j9, webAuthorizationSynchronizer$synchronizeState$1) == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            ref$ObjectRef3 = ref$ObjectRef2;
                            j6 = j3;
                            ya41Var2 = ya41Var3;
                            long j72 = ref$LongRef2.element * 2;
                            if (j72 > j6) {
                            }
                            ref$LongRef2.element = j72;
                            long j82 = j6;
                            WebAuthorizationSynchronizer$synchronizeState$1 webAuthorizationSynchronizer$synchronizeState$132 = webAuthorizationSynchronizer$synchronizeState$1;
                            ref$LongRef = ref$LongRef2;
                            ref$ObjectRef = ref$ObjectRef3;
                            i3 = i4;
                            j = j82;
                            i2 = i5 + 1;
                            webAuthorizationSynchronizer$synchronizeState$12 = webAuthorizationSynchronizer$synchronizeState$132;
                            coroutineSingletons = coroutineSingletons2;
                            slsVar2 = slsVar;
                            r0Var2 = r0Var;
                            zq6Var2 = zq6Var3;
                            cVar2 = cVar;
                            if (i2 >= i3) {
                                slsVar = slsVar2;
                                r0Var = r0Var2;
                                zq6Var = zq6Var2;
                                jyj0 jyj0Var2 = (jyj0) ref$ObjectRef.element;
                                jyj0Var = jyj0Var2;
                                if (jyj0Var2 == null) {
                                    ny61.r("Last result is null");
                                    return str2;
                                }
                                if (jyj0Var instanceof lyj0) {
                                    zq6 zq6Var4 = zq6Var;
                                    if (!(jyj0Var instanceof jyj0)) {
                                        w511.b();
                                        return str2;
                                    }
                                    zq6Var4.b(new ple(((jhg0) jyj0Var.a).b, 7));
                                    zwf0Var.e(str, "All synchronization attempts have been exhausted");
                                } else {
                                    ya41 ya41Var5 = (ya41) r0Var.getValue();
                                    if (!jl40.l(ya41Var5.a, ya41Var5.c)) {
                                        zq6Var.b(new ple((ya41) r0Var.getValue()));
                                        String str3 = ya41Var5.a instanceof sn3 ? jl40.l(((za41) ((lyj0) jyj0Var).a).b, Boolean.TRUE) ? "WebChat.AuthSync.Login" : str2 : "WebChat.AuthSync.Logout";
                                        if (str3 != null) {
                                            cVar.h.e(str3, ((Number) slsVar.invoke()).longValue() - j2, TimeUnit.MILLISECONDS);
                                        }
                                    }
                                    while (true) {
                                        Object value = r0Var.getValue();
                                        ya41 ya41Var6 = ((za41) ((lyj0) jyj0Var).a).a;
                                        r0 r0Var3 = r0Var;
                                        if (r0Var3.k(value, ya41.a((ya41) value, ya41Var6.a, ya41Var6.b, null, null, ya41Var6.e, 12))) {
                                            break;
                                        }
                                        r0Var = r0Var3;
                                    }
                                }
                                return zy11.a;
                            }
                        } else {
                            coroutineSingletons2 = coroutineSingletons3;
                            long j10 = j3;
                            ya41Var2 = ya41Var3;
                            webAuthorizationSynchronizer$synchronizeState$132 = webAuthorizationSynchronizer$synchronizeState$1;
                            ref$LongRef = ref$LongRef2;
                            ref$ObjectRef = ref$ObjectRef2;
                            i3 = i4;
                            j = j10;
                            i2 = i5 + 1;
                            webAuthorizationSynchronizer$synchronizeState$12 = webAuthorizationSynchronizer$synchronizeState$132;
                            coroutineSingletons = coroutineSingletons2;
                            slsVar2 = slsVar;
                            r0Var2 = r0Var;
                            zq6Var2 = zq6Var3;
                            cVar2 = cVar;
                            if (i2 >= i3) {
                            }
                        }
                    }
                }
            }
        }
        webAuthorizationSynchronizer$synchronizeState$1 = new WebAuthorizationSynchronizer$synchronizeState$1(cVar2, continuation);
        Object obj22 = webAuthorizationSynchronizer$synchronizeState$1.result;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationSynchronizer$synchronizeState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x016a, code lost:
    
        if (defpackage.jl40.l(r12 != null ? r12.getAuthority() : null, r2 != null ? r2.getAuthority() : null) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008e, code lost:
    
        if (r2 == r4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013b, code lost:
    
        if (r5.equalsIgnoreCase(r2 != null ? r2.toString() : null) == true) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ya41 ya41Var, ContinuationImpl continuationImpl) {
        WebAuthorizationSynchronizer$doSynchronizeStep$1 webAuthorizationSynchronizer$doSynchronizeStep$1;
        int i;
        boolean equals;
        ya41 ya41Var2;
        ya41 ya41Var3;
        tn3 tn3Var;
        tn3 tn3Var2;
        ya41 ya41Var4;
        Object obj;
        syj0 syj0Var;
        syj0 syj0Var2;
        syj0 syj0Var3;
        syj0 syj0Var4;
        ya41 ya41Var5 = ya41Var;
        if (continuationImpl instanceof WebAuthorizationSynchronizer$doSynchronizeStep$1) {
            webAuthorizationSynchronizer$doSynchronizeStep$1 = (WebAuthorizationSynchronizer$doSynchronizeStep$1) continuationImpl;
            int i2 = webAuthorizationSynchronizer$doSynchronizeStep$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationSynchronizer$doSynchronizeStep$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webAuthorizationSynchronizer$doSynchronizeStep$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationSynchronizer$doSynchronizeStep$1.label;
                sn3 sn3Var = sn3.a;
                if (i == 0) {
                    if (i == 1) {
                        ya41Var5 = (ya41) webAuthorizationSynchronizer$doSynchronizeStep$1.L$0;
                        kotlin.b.b(obj2);
                        ya41 ya41Var6 = ya41Var5;
                        syj0 syj0Var5 = (syj0) obj2;
                        jyj0 jyj0Var = syj0Var5 instanceof jyj0 ? (jyj0) syj0Var5 : null;
                        if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                            this.d.e("WebAuthorizationSynchronizer", "Log out failed: " + ((jhg0) obj));
                        }
                        return new lyj0(new za41(ya41.a(ya41Var6, null, null, null, null, false, 15), null));
                    }
                    if (i == 2) {
                        ya41 ya41Var7 = (ya41) webAuthorizationSynchronizer$doSynchronizeStep$1.L$0;
                        kotlin.b.b(obj2);
                        ya41Var4 = ya41Var7;
                        syj0Var = (syj0) obj2;
                        syj0Var.getClass();
                        if (!(syj0Var instanceof lyj0)) {
                            return new lyj0(new za41(ya41.a(ya41Var4, sn3Var, ya41Var4.d, null, null, false, 28), null));
                        }
                        if (syj0Var instanceof jyj0) {
                            return syj0Var;
                        }
                        w511.b();
                        return null;
                    }
                    if (i == 3) {
                        tn3 tn3Var3 = (tn3) webAuthorizationSynchronizer$doSynchronizeStep$1.L$1;
                        ya41Var5 = (ya41) webAuthorizationSynchronizer$doSynchronizeStep$1.L$0;
                        kotlin.b.b(obj2);
                        tn3Var2 = tn3Var3;
                        ya41 ya41Var8 = ya41Var5;
                        syj0Var2 = (syj0) obj2;
                        syj0Var2.getClass();
                        if (!(syj0Var2 instanceof lyj0)) {
                            Boolean bool = (Boolean) ((lyj0) syj0Var2).a;
                            bool.getClass();
                            return new lyj0(new za41(ya41.a(ya41Var8, tn3Var2, null, null, null, false, 30), bool));
                        }
                        if (syj0Var2 instanceof jyj0) {
                            return syj0Var2;
                        }
                        w511.b();
                        return null;
                    }
                    if (i == 4) {
                        tn3 tn3Var4 = (tn3) webAuthorizationSynchronizer$doSynchronizeStep$1.L$1;
                        ya41 ya41Var9 = (ya41) webAuthorizationSynchronizer$doSynchronizeStep$1.L$0;
                        kotlin.b.b(obj2);
                        tn3Var = tn3Var4;
                        ya41Var2 = ya41Var9;
                        syj0Var3 = (syj0) obj2;
                        syj0Var3.getClass();
                        if (!(syj0Var3 instanceof lyj0)) {
                            return new lyj0(new za41(ya41.a(ya41Var2, tn3Var, null, null, null, false, 30), null));
                        }
                        if (syj0Var3 instanceof jyj0) {
                            return syj0Var3;
                        }
                        w511.b();
                        return null;
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ya41 ya41Var10 = (ya41) webAuthorizationSynchronizer$doSynchronizeStep$1.L$0;
                    kotlin.b.b(obj2);
                    ya41Var3 = ya41Var10;
                    syj0Var4 = (syj0) obj2;
                    syj0Var4.getClass();
                    if (!(syj0Var4 instanceof lyj0)) {
                        return new lyj0(new za41(ya41.a(ya41Var3, sn3Var, null, null, null, false, 30), null));
                    }
                    if (syj0Var4 instanceof jyj0) {
                        return syj0Var4;
                    }
                    w511.b();
                    return null;
                }
                kotlin.b.b(obj2);
                tn3 tn3Var5 = ya41Var5.a;
                tn3 tn3Var6 = ya41Var5.c;
                Uri uri = ya41Var5.b;
                if (ya41Var5.e) {
                    webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var5;
                    webAuthorizationSynchronizer$doSynchronizeStep$1.label = 1;
                    obj2 = e(webAuthorizationSynchronizer$doSynchronizeStep$1);
                } else {
                    Object obj4 = ya41Var5.d;
                    boolean z = false;
                    if (uri == null) {
                        if (obj4 == null) {
                            equals = true;
                            if (equals) {
                                boolean z2 = tn3Var5 instanceof sn3;
                                Uri uri2 = ya41Var5.d;
                                if (z2) {
                                    return new lyj0(new za41(ya41.a(ya41Var, null, uri2, null, null, false, 29), null));
                                }
                                if (uri == null) {
                                    if (uri2 == null) {
                                        z = true;
                                    }
                                } else if (uri2 != null) {
                                    Set set = le41.b;
                                    z = uri.equals(uri2);
                                }
                                if (!z) {
                                    if ((uri == null || uri.isHierarchical()) && (uri2 == null || uri2.isHierarchical())) {
                                        if (jl40.l(uri != null ? uri.getScheme() : null, uri2 != null ? uri2.getScheme() : null)) {
                                        }
                                        webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var5;
                                        webAuthorizationSynchronizer$doSynchronizeStep$1.label = 2;
                                        obj2 = e(webAuthorizationSynchronizer$doSynchronizeStep$1);
                                        if (obj2 != obj3) {
                                            ya41Var4 = ya41Var5;
                                            syj0Var = (syj0) obj2;
                                            syj0Var.getClass();
                                            if (!(syj0Var instanceof lyj0)) {
                                            }
                                        }
                                    } else {
                                        if (uri != null && (r5 = uri.toString()) != null) {
                                        }
                                        webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var5;
                                        webAuthorizationSynchronizer$doSynchronizeStep$1.label = 2;
                                        obj2 = e(webAuthorizationSynchronizer$doSynchronizeStep$1);
                                        if (obj2 != obj3) {
                                        }
                                    }
                                }
                                return new lyj0(new za41(ya41.a(ya41Var, null, ya41Var5.d, null, null, false, 29), null));
                            }
                            if (uri == null) {
                                return new lyj0(new za41(ya41Var5, null));
                            }
                            boolean z3 = tn3Var5 instanceof sn3;
                            if (z3 && (tn3Var6 instanceof rn3)) {
                                String a = ((rn3) tn3Var6).a();
                                webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var5;
                                webAuthorizationSynchronizer$doSynchronizeStep$1.L$1 = tn3Var6;
                                webAuthorizationSynchronizer$doSynchronizeStep$1.label = 3;
                                obj2 = c(uri, a, webAuthorizationSynchronizer$doSynchronizeStep$1);
                                if (obj2 != obj3) {
                                    tn3Var2 = tn3Var6;
                                    ya41 ya41Var82 = ya41Var5;
                                    syj0Var2 = (syj0) obj2;
                                    syj0Var2.getClass();
                                    if (!(syj0Var2 instanceof lyj0)) {
                                    }
                                }
                            } else {
                                if (z3 && (tn3Var6 instanceof sn3)) {
                                    return new lyj0(new za41(ya41.a(ya41Var, tn3Var6, null, null, null, false, 30), null));
                                }
                                ya41Var2 = ya41Var5;
                                boolean z4 = tn3Var5 instanceof rn3;
                                if (z4 && (tn3Var6 instanceof sn3)) {
                                    webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var2;
                                    webAuthorizationSynchronizer$doSynchronizeStep$1.L$1 = tn3Var6;
                                    webAuthorizationSynchronizer$doSynchronizeStep$1.label = 4;
                                    obj2 = e(webAuthorizationSynchronizer$doSynchronizeStep$1);
                                    if (obj2 != obj3) {
                                        tn3Var = tn3Var6;
                                        syj0Var3 = (syj0) obj2;
                                        syj0Var3.getClass();
                                        if (!(syj0Var3 instanceof lyj0)) {
                                        }
                                    }
                                } else {
                                    if (!z4 || !(tn3Var6 instanceof rn3) || tn3Var5.equals(tn3Var6)) {
                                        return new lyj0(new za41(ya41Var2, null));
                                    }
                                    webAuthorizationSynchronizer$doSynchronizeStep$1.L$0 = ya41Var2;
                                    webAuthorizationSynchronizer$doSynchronizeStep$1.label = 5;
                                    obj2 = e(webAuthorizationSynchronizer$doSynchronizeStep$1);
                                    if (obj2 != obj3) {
                                        ya41Var3 = ya41Var2;
                                        syj0Var4 = (syj0) obj2;
                                        syj0Var4.getClass();
                                        if (!(syj0Var4 instanceof lyj0)) {
                                        }
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (obj4 != null) {
                            Set set2 = le41.b;
                            equals = uri.equals(obj4);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
                return obj3;
            }
        }
        webAuthorizationSynchronizer$doSynchronizeStep$1 = new WebAuthorizationSynchronizer$doSynchronizeStep$1(this, continuationImpl);
        Object obj22 = webAuthorizationSynchronizer$doSynchronizeStep$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationSynchronizer$doSynchronizeStep$1.label;
        sn3 sn3Var2 = sn3.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uri uri, String str, ContinuationImpl continuationImpl) {
        WebAuthorizationSynchronizer$login$1 webAuthorizationSynchronizer$login$1;
        Object obj;
        int i;
        if (continuationImpl instanceof WebAuthorizationSynchronizer$login$1) {
            webAuthorizationSynchronizer$login$1 = (WebAuthorizationSynchronizer$login$1) continuationImpl;
            int i2 = webAuthorizationSynchronizer$login$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationSynchronizer$login$1.label = i2 - Integer.MIN_VALUE;
                obj = webAuthorizationSynchronizer$login$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationSynchronizer$login$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.g.a = null;
                    webAuthorizationSynchronizer$login$1.L$0 = str;
                    webAuthorizationSynchronizer$login$1.L$1 = uri;
                    webAuthorizationSynchronizer$login$1.label = 1;
                    obj = this.i.a(webAuthorizationSynchronizer$login$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) webAuthorizationSynchronizer$login$1.L$1;
                    str = (String) webAuthorizationSynchronizer$login$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return new lyj0(Boolean.FALSE);
                }
                webAuthorizationSynchronizer$login$1.L$0 = null;
                webAuthorizationSynchronizer$login$1.L$1 = null;
                webAuthorizationSynchronizer$login$1.label = 2;
                Object d = d(uri, str, webAuthorizationSynchronizer$login$1);
                return d == obj2 ? obj2 : d;
            }
        }
        webAuthorizationSynchronizer$login$1 = new WebAuthorizationSynchronizer$login$1(this, continuationImpl);
        obj = webAuthorizationSynchronizer$login$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationSynchronizer$login$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uri uri, String str, ContinuationImpl continuationImpl) {
        WebAuthorizationSynchronizer$loginForced$1 webAuthorizationSynchronizer$loginForced$1;
        int i;
        syj0 syj0Var;
        Object obj;
        if (continuationImpl instanceof WebAuthorizationSynchronizer$loginForced$1) {
            webAuthorizationSynchronizer$loginForced$1 = (WebAuthorizationSynchronizer$loginForced$1) continuationImpl;
            int i2 = webAuthorizationSynchronizer$loginForced$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationSynchronizer$loginForced$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webAuthorizationSynchronizer$loginForced$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationSynchronizer$loginForced$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.d.b("WebAuthorizationSynchronizer", "Going to refresh authorization cookies.");
                    Set set = le41.b;
                    String host = uri.getHost();
                    String str2 = ClearCryptoProPrefs.COUNTRY;
                    if (host != null) {
                        if (host.length() <= 0) {
                            host = null;
                        }
                        if (host != null) {
                            if (evu0.B(host, '.')) {
                                host = oyr.g(1, 0, host);
                            }
                            List Y = evu0.Y(host, new char[]{'.'}, 0, 6);
                            if (Y.size() >= 2) {
                                String str3 = b64.c(2, Y) + Extension.DOT_CHAR + b64.c(1, Y);
                                if (le41.c.contains(str3)) {
                                    str2 = str3;
                                } else {
                                    String str4 = (String) kotlin.collections.a.Z(Y);
                                    if (le41.b.contains(str4)) {
                                        str2 = str4;
                                    }
                                }
                            }
                        }
                    }
                    webAuthorizationSynchronizer$loginForced$1.L$0 = uri;
                    webAuthorizationSynchronizer$loginForced$1.label = 1;
                    obj2 = this.c.a(uri, str, str2, webAuthorizationSynchronizer$loginForced$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        syj0 syj0Var2 = (syj0) obj2;
                        lyj0 lyj0Var = syj0Var2 instanceof lyj0 ? (lyj0) syj0Var2 : null;
                        if (lyj0Var != null && (obj = lyj0Var.a) != null) {
                            a aVar = this.i;
                            aVar.c.info("SmartCookieRefresh", "on cookies synced");
                            ne1 ne1Var = aVar.b;
                            r5z0 r5z0Var = (r5z0) aVar.e.invoke();
                            SharedPreferences.Editor edit = ne1Var.a.edit();
                            if (r5z0Var != null) {
                                edit.putLong("cookies_refresh_time", rpb1.g(r5z0Var));
                            } else {
                                edit.remove("cookies_refresh_time");
                            }
                            edit.apply();
                        }
                        syj0Var2.getClass();
                        if (syj0Var2 instanceof lyj0) {
                            return new lyj0(Boolean.TRUE);
                        }
                        if (syj0Var2 instanceof jyj0) {
                            return syj0Var2;
                        }
                        w511.b();
                        return null;
                    }
                    uri = (Uri) webAuthorizationSynchronizer$loginForced$1.L$0;
                    kotlin.b.b(obj2);
                }
                syj0Var = (syj0) obj2;
                if (syj0Var instanceof lyj0) {
                    if (syj0Var instanceof jyj0) {
                        return y5e.u(wm3.a, ((wn3) ((jyj0) syj0Var).a).a());
                    }
                    w511.b();
                    return null;
                }
                Uri uri2 = (Uri) ((lyj0) syj0Var).a;
                webAuthorizationSynchronizer$loginForced$1.L$0 = null;
                webAuthorizationSynchronizer$loginForced$1.label = 2;
                obj2 = this.b.b(uri2, uri, webAuthorizationSynchronizer$loginForced$1);
            }
        }
        webAuthorizationSynchronizer$loginForced$1 = new WebAuthorizationSynchronizer$loginForced$1(this, continuationImpl);
        Object obj22 = webAuthorizationSynchronizer$loginForced$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationSynchronizer$loginForced$1.label;
        if (i != 0) {
        }
        syj0Var = (syj0) obj22;
        if (syj0Var instanceof lyj0) {
        }
    }

    public final Object e(Continuation continuation) {
        this.d.c("WebAuthorizationSynchronizer", "logout: start [uptime=" + this.j.invoke() + "ms]");
        this.g.a = null;
        a aVar = this.i;
        aVar.c.info("SmartCookieRefresh", "on logout");
        SharedPreferences sharedPreferences = aVar.b.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("cookies_refresh_time");
        edit.apply();
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.remove("cookie_used_time");
        edit2.apply();
        return this.b.c((ContinuationImpl) continuation);
    }
}
