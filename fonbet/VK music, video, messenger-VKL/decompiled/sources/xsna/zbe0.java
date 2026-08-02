package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.media.MediaUtils;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishFileStorageImpl.kt */
/* loaded from: classes7.dex */
public final class zbe0 implements vbe0 {
    public final Context a;

    public zbe0(Context context) {
        this.a = context;
    }

    @Override // xsna.vbe0
    public final Object a(Uri uri, oce0 oce0Var) {
        return myc0.k(hqu0.b(), new wbe0(this, uri, null), oce0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vbe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, MediaUtils.d dVar, ContinuationImpl continuationImpl) {
        xbe0 xbe0Var;
        int i;
        if (continuationImpl instanceof xbe0) {
            xbe0Var = (xbe0) continuationImpl;
            int i2 = xbe0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xbe0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xbe0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xbe0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ybe0 ybe0Var = new ybe0(dVar, uri, this, null);
                    xbe0Var.L$0 = null;
                    xbe0Var.L$1 = null;
                    xbe0Var.label = 1;
                    obj = myc0.k(b, ybe0Var, xbe0Var);
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
        xbe0Var = new xbe0(this, continuationImpl);
        Object obj2 = xbe0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xbe0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
