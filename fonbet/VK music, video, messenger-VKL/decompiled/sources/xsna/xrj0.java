package xsna;

import com.vk.dto.hints.HintId;
import com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet$1$1$1$1$invokeSuspend$$inlined$filter$1$2;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SimplePostingCreateBottomSheet.kt */
@b6l(c = "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet$1$1$1$1", f = "SimplePostingCreateBottomSheet.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class xrj0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasOnboarding;
    final /* synthetic */ mtk0<Boolean> $sheetExpanded$delegate;
    final /* synthetic */ wh50<Boolean> $showCommunityVideoHighlighter$delegate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.newsfeed.impl.items.posting.item.modals.d this$0;

    /* compiled from: SimplePostingCreateBottomSheet.kt */
    @b6l(c = "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet$1$1$1$1$1", f = "SimplePostingCreateBottomSheet.kt", l = {113}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $showCommunityVideoHighlighter$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$showCommunityVideoHighlighter$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$showCommunityVideoHighlighter$delegate, spjVar);
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
                this.label = 1;
                if (qsl.b(5000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$showCommunityVideoHighlighter$delegate.setValue(Boolean.FALSE);
            return s3q0.a;
        }
    }

    /* compiled from: SimplePostingCreateBottomSheet.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ com.vk.newsfeed.impl.items.posting.item.modals.d b;

        public b(com.vk.newsfeed.impl.items.posting.item.modals.d dVar) {
            this.b = dVar;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ((Boolean) obj).getClass();
            ((h7v) this.b.b.B.getValue()).b(HintId.VIDEO_BUTTON_RELOCATION_IN_POSTING_COMMUNITY_MODAL.getId());
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrj0(boolean z, mtk0<Boolean> mtk0Var, wh50<Boolean> wh50Var, com.vk.newsfeed.impl.items.posting.item.modals.d dVar, spj<? super xrj0> spjVar) {
        super(2, spjVar);
        this.$hasOnboarding = z;
        this.$sheetExpanded$delegate = mtk0Var;
        this.$showCommunityVideoHighlighter$delegate = wh50Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xrj0 xrj0Var = new xrj0(this.$hasOnboarding, this.$sheetExpanded$delegate, this.$showCommunityVideoHighlighter$delegate, this.this$0, spjVar);
        xrj0Var.L$0 = obj;
        return xrj0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xrj0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$hasOnboarding && this.$sheetExpanded$delegate.getValue().booleanValue()) {
                this.$showCommunityVideoHighlighter$delegate.setValue(Boolean.TRUE);
                myc0.h(yvjVar, null, null, new a(this.$showCommunityVideoHighlighter$delegate, null), 3);
                izg0 M = nr2.M(new ymi(4, this.$showCommunityVideoHighlighter$delegate));
                b bVar = new b(this.this$0);
                this.L$0 = null;
                this.label = 1;
                Object collect = M.collect(new SimplePostingCreateBottomSheet$1$1$1$1$invokeSuspend$$inlined$filter$1$2(bVar), this);
                if (collect != coroutineSingletons) {
                    collect = s3q0.a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
