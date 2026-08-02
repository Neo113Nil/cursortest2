package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkHealthPermissionsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestActivityRecognitionPermission$1", f = "VkHealthPermissionsManagerImpl.kt", l = {205, 206}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class eyu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<PermissionsResult, s3q0> $block;
    final /* synthetic */ Context $context;
    int label;

    /* compiled from: VkHealthPermissionsManagerImpl.kt */
    @b6l(c = "com.vk.superapp.vkhealth.permissions.impl.VkHealthPermissionsManagerImpl$requestActivityRecognitionPermission$1$1", f = "VkHealthPermissionsManagerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<PermissionsResult, s3q0> $block;
        final /* synthetic */ boolean $isGranted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, izs izsVar, boolean z) {
            super(2, spjVar);
            this.$isGranted = z;
            this.$block = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(spjVar, this.$block, this.$isGranted);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$isGranted) {
                this.$block.invoke(PermissionsResult.GRANTED);
            } else {
                this.$block.invoke(PermissionsResult.DENIED);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eyu0(Context context, izs<? super PermissionsResult, s3q0> izsVar, spj<? super eyu0> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eyu0(this.$context, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eyu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (xsna.myc0.k(r1, r3, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Context context = this.$context;
            this.label = 1;
            obj = xx1.E(context, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ge00 main = dgn0.f().getMain();
        a aVar = new a(null, this.$block, booleanValue);
        this.label = 2;
    }
}
