package com.yandex.go.scooters.qr.preview;

import android.graphics.drawable.Drawable;
import com.yandex.go.scooters.qr.preview.domain.ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1;
import defpackage.bno0;
import defpackage.kmo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ymo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$1", f = "ScootersPreviewViewPresenter.kt", l = {47, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreviewViewPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ kmo0 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ bno0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((kmo0) this.receiver).render((ymo0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewViewPresenter$attachView$1(kmo0 kmo0Var, bno0 bno0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bno0Var;
        this.$mvpView = kmo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreviewViewPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreviewViewPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r13, r5, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r13 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.B;
            this.label = 1;
            obj = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        com.yandex.go.scooters.qr.preview.domain.a aVar2 = this.this$0.y;
        tpr t = e.t(e.X(e.d((r0) aVar2.c.b), new ScootersPreviewInteractor$listenToPreviewState$$inlined$flatMapLatest$1(null, aVar2)));
        aVar2.a.getClass();
        g X = e.X(e.F(t, uyj.a), new ScootersPreviewViewPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, (Drawable) obj));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.$mvpView, kmo0.class, "render", "render(Ljava/lang/Object;)V", 4);
        this.L$0 = null;
        this.label = 2;
    }
}
