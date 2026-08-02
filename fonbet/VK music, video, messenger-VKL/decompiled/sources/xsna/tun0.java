package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.tabbar.settings.impl.mvi.InteractSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TabbarSettingsBottomIcon.kt */
@b6l(c = "com.vk.tabbar.settings.impl.compose.TabbarSettingsBottomIconKt$scaleAnimation$1", f = "TabbarSettingsBottomIcon.kt", l = {170, 177, 185}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class tun0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ InteractSource $interactSource;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ if2<Float, sq2> $scale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tun0(InteractSource interactSource, boolean z, if2<Float, sq2> if2Var, spj<? super tun0> spjVar) {
        super(2, spjVar);
        this.$interactSource = interactSource;
        this.$isSelected = z;
        this.$scale = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tun0(this.$interactSource, this.$isSelected, this.$scale, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tun0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r0 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (xsna.if2.c(r0, r1, r3, null, r15, 12) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r0 == r6) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$interactSource == InteractSource.USER_INTERACT_WITH_MAIN_PANEL && this.$isSelected) {
                if2<Float, sq2> if2Var = this.$scale;
                Float f = new Float(1.0f);
                dtp0 d = jq2.d(83, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
                this.label = 1;
            } else {
                if2<Float, sq2> if2Var2 = this.$scale;
                Float f2 = new Float(this.$isSelected ? 1.4f : 1.0f);
                dtp0 d2 = jq2.d(167, 0, new nkk(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 2);
                this.label = 3;
                c = if2.c(if2Var2, f2, d2, null, this, 12);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var3 = this.$scale;
            Float f3 = new Float(1.4f);
            dtp0 d3 = jq2.d(83, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
            this.label = 2;
            c2 = if2.c(if2Var3, f3, d3, null, this, 12);
        } else if (i == 2) {
            kotlin.a.a(obj);
            c2 = obj;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = obj;
        }
        return s3q0.a;
    }
}
