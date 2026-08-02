package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.reefton.protocol.ReefProtocol$Event;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: LongPressTextDragObserver.kt */
@b6l(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class n500 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ zdo0 $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n500(zdo0 zdo0Var, spj<? super n500> spjVar) {
        super(2, spjVar);
        this.$observer = zdo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        n500 n500Var = new n500(this.$observer, spjVar);
        n500Var.L$0 = obj;
        return n500Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((n500) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:6:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        eu5 eu5Var2;
        xlb0 xlb0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            this.L$0 = eu5Var;
            this.label = 1;
            obj = z2o0.b(eu5Var, null, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xlb0Var = (xlb0) this.L$1;
                eu5Var2 = (eu5) this.L$0;
                kotlin.a.a(obj);
                List<xlb0> list = ((plb0) obj).a;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xlb0 xlb0Var2 = list.get(i2);
                    if (wlb0.g(xlb0Var2.a, xlb0Var.a) && xlb0Var2.d) {
                        this.L$0 = eu5Var2;
                        this.L$1 = xlb0Var;
                        this.label = 2;
                        obj = eu5Var2.I1(PointerEventPass.Main, this);
                    }
                }
                this.$observer.b();
                return s3q0.a;
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
        }
        xlb0 xlb0Var3 = (xlb0) obj;
        zdo0 zdo0Var = this.$observer;
        long j = xlb0Var3.c;
        zdo0Var.a();
        eu5Var2 = eu5Var;
        xlb0Var = xlb0Var3;
        this.L$0 = eu5Var2;
        this.L$1 = xlb0Var;
        this.label = 2;
        obj = eu5Var2.I1(PointerEventPass.Main, this);
    }
}
