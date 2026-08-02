package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageTemplatesDeleteSuspendApiCmd.kt */
/* loaded from: classes3.dex */
public final class ib20 {
    public final int a;
    public final Peer b;

    /* compiled from: MessageTemplatesDeleteSuspendApiCmd.kt */
    @b6l(c = "com.vk.messagetemplates.impl.data.MessageTemplatesDeleteSuspendApiCmd", f = "MessageTemplatesDeleteSuspendApiCmd.kt", l = {19}, m = "onExecute")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ib20.this.a(this);
        }
    }

    public ib20(int i, Peer peer) {
        this.a = i;
        this.b = peer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj<? super Boolean> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    UserId userId = new UserId(this.b.d);
                    tfx tfxVar = new tfx("messages.deleteTemplate", new to(19), new t11(21));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    tfx.l(tfxVar, "template_id", this.a, 0, 0, 8);
                    iz2 A = yfb.A(tfxVar);
                    A.n = false;
                    aVar.label = 1;
                    obj = evj.p(A, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((BaseOkResponseDto) obj2) == BaseOkResponseDto.OK);
    }
}
