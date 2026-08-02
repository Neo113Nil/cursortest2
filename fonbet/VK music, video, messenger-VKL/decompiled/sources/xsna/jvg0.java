package xsna;

import androidx.room.RoomDatabase;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RxRoom.kt */
@b6l(c = "androidx.room.rxjava3.RxRoom$createCompletable$1", f = "RxRoom.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class jvg0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<hyg0, s3q0> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvg0(RoomDatabase roomDatabase, spj spjVar, izs izsVar, boolean z, boolean z2) {
        super(2, spjVar);
        this.$db = roomDatabase;
        this.$isReadOnly = z;
        this.$inTransaction = z2;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jvg0(this.$db, spjVar, this.$block, this.$isReadOnly, this.$inTransaction);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jvg0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            RoomDatabase roomDatabase = this.$db;
            boolean z = this.$isReadOnly;
            boolean z2 = this.$inTransaction;
            izs<hyg0, s3q0> izsVar = this.$block;
            this.label = 1;
            if (u370.g(roomDatabase, this, izsVar, z, z2) == coroutineSingletons) {
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
