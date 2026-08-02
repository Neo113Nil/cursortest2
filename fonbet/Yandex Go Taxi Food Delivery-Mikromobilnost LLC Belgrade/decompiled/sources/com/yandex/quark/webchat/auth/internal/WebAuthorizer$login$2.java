package com.yandex.quark.webchat.auth.internal;

import android.net.Uri;
import defpackage.bne;
import defpackage.evu0;
import defpackage.kvj0;
import defpackage.meu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ooc;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vm3;
import defpackage.wls;
import defpackage.wly0;
import defpackage.y5e;
import defpackage.zy11;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lsyj0;", "Lzy11;", "Ljhg0;", "<anonymous>", "(Ltse;)Lsyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.auth.internal.WebAuthorizer$login$2", f = "WebAuthorizer.kt", l = {49, 54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebAuthorizer$login$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $authorizationUrl;
    final /* synthetic */ Uri $webChatUrl;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthorizer$login$2(b bVar, Uri uri, Uri uri2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$webChatUrl = uri;
        this.$authorizationUrl = uri2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebAuthorizer$login$2(this.this$0, this.$webChatUrl, this.$authorizationUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebAuthorizer$login$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r3 == r2) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List W;
        List list;
        List W2;
        bne bneVar;
        Object a;
        kvj0 kvj0Var;
        ?? r1;
        Object u;
        Throwable th;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String a2 = this.this$0.b.a(this.$webChatUrl);
            if (a2 == null) {
                list = EmptyList.a;
            } else {
                W = evu0.W(a2, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                List list2 = W;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(evu0.k0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((String) next).length() != 0) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    W2 = evu0.W((String) it3.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                    if (W2.size() == 2) {
                        bneVar = new bne(evu0.k0((String) W2.get(0)).toString(), evu0.k0((String) W2.get(1)).toString(), null, null, null, null, false, 508);
                    } else {
                        bneVar = null;
                    }
                    if (bneVar != null) {
                        arrayList3.add(bneVar);
                    }
                }
                list = arrayList3;
            }
            b bVar = this.this$0;
            Uri uri = this.$authorizationUrl;
            this.label = 1;
            a = b.a(bVar, uri, list, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r1 = (Closeable) this.L$0;
                try {
                    kotlin.b.b(obj);
                    r1 = r1;
                    u = q5z.N();
                    kvj0Var = r1;
                    ooc.g(kvj0Var, null);
                    return u;
                } catch (Throwable th2) {
                    th = th2;
                    kvj0Var = r1;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ooc.g(kvj0Var, th);
                        throw th3;
                    }
                }
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        Uri uri2 = this.$webChatUrl;
        Throwable a3 = Result.a(a);
        vm3 vm3Var = vm3.a;
        if (a3 != null) {
            return y5e.u(vm3Var, "Failed to login " + a3.getMessage());
        }
        kvj0Var = (kvj0) a;
        try {
            if (!kvj0Var.J && !kvj0Var.K) {
                u = y5e.u(vm3Var, "Failed to login with response code: " + kvj0Var.w);
                ooc.g(kvj0Var, null);
                return u;
            }
            meu meuVar = kvj0Var.y;
            this.L$0 = kvj0Var;
            this.label = 2;
            wly0 wly0Var = bVar2.c;
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new WebAuthorizer$processResponseHeaders$2(meuVar, bVar2, uri2, null), this);
            if (k0 != obj2) {
                k0 = zy11.a;
            }
            if (k0 != obj2) {
                r1 = kvj0Var;
                u = q5z.N();
                kvj0Var = r1;
                ooc.g(kvj0Var, null);
                return u;
            }
            return obj2;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
