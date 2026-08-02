package androidx.compose.foundation.pager;

import defpackage.a990;
import defpackage.iip0;
import defpackage.iu30;
import defpackage.jj2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6y;
import defpackage.z890;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liip0;", "Lzy11;", "<anonymous>", "(Liip0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements wls {
    final /* synthetic */ jj2 $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(d dVar, int i, float f, jj2 jj2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = jj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, continuation);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$animateScrollToPage$3) create((iip0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r3 < r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 != 0) {
            if (i3 == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        iip0 iip0Var = (iip0) this.L$0;
        d dVar = this.this$0;
        y6y y6yVar = new y6y(iip0Var, dVar, 1);
        int i4 = this.$targetPage;
        float f = this.$targetPageOffsetToSnappedPosition;
        jj2 jj2Var = this.$animationSpec;
        this.label = 1;
        z890 z890Var = a990.a;
        dVar.q.setIntValue(dVar.j(new Integer(i4).intValue()));
        boolean z = i4 > dVar.e;
        int e = (y6yVar.e() - dVar.e) + 1;
        if (((z && i4 > y6yVar.e()) || (!z && i4 < dVar.e)) && Math.abs(i4 - dVar.e) >= 3) {
            if (z) {
                i2 = i4 - e;
                i = dVar.e;
            } else {
                int i5 = e + i4;
                i = dVar.e;
                if (i5 <= i) {
                    i2 = i5;
                    y6yVar.f(i2, 0);
                }
                i2 = i;
                y6yVar.f(i2, 0);
            }
        }
        Object c = androidx.compose.animation.core.e.c(0.0f, y6yVar.b(i4) + f, jj2Var, new iu30(27, new Ref$FloatRef(), y6yVar), this, 4);
        if (c != coroutineSingletons) {
            c = zy11Var;
        }
        return c == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
