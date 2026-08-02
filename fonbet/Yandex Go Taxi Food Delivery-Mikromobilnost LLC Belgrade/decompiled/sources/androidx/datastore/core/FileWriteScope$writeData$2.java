package androidx.datastore.core;

import defpackage.btq0;
import defpackage.kh91;
import defpackage.mvg;
import defpackage.mx11;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tls;
import defpackage.z2r;
import defpackage.zy11;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", l = {206}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class FileWriteScope$writeData$2 extends SuspendLambda implements tls {
    final /* synthetic */ Object $value;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ z2r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$2(z2r z2rVar, Object obj, Continuation continuation) {
        super(1, continuation);
        this.this$0 = z2rVar;
        this.$value = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FileWriteScope$writeData$2(this.this$0, this.$value, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FileWriteScope$writeData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        Throwable th;
        FileOutputStream fileOutputStream;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.a);
                z2r z2rVar = this.this$0;
                Object obj2 = this.$value;
                try {
                    btq0 btq0Var = z2rVar.b;
                    mx11 mx11Var = new mx11(fileOutputStream2);
                    this.L$0 = fileOutputStream2;
                    this.L$1 = fileOutputStream2;
                    this.label = 1;
                    if (btq0Var.c(obj2, mx11Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fileOutputStream = fileOutputStream2;
                    closeable = fileOutputStream;
                } catch (Throwable th2) {
                    closeable = fileOutputStream2;
                    th = th2;
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw kh91.d(this.this$0.a.getParent(), (FileNotFoundException) e);
                }
                throw e;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream = (FileOutputStream) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ooc.g(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        ooc.g(closeable, null);
        return zy11.a;
    }
}
