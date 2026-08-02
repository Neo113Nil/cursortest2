package com.yandex.go.shortcuts.impl.interactors;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$onFirstContentfulPaint$1$invokeSuspend$lambda$0$$inlined$safeCollectIn$1;
import com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2;
import com.yandex.go.shortcuts.impl.interactors.g;
import com.yandex.go.shortcuts.impl.interactors.l;
import com.yandex.go.shortcuts.impl.interactors.m;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$onFirstContentfulPaint$1", f = "MediaShortcutInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MediaShortcutInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaShortcutInteractor$onFirstContentfulPaint$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaShortcutInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MediaShortcutInteractor$onFirstContentfulPaint$1 mediaShortcutInteractor$onFirstContentfulPaint$1 = (MediaShortcutInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mediaShortcutInteractor$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final g gVar = this.this$0;
        final int i = 0;
        cey.b(gVar.d, Lifecycle.Event.ON_RESUME, new Runnable() { // from class: jf10
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                g gVar2 = gVar;
                switch (i2) {
                    case 0:
                        gVar2.g.f();
                        m mVar = gVar2.a;
                        tje.N(gVar2.g, null, null, new MediaShortcutInteractor$onFirstContentfulPaint$1$invokeSuspend$lambda$0$$inlined$safeCollectIn$1(e.t(e.X(new l(mVar.i.a, yaf0.a), new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2(3, null))), null, gVar2), 3);
                        break;
                    default:
                        gVar2.g.b();
                        break;
                }
            }
        });
        final g gVar2 = this.this$0;
        final int i2 = 1;
        cey.b(gVar2.d, Lifecycle.Event.ON_PAUSE, new Runnable() { // from class: jf10
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                g gVar22 = gVar2;
                switch (i22) {
                    case 0:
                        gVar22.g.f();
                        m mVar = gVar22.a;
                        tje.N(gVar22.g, null, null, new MediaShortcutInteractor$onFirstContentfulPaint$1$invokeSuspend$lambda$0$$inlined$safeCollectIn$1(e.t(e.X(new l(mVar.i.a, yaf0.a), new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$2(3, null))), null, gVar22), 3);
                        break;
                    default:
                        gVar22.g.b();
                        break;
                }
            }
        });
        return zy11.a;
    }
}
