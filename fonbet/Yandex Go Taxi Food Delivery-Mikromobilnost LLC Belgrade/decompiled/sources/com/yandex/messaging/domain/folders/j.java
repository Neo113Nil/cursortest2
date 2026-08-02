package com.yandex.messaging.domain.folders;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.ny61;
import defpackage.p7t;
import defpackage.t4r;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ p7t c;

    public j(vpr vprVar, Set set, p7t p7tVar) {
        this.a = vprVar;
        this.b = set;
        this.c = p7tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetFolderFiltersUseCase$run$$inlined$map$1$2$1 getFolderFiltersUseCase$run$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetFolderFiltersUseCase$run$$inlined$map$1$2$1) {
            getFolderFiltersUseCase$run$$inlined$map$1$2$1 = (GetFolderFiltersUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = getFolderFiltersUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFolderFiltersUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getFolderFiltersUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFolderFiltersUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    BackendConfig backendConfig = (BackendConfig) obj;
                    Set<String> set = this.b;
                    ArrayList arrayList = new ArrayList();
                    for (String str : set) {
                        FoldersConfig.Filter filter = backendConfig.getFolders().getFilters().get(str);
                        t4r t4rVar = filter != null ? new t4r(str, this.c.c.a(filter), com.yandex.messaging.internal.images.b.f(filter.getAvatarUrl())) : null;
                        if (t4rVar != null) {
                            arrayList.add(t4rVar);
                        }
                    }
                    getFolderFiltersUseCase$run$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, getFolderFiltersUseCase$run$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getFolderFiltersUseCase$run$$inlined$map$1$2$1 = new GetFolderFiltersUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getFolderFiltersUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFolderFiltersUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
