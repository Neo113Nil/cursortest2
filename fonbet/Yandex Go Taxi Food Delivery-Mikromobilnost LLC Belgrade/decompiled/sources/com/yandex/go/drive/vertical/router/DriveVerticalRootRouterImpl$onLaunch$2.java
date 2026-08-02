package com.yandex.go.drive.vertical.router;

import com.yandex.go.drive.vertical.interactor.f;
import defpackage.c0g;
import defpackage.c0m;
import defpackage.ck31;
import defpackage.gzf;
import defpackage.khm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.router.DriveVerticalRootRouterImpl$onLaunch$2", f = "DriveVerticalRootRouterImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveVerticalRootRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ khm $localComponent;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.drive.vertical.router.DriveVerticalRootRouterImpl$onLaunch$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((a) this.receiver).r(new c0m(6));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveVerticalRootRouterImpl$onLaunch$2(khm khmVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$localComponent = khmVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveVerticalRootRouterImpl$onLaunch$2(this.$localComponent, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveVerticalRootRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gzf gzfVar = (gzf) this.$localComponent;
            String str = gzfVar.b;
            c0g c0gVar = (c0g) gzfVar.a;
            ck31 d1 = c0gVar.d1();
            q5z.h(d1);
            f fVar = new f(str, d1, c0gVar.z.d());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, this.this$0, a.class, "onVerticalGone", "onVerticalGone()V", 0);
            this.label = 1;
            if (fVar.a(anonymousClass1, this) == coroutineSingletons) {
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
