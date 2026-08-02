package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.zco0;

/* compiled from: TextContextMenuGesturesModifier.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 108}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ado0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zco0.b $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ gdo0 $provider;
    int label;
    final /* synthetic */ zco0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ado0(zco0 zco0Var, long j, gdo0 gdo0Var, zco0.b bVar, spj<? super ado0> spjVar) {
        super(2, spjVar);
        this.this$0 = zco0Var;
        this.$localClickOffset = j;
        this.$provider = gdo0Var;
        this.$dataProvider = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ado0(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ado0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r7.a(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L17;
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
            wzs<? super ov70, ? super spj<? super s3q0>, ? extends Object> wzsVar = this.this$0.r;
            if (wzsVar != null) {
                ov70 ov70Var = new ov70(this.$localClickOffset);
                this.label = 1;
            }
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
        gdo0 gdo0Var = this.$provider;
        zco0.b bVar = this.$dataProvider;
        this.label = 2;
    }
}
