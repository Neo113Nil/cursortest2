package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.bd0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar, i iVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddChatsFolderViewModel$special$$inlined$map$1$2$1 addChatsFolderViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddChatsFolderViewModel$special$$inlined$map$1$2$1) {
            addChatsFolderViewModel$special$$inlined$map$1$2$1 = (AddChatsFolderViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = addChatsFolderViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addChatsFolderViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addChatsFolderViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addChatsFolderViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List x0 = kotlin.collections.a.x0((List) obj, new bd0());
                    addChatsFolderViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x0, addChatsFolderViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addChatsFolderViewModel$special$$inlined$map$1$2$1 = new AddChatsFolderViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addChatsFolderViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addChatsFolderViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
