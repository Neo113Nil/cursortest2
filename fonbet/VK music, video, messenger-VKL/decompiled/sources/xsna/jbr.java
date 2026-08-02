package xsna;

import java.io.Closeable;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FileStorage.kt */
/* loaded from: classes12.dex */
public final class jbr<T> extends bar<T> implements y2y0<T> {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.y2y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, ContinuationImpl continuationImpl) {
        ibr ibrVar;
        int i;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (continuationImpl instanceof ibr) {
            ibrVar = (ibr) continuationImpl;
            int i2 = ibrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibrVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ibrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ibrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    if (this.c.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.a);
                    try {
                        qmi0<T> qmi0Var = this.b;
                        t2q0 t2q0Var = new t2q0(fileOutputStream2);
                        ibrVar.L$0 = fileOutputStream2;
                        ibrVar.L$1 = fileOutputStream2;
                        ibrVar.label = 1;
                        if (qmi0Var.writeTo(obj, t2q0Var, ibrVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        closeable = fileOutputStream2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) ibrVar.L$1;
                    closeable = (Closeable) ibrVar.L$0;
                    try {
                        kotlin.a.a(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            ro.e(closeable, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                s3q0 s3q0Var = s3q0.a;
                ro.e(closeable, null);
                return s3q0.a;
            }
        }
        ibrVar = new ibr(this, continuationImpl);
        Object obj22 = ibrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ibrVar.label;
        if (i != 0) {
        }
        fileOutputStream.getFD().sync();
        s3q0 s3q0Var2 = s3q0.a;
        ro.e(closeable, null);
        return s3q0.a;
    }
}
