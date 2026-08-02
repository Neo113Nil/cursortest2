package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import defpackage.b5d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tld0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.PlusShortcutTextBuilder$trySetImageSpan$2$1", f = "PlusShortcutTextBuilder.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusShortcutTextBuilder$trySetImageSpan$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tld0 $icon;
    final /* synthetic */ b5d0 $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusShortcutTextBuilder$trySetImageSpan$2$1(b5d0 b5d0Var, tld0 tld0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = b5d0Var;
        this.$icon = tld0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusShortcutTextBuilder$trySetImageSpan$2$1(this.$this_runSuspendCatching, this.$icon, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusShortcutTextBuilder$trySetImageSpan$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) this.$this_runSuspendCatching).b(this.$icon.d);
        this.label = 1;
        Object c = b.c(this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
