package com.yandex.go.vault.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.vault.domain.prize.ActionButtonType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.p4f0;
import defpackage.q4f0;
import defpackage.qke;
import defpackage.r4f0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wgr;
import defpackage.wls;
import defpackage.x231;
import defpackage.z231;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.HapticController$Effect;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.ui.PrizeModalViewPresenter$onActionButtonClicked$1", f = "PrizeModalViewPresenter.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class PrizeModalViewPresenter$onActionButtonClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ x231 $actionButton;
    final /* synthetic */ Activity $activity;
    Object L$0;
    int label;
    final /* synthetic */ q4f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrizeModalViewPresenter$onActionButtonClicked$1(q4f0 q4f0Var, x231 x231Var, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = q4f0Var;
        this.$actionButton = x231Var;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrizeModalViewPresenter$onActionButtonClicked$1(this.this$0, this.$actionButton, this.$activity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrizeModalViewPresenter$onActionButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            z231 z231Var = this.this$0.y;
            ActionButtonType actionButtonType = this.$actionButton.a;
            o7r0 o7r0Var = z231Var.a;
            String lowerCase = actionButtonType.toString().toLowerCase(Locale.ROOT);
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button_name", lowerCase);
            o7r0Var.a.a("Vault.PrizeCard.Tapped", hashMap, 1, new HashMap());
            int i2 = p4f0.a[this.$actionButton.a.ordinal()];
            if (i2 == 1) {
                qke.E(this.$activity, HapticController$Effect.BZZ, false, 12);
                q4f0 q4f0Var = this.this$0;
                Activity activity = this.$activity;
                q4f0Var.getClass();
                ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Promocode", this.$actionButton.c));
                x231 x231Var = this.$actionButton;
                ((r4f0) this.this$0.Dg()).updateButton(this.$actionButton, new x231(x231Var.a, x231Var.b, x231Var.c, x231Var.d, x231Var.e, x231Var.f, false));
            } else if (i2 == 2) {
                String str = this.$actionButton.f;
                if (str != null) {
                    wgr wgrVar = this.this$0.x;
                    DeeplinkNavigationAction deeplinkNavigationAction = new DeeplinkNavigationAction(str);
                    this.L$0 = null;
                    this.label = 1;
                    if (wgrVar.a(deeplinkNavigationAction, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                ((r4f0) this.this$0.Dg()).close();
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
