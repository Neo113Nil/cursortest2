package yads;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class hw0 extends SuspendLambda implements wzs {
    public final /* synthetic */ iw0 b;
    public final /* synthetic */ tw0 c;
    public final /* synthetic */ byte[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw0(iw0 iw0Var, tw0 tw0Var, byte[] bArr, spj spjVar) {
        super(2, spjVar);
        this.b = iw0Var;
        this.c = tw0Var;
        this.d = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new hw0(this.b, this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((hw0) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        try {
            File b = this.b.b(this.c);
            File parentFile = b.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            try {
                fileOutputStream.write(this.d);
                fileOutputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                return b;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
