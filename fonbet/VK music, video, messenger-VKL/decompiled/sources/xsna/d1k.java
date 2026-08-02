package xsna;

import android.graphics.Bitmap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoverChooseInteractor.kt */
/* loaded from: classes7.dex */
public final class d1k implements a1k {
    public final n0k a;

    public d1k(n0k n0kVar) {
        this.a = n0kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.a1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        b1k b1kVar;
        int i;
        if (continuationImpl instanceof b1k) {
            b1kVar = (b1k) continuationImpl;
            int i2 = b1kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1kVar.label = i2 - Integer.MIN_VALUE;
                Object obj = b1kVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b1kVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                b1kVar.L$0 = null;
                b1kVar.label = 1;
                Object a = this.a.a(str, b1kVar);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        b1kVar = new b1k(this, continuationImpl);
        Object obj2 = b1kVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b1kVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.a1k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bitmap bitmap, ContinuationImpl continuationImpl) {
        c1k c1kVar;
        int i;
        if (continuationImpl instanceof c1k) {
            c1kVar = (c1k) continuationImpl;
            int i2 = c1kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1kVar.label = i2 - Integer.MIN_VALUE;
                Object obj = c1kVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c1kVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                c1kVar.L$0 = null;
                c1kVar.label = 1;
                Object b = this.a.b(bitmap, c1kVar);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        c1kVar = new c1k(this, continuationImpl);
        Object obj2 = c1kVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c1kVar.label;
        if (i == 0) {
        }
    }
}
