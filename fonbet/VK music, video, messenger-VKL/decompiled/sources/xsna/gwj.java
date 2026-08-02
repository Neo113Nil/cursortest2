package xsna;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.fwj;

/* compiled from: CoroutinesRoom.android.kt */
@b6l(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {64, MBSupportMuteAdType.REWARD_VIDEO}, m = "execute")
/* loaded from: classes12.dex */
public final class gwj<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fwj.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwj(fwj.a aVar, spj<? super gwj> spjVar) {
        super(spjVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
