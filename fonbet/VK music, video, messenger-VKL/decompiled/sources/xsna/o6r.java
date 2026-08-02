package xsna;

import android.graphics.Bitmap;
import com.vk.geo.impl.model.VisibleStyle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.net.NetError;

/* compiled from: FetchImageIconByCacheUseCase.kt */
@b6l(c = "com.vk.geo.impl.usecase.FetchImageIconByCacheUseCase$fetchAndSave$2", f = "FetchImageIconByCacheUseCase.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o6r extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ do00 $marker;
    final /* synthetic */ int $style;
    final /* synthetic */ CharSequence $subtitle;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q6r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6r(q6r q6rVar, do00 do00Var, int i, CharSequence charSequence, spj<? super o6r> spjVar) {
        super(2, spjVar);
        this.this$0 = q6rVar;
        this.$marker = do00Var;
        this.$style = i;
        this.$subtitle = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        o6r o6rVar = new o6r(this.this$0, this.$marker, this.$style, this.$subtitle, spjVar);
        o6rVar.L$0 = obj;
        return o6rVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((o6r) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int min;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            q6r q6rVar = this.this$0;
            do00 do00Var = this.$marker;
            boolean z = do00Var.n;
            String str = do00Var.l;
            int i2 = this.$style;
            this.L$0 = yvjVar;
            this.label = 1;
            q6rVar.getClass();
            bpn0 bpn0Var = q6rVar.c;
            if (!VisibleStyle.B(i2) || str == null || str.length() == 0) {
                obj = null;
            } else {
                y8x d = ((crv) bpn0Var.getValue()).d();
                if (d != null) {
                    min = (int) (d.a >> 32);
                } else {
                    long b = ((crv) bpn0Var.getValue()).b(i2 & NetError.ERR_SOCKET_SET_SEND_BUFFER_SIZE_ERROR, null);
                    min = Math.min((int) (b >> 32), (int) (4294967295L & b));
                }
                obj = myc0.k(hqu0.b(), new p6r(z, q6rVar, min, str, null), this);
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        zvj.e(yvjVar);
        if (bitmap == null) {
            return Boolean.FALSE;
        }
        ((rpv) this.this$0.a.getValue()).g(this.$marker, bitmap, this.$style, this.$subtitle);
        return Boolean.TRUE;
    }
}
