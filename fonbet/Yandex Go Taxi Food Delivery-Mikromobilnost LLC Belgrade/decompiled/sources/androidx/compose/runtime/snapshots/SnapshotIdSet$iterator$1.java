package androidx.compose.runtime.snapshots;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsrq0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, continuation);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r13.a(r9, r20) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r15.a(r9, r20) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00c4 -> B:8:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e1 -> B:7:0x00e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a9 -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0073 -> B:33:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srq0 srq0Var;
        srq0 srq0Var2;
        int length;
        long[] jArr;
        int i;
        long j;
        srq0 srq0Var3;
        int i2;
        srq0 srq0Var4;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            b.b(obj);
            srq0Var = (srq0) this.L$0;
            long[] jArr2 = this.this$0.w;
            if (jArr2 != null) {
                srq0Var2 = srq0Var;
                length = jArr2.length;
                jArr = jArr2;
                i = 0;
                if (i < length) {
                }
            }
            j = 1;
            if (this.this$0.b != 0) {
            }
            if (this.this$0.a != 0) {
            }
            return zy11.a;
        }
        if (i4 == 1) {
            length = this.I$1;
            i = this.I$0;
            jArr = (long[]) this.L$1;
            srq0Var2 = (srq0) this.L$0;
            b.b(obj);
            i++;
            if (i < length) {
                srq0Var = srq0Var2;
                j = 1;
                if (this.this$0.b != 0) {
                    srq0Var3 = srq0Var;
                    i2 = 0;
                    if (i2 < 64) {
                    }
                }
                if (this.this$0.a != 0) {
                }
                return zy11.a;
            }
            Long l = new Long(jArr[i]);
            this.L$0 = srq0Var2;
            this.L$1 = jArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = this.I$0;
                srq0Var4 = (srq0) this.L$0;
                b.b(obj);
                j = 1;
                i3 = i5;
                i3++;
                if (i3 < 64) {
                    a aVar = this.this$0;
                    if ((aVar.a & (j << i3)) != 0) {
                        Long l2 = new Long(aVar.c + i3 + 64);
                        this.L$0 = srq0Var4;
                        this.L$1 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        if (srq0Var4.a(l2, this) != coroutineSingletons) {
                            i5 = i3;
                            i3 = i5;
                        }
                        return coroutineSingletons;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return zy11.a;
            }
            i2 = this.I$0;
            srq0Var3 = (srq0) this.L$0;
            b.b(obj);
            j = 1;
            i2++;
            if (i2 < 64) {
                a aVar2 = this.this$0;
                if ((aVar2.b & (j << i2)) != 0) {
                    Long l3 = new Long(aVar2.c + i2);
                    this.L$0 = srq0Var3;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.label = 2;
                }
                i2++;
                if (i2 < 64) {
                    srq0Var = srq0Var3;
                    if (this.this$0.a != 0) {
                        srq0Var4 = srq0Var;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return zy11.a;
                }
            }
        }
    }
}
