package androidx.compose.foundation;

import android.view.Surface;
import defpackage.dms;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.mx4;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", l = {130, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $height;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAndroidExternalSurfaceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = baseAndroidExternalSurfaceState;
        this.$surface = surface;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.this$0, this.$surface, this.$width, this.$height, continuation);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.L$0 = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r4.invoke(r5, r6, r7, r8, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (kotlinx.coroutines.a.f(r11, r10) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        l8x l8xVar;
        dms dmsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            l8xVar = this.this$0.job;
            if (l8xVar != null) {
                this.L$0 = tseVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState = this.this$0;
        mx4 mx4Var = new mx4(tseVar);
        dmsVar = baseAndroidExternalSurfaceState.onSurface;
        if (dmsVar != null) {
            Surface surface = this.$surface;
            Integer num = new Integer(this.$width);
            Integer num2 = new Integer(this.$height);
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
