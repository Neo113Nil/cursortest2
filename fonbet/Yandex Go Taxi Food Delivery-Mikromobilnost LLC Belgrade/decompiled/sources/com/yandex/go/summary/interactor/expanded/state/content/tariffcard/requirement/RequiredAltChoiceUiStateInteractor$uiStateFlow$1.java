package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.f6v;
import defpackage.h6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu1;
import defpackage.saj0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRequirementsRedesignEnabled", "Lf6v;", "Lufx0;", "Lpu1;", "altChoiceDataIdentifiable", "", "Lrcx0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.RequiredAltChoiceUiStateInteractor$uiStateFlow$1", f = "RequiredAltChoiceUiStateInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RequiredAltChoiceUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceUiStateInteractor$uiStateFlow$1(b0 b0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = b0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        RequiredAltChoiceUiStateInteractor$uiStateFlow$1 requiredAltChoiceUiStateInteractor$uiStateFlow$1 = new RequiredAltChoiceUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        requiredAltChoiceUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return requiredAltChoiceUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00b4 -> B:5:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pu1 pu1Var;
        b0 b0Var;
        Iterator it;
        ArrayList arrayList;
        int i;
        h6v h6vVar;
        RequiredAltChoiceUiStateInteractor$uiStateFlow$1 requiredAltChoiceUiStateInteractor$uiStateFlow$1 = this;
        boolean z = requiredAltChoiceUiStateInteractor$uiStateFlow$1.Z$0;
        f6v f6vVar = (f6v) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = requiredAltChoiceUiStateInteractor$uiStateFlow$1.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            b0 b0Var2 = requiredAltChoiceUiStateInteractor$uiStateFlow$1.this$0;
            h6v h6vVar2 = f6vVar.a;
            pu1 pu1Var2 = (pu1) f6vVar.b;
            List list = pu1Var2.a.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            pu1Var = pu1Var2;
            b0Var = b0Var2;
            it = list.iterator();
            arrayList = arrayList2;
            i = 0;
            h6vVar = h6vVar2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = requiredAltChoiceUiStateInteractor$uiStateFlow$1.I$0;
            h6v h6vVar3 = (h6v) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$11;
            Collection collection = (Collection) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$10;
            Iterator it2 = (Iterator) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$7;
            ?? r4 = (Collection) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$6;
            pu1 pu1Var3 = (pu1) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$3;
            b0 b0Var3 = (b0) requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$2;
            kotlin.b.b(obj);
            it = it2;
            pu1Var = pu1Var3;
            b0Var = b0Var3;
            h6vVar = h6vVar3;
            arrayList = r4;
            i = i3;
            Object g = obj;
            collection.add((List) g);
            requiredAltChoiceUiStateInteractor$uiStateFlow$1 = this;
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                saj0 saj0Var = (saj0) next;
                com.yandex.go.summary.mapper.a aVar = b0Var.e;
                String str = pu1Var.b;
                String str2 = pu1Var.c;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$0 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$1 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$2 = b0Var;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$3 = pu1Var;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$4 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$5 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$6 = arrayList;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$7 = it;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$8 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$9 = null;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$10 = arrayList;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.L$11 = h6vVar;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.Z$0 = z;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.I$0 = i4;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.I$1 = i;
                requiredAltChoiceUiStateInteractor$uiStateFlow$1.label = 1;
                g = aVar.g(saj0Var, str, str2, i, z, requiredAltChoiceUiStateInteractor$uiStateFlow$1);
                if (g == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collection = arrayList;
                i = i4;
                collection.add((List) g);
                requiredAltChoiceUiStateInteractor$uiStateFlow$1 = this;
                if (it.hasNext()) {
                    return new f6v(h6vVar, arrayList);
                }
            }
        }
    }
}
