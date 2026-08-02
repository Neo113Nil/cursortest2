package xsna;

import com.vk.push.core.filedatastore.FileDataSource;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnalyticsSendingTimestampDataSource.kt */
/* loaded from: classes5.dex */
public final class iy1 {
    public final FileDataSource a;

    public iy1(FileDataSource fileDataSource) {
        this.a = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        gy1 gy1Var;
        int i;
        if (continuationImpl instanceof gy1) {
            gy1Var = (gy1) continuationImpl;
            int i2 = gy1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gy1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = gy1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gy1Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                gy1Var.label = 1;
                Object m99getDataIoAF18A = this.a.m99getDataIoAF18A(gy1Var);
                return m99getDataIoAF18A == coroutineSingletons ? coroutineSingletons : m99getDataIoAF18A;
            }
        }
        gy1Var = new gy1(this, continuationImpl);
        Object obj2 = gy1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gy1Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        hy1 hy1Var;
        int i;
        if (continuationImpl instanceof hy1) {
            hy1Var = (hy1) continuationImpl;
            int i2 = hy1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hy1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = hy1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hy1Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                hy1Var.label = 1;
                Object m100setDatagIAlus = this.a.m100setDatagIAlus(str, hy1Var);
                return m100setDatagIAlus == coroutineSingletons ? coroutineSingletons : m100setDatagIAlus;
            }
        }
        hy1Var = new hy1(this, continuationImpl);
        Object obj2 = hy1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hy1Var.label;
        if (i == 0) {
        }
    }
}
