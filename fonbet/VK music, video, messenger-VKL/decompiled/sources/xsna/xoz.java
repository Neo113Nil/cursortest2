package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.domain.CatalogBlockDo;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$loadNextBlock$1", f = "LoadDelegate.kt", l = {171, 172}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class xoz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $blockId;
    final /* synthetic */ String $nextFrom;
    final /* synthetic */ wzs<Result<? extends List<? extends CatalogBlockState>>, spj<? super s3q0>, Object> $onResult;
    final /* synthetic */ eea $this_loadNextBlock;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xoz(eea eeaVar, String str, String str2, wzs<? super Result<? extends List<? extends CatalogBlockState>>, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super xoz> spjVar) {
        super(2, spjVar);
        this.$this_loadNextBlock = eeaVar;
        this.$blockId = str;
        this.$nextFrom = str2;
        this.$onResult = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xoz(this.$this_loadNextBlock, this.$blockId, this.$nextFrom, this.$onResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xoz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1.invoke(r3, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zea zeaVar = this.$this_loadNextBlock.f;
            String str = this.$blockId;
            String str2 = this.$nextFrom;
            this.label = 1;
            b = zeaVar.b(str, str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        if (!(b instanceof Result.Failure)) {
            b = ((CatalogBlockDo) b).b;
        }
        wzs<Result<? extends List<? extends CatalogBlockState>>, spj<? super s3q0>, Object> wzsVar = this.$onResult;
        Result<? extends List<? extends CatalogBlockState>> result = new Result<>(b);
        this.L$0 = null;
        this.label = 2;
    }
}
