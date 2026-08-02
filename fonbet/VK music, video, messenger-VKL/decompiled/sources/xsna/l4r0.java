package xsna;

import com.vk.uxpolls.domain.exception.NotConfiguredError;
import java.util.Collection;
import java.util.Collections;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.fqt;

/* compiled from: UxPolls.kt */
/* loaded from: classes6.dex */
public final class l4r0 {
    public static blq0 a;
    public static d4e0 b;
    public static ovj c;
    public static final bpn0 d;
    public static final bpn0 e;
    public static final bpn0 f;
    public static final bpn0 g;

    /* compiled from: UxPolls.kt */
    @b6l(c = "com.vk.uxpolls.framework.UxPolls$isPollRetrieved$1", f = "UxPolls.kt", l = {123}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ String $trigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$trigger = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$trigger, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                asl b = ((fqt) l4r0.e.getValue()).b(l4r0.c, new fqt.a.b(Collections.singletonList(this.$trigger)));
                this.label = 1;
                obj = b.J(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return Boolean.valueOf(!((Collection) obj).isEmpty());
        }
    }

    static {
        bdn bdnVar = bdn.a;
        c = wgl.c;
        d = new bpn0(new s7c0(9));
        e = new bpn0(new o2a0(13));
        f = new bpn0(new jkg0(6));
        g = new bpn0(new u3c0(4));
    }

    public static boolean a(String str) {
        if (znk0.C()) {
            return ((Boolean) myc0.i(EmptyCoroutineContext.b, new a(str, null))).booleanValue();
        }
        new NotConfiguredError("isPollRetrieved() was called before configure()");
        return false;
    }
}
