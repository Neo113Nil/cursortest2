package androidx.collection;

import defpackage.hz40;
import defpackage.ky40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qx40;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "Lsrq0;", "", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.jvm.kt", l = {1000}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MutableEntries$iterator$1$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ qx40 this$0;
    final /* synthetic */ c this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableEntries$iterator$1$1(qx40 qx40Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qx40Var;
        this.this$1 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableEntries$iterator$1$1 mutableEntries$iterator$1$1 = new MutableEntries$iterator$1$1(this.this$0, this.this$1, continuation);
        mutableEntries$iterator$1$1.L$0 = obj;
        return mutableEntries$iterator$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableEntries$iterator$1$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a2 -> B:6:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:7:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00bb -> B:17:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0075 -> B:5:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srq0 srq0Var;
        qx40 qx40Var;
        c cVar;
        long[] jArr;
        int length;
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 8;
        int i4 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            srq0Var = (srq0) this.L$0;
            qx40Var = this.this$0;
            hz40 hz40Var = qx40Var.a;
            cVar = this.this$1;
            jArr = hz40Var.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                }
            }
            return zy11.a;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = this.I$3;
        int i6 = this.I$2;
        long j2 = this.J$0;
        int i7 = this.I$1;
        int i8 = this.I$0;
        long[] jArr2 = (long[]) this.L$3;
        qx40 qx40Var2 = (qx40) this.L$2;
        c cVar2 = (c) this.L$1;
        srq0 srq0Var2 = (srq0) this.L$0;
        kotlin.b.b(obj);
        int i9 = i3;
        int i10 = i4;
        j2 >>= i9;
        i5 += i10;
        i4 = i10;
        i3 = i9;
        if (i5 < i6) {
            int i11 = i3;
            int i12 = i4;
            if (i6 == i11) {
                int i13 = i8;
                i = i7;
                length = i13;
                jArr = jArr2;
                qx40Var = qx40Var2;
                cVar = cVar2;
                srq0Var = srq0Var2;
                if (i != length) {
                    i++;
                    i4 = i12;
                    i3 = i11;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        int i14 = 8 - ((~(i - length)) >>> 31);
                        int i15 = i;
                        i8 = length;
                        i7 = i15;
                        srq0Var2 = srq0Var;
                        i5 = 0;
                        qx40Var2 = qx40Var;
                        jArr2 = jArr;
                        i6 = i14;
                        cVar2 = cVar;
                        j2 = j;
                        if (i5 < i6) {
                            if ((255 & j2) < 128) {
                                int i16 = (i7 << 3) + i5;
                                cVar2.b = i16;
                                i9 = i3;
                                hz40 hz40Var2 = qx40Var2.a;
                                ky40 ky40Var = new ky40(i16, hz40Var2.b, hz40Var2.c);
                                this.L$0 = srq0Var2;
                                this.L$1 = cVar2;
                                this.L$2 = qx40Var2;
                                this.L$3 = jArr2;
                                this.I$0 = i8;
                                this.I$1 = i7;
                                this.J$0 = j2;
                                this.I$2 = i6;
                                this.I$3 = i5;
                                i10 = 1;
                                this.label = 1;
                                if (srq0Var2.a(ky40Var, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                j2 >>= i9;
                                i5 += i10;
                                i4 = i10;
                                i3 = i9;
                                if (i5 < i6) {
                                }
                            }
                            int i92 = i3;
                            int i102 = i4;
                            j2 >>= i92;
                            i5 += i102;
                            i4 = i102;
                            i3 = i92;
                            if (i5 < i6) {
                            }
                        }
                    } else {
                        i11 = i3;
                        i12 = i4;
                        if (i != length) {
                        }
                    }
                }
            }
            return zy11.a;
        }
    }
}
