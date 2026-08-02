package xsna;

import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StickyPlayerBackground.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground$Content$1$1", f = "StickyPlayerBackground.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class mfl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<l5g> $bottomSheetColor;
    int label;
    final /* synthetic */ ofl0 this$0;

    /* compiled from: StickyPlayerBackground.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ wh50<l5g> b;
        public final /* synthetic */ ofl0 c;

        public a(wh50<l5g> wh50Var, ofl0 ofl0Var) {
            this.b = wh50Var;
            this.c = ofl0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            float floatValue = ((Number) obj).floatValue();
            ConcurrentHashMap concurrentHashMap = ofl0.k;
            ofl0 ofl0Var = this.c;
            List h = ofl0Var.h();
            List list = ((sfl0) ((zak0) ofl0Var.g).getValue()).a;
            this.b.setValue(new l5g(list != null ? f870.D(sfl0.a(h), sfl0.a(list), floatValue) : sfl0.a(h)));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfl0(ofl0 ofl0Var, wh50<l5g> wh50Var, spj<? super mfl0> spjVar) {
        super(2, spjVar);
        this.this$0 = ofl0Var;
        this.$bottomSheetColor = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mfl0(this.this$0, this.$bottomSheetColor, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mfl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new vpj0(this.this$0, 3));
            a aVar = new a(this.$bottomSheetColor, this.this$0);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
