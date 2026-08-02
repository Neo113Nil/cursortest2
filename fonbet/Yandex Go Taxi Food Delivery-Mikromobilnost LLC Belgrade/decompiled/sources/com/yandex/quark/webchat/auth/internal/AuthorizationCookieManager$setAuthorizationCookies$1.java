package com.yandex.quark.webchat.auth.internal;

import android.net.Uri;
import android.webkit.CookieManager;
import defpackage.bne;
import defpackage.g050;
import defpackage.id5;
import defpackage.lb7;
import defpackage.lne;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z3x0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.auth.internal.AuthorizationCookieManager$setAuthorizationCookies$1", f = "AuthorizationCookieManager.kt", l = {HProv.PP_CIPHEROID, 28, 31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizationCookieManager$setAuthorizationCookies$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<bne> $cookies;
    final /* synthetic */ Uri $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationCookieManager$setAuthorizationCookies$1(a aVar, Uri uri, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = uri;
        this.$cookies = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizationCookieManager$setAuthorizationCookies$1(this.this$0, this.$url, this.$cookies, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizationCookieManager$setAuthorizationCookies$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e8, code lost:
    
        if (r14 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:9:0x00eb, B:11:0x00af, B:13:0x00b5, B:17:0x010c, B:18:0x011d, B:20:0x0123, B:25:0x0137, B:31:0x013b, B:35:0x00f3, B:39:0x0049, B:40:0x00a7, B:42:0x0082), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010c A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:9:0x00eb, B:11:0x00af, B:13:0x00b5, B:17:0x010c, B:18:0x011d, B:20:0x0123, B:25:0x0137, B:31:0x013b, B:35:0x00f3, B:39:0x0049, B:40:0x00a7, B:42:0x0082), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00e8 -> B:9:0x00eb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        a aVar;
        g050 g050Var;
        List<bne> list;
        List<bne> list2;
        Uri uri2;
        List<bne> list3;
        a aVar2;
        Iterator<bne> it;
        Uri uri3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar3 = this.this$0;
                kotlinx.coroutines.sync.a aVar4 = aVar3.e;
                uri = this.$url;
                List<bne> list4 = this.$cookies;
                this.L$0 = aVar4;
                this.L$1 = uri;
                this.L$2 = aVar3;
                this.L$3 = list4;
                this.label = 1;
                if (aVar4.a(this) != coroutineSingletons) {
                    aVar = aVar3;
                    g050Var = aVar4;
                    list = list4;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                list = (List) this.L$3;
                aVar = (a) this.L$2;
                uri = (Uri) this.L$1;
                g050 g050Var2 = (g050) this.L$0;
                kotlin.b.b(obj);
                g050Var = g050Var2;
            } else if (i == 2) {
                uri2 = (Uri) this.L$3;
                list2 = (List) this.L$2;
                aVar = (a) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
                list3 = list2;
                aVar2 = aVar;
                it = list2.iterator();
                uri3 = uri2;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bne next = (bne) this.L$5;
                it = (Iterator) this.L$4;
                uri3 = (Uri) this.L$3;
                list3 = (List) this.L$2;
                aVar2 = (a) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    aVar2.b.e("AuthorizationCookieManager", "Failed to set cookie: " + next.a);
                }
                if (!it.hasNext()) {
                    lb7 lb7Var = aVar2.c;
                    String uri4 = uri3.toString();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String str = ((bne) it2.next()).a;
                        if (!a.f.contains(str)) {
                            str = null;
                        }
                        if (str != null) {
                            linkedHashSet.add(str);
                        }
                    }
                    lb7Var.B(new lne(uri4, linkedHashSet));
                    ((CookieManager) ((z3x0) aVar2.a).b.getValue()).flush();
                    g050Var.d(null);
                    return zy11.a;
                }
                next = it.next();
                aVar2.b.b("AuthorizationCookieManager", "Set cookie: " + next.a);
                id5 id5Var = aVar2.a;
                this.L$0 = g050Var;
                this.L$1 = aVar2;
                this.L$2 = list3;
                this.L$3 = uri3;
                this.L$4 = it;
                this.L$5 = next;
                this.label = 3;
                obj = com.yandex.quark.webchat.cookie.internal.b.b(id5Var, uri3, next, this);
            }
            Uri build = uri.buildUpon().clearQuery().path("/").build();
            this.L$0 = g050Var;
            this.L$1 = aVar;
            this.L$2 = list;
            this.L$3 = build;
            this.label = 2;
            if (a.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
            uri2 = build;
            list3 = list2;
            aVar2 = aVar;
            it = list2.iterator();
            uri3 = uri2;
            if (!it.hasNext()) {
            }
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
