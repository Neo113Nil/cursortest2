package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StickyPlayerBackground.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground$animateTo$1", f = "StickyPlayerBackground.kt", l = {183, 190}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class nfl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $url;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ofl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfl0(String str, ofl0 ofl0Var, spj<? super nfl0> spjVar) {
        super(2, spjVar);
        this.$url = str;
        this.this$0 = ofl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nfl0(this.$url, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nfl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r12.f(r11) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        ofl0 ofl0Var;
        ofl0 ofl0Var2;
        if2<Float, ?> if2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            String str = this.$url;
            if (str != null) {
                sfl0 sfl0Var = (sfl0) ofl0.k.get(str);
                List list3 = sfl0Var != null ? sfl0Var.a : null;
                sfl0 sfl0Var2 = list3 != null ? new sfl0(list3) : null;
                list = sfl0Var2 != null ? sfl0Var2.a : null;
                if (list != null) {
                    if2<Float, ?> if2Var2 = this.this$0.i;
                    if (if2Var2 != null) {
                        this.L$0 = list;
                        this.label = 1;
                    }
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ofl0Var = (ofl0) this.L$5;
            ofl0Var2 = (ofl0) this.L$3;
            if2Var = (if2) this.L$2;
            list2 = (List) this.L$1;
            kotlin.a.a(obj);
            ConcurrentHashMap concurrentHashMap = ofl0.k;
            ofl0Var2.l(list2);
            ofl0Var.i = if2Var;
            return s3q0.a;
        }
        list = (List) this.L$0;
        kotlin.a.a(obj);
        ofl0 ofl0Var3 = this.this$0;
        ofl0Var3.i = null;
        List list4 = ((sfl0) ((zak0) ofl0Var3.g).getValue()).a;
        ofl0 ofl0Var4 = this.this$0;
        ofl0Var4.l(ofl0Var4.h());
        ((zak0) this.this$0.f).setValue(new sfl0(list));
        ofl0 ofl0Var5 = this.this$0;
        if2<Float, ?> a = qf2.a(1.0f);
        ofl0 ofl0Var6 = this.this$0;
        Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        dtp0 d = jq2.d(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, luo.a, 2);
        gib0 gib0Var = new gib0(ofl0Var6, 13);
        this.L$0 = null;
        this.L$1 = list4;
        this.L$2 = a;
        this.L$3 = ofl0Var6;
        this.L$4 = null;
        this.L$5 = ofl0Var5;
        this.I$0 = 0;
        this.label = 2;
        if (if2.c(a, f, d, gib0Var, this, 4) != coroutineSingletons) {
            list2 = list4;
            ofl0Var = ofl0Var5;
            ofl0Var2 = ofl0Var6;
            if2Var = a;
            ConcurrentHashMap concurrentHashMap2 = ofl0.k;
            ofl0Var2.l(list2);
            ofl0Var.i = if2Var;
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}
