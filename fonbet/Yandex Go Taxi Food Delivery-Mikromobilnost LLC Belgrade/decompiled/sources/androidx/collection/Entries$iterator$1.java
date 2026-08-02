package androidx.collection;

import defpackage.bmm0;
import defpackage.mvg;
import defpackage.nh00;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "Lsrq0;", "", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.jvm.kt", l = {876}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class Entries$iterator$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Entries$iterator$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.this$0, continuation);
        entries$iterator$1.L$0 = obj;
        return entries$iterator$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Entries$iterator$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0099 -> B:6:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0052 -> B:7:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ac -> B:17:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006d -> B:5:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srq0 srq0Var;
        a aVar;
        long[] jArr;
        int length;
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 8;
        if (i2 == 0) {
            kotlin.b.b(obj);
            srq0Var = (srq0) this.L$0;
            aVar = this.this$0;
            jArr = aVar.a.a;
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
        int i4 = this.I$3;
        int i5 = this.I$2;
        long j2 = this.J$0;
        i = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$2;
        a aVar2 = (a) this.L$1;
        srq0 srq0Var2 = (srq0) this.L$0;
        kotlin.b.b(obj);
        int i7 = i3;
        j2 >>= i7;
        i4++;
        i3 = i7;
        if (i4 < i5) {
            int i8 = i3;
            if (i5 == i8) {
                length = i6;
                jArr = jArr2;
                aVar = aVar2;
                srq0Var = srq0Var2;
                if (i != length) {
                    i++;
                    i3 = i8;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        aVar2 = aVar;
                        i5 = 8 - ((~(i - length)) >>> 31);
                        srq0Var2 = srq0Var;
                        i4 = 0;
                        jArr2 = jArr;
                        i6 = length;
                        j2 = j;
                        if (i4 < i5) {
                            if ((255 & j2) < 128) {
                                int i9 = (i << 3) + i4;
                                bmm0 bmm0Var = aVar2.a;
                                i7 = i3;
                                nh00 nh00Var = new nh00(bmm0Var.b[i9], bmm0Var.c[i9]);
                                this.L$0 = srq0Var2;
                                this.L$1 = aVar2;
                                this.L$2 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i;
                                this.J$0 = j2;
                                this.I$2 = i5;
                                this.I$3 = i4;
                                this.label = 1;
                                if (srq0Var2.a(nh00Var, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                j2 >>= i7;
                                i4++;
                                i3 = i7;
                                if (i4 < i5) {
                                }
                            }
                            int i72 = i3;
                            j2 >>= i72;
                            i4++;
                            i3 = i72;
                            if (i4 < i5) {
                            }
                        }
                    } else {
                        i8 = i3;
                        if (i != length) {
                        }
                    }
                }
            }
            return zy11.a;
        }
    }
}
