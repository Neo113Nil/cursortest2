package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: LikeButton.kt */
@b6l(c = "com.vk.fullscreenvideo.icons.LikeButtonKt$LikeButton$1$1", f = "LikeButton.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class i6z extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yvj $coroutineScope;
    final /* synthetic */ wh50<Boolean> $isFirstComposition$delegate;
    final /* synthetic */ boolean $isLiked;
    final /* synthetic */ if2<Float, sq2> $scale;
    int label;

    /* compiled from: LikeButton.kt */
    @b6l(c = "com.vk.fullscreenvideo.icons.LikeButtonKt$LikeButton$1$1$1", f = "LikeButton.kt", l = {56, 57, 58, 59, 61, 62}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isLiked;
        final /* synthetic */ if2<Float, sq2> $scale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if2 if2Var, spj spjVar, boolean z) {
            super(2, spjVar);
            this.$isLiked = z;
            this.$scale = if2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$scale, spjVar, this.$isLiked);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
        
            if (r14 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
        
            if (r14 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            if (xsna.if2.c(r7, r8, r9, null, r11, 12) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        
            if (xsna.if2.c(r7, r8, r9, null, r11, 12) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        
            if (xsna.if2.c(r7, r8, r9, null, r11, 12) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
        
            if (xsna.if2.c(r7, r8, r9, null, r11, 12) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            a aVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.label) {
                case 0:
                    kotlin.a.a(obj);
                    if (!this.$isLiked) {
                        aVar = this;
                        if2<Float, sq2> if2Var = aVar.$scale;
                        Float f = new Float(0.8f);
                        dtp0 d = jq2.d(170, 0, null, 6);
                        aVar.label = 5;
                        break;
                    } else {
                        if2<Float, sq2> if2Var2 = this.$scale;
                        Float f2 = new Float(1.45f);
                        dtp0 d2 = jq2.d(75, 0, null, 6);
                        this.label = 1;
                        aVar2 = this;
                        break;
                    }
                    return coroutineSingletons;
                case 1:
                    kotlin.a.a(obj);
                    aVar2 = this;
                    if2<Float, sq2> if2Var3 = aVar2.$scale;
                    Float f3 = new Float(0.91f);
                    dtp0 d3 = jq2.d(VersionConstants.PRODUCT_MAJOR_VERSION, 0, null, 6);
                    aVar2.label = 2;
                    break;
                case 2:
                    kotlin.a.a(obj);
                    aVar2 = this;
                    if2<Float, sq2> if2Var4 = aVar2.$scale;
                    Float f4 = new Float(1.03f);
                    dtp0 d4 = jq2.d(165, 0, null, 6);
                    aVar2.label = 3;
                    break;
                case 3:
                    kotlin.a.a(obj);
                    aVar2 = this;
                    if2<Float, sq2> if2Var5 = aVar2.$scale;
                    Float f5 = new Float(1.0f);
                    dtp0 d5 = jq2.d(100, 0, null, 6);
                    aVar2.label = 4;
                    obj = if2.c(if2Var5, f5, d5, null, aVar2, 12);
                    break;
                case 4:
                    kotlin.a.a(obj);
                    return s3q0.a;
                case 5:
                    kotlin.a.a(obj);
                    aVar = this;
                    if2<Float, sq2> if2Var6 = aVar.$scale;
                    Float f6 = new Float(1.0f);
                    dtp0 d6 = jq2.d(170, 0, null, 6);
                    aVar.label = 6;
                    obj = if2.c(if2Var6, f6, d6, null, aVar, 12);
                    break;
                case 6:
                    kotlin.a.a(obj);
                    return s3q0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6z(yvj yvjVar, wh50<Boolean> wh50Var, boolean z, if2<Float, sq2> if2Var, spj<? super i6z> spjVar) {
        super(2, spjVar);
        this.$coroutineScope = yvjVar;
        this.$isFirstComposition$delegate = wh50Var;
        this.$isLiked = z;
        this.$scale = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i6z(this.$coroutineScope, this.$isFirstComposition$delegate, this.$isLiked, this.$scale, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i6z) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$isFirstComposition$delegate.getValue().booleanValue()) {
            return s3q0.a;
        }
        myc0.h(this.$coroutineScope, null, null, new a(this.$scale, null, this.$isLiked), 3);
        return s3q0.a;
    }
}
