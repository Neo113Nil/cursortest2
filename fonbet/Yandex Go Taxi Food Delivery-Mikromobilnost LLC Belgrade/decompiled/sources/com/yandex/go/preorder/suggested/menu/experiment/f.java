package com.yandex.go.preorder.suggested.menu.experiment;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes13.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ EntryPoint c;

    public f(tpr tprVar, g gVar, EntryPoint entryPoint) {
        this.a = tprVar;
        this.b = gVar;
        this.c = entryPoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1 suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1) {
            suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1 = (SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1) continuation;
            int i2 = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c);
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.L$0 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.L$1 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.L$2 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1 = new SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
