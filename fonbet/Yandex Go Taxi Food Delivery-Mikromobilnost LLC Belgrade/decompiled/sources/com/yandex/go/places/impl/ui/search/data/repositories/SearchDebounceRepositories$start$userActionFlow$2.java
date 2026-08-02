package com.yandex.go.places.impl.ui.search.data.repositories;

import defpackage.evu0;
import defpackage.mvg;
import defpackage.mwp0;
import defpackage.nwp0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.utp0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lwtp0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.data.repositories.SearchDebounceRepositories$start$userActionFlow$2", f = "SearchDebounceRepositories.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchDebounceRepositories$start$userActionFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $initString;
    final /* synthetic */ tls $render;
    final /* synthetic */ tls $restoreInputText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDebounceRepositories$start$userActionFlow$2(c cVar, String str, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$initString = str;
        this.$render = tlsVar;
        this.$restoreInputText = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchDebounceRepositories$start$userActionFlow$2 searchDebounceRepositories$start$userActionFlow$2 = new SearchDebounceRepositories$start$userActionFlow$2(this.this$0, this.$initString, this.$render, this.$restoreInputText, continuation);
        searchDebounceRepositories$start$userActionFlow$2.L$0 = obj;
        return searchDebounceRepositories$start$userActionFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchDebounceRepositories$start$userActionFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r8 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object emit;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        String str = this.$initString;
        tls tlsVar = this.$render;
        tls tlsVar2 = this.$restoreInputText;
        this.L$0 = null;
        this.label = 1;
        cVar.getClass();
        if (str.length() == 0) {
            nwp0 nwp0Var = cVar.d;
            if (nwp0Var != null) {
                tlsVar2.invoke(nwp0Var.a());
                tlsVar.invoke(nwp0Var);
            } else {
                emit = vprVar.emit(new utp0(""), this);
            }
            emit = zy11Var;
        } else {
            cVar.d = new mwp0(str);
            emit = vprVar.emit(new utp0(evu0.k0(str).toString()), this);
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
