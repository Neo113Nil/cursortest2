package com.yandex.go.preorder.suggested.menu;

import com.yandex.go.preorder.suggested.menu.experiment.g;
import defpackage.d6v0;
import defpackage.jl40;
import defpackage.m8v0;
import defpackage.ny61;
import defpackage.x9v0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes12.dex */
public final class a implements d6v0 {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(EntryPoint entryPoint, x9v0 x9v0Var, ContinuationImpl continuationImpl) {
        SuggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1 suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1;
        int i;
        if (continuationImpl instanceof SuggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1) {
            suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1 = (SuggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1) continuationImpl;
            int i2 = suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.label;
                if (i != 0) {
                    b.b(obj);
                    suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.L$0 = null;
                    suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.L$1 = x9v0Var;
                    suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.label = 1;
                    obj = this.a.d(entryPoint, suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x9v0Var = (x9v0) suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.L$1;
                    b.b(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue() && b(x9v0Var));
            }
        }
        suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1 = new SuggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1(this, continuationImpl);
        Object obj2 = suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuAvailabilityResolverImpl$isSuggestMenuAvailable$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj2).booleanValue() && b(x9v0Var));
    }

    public final boolean b(x9v0 x9v0Var) {
        SuggestResult$SuggestAction suggestResult$SuggestAction = x9v0Var.F;
        return (suggestResult$SuggestAction == null || suggestResult$SuggestAction == SuggestResult$SuggestAction.SEARCH) && !jl40.l(x9v0Var.w, m8v0.a) && x9v0Var.A == null;
    }
}
