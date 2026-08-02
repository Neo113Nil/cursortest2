package com.yandex.go.telemetry.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.twl;
import defpackage.wls;
import defpackage.zy11;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.telemetry.domain.DnsResolveInteractor$resolveDns$2", f = "DnsResolveInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DnsResolveInteractor$resolveDns$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $hostName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsResolveInteractor$resolveDns$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$hostName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DnsResolveInteractor$resolveDns$2(this.$hostName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DnsResolveInteractor$resolveDns$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = this.$hostName;
        StringBuilder sb = new StringBuilder();
        sb.append("dns lookup to " + str + "\n");
        List a = twl.W1.a(str);
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getHostAddress());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str2 = (String) next;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            sb.append(((String) it3.next()) + "\n");
        }
        sb.append("\nfinish dns lookup");
        return sb.toString();
    }
}
