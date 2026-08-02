package xsna;

import android.graphics.Bitmap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoverChooseFileStorageImpl.kt */
/* loaded from: classes7.dex */
public final class s0k implements n0k {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.n0k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        o0k o0kVar;
        int i;
        if (continuationImpl instanceof o0k) {
            o0kVar = (o0k) continuationImpl;
            int i2 = o0kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0kVar.label = i2 - Integer.MIN_VALUE;
                Object obj = o0kVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o0kVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    p0k p0kVar = new p0k(str, null);
                    o0kVar.L$0 = null;
                    o0kVar.label = 1;
                    obj = myc0.k(b, p0kVar, o0kVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        o0kVar = new o0k(this, continuationImpl);
        Object obj2 = o0kVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o0kVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.n0k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bitmap bitmap, ContinuationImpl continuationImpl) {
        q0k q0kVar;
        int i;
        if (continuationImpl instanceof q0k) {
            q0kVar = (q0k) continuationImpl;
            int i2 = q0kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0kVar.label = i2 - Integer.MIN_VALUE;
                Object obj = q0kVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = q0kVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    r0k r0kVar = new r0k(bitmap, null);
                    q0kVar.L$0 = null;
                    q0kVar.label = 1;
                    obj = myc0.k(b, r0kVar, q0kVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        q0kVar = new q0k(this, continuationImpl);
        Object obj2 = q0kVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = q0kVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
