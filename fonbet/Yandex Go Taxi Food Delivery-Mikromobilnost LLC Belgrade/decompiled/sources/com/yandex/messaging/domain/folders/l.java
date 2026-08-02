package com.yandex.messaging.domain.folders;

import defpackage.gxr;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x400;
import defpackage.zy11;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1 getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1) {
            getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1 = (GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x400 x400Var = ((gxr) obj).a;
                    Set set = x400Var != null ? x400Var.b : null;
                    if (set == null) {
                        set = EmptySet.a;
                    }
                    getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(set, getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1 = new GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
