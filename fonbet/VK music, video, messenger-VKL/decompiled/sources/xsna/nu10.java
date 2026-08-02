package xsna;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaPickerRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class nu10 {
    public final zz10 a;
    public final Context b;

    public nu10(zz10 zz10Var, Context context) {
        this.a = zz10Var;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, int i3, int i4, ContinuationImpl continuationImpl) {
        ku10 ku10Var;
        int i5;
        if (continuationImpl instanceof ku10) {
            ku10Var = (ku10) continuationImpl;
            int i6 = ku10Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ku10Var.label = i6 - Integer.MIN_VALUE;
                ku10 ku10Var2 = ku10Var;
                Object obj = ku10Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = ku10Var2.label;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                ku10Var2.I$0 = i;
                ku10Var2.I$1 = i2;
                ku10Var2.I$2 = i3;
                ku10Var2.I$3 = i4;
                ku10Var2.label = 1;
                Object a = this.a.a(i, i2, i3, i4, ku10Var2);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        ku10Var = new ku10(this, continuationImpl);
        ku10 ku10Var22 = ku10Var;
        Object obj2 = ku10Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i5 = ku10Var22.label;
        if (i5 == 0) {
        }
    }
}
