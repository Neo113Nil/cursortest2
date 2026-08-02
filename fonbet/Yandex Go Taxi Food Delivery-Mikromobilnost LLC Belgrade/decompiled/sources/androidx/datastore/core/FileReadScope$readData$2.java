package androidx.datastore.core;

import defpackage.btq0;
import defpackage.f1r;
import defpackage.kh91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tls;
import defpackage.zy11;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", l = {162, MSException.ERROR_BUSY}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class FileReadScope$readData$2 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ f1r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$2(f1r f1rVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = f1rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FileReadScope$readData$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FileReadScope$readData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ooc.g(r1, th2);
                        throw th3;
                    }
                }
            } catch (FileNotFoundException unused) {
                if (!this.this$0.a.exists()) {
                    return this.this$0.b.a();
                }
                FileInputStream fileInputStream = new FileInputStream(this.this$0.a);
                try {
                    btq0 btq0Var = this.this$0.b;
                    this.L$0 = fileInputStream;
                    this.label = 2;
                    Object b = btq0Var.b(fileInputStream, this);
                    if (b != coroutineSingletons) {
                        closeable = fileInputStream;
                        obj = b;
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    closeable = fileInputStream;
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        ooc.g(closeable, th);
                        throw th5;
                    }
                }
            }
            if (r1 == 0) {
                kotlin.b.b(obj);
                FileInputStream fileInputStream2 = new FileInputStream(this.this$0.a);
                btq0 btq0Var2 = this.this$0.b;
                this.L$0 = fileInputStream2;
                this.label = 1;
                obj = btq0Var2.b(fileInputStream2, this);
                r1 = fileInputStream2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeable = (Closeable) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        ooc.g(closeable, null);
                        return obj;
                    } catch (Throwable th6) {
                        th = th6;
                        throw th;
                    }
                }
                Closeable closeable2 = (Closeable) this.L$0;
                kotlin.b.b(obj);
                r1 = closeable2;
            }
            ooc.g(r1, null);
            return obj;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw kh91.d(this.this$0.a.getParent(), (FileNotFoundException) e);
            }
            throw e;
        }
    }
}
