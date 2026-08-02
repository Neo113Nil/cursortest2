package com.yandex.messaging.ui.settings.folder;

import defpackage.cxr;
import defpackage.dxr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oxr;
import defpackage.q7t;
import defpackage.r7t;
import defpackage.s7t;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr7t;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lr7t;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.FoldersSettingsViewModel$1", f = "FoldersSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersSettingsViewModel$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersSettingsViewModel$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersSettingsViewModel$1 foldersSettingsViewModel$1 = new FoldersSettingsViewModel$1(this.this$0, continuation);
        foldersSettingsViewModel$1.L$0 = obj;
        return foldersSettingsViewModel$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FoldersSettingsViewModel$1 foldersSettingsViewModel$1 = (FoldersSettingsViewModel$1) create((r7t) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        foldersSettingsViewModel$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        int maxFoldersPerOrg;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r7t r7tVar = (r7t) this.L$0;
        s7t s7tVar = r7tVar.a;
        List singletonList = s7tVar != null ? Collections.singletonList(new dxr(-1, s7tVar.a, "MAIN_FOLDER", "", true)) : null;
        if (singletonList == null) {
            singletonList = EmptyList.a;
        }
        List list = singletonList;
        List<q7t> x0 = kotlin.collections.a.x0(r7tVar.b, new oxr());
        ArrayList arrayList2 = new ArrayList(tcc.n(x0, 10));
        for (q7t q7tVar : x0) {
            arrayList2.add(new dxr(q7tVar.d, q7tVar.a, q7tVar.b, q7tVar.c, false));
        }
        a aVar = this.this$0;
        r0 r0Var = aVar.x;
        do {
            value = r0Var.getValue();
            cxr cxrVar = (cxr) value;
            ArrayList m0 = kotlin.collections.a.m0(arrayList2, list);
            if (!m0.isEmpty()) {
                Iterator it = m0.iterator();
                while (it.hasNext()) {
                    if (!((dxr) it.next()).a()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            maxFoldersPerOrg = aVar.w.a().getFolders().getMaxFoldersPerOrg();
            z2 = cxrVar.b && z;
            arrayList = m0;
            if ((1 & 4) != 0) {
                arrayList = cxrVar.a;
            }
            if ((4 & 2) != 0) {
                z2 = cxrVar.b;
            }
            z3 = (4 & 4) != 0 ? cxrVar.c : false;
            if ((4 & 8) != 0) {
                maxFoldersPerOrg = cxrVar.d;
            }
            cxrVar.getClass();
        } while (!r0Var.k(value, new cxr(maxFoldersPerOrg, arrayList, z2, z3)));
        return zy11.a;
    }
}
