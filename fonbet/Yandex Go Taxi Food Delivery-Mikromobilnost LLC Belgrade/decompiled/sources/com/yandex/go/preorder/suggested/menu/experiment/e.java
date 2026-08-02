package com.yandex.go.preorder.suggested.menu.experiment;

import com.yandex.go.preorder.suggested.menu.experiment.SuggestMenuExperiment;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.o5v0;
import defpackage.vpr;
import defpackage.zt;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ EntryPoint c;

    public e(vpr vprVar, g gVar, EntryPoint entryPoint) {
        this.a = vprVar;
        this.b = gVar;
        this.c = entryPoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1 suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1) {
            suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1 = (SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1) continuation;
            int i2 = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SuggestMenuExperiment suggestMenuExperiment = (SuggestMenuExperiment) obj;
                    this.b.getClass();
                    boolean z = suggestMenuExperiment.b && suggestMenuExperiment.j.contains(this.c);
                    SuggestMenuExperiment.ContentDescriptions contentDescriptions = suggestMenuExperiment.i;
                    o5v0 o5v0Var = new o5v0(z, new zt(d6z.Y(suggestMenuExperiment, contentDescriptions.a), d6z.Y(suggestMenuExperiment, contentDescriptions.c)));
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.L$0 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.L$1 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.L$2 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.L$3 = null;
                    suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(o5v0Var, suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1 = new SuggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuExperimentRepository$getSuggestItemContextMenuConfigFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
