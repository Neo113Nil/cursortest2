package xsna;

import androidx.room.RoomDatabase;
import androidx.room.rxjava3.EmptyResultSetException;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RxRoom.kt */
@b6l(c = "androidx.room.rxjava3.RxRoom$createSingle$1", f = "RxRoom.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class lvg0 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<hyg0, Object> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvg0(RoomDatabase roomDatabase, spj spjVar, izs izsVar, boolean z, boolean z2) {
        super(2, spjVar);
        this.$db = roomDatabase;
        this.$isReadOnly = z;
        this.$inTransaction = z2;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lvg0(this.$db, spjVar, this.$block, this.$isReadOnly, this.$inTransaction);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((lvg0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            izs<hyg0, Object> izsVar = this.$block;
            this.label = 1;
            obj = u370.g(roomDatabase, this, izsVar, z, z2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (obj != null) {
            return obj;
        }
        throw new EmptyResultSetException("Query returned empty result set.");
    }
}
