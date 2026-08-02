package xsna;

import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;

/* compiled from: LoadDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$hideBlock$2$1", f = "LoadDelegate.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class woz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CatalogBlockData $blockData;
    final /* synthetic */ String $blockIdToHide;
    final /* synthetic */ eea $this_hideBlock;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woz(eea eeaVar, String str, CatalogBlockData catalogBlockData, spj<? super woz> spjVar) {
        super(2, spjVar);
        this.$this_hideBlock = eeaVar;
        this.$blockIdToHide = str;
        this.$blockData = catalogBlockData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new woz(this.$this_hideBlock, this.$blockIdToHide, this.$blockData, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((woz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zea zeaVar = this.$this_hideBlock.f;
            String str = this.$blockIdToHide;
            this.label = 1;
            e = zeaVar.e(str, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            e = ((Result) obj).d();
        }
        eea eeaVar = this.$this_hideBlock;
        CatalogBlockData catalogBlockData = this.$blockData;
        if (!(e instanceof Result.Failure)) {
            el50.a.b(eeaVar, new z6f0(catalogBlockData, 23));
            catalogBlockData.clear();
        }
        return s3q0.a;
    }
}
