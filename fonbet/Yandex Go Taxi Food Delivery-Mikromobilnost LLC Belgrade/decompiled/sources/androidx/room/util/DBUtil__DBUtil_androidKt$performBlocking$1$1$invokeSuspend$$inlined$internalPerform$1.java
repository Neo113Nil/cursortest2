package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.Transactor$SQLiteTransactionType;
import androidx.room.d;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a9i0;
import defpackage.mg01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.re01;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lmg01;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59, 60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lre01;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$block$inlined = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block$inlined, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((re01) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return this.$block$inlined.invoke(((a9i0) ((re01) this.L$0)).a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1(tls tlsVar, RoomDatabase roomDatabase, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.$inTransaction;
        boolean z2 = this.$isReadOnly;
        DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1(this.$block$inlined, this.$this_internalPerform, continuation, z, z2);
        dBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1) create((mg01) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r9 != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType;
        mg01 mg01Var;
        mg01 mg01Var2;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2;
        mg01 mg01Var3;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mg01 mg01Var4 = (mg01) this.L$0;
            if (!this.$inTransaction) {
                return this.$block$inlined.invoke(((a9i0) mg01Var4).a());
            }
            boolean z = this.$isReadOnly;
            transactor$SQLiteTransactionType = z ? Transactor$SQLiteTransactionType.DEFERRED : Transactor$SQLiteTransactionType.IMMEDIATE;
            if (!z) {
                this.L$0 = mg01Var4;
                this.L$1 = transactor$SQLiteTransactionType;
                this.label = 1;
                Boolean c = mg01Var4.c(this);
                if (c != coroutineSingletons) {
                    mg01Var2 = mg01Var4;
                    obj = c;
                    transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                }
                return coroutineSingletons;
            }
            mg01Var = mg01Var4;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block$inlined, null);
            this.L$0 = mg01Var;
            this.L$1 = null;
            this.label = 3;
            obj = mg01Var.b(transactor$SQLiteTransactionType, anonymousClass1, this);
        } else if (i == 1) {
            transactor$SQLiteTransactionType2 = (Transactor$SQLiteTransactionType) this.L$1;
            mg01Var2 = (mg01) this.L$0;
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.L$0;
                    b.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        d dVar = this.$this_internalPerform.f;
                        d dVar2 = dVar != null ? dVar : null;
                        dVar2.c.e(dVar2.f, dVar2.g);
                    }
                    return obj2;
                }
                mg01Var = (mg01) this.L$0;
                b.b(obj);
                if (this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                Boolean c2 = mg01Var.c(this);
                if (c2 != coroutineSingletons) {
                    obj2 = obj;
                    obj = c2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return coroutineSingletons;
            }
            transactor$SQLiteTransactionType2 = (Transactor$SQLiteTransactionType) this.L$1;
            mg01Var3 = (mg01) this.L$0;
            b.b(obj);
            transactor$SQLiteTransactionType = transactor$SQLiteTransactionType2;
            mg01Var = mg01Var3;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$block$inlined, null);
            this.L$0 = mg01Var;
            this.L$1 = null;
            this.label = 3;
            obj = mg01Var.b(transactor$SQLiteTransactionType, anonymousClass12, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            d dVar3 = this.$this_internalPerform.f;
            if (dVar3 == null) {
                dVar3 = null;
            }
            this.L$0 = mg01Var2;
            this.L$1 = transactor$SQLiteTransactionType2;
            this.label = 2;
            Object f = dVar3.c.f(this);
            if (f != coroutineSingletons) {
                f = zy11.a;
            }
            if (f != coroutineSingletons) {
                mg01Var3 = mg01Var2;
                transactor$SQLiteTransactionType = transactor$SQLiteTransactionType2;
                mg01Var = mg01Var3;
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(this.$block$inlined, null);
                this.L$0 = mg01Var;
                this.L$1 = null;
                this.label = 3;
                obj = mg01Var.b(transactor$SQLiteTransactionType, anonymousClass122, this);
            }
            return coroutineSingletons;
        }
        transactor$SQLiteTransactionType = transactor$SQLiteTransactionType2;
        mg01Var = mg01Var2;
        AnonymousClass1 anonymousClass1222 = new AnonymousClass1(this.$block$inlined, null);
        this.L$0 = mg01Var;
        this.L$1 = null;
        this.label = 3;
        obj = mg01Var.b(transactor$SQLiteTransactionType, anonymousClass1222, this);
    }
}
