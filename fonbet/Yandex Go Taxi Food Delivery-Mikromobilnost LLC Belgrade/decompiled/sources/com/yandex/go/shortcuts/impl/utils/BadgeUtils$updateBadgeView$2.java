package com.yandex.go.shortcuts.impl.utils;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pl4;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.utils.BadgeUtils$updateBadgeView$2", f = "ShortcutBadgeDecoratorImpl.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BadgeUtils$updateBadgeView$2 extends SuspendLambda implements wls {
    final /* synthetic */ BadgeView $badge;
    final /* synthetic */ c $formattedTextConverter;
    final /* synthetic */ pl4 $model;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeUtils$updateBadgeView$2(c cVar, pl4 pl4Var, BadgeView badgeView, Continuation continuation) {
        super(2, continuation);
        this.$formattedTextConverter = cVar;
        this.$model = pl4Var;
        this.$badge = badgeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgeUtils$updateBadgeView$2(this.$formattedTextConverter, this.$model, this.$badge, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BadgeUtils$updateBadgeView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        pl4 pl4Var;
        BadgeView badgeView;
        BadgeView badgeView2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                c cVar = this.$formattedTextConverter;
                pl4 pl4Var2 = this.$model;
                BadgeView badgeView3 = this.$badge;
                try {
                    FormattedText formattedText = pl4Var2.b().f;
                    this.L$0 = badgeView3;
                    this.L$1 = pl4Var2;
                    this.L$2 = badgeView3;
                    this.label = 1;
                    obj = c.e(cVar, formattedText, null, true, this, 14);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pl4Var = pl4Var2;
                    badgeView2 = badgeView3;
                    badgeView = badgeView2;
                } catch (Throwable th2) {
                    th = th2;
                    pl4Var = pl4Var2;
                    badgeView = badgeView3;
                    jst.e.k(th, "Shortcut badge fail loading");
                    if (pl4Var.b().a.length() <= 0) {
                        badgeView.setText(pl4Var.b().a);
                        badgeView.setVisibility(0);
                    } else {
                        badgeView.setVisibility(8);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                badgeView = (BadgeView) this.L$2;
                pl4Var = (pl4) this.L$1;
                badgeView2 = (BadgeView) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, "Shortcut badge fail loading");
                    if (pl4Var.b().a.length() <= 0) {
                    }
                    return zy11.a;
                }
            }
            badgeView2.setText((CharSequence) obj);
            badgeView2.setVisibility(0);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
