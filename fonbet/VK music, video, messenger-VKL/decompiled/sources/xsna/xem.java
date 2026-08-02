package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DialogHeaderInfoComponent.kt */
@b6l(c = "com.vk.im.ui.components.dialog_header.info.DialogHeaderInfoComponent$subscribeForMembersOnlineChange$1", f = "DialogHeaderInfoComponent.kt", l = {502}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class xem extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $dialogId;
    int label;
    final /* synthetic */ afm this$0;

    /* compiled from: DialogHeaderInfoComponent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ afm b;

        public a(afm afmVar) {
            this.b = afmVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            int intValue = ((Number) obj).intValue();
            afm afmVar = this.b;
            afmVar.D.f = intValue;
            afmVar.b1();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xem(afm afmVar, long j, spj<? super xem> spjVar) {
        super(2, spjVar);
        this.this$0 = afmVar;
        this.$dialogId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xem(this.this$0, this.$dialogId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xem) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            com.vk.im.chat.onlines.api.a aVar = this.this$0.o;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            ksr<Integer> a2 = aVar.a(Peer.a.b(this.$dialogId), this.this$0.i.q());
            a aVar2 = new a(this.this$0);
            this.label = 1;
            if (a2.collect(aVar2, this) == coroutineSingletons) {
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
