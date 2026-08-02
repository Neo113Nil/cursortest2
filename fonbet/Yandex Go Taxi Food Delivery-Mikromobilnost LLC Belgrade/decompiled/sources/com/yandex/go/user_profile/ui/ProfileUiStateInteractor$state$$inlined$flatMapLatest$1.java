package com.yandex.go.user_profile.ui;

import com.yandex.go.experiment.f;
import com.yandex.go.ultima_mode.domain.c;
import defpackage.kj;
import defpackage.lk51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tgf0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.ProfileUiStateInteractor$state$$inlined$flatMapLatest$1", f = "ProfileUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ProfileUiStateInteractor$state$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $profileContextFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ tgf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUiStateInteractor$state$$inlined$flatMapLatest$1(Continuation continuation, tgf0 tgf0Var, tpr tprVar) {
        super(3, continuation);
        this.this$0 = tgf0Var;
        this.$profileContextFlow$inlined = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProfileUiStateInteractor$state$$inlined$flatMapLatest$1 profileUiStateInteractor$state$$inlined$flatMapLatest$1 = new ProfileUiStateInteractor$state$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$profileContextFlow$inlined);
        profileUiStateInteractor$state$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        profileUiStateInteractor$state$$inlined$flatMapLatest$1.L$1 = obj2;
        return profileUiStateInteractor$state$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tgf0 tgf0Var = this.this$0;
            r0 r0Var = tgf0Var.c.d;
            tpr Pg = ((h) tgf0Var.a).Pg();
            tpr d = com.yandex.go.coroutines.b.d(this.this$0.b.b(), new ProfileUiStateInteractor$state$lambda$0$$inlined$start$1(lk51.e, null));
            tpr e = this.this$0.e.e();
            tpr a = this.this$0.h.a();
            tpr a2 = ((com.yandex.go.user_profile.settings.profile.data.b) this.this$0.f).a();
            tpr d2 = ((c) this.this$0.i).d();
            tpr a3 = this.this$0.j.a();
            f fVar = new f(d.a(this.this$0.g.a()));
            tpr tprVar = this.$profileContextFlow$inlined;
            tgf0 tgf0Var2 = this.this$0;
            b bVar = new b(new tpr[]{r0Var, Pg, d, e, a, a2, d2, a3, fVar, tprVar, tgf0Var2.l.c}, tgf0Var2, (kj) obj2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(bVar, vprVar, this) == coroutineSingletons) {
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
