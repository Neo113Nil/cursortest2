package xsna;

import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.newsfeed.entries.Post;
import java.util.Comparator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DraftsListInlineActor.kt */
@b6l(c = "com.vk.draftslist.impl.ui.store.DraftsListInlineActor$loadNextPage$1", f = "DraftsListInlineActor.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class xdo extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ydo this$0;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((Post) t2).r), Integer.valueOf(((Post) t).r));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdo(ydo ydoVar, spj<? super xdo> spjVar) {
        super(2, spjVar);
        this.this$0 = ydoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xdo(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xdo) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                beo a2 = this.this$0.c.a();
                int i2 = ((DraftsListState) this.this$0.b.getCurrentState()).e;
                this.label = 1;
                obj = a2.a(i2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        } catch (Exception unused) {
        }
        return s3q0.a;
    }
}
