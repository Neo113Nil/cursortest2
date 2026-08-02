package com.yandex.messaging.domain.folders;

import defpackage.ny61;
import defpackage.s8t;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ long b;

    public m(vpr vprVar, long j) {
        this.a = vprVar;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1 getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1) {
            getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1 = (GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1) continuation;
            int i2 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s8t s8tVar = new s8t((Set) obj, this.b);
                    getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(s8tVar, getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1) == coroutineSingletons) {
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
        getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1 = new GetMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1(this, continuation);
        Object obj22 = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMainFolderExcludedFoldersIdsUseCase$run$lambda$2$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
