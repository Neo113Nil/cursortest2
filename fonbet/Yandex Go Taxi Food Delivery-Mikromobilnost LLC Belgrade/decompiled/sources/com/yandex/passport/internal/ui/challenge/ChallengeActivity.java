package com.yandex.passport.internal.ui.challenge;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.ResultAwareActivity;
import com.yandex.passport.internal.ui.challenge.d;
import com.yandex.passport.internal.ui.challenge.l;
import defpackage.b2x0;
import defpackage.bvf0;
import defpackage.ceu0;
import defpackage.i3y;
import defpackage.ins0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kum;
import defpackage.mkn;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 2*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0006:\u00013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00028\u0002*\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00028\u0002*\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00028\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0002H\u0094@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0019\u001a\u00028\u0000*\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u001fH\u0004¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010(\u001a\u00028\u00018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00020.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/ChallengeActivity;", "R", "Lcom/yandex/passport/internal/ui/challenge/d;", "Component", "Lcom/yandex/passport/internal/ui/challenge/l;", "T", "Lcom/yandex/passport/internal/ui/ResultAwareActivity;", "<init>", "()V", "Landroid/os/Bundle;", "parse", "(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/l;", "parseChallengeData", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "extras", "createChallengeActivityComponent", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/challenge/d;", "input", "logic", "(Lcom/yandex/passport/internal/ui/challenge/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transformResult", "(ZLcom/yandex/passport/internal/ui/challenge/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/passport/internal/ui/challenge/t;", ClidProvider.STATE, "consumeViewState", "(Lcom/yandex/passport/internal/ui/challenge/t;)V", "Lins0;", "show", "(Lins0;)V", "Lcom/yandex/passport/internal/ui/challenge/p;", "ui$delegate", "Li3y;", "getUi", "()Lcom/yandex/passport/internal/ui/challenge/p;", "ui", "component", "Lcom/yandex/passport/internal/ui/challenge/d;", "getComponent", "()Lcom/yandex/passport/internal/ui/challenge/d;", "setComponent", "(Lcom/yandex/passport/internal/ui/challenge/d;)V", "Lcom/yandex/passport/internal/ui/challenge/u;", "getViewModel", "()Lcom/yandex/passport/internal/ui/challenge/u;", "viewModel", "Companion", "com/yandex/passport/internal/ui/challenge/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ChallengeActivity<R, Component extends d, T extends l> extends ResultAwareActivity<T, R> {
    public static final int $stable = 8;
    public static final a Companion = new a();
    protected Component component;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(13, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object logic$consumeViewState(ChallengeActivity challengeActivity, t tVar, Continuation continuation) {
        challengeActivity.consumeViewState(tVar);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <R, Component extends d, T extends l> Object logic$suspendImpl(ChallengeActivity<R, Component, T> challengeActivity, T t, Continuation<? super R> continuation) {
        ChallengeActivity$logic$1 challengeActivity$logic$1;
        int i;
        n0 n0Var;
        ChallengeActivity challengeActivity2;
        l lVar;
        if (continuation instanceof ChallengeActivity$logic$1) {
            challengeActivity$logic$1 = (ChallengeActivity$logic$1) continuation;
            int i2 = challengeActivity$logic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeActivity$logic$1.label = i2 - Integer.MIN_VALUE;
                ChallengeActivity$logic$1 challengeActivity$logic$12 = challengeActivity$logic$1;
                Object obj = challengeActivity$logic$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeActivity$logic$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u viewModel = challengeActivity.getViewModel();
                    Uid uid = t.a;
                    o oVar = viewModel.b;
                    int i3 = 3;
                    if (oVar != null) {
                        l lVar2 = oVar.a;
                        if (jl40.l(lVar2.a, uid)) {
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Old model reused", 8);
                            }
                            n0Var = oVar.e;
                            c cVar2 = new c(new jqr(n0Var, new ChallengeActivity$logic$2(2, challengeActivity, ChallengeActivity.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/ChallengeViewModel$State;)V", 4), i3), 0);
                            challengeActivity$logic$12.L$0 = t;
                            challengeActivity$logic$12.L$1 = challengeActivity;
                            challengeActivity$logic$12.label = 1;
                            obj = kotlinx.coroutines.flow.e.y(cVar2, challengeActivity$logic$12);
                            if (obj != coroutineSingletons) {
                                challengeActivity2 = challengeActivity;
                                lVar = t;
                            }
                        }
                        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Uids not match: " + lVar2.a + " != " + uid, 8);
                        }
                        bvf0.j(oVar.d, null);
                    }
                    o W = viewModel.W(t);
                    com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New model created", 8);
                    }
                    viewModel.b = W;
                    tje.N(W.d, null, null, new ChallengeModel$invoke$1(W, null), 3);
                    n0Var = W.e;
                    c cVar22 = new c(new jqr(n0Var, new ChallengeActivity$logic$2(2, challengeActivity, ChallengeActivity.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/ChallengeViewModel$State;)V", 4), i3), 0);
                    challengeActivity$logic$12.L$0 = t;
                    challengeActivity$logic$12.L$1 = challengeActivity;
                    challengeActivity$logic$12.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(cVar22, challengeActivity$logic$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ChallengeActivity challengeActivity3 = (ChallengeActivity) challengeActivity$logic$12.L$1;
                lVar = (l) challengeActivity$logic$12.L$0;
                kotlin.b.b(obj);
                challengeActivity2 = challengeActivity3;
                boolean z = ((r) obj).a;
                challengeActivity$logic$12.L$0 = null;
                challengeActivity$logic$12.L$1 = null;
                challengeActivity$logic$12.label = 2;
                Object transformResult = challengeActivity2.transformResult(z, lVar, challengeActivity$logic$12);
                return transformResult != coroutineSingletons ? coroutineSingletons : transformResult;
            }
        }
        challengeActivity$logic$1 = new ChallengeActivity$logic$1(challengeActivity, continuation);
        ChallengeActivity$logic$1 challengeActivity$logic$122 = challengeActivity$logic$1;
        Object obj2 = challengeActivity$logic$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeActivity$logic$122.label;
        if (i != 0) {
        }
        boolean z2 = ((r) obj2).a;
        challengeActivity$logic$122.L$0 = null;
        challengeActivity$logic$122.L$1 = null;
        challengeActivity$logic$122.label = 2;
        Object transformResult2 = challengeActivity2.transformResult(z2, lVar, challengeActivity$logic$122);
        if (transformResult2 != coroutineSingletons2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p ui_delegate$lambda$0(ChallengeActivity challengeActivity) {
        return challengeActivity.getComponent().getUi();
    }

    public void consumeViewState(t state) {
        if (state instanceof q) {
            show(new kum(getComponent().getLoader()));
            return;
        }
        if (state instanceof s) {
            com.yandex.passport.internal.ui.common.web.g webSlab = getComponent().getWebSlab();
            webSlab.c(((s) state).a);
            show(webSlab);
        } else {
            if (state instanceof r) {
                return;
            }
            w511.b();
        }
    }

    public abstract Component createChallengeActivityComponent(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle);

    public final Component getComponent() {
        Component component = this.component;
        if (component != null) {
            return component;
        }
        return null;
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public p getUi() {
        return (p) this.ui.getValue();
    }

    public abstract u getViewModel();

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        int i = 8;
        mkn.a(this, new b2x0(0, 0, 0, new ceu0(i)), new b2x0(0, 0, 0, new ceu0(i)));
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            ny61.r("no extras data");
        } else {
            setComponent(createChallengeActivityComponent(a, extras));
            super.onCreate(savedInstanceState);
        }
    }

    public abstract T parseChallengeData(Bundle bundle);

    public final void setComponent(Component component) {
        this.component = component;
    }

    public final void show(ins0 ins0Var) {
        getUi().a.b(ins0Var);
    }

    public abstract Object transformResult(boolean z, T t, Continuation<? super R> continuation);

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public T parse(Bundle bundle) {
        return parseChallengeData(bundle);
    }

    @Override // com.yandex.passport.internal.ui.ResultAwareActivity
    public Object logic(T t, Continuation<? super R> continuation) {
        return logic$suspendImpl(this, t, continuation);
    }
}
