package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.m150;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectFolderViewModel$special$$inlined$map$1$2$1 selectFolderViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SelectFolderViewModel$special$$inlined$map$1$2$1) {
            selectFolderViewModel$special$$inlined$map$1$2$1 = (SelectFolderViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = selectFolderViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectFolderViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectFolderViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectFolderViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((m150) obj).b;
                    selectFolderViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, selectFolderViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        selectFolderViewModel$special$$inlined$map$1$2$1 = new SelectFolderViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = selectFolderViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectFolderViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
