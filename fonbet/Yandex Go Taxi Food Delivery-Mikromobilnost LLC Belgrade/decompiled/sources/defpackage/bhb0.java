package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class bhb0 {
    public s3v a;
    public w8v b;
    public i5f0 c;
    public File d;
    public ExecutorService e;
    public o89 f;

    public final void a(CameraType cameraType) {
        Context context;
        s3v s3vVar;
        o89 o89Var;
        s3v s3vVar2 = this.a;
        if (s3vVar2 == null || (context = ((kib0) s3vVar2).a.getContext()) == null || (s3vVar = this.a) == null || (o89Var = this.f) == null) {
            return;
        }
        o89Var.c(new ud30(12, s3vVar, cameraType, this), context.getMainExecutor());
    }
}
