package androidx.collection;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.tz40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.jvm.kt", l = {1157}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tz40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableValues$iterator$1$iterator$1(tz40 tz40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(this.this$0, continuation);
        mutableValues$iterator$1$iterator$1.L$0 = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableValues$iterator$1$iterator$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0088 -> B:5:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:15:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:6:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006a -> B:5:0x008b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srq0 srq0Var;
        long[] jArr;
        int length;
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            srq0Var = (srq0) this.L$0;
            jArr = this.this$0.a.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return zy11.a;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        int i5 = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$1;
        srq0 srq0Var2 = (srq0) this.L$0;
        kotlin.b.b(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                i = i5;
                length = i6;
                jArr = jArr2;
                srq0Var = srq0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        srq0Var2 = srq0Var;
                        i3 = 0;
                        i6 = length;
                        i5 = i;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                Integer num = new Integer((i5 << 3) + i3);
                                this.L$0 = srq0Var2;
                                this.L$1 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
                                if (srq0Var2.a(num, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return zy11.a;
        }
    }
}
