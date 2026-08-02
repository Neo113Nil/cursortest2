package com.yandex.go.wallet.custom.plaque_container;

import android.content.Context;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.f1d0;
import defpackage.jn4;
import defpackage.kn4;
import defpackage.l8x;
import defpackage.lkc0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.plus.interactor.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/wallet/custom/plaque_container/PlaqueContainerHolder;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Ltse;", "mainScope", "Ljn4;", "plusFactory", "Lf1d0;", "plusBadgeAvailabilityInteractor", "<init>", "(Landroid/content/Context;Ltse;Ljn4;Lf1d0;)V", "Lzy11;", "awaitBadgeAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPlusBadge", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Ltse;", "Ljn4;", "Lf1d0;", "Ll8x;", "job", "Ll8x;", "Lkn4;", "badge", "Lkn4;", "mkc0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlaqueContainerHolder extends GoFrameLayout {
    private kn4 badge;
    private l8x job;
    private final tse mainScope;
    private final f1d0 plusBadgeAvailabilityInteractor;
    private final jn4 plusFactory;

    public PlaqueContainerHolder(Context context, tse tseVar, jn4 jn4Var, f1d0 f1d0Var) {
        super(context, null, 0, 0, 14, null);
        this.mainScope = tseVar;
        this.plusFactory = jn4Var;
        this.plusBadgeAvailabilityInteractor = f1d0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitBadgeAvailable(Continuation<? super zy11> continuation) {
        PlaqueContainerHolder$awaitBadgeAvailable$1 plaqueContainerHolder$awaitBadgeAvailable$1;
        int i;
        if (continuation instanceof PlaqueContainerHolder$awaitBadgeAvailable$1) {
            plaqueContainerHolder$awaitBadgeAvailable$1 = (PlaqueContainerHolder$awaitBadgeAvailable$1) continuation;
            int i2 = plaqueContainerHolder$awaitBadgeAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueContainerHolder$awaitBadgeAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueContainerHolder$awaitBadgeAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueContainerHolder$awaitBadgeAvailable$1.label;
                if (i != 0) {
                    b.b(obj);
                    tpr a = ((a) this.plusBadgeAvailabilityInteractor).a();
                    PlaqueContainerHolder$awaitBadgeAvailable$2 plaqueContainerHolder$awaitBadgeAvailable$2 = new PlaqueContainerHolder$awaitBadgeAvailable$2(2, null);
                    plaqueContainerHolder$awaitBadgeAvailable$1.label = 1;
                    if (e.x(a, plaqueContainerHolder$awaitBadgeAvailable$2, plaqueContainerHolder$awaitBadgeAvailable$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        plaqueContainerHolder$awaitBadgeAvailable$1 = new PlaqueContainerHolder$awaitBadgeAvailable$1(this, continuation);
        Object obj2 = plaqueContainerHolder$awaitBadgeAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueContainerHolder$awaitBadgeAvailable$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPlusBadge() {
        jn4 jn4Var = this.plusFactory;
        kn4 kn4Var = null;
        if (jn4Var != null) {
            kn4Var = jn4Var.a(this, null, new lkc0());
            kn4Var.a();
        }
        this.badge = kn4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPlusBadge$lambda$0(int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.plusFactory != null) {
            this.job = tje.N(this.mainScope, null, null, new PlaqueContainerHolder$onAttachedToWindow$1(this, null), 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.job = null;
        kn4 kn4Var = this.badge;
        if (kn4Var != null) {
            kn4Var.b();
        }
        this.badge = null;
    }
}
