package com.yandex.go.flex.main_screen.presentation.scroll;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.mip0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.b a;
    public final /* synthetic */ mip0 b;
    public final /* synthetic */ RecyclerView c;

    public c(kotlinx.coroutines.flow.b bVar, mip0 mip0Var, RecyclerView recyclerView) {
        this.a = bVar;
        this.b = mip0Var;
        this.c = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1 scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1) {
            scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1 = (ScrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1 = new ScrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
