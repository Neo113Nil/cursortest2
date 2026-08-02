package com.yandex.messaging.ui.settings.folder.mainFolderSettings;

import defpackage.a500;
import defpackage.b500;
import defpackage.c500;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7t;
import defpackage.r7t;
import defpackage.tcc;
import defpackage.uwr;
import defpackage.z400;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr7t;", "folders", "Lc500;", "excludedState", "", "<anonymous>", "(Lr7t;Lc500;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.mainFolderSettings.MainFolderSettingsViewModel$uiState$1", f = "MainFolderSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MainFolderSettingsViewModel$uiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainFolderSettingsViewModel$uiState$1 mainFolderSettingsViewModel$uiState$1 = new MainFolderSettingsViewModel$uiState$1(3, (Continuation) obj3);
        mainFolderSettingsViewModel$uiState$1.L$0 = (r7t) obj;
        mainFolderSettingsViewModel$uiState$1.L$1 = (c500) obj2;
        return mainFolderSettingsViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r7t r7tVar = (r7t) this.L$0;
        c500 c500Var = (c500) this.L$1;
        ArrayList arrayList = r7tVar.b;
        Set set = c500Var.b;
        Set set2 = c500Var.a;
        if (set2 == null) {
            return a500.a;
        }
        List<q7t> x0 = kotlin.collections.a.x0(arrayList, new b500());
        ArrayList arrayList2 = new ArrayList(tcc.n(x0, 10));
        for (q7t q7tVar : x0) {
            String str = q7tVar.b;
            arrayList2.add(new uwr(str, q7tVar.c, set.contains(str)));
        }
        return new z400(arrayList2, (set2 == null || set2.equals(set)) ? false : true);
    }
}
