package xsna;

import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementDo;
import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementListDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$replaceBlocks$1", f = "LoadDelegate.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class zoz extends SuspendLambda implements wzs<yvj, spj<? super Result<?>>, Object> {
    final /* synthetic */ List<String> $replacementIdList;
    final /* synthetic */ eea $this_replaceBlocks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoz(eea eeaVar, List<String> list, spj<? super zoz> spjVar) {
        super(2, spjVar);
        this.$this_replaceBlocks = eeaVar;
        this.$replacementIdList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zoz(this.$this_replaceBlocks, this.$replacementIdList, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<?>> spjVar) {
        return ((zoz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zea zeaVar = this.$this_replaceBlocks.f;
            List<String> list = this.$replacementIdList;
            this.label = 1;
            c = zeaVar.c(list, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
        }
        eea eeaVar = this.$this_replaceBlocks;
        if (!(c instanceof Result.Failure)) {
            CatalogBlockReplacementListDo catalogBlockReplacementListDo = (CatalogBlockReplacementListDo) c;
            wxm wxmVar = new wxm(new ArrayList(((CatalogSectionState) eeaVar.b.getCurrentState()).d));
            for (CatalogBlockReplacementDo catalogBlockReplacementDo : catalogBlockReplacementListDo.b) {
                wxmVar.a(catalogBlockReplacementDo.b, catalogBlockReplacementDo.c, new n1g0(0));
            }
            fto0.s(eeaVar, new d05(23, wxmVar, catalogBlockReplacementListDo));
        }
        return new Result(c);
    }
}
