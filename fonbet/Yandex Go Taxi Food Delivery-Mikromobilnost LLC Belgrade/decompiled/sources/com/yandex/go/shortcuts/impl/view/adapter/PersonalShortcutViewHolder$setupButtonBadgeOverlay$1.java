package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.hl4;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.BadgeView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.PersonalShortcutViewHolder$setupButtonBadgeOverlay$1", f = "PersonalShortcutViewHolder.kt", l = {264}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PersonalShortcutViewHolder$setupButtonBadgeOverlay$1 extends SuspendLambda implements wls {
    final /* synthetic */ hl4 $buttonBadge;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalShortcutViewHolder$setupButtonBadgeOverlay$1(j jVar, hl4 hl4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$buttonBadge = hl4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalShortcutViewHolder$setupButtonBadgeOverlay$1(this.this$0, this.$buttonBadge, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalShortcutViewHolder$setupButtonBadgeOverlay$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        j jVar;
        BadgeView badgeView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                j jVar2 = this.this$0;
                hl4 hl4Var = this.$buttonBadge;
                try {
                    BadgeView badgeView2 = jVar2.o0;
                    ru.yandex.taxi.widget.c cVar = jVar2.T;
                    FormattedText formattedText = hl4Var.d;
                    this.L$0 = jVar2;
                    this.L$1 = badgeView2;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    jVar = jVar2;
                    badgeView = badgeView2;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = jVar2;
                    jst.e.j(th);
                    jVar.o0.setVisibility(8);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                badgeView = (BadgeView) this.L$1;
                jVar = (j) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.j(th);
                    jVar.o0.setVisibility(8);
                    return zy11.a;
                }
            }
            badgeView.setText((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
