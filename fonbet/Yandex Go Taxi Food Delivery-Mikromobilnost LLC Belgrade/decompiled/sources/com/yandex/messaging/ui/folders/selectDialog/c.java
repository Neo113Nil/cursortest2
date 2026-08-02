package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.l4t;
import defpackage.n4t;
import defpackage.ny61;
import defpackage.q7t;
import defpackage.twr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ q7t c;

    public c(vpr vprVar, e eVar, q7t q7tVar) {
        this.a = vprVar;
        this.b = eVar;
        this.c = q7tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1 selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof SelectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1) {
            selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1 = (SelectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1) continuation;
            int i2 = selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n4t n4tVar = (n4t) obj;
                    boolean z2 = n4tVar instanceof l4t;
                    e eVar = this.b;
                    if (z2) {
                        z = ((l4t) n4tVar).a.contains(eVar.w.b);
                    } else {
                        eVar.getClass();
                        z = false;
                    }
                    boolean z3 = z;
                    eVar.getClass();
                    q7t q7tVar = this.c;
                    String str = q7tVar.b;
                    String str2 = q7tVar.c;
                    twr twrVar = new twr(q7tVar.d, q7tVar.a, str, str2, z3);
                    selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(twrVar, selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1 = new SelectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectFolderViewModel$createFolderItemFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
