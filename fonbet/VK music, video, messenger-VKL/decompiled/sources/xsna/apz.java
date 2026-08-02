package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$replaceBlocks$2", f = "LoadDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class apz extends SuspendLambda implements wzs<yvj, spj<? super Result<?>>, Object> {
    final /* synthetic */ BlockId $blockId;
    final /* synthetic */ List<CatalogBlockState> $replacementBlocks;
    final /* synthetic */ eea $this_replaceBlocks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public apz(eea eeaVar, BlockId blockId, List<? extends CatalogBlockState> list, spj<? super apz> spjVar) {
        super(2, spjVar);
        this.$this_replaceBlocks = eeaVar;
        this.$blockId = blockId;
        this.$replacementBlocks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new apz(this.$this_replaceBlocks, this.$blockId, this.$replacementBlocks, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<?>> spjVar) {
        return ((apz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wxm wxmVar = new wxm(new ArrayList(((CatalogSectionState) this.$this_replaceBlocks.b.getCurrentState()).d));
        wxmVar.a(Collections.singletonList(this.$blockId), this.$replacementBlocks, new xht(27));
        fto0.s(this.$this_replaceBlocks, new wcj(wxmVar, 20));
        return new Result(s3q0.a);
    }
}
