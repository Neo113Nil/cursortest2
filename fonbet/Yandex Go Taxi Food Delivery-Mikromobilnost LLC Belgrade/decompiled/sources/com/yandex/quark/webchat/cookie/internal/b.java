package com.yandex.quark.webchat.cookie.internal;

import android.net.Uri;
import com.adjust.sdk.Constants;
import defpackage.bne;
import defpackage.cvu0;
import defpackage.dvw;
import defpackage.evu0;
import defpackage.id5;
import defpackage.j18;
import defpackage.j73;
import defpackage.ny61;
import defpackage.qke;
import defpackage.r5z0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|24|25|26|27|(1:29)(9:31|13|14|(0)|39|18|19|20|(1:38)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0203, code lost:
    
        r7 = r1;
        r1 = r5;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01e7 -> B:13:0x01ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0209 -> B:18:0x01fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(id5 id5Var, Uri uri, String str, ContinuationImpl continuationImpl) {
        WebCookieManagerExtensionsKt$removeCookieByName$1 webCookieManagerExtensionsKt$removeCookieByName$1;
        int i;
        WebCookieManagerExtensionsKt$removeCookieByName$1 webCookieManagerExtensionsKt$removeCookieByName$12;
        Iterator it;
        Uri uri2;
        Boolean bool;
        id5 id5Var2;
        id5 id5Var3;
        boolean z;
        boolean z2;
        if (continuationImpl instanceof WebCookieManagerExtensionsKt$removeCookieByName$1) {
            webCookieManagerExtensionsKt$removeCookieByName$1 = (WebCookieManagerExtensionsKt$removeCookieByName$1) continuationImpl;
            int i2 = webCookieManagerExtensionsKt$removeCookieByName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCookieManagerExtensionsKt$removeCookieByName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webCookieManagerExtensionsKt$removeCookieByName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCookieManagerExtensionsKt$removeCookieByName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String host = uri.getHost();
                    if (host == null) {
                        return Boolean.FALSE;
                    }
                    boolean t = cvu0.t(uri.getScheme(), Constants.SCHEME, true);
                    List Y = evu0.Y(host, new char[]{'.'}, 0, 6);
                    String X = Y.size() >= 2 ? kotlin.collections.a.X(kotlin.collections.a.B0(2, Y), Extension.DOT_CHAR, null, null, null, 62) : host;
                    if (host.equals(X)) {
                        X = null;
                    }
                    List<String> M = kotlin.collections.a.M(j73.f0(new String[]{host, X}));
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : M) {
                        ycc.r(scc.g(str2, cvu0.x(str2, Extension.DOT_CHAR, false) ? str2 : Extension.DOT_CHAR.concat(str2)), arrayList);
                    }
                    ArrayList m0 = kotlin.collections.a.m0(Collections.singletonList(null), arrayList);
                    String encodedPath = uri.getEncodedPath();
                    if (encodedPath == null) {
                        encodedPath = "/";
                    }
                    ListBuilder a = rcc.a();
                    a.add("/");
                    List Y2 = evu0.Y(encodedPath, new char[]{'/'}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : Y2) {
                        if (((String) obj2).length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    String str3 = "";
                    while (it2.hasNext()) {
                        str3 = ((Object) str3) + "/" + ((String) it2.next());
                        a.add(str3);
                        a.add(((Object) str3) + "/");
                    }
                    List<String> I = kotlin.collections.a.I(a.j());
                    ArrayList arrayList3 = new ArrayList();
                    for (String str4 : I) {
                        long j = 0;
                        arrayList3.add(new bne(str, "", null, new r5z0(j), null, str4, t, 340));
                        Iterator it3 = ((ArrayList) kotlin.collections.a.M(m0)).iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new bne(str, "", new Date(0L), new r5z0(j), (String) it3.next(), str4, t, 320));
                        }
                    }
                    Boolean bool2 = Boolean.FALSE;
                    Iterator it4 = arrayList3.iterator();
                    webCookieManagerExtensionsKt$removeCookieByName$12 = webCookieManagerExtensionsKt$removeCookieByName$1;
                    it = it4;
                    uri2 = uri;
                    bool = bool2;
                    id5Var2 = id5Var;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = webCookieManagerExtensionsKt$removeCookieByName$1.Z$0;
                    Iterator it5 = (Iterator) webCookieManagerExtensionsKt$removeCookieByName$1.L$2;
                    Uri uri3 = (Uri) webCookieManagerExtensionsKt$removeCookieByName$1.L$1;
                    id5 id5Var4 = (id5) webCookieManagerExtensionsKt$removeCookieByName$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        z2 = true;
                        id5Var3 = id5Var4;
                    } catch (Exception unused) {
                        id5Var2 = id5Var4;
                        id5Var3 = id5Var2;
                        z = z3;
                        Iterator it6 = it5;
                        webCookieManagerExtensionsKt$removeCookieByName$12 = webCookieManagerExtensionsKt$removeCookieByName$1;
                        uri2 = uri3;
                        bool = Boolean.valueOf(z);
                        id5Var2 = id5Var3;
                        it = it6;
                        if (!it.hasNext()) {
                        }
                    }
                    try {
                    } catch (Exception unused2) {
                        id5Var2 = id5Var3;
                        id5Var3 = id5Var2;
                        z = z3;
                        Iterator it62 = it5;
                        webCookieManagerExtensionsKt$removeCookieByName$12 = webCookieManagerExtensionsKt$removeCookieByName$1;
                        uri2 = uri3;
                        bool = Boolean.valueOf(z);
                        id5Var2 = id5Var3;
                        it = it62;
                        if (!it.hasNext()) {
                        }
                    }
                    z = (!z3 || ((Boolean) obj).booleanValue()) ? z2 : false;
                    Iterator it622 = it5;
                    webCookieManagerExtensionsKt$removeCookieByName$12 = webCookieManagerExtensionsKt$removeCookieByName$1;
                    uri2 = uri3;
                    bool = Boolean.valueOf(z);
                    id5Var2 = id5Var3;
                    it = it622;
                    if (!it.hasNext()) {
                        bne bneVar = (bne) it.next();
                        z3 = bool.booleanValue();
                        webCookieManagerExtensionsKt$removeCookieByName$12.L$0 = id5Var2;
                        webCookieManagerExtensionsKt$removeCookieByName$12.L$1 = uri2;
                        webCookieManagerExtensionsKt$removeCookieByName$12.L$2 = it;
                        webCookieManagerExtensionsKt$removeCookieByName$12.Z$0 = z3;
                        z2 = true;
                        webCookieManagerExtensionsKt$removeCookieByName$12.label = 1;
                        Object b = b(id5Var2, uri2, bneVar, webCookieManagerExtensionsKt$removeCookieByName$12);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Iterator it7 = it;
                        id5Var3 = id5Var2;
                        obj = b;
                        uri3 = uri2;
                        webCookieManagerExtensionsKt$removeCookieByName$1 = webCookieManagerExtensionsKt$removeCookieByName$12;
                        it5 = it7;
                        if (z3) {
                        }
                        Iterator it6222 = it5;
                        webCookieManagerExtensionsKt$removeCookieByName$12 = webCookieManagerExtensionsKt$removeCookieByName$1;
                        uri2 = uri3;
                        bool = Boolean.valueOf(z);
                        id5Var2 = id5Var3;
                        it = it6222;
                        if (!it.hasNext()) {
                            return bool;
                        }
                    }
                }
            }
        }
        webCookieManagerExtensionsKt$removeCookieByName$1 = new WebCookieManagerExtensionsKt$removeCookieByName$1(continuationImpl);
        Object obj3 = webCookieManagerExtensionsKt$removeCookieByName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCookieManagerExtensionsKt$removeCookieByName$1.label;
        if (i != 0) {
        }
    }

    public static final Object b(id5 id5Var, Uri uri, bne bneVar, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        WebCookieManagerExtensionsKt$setCookie$2$1 webCookieManagerExtensionsKt$setCookie$2$1 = new WebCookieManagerExtensionsKt$setCookie$2$1(1, j18Var, qke.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
        id5Var.getClass();
        id5Var.b(uri, bneVar.toString(), webCookieManagerExtensionsKt$setCookie$2$1);
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
