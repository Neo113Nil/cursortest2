package xsna;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$onFilterShow$1", f = "FilterStore.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class zdr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ FilterUiModel $requestedUiModel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.photo.editor.ivm.filter.i this$0;

    /* compiled from: FilterStore.kt */
    @b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$onFilterShow$1$1", f = "FilterStore.kt", l = {120}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ FilterUiModel $requestedUiModel;
        int label;
        final /* synthetic */ com.vk.photo.editor.ivm.filter.i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.vk.photo.editor.ivm.filter.i iVar, FilterUiModel filterUiModel, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = iVar;
            this.$requestedUiModel = filterUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$requestedUiModel, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mdr mdrVar = this.this$0.f;
                int parseInt = Integer.parseInt(this.$requestedUiModel.a);
                this.label = 1;
                if (mdrVar.d(parseInt, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdr(com.vk.photo.editor.ivm.filter.i iVar, FilterUiModel filterUiModel, spj<? super zdr> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
        this.$requestedUiModel = filterUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zdr zdrVar = new zdr(this.this$0, this.$requestedUiModel, spjVar);
        zdrVar.L$0 = obj;
        return zdrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zdr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            myc0.h(yvjVar, iyx.a(), null, new a(this.this$0, this.$requestedUiModel, null), 2);
            com.vk.photo.editor.ivm.filter.i iVar = this.this$0;
            FilterUiModel filterUiModel = this.$requestedUiModel;
            this.L$0 = null;
            this.label = 1;
            if (com.vk.photo.editor.ivm.filter.i.a(iVar, filterUiModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
